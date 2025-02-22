package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

public class HellBlazeProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get(), 130, 1, false, false));
	}
}
