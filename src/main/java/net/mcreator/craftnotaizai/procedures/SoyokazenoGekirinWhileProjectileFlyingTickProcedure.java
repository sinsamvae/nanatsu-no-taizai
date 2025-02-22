package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class SoyokazenoGekirinWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double delay = 0;
		double sevy = 0;
		double a = 0;
		double sevx = 0;
		double sevz = 0;
		double sev = 0;
		double tedy = 0;
		double tedz = 0;
		double ted = 0;
		double tedx = 0;
		double sevz2 = 0;
		double sevy2 = 0;
		double sevx2 = 0;
		double cubesize = 0;
		double sev2 = 0;
		immediatesourceentity.setNoGravity(true);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, 1, 2, 1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 4, 0.02, 0.02, 0.02, 0);
		ProjectileFullCounterProcedure.execute(world, x, y, z, entity, immediatesourceentity);
		immediatesourceentity.getPersistentData().putDouble("Flying", (immediatesourceentity.getPersistentData().getDouble("Flying") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("Flying") >= 200) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
