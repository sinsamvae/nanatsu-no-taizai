package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class TowerOfTrailsSetUpProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double TPY = 0;
		double TPX = 0;
		double TPZ = 0;
		TPX = 100 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).training_id;
		TPY = 100;
		TPZ = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).training_id;
		entity.getPersistentData().putDouble("TPX", TPX);
		entity.getPersistentData().putDouble("TPY", TPY);
		entity.getPersistentData().putDouble("TPZ", TPZ);
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getPersistentData().getDouble("TPX")), (entity.getPersistentData().getDouble("TPY")), (entity.getPersistentData().getDouble("TPZ")));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("TPX")), (entity.getPersistentData().getDouble("TPY")), (entity.getPersistentData().getDouble("TPZ")), _ent.getYRot(), _ent.getXRot());
		}
		if (!(entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).tower_of_trails) {
			{
				boolean _setval = true;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tower_of_trails = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_no_taizai", "tower_of_trails"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(TPX - 29, TPY - 3, TPZ - 32), BlockPos.containing(TPX - 29, TPY - 3, TPZ - 32),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
	}
}
