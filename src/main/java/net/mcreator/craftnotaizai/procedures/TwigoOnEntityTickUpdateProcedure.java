package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.WindShotProjectileEntity;
import net.mcreator.craftnotaizai.entity.TwigoAnimatedEntity;

import java.util.List;
import java.util.Comparator;

public class TwigoOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double a = 0;
		double r = 0;
		double b = 0;
		double delay = 0;
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
				if (ran == 1) {
					if (entity instanceof TwigoAnimatedEntity) {
						((TwigoAnimatedEntity) entity).setAnimation("attack_2");
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new WindShotProjectileEntity(CraftNoTaizaiModEntities.WIND_SHOT_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1, 1);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				}
				if (ran == 2) {
					if (entity instanceof TwigoAnimatedEntity) {
						((TwigoAnimatedEntity) entity).setAnimation("attack_3");
					}
					r = 2;
					a = entity.getYRot();
					b = entity.getXRot();
					for (int index0 = 0; index0 < 120; index0++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands()
									.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL,
											new Vec3((x - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))), ((y + 1.5) - r * Math.sin(Math.toRadians(b))), (z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a)))), Vec2.ZERO,
											_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "particle dust 1 1 1 3 ~ ~1 ~ 0 0 0 0 1");
						{
							final Vec3 _center = new Vec3((x - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))), ((y + 1) - r * Math.sin(Math.toRadians(b))), (z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:mana_dmg")))),
										entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
							}
						}
						b = b + 1;
					}
				}
			}
			entity.getPersistentData().putDouble("skill_cooldown", (Mth.nextInt(RandomSource.create(), 100, 250)));
		}
	}
}
