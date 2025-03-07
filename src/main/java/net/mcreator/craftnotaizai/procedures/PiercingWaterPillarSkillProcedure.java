package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.List;
import java.util.Comparator;

public class PiercingWaterPillarSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity target = null;
		double delay = 0;
		double damage = 0;
		{
			final Vec3 _center = new Vec3(
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof ItemEntity || entityiterator instanceof ExperienceOrb || (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
						|| (entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) || entityiterator == entity) && target == null) {
					target = entityiterator;
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 255, false, false));
				}
			}
		}
		if (!(target == null)) {
			entity.getPersistentData().putDouble("targX", (target.getX()));
			entity.getPersistentData().putDouble("targY", (target.getY()));
			entity.getPersistentData().putDouble("targZ", (target.getZ()));
			entity.getPersistentData().putDouble("height", 0);
			entity.getPersistentData().putDouble("height2", 0);
			damage = Math.ceil(0.1 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack
					* (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack_boost) + 1;
			damage = damage * ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage / 100);
			for (int index0 = 0; index0 < 120; index0++) {
				delay = delay + 0.3;
				target.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:water_magic")))), (float) damage);
				CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
					entity.getPersistentData().putDouble("height", (entity.getPersistentData().getDouble("height") + (2 * Math.PI) / 60));
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.WATER_FALL.get()), (entity.getPersistentData().getDouble("targX") + Math.sin(entity.getPersistentData().getDouble("height")) * 3),
								(entity.getPersistentData().getDouble("targY") + 0.2), (entity.getPersistentData().getDouble("targZ") + Math.cos(entity.getPersistentData().getDouble("height")) * 3), 5, 0, 0, 0, 0.1);
				});
				CraftNoTaizaiMod.queueServerWork((int) Math.ceil(delay + 36), () -> {
					entity.getPersistentData().putDouble("height2", (entity.getPersistentData().getDouble("height2") + (2 * Math.PI) / 60));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FALLING_WATER, (entity.getPersistentData().getDouble("targX") + Math.sin(entity.getPersistentData().getDouble("height2")) * 3),
								(entity.getPersistentData().getDouble("targY") + entity.getPersistentData().getDouble("height2") + 0.2), (entity.getPersistentData().getDouble("targZ") + Math.cos(entity.getPersistentData().getDouble("height2")) * 3),
								5, 0, 0, 0, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FALLING_WATER, (entity.getPersistentData().getDouble("targX") - Math.sin(entity.getPersistentData().getDouble("height2")) * 3),
								(entity.getPersistentData().getDouble("targY") + entity.getPersistentData().getDouble("height2") + 0.2), (entity.getPersistentData().getDouble("targZ") - Math.cos(entity.getPersistentData().getDouble("height2")) * 3),
								5, 0, 0, 0, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.WATER_FALL.get()), (entity.getPersistentData().getDouble("targX") + Math.sin(entity.getPersistentData().getDouble("height2")) * 3),
								(entity.getPersistentData().getDouble("targY") + 0.2), (entity.getPersistentData().getDouble("targZ") + Math.cos(entity.getPersistentData().getDouble("height2")) * 3), 5, 0, 0, 0, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.WATER_FALL.get()), (entity.getPersistentData().getDouble("targX") - Math.sin(entity.getPersistentData().getDouble("height2")) * 3),
								(entity.getPersistentData().getDouble("targY") + entity.getPersistentData().getDouble("height2") + 0.2), (entity.getPersistentData().getDouble("targZ") - Math.cos(entity.getPersistentData().getDouble("height2")) * 3),
								5, 0, 0, 0, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE, (entity.getPersistentData().getDouble("targX") + Math.sin(entity.getPersistentData().getDouble("height2")) * 3),
								(entity.getPersistentData().getDouble("targY") + entity.getPersistentData().getDouble("height2") + 0.2), (entity.getPersistentData().getDouble("targZ") + Math.cos(entity.getPersistentData().getDouble("height2")) * 3),
								5, 0, 0, 0, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE, (entity.getPersistentData().getDouble("targX") - Math.sin(entity.getPersistentData().getDouble("height2")) * 3),
								(entity.getPersistentData().getDouble("targY") + entity.getPersistentData().getDouble("height2") + 0.2), (entity.getPersistentData().getDouble("targZ") - Math.cos(entity.getPersistentData().getDouble("height2")) * 3),
								5, 0, 0, 0, 0.1);
				});
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
			}
		}
	}
}
