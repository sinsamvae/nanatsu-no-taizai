package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

import java.util.List;
import java.util.Comparator;

public class DeldryOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		double ran = 0;
		if (entity.getPersistentData().getDouble("skill_cooldown") > 0) {
			entity.getPersistentData().putDouble("skill_cooldown", Math.round(entity.getPersistentData().getDouble("skill_cooldown") - 1));
		}
		if (entity.getPersistentData().getDouble("skill_cooldown") == 0 && !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			distance = Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2));
			ran = Mth.nextInt(RandomSource.create(), 1, 2);
			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
					((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
			if (distance <= 6) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity && entityiterator instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(CraftNoTaizaiModMobEffects.LOVE_DRIVE_EFFECT.get()))) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.LOVE_DRIVE_EFFECT.get(), 220, 3, false, false));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.HEART, x, y, z, 5, 6, 6, 6, 0.1);
						}
					}
				}
			}
			entity.getPersistentData().putDouble("skill_cooldown", (Mth.nextInt(RandomSource.create(), 200, 350)));
		}
	}
}
