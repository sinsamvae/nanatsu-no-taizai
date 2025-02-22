package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class PurgatoryPlayerLeavesDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(
					((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
							? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getXSpawn())
							: 0),
					((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
							? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getYSpawn())
							: 0),
					((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
							? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getZSpawn())
							: 0));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(
						((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getXSpawn())
								: 0),
						((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getYSpawn())
								: 0),
						((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getZSpawn())
								: 0),
						_ent.getYRot(), _ent.getXRot());
		}
		{
			boolean _setval = true;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Purgatory = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
