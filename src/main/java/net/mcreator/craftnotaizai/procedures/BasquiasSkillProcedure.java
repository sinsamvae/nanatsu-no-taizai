package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class BasquiasSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double distance_in_blocks = 0;
		double y_offset = 0;
		y_offset = 3;
		distance_in_blocks = 1;
		world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.BASQUIAS_PARTICLE.get()), (entity.getX() + entity.getLookAngle().x * distance_in_blocks), (entity.getY() + y_offset),
				(entity.getZ() + entity.getLookAngle().z * distance_in_blocks), 0, 0, 0);
		CraftNoTaizaiMod.queueServerWork(8, () -> {
			BasquiasDamageProcedure.execute(entity);
		});
	}
}
