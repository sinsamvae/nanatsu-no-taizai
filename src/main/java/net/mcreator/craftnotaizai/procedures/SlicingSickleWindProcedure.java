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
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

import java.util.List;
import java.util.Comparator;

public class SlicingSickleWindProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		double radianArc = 0;
		double d = 0;
		double verticalOffset = 0;
		double sign = 0;
		double rollAngle = 0;
		double horizontalOffsetDir = 0;
		double dMajor = 0;
		double horizontalOffsetMag = 0;
		double circleDistanceConstant = 0;
		double radianSteps = 0;
		double arcStart = 0;
		double damage = 0;
		circleDistanceConstant = 4;
		rollAngle = 90;
		horizontalOffsetMag = 0;
		horizontalOffsetDir = 0;
		verticalOffset = 0;
		dMajor = circleDistanceConstant;
		d = circleDistanceConstant * Math.cos(Math.toRadians(rollAngle));
		i = (0 * Math.PI) / 3;
		radianArc = (3 * Math.PI) / 4;
		radianSteps = (2 * Math.PI) / 16;
		arcStart = Math.toRadians(entity.getYRot() + 90);
		damage = Math.ceil(0.1 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack
				* (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack_boost) + 1;
		damage = damage * ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage / 100);
		while (i <= radianArc) {
			if (0 > Math.sin(i)) {
				sign = -1;
			} else {
				sign = 1;
			}
			for (int index1 = 0; index1 < 250; index1++) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.WHITE.get()),
							(dMajor * Math.cos(i) * Math.cos(arcStart) - d * Math.sin(i) * Math.sin(arcStart) + entity.getX() + entity.getLookAngle().x + horizontalOffsetMag * Math.sin(Math.toRadians(entity.getYRot() + 180 + horizontalOffsetDir))),
							(sign * Math.sqrt(Math.abs(Math.sin(Math.toRadians(rollAngle))) * (Math.pow(dMajor, 2) - Math.pow(dMajor * Math.cos(i), 2))) + entity.getY() + 1 + verticalOffset),
							(dMajor * Math.cos(i) * Math.sin(arcStart) + d * Math.sin(i) * Math.cos(arcStart) + (entity.getZ() + entity.getLookAngle().z) - horizontalOffsetMag * Math.cos(Math.toRadians(entity.getYRot() + 180 + horizontalOffsetDir))),
							1, 1, 1, 1, 0);
				{
					final Vec3 _center = new Vec3(
							(dMajor * Math.cos(i) * Math.cos(arcStart) - d * Math.sin(i) * Math.sin(arcStart) + entity.getX() + entity.getLookAngle().x + horizontalOffsetMag * Math.sin(Math.toRadians(entity.getYRot() + 180 + horizontalOffsetDir))),
							(sign * Math.sqrt(Math.abs(Math.sin(Math.toRadians(rollAngle))) * (Math.pow(dMajor, 2) - Math.pow(dMajor * Math.cos(i), 2))) + entity.getY() + 1 + verticalOffset), (dMajor * Math.cos(i) * Math.sin(arcStart)
									+ d * Math.sin(i) * Math.cos(arcStart) + (entity.getZ() + entity.getLookAngle().z) - horizontalOffsetMag * Math.cos(Math.toRadians(entity.getYRot() + 180 + horizontalOffsetDir))));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
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
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), (float) damage);
						}
					}
				}
			}
			i = i + radianSteps;
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
		}
	}
}
