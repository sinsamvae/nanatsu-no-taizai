package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class IceAnchorProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		int horizontalRadiusSquare = (int) 2 - 1;
		int verticalRadiusSquare = (int) 2 - 1;
		int yIterationsSquare = verticalRadiusSquare;
		for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
			for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
				for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
					// Execute the desired statements within the square/cube
					world.setBlock(BlockPos.containing(x + xi, y + i + 1, z + zi), Blocks.ICE.defaultBlockState(), 3);
				}
			}
		}
	}
}
