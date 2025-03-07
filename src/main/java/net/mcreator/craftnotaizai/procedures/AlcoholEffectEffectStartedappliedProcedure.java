package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

public class AlcoholEffectEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftNoTaizaiModMobEffects.ALCOHOL_EFFECT.get()) ? _livEnt.getEffect(CraftNoTaizaiModMobEffects.ALCOHOL_EFFECT.get()).getDuration() : 0,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftNoTaizaiModMobEffects.ALCOHOL_EFFECT.get()) ? _livEnt.getEffect(CraftNoTaizaiModMobEffects.ALCOHOL_EFFECT.get()).getAmplifier() : 0));
	}
}
