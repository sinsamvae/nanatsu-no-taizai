package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class RedkillcountProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Red Count: " + new java.text.DecimalFormat("#").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).redKill) + "/ " + "5";
	}
}
