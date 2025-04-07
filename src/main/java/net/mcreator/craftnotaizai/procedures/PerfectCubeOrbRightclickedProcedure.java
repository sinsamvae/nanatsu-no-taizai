package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModBlocks;

public class PerfectCubeOrbRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String oldblock = "";
		int horizontalRadiusSquare = (int) 20 - 1;
		int verticalRadiusSquare = (int) 20 - 1;
		int yIterationsSquare = verticalRadiusSquare;
		for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
			for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
				for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
					// Execute the desired statements within the square/cube
					oldblock = (("" + world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).replace("Block{", "")).replace("}", "");
					if (y + i >= entity.getY()) {
						world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
					}
					if (y + i < entity.getY()) {
						world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftNoTaizaiModBlocks.PERFECT_CUBE.get().defaultBlockState(), 3);
					}
					if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 18) {
						world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftNoTaizaiModBlocks.PERFECT_CUBE.get().defaultBlockState(), 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putString("old_block", oldblock);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
