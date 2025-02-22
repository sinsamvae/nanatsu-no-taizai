package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.MantaEntity;

public class MantarayMoveOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getVehicle()) instanceof MantaEntity == true) {
			(entity.getVehicle()).getPersistentData().putBoolean("Montado", true);
		}
	}
}
