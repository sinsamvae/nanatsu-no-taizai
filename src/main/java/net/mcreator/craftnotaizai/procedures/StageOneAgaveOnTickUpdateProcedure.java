package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModBlocks;

public class StageOneAgaveOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		BlockState nextStage1 = Blocks.AIR.defaultBlockState();
		BlockState nextStage2 = Blocks.AIR.defaultBlockState();
		BlockState nextStage3 = Blocks.AIR.defaultBlockState();
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND)) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND && Math.random() < 0.75 && !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CraftNoTaizaiModBlocks.LAST_STAGE_AGAVE.get())) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CraftNoTaizaiModBlocks.STAGE_ONE_AGAVE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CraftNoTaizaiModBlocks.STAGE_TWO_AGAVE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CraftNoTaizaiModBlocks.STAGE_TWO_AGAVE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), CraftNoTaizaiModBlocks.STAGE_TWO_AGAVE.get().defaultBlockState(), 3);
			}
		}
	}
}
