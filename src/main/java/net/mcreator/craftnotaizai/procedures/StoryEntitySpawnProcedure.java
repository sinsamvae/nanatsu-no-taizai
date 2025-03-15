package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.ZeldrisStoryEntity;
import net.mcreator.craftnotaizai.entity.TwigoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.StoryBanAnimatedEntity;
import net.mcreator.craftnotaizai.entity.StoryBan2AnimatedEntity;
import net.mcreator.craftnotaizai.entity.StoneDroleEntity;
import net.mcreator.craftnotaizai.entity.RuinAnimatedEntity;
import net.mcreator.craftnotaizai.entity.MonspeitStoryEntity;
import net.mcreator.craftnotaizai.entity.MonspeitStory2Entity;
import net.mcreator.craftnotaizai.entity.MelasculaStoryEntity;
import net.mcreator.craftnotaizai.entity.KingStory1Entity;
import net.mcreator.craftnotaizai.entity.JerichoDemonFormEntity;
import net.mcreator.craftnotaizai.entity.JerichoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HowzerAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HendricksonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HelbremAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GuilaDemonanimatedEntity;
import net.mcreator.craftnotaizai.entity.GuilaAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GriamoreAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GrayRoadStoryEntity;
import net.mcreator.craftnotaizai.entity.GrayRoadStory2Entity;
import net.mcreator.craftnotaizai.entity.GrayDemonHendricksonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GowtherStory1Entity;
import net.mcreator.craftnotaizai.entity.GowtherEP18Entity;
import net.mcreator.craftnotaizai.entity.GolgiusAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GloxiniaStoryEntity;
import net.mcreator.craftnotaizai.entity.GloxiniaStory2Entity;
import net.mcreator.craftnotaizai.entity.GilThunderAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GilThunderAnimated2Entity;
import net.mcreator.craftnotaizai.entity.GerheadeservantEntity;
import net.mcreator.craftnotaizai.entity.GalandStory2Entity;
import net.mcreator.craftnotaizai.entity.GalandOverEntity;
import net.mcreator.craftnotaizai.entity.GalandEntity;
import net.mcreator.craftnotaizai.entity.FriesiaAnimatedEntity;
import net.mcreator.craftnotaizai.entity.FraudrinStoryEntity;
import net.mcreator.craftnotaizai.entity.FairyHelbremAnimatedEntity;
import net.mcreator.craftnotaizai.entity.EstarrossaStoryEntity;
import net.mcreator.craftnotaizai.entity.EstarossaStoryEntity;
import net.mcreator.craftnotaizai.entity.ElaineStoryEntity;
import net.mcreator.craftnotaizai.entity.DroleStory2Entity;
import net.mcreator.craftnotaizai.entity.DroleEntity;
import net.mcreator.craftnotaizai.entity.DreyfusDemonEntity;
import net.mcreator.craftnotaizai.entity.DreyfusAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DogedoEntity;
import net.mcreator.craftnotaizai.entity.DianeAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DemonHendricksonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DeireriStoryEntity;
import net.mcreator.craftnotaizai.entity.DeireriStory2Entity;
import net.mcreator.craftnotaizai.entity.DeadHelbramanimatedEntity;
import net.mcreator.craftnotaizai.entity.DalefinalEntity;
import net.mcreator.craftnotaizai.entity.DaleSecEntity;
import net.mcreator.craftnotaizai.entity.DaleArmoredEntity;
import net.mcreator.craftnotaizai.entity.CainBarzadAnimatedEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StoryEntitySpawnProcedure {
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
		if (!(entity instanceof Player)) {
			if (entity instanceof TwigoAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 5);
			}
			if (entity instanceof GilThunderAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 7);
			}
			if (entity instanceof GolgiusAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 10);
			}
			if (entity instanceof DianeAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 12);
			}
			if (entity instanceof FriesiaAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 15);
			}
			if (entity instanceof RuinAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 17);
			}
			if (entity instanceof GuilaAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 20);
			}
			if (entity instanceof GriamoreAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 22);
			}
			if (entity instanceof HowzerAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 25);
			}
			if (entity instanceof CainBarzadAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 27);
			}
			if (entity instanceof StoryBanAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 30);
			}
			if (entity instanceof JerichoAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 32);
			}
			if (entity instanceof GuilaDemonanimatedEntity) {
				entity.getPersistentData().putDouble("level", 35);
			}
			if (entity instanceof HelbremAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 37);
			}
			if (entity instanceof DaleArmoredEntity) {
				entity.getPersistentData().putDouble("level", 40);
			}
			if (entity instanceof DaleSecEntity) {
				entity.getPersistentData().putDouble("level", 40);
			}
			if (entity instanceof DalefinalEntity) {
				entity.getPersistentData().putDouble("level", 40);
			}
			if (entity instanceof FairyHelbremAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 42);
			}
			if (entity instanceof DreyfusAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 45);
			}
			if (entity instanceof GilThunderAnimated2Entity) {
				entity.getPersistentData().putDouble("level", 47);
			}
			if (entity instanceof HendricksonAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 47);
			}
			if (entity instanceof JerichoDemonFormEntity) {
				entity.getPersistentData().putDouble("level", 50);
			}
			if (entity instanceof DeadHelbramanimatedEntity) {
				entity.getPersistentData().putDouble("level", 52);
			}
			if (entity instanceof StoryBan2AnimatedEntity) {
				entity.getPersistentData().putDouble("level", 55);
			}
			if (entity instanceof DemonHendricksonAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 57);
			}
			if (entity instanceof GrayDemonHendricksonAnimatedEntity) {
				entity.getPersistentData().putDouble("level", 60);
			}
			if (entity instanceof DogedoEntity) {
				entity.getPersistentData().putDouble("level", 60);
			}
			if (entity instanceof GowtherStory1Entity) {
				entity.getPersistentData().putDouble("level", 62);
			}
			if (entity instanceof GalandEntity) {
				entity.getPersistentData().putDouble("level", 63);
			}
			if (entity instanceof KingStory1Entity) {
				entity.getPersistentData().putDouble("level", 65);
			}
			if (entity instanceof GalandStory2Entity) {
				entity.getPersistentData().putDouble("level", 67);
			}
			if (entity instanceof ElaineStoryEntity) {
				entity.getPersistentData().putDouble("level", 70);
			}
			if (entity instanceof GalandOverEntity) {
				entity.getPersistentData().putDouble("level", 72);
			}
			if (entity instanceof GerheadeservantEntity) {
				entity.getPersistentData().putDouble("level", 75);
			}
			if (entity instanceof StoneDroleEntity) {
				entity.getPersistentData().putDouble("level", 75);
			}
			if (entity instanceof GowtherEP18Entity) {
				entity.getPersistentData().putDouble("level", 77);
			}
			if (entity instanceof GloxiniaStoryEntity) {
				entity.getPersistentData().putDouble("level", 80);
			}
			if (entity instanceof DroleEntity) {
				entity.getPersistentData().putDouble("level", 80);
			}
			if (entity instanceof DeireriStoryEntity || entity instanceof MonspeitStoryEntity || entity instanceof DroleStory2Entity || entity instanceof GloxiniaStory2Entity || entity instanceof GrayRoadStoryEntity
					|| entity instanceof EstarossaStoryEntity || entity instanceof ZeldrisStoryEntity || entity instanceof DreyfusDemonEntity || entity instanceof MelasculaStoryEntity) {
				entity.getPersistentData().putDouble("level", 82);
			}
			if (entity instanceof EstarrossaStoryEntity) {
				entity.getPersistentData().putDouble("level", 85);
			}
			if (entity instanceof DeireriStory2Entity) {
				entity.getPersistentData().putDouble("level", 87);
			}
			if (entity instanceof MonspeitStory2Entity) {
				entity.getPersistentData().putDouble("level", 90);
			}
			if (entity instanceof GrayRoadStory2Entity) {
				entity.getPersistentData().putDouble("level", 92);
			}
			if (entity instanceof FraudrinStoryEntity) {
				entity.getPersistentData().putDouble("level", 95);
			}
		}
	}
}
