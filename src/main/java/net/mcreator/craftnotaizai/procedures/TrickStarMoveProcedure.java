package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import java.util.List;
import java.util.Comparator;

public class TrickStarMoveProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity entity_target = null;
		boolean target = false;
		double Userx = 0;
		double Usery = 0;
		double Userz = 0;
		double Targetx = 0;
		double Targety = 0;
		double Targetz = 0;
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
			{
				double _setval = entity_target.getX();
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TrickStarX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity_target.getY();
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TrickStarY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity_target.getZ();
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TrickStarZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			Targetx = entity.getX();
			Targety = entity.getY();
			Targetz = entity.getZ();
			{
				Entity _ent = entity;
				_ent.teleportTo(((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarX),
						((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarY),
						((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarZ));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarX),
							((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarY),
							((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarZ), _ent.getYRot(), _ent.getXRot());
			}
			{
				Entity _ent = entity_target;
				_ent.teleportTo(Targetx, Targety, Targetz);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(Targetx, Targety, Targetz, _ent.getYRot(), _ent.getXRot());
			}
		}
		if (target && entity_target instanceof Player) {
			{
				double _setval = entity_target.getX();
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TrickStarX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity_target.getY();
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TrickStarY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity_target.getZ();
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TrickStarZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			Targetx = entity.getX();
			Targety = entity.getY();
			Targetz = entity.getZ();
			{
				Entity _ent = entity;
				_ent.teleportTo(((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarX),
						((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarY),
						((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarZ));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarX),
							((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarY),
							((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TrickStarZ), _ent.getYRot(), _ent.getXRot());
			}
			{
				Entity _ent = entity_target;
				_ent.teleportTo(Targetx, Targety, Targetz);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(Targetx, Targety, Targetz, _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}
