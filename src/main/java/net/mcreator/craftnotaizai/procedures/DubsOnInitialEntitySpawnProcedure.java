package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class DubsOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (!world.isClientSide()) {
			random = Mth.nextInt(RandomSource.create(), 1, 100);
			if (random <= 70) {
				entity.getPersistentData().putDouble("Dubstrades", 1);
			}
			if (random >= 70 && random >= 80) {
				entity.getPersistentData().putDouble("Dubstrades", 2);
			}
			if (random >= 80 && random >= 90) {
				entity.getPersistentData().putDouble("Dubstrades", 3);
			}
			if (random >= 90 && random >= 100) {
				entity.getPersistentData().putDouble("Dubstrades", 4);
			}
		}
	}
}
