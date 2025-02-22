package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DisplayKegTickProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		double fireHeight = 0;
		return "Fuel: " + new java.text.DecimalFormat("##.##").format(new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "fuel"));
	}
}
