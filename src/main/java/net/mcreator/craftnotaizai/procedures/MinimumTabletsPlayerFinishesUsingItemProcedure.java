package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

public class MinimumTabletsPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.MINIMUM_TABLETS_EFFECT.get(), 12000, 1, false, false));
		itemstack.shrink(1);
	}
}
