package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class EntityCombatSystemProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		double ran = 0;
		double delay = 0;
		double damage = 0;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:sds_entities")))) {
			if (entity.getPersistentData().getDouble("ai_cooldown") > 0) {
				entity.getPersistentData().putDouble("ai_cooldown", Math.round(entity.getPersistentData().getDouble("ai_cooldown") - 1));
			}
			if (entity.getPersistentData().getDouble("ai_cooldown") == 0 && !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				distance = Math
						.sqrt(Math.pow(entity.getX() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX(), 2) + Math.pow(entity.getZ() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ(), 2));
				ran = Mth.nextInt(RandomSource.create(), 1, 2);
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
						((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
				if (distance <= 3) {
					if (ran == 1) {
						{
							final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x), (entity.getY() + entity.getLookAngle().y + 1.8), (entity.getZ() + entity.getLookAngle().z));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity || entityiterator instanceof ItemEntity || entityiterator instanceof ExperienceOrb
										|| (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
										|| (entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) || new Object() {
											public boolean checkGamemode(Entity _ent) {
												if (_ent instanceof ServerPlayer _serverPlayer) {
													return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
												} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
													return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
															&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
												}
												return false;
											}
										}.checkGamemode(entityiterator) || new Object() {
											public boolean checkGamemode(Entity _ent) {
												if (_ent instanceof ServerPlayer _serverPlayer) {
													return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
												} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
													return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
															&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
												}
												return false;
											}
										}.checkGamemode(entityiterator))) {
									if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:commandments")))) {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.EXPLOSION, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 1.3, 1, 1.3, 0.1);
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")),
														SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")),
														SoundSource.NEUTRAL, 1, 1, false);
											}
										}
										entityiterator.setDeltaMovement(new Vec3(((entityiterator.getDeltaMovement().x() + entityiterator.getLookAngle().x) * 0), ((entityiterator.getDeltaMovement().y() + entityiterator.getLookAngle().y) * (-5)),
												((entityiterator.getDeltaMovement().z() + entityiterator.getLookAngle().z) * 0)));
										entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)),
												(float) (entity instanceof LivingEntity _attributeContext ? _attributeContext.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE) : 0.0D));
									}
								}
							}
						}
					}
					if (ran == 2) {
						{
							final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x), (entity.getY() + entity.getLookAngle().y + 1.8), (entity.getZ() + entity.getLookAngle().z));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:commandments")))) {
									if (!(entityiterator == entity || entityiterator instanceof ItemEntity || entityiterator instanceof ExperienceOrb
											|| (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
											|| (entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) || new Object() {
												public boolean checkGamemode(Entity _ent) {
													if (_ent instanceof ServerPlayer _serverPlayer) {
														return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
													} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
														return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
																&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
													}
													return false;
												}
											}.checkGamemode(entityiterator) || new Object() {
												public boolean checkGamemode(Entity _ent) {
													if (_ent instanceof ServerPlayer _serverPlayer) {
														return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
													} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
														return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
																&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
													}
													return false;
												}
											}.checkGamemode(entityiterator))) {
										for (int index0 = 0; index0 < 18; index0++) {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 1.3, 1, 1.3, 0.1);
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()),
															ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
												} else {
													_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")),
															SoundSource.NEUTRAL, 1, 1, false);
												}
											}
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)),
													(float) (entity instanceof LivingEntity _attributeContext ? _attributeContext.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE) : 0.0D));
										}
									}
								}
							}
						}
					}
				}
				entity.getPersistentData().putDouble("ai_cooldown", (Mth.nextInt(RandomSource.create(), 200, 400)));
			}
		}
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:commandments")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get());
		}
	}
}
