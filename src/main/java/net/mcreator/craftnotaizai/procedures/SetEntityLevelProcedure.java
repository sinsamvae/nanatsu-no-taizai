package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.entity.ZhivagoEntity;
import net.mcreator.craftnotaizai.entity.ZaratrasEntity;
import net.mcreator.craftnotaizai.entity.WeinheidtAnimatedEntity;
import net.mcreator.craftnotaizai.entity.WailioEntity;
import net.mcreator.craftnotaizai.entity.VivianAnimatedEntity;
import net.mcreator.craftnotaizai.entity.TyrantDragonEntity;
import net.mcreator.craftnotaizai.entity.TyrantDragonCaveEntity;
import net.mcreator.craftnotaizai.entity.TrollEntity;
import net.mcreator.craftnotaizai.entity.SwordWolfEntity;
import net.mcreator.craftnotaizai.entity.SoldierAnimatedEntity;
import net.mcreator.craftnotaizai.entity.SmallHawksEntity;
import net.mcreator.craftnotaizai.entity.SladerAnimatedEntity;
import net.mcreator.craftnotaizai.entity.SimonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RoyalGurardAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RoyalGuardAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RedKnightAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RedDemonGeckolibEntity;
import net.mcreator.craftnotaizai.entity.PuoraEntity;
import net.mcreator.craftnotaizai.entity.ParadaAnimatedEntity;
import net.mcreator.craftnotaizai.entity.MutilatorRabbitsEntity;
import net.mcreator.craftnotaizai.entity.MuramoDemonFormEntity;
import net.mcreator.craftnotaizai.entity.MuramoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.MossDragonEntity;
import net.mcreator.craftnotaizai.entity.MatronaEntity;
import net.mcreator.craftnotaizai.entity.MarmasEntity;
import net.mcreator.craftnotaizai.entity.MantaEntity;
import net.mcreator.craftnotaizai.entity.KulumilEntity;
import net.mcreator.craftnotaizai.entity.JillianAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HugoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HideAndSeekEntity;
import net.mcreator.craftnotaizai.entity.HawksEntity;
import net.mcreator.craftnotaizai.entity.GustafAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GreenKnightAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GrayDemonEntityEntity;
import net.mcreator.craftnotaizai.entity.GerheadeEntity;
import net.mcreator.craftnotaizai.entity.GeckolibKrakenEntity;
import net.mcreator.craftnotaizai.entity.EarthCrawlerEntity;
import net.mcreator.craftnotaizai.entity.DuskBison1Entity;
import net.mcreator.craftnotaizai.entity.DumblebbasAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DeldryEntity;
import net.mcreator.craftnotaizai.entity.DeathpierceEntity;
import net.mcreator.craftnotaizai.entity.ClayDragonEntity;
import net.mcreator.craftnotaizai.entity.ChickenEntity;
import net.mcreator.craftnotaizai.entity.CathEntity;
import net.mcreator.craftnotaizai.entity.BlueDemonEntity;
import net.mcreator.craftnotaizai.entity.BlackHoundEntity;
import net.mcreator.craftnotaizai.entity.AngleCureEntity;
import net.mcreator.craftnotaizai.entity.AndreDemonFormEntity;
import net.mcreator.craftnotaizai.entity.AndreAnimatedEntity;
import net.mcreator.craftnotaizai.entity.AnaonEntity;
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
		if (entity instanceof CathEntity) {
			entity.getPersistentData().putDouble("level", 40);
		}
		if (entity instanceof TyrantDragonCaveEntity) {
			entity.getPersistentData().putDouble("level", 40);
		}
		if (entity instanceof TyrantDragonEntity) {
			entity.getPersistentData().putDouble("level", 40);
		}
		if (entity instanceof TrollEntity) {
			entity.getPersistentData().putDouble("level", 39);
		}
		if (entity instanceof MossDragonEntity) {
			entity.getPersistentData().putDouble("level", 38);
		}
		if (entity instanceof ClayDragonEntity) {
			entity.getPersistentData().putDouble("level", 38);
		}
		if (entity instanceof AnaonEntity) {
			entity.getPersistentData().putDouble("level", 37);
		}
		if (entity instanceof EarthCrawlerEntity) {
			entity.getPersistentData().putDouble("level", 37);
		}
		if (entity instanceof ZaratrasEntity) {
			entity.getPersistentData().putDouble("level", 37);
		}
		if (entity instanceof DeathpierceEntity) {
			entity.getPersistentData().putDouble("level", 37);
		}
		if (entity instanceof GustafAnimatedEntity) {
			entity.getPersistentData().putDouble("level", 36);
		}
		if (entity instanceof VivianAnimatedEntity) {
			entity.getPersistentData().putDouble("level", 36);
		}
		if (entity instanceof SladerAnimatedEntity) {
			entity.getPersistentData().putDouble("level", 36);
		}
		if (entity instanceof GreenKnightAnimatedEntity) {
			entity.getPersistentData().putDouble("level", 35);
		}
		if (entity instanceof RedKnightAnimatedEntity) {
			entity.getPersistentData().putDouble("level", 35);
		}
		if (entity instanceof SimonAnimatedEntity) {
			entity.getPersistentData().putDouble("level", 35);
		}
		if (entity instanceof AndreAnimatedEntity) {
			entity.getPersistentData().putDouble("level", 34);
		}
		if (entity instanceof DeldryEntity) {
			entity.getPersistentData().putDouble("level", 34);
		}
		if (entity instanceof JillianAnimatedEntity) {
			entity.getPersistentData().putDouble("level", 34);
		}
		if (entity instanceof HugoAnimatedEntity) {
			entity.getPersistentData().putDouble("level", 34);
		}
		if (entity instanceof WeinheidtAnimatedEntity) {
			entity.getPersistentData().putDouble("level", 34);
		}
		if (entity instanceof DuskBison1Entity) {
			entity.getPersistentData().putDouble("level", 34);
		}
		if (entity instanceof WailioEntity) {
			entity.getPersistentData().putDouble("level", 33);
		}
		if (entity instanceof MarmasEntity) {
			entity.getPersistentData().putDouble("level", 33);
		}
		if (entity instanceof SwordWolfEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 15, 16)));
		}
		if (entity instanceof BlackHoundEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 15, 16)));
		}
		if (entity instanceof AngleCureEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 13, 14)));
		}
		if (entity instanceof MatronaEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 13, 14)));
		}
		if (entity instanceof DumblebbasAnimatedEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 12, 13)));
		}
		if (entity instanceof ZhivagoEntity) {
			entity.getPersistentData().putDouble("level", 12);
		}
		if (entity instanceof GeckolibKrakenEntity) {
			entity.getPersistentData().putDouble("level", 12);
		}
		if (entity instanceof MuramoAnimatedEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 10, 11)));
		}
		if (entity instanceof AndreAnimatedEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 10, 11)));
		}
		if (entity instanceof ParadaAnimatedEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 9, 10)));
		}
		if (entity instanceof SoldierAnimatedEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 9, 10)));
		}
		if (entity instanceof MutilatorRabbitsEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 9, 10)));
		}
		if (entity instanceof ChickenEntity) {
			entity.getPersistentData().putDouble("level", 8);
		}
		if (entity instanceof RoyalGuardAnimatedEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 7, 7)));
		}
		if (entity instanceof RoyalGurardAnimatedEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 7, 7)));
		}
		if (entity instanceof GerheadeEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 6, 7)));
		}
		if (entity instanceof HideAndSeekEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 6, 7)));
		}
		if (entity instanceof HawksEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 5, 6)));
		}
		if (entity instanceof SmallHawksEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 5, 6)));
		}
		if (entity instanceof PuoraEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 3, 4)));
		}
		if (entity instanceof KulumilEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 3, 4)));
		}
		if (entity instanceof MantaEntity) {
			entity.getPersistentData().putDouble("level", (Mth.nextInt(RandomSource.create(), 1, 2)));
		}
	}
}
