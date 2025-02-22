package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

public class HeavyMetalOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftNoTaizaiModMobEffects.HEAVY_METAL.get()) ? _livEnt.getEffect(CraftNoTaizaiModMobEffects.HEAVY_METAL.get()).getAmplifier() : 0, false, false));
	}
}
