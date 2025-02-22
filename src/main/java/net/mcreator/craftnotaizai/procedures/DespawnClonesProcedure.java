package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.entity.PhysicalCloneEntity;

import java.util.Comparator;

public class DespawnClonesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 1) {
			if (!world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				if (!((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
					((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 2) {
			if (!world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				for (int index0 = 0; index0 < (int) (2 * 1); index0++) {
					if (!((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
						((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 3) {
			if (!world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				for (int index1 = 0; index1 < (int) (3 * 1); index1++) {
					if (!((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
						((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 4) {
			if (!world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				for (int index2 = 0; index2 < (int) (4 * 1); index2++) {
					if (!((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
						((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 5) {
			if (!world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				for (int index3 = 0; index3 < (int) (5 * 1); index3++) {
					if (!((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
						((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 6) {
			if (!world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				for (int index4 = 0; index4 < (int) (6 * 1); index4++) {
					if (!((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
						((Entity) world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
				}
			}
		}
	}
}
