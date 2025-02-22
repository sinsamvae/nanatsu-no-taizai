package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.world.inventory.ClonesGuiMenu;
import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.PhysicalCloneEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.List;
import java.util.Comparator;

import io.netty.buffer.Unpooled;

public class LostvayneRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("ClonesGui");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new ClonesGuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		} else {
			if (!(!world.getEntitiesOfClass(PhysicalCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty())) {
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CraftNoTaizaiModEntities.PHYSICAL_CLONE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
					CraftNoTaizaiMod.queueServerWork(5, () -> {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof PhysicalCloneEntity && !(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
									if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
										_toTame.tame(_owner);
								}
							}
						}
					});
				}
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 2) {
					for (int index0 = 0; index0 < (int) (2 * 1); index0++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CraftNoTaizaiModEntities.PHYSICAL_CLONE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof PhysicalCloneEntity && !(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
									if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
										_toTame.tame(_owner);
								}
							}
						}
					}
				}
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 3) {
					for (int index1 = 0; index1 < (int) (3 * 1); index1++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CraftNoTaizaiModEntities.PHYSICAL_CLONE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof PhysicalCloneEntity && !(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
									if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
										_toTame.tame(_owner);
								}
							}
						}
					}
				}
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 4) {
					for (int index2 = 0; index2 < (int) (4 * 1); index2++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CraftNoTaizaiModEntities.PHYSICAL_CLONE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof PhysicalCloneEntity && !(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
									if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
										_toTame.tame(_owner);
								}
							}
						}
					}
				}
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 5) {
					for (int index3 = 0; index3 < (int) (5 * 1); index3++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CraftNoTaizaiModEntities.PHYSICAL_CLONE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof PhysicalCloneEntity && !(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
									if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
										_toTame.tame(_owner);
								}
							}
						}
					}
				}
				if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).LostVayne == 6) {
					for (int index4 = 0; index4 < (int) (6 * 1); index4++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CraftNoTaizaiModEntities.PHYSICAL_CLONE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof PhysicalCloneEntity && !(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
									if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
										_toTame.tame(_owner);
								}
							}
						}
					}
				}
			}
		}
	}
}
