package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class DisplaynameProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Name: " + entity.getDisplayName().getString();
	}
}
