package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class BlueDemonKillsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Blue Demons: " + new java.text.DecimalFormat("#").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).defeat_bluedemon) + " / " + "2";
	}
}
