
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.ZhivagoEntity;
import net.mcreator.craftnotaizai.entity.ZeldrisStoryEntity;
import net.mcreator.craftnotaizai.entity.ZaneriEntity;
import net.mcreator.craftnotaizai.entity.WindShotProjectileEntity;
import net.mcreator.craftnotaizai.entity.WickedBiteEntity;
import net.mcreator.craftnotaizai.entity.WhirlShockProjectileEntity;
import net.mcreator.craftnotaizai.entity.WeinheidtAnimatedEntity;
import net.mcreator.craftnotaizai.entity.WailioEntity;
import net.mcreator.craftnotaizai.entity.VivianAnimatedEntity;
import net.mcreator.craftnotaizai.entity.VineEntity;
import net.mcreator.craftnotaizai.entity.TyrantDragonEntity;
import net.mcreator.craftnotaizai.entity.TyrantDragonCaveEntity;
import net.mcreator.craftnotaizai.entity.TwigoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.TrollEntity;
import net.mcreator.craftnotaizai.entity.TorahEntity;
import net.mcreator.craftnotaizai.entity.TheoEntity;
import net.mcreator.craftnotaizai.entity.TallAlbionEntity;
import net.mcreator.craftnotaizai.entity.TaizooAnimatedEntity;
import net.mcreator.craftnotaizai.entity.SwordWolfEntity;
import net.mcreator.craftnotaizai.entity.SuperSlashEntity;
import net.mcreator.craftnotaizai.entity.SunflowerEntity;
import net.mcreator.craftnotaizai.entity.SunFlowerTrueSpirtSpearEntity;
import net.mcreator.craftnotaizai.entity.StoryBanAnimatedEntity;
import net.mcreator.craftnotaizai.entity.StoryBan2AnimatedEntity;
import net.mcreator.craftnotaizai.entity.StoneDroleEntity;
import net.mcreator.craftnotaizai.entity.SoyokazenoGekirinProjectileEntity;
import net.mcreator.craftnotaizai.entity.SoldierAnimatedEntity;
import net.mcreator.craftnotaizai.entity.SnowflowerbeamProjectileEntity;
import net.mcreator.craftnotaizai.entity.SmallHawksEntity;
import net.mcreator.craftnotaizai.entity.SladerAnimatedEntity;
import net.mcreator.craftnotaizai.entity.SimonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.ServantEntity;
import net.mcreator.craftnotaizai.entity.RuinAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RoyalGurardAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RoyalGuardAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RockRushProjectileEntity;
import net.mcreator.craftnotaizai.entity.RisingMeteorEntity;
import net.mcreator.craftnotaizai.entity.RedKnightAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RedDemonGeckolibEntity;
import net.mcreator.craftnotaizai.entity.ReaperScytheEntityEntity;
import net.mcreator.craftnotaizai.entity.RakanProjectileEntity;
import net.mcreator.craftnotaizai.entity.PurgatoryVenomProjectileEntity;
import net.mcreator.craftnotaizai.entity.PuoraEntity;
import net.mcreator.craftnotaizai.entity.PollenGardenEntity;
import net.mcreator.craftnotaizai.entity.PhysicalCloneEntity;
import net.mcreator.craftnotaizai.entity.ParadaAnimatedEntity;
import net.mcreator.craftnotaizai.entity.PainEditionEntity;
import net.mcreator.craftnotaizai.entity.OminousNebulaEnitiyEntity;
import net.mcreator.craftnotaizai.entity.NoroiNoKoeEntity;
import net.mcreator.craftnotaizai.entity.MutilatorRabbitsEntity;
import net.mcreator.craftnotaizai.entity.MuramoDemonFormEntity;
import net.mcreator.craftnotaizai.entity.MuramoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.MossDragonEntity;
import net.mcreator.craftnotaizai.entity.MoonRoseEntity;
import net.mcreator.craftnotaizai.entity.MonspeitStoryEntity;
import net.mcreator.craftnotaizai.entity.MonspeitStory2Entity;
import net.mcreator.craftnotaizai.entity.MerlinBossAnimatedEntity;
import net.mcreator.craftnotaizai.entity.MeliodasBossAnimatedEntity;
import net.mcreator.craftnotaizai.entity.MatronaEntity;
import net.mcreator.craftnotaizai.entity.MarmasEntity;
import net.mcreator.craftnotaizai.entity.MantaEntity;
import net.mcreator.craftnotaizai.entity.ManpuunoGekirinProjectileEntity;
import net.mcreator.craftnotaizai.entity.LuigiEntity;
import net.mcreator.craftnotaizai.entity.LightningbeastProjectileEntity;
import net.mcreator.craftnotaizai.entity.LetThereBeLightEntity;
import net.mcreator.craftnotaizai.entity.KulumilEntity;
import net.mcreator.craftnotaizai.entity.KingStory1Entity;
import net.mcreator.craftnotaizai.entity.KingBossAnimatedEntity;
import net.mcreator.craftnotaizai.entity.KillSwitchProjectileEntity;
import net.mcreator.craftnotaizai.entity.KamichigiriProjectileEntity;
import net.mcreator.craftnotaizai.entity.KaleidoscopeEntityEntity;
import net.mcreator.craftnotaizai.entity.JumanjuEntityEntity;
import net.mcreator.craftnotaizai.entity.JillianAnimatedEntity;
import net.mcreator.craftnotaizai.entity.JigumoEntity;
import net.mcreator.craftnotaizai.entity.JethammerProjectileEntity;
import net.mcreator.craftnotaizai.entity.JerichoDemonFormEntity;
import net.mcreator.craftnotaizai.entity.JerichoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.JennaEntity;
import net.mcreator.craftnotaizai.entity.InsectEntity;
import net.mcreator.craftnotaizai.entity.InfernoIncantationEntity;
import net.mcreator.craftnotaizai.entity.IncreaseTrueSpiritSpearProjectileEntity;
import net.mcreator.craftnotaizai.entity.IncreaseProjectileEntity;
import net.mcreator.craftnotaizai.entity.IceBulletsEntity;
import net.mcreator.craftnotaizai.entity.IceAnchorEntity;
import net.mcreator.craftnotaizai.entity.HunterWispProjectileEntity;
import net.mcreator.craftnotaizai.entity.HugoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HowzerAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HideAndSeekEntity;
import net.mcreator.craftnotaizai.entity.HendricksonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HellblazeOmegaProjectileEntity;
import net.mcreator.craftnotaizai.entity.HellGateRedDemonsEntity;
import net.mcreator.craftnotaizai.entity.HellFireBirdEntity;
import net.mcreator.craftnotaizai.entity.HellBlazeProjectileEntity;
import net.mcreator.craftnotaizai.entity.HelbremAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HelbramSwordEntity;
import net.mcreator.craftnotaizai.entity.HawksEntity;
import net.mcreator.craftnotaizai.entity.GustafAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GuilaDemonanimatedEntity;
import net.mcreator.craftnotaizai.entity.GuilaAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GuardianTrueSpirtSpearEntity;
import net.mcreator.craftnotaizai.entity.Guardian1Entity;
import net.mcreator.craftnotaizai.entity.GriamoreAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GreenKnightAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GrayRoadStoryEntity;
import net.mcreator.craftnotaizai.entity.GrayRoadStory2Entity;
import net.mcreator.craftnotaizai.entity.GrayDemonHendricksonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GrayDemonEntityEntity;
import net.mcreator.craftnotaizai.entity.GrayDemonEntity;
import net.mcreator.craftnotaizai.entity.GowtherStory1Entity;
import net.mcreator.craftnotaizai.entity.GowtherEP18Entity;
import net.mcreator.craftnotaizai.entity.GowtherBossAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GolgiusAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GoddessBlessEntityEntity;
import net.mcreator.craftnotaizai.entity.GloxiniaStoryEntity;
import net.mcreator.craftnotaizai.entity.GloxiniaStory2Entity;
import net.mcreator.craftnotaizai.entity.GloxinaBossEntity;
import net.mcreator.craftnotaizai.entity.GilThunderAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GilThunderAnimated2Entity;
import net.mcreator.craftnotaizai.entity.GigaPickEntity;
import net.mcreator.craftnotaizai.entity.GigaFallEntity;
import net.mcreator.craftnotaizai.entity.GigaCrushEntity;
import net.mcreator.craftnotaizai.entity.GerheadeservantEntity;
import net.mcreator.craftnotaizai.entity.GerheadeEntity;
import net.mcreator.craftnotaizai.entity.GeckolibKrakenEntity;
import net.mcreator.craftnotaizai.entity.GalandStory2Entity;
import net.mcreator.craftnotaizai.entity.GalandOverEntity;
import net.mcreator.craftnotaizai.entity.GalandEntity;
import net.mcreator.craftnotaizai.entity.FurkuuSutonEntity;
import net.mcreator.craftnotaizai.entity.FrozenBreathEntity;
import net.mcreator.craftnotaizai.entity.FriesiaAnimatedEntity;
import net.mcreator.craftnotaizai.entity.FraudrinStoryEntity;
import net.mcreator.craftnotaizai.entity.FossProjectileEntity;
import net.mcreator.craftnotaizai.entity.FiveLostProjectileEntity;
import net.mcreator.craftnotaizai.entity.FinalProminenceEntity;
import net.mcreator.craftnotaizai.entity.FightingAreaEntity;
import net.mcreator.craftnotaizai.entity.FakeBallProjectileEntity;
import net.mcreator.craftnotaizai.entity.FairyHelbremAnimatedEntity;
import net.mcreator.craftnotaizai.entity.ExterminateRayProjectileEntity;
import net.mcreator.craftnotaizai.entity.EvilhoundProjectileEntity;
import net.mcreator.craftnotaizai.entity.EstarrossaStoryEntity;
import net.mcreator.craftnotaizai.entity.EstarossaStoryEntity;
import net.mcreator.craftnotaizai.entity.EscanorBossEntity;
import net.mcreator.craftnotaizai.entity.EnergyArrowEntity;
import net.mcreator.craftnotaizai.entity.EmbraceoftheThunderGodProjectileEntity;
import net.mcreator.craftnotaizai.entity.ElaineStoryEntity;
import net.mcreator.craftnotaizai.entity.ElaineEntity;
import net.mcreator.craftnotaizai.entity.EarthGolemEntity;
import net.mcreator.craftnotaizai.entity.EarthCrawlerEntity;
import net.mcreator.craftnotaizai.entity.DuskBison1Entity;
import net.mcreator.craftnotaizai.entity.DumblebbasAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DubsEntity;
import net.mcreator.craftnotaizai.entity.DroleStory2Entity;
import net.mcreator.craftnotaizai.entity.DroleEntity;
import net.mcreator.craftnotaizai.entity.DriftBombProjectileEntity;
import net.mcreator.craftnotaizai.entity.DreyfusDemonEntity;
import net.mcreator.craftnotaizai.entity.DreyfusAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DogedoEntity;
import net.mcreator.craftnotaizai.entity.DivineSlashEntity;
import net.mcreator.craftnotaizai.entity.DianeBossAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DianeAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DiamondTowerEntity;
import net.mcreator.craftnotaizai.entity.DestroyFourElementsEntity;
import net.mcreator.craftnotaizai.entity.DespairVenomEntity;
import net.mcreator.craftnotaizai.entity.DemonMarkMeliodasEntity;
import net.mcreator.craftnotaizai.entity.DemonKingEntity;
import net.mcreator.craftnotaizai.entity.DemonHendricksonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DeldryEntity;
import net.mcreator.craftnotaizai.entity.DeireriStoryEntity;
import net.mcreator.craftnotaizai.entity.DeireriStory2Entity;
import net.mcreator.craftnotaizai.entity.DeathpierceEntity;
import net.mcreator.craftnotaizai.entity.DeathThornEntity;
import net.mcreator.craftnotaizai.entity.DeadHelbramanimatedEntity;
import net.mcreator.craftnotaizai.entity.DeadEndEntity;
import net.mcreator.craftnotaizai.entity.DalefinalEntity;
import net.mcreator.craftnotaizai.entity.DaleSecEntity;
import net.mcreator.craftnotaizai.entity.DaleArmoredEntity;
import net.mcreator.craftnotaizai.entity.CruelSunProjectileEntity;
import net.mcreator.craftnotaizai.entity.CrazyProminenceEntity;
import net.mcreator.craftnotaizai.entity.CondensePowerProjectileEntity;
import net.mcreator.craftnotaizai.entity.CocoonOfDarknessEntity;
import net.mcreator.craftnotaizai.entity.CloverEntity;
import net.mcreator.craftnotaizai.entity.ClayDragonEntity;
import net.mcreator.craftnotaizai.entity.ChickenEntity;
import net.mcreator.craftnotaizai.entity.ChastiefolTrueSpirtSpearEntity;
import net.mcreator.craftnotaizai.entity.ChainExplosionV2Entity;
import net.mcreator.craftnotaizai.entity.CathEntity;
import net.mcreator.craftnotaizai.entity.CannonEntity;
import net.mcreator.craftnotaizai.entity.CainBarzadAnimatedEntity;
import net.mcreator.craftnotaizai.entity.BusterIceEntity;
import net.mcreator.craftnotaizai.entity.BulletSquallEntity;
import net.mcreator.craftnotaizai.entity.BrilliantDetonationProjectileEntity;
import net.mcreator.craftnotaizai.entity.BreakthroughProjectileEntity;
import net.mcreator.craftnotaizai.entity.BreakableBugProjectileEntity;
import net.mcreator.craftnotaizai.entity.BlueDemonEntity;
import net.mcreator.craftnotaizai.entity.BlazeProjectileEntity;
import net.mcreator.craftnotaizai.entity.BlackOutProjectileEntity;
import net.mcreator.craftnotaizai.entity.BlackOutEntity;
import net.mcreator.craftnotaizai.entity.BlackHoundEntity;
import net.mcreator.craftnotaizai.entity.BasquiasProjectileEntity;
import net.mcreator.craftnotaizai.entity.BasquiasGuardianEntity;
import net.mcreator.craftnotaizai.entity.BanBossAnimatedEntity;
import net.mcreator.craftnotaizai.entity.AuraBurstEntity;
import net.mcreator.craftnotaizai.entity.AshDragonEntity;
import net.mcreator.craftnotaizai.entity.AngleCureEntity;
import net.mcreator.craftnotaizai.entity.AndreDemonFormEntity;
import net.mcreator.craftnotaizai.entity.AndreAnimatedEntity;
import net.mcreator.craftnotaizai.entity.AnaonEntity;
import net.mcreator.craftnotaizai.entity.AlbionTallEntity;
import net.mcreator.craftnotaizai.entity.AlbionFatEntity;
import net.mcreator.craftnotaizai.entity.AlbionEntity;
import net.mcreator.craftnotaizai.entity.AealHealEntity;
import net.mcreator.craftnotaizai.entity.AcidTwowerMobEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftNoTaizaiModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<EntityType<RisingMeteorEntity>> RISING_METEOR = register("rising_meteor", EntityType.Builder.<RisingMeteorEntity>of(RisingMeteorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RisingMeteorEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PollenGardenEntity>> POLLEN_GARDEN = register("pollen_garden", EntityType.Builder.<PollenGardenEntity>of(PollenGardenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PollenGardenEntity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<SunflowerEntity>> SUNFLOWER = register("sunflower",
			EntityType.Builder.<SunflowerEntity>of(SunflowerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SunflowerEntity::new).fireImmune().sized(1.7f, 2f));
	public static final RegistryObject<EntityType<MantaEntity>> MANTA = register("manta",
			EntityType.Builder.<MantaEntity>of(MantaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MantaEntity::new)

					.sized(3f, 0.65f));
	public static final RegistryObject<EntityType<ChickenEntity>> CHICKEN = register("chicken",
			EntityType.Builder.<ChickenEntity>of(ChickenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChickenEntity::new)

					.sized(2.5f, 4.5f));
	public static final RegistryObject<EntityType<GeckolibKrakenEntity>> GECKOLIB_KRAKEN = register("geckolib_kraken",
			EntityType.Builder.<GeckolibKrakenEntity>of(GeckolibKrakenEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GeckolibKrakenEntity::new)

					.sized(2f, 7f));
	public static final RegistryObject<EntityType<RedDemonGeckolibEntity>> RED_DEMON_GECKOLIB = register("red_demon_geckolib",
			EntityType.Builder.<RedDemonGeckolibEntity>of(RedDemonGeckolibEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedDemonGeckolibEntity::new)

					.sized(2.5f, 4.6f));
	public static final RegistryObject<EntityType<Guardian1Entity>> GUARDIAN_1 = register("guardian_1",
			EntityType.Builder.<Guardian1Entity>of(Guardian1Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Guardian1Entity::new).fireImmune().sized(2f, 5f));
	public static final RegistryObject<EntityType<HawksEntity>> HAWKS = register("hawks",
			EntityType.Builder.<HawksEntity>of(HawksEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HawksEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<BlackHoundEntity>> BLACK_HOUND = register("black_hound",
			EntityType.Builder.<BlackHoundEntity>of(BlackHoundEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackHoundEntity::new)

					.sized(1.4f, 1.6f));
	public static final RegistryObject<EntityType<SwordWolfEntity>> SWORD_WOLF = register("sword_wolf",
			EntityType.Builder.<SwordWolfEntity>of(SwordWolfEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SwordWolfEntity::new)

					.sized(1.5f, 1.8f));
	public static final RegistryObject<EntityType<DaleArmoredEntity>> DALE_ARMORED = register("dale_armored",
			EntityType.Builder.<DaleArmoredEntity>of(DaleArmoredEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DaleArmoredEntity::new)

					.sized(1.2f, 5.5f));
	public static final RegistryObject<EntityType<DaleSecEntity>> DALE_SEC = register("dale_sec",
			EntityType.Builder.<DaleSecEntity>of(DaleSecEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DaleSecEntity::new)

					.sized(1.2f, 5.5f));
	public static final RegistryObject<EntityType<DalefinalEntity>> DALEFINAL = register("dalefinal",
			EntityType.Builder.<DalefinalEntity>of(DalefinalEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DalefinalEntity::new)

					.sized(1.2f, 5.5f));
	public static final RegistryObject<EntityType<ElaineEntity>> ELAINE = register("elaine",
			EntityType.Builder.<ElaineEntity>of(ElaineEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ElaineEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InsectEntity>> INSECT = register("insect",
			EntityType.Builder.<InsectEntity>of(InsectEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InsectEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<BlazeProjectileEntity>> BLAZE_PROJECTILE = register("blaze_projectile", EntityType.Builder.<BlazeProjectileEntity>of(BlazeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BlazeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ManpuunoGekirinProjectileEntity>> MANPUUNO_GEKIRIN_PROJECTILE = register("manpuuno_gekirin_projectile",
			EntityType.Builder.<ManpuunoGekirinProjectileEntity>of(ManpuunoGekirinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ManpuunoGekirinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SoyokazenoGekirinProjectileEntity>> SOYOKAZENO_GEKIRIN_PROJECTILE = register("soyokazeno_gekirin_projectile",
			EntityType.Builder.<SoyokazenoGekirinProjectileEntity>of(SoyokazenoGekirinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SoyokazenoGekirinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HellBlazeProjectileEntity>> HELL_BLAZE_PROJECTILE = register("hell_blaze_projectile", EntityType.Builder.<HellBlazeProjectileEntity>of(HellBlazeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HellBlazeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HellblazeOmegaProjectileEntity>> HELLBLAZE_OMEGA_PROJECTILE = register("hellblaze_omega_projectile",
			EntityType.Builder.<HellblazeOmegaProjectileEntity>of(HellblazeOmegaProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(HellblazeOmegaProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RockRushProjectileEntity>> ROCK_RUSH_PROJECTILE = register("rock_rush_projectile", EntityType.Builder.<RockRushProjectileEntity>of(RockRushProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RockRushProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EvilhoundProjectileEntity>> EVILHOUND_PROJECTILE = register("evilhound_projectile", EntityType.Builder.<EvilhoundProjectileEntity>of(EvilhoundProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(EvilhoundProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WhirlShockProjectileEntity>> WHIRL_SHOCK_PROJECTILE = register("whirl_shock_projectile", EntityType.Builder.<WhirlShockProjectileEntity>of(WhirlShockProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WhirlShockProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BreakthroughProjectileEntity>> BREAKTHROUGH_PROJECTILE = register("breakthrough_projectile", EntityType.Builder.<BreakthroughProjectileEntity>of(BreakthroughProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BreakthroughProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LightningbeastProjectileEntity>> LIGHTNINGBEAST_PROJECTILE = register("lightningbeast_projectile",
			EntityType.Builder.<LightningbeastProjectileEntity>of(LightningbeastProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(LightningbeastProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EmbraceoftheThunderGodProjectileEntity>> EMBRACEOFTHE_THUNDER_GOD_PROJECTILE = register("embraceofthe_thunder_god_projectile",
			EntityType.Builder.<EmbraceoftheThunderGodProjectileEntity>of(EmbraceoftheThunderGodProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EmbraceoftheThunderGodProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DriftBombProjectileEntity>> DRIFT_BOMB_PROJECTILE = register("drift_bomb_projectile", EntityType.Builder.<DriftBombProjectileEntity>of(DriftBombProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DriftBombProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BrilliantDetonationProjectileEntity>> BRILLIANT_DETONATION_PROJECTILE = register("brilliant_detonation_projectile",
			EntityType.Builder.<BrilliantDetonationProjectileEntity>of(BrilliantDetonationProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BrilliantDetonationProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HunterWispProjectileEntity>> HUNTER_WISP_PROJECTILE = register("hunter_wisp_projectile", EntityType.Builder.<HunterWispProjectileEntity>of(HunterWispProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HunterWispProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<JethammerProjectileEntity>> JETHAMMER_PROJECTILE = register("jethammer_projectile", EntityType.Builder.<JethammerProjectileEntity>of(JethammerProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(JethammerProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SnowflowerbeamProjectileEntity>> SNOWFLOWERBEAM_PROJECTILE = register("snowflowerbeam_projectile",
			EntityType.Builder.<SnowflowerbeamProjectileEntity>of(SnowflowerbeamProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SnowflowerbeamProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RakanProjectileEntity>> RAKAN_PROJECTILE = register("rakan_projectile", EntityType.Builder.<RakanProjectileEntity>of(RakanProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RakanProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CondensePowerProjectileEntity>> CONDENSE_POWER_PROJECTILE = register("condense_power_projectile",
			EntityType.Builder.<CondensePowerProjectileEntity>of(CondensePowerProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(CondensePowerProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FossProjectileEntity>> FOSS_PROJECTILE = register("foss_projectile",
			EntityType.Builder.<FossProjectileEntity>of(FossProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FossProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FakeBallProjectileEntity>> FAKE_BALL_PROJECTILE = register("fake_ball_projectile", EntityType.Builder.<FakeBallProjectileEntity>of(FakeBallProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FakeBallProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExterminateRayProjectileEntity>> EXTERMINATE_RAY_PROJECTILE = register("exterminate_ray_projectile",
			EntityType.Builder.<ExterminateRayProjectileEntity>of(ExterminateRayProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ExterminateRayProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PurgatoryVenomProjectileEntity>> PURGATORY_VENOM_PROJECTILE = register("purgatory_venom_projectile",
			EntityType.Builder.<PurgatoryVenomProjectileEntity>of(PurgatoryVenomProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(PurgatoryVenomProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KillSwitchProjectileEntity>> KILL_SWITCH_PROJECTILE = register("kill_switch_projectile", EntityType.Builder.<KillSwitchProjectileEntity>of(KillSwitchProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(KillSwitchProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CruelSunProjectileEntity>> CRUEL_SUN_PROJECTILE = register("cruel_sun_projectile", EntityType.Builder.<CruelSunProjectileEntity>of(CruelSunProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CruelSunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GrayDemonEntity>> GRAY_DEMON = register("gray_demon",
			EntityType.Builder.<GrayDemonEntity>of(GrayDemonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GrayDemonEntity::new)

					.sized(1.6f, 1.8f));
	public static final RegistryObject<EntityType<HideAndSeekEntity>> HIDE_AND_SEEK = register("hide_and_seek",
			EntityType.Builder.<HideAndSeekEntity>of(HideAndSeekEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HideAndSeekEntity::new)

					.sized(0.6f, 0.9f));
	public static final RegistryObject<EntityType<VineEntity>> VINE = register("vine",
			EntityType.Builder.<VineEntity>of(VineEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VineEntity::new)

					.sized(0.6f, 6f));
	public static final RegistryObject<EntityType<FrozenBreathEntity>> FROZEN_BREATH = register("frozen_breath",
			EntityType.Builder.<FrozenBreathEntity>of(FrozenBreathEntity::new, MobCategory.MISC).setCustomClientFactory(FrozenBreathEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NoroiNoKoeEntity>> NOROI_NO_KOE = register("noroi_no_koe",
			EntityType.Builder.<NoroiNoKoeEntity>of(NoroiNoKoeEntity::new, MobCategory.MISC).setCustomClientFactory(NoroiNoKoeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DespairVenomEntity>> DESPAIR_VENOM = register("despair_venom",
			EntityType.Builder.<DespairVenomEntity>of(DespairVenomEntity::new, MobCategory.MISC).setCustomClientFactory(DespairVenomEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrazyProminenceEntity>> CRAZY_PROMINENCE = register("crazy_prominence", EntityType.Builder.<CrazyProminenceEntity>of(CrazyProminenceEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CrazyProminenceEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FightingAreaEntity>> FIGHTING_AREA = register("fighting_area", EntityType.Builder.<FightingAreaEntity>of(FightingAreaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FightingAreaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FinalProminenceEntity>> FINAL_PROMINENCE = register("final_prominence", EntityType.Builder.<FinalProminenceEntity>of(FinalProminenceEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FinalProminenceEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LuigiEntity>> LUIGI = register("luigi",
			EntityType.Builder.<LuigiEntity>of(LuigiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LuigiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TyrantDragonEntity>> TYRANT_DRAGON = register("tyrant_dragon",
			EntityType.Builder.<TyrantDragonEntity>of(TyrantDragonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TyrantDragonEntity::new)

					.sized(2.7f, 3f));
	public static final RegistryObject<EntityType<MutilatorRabbitsEntity>> MUTILATOR_RABBITS = register("mutilator_rabbits",
			EntityType.Builder.<MutilatorRabbitsEntity>of(MutilatorRabbitsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MutilatorRabbitsEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<AngleCureEntity>> ANGLE_CURE = register("angle_cure",
			EntityType.Builder.<AngleCureEntity>of(AngleCureEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngleCureEntity::new)

					.sized(1.7f, 1.7f));
	public static final RegistryObject<EntityType<DuskBison1Entity>> DUSK_BISON_1 = register("dusk_bison_1",
			EntityType.Builder.<DuskBison1Entity>of(DuskBison1Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DuskBison1Entity::new)

					.sized(2.1f, 2.9f));
	public static final RegistryObject<EntityType<WindShotProjectileEntity>> WIND_SHOT_PROJECTILE = register("wind_shot_projectile", EntityType.Builder.<WindShotProjectileEntity>of(WindShotProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WindShotProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AuraBurstEntity>> AURA_BURST = register("aura_burst",
			EntityType.Builder.<AuraBurstEntity>of(AuraBurstEntity::new, MobCategory.MISC).setCustomClientFactory(AuraBurstEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BulletSquallEntity>> BULLET_SQUALL = register("bullet_squall", EntityType.Builder.<BulletSquallEntity>of(BulletSquallEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BulletSquallEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JerichoDemonFormEntity>> JERICHO_DEMON_FORM = register("jericho_demon_form",
			EntityType.Builder.<JerichoDemonFormEntity>of(JerichoDemonFormEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(JerichoDemonFormEntity::new)

					.sized(1.2f, 5.5f));
	public static final RegistryObject<EntityType<TrollEntity>> TROLL = register("troll",
			EntityType.Builder.<TrollEntity>of(TrollEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrollEntity::new)

					.sized(1.1f, 3f));
	public static final RegistryObject<EntityType<KulumilEntity>> KULUMIL = register("kulumil",
			EntityType.Builder.<KulumilEntity>of(KulumilEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KulumilEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PuoraEntity>> PUORA = register("puora",
			EntityType.Builder.<PuoraEntity>of(PuoraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PuoraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EarthCrawlerEntity>> EARTH_CRAWLER = register("earth_crawler",
			EntityType.Builder.<EarthCrawlerEntity>of(EarthCrawlerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EarthCrawlerEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<ChainExplosionV2Entity>> CHAIN_EXPLOSION_V_2 = register("chain_explosion_v_2", EntityType.Builder.<ChainExplosionV2Entity>of(ChainExplosionV2Entity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChainExplosionV2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ClayDragonEntity>> CLAY_DRAGON = register("clay_dragon",
			EntityType.Builder.<ClayDragonEntity>of(ClayDragonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClayDragonEntity::new)

					.sized(1.3f, 1.8f));
	public static final RegistryObject<EntityType<MuramoDemonFormEntity>> MURAMO_DEMON_FORM = register("muramo_demon_form",
			EntityType.Builder.<MuramoDemonFormEntity>of(MuramoDemonFormEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MuramoDemonFormEntity::new)

					.sized(1.1f, 6f));
	public static final RegistryObject<EntityType<AndreDemonFormEntity>> ANDRE_DEMON_FORM = register("andre_demon_form",
			EntityType.Builder.<AndreDemonFormEntity>of(AndreDemonFormEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AndreDemonFormEntity::new)

					.sized(1.3f, 6f));
	public static final RegistryObject<EntityType<EnergyArrowEntity>> ENERGY_ARROW = register("energy_arrow",
			EntityType.Builder.<EnergyArrowEntity>of(EnergyArrowEntity::new, MobCategory.MISC).setCustomClientFactory(EnergyArrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AcidTwowerMobEntity>> ACID_TWOWER_MOB = register("acid_twower_mob", EntityType.Builder.<AcidTwowerMobEntity>of(AcidTwowerMobEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AcidTwowerMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeadEndEntity>> DEAD_END = register("dead_end",
			EntityType.Builder.<DeadEndEntity>of(DeadEndEntity::new, MobCategory.MISC).setCustomClientFactory(DeadEndEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EarthGolemEntity>> EARTH_GOLEM = register("earth_golem",
			EntityType.Builder.<EarthGolemEntity>of(EarthGolemEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EarthGolemEntity::new)

					.sized(1f, 3f));
	public static final RegistryObject<EntityType<PainEditionEntity>> PAIN_EDITION = register("pain_edition",
			EntityType.Builder.<PainEditionEntity>of(PainEditionEntity::new, MobCategory.MISC).setCustomClientFactory(PainEditionEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PhysicalCloneEntity>> PHYSICAL_CLONE = register("physical_clone",
			EntityType.Builder.<PhysicalCloneEntity>of(PhysicalCloneEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhysicalCloneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HellFireBirdEntity>> HELL_FIRE_BIRD = register("hell_fire_bird",
			EntityType.Builder.<HellFireBirdEntity>of(HellFireBirdEntity::new, MobCategory.MISC).setCustomClientFactory(HellFireBirdEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AshDragonEntity>> ASH_DRAGON = register("ash_dragon",
			EntityType.Builder.<AshDragonEntity>of(AshDragonEntity::new, MobCategory.MISC).setCustomClientFactory(AshDragonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BusterIceEntity>> BUSTER_ICE = register("buster_ice",
			EntityType.Builder.<BusterIceEntity>of(BusterIceEntity::new, MobCategory.MISC).setCustomClientFactory(BusterIceEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChastiefolTrueSpirtSpearEntity>> CHASTIEFOL_TRUE_SPIRT_SPEAR = register("chastiefol_true_spirt_spear",
			EntityType.Builder.<ChastiefolTrueSpirtSpearEntity>of(ChastiefolTrueSpirtSpearEntity::new, MobCategory.MISC).setCustomClientFactory(ChastiefolTrueSpirtSpearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GuardianTrueSpirtSpearEntity>> GUARDIAN_TRUE_SPIRT_SPEAR = register("guardian_true_spirt_spear",
			EntityType.Builder.<GuardianTrueSpirtSpearEntity>of(GuardianTrueSpirtSpearEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GuardianTrueSpirtSpearEntity::new).fireImmune().sized(2f, 5f));
	public static final RegistryObject<EntityType<LetThereBeLightEntity>> LET_THERE_BE_LIGHT = register("let_there_be_light", EntityType.Builder.<LetThereBeLightEntity>of(LetThereBeLightEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LetThereBeLightEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<InfernoIncantationEntity>> INFERNO_INCANTATION = register("inferno_incantation", EntityType.Builder.<InfernoIncantationEntity>of(InfernoIncantationEntity::new, MobCategory.MISC)
			.setCustomClientFactory(InfernoIncantationEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TwigoAnimatedEntity>> TWIGO_ANIMATED = register("twigo_animated",
			EntityType.Builder.<TwigoAnimatedEntity>of(TwigoAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TwigoAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GrayDemonEntityEntity>> GRAY_DEMON_ENTITY = register("gray_demon_entity",
			EntityType.Builder.<GrayDemonEntityEntity>of(GrayDemonEntityEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GrayDemonEntityEntity::new)

					.sized(0.9f, 3f));
	public static final RegistryObject<EntityType<GilThunderAnimatedEntity>> GIL_THUNDER_ANIMATED = register("gil_thunder_animated",
			EntityType.Builder.<GilThunderAnimatedEntity>of(GilThunderAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GilThunderAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GolgiusAnimatedEntity>> GOLGIUS_ANIMATED = register("golgius_animated",
			EntityType.Builder.<GolgiusAnimatedEntity>of(GolgiusAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GolgiusAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DianeAnimatedEntity>> DIANE_ANIMATED = register("diane_animated",
			EntityType.Builder.<DianeAnimatedEntity>of(DianeAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DianeAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RuinAnimatedEntity>> RUIN_ANIMATED = register("ruin_animated",
			EntityType.Builder.<RuinAnimatedEntity>of(RuinAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(RuinAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FriesiaAnimatedEntity>> FRIESIA_ANIMATED = register("friesia_animated",
			EntityType.Builder.<FriesiaAnimatedEntity>of(FriesiaAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(FriesiaAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GuilaAnimatedEntity>> GUILA_ANIMATED = register("guila_animated",
			EntityType.Builder.<GuilaAnimatedEntity>of(GuilaAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GuilaAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TaizooAnimatedEntity>> TAIZOO_ANIMATED = register("taizoo_animated",
			EntityType.Builder.<TaizooAnimatedEntity>of(TaizooAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TaizooAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GriamoreAnimatedEntity>> GRIAMORE_ANIMATED = register("griamore_animated",
			EntityType.Builder.<GriamoreAnimatedEntity>of(GriamoreAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GriamoreAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HowzerAnimatedEntity>> HOWZER_ANIMATED = register("howzer_animated",
			EntityType.Builder.<HowzerAnimatedEntity>of(HowzerAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HowzerAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CainBarzadAnimatedEntity>> CAIN_BARZAD_ANIMATED = register("cain_barzad_animated",
			EntityType.Builder.<CainBarzadAnimatedEntity>of(CainBarzadAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CainBarzadAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryBanAnimatedEntity>> STORY_BAN_ANIMATED = register("story_ban_animated",
			EntityType.Builder.<StoryBanAnimatedEntity>of(StoryBanAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryBanAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JerichoAnimatedEntity>> JERICHO_ANIMATED = register("jericho_animated",
			EntityType.Builder.<JerichoAnimatedEntity>of(JerichoAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(JerichoAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GuilaDemonanimatedEntity>> GUILA_DEMONANIMATED = register("guila_demonanimated",
			EntityType.Builder.<GuilaDemonanimatedEntity>of(GuilaDemonanimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GuilaDemonanimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HelbremAnimatedEntity>> HELBREM_ANIMATED = register("helbrem_animated",
			EntityType.Builder.<HelbremAnimatedEntity>of(HelbremAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HelbremAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GilThunderAnimated2Entity>> GIL_THUNDER_ANIMATED_2 = register("gil_thunder_animated_2",
			EntityType.Builder.<GilThunderAnimated2Entity>of(GilThunderAnimated2Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GilThunderAnimated2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RedKnightAnimatedEntity>> RED_KNIGHT_ANIMATED = register("red_knight_animated",
			EntityType.Builder.<RedKnightAnimatedEntity>of(RedKnightAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedKnightAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GreenKnightAnimatedEntity>> GREEN_KNIGHT_ANIMATED = register("green_knight_animated",
			EntityType.Builder.<GreenKnightAnimatedEntity>of(GreenKnightAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreenKnightAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DreyfusAnimatedEntity>> DREYFUS_ANIMATED = register("dreyfus_animated",
			EntityType.Builder.<DreyfusAnimatedEntity>of(DreyfusAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DreyfusAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FairyHelbremAnimatedEntity>> FAIRY_HELBREM_ANIMATED = register("fairy_helbrem_animated",
			EntityType.Builder.<FairyHelbremAnimatedEntity>of(FairyHelbremAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(FairyHelbremAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeadHelbramanimatedEntity>> DEAD_HELBRAMANIMATED = register("dead_helbramanimated",
			EntityType.Builder.<DeadHelbramanimatedEntity>of(DeadHelbramanimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DeadHelbramanimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VivianAnimatedEntity>> VIVIAN_ANIMATED = register("vivian_animated",
			EntityType.Builder.<VivianAnimatedEntity>of(VivianAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VivianAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoyalGurardAnimatedEntity>> ROYAL_GURARD_ANIMATED = register("royal_gurard_animated",
			EntityType.Builder.<RoyalGurardAnimatedEntity>of(RoyalGurardAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoyalGurardAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoyalGuardAnimatedEntity>> ROYAL_GUARD_ANIMATED = register("royal_guard_animated",
			EntityType.Builder.<RoyalGuardAnimatedEntity>of(RoyalGuardAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoyalGuardAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SoldierAnimatedEntity>> SOLDIER_ANIMATED = register("soldier_animated",
			EntityType.Builder.<SoldierAnimatedEntity>of(SoldierAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SoldierAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HendricksonAnimatedEntity>> HENDRICKSON_ANIMATED = register("hendrickson_animated",
			EntityType.Builder.<HendricksonAnimatedEntity>of(HendricksonAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HendricksonAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoryBan2AnimatedEntity>> STORY_BAN_2_ANIMATED = register("story_ban_2_animated",
			EntityType.Builder.<StoryBan2AnimatedEntity>of(StoryBan2AnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoryBan2AnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ParadaAnimatedEntity>> PARADA_ANIMATED = register("parada_animated",
			EntityType.Builder.<ParadaAnimatedEntity>of(ParadaAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ParadaAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DemonHendricksonAnimatedEntity>> DEMON_HENDRICKSON_ANIMATED = register("demon_hendrickson_animated",
			EntityType.Builder.<DemonHendricksonAnimatedEntity>of(DemonHendricksonAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(DemonHendricksonAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GrayDemonHendricksonAnimatedEntity>> GRAY_DEMON_HENDRICKSON_ANIMATED = register("gray_demon_hendrickson_animated",
			EntityType.Builder.<GrayDemonHendricksonAnimatedEntity>of(GrayDemonHendricksonAnimatedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
					.setCustomClientFactory(GrayDemonHendricksonAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AndreAnimatedEntity>> ANDRE_ANIMATED = register("andre_animated",
			EntityType.Builder.<AndreAnimatedEntity>of(AndreAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AndreAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MuramoAnimatedEntity>> MURAMO_ANIMATED = register("muramo_animated",
			EntityType.Builder.<MuramoAnimatedEntity>of(MuramoAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MuramoAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DumblebbasAnimatedEntity>> DUMBLEBBAS_ANIMATED = register("dumblebbas_animated",
			EntityType.Builder.<DumblebbasAnimatedEntity>of(DumblebbasAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DumblebbasAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WeinheidtAnimatedEntity>> WEINHEIDT_ANIMATED = register("weinheidt_animated",
			EntityType.Builder.<WeinheidtAnimatedEntity>of(WeinheidtAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WeinheidtAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HugoAnimatedEntity>> HUGO_ANIMATED = register("hugo_animated",
			EntityType.Builder.<HugoAnimatedEntity>of(HugoAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HugoAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JillianAnimatedEntity>> JILLIAN_ANIMATED = register("jillian_animated",
			EntityType.Builder.<JillianAnimatedEntity>of(JillianAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JillianAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SimonAnimatedEntity>> SIMON_ANIMATED = register("simon_animated",
			EntityType.Builder.<SimonAnimatedEntity>of(SimonAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SimonAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BanBossAnimatedEntity>> BAN_BOSS_ANIMATED = register("ban_boss_animated",
			EntityType.Builder.<BanBossAnimatedEntity>of(BanBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BanBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SladerAnimatedEntity>> SLADER_ANIMATED = register("slader_animated",
			EntityType.Builder.<SladerAnimatedEntity>of(SladerAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SladerAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GustafAnimatedEntity>> GUSTAF_ANIMATED = register("gustaf_animated",
			EntityType.Builder.<GustafAnimatedEntity>of(GustafAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GustafAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DianeBossAnimatedEntity>> DIANE_BOSS_ANIMATED = register("diane_boss_animated",
			EntityType.Builder.<DianeBossAnimatedEntity>of(DianeBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DianeBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GowtherBossAnimatedEntity>> GOWTHER_BOSS_ANIMATED = register("gowther_boss_animated",
			EntityType.Builder.<GowtherBossAnimatedEntity>of(GowtherBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GowtherBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KingBossAnimatedEntity>> KING_BOSS_ANIMATED = register("king_boss_animated",
			EntityType.Builder.<KingBossAnimatedEntity>of(KingBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KingBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MeliodasBossAnimatedEntity>> MELIODAS_BOSS_ANIMATED = register("meliodas_boss_animated",
			EntityType.Builder.<MeliodasBossAnimatedEntity>of(MeliodasBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MeliodasBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MerlinBossAnimatedEntity>> MERLIN_BOSS_ANIMATED = register("merlin_boss_animated",
			EntityType.Builder.<MerlinBossAnimatedEntity>of(MerlinBossAnimatedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MerlinBossAnimatedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WickedBiteEntity>> WICKED_BITE = register("wicked_bite", EntityType.Builder.<WickedBiteEntity>of(WickedBiteEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(WickedBiteEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KamichigiriProjectileEntity>> KAMICHIGIRI_PROJECTILE = register("kamichigiri_projectile", EntityType.Builder.<KamichigiriProjectileEntity>of(KamichigiriProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(KamichigiriProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DeathThornEntity>> DEATH_THORN = register("death_thorn", EntityType.Builder.<DeathThornEntity>of(DeathThornEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(DeathThornEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BasquiasGuardianEntity>> BASQUIAS_GUARDIAN = register("basquias_guardian", EntityType.Builder.<BasquiasGuardianEntity>of(BasquiasGuardianEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BasquiasGuardianEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DivineSlashEntity>> DIVINE_SLASH = register("divine_slash",
			EntityType.Builder.<DivineSlashEntity>of(DivineSlashEntity::new, MobCategory.MISC).setCustomClientFactory(DivineSlashEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GigaPickEntity>> GIGA_PICK = register("giga_pick",
			EntityType.Builder.<GigaPickEntity>of(GigaPickEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GigaPickEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GigaFallEntity>> GIGA_FALL = register("giga_fall",
			EntityType.Builder.<GigaFallEntity>of(GigaFallEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GigaFallEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GigaCrushEntity>> GIGA_CRUSH = register("giga_crush", EntityType.Builder.<GigaCrushEntity>of(GigaCrushEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(GigaCrushEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlackOutEntity>> BLACK_OUT = register("black_out",
			EntityType.Builder.<BlackOutEntity>of(BlackOutEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackOutEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FurkuuSutonEntity>> FURKUU_SUTON = register("furkuu_suton",
			EntityType.Builder.<FurkuuSutonEntity>of(FurkuuSutonEntity::new, MobCategory.MISC).setCustomClientFactory(FurkuuSutonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlackOutProjectileEntity>> BLACK_OUT_PROJECTILE = register("black_out_projectile", EntityType.Builder.<BlackOutProjectileEntity>of(BlackOutProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BlackOutProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SunFlowerTrueSpirtSpearEntity>> SUN_FLOWER_TRUE_SPIRT_SPEAR = register("sun_flower_true_spirt_spear",
			EntityType.Builder.<SunFlowerTrueSpirtSpearEntity>of(SunFlowerTrueSpirtSpearEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SunFlowerTrueSpirtSpearEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MoonRoseEntity>> MOON_ROSE = register("moon_rose",
			EntityType.Builder.<MoonRoseEntity>of(MoonRoseEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MoonRoseEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BasquiasProjectileEntity>> BASQUIAS_PROJECTILE = register("basquias_projectile", EntityType.Builder.<BasquiasProjectileEntity>of(BasquiasProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BasquiasProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FiveLostProjectileEntity>> FIVE_LOST_PROJECTILE = register("five_lost_projectile", EntityType.Builder.<FiveLostProjectileEntity>of(FiveLostProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FiveLostProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HellGateRedDemonsEntity>> HELL_GATE_RED_DEMONS = register("hell_gate_red_demons",
			EntityType.Builder.<HellGateRedDemonsEntity>of(HellGateRedDemonsEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HellGateRedDemonsEntity::new)

					.sized(2.5f, 4.6f));
	public static final RegistryObject<EntityType<JumanjuEntityEntity>> JUMANJU_ENTITY = register("jumanju_entity", EntityType.Builder.<JumanjuEntityEntity>of(JumanjuEntityEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JumanjuEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CocoonOfDarknessEntity>> COCOON_OF_DARKNESS = register("cocoon_of_darkness", EntityType.Builder.<CocoonOfDarknessEntity>of(CocoonOfDarknessEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CocoonOfDarknessEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GerheadeEntity>> GERHEADE = register("gerheade",
			EntityType.Builder.<GerheadeEntity>of(GerheadeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GerheadeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ServantEntity>> SERVANT = register("servant",
			EntityType.Builder.<ServantEntity>of(ServantEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ServantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MarmasEntity>> MARMAS = register("marmas",
			EntityType.Builder.<MarmasEntity>of(MarmasEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarmasEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AealHealEntity>> AEAL_HEAL = register("aeal_heal",
			EntityType.Builder.<AealHealEntity>of(AealHealEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AealHealEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SuperSlashEntity>> SUPER_SLASH = register("super_slash",
			EntityType.Builder.<SuperSlashEntity>of(SuperSlashEntity::new, MobCategory.MISC).setCustomClientFactory(SuperSlashEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DogedoEntity>> DOGEDO = register("dogedo",
			EntityType.Builder.<DogedoEntity>of(DogedoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DogedoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GowtherStory1Entity>> GOWTHER_STORY_1 = register("gowther_story_1",
			EntityType.Builder.<GowtherStory1Entity>of(GowtherStory1Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GowtherStory1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AlbionEntity>> ALBION = register("albion",
			EntityType.Builder.<AlbionEntity>of(AlbionEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AlbionEntity::new)

					.sized(0.8f, 2.5f));
	public static final RegistryObject<EntityType<CannonEntity>> CANNON = register("cannon",
			EntityType.Builder.<CannonEntity>of(CannonEntity::new, MobCategory.MISC).setCustomClientFactory(CannonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AlbionFatEntity>> ALBION_FAT = register("albion_fat",
			EntityType.Builder.<AlbionFatEntity>of(AlbionFatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbionFatEntity::new)

					.sized(0.8f, 2.5f));
	public static final RegistryObject<EntityType<TallAlbionEntity>> TALL_ALBION = register("tall_albion",
			EntityType.Builder.<TallAlbionEntity>of(TallAlbionEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TallAlbionEntity::new)

					.sized(0.8f, 2.7f));
	public static final RegistryObject<EntityType<AlbionTallEntity>> ALBION_TALL = register("albion_tall",
			EntityType.Builder.<AlbionTallEntity>of(AlbionTallEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbionTallEntity::new)

					.sized(0.8f, 2.7f));
	public static final RegistryObject<EntityType<GoddessBlessEntityEntity>> GODDESS_BLESS_ENTITY = register("goddess_bless_entity", EntityType.Builder.<GoddessBlessEntityEntity>of(GoddessBlessEntityEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoddessBlessEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DemonKingEntity>> DEMON_KING = register("demon_king", EntityType.Builder.<DemonKingEntity>of(DemonKingEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(DemonKingEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SmallHawksEntity>> SMALL_HAWKS = register("small_hawks",
			EntityType.Builder.<SmallHawksEntity>of(SmallHawksEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SmallHawksEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<GalandEntity>> GALAND = register("galand",
			EntityType.Builder.<GalandEntity>of(GalandEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GalandEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MatronaEntity>> MATRONA = register("matrona",
			EntityType.Builder.<MatronaEntity>of(MatronaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MatronaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheoEntity>> THEO = register("theo",
			EntityType.Builder.<TheoEntity>of(TheoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheoEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JennaEntity>> JENNA = register("jenna",
			EntityType.Builder.<JennaEntity>of(JennaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JennaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZaneriEntity>> ZANERI = register("zaneri",
			EntityType.Builder.<ZaneriEntity>of(ZaneriEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZaneriEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DiamondTowerEntity>> DIAMOND_TOWER = register("diamond_tower", EntityType.Builder.<DiamondTowerEntity>of(DiamondTowerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DiamondTowerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EscanorBossEntity>> ESCANOR_BOSS = register("escanor_boss",
			EntityType.Builder.<EscanorBossEntity>of(EscanorBossEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EscanorBossEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloverEntity>> CLOVER = register("clover",
			EntityType.Builder.<CloverEntity>of(CloverEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloverEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GloxinaBossEntity>> GLOXINA_BOSS = register("gloxina_boss",
			EntityType.Builder.<GloxinaBossEntity>of(GloxinaBossEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GloxinaBossEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MossDragonEntity>> MOSS_DRAGON = register("moss_dragon",
			EntityType.Builder.<MossDragonEntity>of(MossDragonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MossDragonEntity::new)

					.sized(2.9f, 2.6f));
	public static final RegistryObject<EntityType<TyrantDragonCaveEntity>> TYRANT_DRAGON_CAVE = register("tyrant_dragon_cave",
			EntityType.Builder.<TyrantDragonCaveEntity>of(TyrantDragonCaveEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TyrantDragonCaveEntity::new)

					.sized(2.7f, 3f));
	public static final RegistryObject<EntityType<AnaonEntity>> ANAON = register("anaon",
			EntityType.Builder.<AnaonEntity>of(AnaonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AnaonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DestroyFourElementsEntity>> DESTROY_FOUR_ELEMENTS = register("destroy_four_elements", EntityType.Builder.<DestroyFourElementsEntity>of(DestroyFourElementsEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DestroyFourElementsEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OminousNebulaEnitiyEntity>> OMINOUS_NEBULA_ENITIY = register("ominous_nebula_enitiy", EntityType.Builder.<OminousNebulaEnitiyEntity>of(OminousNebulaEnitiyEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OminousNebulaEnitiyEntity::new).fireImmune().sized(0.25f, 0.25f));
	public static final RegistryObject<EntityType<KingStory1Entity>> KING_STORY_1 = register("king_story_1",
			EntityType.Builder.<KingStory1Entity>of(KingStory1Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(KingStory1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GalandStory2Entity>> GALAND_STORY_2 = register("galand_story_2",
			EntityType.Builder.<GalandStory2Entity>of(GalandStory2Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GalandStory2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IceAnchorEntity>> ICE_ANCHOR = register("ice_anchor",
			EntityType.Builder.<IceAnchorEntity>of(IceAnchorEntity::new, MobCategory.MISC).setCustomClientFactory(IceAnchorEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElaineStoryEntity>> ELAINE_STORY = register("elaine_story",
			EntityType.Builder.<ElaineStoryEntity>of(ElaineStoryEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ElaineStoryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GalandOverEntity>> GALAND_OVER = register("galand_over",
			EntityType.Builder.<GalandOverEntity>of(GalandOverEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GalandOverEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReaperScytheEntityEntity>> REAPER_SCYTHE_ENTITY = register("reaper_scythe_entity",
			EntityType.Builder.<ReaperScytheEntityEntity>of(ReaperScytheEntityEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ReaperScytheEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DubsEntity>> DUBS = register("dubs",
			EntityType.Builder.<DubsEntity>of(DubsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DubsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlueDemonEntity>> BLUE_DEMON = register("blue_demon",
			EntityType.Builder.<BlueDemonEntity>of(BlueDemonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueDemonEntity::new)

					.sized(1.5f, 2.8f));
	public static final RegistryObject<EntityType<JigumoEntity>> JIGUMO = register("jigumo",
			EntityType.Builder.<JigumoEntity>of(JigumoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(JigumoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TorahEntity>> TORAH = register("torah",
			EntityType.Builder.<TorahEntity>of(TorahEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TorahEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GerheadeservantEntity>> GERHEADESERVANT = register("gerheadeservant",
			EntityType.Builder.<GerheadeservantEntity>of(GerheadeservantEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GerheadeservantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoneDroleEntity>> STONE_DROLE = register("stone_drole",
			EntityType.Builder.<StoneDroleEntity>of(StoneDroleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(StoneDroleEntity::new)

					.sized(1.3f, 5.5f));
	public static final RegistryObject<EntityType<GowtherEP18Entity>> GOWTHER_EP_18 = register("gowther_ep_18",
			EntityType.Builder.<GowtherEP18Entity>of(GowtherEP18Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GowtherEP18Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GloxiniaStoryEntity>> GLOXINIA_STORY = register("gloxinia_story",
			EntityType.Builder.<GloxiniaStoryEntity>of(GloxiniaStoryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GloxiniaStoryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DroleEntity>> DROLE = register("drole",
			EntityType.Builder.<DroleEntity>of(DroleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DroleEntity::new)

					.sized(1.3f, 5.5f));
	public static final RegistryObject<EntityType<IncreaseTrueSpiritSpearProjectileEntity>> INCREASE_TRUE_SPIRIT_SPEAR_PROJECTILE = register("increase_true_spirit_spear_projectile",
			EntityType.Builder.<IncreaseTrueSpiritSpearProjectileEntity>of(IncreaseTrueSpiritSpearProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(IncreaseTrueSpiritSpearProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BreakableBugProjectileEntity>> BREAKABLE_BUG_PROJECTILE = register("breakable_bug_projectile", EntityType.Builder.<BreakableBugProjectileEntity>of(BreakableBugProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BreakableBugProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DeireriStoryEntity>> DEIRERI_STORY = register("deireri_story",
			EntityType.Builder.<DeireriStoryEntity>of(DeireriStoryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DeireriStoryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MonspeitStoryEntity>> MONSPEIT_STORY = register("monspeit_story",
			EntityType.Builder.<MonspeitStoryEntity>of(MonspeitStoryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MonspeitStoryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HelbramSwordEntity>> HELBRAM_SWORD = register("helbram_sword",
			EntityType.Builder.<HelbramSwordEntity>of(HelbramSwordEntity::new, MobCategory.MISC).setCustomClientFactory(HelbramSwordEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IncreaseProjectileEntity>> INCREASE_PROJECTILE = register("increase_projectile", EntityType.Builder.<IncreaseProjectileEntity>of(IncreaseProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IncreaseProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceBulletsEntity>> ICE_BULLETS = register("ice_bullets",
			EntityType.Builder.<IceBulletsEntity>of(IceBulletsEntity::new, MobCategory.MISC).setCustomClientFactory(IceBulletsEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GrayRoadStoryEntity>> GRAY_ROAD_STORY = register("gray_road_story",
			EntityType.Builder.<GrayRoadStoryEntity>of(GrayRoadStoryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GrayRoadStoryEntity::new)

					.sized(0.6f, 2.2f));
	public static final RegistryObject<EntityType<DreyfusDemonEntity>> DREYFUS_DEMON = register("dreyfus_demon",
			EntityType.Builder.<DreyfusDemonEntity>of(DreyfusDemonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DreyfusDemonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DroleStory2Entity>> DROLE_STORY_2 = register("drole_story_2",
			EntityType.Builder.<DroleStory2Entity>of(DroleStory2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DroleStory2Entity::new)

					.sized(1.3f, 5.5f));
	public static final RegistryObject<EntityType<GloxiniaStory2Entity>> GLOXINIA_STORY_2 = register("gloxinia_story_2",
			EntityType.Builder.<GloxiniaStory2Entity>of(GloxiniaStory2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GloxiniaStory2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZeldrisStoryEntity>> ZELDRIS_STORY = register("zeldris_story",
			EntityType.Builder.<ZeldrisStoryEntity>of(ZeldrisStoryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ZeldrisStoryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DemonMarkMeliodasEntity>> DEMON_MARK_MELIODAS = register("demon_mark_meliodas",
			EntityType.Builder.<DemonMarkMeliodasEntity>of(DemonMarkMeliodasEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DemonMarkMeliodasEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EstarossaStoryEntity>> ESTAROSSA_STORY = register("estarossa_story",
			EntityType.Builder.<EstarossaStoryEntity>of(EstarossaStoryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(EstarossaStoryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EstarrossaStoryEntity>> ESTARROSSA_STORY = register("estarrossa_story",
			EntityType.Builder.<EstarrossaStoryEntity>of(EstarrossaStoryEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(EstarrossaStoryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GrayRoadStory2Entity>> GRAY_ROAD_STORY_2 = register("gray_road_story_2",
			EntityType.Builder.<GrayRoadStory2Entity>of(GrayRoadStory2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GrayRoadStory2Entity::new)

					.sized(0.6f, 2.2f));
	public static final RegistryObject<EntityType<DeireriStory2Entity>> DEIRERI_STORY_2 = register("deireri_story_2",
			EntityType.Builder.<DeireriStory2Entity>of(DeireriStory2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DeireriStory2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MonspeitStory2Entity>> MONSPEIT_STORY_2 = register("monspeit_story_2",
			EntityType.Builder.<MonspeitStory2Entity>of(MonspeitStory2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MonspeitStory2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FraudrinStoryEntity>> FRAUDRIN_STORY = register("fraudrin_story",
			EntityType.Builder.<FraudrinStoryEntity>of(FraudrinStoryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(FraudrinStoryEntity::new)

					.sized(0.8f, 3.6f));
	public static final RegistryObject<EntityType<ZhivagoEntity>> ZHIVAGO = register("zhivago",
			EntityType.Builder.<ZhivagoEntity>of(ZhivagoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ZhivagoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeldryEntity>> DELDRY = register("deldry",
			EntityType.Builder.<DeldryEntity>of(DeldryEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeldryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WailioEntity>> WAILIO = register("wailio",
			EntityType.Builder.<WailioEntity>of(WailioEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WailioEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CathEntity>> CATH = register("cath",
			EntityType.Builder.<CathEntity>of(CathEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CathEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<KaleidoscopeEntityEntity>> KALEIDOSCOPE_ENTITY = register("kaleidoscope_entity",
			EntityType.Builder.<KaleidoscopeEntityEntity>of(KaleidoscopeEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KaleidoscopeEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeathpierceEntity>> DEATHPIERCE = register("deathpierce",
			EntityType.Builder.<DeathpierceEntity>of(DeathpierceEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeathpierceEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RisingMeteorEntity.init();
			PollenGardenEntity.init();
			SunflowerEntity.init();
			MantaEntity.init();
			ChickenEntity.init();
			GeckolibKrakenEntity.init();
			RedDemonGeckolibEntity.init();
			Guardian1Entity.init();
			HawksEntity.init();
			BlackHoundEntity.init();
			SwordWolfEntity.init();
			DaleArmoredEntity.init();
			DaleSecEntity.init();
			DalefinalEntity.init();
			ElaineEntity.init();
			InsectEntity.init();
			GrayDemonEntity.init();
			HideAndSeekEntity.init();
			VineEntity.init();
			FightingAreaEntity.init();
			LuigiEntity.init();
			TyrantDragonEntity.init();
			MutilatorRabbitsEntity.init();
			AngleCureEntity.init();
			DuskBison1Entity.init();
			BulletSquallEntity.init();
			JerichoDemonFormEntity.init();
			TrollEntity.init();
			KulumilEntity.init();
			PuoraEntity.init();
			EarthCrawlerEntity.init();
			ChainExplosionV2Entity.init();
			ClayDragonEntity.init();
			MuramoDemonFormEntity.init();
			AndreDemonFormEntity.init();
			AcidTwowerMobEntity.init();
			EarthGolemEntity.init();
			PhysicalCloneEntity.init();
			GuardianTrueSpirtSpearEntity.init();
			TwigoAnimatedEntity.init();
			GrayDemonEntityEntity.init();
			GilThunderAnimatedEntity.init();
			GolgiusAnimatedEntity.init();
			DianeAnimatedEntity.init();
			RuinAnimatedEntity.init();
			FriesiaAnimatedEntity.init();
			GuilaAnimatedEntity.init();
			TaizooAnimatedEntity.init();
			GriamoreAnimatedEntity.init();
			HowzerAnimatedEntity.init();
			CainBarzadAnimatedEntity.init();
			StoryBanAnimatedEntity.init();
			JerichoAnimatedEntity.init();
			GuilaDemonanimatedEntity.init();
			HelbremAnimatedEntity.init();
			GilThunderAnimated2Entity.init();
			RedKnightAnimatedEntity.init();
			GreenKnightAnimatedEntity.init();
			DreyfusAnimatedEntity.init();
			FairyHelbremAnimatedEntity.init();
			DeadHelbramanimatedEntity.init();
			VivianAnimatedEntity.init();
			RoyalGurardAnimatedEntity.init();
			RoyalGuardAnimatedEntity.init();
			SoldierAnimatedEntity.init();
			HendricksonAnimatedEntity.init();
			StoryBan2AnimatedEntity.init();
			ParadaAnimatedEntity.init();
			DemonHendricksonAnimatedEntity.init();
			GrayDemonHendricksonAnimatedEntity.init();
			AndreAnimatedEntity.init();
			MuramoAnimatedEntity.init();
			DumblebbasAnimatedEntity.init();
			WeinheidtAnimatedEntity.init();
			HugoAnimatedEntity.init();
			JillianAnimatedEntity.init();
			SimonAnimatedEntity.init();
			BanBossAnimatedEntity.init();
			SladerAnimatedEntity.init();
			GustafAnimatedEntity.init();
			DianeBossAnimatedEntity.init();
			GowtherBossAnimatedEntity.init();
			KingBossAnimatedEntity.init();
			MeliodasBossAnimatedEntity.init();
			MerlinBossAnimatedEntity.init();
			WickedBiteEntity.init();
			DeathThornEntity.init();
			BasquiasGuardianEntity.init();
			GigaPickEntity.init();
			GigaFallEntity.init();
			GigaCrushEntity.init();
			BlackOutEntity.init();
			SunFlowerTrueSpirtSpearEntity.init();
			MoonRoseEntity.init();
			HellGateRedDemonsEntity.init();
			JumanjuEntityEntity.init();
			CocoonOfDarknessEntity.init();
			GerheadeEntity.init();
			ServantEntity.init();
			MarmasEntity.init();
			AealHealEntity.init();
			DogedoEntity.init();
			GowtherStory1Entity.init();
			AlbionEntity.init();
			AlbionFatEntity.init();
			TallAlbionEntity.init();
			AlbionTallEntity.init();
			GoddessBlessEntityEntity.init();
			DemonKingEntity.init();
			SmallHawksEntity.init();
			GalandEntity.init();
			MatronaEntity.init();
			TheoEntity.init();
			JennaEntity.init();
			ZaneriEntity.init();
			DiamondTowerEntity.init();
			EscanorBossEntity.init();
			CloverEntity.init();
			GloxinaBossEntity.init();
			MossDragonEntity.init();
			TyrantDragonCaveEntity.init();
			AnaonEntity.init();
			OminousNebulaEnitiyEntity.init();
			KingStory1Entity.init();
			GalandStory2Entity.init();
			ElaineStoryEntity.init();
			GalandOverEntity.init();
			ReaperScytheEntityEntity.init();
			DubsEntity.init();
			BlueDemonEntity.init();
			JigumoEntity.init();
			TorahEntity.init();
			GerheadeservantEntity.init();
			StoneDroleEntity.init();
			GowtherEP18Entity.init();
			GloxiniaStoryEntity.init();
			DroleEntity.init();
			DeireriStoryEntity.init();
			MonspeitStoryEntity.init();
			GrayRoadStoryEntity.init();
			DreyfusDemonEntity.init();
			DroleStory2Entity.init();
			GloxiniaStory2Entity.init();
			ZeldrisStoryEntity.init();
			DemonMarkMeliodasEntity.init();
			EstarossaStoryEntity.init();
			EstarrossaStoryEntity.init();
			GrayRoadStory2Entity.init();
			DeireriStory2Entity.init();
			MonspeitStory2Entity.init();
			FraudrinStoryEntity.init();
			ZhivagoEntity.init();
			DeldryEntity.init();
			WailioEntity.init();
			CathEntity.init();
			KaleidoscopeEntityEntity.init();
			DeathpierceEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RISING_METEOR.get(), RisingMeteorEntity.createAttributes().build());
		event.put(POLLEN_GARDEN.get(), PollenGardenEntity.createAttributes().build());
		event.put(SUNFLOWER.get(), SunflowerEntity.createAttributes().build());
		event.put(MANTA.get(), MantaEntity.createAttributes().build());
		event.put(CHICKEN.get(), ChickenEntity.createAttributes().build());
		event.put(GECKOLIB_KRAKEN.get(), GeckolibKrakenEntity.createAttributes().build());
		event.put(RED_DEMON_GECKOLIB.get(), RedDemonGeckolibEntity.createAttributes().build());
		event.put(GUARDIAN_1.get(), Guardian1Entity.createAttributes().build());
		event.put(HAWKS.get(), HawksEntity.createAttributes().build());
		event.put(BLACK_HOUND.get(), BlackHoundEntity.createAttributes().build());
		event.put(SWORD_WOLF.get(), SwordWolfEntity.createAttributes().build());
		event.put(DALE_ARMORED.get(), DaleArmoredEntity.createAttributes().build());
		event.put(DALE_SEC.get(), DaleSecEntity.createAttributes().build());
		event.put(DALEFINAL.get(), DalefinalEntity.createAttributes().build());
		event.put(ELAINE.get(), ElaineEntity.createAttributes().build());
		event.put(INSECT.get(), InsectEntity.createAttributes().build());
		event.put(GRAY_DEMON.get(), GrayDemonEntity.createAttributes().build());
		event.put(HIDE_AND_SEEK.get(), HideAndSeekEntity.createAttributes().build());
		event.put(VINE.get(), VineEntity.createAttributes().build());
		event.put(FIGHTING_AREA.get(), FightingAreaEntity.createAttributes().build());
		event.put(LUIGI.get(), LuigiEntity.createAttributes().build());
		event.put(TYRANT_DRAGON.get(), TyrantDragonEntity.createAttributes().build());
		event.put(MUTILATOR_RABBITS.get(), MutilatorRabbitsEntity.createAttributes().build());
		event.put(ANGLE_CURE.get(), AngleCureEntity.createAttributes().build());
		event.put(DUSK_BISON_1.get(), DuskBison1Entity.createAttributes().build());
		event.put(BULLET_SQUALL.get(), BulletSquallEntity.createAttributes().build());
		event.put(JERICHO_DEMON_FORM.get(), JerichoDemonFormEntity.createAttributes().build());
		event.put(TROLL.get(), TrollEntity.createAttributes().build());
		event.put(KULUMIL.get(), KulumilEntity.createAttributes().build());
		event.put(PUORA.get(), PuoraEntity.createAttributes().build());
		event.put(EARTH_CRAWLER.get(), EarthCrawlerEntity.createAttributes().build());
		event.put(CHAIN_EXPLOSION_V_2.get(), ChainExplosionV2Entity.createAttributes().build());
		event.put(CLAY_DRAGON.get(), ClayDragonEntity.createAttributes().build());
		event.put(MURAMO_DEMON_FORM.get(), MuramoDemonFormEntity.createAttributes().build());
		event.put(ANDRE_DEMON_FORM.get(), AndreDemonFormEntity.createAttributes().build());
		event.put(ACID_TWOWER_MOB.get(), AcidTwowerMobEntity.createAttributes().build());
		event.put(EARTH_GOLEM.get(), EarthGolemEntity.createAttributes().build());
		event.put(PHYSICAL_CLONE.get(), PhysicalCloneEntity.createAttributes().build());
		event.put(GUARDIAN_TRUE_SPIRT_SPEAR.get(), GuardianTrueSpirtSpearEntity.createAttributes().build());
		event.put(TWIGO_ANIMATED.get(), TwigoAnimatedEntity.createAttributes().build());
		event.put(GRAY_DEMON_ENTITY.get(), GrayDemonEntityEntity.createAttributes().build());
		event.put(GIL_THUNDER_ANIMATED.get(), GilThunderAnimatedEntity.createAttributes().build());
		event.put(GOLGIUS_ANIMATED.get(), GolgiusAnimatedEntity.createAttributes().build());
		event.put(DIANE_ANIMATED.get(), DianeAnimatedEntity.createAttributes().build());
		event.put(RUIN_ANIMATED.get(), RuinAnimatedEntity.createAttributes().build());
		event.put(FRIESIA_ANIMATED.get(), FriesiaAnimatedEntity.createAttributes().build());
		event.put(GUILA_ANIMATED.get(), GuilaAnimatedEntity.createAttributes().build());
		event.put(TAIZOO_ANIMATED.get(), TaizooAnimatedEntity.createAttributes().build());
		event.put(GRIAMORE_ANIMATED.get(), GriamoreAnimatedEntity.createAttributes().build());
		event.put(HOWZER_ANIMATED.get(), HowzerAnimatedEntity.createAttributes().build());
		event.put(CAIN_BARZAD_ANIMATED.get(), CainBarzadAnimatedEntity.createAttributes().build());
		event.put(STORY_BAN_ANIMATED.get(), StoryBanAnimatedEntity.createAttributes().build());
		event.put(JERICHO_ANIMATED.get(), JerichoAnimatedEntity.createAttributes().build());
		event.put(GUILA_DEMONANIMATED.get(), GuilaDemonanimatedEntity.createAttributes().build());
		event.put(HELBREM_ANIMATED.get(), HelbremAnimatedEntity.createAttributes().build());
		event.put(GIL_THUNDER_ANIMATED_2.get(), GilThunderAnimated2Entity.createAttributes().build());
		event.put(RED_KNIGHT_ANIMATED.get(), RedKnightAnimatedEntity.createAttributes().build());
		event.put(GREEN_KNIGHT_ANIMATED.get(), GreenKnightAnimatedEntity.createAttributes().build());
		event.put(DREYFUS_ANIMATED.get(), DreyfusAnimatedEntity.createAttributes().build());
		event.put(FAIRY_HELBREM_ANIMATED.get(), FairyHelbremAnimatedEntity.createAttributes().build());
		event.put(DEAD_HELBRAMANIMATED.get(), DeadHelbramanimatedEntity.createAttributes().build());
		event.put(VIVIAN_ANIMATED.get(), VivianAnimatedEntity.createAttributes().build());
		event.put(ROYAL_GURARD_ANIMATED.get(), RoyalGurardAnimatedEntity.createAttributes().build());
		event.put(ROYAL_GUARD_ANIMATED.get(), RoyalGuardAnimatedEntity.createAttributes().build());
		event.put(SOLDIER_ANIMATED.get(), SoldierAnimatedEntity.createAttributes().build());
		event.put(HENDRICKSON_ANIMATED.get(), HendricksonAnimatedEntity.createAttributes().build());
		event.put(STORY_BAN_2_ANIMATED.get(), StoryBan2AnimatedEntity.createAttributes().build());
		event.put(PARADA_ANIMATED.get(), ParadaAnimatedEntity.createAttributes().build());
		event.put(DEMON_HENDRICKSON_ANIMATED.get(), DemonHendricksonAnimatedEntity.createAttributes().build());
		event.put(GRAY_DEMON_HENDRICKSON_ANIMATED.get(), GrayDemonHendricksonAnimatedEntity.createAttributes().build());
		event.put(ANDRE_ANIMATED.get(), AndreAnimatedEntity.createAttributes().build());
		event.put(MURAMO_ANIMATED.get(), MuramoAnimatedEntity.createAttributes().build());
		event.put(DUMBLEBBAS_ANIMATED.get(), DumblebbasAnimatedEntity.createAttributes().build());
		event.put(WEINHEIDT_ANIMATED.get(), WeinheidtAnimatedEntity.createAttributes().build());
		event.put(HUGO_ANIMATED.get(), HugoAnimatedEntity.createAttributes().build());
		event.put(JILLIAN_ANIMATED.get(), JillianAnimatedEntity.createAttributes().build());
		event.put(SIMON_ANIMATED.get(), SimonAnimatedEntity.createAttributes().build());
		event.put(BAN_BOSS_ANIMATED.get(), BanBossAnimatedEntity.createAttributes().build());
		event.put(SLADER_ANIMATED.get(), SladerAnimatedEntity.createAttributes().build());
		event.put(GUSTAF_ANIMATED.get(), GustafAnimatedEntity.createAttributes().build());
		event.put(DIANE_BOSS_ANIMATED.get(), DianeBossAnimatedEntity.createAttributes().build());
		event.put(GOWTHER_BOSS_ANIMATED.get(), GowtherBossAnimatedEntity.createAttributes().build());
		event.put(KING_BOSS_ANIMATED.get(), KingBossAnimatedEntity.createAttributes().build());
		event.put(MELIODAS_BOSS_ANIMATED.get(), MeliodasBossAnimatedEntity.createAttributes().build());
		event.put(MERLIN_BOSS_ANIMATED.get(), MerlinBossAnimatedEntity.createAttributes().build());
		event.put(WICKED_BITE.get(), WickedBiteEntity.createAttributes().build());
		event.put(DEATH_THORN.get(), DeathThornEntity.createAttributes().build());
		event.put(BASQUIAS_GUARDIAN.get(), BasquiasGuardianEntity.createAttributes().build());
		event.put(GIGA_PICK.get(), GigaPickEntity.createAttributes().build());
		event.put(GIGA_FALL.get(), GigaFallEntity.createAttributes().build());
		event.put(GIGA_CRUSH.get(), GigaCrushEntity.createAttributes().build());
		event.put(BLACK_OUT.get(), BlackOutEntity.createAttributes().build());
		event.put(SUN_FLOWER_TRUE_SPIRT_SPEAR.get(), SunFlowerTrueSpirtSpearEntity.createAttributes().build());
		event.put(MOON_ROSE.get(), MoonRoseEntity.createAttributes().build());
		event.put(HELL_GATE_RED_DEMONS.get(), HellGateRedDemonsEntity.createAttributes().build());
		event.put(JUMANJU_ENTITY.get(), JumanjuEntityEntity.createAttributes().build());
		event.put(COCOON_OF_DARKNESS.get(), CocoonOfDarknessEntity.createAttributes().build());
		event.put(GERHEADE.get(), GerheadeEntity.createAttributes().build());
		event.put(SERVANT.get(), ServantEntity.createAttributes().build());
		event.put(MARMAS.get(), MarmasEntity.createAttributes().build());
		event.put(AEAL_HEAL.get(), AealHealEntity.createAttributes().build());
		event.put(DOGEDO.get(), DogedoEntity.createAttributes().build());
		event.put(GOWTHER_STORY_1.get(), GowtherStory1Entity.createAttributes().build());
		event.put(ALBION.get(), AlbionEntity.createAttributes().build());
		event.put(ALBION_FAT.get(), AlbionFatEntity.createAttributes().build());
		event.put(TALL_ALBION.get(), TallAlbionEntity.createAttributes().build());
		event.put(ALBION_TALL.get(), AlbionTallEntity.createAttributes().build());
		event.put(GODDESS_BLESS_ENTITY.get(), GoddessBlessEntityEntity.createAttributes().build());
		event.put(DEMON_KING.get(), DemonKingEntity.createAttributes().build());
		event.put(SMALL_HAWKS.get(), SmallHawksEntity.createAttributes().build());
		event.put(GALAND.get(), GalandEntity.createAttributes().build());
		event.put(MATRONA.get(), MatronaEntity.createAttributes().build());
		event.put(THEO.get(), TheoEntity.createAttributes().build());
		event.put(JENNA.get(), JennaEntity.createAttributes().build());
		event.put(ZANERI.get(), ZaneriEntity.createAttributes().build());
		event.put(DIAMOND_TOWER.get(), DiamondTowerEntity.createAttributes().build());
		event.put(ESCANOR_BOSS.get(), EscanorBossEntity.createAttributes().build());
		event.put(CLOVER.get(), CloverEntity.createAttributes().build());
		event.put(GLOXINA_BOSS.get(), GloxinaBossEntity.createAttributes().build());
		event.put(MOSS_DRAGON.get(), MossDragonEntity.createAttributes().build());
		event.put(TYRANT_DRAGON_CAVE.get(), TyrantDragonCaveEntity.createAttributes().build());
		event.put(ANAON.get(), AnaonEntity.createAttributes().build());
		event.put(OMINOUS_NEBULA_ENITIY.get(), OminousNebulaEnitiyEntity.createAttributes().build());
		event.put(KING_STORY_1.get(), KingStory1Entity.createAttributes().build());
		event.put(GALAND_STORY_2.get(), GalandStory2Entity.createAttributes().build());
		event.put(ELAINE_STORY.get(), ElaineStoryEntity.createAttributes().build());
		event.put(GALAND_OVER.get(), GalandOverEntity.createAttributes().build());
		event.put(REAPER_SCYTHE_ENTITY.get(), ReaperScytheEntityEntity.createAttributes().build());
		event.put(DUBS.get(), DubsEntity.createAttributes().build());
		event.put(BLUE_DEMON.get(), BlueDemonEntity.createAttributes().build());
		event.put(JIGUMO.get(), JigumoEntity.createAttributes().build());
		event.put(TORAH.get(), TorahEntity.createAttributes().build());
		event.put(GERHEADESERVANT.get(), GerheadeservantEntity.createAttributes().build());
		event.put(STONE_DROLE.get(), StoneDroleEntity.createAttributes().build());
		event.put(GOWTHER_EP_18.get(), GowtherEP18Entity.createAttributes().build());
		event.put(GLOXINIA_STORY.get(), GloxiniaStoryEntity.createAttributes().build());
		event.put(DROLE.get(), DroleEntity.createAttributes().build());
		event.put(DEIRERI_STORY.get(), DeireriStoryEntity.createAttributes().build());
		event.put(MONSPEIT_STORY.get(), MonspeitStoryEntity.createAttributes().build());
		event.put(GRAY_ROAD_STORY.get(), GrayRoadStoryEntity.createAttributes().build());
		event.put(DREYFUS_DEMON.get(), DreyfusDemonEntity.createAttributes().build());
		event.put(DROLE_STORY_2.get(), DroleStory2Entity.createAttributes().build());
		event.put(GLOXINIA_STORY_2.get(), GloxiniaStory2Entity.createAttributes().build());
		event.put(ZELDRIS_STORY.get(), ZeldrisStoryEntity.createAttributes().build());
		event.put(DEMON_MARK_MELIODAS.get(), DemonMarkMeliodasEntity.createAttributes().build());
		event.put(ESTAROSSA_STORY.get(), EstarossaStoryEntity.createAttributes().build());
		event.put(ESTARROSSA_STORY.get(), EstarrossaStoryEntity.createAttributes().build());
		event.put(GRAY_ROAD_STORY_2.get(), GrayRoadStory2Entity.createAttributes().build());
		event.put(DEIRERI_STORY_2.get(), DeireriStory2Entity.createAttributes().build());
		event.put(MONSPEIT_STORY_2.get(), MonspeitStory2Entity.createAttributes().build());
		event.put(FRAUDRIN_STORY.get(), FraudrinStoryEntity.createAttributes().build());
		event.put(ZHIVAGO.get(), ZhivagoEntity.createAttributes().build());
		event.put(DELDRY.get(), DeldryEntity.createAttributes().build());
		event.put(WAILIO.get(), WailioEntity.createAttributes().build());
		event.put(CATH.get(), CathEntity.createAttributes().build());
		event.put(KALEIDOSCOPE_ENTITY.get(), KaleidoscopeEntityEntity.createAttributes().build());
		event.put(DEATHPIERCE.get(), DeathpierceEntity.createAttributes().build());
	}
}
