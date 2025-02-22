package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class HawksEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		if (CraftNoTaizaiModVariables.MapVariables.get(world).heat_fork) {
			CraftNoTaizaiModVariables.MapVariables.get(world).heat_fork = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			random = Mth.nextInt(RandomSource.create(), 1, 100);
			if (random <= 15) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.HEAT_FORK.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
