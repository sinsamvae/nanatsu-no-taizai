package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class RandomRaceProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double RandomRace = 0;
		{
			boolean _setval = true;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerFirstJoins = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		RandomRace = Mth.nextInt(RandomSource.create(), 1, 4);
		if (RandomRace == 1) {
			SelectDemonProcedure.execute(world, entity);
		}
		if (RandomRace == 2) {
			SelectHumanProcedure.execute(world, entity);
		}
		if (RandomRace == 3) {
			SelectFairyProcedure.execute(world, entity);
		}
		if (RandomRace == 4) {
			SelectGiantProcedure.execute(entity);
		}
	}
}
