package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class AcidTowerMoveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double wait = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double particleRadius = 0;
		double centerX = 0;
		loop = 0;
		particleAmount = 15;
		xRadius = 5;
		zRadius = 5;
		while (loop < particleAmount) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.ACID_TOWERPARTICLE_2.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius),
						(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z)), (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 1, 0, 0.5, 0, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.ACID_TOWER_PARTICLE_1.get()), (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y,
						(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 1, 0, 0.5, 0, 0);
			loop = loop + 1;
		}
		CraftNoTaizaiMod.queueServerWork(60, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
