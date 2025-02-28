package net.mcreator.craftnotaizai.procedures;

import org.joml.Matrix4f;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class IstarRenderSkyBoxProcedure {
	private static BufferBuilder bufferBuilder = null;
	private static VertexBuffer vertexBuffer = null;
	private static VertexFormat.Mode mode = null;
	private static VertexFormat format = null;
	private static PoseStack poseStack = null;
	private static Matrix4f projectionMatrix = null;
	private static boolean worldCoordinate = true;
	private static Vec3 offset = Vec3.ZERO;
	private static int currentStage = 0;
	private static int targetStage = 0; // NONE: 0, SKY: 1, WORLD: 2

	private static void add(double x, double y, double z, int color) {
		add(x, y, z, 0.0F, 0.0F, color);
	}

	private static void add(double x, double y, double z, float u, float v, int color) {
		if (bufferBuilder == null || !bufferBuilder.building())
			return;
		if (format == DefaultVertexFormat.POSITION_COLOR) {
			bufferBuilder.vertex(x, y, z).color(color).endVertex();
		} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
			bufferBuilder.vertex(x, y, z).uv(u, v).color(color).endVertex();
		}
	}

	private static boolean begin(VertexFormat.Mode mode, VertexFormat format, boolean update) {
		if (IstarRenderSkyBoxProcedure.bufferBuilder == null || !IstarRenderSkyBoxProcedure.bufferBuilder.building()) {
			if (update)
				clear();
			if (IstarRenderSkyBoxProcedure.vertexBuffer == null) {
				if (format == DefaultVertexFormat.POSITION_COLOR) {
					IstarRenderSkyBoxProcedure.mode = mode;
					IstarRenderSkyBoxProcedure.format = format;
					IstarRenderSkyBoxProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					IstarRenderSkyBoxProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_COLOR);
					return true;
				} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
					IstarRenderSkyBoxProcedure.mode = mode;
					IstarRenderSkyBoxProcedure.format = format;
					IstarRenderSkyBoxProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					IstarRenderSkyBoxProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_TEX_COLOR);
					return true;
				}
			}
		}
		return false;
	}

	private static void clear() {
		if (vertexBuffer != null) {
			vertexBuffer.close();
			vertexBuffer = null;
		}
	}

	private static void end() {
		if (bufferBuilder == null || !bufferBuilder.building())
			return;
		if (vertexBuffer != null)
			vertexBuffer.close();
		vertexBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		vertexBuffer.bind();
		vertexBuffer.upload(bufferBuilder.end());
		VertexBuffer.unbind();
	}

	private static void offset(double x, double y, double z) {
		offset = new Vec3(x, y, z);
	}

	private static void release() {
		targetStage = 0;
	}

	private static VertexBuffer shape() {
		return vertexBuffer;
	}

	private static void system(boolean worldCoordinate) {
		IstarRenderSkyBoxProcedure.worldCoordinate = worldCoordinate;
	}

	private static boolean target(int targetStage) {
		if (targetStage == currentStage) {
			IstarRenderSkyBoxProcedure.targetStage = targetStage;
			return true;
		}
		return false;
	}

	private static void renderShape(VertexBuffer vertexBuffer, double x, double y, double z, float yaw, float pitch, float roll, float xScale, float yScale, float zScale, int color) {
		if (currentStage == 0 || currentStage != targetStage)
			return;
		if (poseStack == null || projectionMatrix == null)
			return;
		if (vertexBuffer == null)
			return;
		float i, j, k;
		if (worldCoordinate) {
			Vec3 pos = Minecraft.getInstance().gameRenderer.getMainCamera().getPosition();
			i = (float) (x - pos.x());
			j = (float) (y - pos.y());
			k = (float) (z - pos.z());
		} else {
			i = (float) x;
			j = (float) y;
			k = (float) z;
		}
		poseStack.pushPose();
		poseStack.translate(i, j, k);
		poseStack.mulPose(com.mojang.math.Axis.YN.rotationDegrees(yaw));
		poseStack.mulPose(com.mojang.math.Axis.XP.rotationDegrees(pitch));
		poseStack.mulPose(com.mojang.math.Axis.ZN.rotationDegrees(roll));
		poseStack.scale(xScale, yScale, zScale);
		poseStack.translate(offset.x(), offset.y(), offset.z());
		RenderSystem.setShaderColor((color >> 16 & 255) / 255.0F, (color >> 8 & 255) / 255.0F, (color & 255) / 255.0F, (color >>> 24) / 255.0F);
		vertexBuffer.bind();
		vertexBuffer.drawWithShader(poseStack.last().pose(), projectionMatrix, vertexBuffer.getFormat().hasUV(0) ? GameRenderer.getPositionTexColorShader() : GameRenderer.getPositionColorShader());
		VertexBuffer.unbind();
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
		poseStack.popPose();
	}

	@SubscribeEvent
	public static void renderLevel(RenderLevelStageEvent event) {
		if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY) {
			currentStage = 1;
			RenderSystem.depthMask(false);
			renderShapes(event);
			RenderSystem.enableCull();
			RenderSystem.depthMask(true);
			currentStage = 0;
		} else if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_PARTICLES) {
			currentStage = 2;
			RenderSystem.depthMask(true);
			renderShapes(event);
			RenderSystem.enableCull();
			RenderSystem.depthMask(true);
			currentStage = 0;
		}
	}

	private static void renderShapes(RenderLevelStageEvent event) {
		Minecraft minecraft = Minecraft.getInstance();
		ClientLevel level = minecraft.level;
		Entity entity = minecraft.gameRenderer.getMainCamera().getEntity();
		if (level != null && entity != null) {
			poseStack = event.getPoseStack();
			projectionMatrix = event.getProjectionMatrix();
			Vec3 pos = entity.getPosition(event.getPartialTick());
			RenderSystem.enableBlend();
			RenderSystem.defaultBlendFunc();
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			execute(event, entity);
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.defaultBlendFunc();
			RenderSystem.disableBlend();
			RenderSystem.enableDepthTest();
		}
	}

	public static boolean execute(Entity entity) {
		return execute(null, entity);
	}

	private static boolean execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return false;
		double size = 0;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:istar"))) {
			if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR, false)) {
				add((-0.5), (-0.5), (-0.5), 0, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), 0.5, 0, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), 0.5, (float) (1.0 / 3.0), (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), (-0.5), (float) (1.0 / 3.0), 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, 0.5, (float) (1.0 / 3.0), 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, (-0.5), (float) (1.0 / 3.0), (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, (-0.5), (float) (2.0 / 3.0), (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, 0.5, (float) (2.0 / 3.0), 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, 0.5, (float) (2.0 / 3.0), 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), 0.5, (float) (2.0 / 3.0), (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), 0.5, 1, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, 0.5, 1, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, 0.5, 0, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), 0.5, 0, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), (-0.5), (float) (1.0 / 3.0), 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, (-0.5), (float) (1.0 / 3.0), (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), 0.5, (-0.5), (float) (1.0 / 3.0), (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add((-0.5), (-0.5), (-0.5), (float) (1.0 / 3.0), 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), (-0.5), (float) (2.0 / 3.0), 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, (-0.5), (float) (2.0 / 3.0), (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, (-0.5), (float) (2.0 / 3.0), (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), (-0.5), (float) (2.0 / 3.0), 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, (-0.5), 0.5, 1, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				add(0.5, 0.5, 0.5, 1, (float) 0.5, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				end();
			}
			if (target(1)) {
				system(false);
				size = Minecraft.getInstance().gameRenderer.getRenderDistance() * 2;
				RenderSystem.setShaderTexture(0, new ResourceLocation(("craft_no_taizai" + ":textures/" + "istarsky_v2" + ".png")));
				renderShape(shape(), 0, 0, 0, 0, 0, 0, (float) size, (float) size, (float) size, 255 << 24 | 255 << 16 | 255 << 8 | 255);
				release();
			}
		}
		return false;
	}
}
