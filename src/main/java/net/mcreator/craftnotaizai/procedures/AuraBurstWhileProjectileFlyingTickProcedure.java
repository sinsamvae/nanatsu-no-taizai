package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

public class AuraBurstWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double particleNum = 0;
		double vX = 0;
		double vY = 0;
		double vZ = 0;
		double i = 0;
		double x_pos = 0;
		double z_pos = 0;
		double speed = 0;
		double arcAngle = 0;
		double radAngle = 0;
		double delay = 0;
		double radYaw = 0;
		double radPitch = 0;
		double angle = 0;
		double y_pos = 0;
		double radius = 0;
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
		ProjectileFullCounterProcedure.execute(world, x, y, z, entity, immediatesourceentity);
		radius = 3;
		speed = 10;
		particleNum = 30;
		arcAngle = 180;
		radYaw = Math.toRadians(entity.getYRot() + 200);
		radPitch = Math.toRadians((entity.getXRot() + 200) * (-1));
		for (int index0 = 0; index0 < (int) particleNum; index0++) {
			angle = i * (arcAngle / particleNum);
			radAngle = Math.toRadians(angle);
			vX = (Math.sin(radAngle) * Math.sin(radPitch) * Math.cos(radYaw) + Math.cos(radAngle) * Math.sin(radYaw)) * (-1);
			vY = Math.sin(radAngle) * Math.cos(radPitch);
			vZ = Math.sin(radAngle) * Math.sin(radPitch) * Math.sin(radYaw) * (-1) + Math.cos(radAngle) * Math.cos(radYaw);
			x_pos = x + radius * vX;
			y_pos = y + radius * vY;
			z_pos = z + radius * vZ;
			i = i + 1;
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.HUNTER_WISPPARTICLE.get()), (x + radius * vX), (y + radius * vY), (z + radius * vZ), 5, 0, 0, 0, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.WHITE.get()), (x + 0.1 + radius * vX), (y + 0.1 + radius * vY), (z + 0.1 + radius * vZ), 5, 0, 0, 0, 0);
		}
		immediatesourceentity.getPersistentData().putDouble("Flying", (immediatesourceentity.getPersistentData().getDouble("Flying") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("Flying") >= 200) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
