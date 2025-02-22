package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CaveTrainingSpawnMobProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double amount = 0;
		double entityspawn = 0;
		double area = 0;
		double TPY = 0;
		double TPX = 0;
		double TPZ = 0;
		if (((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:cave_training"))
				|| (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:tower_of_trails")))
				&& !((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story39")) {
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).cave_of_training_timer + 1;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cave_of_training_timer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).cave_of_training_timer > 700) {
				{
					double _setval = 0;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.cave_of_training_timer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				amount = Mth.nextInt(RandomSource.create(), 4, 7);
				for (int index0 = 0; index0 < (int) (amount * 1); index0++) {
					entityspawn = Mth.nextInt(RandomSource.create(), 1, 3);
					if (entityspawn == 1) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CraftNoTaizaiModEntities.CLAY_DRAGON.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 0, 3), y, z + Mth.nextDouble(RandomSource.create(), 0, 3)),
									MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					} else if (entityspawn == 2) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CraftNoTaizaiModEntities.TYRANT_DRAGON_CAVE.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 0, 3), y, z + Mth.nextDouble(RandomSource.create(), 0, 3)),
									MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
					if (entityspawn == 3) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = CraftNoTaizaiModEntities.ANAON.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 0, 3), y, z + Mth.nextDouble(RandomSource.create(), 0, 3)),
									MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
				}
			}
		}
	}
}
