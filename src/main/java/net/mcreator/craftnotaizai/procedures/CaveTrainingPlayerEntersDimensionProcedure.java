package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class CaveTrainingPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		double amount = 0;
		CaveOfTrainingSetUpProcedure.execute(world, entity);
		CraftNoTaizaiMod.queueServerWork(60, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A77You've entered the cave of training realm!"), false);
			{
				double _setval = 12000;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.training_kick = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story39")) {
				CaveofTrainingSpawnProcedure.execute(world, y, entity);
			}
		});
	}
}
