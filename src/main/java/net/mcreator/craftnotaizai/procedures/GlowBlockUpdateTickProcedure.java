package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModBlocks;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class GlowBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CraftNoTaizaiModBlocks.GLOW_BLOCK.get()) {
			CraftNoTaizaiMod.queueServerWork(5, () -> {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			});
		}
	}
}
