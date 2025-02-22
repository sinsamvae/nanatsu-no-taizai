package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class GuildMember3Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String member = "";
		member = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).guild_stack).getOrCreateTag()
				.getString(("guild" + (3 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).guild_number)));
		if ((member).equals("")) {
			member = "NONE";
		}
		return member;
	}
}
