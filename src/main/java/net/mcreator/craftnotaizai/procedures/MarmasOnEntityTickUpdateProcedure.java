package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.entity.MarmasEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.List;
import java.util.Comparator;

public class MarmasOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
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
				if (entity instanceof MarmasEntity) {
					((MarmasEntity) entity).setAnimation("attack_2");
				}
				CraftNoTaizaiMod.queueServerWork(8, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.GRAVITY_PARTICLES.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 30, 4, 3, 4, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.GRAVITY_PARTICLES.get()), (entity.getX()), (entity.getY() + 1), (entity.getZ()), 30, 1, 1, 1, 0);
					{
						final Vec3 _center = new Vec3(
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
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
								{
									Entity _ent = entityiterator;
									_ent.setYRot((float) (entityiterator.getYRot() + Mth.nextInt(RandomSource.create(), -3, 3)));
									_ent.setXRot((float) (entityiterator.getXRot() + Mth.nextInt(RandomSource.create(), -3, 3)));
									_ent.setYBodyRot(_ent.getYRot());
									_ent.setYHeadRot(_ent.getYRot());
									_ent.yRotO = _ent.getYRot();
									_ent.xRotO = _ent.getXRot();
									if (_ent instanceof LivingEntity _entity) {
										_entity.yBodyRotO = _entity.getYRot();
										_entity.yHeadRotO = _entity.getYRot();
									}
								}
								if (!Screen.hasShiftDown()) {
									entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x() + Mth.nextInt(RandomSource.create(), (int) (-0.1), (int) 0.1)), (entityiterator.getDeltaMovement().y()),
											(entityiterator.getDeltaMovement().z() + Mth.nextInt(RandomSource.create(), (int) (-0.1), (int) 0.1))));
								}
								if (Math.random() <= 0.3) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:mana_dmg")))),
											entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
								}
							}
						}
					}
				});
			}
			entity.getPersistentData().putDouble("skill_cooldown", (Mth.nextInt(RandomSource.create(), 200, 225)));
		}
	}
}
