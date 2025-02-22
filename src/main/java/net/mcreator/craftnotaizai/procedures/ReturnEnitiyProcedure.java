package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnEnitiyProcedure {
	public static Entity execute(Entity entity) {
		if (entity == null)
			return null;
		return entity;
	}
}
