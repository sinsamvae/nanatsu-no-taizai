package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class IncreaseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double rep = 0;
		double num_rep = 0;
		for (int index0 = 0; index0 < 15; index0++) {
			num_rep = num_rep + 1.5;
			CraftNoTaizaiMod.queueServerWork((int) num_rep, () -> {
				IncreaseDamgeProcedure.execute(entity);
			});
		}
	}
}
