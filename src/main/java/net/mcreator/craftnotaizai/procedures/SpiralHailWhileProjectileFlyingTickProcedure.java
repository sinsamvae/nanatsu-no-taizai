package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class SpiralHailWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double delay = 0;
		double rep = 0;
		entity.getPersistentData().putDouble("range", 0.5);
		for (int index0 = 0; index0 < 40; index0++) {
			rep = rep + 0.3;
			CraftNoTaizaiMod.queueServerWork((int) rep, () -> {
				entity.getPersistentData().putDouble("range", (entity.getPersistentData().getDouble("range") + 0.1));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_no_taizai:ice_bullet")), SoundSource.PLAYERS, (float) 0.05, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_no_taizai:ice_bullet")), SoundSource.PLAYERS, (float) 0.05, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.WHITE.get()), (entity.getPersistentData().getDouble("sx") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepZ()),
							(entity.getPersistentData().getDouble("sy") + Math.cos(entity.getPersistentData().getDouble("h"))),
							(entity.getPersistentData().getDouble("sz") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepX()), 3, 0.1, 0.1, 0.1, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.ICE.get()), (entity.getPersistentData().getDouble("sx") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepZ()),
							(entity.getPersistentData().getDouble("sy") + Math.cos(entity.getPersistentData().getDouble("h"))),
							(entity.getPersistentData().getDouble("sz") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepX()), 3, 0.1, 0.1, 0.1, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.KILLERBREG_PARTICLES.get()),
							(entity.getPersistentData().getDouble("sx") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepZ()),
							(entity.getPersistentData().getDouble("sy") + Math.cos(entity.getPersistentData().getDouble("h"))),
							(entity.getPersistentData().getDouble("sz") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepX()), 1, 0.1, 0.1, 0.1, 0);
				SpiralHaiDamageProcedure.execute(world, entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("range"), entity.getY() + 1.5 + entity.getLookAngle().y * entity.getPersistentData().getDouble("range"),
						entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("range"), entity);
			});
		}
	}
}
