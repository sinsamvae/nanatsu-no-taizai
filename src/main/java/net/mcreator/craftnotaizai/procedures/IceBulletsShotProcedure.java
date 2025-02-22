package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class IceBulletsShotProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double num_rep = 0;
		double rep = 0;
		for (int index0 = 0; index0 < 10; index0++) {
			rep = rep + 0.3;
			CraftNoTaizaiMod.queueServerWork((int) rep, () -> {
				IceBulletsDamageProcedure.execute(entity);
			});
		}
	}
}
