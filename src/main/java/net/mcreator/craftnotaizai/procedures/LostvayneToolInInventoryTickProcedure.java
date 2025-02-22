package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class LostvayneToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world) {
		if (!CraftNoTaizaiModVariables.MapVariables.get(world).lostvayne) {
			CraftNoTaizaiModVariables.MapVariables.get(world).lostvayne = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
