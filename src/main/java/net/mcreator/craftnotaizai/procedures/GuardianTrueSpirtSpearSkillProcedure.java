package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class GuardianTrueSpirtSpearSkillProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		double x = 0;
		double z = 0;
		double yaw = 0;
		double range = 0;
		if (entity.isShiftKeyDown()) {
			if (entity.onGround()) {
				x = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				z = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(8)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
				yaw = entity.getYRot() + 0;
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("summon craft_no_taizai:guardian_true_spirt_spear " + x + " ~ " + z + " {Rotation:[" + yaw + "f,0f]}"));
					}
				}
				CraftNoTaizaiMod.queueServerWork(10, () -> {
					GuardianTrueSpirtSpearDamageProcedure.execute(world, y, entity);
				});
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You need to be grounded to use this move!"), true);
			}
		} else {
			if (entity.onGround()) {
				x = entity.getX() + entity.getLookAngle().x;
				z = entity.getZ() + entity.getLookAngle().z;
				yaw = entity.getYRot() + 0;
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("summon craft_no_taizai:guardian_true_spirt_spear " + x + " ~ " + z + " {Rotation:[" + yaw + "f,0f]}"));
					}
				}
				CraftNoTaizaiMod.queueServerWork(10, () -> {
					GuardianTrueSpirtSpearDamageProcedure.execute(world, y, entity);
				});
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You need to be grounded to use this move!"), true);
			}
		}
	}
}
