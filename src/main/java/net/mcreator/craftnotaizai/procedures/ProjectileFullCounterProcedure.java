package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.entity.MeliodasBossAnimatedEntity;

import java.util.Comparator;

public class ProjectileFullCounterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double delay = 0;
		double rep = 0;
		if (!(null == entity || null == ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)) || null == immediatesourceentity)) {
			if ((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Full_Counter_Use == true) {
				immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getDeltaMovement().x() + entity.getLookAngle().x * (-1)), (immediatesourceentity.getDeltaMovement().y() + entity.getLookAngle().y * (-1)),
						(immediatesourceentity.getDeltaMovement().z() + entity.getLookAngle().z * (-1))));
				immediatesourceentity.getPersistentData().putBoolean("deflected", true);
			}
			if ((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbsoluteCanel) {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
			}
			if (!world.getEntitiesOfClass(MeliodasBossAnimatedEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
				if (((Entity) world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getBoolean("Full Counter") == true) {
					immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getDeltaMovement().x() + entity.getLookAngle().x * (-1)), (immediatesourceentity.getDeltaMovement().y() + entity.getLookAngle().y * (-1)),
							(immediatesourceentity.getDeltaMovement().z() + entity.getLookAngle().z * (-1))));
					immediatesourceentity.getPersistentData().putBoolean("deflected", true);
				}
			}
		}
	}
}
