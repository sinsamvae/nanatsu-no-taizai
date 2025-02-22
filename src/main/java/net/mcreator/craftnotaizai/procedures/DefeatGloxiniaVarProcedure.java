package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class DefeatGloxiniaVarProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Gloxinia: " + new java.text.DecimalFormat("#").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).defeat_gloxinia) + " / " + "1";
	}
}
