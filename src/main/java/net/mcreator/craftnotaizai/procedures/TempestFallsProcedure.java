package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class TempestFallsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double r = 0;
		double deg = 0;
		double hight = 0;
		double delay = 0;
		double wide = 0;
		double rep = 0;
		double height = 0;
		double amount = 0;
		for (int index0 = 0; index0 < (int) (5 * 1); index0++) {
			entity.getPersistentData().putDouble("pX",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
			entity.getPersistentData().putDouble("pY",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
			entity.getPersistentData().putDouble("pZ",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			entity.getPersistentData().putDouble("vX", (entity.getLookAngle().x * 0.1));
			entity.getPersistentData().putDouble("vY", (entity.getLookAngle().y * 0.1));
			entity.getPersistentData().putDouble("vZ", (entity.getLookAngle().z * 0.1));
			entity.getPersistentData().putDouble("rep2", 0);
			for (int index1 = 0; index1 < 200; index1++) {
				rep = rep + 0.5;
				CraftNoTaizaiMod.queueServerWork((int) rep, () -> {
					entity.getPersistentData().putDouble("rep2", (entity.getPersistentData().getDouble("rep2") + (2 * Math.PI) / 60));
					entity.getPersistentData().putDouble("rep", (entity.getPersistentData().getDouble("rep2")));
					entity.getPersistentData().putDouble("height", 0);
					entity.getPersistentData().putDouble("distance", 0);
					for (int index2 = 0; index2 < 60; index2++) {
						entity.getPersistentData().putDouble("distance", (entity.getPersistentData().getDouble("distance") + 0.05));
						entity.getPersistentData().putDouble("height", (entity.getPersistentData().getDouble("height") + 0.15));
						entity.getPersistentData().putDouble("rep", (entity.getPersistentData().getDouble("rep") + Math.PI / 60));
						for (int index3 = 0; index3 < 3; index3++) {
							entity.getPersistentData().putDouble("rep", (entity.getPersistentData().getDouble("rep") + (2 * Math.PI) / 3));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_no_taizai:tonado")), SoundSource.PLAYERS, (float) 0.05, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_no_taizai:tonado")), SoundSource.PLAYERS, (float) 0.05, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SMOKE, (entity.getPersistentData().getDouble("pX") + Math.sin(entity.getPersistentData().getDouble("rep")) * entity.getPersistentData().getDouble("distance")),
										(entity.getPersistentData().getDouble("pY") + entity.getPersistentData().getDouble("height")),
										(entity.getPersistentData().getDouble("pZ") + Math.cos(entity.getPersistentData().getDouble("rep")) * entity.getPersistentData().getDouble("distance")), 1, 0, 0, 0, 0);
							TempestFallDamageProcedure.execute(world, entity);
						}
					}
				});
			}
		}
	}
}
