package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class PurgatoryFrame3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getDouble("flame") >= 15 && entity.getPersistentData().getDouble("flame") <= 20;
	}
}
