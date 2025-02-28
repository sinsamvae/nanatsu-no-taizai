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
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

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
		CraftNoTaizaiMod.queueServerWork(15, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo(197, 104, 254);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(197, 104, 254, _ent.getYRot(), _ent.getXRot());
			}
		});
		if (!CraftNoTaizaiModVariables.MapVariables.get(world).Istar) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_no_taizai", "istar_base"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(xTP, yTP, zTP), BlockPos.containing(xTP, yTP, zTP), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_no_taizai", "istar_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(xTP, yTP, zTP - 50), BlockPos.containing(xTP, yTP, zTP - 50), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_no_taizai", "istar_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(xTP, yTP, zTP - 105), BlockPos.containing(xTP, yTP, zTP - 105), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			CraftNoTaizaiModVariables.MapVariables.get(world).Istar = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
