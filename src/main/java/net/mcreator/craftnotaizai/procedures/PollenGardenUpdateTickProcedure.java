package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class PollenGardenUpdateTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftNoTaizaiMod.queueServerWork(150, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
