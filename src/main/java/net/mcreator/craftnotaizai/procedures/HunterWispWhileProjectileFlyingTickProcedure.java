package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class HunterWispWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		double delay = 0;
		double distance = 0;
		double range = 0;
		double speed = 0;
		double Random = 0;
		double r = 0;
		double a = 0;
		double cubesize = 0;
		double ssev = 0;
		double sevx = 0;
		double sevy = 0;
		double sevz = 0;
		double ted = 0;
		double tedx = 0;
		double tedy = 0;
		double tedz = 0;
		double sev2 = 0;
		double sevx2 = 0;
		double sevy2 = 0;
		double sevz2 = 0;
		double sev = 0;
		double delta = 0;
		immediatesourceentity.setNoGravity(true);
		ProjectileFullCounterProcedure.execute(world, x, y, z, immediatesourceentity);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.HUNTER_WISPPARTICLE.get()), x, y, z, 4, 0.5, 0.5, 0.5, 0);
		immediatesourceentity.getPersistentData().putDouble("Flying", (immediatesourceentity.getPersistentData().getDouble("Flying") + 1));
		immediatesourceentity.getPersistentData().putDouble("life", (immediatesourceentity.getPersistentData().getDouble("life") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("life") >= 15 && immediatesourceentity.getPersistentData().getDouble("life") < 45) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity) {
						delta = Math
								.sqrt(Math.pow(entityiterator.getX() - immediatesourceentity.getX(), 2) + Math.pow((entityiterator.getY() + 1) - immediatesourceentity.getY(), 2) + Math.pow(entityiterator.getZ() - immediatesourceentity.getZ(), 2));
						immediatesourceentity.setDeltaMovement(
								new Vec3(((entityiterator.getX() - immediatesourceentity.getX()) / delta), (((entityiterator.getY() + 1) - immediatesourceentity.getY()) / delta), ((entityiterator.getZ() - immediatesourceentity.getZ()) / delta)));
					}
				}
			}
		}
		if (immediatesourceentity.getPersistentData().getDouble("Flying") >= 200) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
