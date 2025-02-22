package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class EntraceCapitalOfDeadVarProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String cords = "";
		return "Coordinates: " + ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).string_cords).substring(70);
	}
}
