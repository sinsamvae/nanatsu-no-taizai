package net.mcreator.craftnotaizai.procedures;

import org.joml.Matrix4f;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class RenderShapeProcedure {
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
		if (RenderShapeProcedure.bufferBuilder == null || !RenderShapeProcedure.bufferBuilder.building()) {
			if (update)
				clear();
			if (RenderShapeProcedure.vertexBuffer == null) {
				if (format == DefaultVertexFormat.POSITION_COLOR) {
					RenderShapeProcedure.mode = mode;
					RenderShapeProcedure.format = format;
					RenderShapeProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					RenderShapeProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_COLOR);
					return true;
				} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
					RenderShapeProcedure.mode = mode;
					RenderShapeProcedure.format = format;
					RenderShapeProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					RenderShapeProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_TEX_COLOR);
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
		RenderShapeProcedure.worldCoordinate = worldCoordinate;
	}

	private static boolean target(int targetStage) {
		if (targetStage == currentStage) {
			RenderShapeProcedure.targetStage = targetStage;
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
			execute(event, level, entity);
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.defaultBlendFunc();
			RenderSystem.disableBlend();
			RenderSystem.enableDepthTest();
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		double j = 0;
		double k = 0;
		double l = 0;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).MagicDetection == true) {
			if (target(3)) {
				if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR, false)) {
					for (int index0 = 0; index0 < 90; index0++) {
						for (int index1 = 0; index1 < 45; index1++) {
							k = 255 - (j / 180) * 95;
							l = 255 - ((j + 4) / 180) * 95;
							add((Math.sin(Math.toRadians(i)) * Math.sin(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(i)) * Math.sin(Math.toRadians(j)) * 0.5),
									255 << 24 | (int) k << 16 | (int) k << 8 | (int) k);
							add((Math.sin(Math.toRadians(i)) * Math.sin(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(i)) * Math.sin(Math.toRadians(j + 4)) * 0.5),
									255 << 24 | (int) l << 16 | (int) l << 8 | (int) l);
							add((Math.sin(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j + 4)) * 0.5),
									255 << 24 | (int) l << 16 | (int) l << 8 | (int) l);
							add((Math.sin(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j)) * 0.5),
									255 << 24 | (int) k << 16 | (int) k << 8 | (int) k);
							j = j + 4;
						}
						j = 0;
						i = i + 4;
					}
					i = 0;
					end();
				}
				if (target(3)) {
					RenderSystem.disableDepthTest();
					if (world instanceof ClientLevel) {
						for (Entity entityiterator : ((ClientLevel) world).entitiesForRendering()) {
							if (!(entity == entityiterator || entityiterator instanceof ItemEntity || entityiterator instanceof Player || entityiterator instanceof ExperienceOrb
									|| (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
									|| (entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) || new Object() {
										public boolean checkGamemode(Entity _ent) {
											if (_ent instanceof ServerPlayer _serverPlayer) {
												return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
											} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
												return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
														&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
											}
											return false;
										}
									}.checkGamemode(entityiterator) || new Object() {
										public boolean checkGamemode(Entity _ent) {
											if (_ent instanceof ServerPlayer _serverPlayer) {
												return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
											} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
												return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
														&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
											}
											return false;
										}
									}.checkGamemode(entityiterator))) {
								renderShape(shape(), (entityiterator.getX()), (entityiterator.getY() + 1), (entityiterator.getZ()), Minecraft.getInstance().gameRenderer.getMainCamera().getYRot(),
										Minecraft.getInstance().gameRenderer.getMainCamera().getXRot(), 0, (float) 0.2, (float) 0.2, (float) 0.2, 255 << 24 | 255 << 16 | 0 << 8 | 0);
							}
						}
					}
					release();
				}
				release();
			}
			if (target(3)) {
				if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR, false)) {
					for (int index2 = 0; index2 < 90; index2++) {
						for (int index3 = 0; index3 < 45; index3++) {
							k = 255 - (j / 180) * 95;
							l = 255 - ((j + 4) / 180) * 95;
							add((Math.sin(Math.toRadians(i)) * Math.sin(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(i)) * Math.sin(Math.toRadians(j)) * 0.5),
									255 << 24 | (int) k << 16 | (int) k << 8 | (int) k);
							add((Math.sin(Math.toRadians(i)) * Math.sin(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(i)) * Math.sin(Math.toRadians(j + 4)) * 0.5),
									255 << 24 | (int) l << 16 | (int) l << 8 | (int) l);
							add((Math.sin(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(j + 4)) * 0.5), (Math.cos(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j + 4)) * 0.5),
									255 << 24 | (int) l << 16 | (int) l << 8 | (int) l);
							add((Math.sin(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(j)) * 0.5), (Math.cos(Math.toRadians(i + 4)) * Math.sin(Math.toRadians(j)) * 0.5),
									255 << 24 | (int) k << 16 | (int) k << 8 | (int) k);
							j = j + 4;
						}
						j = 0;
						i = i + 4;
					}
					i = 0;
					end();
				}
				if (target(3)) {
					RenderSystem.disableDepthTest();
					if (world instanceof ClientLevel) {
						for (Entity entityiterator : ((ClientLevel) world).entitiesForRendering()) {
							if (!(entity == entityiterator || entityiterator instanceof LivingEntity || entityiterator instanceof ItemEntity || entityiterator instanceof ExperienceOrb
									|| (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
									|| (entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) || new Object() {
										public boolean checkGamemode(Entity _ent) {
											if (_ent instanceof ServerPlayer _serverPlayer) {
												return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
											} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
												return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
														&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
											}
											return false;
										}
									}.checkGamemode(entityiterator) || new Object() {
										public boolean checkGamemode(Entity _ent) {
											if (_ent instanceof ServerPlayer _serverPlayer) {
												return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
											} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
												return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
														&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
											}
											return false;
										}
									}.checkGamemode(entityiterator))) {
								renderShape(shape(), (entityiterator.getX()), (entityiterator.getY() + 1), (entityiterator.getZ()), Minecraft.getInstance().gameRenderer.getMainCamera().getYRot(),
										Minecraft.getInstance().gameRenderer.getMainCamera().getXRot(), 0, (float) 0.2, (float) 0.2, (float) 0.2, 255 << 24 | 0 << 16 | 255 << 8 | 255);
							}
						}
					}
					release();
				}
				release();
			}
		}
	}
}
