
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftnotaizai.client.particle.WhiteParticle;
import net.mcreator.craftnotaizai.client.particle.VenomToxicyParticle;
import net.mcreator.craftnotaizai.client.particle.SmokeParticle;
import net.mcreator.craftnotaizai.client.particle.Smoke2Particle;
import net.mcreator.craftnotaizai.client.particle.RedParticlesParticle;
import net.mcreator.craftnotaizai.client.particle.PurpleParticle;
import net.mcreator.craftnotaizai.client.particle.PurpleFlameParticle;
import net.mcreator.craftnotaizai.client.particle.PurgatoryFireParticlesParticle;
import net.mcreator.craftnotaizai.client.particle.PunchEffectParticle;
import net.mcreator.craftnotaizai.client.particle.PosionParticle;
import net.mcreator.craftnotaizai.client.particle.PinkParticle;
import net.mcreator.craftnotaizai.client.particle.PerfectshellparticleParticle;
import net.mcreator.craftnotaizai.client.particle.ParticleArkParticle;
import net.mcreator.craftnotaizai.client.particle.OminousNebulaParticleParticle;
import net.mcreator.craftnotaizai.client.particle.LightningParticle;
import net.mcreator.craftnotaizai.client.particle.Lightning2Particle;
import net.mcreator.craftnotaizai.client.particle.KillerbregParticlesParticle;
import net.mcreator.craftnotaizai.client.particle.JubakuensaParticleParticle;
import net.mcreator.craftnotaizai.client.particle.JubakuEnsaParticle2Particle;
import net.mcreator.craftnotaizai.client.particle.IceParticle;
import net.mcreator.craftnotaizai.client.particle.HunterWispparticleParticle;
import net.mcreator.craftnotaizai.client.particle.HellGateParticlesParticle;
import net.mcreator.craftnotaizai.client.particle.HealingGardenParticlesParticle;
import net.mcreator.craftnotaizai.client.particle.HealParticle;
import net.mcreator.craftnotaizai.client.particle.GravityParticlesParticle;
import net.mcreator.craftnotaizai.client.particle.GoddessParticleParticle;
import net.mcreator.craftnotaizai.client.particle.FreezeCoffinParticle;
import net.mcreator.craftnotaizai.client.particle.FlamePurpleParticle;
import net.mcreator.craftnotaizai.client.particle.FeatherParticle;
import net.mcreator.craftnotaizai.client.particle.DarkSnowParticle;
import net.mcreator.craftnotaizai.client.particle.DarkSnow2Particle;
import net.mcreator.craftnotaizai.client.particle.ChastifolRedParticlesParticle;
import net.mcreator.craftnotaizai.client.particle.BreakerOffParticleParticle;
import net.mcreator.craftnotaizai.client.particle.BlackOutParticleParticle;
import net.mcreator.craftnotaizai.client.particle.BlackLightningParticle;
import net.mcreator.craftnotaizai.client.particle.BasquiasParticleParticle;
import net.mcreator.craftnotaizai.client.particle.ArkparticleParticle;
import net.mcreator.craftnotaizai.client.particle.AcidTowerparticle2Particle;
import net.mcreator.craftnotaizai.client.particle.AcidTowerParticle1Particle;
import net.mcreator.craftnotaizai.client.particle.AcidParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftNoTaizaiModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.PURPLE_FLAME.get(), PurpleFlameParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.ACID.get(), AcidParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.LIGHTNING.get(), LightningParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.HUNTER_WISPPARTICLE.get(), HunterWispparticleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.WHITE.get(), WhiteParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.PINK.get(), PinkParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.PURPLE.get(), PurpleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.PERFECTSHELLPARTICLE.get(), PerfectshellparticleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.HEAL.get(), HealParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.POSION.get(), PosionParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.ICE.get(), IceParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.ARKPARTICLE.get(), ArkparticleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.SMOKE.get(), SmokeParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.SMOKE_2.get(), Smoke2Particle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.KILLERBREG_PARTICLES.get(), KillerbregParticlesParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.GRAVITY_PARTICLES.get(), GravityParticlesParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.ACID_TOWER_PARTICLE_1.get(), AcidTowerParticle1Particle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.ACID_TOWERPARTICLE_2.get(), AcidTowerparticle2Particle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.DARK_SNOW.get(), DarkSnowParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.PUNCH_EFFECT.get(), PunchEffectParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.DARK_SNOW_2.get(), DarkSnow2Particle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.FREEZE_COFFIN.get(), FreezeCoffinParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.BLACK_LIGHTNING.get(), BlackLightningParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.CHASTIFOL_RED_PARTICLES.get(), ChastifolRedParticlesParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.FLAME_PURPLE.get(), FlamePurpleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.HEALING_GARDEN_PARTICLES.get(), HealingGardenParticlesParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.PARTICLE_ARK.get(), ParticleArkParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.FEATHER.get(), FeatherParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.GODDESS_PARTICLE.get(), GoddessParticleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.BLACK_OUT_PARTICLE.get(), BlackOutParticleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.BASQUIAS_PARTICLE.get(), BasquiasParticleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.JUBAKUENSA_PARTICLE.get(), JubakuensaParticleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.JUBAKU_ENSA_PARTICLE_2.get(), JubakuEnsaParticle2Particle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.VENOM_TOXICY.get(), VenomToxicyParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.RED_PARTICLES.get(), RedParticlesParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.HELL_GATE_PARTICLES.get(), HellGateParticlesParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.LIGHTNING_2.get(), Lightning2Particle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.BREAKER_OFF_PARTICLE.get(), BreakerOffParticleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.OMINOUS_NEBULA_PARTICLE.get(), OminousNebulaParticleParticle::provider);
		event.registerSpriteSet(CraftNoTaizaiModParticleTypes.PURGATORY_FIRE_PARTICLES.get(), PurgatoryFireParticlesParticle::provider);
	}
}
