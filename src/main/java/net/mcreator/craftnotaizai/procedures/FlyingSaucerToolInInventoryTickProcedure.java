package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class FlyingSaucerToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world) {
		if (!CraftNoTaizaiModVariables.MapVariables.get(world).FlyingSaucer) {
			CraftNoTaizaiModVariables.MapVariables.get(world).FlyingSaucer = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
