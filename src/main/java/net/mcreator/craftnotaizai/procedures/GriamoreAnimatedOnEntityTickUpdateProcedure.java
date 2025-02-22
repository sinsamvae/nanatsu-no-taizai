package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.entity.GriamoreAnimatedEntity;

import java.util.List;
import java.util.Comparator;

public class GriamoreAnimatedOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double a = 0;
		double hit = 0;
		double r = 0;
		double b = 0;
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
				if (entity instanceof GriamoreAnimatedEntity _datEntSetL)
					_datEntSetL.getEntityData().set(GriamoreAnimatedEntity.DATA_wall, true);
			}
			entity.getPersistentData().putDouble("skill_cooldown", (Mth.nextInt(RandomSource.create(), 150, 250)));
		}
		if ((entity instanceof GriamoreAnimatedEntity _datEntL23 && _datEntL23.getEntityData().get(GriamoreAnimatedEntity.DATA_wall)) == true) {
			entity.getPersistentData().putDouble("wall", (entity.getPersistentData().getDouble("wall") + 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10, 1, false, false));
			r = 1.5;
			a = Math.random() * 12;
			b = 90;
			for (int index0 = 0; index0 < 30; index0++) {
				for (int index1 = 0; index1 < 16; index1++) {
					world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.PERFECTSHELLPARTICLE.get()), (x - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))), ((y + 1) - r * Math.sin(Math.toRadians(b))),
							(z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))), 0, 0, 0);
					b = b + 12;
				}
				b = 90;
				a = a + 12;
			}
			{
				final Vec3 _center = new Vec3(x, (y + 1), z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:mana_dmg")))),
								entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
						entityiterator.setDeltaMovement(new Vec3(((-1.5) * entityiterator.getDeltaMovement().x()), ((-1.5) * entityiterator.getDeltaMovement().y()), ((-1.5) * entityiterator.getDeltaMovement().z())));
					}
				}
			}
			if (entity.getPersistentData().getDouble("wall") > 160) {
				entity.getPersistentData().putDouble("wall", 0);
				if (entity instanceof GriamoreAnimatedEntity _datEntSetL)
					_datEntSetL.getEntityData().set(GriamoreAnimatedEntity.DATA_wall, false);
			}
		}
	}
}
