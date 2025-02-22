package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class GlowMugPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(
					new MobEffectInstance(MobEffects.CONFUSION, 1200, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.CONFUSION) ? _livEnt.getEffect(MobEffects.CONFUSION).getAmplifier() : 0) + 2), false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.MANA_REGEN_EFFET.get(), 1200,
					(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftNoTaizaiModMobEffects.MANA_REGEN_EFFET.get()) ? _livEnt.getEffect(CraftNoTaizaiModMobEffects.MANA_REGEN_EFFET.get()).getAmplifier() : 0) + 1), false,
					false));
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(CraftNoTaizaiModItems.EMPTY_MUG.get()).copy();
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
	}
}
