package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class CloverTradingThisGUIIsClosedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("clover", false);
	}
}
