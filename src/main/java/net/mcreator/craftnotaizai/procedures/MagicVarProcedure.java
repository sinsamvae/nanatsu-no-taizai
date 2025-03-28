package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class MagicVarProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String magic = "";
		magic = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic;
		if ((magic).equals("elizabethArk")) {
			magic = magic.substring(9);
		}
		if ((magic).equals("maelArk")) {
			magic = magic.substring(4);
		}
		if ((magic).equals("ludocielArk")) {
			magic = magic.substring(8);
		}
		if ((magic).equals("maelSunShine")) {
			magic = magic.substring(4);
		}
		return "Magic: " + magic;
	}
}
