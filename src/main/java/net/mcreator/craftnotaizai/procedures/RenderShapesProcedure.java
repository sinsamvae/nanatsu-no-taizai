package net.mcreator.craftnotaizai.procedures;

import org.joml.Matrix4f;

import org.checkerframework.checker.units.qual.m;

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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.CameraType;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.entity.SunflowerEntity;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class RenderShapesProcedure {
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
		if (RenderShapesProcedure.bufferBuilder == null || !RenderShapesProcedure.bufferBuilder.building()) {
			if (update)
				clear();
			if (RenderShapesProcedure.vertexBuffer == null) {
				if (format == DefaultVertexFormat.POSITION_COLOR) {
					RenderShapesProcedure.mode = mode;
					RenderShapesProcedure.format = format;
					RenderShapesProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					RenderShapesProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_COLOR);
					return true;
				} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
					RenderShapesProcedure.mode = mode;
					RenderShapesProcedure.format = format;
					RenderShapesProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					RenderShapesProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_TEX_COLOR);
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
		RenderShapesProcedure.worldCoordinate = worldCoordinate;
	}

	private static boolean target(int targetStage) {
		if (targetStage == currentStage) {
			RenderShapesProcedure.targetStage = targetStage;
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
			execute(event, level, entity, event.getPartialTick(), event.getRenderTick());
			RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.defaultBlendFunc();
			RenderSystem.disableBlend();
			RenderSystem.enableDepthTest();
		}
	}

	public static void execute(LevelAccessor world, Entity entity, double partialTick, double ticks) {
		execute(null, world, entity, partialTick, ticks);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, double partialTick, double ticks) {
		if (entity == null)
			return;
		double width = 0;
		double length = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		double l = 0;
		double m = 0;
		double speed = 0;
		if (world instanceof ClientLevel) {
			for (Entity entityiterator : ((ClientLevel) world).entitiesForRendering()) {
				if (entityiterator instanceof SunflowerEntity) {
					if (target(2)) {
						speed = 0.2;
						width = 0.3125;
						length = 25 * 10;
						RenderSystem.setShaderTexture(0, new ResourceLocation(("craft_no_taizai" + ":textures/" + "sunflower_beam" + ".png")));
						if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR, (!Minecraft.getInstance().isPaused()))) {
							i = width / (-2);
							j = width / 2;
							k = length - 0.5;
							l = (ticks + partialTick) * speed;
							m = length + l;
							add(i, i, k, 0, (float) l, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(i, i, i, 0, (float) m, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(j, i, i, 1, (float) m, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(j, i, k, 1, (float) l, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(j, j, k, 0, (float) l, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(j, j, i, 0, (float) m, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(i, j, i, 1, (float) m, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(i, j, k, 1, (float) l, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(j, i, k, 0, (float) l, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(j, i, i, 0, (float) m, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(j, j, i, 1, (float) m, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(j, j, k, 1, (float) l, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(i, j, k, 0, (float) l, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(i, j, i, 0, (float) m, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(i, i, i, 1, (float) m, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(i, i, k, 1, (float) l, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							end();
						}
						renderShape(shape(), (entityiterator.getX() + entityiterator.getLookAngle().x), (entityiterator.getY() + 3.28), (entityiterator.getZ() + entityiterator.getLookAngle().z), entityiterator.getYRot(), entityiterator.getXRot(), 0,
								-2, 2, 1, 32 << 24 | 255 << 16 | 255 << 8 | 255);
						renderShape(shape(), (entityiterator.getX() + entityiterator.getLookAngle().x), (entityiterator.getY() + 3.28), (entityiterator.getZ() + entityiterator.getLookAngle().z), entityiterator.getYRot(), entityiterator.getXRot(), 0,
								1, 1, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
						release();
					}
				}
			}
		}
		if (Minecraft.getInstance().options.getCameraType() == CameraType.FIRST_PERSON) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).MagicDetection) {
				if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR, false)) {
					add(0.5, 0.5, 0, 0, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
					add(0.5, (-0.5), 0, 0, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
					add((-0.5), (-0.5), 0, 1, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
					add((-0.5), 0.5, 0, 1, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
					end();
				}
				if (target(2)) {
					RenderSystem.disableDepthTest();
					if (world instanceof ClientLevel) {
						for (Entity entityiterator : ((ClientLevel) world).entitiesForRendering()) {
							if (!(entityiterator == entity || entityiterator instanceof ItemEntity || entityiterator instanceof ExperienceOrb
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
								RenderSystem.setShaderTexture(0, new ResourceLocation(("craft_no_taizai" + ":textures/" + "indicator" + ".png")));
								renderShape(shape(), (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() + 0.7), (entityiterator.getZ()), entity.getYRot(), 0, 0, (float) 0.4, (float) 0.4, (float) 0.4,
										175 << 24 | 0 << 16 | 19 << 8 | 189);
							}
						}
					}
					release();
				}
				clear();
				RenderSystem.enableDepthTest();
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).lock_on) {
				if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR, false)) {
					add(0.5, 0.5, 0, 0, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
					add(0.5, (-0.5), 0, 0, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
					add((-0.5), (-0.5), 0, 1, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
					add((-0.5), 0.5, 0, 1, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
					end();
				}
				if (target(2)) {
					RenderSystem.disableDepthTest();
					if (world instanceof ClientLevel) {
						for (Entity entityiterator : ((ClientLevel) world).entitiesForRendering()) {
							if (!(entityiterator == entity || entityiterator instanceof ItemEntity || entityiterator instanceof ExperienceOrb
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
									}.checkGamemode(entityiterator))
									&& (entityiterator.getStringUUID()).equals((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).target_lock)) {
								RenderSystem.setShaderTexture(0, new ResourceLocation(("craft_no_taizai" + ":textures/" + "lock_on" + ".png")));
								renderShape(shape(), (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() * 0.6), (entityiterator.getZ()), entity.getYRot(), 0, 0, (float) 0.7, (float) 0.7, (float) 0.7,
										175 << 24 | 181 << 16 | 0 << 8 | 0);
							}
						}
					}
					release();
				}
				clear();
				RenderSystem.enableDepthTest();
			}
			if (world instanceof ClientLevel) {
				for (Entity entityiterator : ((ClientLevel) world).entitiesForRendering()) {
					if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).health_display && entityiterator.getPersistentData().getDouble("level") > 0) {
						if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR, false)) {
							add(0.85, 0, 0.15, 0, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add(0.85, 0, (-0.15), 0, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add((-0.85), 0, (-0.15), 1, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add((-0.85), 0, 0.15, 1, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							end();
						}
						if (target(2)) {
							RenderSystem.setShaderTexture(0, new ResourceLocation(("craft_no_taizai" + ":textures/" + "gray" + ".png")));
							renderShape(shape(), (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() + 0.7), (entityiterator.getZ()), (float) (entity.getYRot() + 180), (float) (entity.getXRot() * (-1) + 90), 0, 1, 1, 1,
									200 << 24 | 255 << 16 | 255 << 8 | 255);
							release();
						}
						clear();
						if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR, false)) {
							add((-0.8 + 1.6 * ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1))), 0, 0.1, 0, 0,
									255 << 24 | 255 << 16 | 255 << 8 | 255);
							add((-0.8 + 1.6 * ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1))), 0, (-0.1), 0, 1,
									255 << 24 | 255 << 16 | 255 << 8 | 255);
							add((-0.8), 0, (-0.1), 1, 1, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							add((-0.8), 0, 0.1, 1, 0, 255 << 24 | 255 << 16 | 255 << 8 | 255);
							end();
						}
						if (target(2)) {
							RenderSystem.setShaderTexture(0, new ResourceLocation(("craft_no_taizai" + ":textures/" + "green" + ".png")));
							renderShape(shape(), (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() + 0.7), (entityiterator.getZ()), (float) (entity.getYRot() + 180), (float) (entity.getXRot() * (-1) + 90), 0, 1, 1, 1,
									255 << 24 | 255 << 16 | 0 << 8 | 150);
							release();
						}
						clear();
					}
				}
			}
		}
	}
}
