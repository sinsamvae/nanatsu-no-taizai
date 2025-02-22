package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class FountainOfYouthPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.immortality = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		CraftNoTaizaiModVariables.MapVariables.get(world).immortalityworld = true;
		CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
	}
}
