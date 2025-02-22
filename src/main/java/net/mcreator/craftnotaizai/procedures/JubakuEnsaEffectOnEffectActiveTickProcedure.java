package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class JubakuEnsaEffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity) {
			entity.getPersistentData().putDouble("JubakuEnsaTick", (entity.getPersistentData().getDouble("JubakuEnsaTick") + 1));
			if (entity.getPersistentData().getDouble("JubakuEnsaTick") >= 600) {
				entity.getPersistentData().putDouble("JubakuEnsaTick", 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.JUBAKU_ENSA_PARTICLE_2.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.5, 3, 0.5, 0.1);
				CraftNoTaizaiMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						_ent.teleportTo((entity.getPersistentData().getDouble("JubakuEnsaX")), (entity.getPersistentData().getDouble("JubakuEnsaY")), (entity.getPersistentData().getDouble("JubakuEnsaZ")));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("JubakuEnsaX")), (entity.getPersistentData().getDouble("JubakuEnsaY")), (entity.getPersistentData().getDouble("JubakuEnsaZ")), _ent.getYRot(),
									_ent.getXRot());
					}
				});
			}
		}
		{
			double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).JubakuEnsaTick + 1;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.JubakuEnsaTick = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).JubakuEnsaTick >= 600) {
			{
				double _setval = 0;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.JubakuEnsaTick = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.JUBAKU_ENSA_PARTICLE_2.get()), x, y, z, 30, 5, 5, 5, 0.1);
			{
				Entity _ent = entity;
				_ent.teleportTo(((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).JubakuEnsaX),
						((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).JubakuEnsaY),
						((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).JubakuEnsaZ));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).JubakuEnsaX),
							((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).JubakuEnsaY),
							((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).JubakuEnsaZ), _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}
