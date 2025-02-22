package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class UCVarProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "UC: " + new java.text.DecimalFormat("##.##" + " TP").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TPAmount);
	}
}
