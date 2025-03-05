package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class HailOfCompassionSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double delay = 0;
		for (int index0 = 0; index0 < 5; index0++) {
			delay = delay + 1;
			CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
				HailOfCompassionDamageProcedure.execute(entity);
			});
		}
	}
}
