package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import java.util.List;
import java.util.Comparator;

public class SunflowerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double height = 0;
		double damage = 0;
		double range = 0;
		entity.getPersistentData().putDouble("Despawn", (entity.getPersistentData().getDouble("Despawn") + 1));
		if (entity.getPersistentData().getDouble("Despawn") >= 30) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (!((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == null)) {
			damage = Math.ceil(
					0.1 * ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack
							* ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack_boost)
					+ 5;
			damage = damage * (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage / 100);
			entity.getPersistentData().putDouble("posX", (entity.getX() + entity.getLookAngle().x));
			entity.getPersistentData().putDouble("posY", (entity.getY() + 3.28 + entity.getLookAngle().y));
			entity.getPersistentData().putDouble("posZ", (entity.getZ() + entity.getLookAngle().z));
			entity.getPersistentData().putDouble("velX", (entity.getLookAngle().x / 10));
			entity.getPersistentData().putDouble("velY", (entity.getLookAngle().y / 10));
			entity.getPersistentData().putDouble("velZ", (entity.getLookAngle().z / 10));
			for (int index0 = 0; index0 < (int) (25 * 10); index0++) {
				entity.getPersistentData().putDouble("posX", (entity.getPersistentData().getDouble("posX") + entity.getPersistentData().getDouble("velX")));
				entity.getPersistentData().putDouble("posY", (entity.getPersistentData().getDouble("posY") + entity.getPersistentData().getDouble("velY")));
				entity.getPersistentData().putDouble("posZ", (entity.getPersistentData().getDouble("posZ") + entity.getPersistentData().getDouble("velZ")));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getPersistentData().getDouble("posX"), entity.getPersistentData().getDouble("posY"), entity.getPersistentData().getDouble("posZ")),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, (float) 0.05, 1);
					} else {
						_level.playLocalSound((entity.getPersistentData().getDouble("posX")), (entity.getPersistentData().getDouble("posY")), (entity.getPersistentData().getDouble("posZ")),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, (float) 0.05, 1, false);
					}
				}
				{
					final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("posX")), (entity.getPersistentData().getDouble("posY")), (entity.getPersistentData().getDouble("posZ")));
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
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:mana_dmg")))),
									(float) damage);
						}
					}
				}
				if (world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("posX"), entity.getPersistentData().getDouble("posY"), entity.getPersistentData().getDouble("posZ"))).canOcclude()) {
					if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING)) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, (entity.getPersistentData().getDouble("posX")), (entity.getPersistentData().getDouble("posY")), (entity.getPersistentData().getDouble("posZ")), 3, Level.ExplosionInteraction.BLOCK);
					} else {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, (entity.getPersistentData().getDouble("posX")), (entity.getPersistentData().getDouble("posY")), (entity.getPersistentData().getDouble("posZ")), 3, 3, 3, 3, 1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entity.getPersistentData().getDouble("posX"), entity.getPersistentData().getDouble("posY"), entity.getPersistentData().getDouble("posZ")),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, (float) 0.05, 1);
							} else {
								_level.playLocalSound((entity.getPersistentData().getDouble("posX")), (entity.getPersistentData().getDouble("posY")), (entity.getPersistentData().getDouble("posZ")),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, (float) 0.05, 1, false);
							}
						}
					}
				}
			}
		}
	}
}
