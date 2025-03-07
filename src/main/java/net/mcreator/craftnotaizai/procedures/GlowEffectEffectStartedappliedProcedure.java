package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

public class GlowEffectEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.MANA_REGEN_EFFET.get(),
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftNoTaizaiModMobEffects.GLOW_EFFECT.get()) ? _livEnt.getEffect(CraftNoTaizaiModMobEffects.GLOW_EFFECT.get()).getDuration() : 0,
					(int) ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).drunk_level + 1), false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftNoTaizaiModMobEffects.GLOW_EFFECT.get()) ? _livEnt.getEffect(CraftNoTaizaiModMobEffects.GLOW_EFFECT.get()).getDuration() : 0,
					(int) ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).drunk_level + 1), false, false));
	}
}
