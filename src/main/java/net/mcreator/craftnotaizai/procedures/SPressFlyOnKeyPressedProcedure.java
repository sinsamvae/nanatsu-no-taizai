package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.entity.MantaEntity;

public class SPressFlyOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double mana = 0;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Levitation) {
			{
				boolean _setval = true;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SPressed = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getVehicle()) instanceof MantaEntity) {
			(entity.getVehicle()).getPersistentData().putDouble("MoveY", (entity.getPersistentData().getDouble("MoveY") - 0.3));
		}
	}
}
