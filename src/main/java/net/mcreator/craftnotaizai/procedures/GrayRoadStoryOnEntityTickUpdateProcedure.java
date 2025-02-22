package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.FiveLostProjectileEntity;
import net.mcreator.craftnotaizai.entity.BreakableBugProjectileEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.List;
import java.util.Comparator;

public class GrayRoadStoryOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity entity_target = null;
		boolean target = false;
		double distance = 0;
		double ran = 0;
		double delay = 0;
		double a = 0;
		double r = 0;
		double b = 0;
		double damage = 0;
		if (entity.getPersistentData().getDouble("skill_cooldown") > 0) {
			entity.getPersistentData().putDouble("skill_cooldown", Math.round(entity.getPersistentData().getDouble("skill_cooldown") - 1));
		}
		if (entity.getPersistentData().getDouble("skill_cooldown") == 0 && !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			distance = Math.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2));
			ran = Mth.nextInt(RandomSource.create(), 1, 3);
			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
					((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
			if (distance <= 6) {
				if (ran == 1) {
					for (int index0 = 0; index0 < 8; index0++) {
						CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
											AbstractArrow entityToSpawn = new BreakableBugProjectileEntity(CraftNoTaizaiModEntities.BREAKABLE_BUG_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1, 1);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 10);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						});
					}
				}
				if (ran == 2) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new FiveLostProjectileEntity(CraftNoTaizaiModEntities.FIVE_LOST_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1, 1);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 10);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				}
				if (ran == 3) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator && entityiterator instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(CraftNoTaizaiModMobEffects.JUBAKU_ENSA_EFFECT.get()))) {
								if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:commandments")))) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.JUBAKU_ENSA_EFFECT.get(), 12000, 1, false, false));
									for (int index1 = 0; index1 < 15; index1++) {
										r = 7;
										a = Mth.nextInt(RandomSource.create(), -180, 180);
										b = Mth.nextInt(RandomSource.create(), -90, 90);
										for (int index2 = 0; index2 < 90; index2++) {
											if (world instanceof ServerLevel _level)
												_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.JUBAKUENSA_PARTICLE.get()), (entityiterator.getX() - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))),
														(entityiterator.getY() - r * Math.sin(Math.toRadians(b))), (entityiterator.getZ() + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))), 1, 0.1, 0.1, 0.1, 0);
											r = r - 0.1;
										}
									}
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 255, false, false));
								}
							}
						}
					}
				}
			}
			entity.getPersistentData().putDouble("skill_cooldown", (Mth.nextInt(RandomSource.create(), 150, 300)));
		}
	}
}
