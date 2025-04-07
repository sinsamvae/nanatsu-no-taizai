package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FourElementTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double a = 0;
		double r = 0;
		double b = 0;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).four_element) {
			r = 1.5;
			a = Math.random() * 12;
			b = 90;
			for (int index0 = 0; index0 < 30; index0++) {
				for (int index1 = 0; index1 < 16; index1++) {
					world.addParticle(ParticleTypes.WAX_ON, (x - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))), ((y + 1) - r * Math.sin(Math.toRadians(b))), (z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))), 0, 0,
							0);
					b = b + 12;
				}
				b = 90;
				a = a + 12;
			}
			if (entity.isOnFire()) {
				entity.clearFire();
			}
			if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(CraftNoTaizaiModMobEffects.FREEZE_COFFIN_POTION_EFFECT.get()) || entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(CraftNoTaizaiModMobEffects.FREZZE.get())
					|| entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(CraftNoTaizaiModMobEffects.STUF_EFFECT.get())) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftNoTaizaiModMobEffects.FREEZE_COFFIN_POTION_EFFECT.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftNoTaizaiModMobEffects.STUF_EFFECT.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftNoTaizaiModMobEffects.FREZZE.get());
			}
		}
	}
}
