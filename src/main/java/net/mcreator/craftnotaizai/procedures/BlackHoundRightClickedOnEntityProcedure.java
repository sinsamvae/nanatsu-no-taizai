package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class BlackHoundRightClickedOnEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("follow") == true) {
			entity.getPersistentData().putBoolean("follow", false);
		} else {
			entity.getPersistentData().putBoolean("follow", true);
		}
	}
}
