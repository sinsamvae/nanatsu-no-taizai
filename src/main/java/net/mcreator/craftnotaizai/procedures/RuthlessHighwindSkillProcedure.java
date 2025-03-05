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

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class RuthlessHighwindSkillProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double damage = 0;
		double delay = 0;
		if (entity.onGround()) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
			}
			damage = Math.ceil(0.1 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack
					* (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack_boost) + 2;
			damage = damage + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage / 100;
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
				}
			}
			entity.getPersistentData().putDouble("rD", 1);
			entity.getPersistentData().putDouble("repD", 0);
			for (int index0 = 0; index0 < 70; index0++) {
				delay = delay + 0.1;
				CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
					entity.getPersistentData().putDouble("rD", (entity.getPersistentData().getDouble("rD") + 0.1));
					for (int index1 = 0; index1 < (int) (60 * entity.getPersistentData().getDouble("rD")); index1++) {
						entity.getPersistentData().putDouble("repD", (entity.getPersistentData().getDouble("repD") + (2 * Math.PI) / (60 * entity.getPersistentData().getDouble("rD"))));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entity.getX() + Math.sin(entity.getPersistentData().getDouble("repD")) * entity.getPersistentData().getDouble("rD")),
									(entity.getY() + Math.sin(entity.getPersistentData().getDouble("rD"))), (entity.getZ() + Math.cos(entity.getPersistentData().getDouble("repD")) * entity.getPersistentData().getDouble("rD")), 1, 0.1, 0.1, 0.1, 0);
						RuthlessHighwindDamageProcedure.execute(world, entity.getX() + Math.sin(entity.getPersistentData().getDouble("repD")) * entity.getPersistentData().getDouble("rD"),
								entity.getY() + Math.sin(entity.getPersistentData().getDouble("rD")), entity.getZ() + Math.cos(entity.getPersistentData().getDouble("repD")) * entity.getPersistentData().getDouble("rD"), entity);
					}
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Need to be on Ground to use this skill!"), true);
		}
	}
}
