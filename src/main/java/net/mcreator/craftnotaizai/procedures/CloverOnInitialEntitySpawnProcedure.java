package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CloverOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (!world.isClientSide()) {
			random = Mth.nextInt(RandomSource.create(), 1, 165);
			if (random <= 60) {
				entity.getPersistentData().putDouble("NPCtrade", 1);
			}
			if (random >= 60 && random <= 100) {
				entity.getPersistentData().putDouble("NPCtrade", 2);
			}
			if (random >= 100 && random <= 130) {
				entity.getPersistentData().putDouble("NPCtrade", 3);
			}
			if (random >= 130 && random <= 150) {
				entity.getPersistentData().putDouble("NPCtrade", 4);
			}
			if (random >= 150 && random <= 165) {
				entity.getPersistentData().putDouble("NPCtrade", 5);
			}
		}
	}
}
