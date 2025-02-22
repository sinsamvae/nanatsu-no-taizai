package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class PurgatoryFrame1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getDouble("flame") >= 1 && entity.getPersistentData().getDouble("flame") <= 10;
	}
}
