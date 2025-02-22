package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class DisasterSkillDisplay8Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String skill = "";
		skill = "LOCKED";
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Disaster")
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Gloxinia == false) {
			skill = "Pollen Garden";
		}
		return skill;
	}
}
