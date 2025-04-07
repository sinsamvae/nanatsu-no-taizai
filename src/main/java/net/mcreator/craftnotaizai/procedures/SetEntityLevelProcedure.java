package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftnotaizai.entity.SliverDemonEntity;
import net.mcreator.craftnotaizai.entity.RedDemonGeckolibEntity;
import net.mcreator.craftnotaizai.entity.MuramoDemonFormEntity;
import net.mcreator.craftnotaizai.entity.GrayDemonEntityEntity;
import net.mcreator.craftnotaizai.entity.CopperDemonEntity;
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
		if (entity instanceof CopperDemonEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 160, 200)));
		}
		if (entity instanceof GrayDemonEntityEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 110, 140)));
		}
		if (entity instanceof SliverDemonEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 70, 90)));
		}
		if (entity instanceof RedDemonGeckolibEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 65, 90)));
		}
		if (entity instanceof BlueDemonEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 50, 90)));
		}
		if (entity instanceof AndreDemonFormEntity) {
			entity.getPersistentData().putDouble("level", 35);
		}
		if (entity instanceof MuramoDemonFormEntity) {
			entity.getPersistentData().putDouble("level", 35);
		}
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:hard")))) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 30, 35)));
		}
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:normal")))) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 25, 30)));
		}
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:weak")))) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 15, 20)));
		}
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:weakess")))) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 1, 10)));
		}
	}
}
