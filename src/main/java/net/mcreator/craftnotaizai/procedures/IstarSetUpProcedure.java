package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class IstarSetUpProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double xTP = 0;
		double yTP = 0;
		double zTP = 0;
		double offset = 0;
		xTP = 95;
		yTP = 100;
		zTP = 222;
		entity.getPersistentData().putDouble("TPX", xTP);
		entity.getPersistentData().putDouble("TPY", yTP);
		entity.getPersistentData().putDouble("TPZ", zTP);
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getPersistentData().getDouble("TPX")), (entity.getPersistentData().getDouble("TPY")), (entity.getPersistentData().getDouble("TPZ")));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("TPX")), (entity.getPersistentData().getDouble("TPY")), (entity.getPersistentData().getDouble("TPZ")), _ent.getYRot(), _ent.getXRot());
		}
		if (!(world instanceof ServerLevel _level7 && _level7.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolderOrThrow(FeatureUtils.createKey("craft_no_taizai:istar_structure")).value().place(_level7,
				_level7.getChunkSource().getGenerator(), _level7.getRandom(), BlockPos.containing(xTP - 103, yTP - 23, zTP - 175)))) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).Istar) {
				if (world instanceof ServerLevel _level)
					_level.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolderOrThrow(FeatureUtils.createKey("craft_no_taizai:istar_structure")).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
							BlockPos.containing(xTP - 103, yTP - 23, zTP - 175));
				CraftNoTaizaiModVariables.MapVariables.get(world).Istar = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
