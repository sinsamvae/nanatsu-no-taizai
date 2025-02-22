package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class CaveOfTrainingVarProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Entities: " + new java.text.DecimalFormat("#").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).istar_kills) + " / " + "15";
	}
}
