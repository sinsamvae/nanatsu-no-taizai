package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class SuperCycloneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double wide = 0;
		double rep = 0;
		double height = 0;
		if (entity.onGround()) {
			entity.getPersistentData().putDouble("pX", (entity.getX()));
			entity.getPersistentData().putDouble("pY", (entity.getY()));
			entity.getPersistentData().putDouble("pZ", (entity.getZ()));
			entity.getPersistentData().putDouble("vX", (entity.getLookAngle().x * 0.1));
			entity.getPersistentData().putDouble("vY", (entity.getLookAngle().y * 0.1));
			entity.getPersistentData().putDouble("vZ", (entity.getLookAngle().z * 0.1));
			entity.getPersistentData().putDouble("rep2", 0);
			for (int index0 = 0; index0 < 300; index0++) {
				rep = rep + 0.5;
				CraftNoTaizaiMod.queueServerWork((int) rep, () -> {
					entity.getPersistentData().putDouble("rep2", (entity.getPersistentData().getDouble("rep2") + (2 * Math.PI) / 60));
					entity.getPersistentData().putDouble("rep", (entity.getPersistentData().getDouble("rep2")));
					entity.getPersistentData().putDouble("height", 0);
					entity.getPersistentData().putDouble("distance", 0);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_no_taizai:tonado")), SoundSource.PLAYERS, (float) 0.05, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_no_taizai:tonado")), SoundSource.PLAYERS, (float) 0.05, 1, false);
						}
					}
					for (int index1 = 0; index1 < 60; index1++) {
						entity.getPersistentData().putDouble("distance", (entity.getPersistentData().getDouble("distance") + 0.85));
						entity.getPersistentData().putDouble("height", (entity.getPersistentData().getDouble("height") + 1.5));
						entity.getPersistentData().putDouble("rep", (entity.getPersistentData().getDouble("rep") + Math.PI / 60));
						for (int index2 = 0; index2 < 3; index2++) {
							entity.getPersistentData().putDouble("rep", (entity.getPersistentData().getDouble("rep") + (20 * Math.PI) / 21));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.LARGE_SMOKE, (entity.getPersistentData().getDouble("pX") + Math.sin(entity.getPersistentData().getDouble("rep")) * entity.getPersistentData().getDouble("distance")),
										((entity.getPersistentData().getDouble("pY") + entity.getPersistentData().getDouble("height")) - 3),
										(entity.getPersistentData().getDouble("pZ") + Math.cos(entity.getPersistentData().getDouble("rep")) * entity.getPersistentData().getDouble("distance")), 4, 0, 0, 0, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SMOKE, (entity.getPersistentData().getDouble("pX") + Math.sin(entity.getPersistentData().getDouble("rep")) * entity.getPersistentData().getDouble("distance")),
										((entity.getPersistentData().getDouble("pY") + entity.getPersistentData().getDouble("height")) - 3),
										(entity.getPersistentData().getDouble("pZ") + Math.cos(entity.getPersistentData().getDouble("rep")) * entity.getPersistentData().getDouble("distance")), 4, 0, 0, 0, 0);
							SuperCycloneDamageProcedure.execute(world, x, y, z, entity);
						}
					}
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You need to be grounded to use this move!"), true);
		}
	}
}
