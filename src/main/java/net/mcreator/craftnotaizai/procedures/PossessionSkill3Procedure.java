package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class PossessionSkill3Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String Skill = "";
		Skill = "LOCKED";
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Possession_Switch) {
			Skill = "Levitation";
		}
		return Skill;
	}
}
