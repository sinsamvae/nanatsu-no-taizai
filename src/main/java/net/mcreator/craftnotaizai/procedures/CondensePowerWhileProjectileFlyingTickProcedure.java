package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TraceableEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

public class CondensePowerWhileProjectileFlyingTickProcedure {
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
		ProjectileFullCounterProcedure.execute(world, x, y, z, entity, immediatesourceentity);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.ICE.get()), x, y, z, 4, 0.02, 0.02, 0.02, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.BUBBLE, x, y, z, 4, 0.5, 0.5, 0.5, 0);
		immediatesourceentity.getPersistentData().putDouble("ax", ((immediatesourceentity instanceof TraceableEntity _traceableEntity ? _traceableEntity.getOwner() : null).getLookAngle().x));
		immediatesourceentity.getPersistentData().putDouble("ay", ((immediatesourceentity instanceof TraceableEntity _traceableEntity ? _traceableEntity.getOwner() : null).getLookAngle().y));
		immediatesourceentity.getPersistentData().putDouble("az", ((immediatesourceentity instanceof TraceableEntity _traceableEntity ? _traceableEntity.getOwner() : null).getLookAngle().z));
		immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getPersistentData().getDouble("ax")), (immediatesourceentity.getPersistentData().getDouble("ay")), (immediatesourceentity.getPersistentData().getDouble("az"))));
		immediatesourceentity.getPersistentData().putDouble("Flying", (immediatesourceentity.getPersistentData().getDouble("Flying") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("Flying") >= 200) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
