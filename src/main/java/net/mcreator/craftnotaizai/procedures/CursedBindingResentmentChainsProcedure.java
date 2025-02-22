package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

import java.util.List;
import java.util.Comparator;

public class CursedBindingResentmentChainsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double a = 0;
		double r = 0;
		double b = 0;
		Entity entity_target = null;
		boolean target = false;
		if (entity.onGround()) {
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(target || entity == entityiterator) && (entityiterator instanceof Player || entityiterator instanceof LivingEntity)) {
						target = true;
						entity_target = entityiterator;
					}
				}
			}
			if (target && entity_target instanceof LivingEntity) {
				if (entity_target instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 255, false, false));
				if (entity_target instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.JUBAKU_ENSA_EFFECT.get(), 12000, 1, false, false));
				for (int index0 = 0; index0 < 15; index0++) {
					r = 7;
					a = Mth.nextInt(RandomSource.create(), -180, 180);
					b = Mth.nextInt(RandomSource.create(), -90, 90);
					for (int index1 = 0; index1 < 90; index1++) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.JUBAKUENSA_PARTICLE.get()), (entity_target.getX() - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))),
									(entity_target.getY() - r * Math.sin(Math.toRadians(b))), (entity_target.getZ() + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))), 1, 0.1, 0.1, 0.1, 0);
						r = r - 0.1;
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You need to be grounded to use this move!"), true);
		}
	}
}
