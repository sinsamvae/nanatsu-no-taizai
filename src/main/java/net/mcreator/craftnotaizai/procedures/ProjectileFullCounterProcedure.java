package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import java.util.List;
import java.util.Comparator;

public class ProjectileFullCounterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		double delay = 0;
		double rep = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player && (entityiterator.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Full_Counter_Use) {
					immediatesourceentity.getPersistentData().putBoolean("deflected", true);
					immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getDeltaMovement().x() + entityiterator.getLookAngle().x * (-1)), (immediatesourceentity.getDeltaMovement().y() + entityiterator.getLookAngle().y * (-1)),
							(immediatesourceentity.getDeltaMovement().y() + entityiterator.getLookAngle().z * (-1))));
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof Player) && entityiterator.getPersistentData().getBoolean("Full Counter")) {
					immediatesourceentity.getPersistentData().putBoolean("deflected", true);
					immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getDeltaMovement().x() + entityiterator.getLookAngle().x * (-1)), (immediatesourceentity.getDeltaMovement().y() + entityiterator.getLookAngle().y * (-1)),
							(immediatesourceentity.getDeltaMovement().y() + entityiterator.getLookAngle().z * (-1))));
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player && (entityiterator.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbsoluteCanel) {
					if (!immediatesourceentity.level().isClientSide())
						immediatesourceentity.discard();
				}
			}
		}
	}
}
