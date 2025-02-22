package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.MantaEntity;

public class MantaraySpaceOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getVehicle()) instanceof MantaEntity == true) {
			(entity.getVehicle()).getPersistentData().putDouble("MoveY", (entity.getPersistentData().getDouble("MoveY") + 0.3));
		}
	}
}
