package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class PurgatorySetUpProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double TPX = 0;
		double Scenario = 0;
		double TPZ = 0;
		double xTP = 0;
		double yTP = 0;
		double zTP = 0;
		xTP = 0;
		yTP = 75;
		zTP = 0;
		{
			Entity _ent = entity;
			_ent.teleportTo(xTP, yTP, zTP);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(xTP, yTP, zTP, _ent.getYRot(), _ent.getXRot());
		}
		if (!(world instanceof ServerLevel _level1 && _level1.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolderOrThrow(FeatureUtils.createKey("craft_no_taizai:purgatory_feature")).value().place(_level1,
				_level1.getChunkSource().getGenerator(), _level1.getRandom(), BlockPos.containing(xTP - 30, yTP - 11, zTP - 40)))) {
			if (world instanceof ServerLevel _level)
				_level.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolderOrThrow(FeatureUtils.createKey("craft_no_taizai:purgatory_feature")).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
						BlockPos.containing(xTP - 30, yTP - 11, zTP - 40));
		}
	}
}
