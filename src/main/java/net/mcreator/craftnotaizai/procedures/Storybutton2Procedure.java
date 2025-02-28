package net.mcreator.craftnotaizai.procedures;

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

public class Storybutton2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story27")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DEMON_HENDRICKSON_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story28")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GRAY_DEMON_HENDRICKSON_ANIMATED.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story30")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DOGEDO.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story31")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GOWTHER_STORY_1.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story32")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.ALBION.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story33")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("craft_no_taizai:fairy_king_forest"))) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.TALL_ALBION.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story37")) {
			{
				String _setval = "Story38";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Story = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story34")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GALAND.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story39")
				&& (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:cave_training"))) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.KING_STORY_1.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story40")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GALAND_STORY_2.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story41")
				&& world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("plains"))) {
			{
				String _setval = "Story42";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Story = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story42")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.ELAINE_STORY.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story43")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GALAND_OVER.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story44")) {
			{
				String _setval = "Story45";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Story = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story46")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.JIGUMO.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story47")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.TORAH.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story49")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GERHEADESERVANT.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story50")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.STONE_DROLE.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story51")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GOWTHER_EP_18.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story52")
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).defeat_gloxinia == 0
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).defeat_drole == 0) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GLOXINIA_STORY.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DROLE.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story52")
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).defeat_drole == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GLOXINIA_STORY.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story52")
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).defeat_gloxinia == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DROLE.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story53")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DEIRERI_STORY.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.MONSPEIT_STORY.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DROLE_STORY_2.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GLOXINIA_STORY_2.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GRAY_ROAD_STORY.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.ESTAROSSA_STORY.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.ZELDRIS_STORY.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DREYFUS_DEMON.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story55")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.ESTARROSSA_STORY.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story56")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.DEIRERI_STORY_2.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.MONSPEIT_STORY_2.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story57")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.GRAY_ROAD_STORY_2.get().spawn(_level,
						BlockPos.containing(entity.getLookAngle().x + entity.getX(), entity.getLookAngle().y + entity.getY() + entity.getBbHeight(), entity.getLookAngle().z + entity.getZ()), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story58")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.FRAUDRIN_STORY.get().spawn(_level,
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
