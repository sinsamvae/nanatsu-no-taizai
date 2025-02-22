package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class PurgatoryFrame5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getDouble("flame") >= 25 && entity.getPersistentData().getDouble("flame") <= 30;
	}
}
