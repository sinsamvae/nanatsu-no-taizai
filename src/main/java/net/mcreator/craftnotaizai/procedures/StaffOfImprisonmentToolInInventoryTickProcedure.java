package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class StaffOfImprisonmentToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world) {
		if (!CraftNoTaizaiModVariables.MapVariables.get(world).StaffOfImprisonment) {
			CraftNoTaizaiModVariables.MapVariables.get(world).StaffOfImprisonment = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
