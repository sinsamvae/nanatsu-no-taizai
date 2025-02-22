package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class IncreaseTrueSpiritSpearProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double num_rep = 0;
		double delay = 0;
		for (int index0 = 0; index0 < 20; index0++) {
			delay = delay + 1.5;
			CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
				IncreaseTrueSpirtSpearDamageProcedure.execute(entity);
			});
		}
	}
}
