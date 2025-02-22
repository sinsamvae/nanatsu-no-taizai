package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class FakeBallProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double block = 0;
		block = Mth.nextInt(RandomSource.create(), 1, 2);
		if (block == 1) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 2, y, z), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.FIRE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z + 2), Blocks.FIRE.defaultBlockState(), 3);
		}
		if (block == 2) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 2, y, z), Blocks.ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.ICE.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z + 2), Blocks.ICE.defaultBlockState(), 3);
		}
	}
}
