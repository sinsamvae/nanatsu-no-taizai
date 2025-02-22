package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class BanishingProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double wait = 0;
		double delay = 0;
		double angle = 0;
		double radius = 0;
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		entity.getPersistentData().putDouble("distance", 0);
		for (int index0 = 0; index0 < 90; index0++) {
			wait = wait + 0.4;
			CraftNoTaizaiMod.queueServerWork((int) wait, () -> {
				if (entity.getPersistentData().getDouble("distance") > 1) {
					entity.getPersistentData().putDouble("distance", 0);
					entity.getPersistentData().putBoolean("dir_slash", (!entity.getPersistentData().getBoolean("dir_slash")));
				}
				entity.getPersistentData().putDouble("distance", (entity.getPersistentData().getDouble("distance") + 0.03));
				entity.getPersistentData().putDouble("rep", (Math.PI * (entity.getYRot() / 180) * (-1) - Math.PI / 3.5));
				entity.getPersistentData().putDouble("range", 1);
				for (int index1 = 0; index1 < 100; index1++) {
					entity.getPersistentData().putDouble("range", (entity.getPersistentData().getDouble("range") + 0.2));
					entity.getPersistentData().putDouble("rep", (entity.getPersistentData().getDouble("rep") + ((0.6 * Math.PI) / 100) * (entity.getPersistentData().getBoolean("dir_slash") ? -1 : 1)));
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.PURPLE.get()),
								(entity.getX() + Math.sin(entity.getPersistentData().getDouble("rep")) * 2 * entity.getPersistentData().getDouble("range") * entity.getPersistentData().getDouble("distance")),
								(entity.getY() + 1.5 + entity.getLookAngle().y),
								(entity.getZ() + Math.cos(entity.getPersistentData().getDouble("rep")) * 2 * entity.getPersistentData().getDouble("range") * entity.getPersistentData().getDouble("distance")), 1, 0, 0, 0, 0);
					BanishingDamageProcedure.execute(world, entity);
				}
			});
		}
	}
}
