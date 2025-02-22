package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class SetgiantmagicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		random = Mth.nextInt(RandomSource.create(), 1, 100);
		if (random <= 70) {
			{
				String _setval = "Creation";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = "Ground";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
