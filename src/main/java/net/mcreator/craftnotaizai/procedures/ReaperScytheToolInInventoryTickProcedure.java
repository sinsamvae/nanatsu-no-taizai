package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class ReaperScytheToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world) {
		if (!CraftNoTaizaiModVariables.MapVariables.get(world).ReaperScythe) {
			CraftNoTaizaiModVariables.MapVariables.get(world).ReaperScythe = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
