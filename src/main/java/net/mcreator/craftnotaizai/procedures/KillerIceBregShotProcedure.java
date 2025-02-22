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

public class KillerIceBregShotProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double num_rep = 0;
		double rep = 0;
		entity.getPersistentData().putDouble("range", 0.8);
		for (int index0 = 0; index0 < 40; index0++) {
			rep = rep + 0.3;
			CraftNoTaizaiMod.queueServerWork((int) rep, () -> {
				entity.getPersistentData().putDouble("range", (entity.getPersistentData().getDouble("range") + 0.1));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_no_taizai:killer_iceberg")), SoundSource.PLAYERS, (float) 0.05, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_no_taizai:killer_iceberg")), SoundSource.PLAYERS, (float) 0.05, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.WHITE.get()), (entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("range")),
							(entity.getY() + 1.5 + entity.getLookAngle().y * entity.getPersistentData().getDouble("range")), (entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("range")), (int) 1.3, 0.3, 0.3, 0.3, 0.1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.ICE.get()), (entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("range")),
							(entity.getY() + 1.5 + entity.getLookAngle().y * entity.getPersistentData().getDouble("range")), (entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("range")), (int) 1.3, 0.3, 0.3, 0.3, 0.1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.KILLERBREG_PARTICLES.get()), (entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("range")),
							(entity.getY() + 1.5 + entity.getLookAngle().y * entity.getPersistentData().getDouble("range")), (entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("range")), 1, 0.3, 0.3, 0.3, 0.1);
				KillerIceBregDamageProcedure.execute(world, entity);
			});
		}
	}
}
