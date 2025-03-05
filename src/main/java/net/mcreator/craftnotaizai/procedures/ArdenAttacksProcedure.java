package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;
import net.mcreator.craftnotaizai.entity.ArdenEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ArdenAttacksProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof ArdenEntity && !(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CraftNoTaizaiModMobEffects.VEIN_POTION_EFFECT.get()))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.VEIN_POTION_EFFECT.get(), 200, 1, false, false));
		}
	}
}
