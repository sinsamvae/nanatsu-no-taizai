package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

public class ExterminateRayWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double sev = 0;
		double tedy = 0;
		double tedz = 0;
		double ted = 0;
		double tedx = 0;
		double sevz2 = 0;
		double sevy2 = 0;
		double sevx2 = 0;
		double cubesize = 0;
		immediatesourceentity.setNoGravity(true);
		ProjectileFullCounterProcedure.execute(world, x, y, z, entity, immediatesourceentity);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.PURPLE.get()), x, y, z, 4, 0.5, 0.5, 0.5, 0);
		immediatesourceentity.getPersistentData().putDouble("Flying", (immediatesourceentity.getPersistentData().getDouble("Flying") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("Flying") >= 200) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
