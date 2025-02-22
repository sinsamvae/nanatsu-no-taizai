package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof WaterAnimal && ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:capitalofthe_dead"))
				|| (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:tower_of_trails"))
				|| (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:istar"))
				|| (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:purgatory"))
				|| (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:cave_training")))) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
