package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

public class RakanWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		double delay = 0;
		double sevy = 0;
		double a = 0;
		double sevx = 0;
		double sevz = 0;
		double sev = 0;
		double tedy = 0;
		immediatesourceentity.setNoGravity(true);
		ProjectileFullCounterProcedure.execute(world, x, y, z, immediatesourceentity);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.WHITE.get()), x, y, z, 4, 0.5, 0.5, 0.5, 0);
		immediatesourceentity.getPersistentData().putDouble("Flying", (immediatesourceentity.getPersistentData().getDouble("Flying") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("Flying") >= 200) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
