package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class DisPlayEnitiyHealthProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Health Display: " + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).health_display;
	}
}
