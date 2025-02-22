package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class FairyTreeSaplingsOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double lightlevel = 0;
		if (!world.isClientSide()) {
			if (FairyTreeSaplingsBoneMealSuccessConditionProcedure.execute()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_no_taizai", "remaketree"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 2), BlockPos.containing(x - 3, y - 1, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
}
