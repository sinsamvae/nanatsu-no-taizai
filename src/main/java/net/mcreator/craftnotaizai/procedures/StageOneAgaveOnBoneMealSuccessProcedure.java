package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModBlocks;

public class StageOneAgaveOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RNG = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, (x + 0.5), (y + 0.5), (z + 0.5), 15, 1, 1, 1, 0.025);
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CraftNoTaizaiModBlocks.STAGE_ONE_AGAVE.get()) {
			RNG = Mth.nextInt(RandomSource.create(), 0, 1);
			if (RNG == 0) {
				world.setBlock(BlockPos.containing(x, y, z), CraftNoTaizaiModBlocks.STAGE_TWO_AGAVE.get().defaultBlockState(), 3);
			} else if (RNG == 1) {
				world.setBlock(BlockPos.containing(x, y, z), CraftNoTaizaiModBlocks.LAST_STAGE_AGAVE.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CraftNoTaizaiModBlocks.STAGE_TWO_AGAVE.get()) {
			RNG = Mth.nextInt(RandomSource.create(), 0, 1);
			if (RNG == 1) {
				world.setBlock(BlockPos.containing(x, y, z), CraftNoTaizaiModBlocks.LAST_STAGE_AGAVE.get().defaultBlockState(), 3);
			}
		}
	}
}
