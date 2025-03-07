
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftnotaizai.potion.VenomToxicyPotionMobEffect;
import net.mcreator.craftnotaizai.potion.VeinPotionEffectMobEffect;
import net.mcreator.craftnotaizai.potion.StufEffectMobEffect;
import net.mcreator.craftnotaizai.potion.StaffOfImrisonmentEffectMobEffect;
import net.mcreator.craftnotaizai.potion.SelflessnessEffectMobEffect;
import net.mcreator.craftnotaizai.potion.PurgatoryFlameMobEffect;
import net.mcreator.craftnotaizai.potion.PowerAmplifyEffectMobEffect;
import net.mcreator.craftnotaizai.potion.PhysicalHuntNegitiveMobEffect;
import net.mcreator.craftnotaizai.potion.OverPowerEffectMobEffect;
import net.mcreator.craftnotaizai.potion.NightmaretellerMobEffect;
import net.mcreator.craftnotaizai.potion.NecrosisMobEffect;
import net.mcreator.craftnotaizai.potion.MinimumTabletsEffectMobEffect;
import net.mcreator.craftnotaizai.potion.MelodyMobEffect;
import net.mcreator.craftnotaizai.potion.ManaRegenEffetMobEffect;
import net.mcreator.craftnotaizai.potion.LoveDriveEffectMobEffect;
import net.mcreator.craftnotaizai.potion.KingTrumpetMobEffect;
import net.mcreator.craftnotaizai.potion.JubakuEnsaEffectMobEffect;
import net.mcreator.craftnotaizai.potion.HeavyMetalMobEffect;
import net.mcreator.craftnotaizai.potion.GlowEffectMobEffect;
import net.mcreator.craftnotaizai.potion.FrezzeMobEffect;
import net.mcreator.craftnotaizai.potion.FreezeCoffinPotionEffectMobEffect;
import net.mcreator.craftnotaizai.potion.FossilizationEffectMobEffect;
import net.mcreator.craftnotaizai.potion.BlackOutEffectMobEffect;
import net.mcreator.craftnotaizai.potion.BindMobEffect;
import net.mcreator.craftnotaizai.potion.AleEffectMobEffect;
import net.mcreator.craftnotaizai.potion.AlcoholEffectMobEffect;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class CraftNoTaizaiModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<MobEffect> FREZZE = REGISTRY.register("frezze", () -> new FrezzeMobEffect());
	public static final RegistryObject<MobEffect> NIGHTMARETELLER = REGISTRY.register("nightmareteller", () -> new NightmaretellerMobEffect());
	public static final RegistryObject<MobEffect> KING_TRUMPET = REGISTRY.register("king_trumpet", () -> new KingTrumpetMobEffect());
	public static final RegistryObject<MobEffect> BIND = REGISTRY.register("bind", () -> new BindMobEffect());
	public static final RegistryObject<MobEffect> PURGATORY_FLAME = REGISTRY.register("purgatory_flame", () -> new PurgatoryFlameMobEffect());
	public static final RegistryObject<MobEffect> MINIMUM_TABLETS_EFFECT = REGISTRY.register("minimum_tablets_effect", () -> new MinimumTabletsEffectMobEffect());
	public static final RegistryObject<MobEffect> FREEZE_COFFIN_POTION_EFFECT = REGISTRY.register("freeze_coffin_potion_effect", () -> new FreezeCoffinPotionEffectMobEffect());
	public static final RegistryObject<MobEffect> MANA_REGEN_EFFET = REGISTRY.register("mana_regen_effet", () -> new ManaRegenEffetMobEffect());
	public static final RegistryObject<MobEffect> POWER_AMPLIFY_EFFECT = REGISTRY.register("power_amplify_effect", () -> new PowerAmplifyEffectMobEffect());
	public static final RegistryObject<MobEffect> FOSSILIZATION_EFFECT = REGISTRY.register("fossilization_effect", () -> new FossilizationEffectMobEffect());
	public static final RegistryObject<MobEffect> NECROSIS = REGISTRY.register("necrosis", () -> new NecrosisMobEffect());
	public static final RegistryObject<MobEffect> BLACK_OUT_EFFECT = REGISTRY.register("black_out_effect", () -> new BlackOutEffectMobEffect());
	public static final RegistryObject<MobEffect> JUBAKU_ENSA_EFFECT = REGISTRY.register("jubaku_ensa_effect", () -> new JubakuEnsaEffectMobEffect());
	public static final RegistryObject<MobEffect> VENOM_TOXICY_POTION = REGISTRY.register("venom_toxicy_potion", () -> new VenomToxicyPotionMobEffect());
	public static final RegistryObject<MobEffect> HEAVY_METAL = REGISTRY.register("heavy_metal", () -> new HeavyMetalMobEffect());
	public static final RegistryObject<MobEffect> PHYSICAL_HUNT_NEGITIVE = REGISTRY.register("physical_hunt_negitive", () -> new PhysicalHuntNegitiveMobEffect());
	public static final RegistryObject<MobEffect> OVER_POWER_EFFECT = REGISTRY.register("over_power_effect", () -> new OverPowerEffectMobEffect());
	public static final RegistryObject<MobEffect> SELFLESSNESS_EFFECT = REGISTRY.register("selflessness_effect", () -> new SelflessnessEffectMobEffect());
	public static final RegistryObject<MobEffect> STAFF_OF_IMRISONMENT_EFFECT = REGISTRY.register("staff_of_imrisonment_effect", () -> new StaffOfImrisonmentEffectMobEffect());
	public static final RegistryObject<MobEffect> LOVE_DRIVE_EFFECT = REGISTRY.register("love_drive_effect", () -> new LoveDriveEffectMobEffect());
	public static final RegistryObject<MobEffect> VEIN_POTION_EFFECT = REGISTRY.register("vein_potion_effect", () -> new VeinPotionEffectMobEffect());
	public static final RegistryObject<MobEffect> MELODY = REGISTRY.register("melody", () -> new MelodyMobEffect());
	public static final RegistryObject<MobEffect> ALE_EFFECT = REGISTRY.register("ale_effect", () -> new AleEffectMobEffect());
	public static final RegistryObject<MobEffect> GLOW_EFFECT = REGISTRY.register("glow_effect", () -> new GlowEffectMobEffect());
	public static final RegistryObject<MobEffect> ALCOHOL_EFFECT = REGISTRY.register("alcohol_effect", () -> new AlcoholEffectMobEffect());
	public static final RegistryObject<MobEffect> STUF_EFFECT = REGISTRY.register("stuf_effect", () -> new StufEffectMobEffect());
}
