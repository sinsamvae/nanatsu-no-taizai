package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.MoonRoseEntity;

public class MoonRoseOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double y_offset = 0;
		double distance_in_blocks = 0;
		if (entity instanceof MoonRoseEntity) {
			((MoonRoseEntity) entity).setAnimation("idle");
		}
	}
}
