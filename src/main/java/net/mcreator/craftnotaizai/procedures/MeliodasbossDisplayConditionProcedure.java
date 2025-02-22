package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class MeliodasbossDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("DemonMark") == true;
	}
}
