package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

public class ChastiefolTrueSpirtSpearProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double y_offset = 0;
		double distance_in_blocks = 0;
		world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.CHASTIFOL_RED_PARTICLES.get()), (entity.getX() + entity.getLookAngle().x * distance_in_blocks), (entity.getY() + entity.getBbHeight() + y_offset),
				(entity.getZ() + entity.getLookAngle().z * distance_in_blocks), 0, 0, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 10, 2, 2, 2, 0.5);
	}
}
