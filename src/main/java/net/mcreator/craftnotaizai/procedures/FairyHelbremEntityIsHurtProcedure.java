package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;

public class FairyHelbremEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double hit = 0;
		hit = Mth.nextInt(RandomSource.create(), 1, 10);
		if (hit < 3) {
			for (int index0 = 0; index0 < (int) (3 * 1); index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CraftNoTaizaiModEntities.VINE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
		}
	}
}
