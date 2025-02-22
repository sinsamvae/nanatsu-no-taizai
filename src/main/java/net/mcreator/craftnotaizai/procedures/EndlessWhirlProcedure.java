package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class EndlessWhirlProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double wide = 0;
		double rep = 0;
		double height = 0;
		entity.getPersistentData().putDouble("pX", (entity.getX() + entity.getLookAngle().x));
		entity.getPersistentData().putDouble("pY", (entity.getY() - 4));
		entity.getPersistentData().putDouble("pZ", (entity.getZ() + entity.getLookAngle().z));
		entity.getPersistentData().putDouble("vX", (entity.getLookAngle().x * 0));
		entity.getPersistentData().putDouble("vY", (entity.getLookAngle().y * 0));
		entity.getPersistentData().putDouble("vZ", (entity.getLookAngle().z * 0));
		entity.getPersistentData().putDouble("rep2", 0);
		for (int index0 = 0; index0 < 200; index0++) {
			rep = rep + 0.5;
			CraftNoTaizaiMod.queueServerWork((int) rep, () -> {
				entity.getPersistentData().putDouble("pX", (entity.getPersistentData().getDouble("pX") + entity.getPersistentData().getDouble("vX")));
				entity.getPersistentData().putDouble("pY", (entity.getPersistentData().getDouble("pY") + entity.getPersistentData().getDouble("vY")));
				entity.getPersistentData().putDouble("pZ", (entity.getPersistentData().getDouble("pZ") + entity.getPersistentData().getDouble("vZ")));
				entity.getPersistentData().putDouble("rep2", (entity.getPersistentData().getDouble("rep2") + (2 * Math.PI) / 60));
				entity.getPersistentData().putDouble("rep", (entity.getPersistentData().getDouble("rep2")));
				entity.getPersistentData().putDouble("height", 0);
				entity.getPersistentData().putDouble("distance", 0);
				for (int index1 = 0; index1 < 60; index1++) {
					entity.getPersistentData().putDouble("distance", (entity.getPersistentData().getDouble("distance") + 1.5));
					entity.getPersistentData().putDouble("height", (entity.getPersistentData().getDouble("height") + 1.5));
					entity.getPersistentData().putDouble("rep", (entity.getPersistentData().getDouble("rep") + Math.PI / 60));
					for (int index2 = 0; index2 < 5; index2++) {
						entity.getPersistentData().putDouble("rep", (entity.getPersistentData().getDouble("rep") + (2 * Math.PI) / 3));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getPersistentData().getDouble("pX") + Math.sin(entity.getPersistentData().getDouble("rep")) * entity.getPersistentData().getDouble("distance")),
									(entity.getPersistentData().getDouble("pY") + entity.getPersistentData().getDouble("height")),
									(entity.getPersistentData().getDouble("pZ") + Math.cos(entity.getPersistentData().getDouble("rep")) * entity.getPersistentData().getDouble("distance")), 5, 0, 0, 0, 0);
						EndlessWhirlDamageProcedure.execute(world, entity);
					}
				}
			});
		}
	}
}
