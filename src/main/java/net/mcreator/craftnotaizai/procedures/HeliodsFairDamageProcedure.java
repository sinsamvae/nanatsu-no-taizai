package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import java.util.List;
import java.util.Comparator;

public class HeliodsFairDamageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double damage = 0;
		damage = Math.ceil(0.1 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack
				* (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack_boost) + 4;
		damage = damage * ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage / 100);
		if (world.dayTime() % 24000 >= 23000 && world.dayTime() % 24000 <= 23460) {
			damage = Math.ceil(damage * 1);
		} else if (world.dayTime() % 24000 >= 23460 && world.dayTime() % 24000 <= 23992) {
			damage = Math.ceil(damage * 1.3);
		} else if (world.dayTime() % 24000 >= 23992 && world.dayTime() % 24000 <= 0) {
			damage = Math.ceil(damage * 1.5);
		} else if (world.dayTime() % 24000 >= 0 && world.dayTime() % 24000 <= 1000) {
			damage = Math.ceil(damage * 1.8);
		} else if (world.dayTime() % 24000 >= 1000 && world.dayTime() % 24000 <= 6000) {
			damage = Math.ceil(damage * 2);
		} else if (world.dayTime() % 24000 >= 6000 && world.dayTime() % 24000 <= 9000) {
			damage = Math.ceil(damage * 10);
		} else if (world.dayTime() % 24000 >= 9000 && world.dayTime() % 24000 <= 12542) {
			damage = Math.ceil(damage / 1.3);
		} else if (world.dayTime() % 24000 >= 12542 && world.dayTime() % 24000 <= 12786) {
			damage = Math.ceil(damage / 1.5);
		} else if (world.dayTime() % 24000 >= 12786 && world.dayTime() % 24000 <= 13000) {
			damage = Math.ceil(damage / 1.8);
		} else if (world.dayTime() % 24000 >= 13000 && world.dayTime() % 24000 <= 13670) {
			damage = Math.ceil(damage / 2);
		} else if (world.dayTime() % 24000 >= 18000 && world.dayTime() % 24000 <= 22300) {
			damage = Math.ceil(damage / 10);
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
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
					entityiterator.setSecondsOnFire(10);
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:fire_magic")))), 1);
				}
			}
		}
	}
}
