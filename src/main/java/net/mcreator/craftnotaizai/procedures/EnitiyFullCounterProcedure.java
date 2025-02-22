package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EnitiyFullCounterProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		double ran = 0;
		if (entity.getPersistentData().getBoolean("Full Counter")) {
			entity.getPersistentData().putDouble("FullCounterTimer", (entity.getPersistentData().getDouble("FullCounterTimer") + 1));
			if (entity.getPersistentData().getDouble("FullCounterTimer") > 160) {
				entity.getPersistentData().putDouble("FullCounterTimer", 0);
				entity.getPersistentData().putBoolean("Full Counter", false);
			}
		}
		if (entity.getPersistentData().getBoolean("Physical Full Counter")) {
			entity.getPersistentData().putDouble("FullCounterTimer", (entity.getPersistentData().getDouble("FullCounterTimer") + 1));
			if (entity.getPersistentData().getDouble("FullCounterTimer") > 160) {
				entity.getPersistentData().putDouble("FullCounterTimer", 0);
				entity.getPersistentData().putBoolean("Physical Full Counter", false);
			}
		}
	}
}
