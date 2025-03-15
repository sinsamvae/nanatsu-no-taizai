package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.entity.RedDemonGeckolibEntity;
import net.mcreator.craftnotaizai.entity.MuramoDemonFormEntity;
import net.mcreator.craftnotaizai.entity.GrayDemonEntityEntity;
import net.mcreator.craftnotaizai.entity.BlueDemonEntity;
import net.mcreator.craftnotaizai.entity.AndreDemonFormEntity;
import net.mcreator.craftnotaizai.entity.AlbionTallEntity;
import net.mcreator.craftnotaizai.entity.AlbionFatEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetEntityLevelProcedure {
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
		if (entity instanceof AlbionTallEntity) {
			entity.getPersistentData().putDouble("level", 250);
		}
		if (entity instanceof AlbionFatEntity) {
			entity.getPersistentData().putDouble("level", 250);
		}
		if (entity instanceof GrayDemonEntityEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 110, 140)));
		}
		if (entity instanceof RedDemonGeckolibEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 65, 90)));
		}
		if (entity instanceof BlueDemonEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 50, 90)));
		}
		if (entity instanceof AndreDemonFormEntity) {
			entity.getPersistentData().putDouble("level", 40);
		}
		if (entity instanceof MuramoDemonFormEntity) {
			entity.getPersistentData().putDouble("level", 40);
		}
	}
}
