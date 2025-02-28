package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;

public class IstarStartWaveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double entities = 0;
		{
			double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).waveNumber * 2;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.remainingEnemies = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		for (int index0 = 0; index0 < (int) ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).waveNumber * 2); index0++) {
			entities = Mth.nextInt(RandomSource.create(), 1, 3);
			if (entities == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CraftNoTaizaiModEntities.ANAON.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -5, 5), y, z + Mth.nextDouble(RandomSource.create(), -5, 5)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
			if (entities == 2) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CraftNoTaizaiModEntities.TYRANT_DRAGON_CAVE.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -5, 5), y, z + Mth.nextDouble(RandomSource.create(), -5, 5)),
							MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
			if (entities == 3) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CraftNoTaizaiModEntities.CLAY_DRAGON.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -5, 5), y, z + Mth.nextDouble(RandomSource.create(), -5, 5)),
							MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
		}
	}
}
