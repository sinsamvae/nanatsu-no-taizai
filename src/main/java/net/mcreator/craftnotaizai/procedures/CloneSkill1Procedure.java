package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class CloneSkill1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double wait = 0;
		if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Full_Counter_Use) {
			entity.getPersistentData().putBoolean("Full Counter", true);
		}
	}
}
