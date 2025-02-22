package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.FightingAreaEntity;

public class StoryButton1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story0")) {
			{
				String _setval = "Story1";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Story = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story1")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.TWIGO_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story2")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("craft_no_taizai:sleeping_forest"))) {
			{
				String _setval = "Story3";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Story = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story3")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("craft_no_taizai:sleeping_forest"))) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GIL_THUNDER_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story4")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GOLGIUS_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story5")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DIANE_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story6")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.RUIN_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story7")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.FRIESIA_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story8")
				&& (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:capitalofthe_dead"))) {
			{
				String _setval = "Story9";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Story = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story9")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GUILA_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story10")) {
			{
				String _setval = "Story11";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Story = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story11")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.TAIZOO_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story12")
				|| !world.getEntitiesOfClass(FightingAreaEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).isEmpty()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GRIAMORE_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story13")
				|| !world.getEntitiesOfClass(FightingAreaEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).isEmpty()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.HOWZER_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story14")
				|| !world.getEntitiesOfClass(FightingAreaEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).isEmpty()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.CAIN_BARZAD_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story15")
				|| !world.getEntitiesOfClass(FightingAreaEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).isEmpty()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.STORY_BAN_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story16")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.JERICHO_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story17")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GUILA_DEMONANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story18")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.HELBREM_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story19")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DALE_ARMORED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story20")) {
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story21")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DREYFUS_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story22")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.FAIRY_HELBREM_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story23")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GIL_THUNDER_ANIMATED_2.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.HENDRICKSON_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story24")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.JERICHO_DEMON_FORM.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story25")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DEAD_HELBRAMANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story26")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.STORY_BAN_2_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
