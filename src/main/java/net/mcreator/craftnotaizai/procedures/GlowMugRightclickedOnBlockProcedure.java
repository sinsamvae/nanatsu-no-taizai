package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModBlocks;

public class GlowMugRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		world.setBlock(BlockPos.containing(x, y + 1, z), CraftNoTaizaiModBlocks.GLOW_MUG_BLOCK.get().defaultBlockState(), 3);
		itemstack.shrink(1);
	}
}
