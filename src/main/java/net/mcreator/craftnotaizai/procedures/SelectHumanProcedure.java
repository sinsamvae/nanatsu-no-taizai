package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class SelectHumanProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerFirstJoins = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		SetHumanClanAttributesProcedure.execute(entity);
		SetHumanMagicProcedure.execute(world, entity);
		SetHumanManaProcedure.execute(entity);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
