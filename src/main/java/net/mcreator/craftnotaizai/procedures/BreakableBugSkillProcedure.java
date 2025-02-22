package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class BreakableBugSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double rep = 0;
		double delay = 0;
		for (int index0 = 0; index0 < 20; index0++) {
			delay = delay + 1;
			CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
				BreakableBugDamageProcedure.execute(entity);
			});
		}
	}
}
