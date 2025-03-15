package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class HeliosFairSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double delay = 0;
		double damage = 0;
		damage = Math.ceil(0.1 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack
				* (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack_boost) + 4;
		damage = damage * ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage / 100);
		entity.getPersistentData().putDouble("range", 0.5);
		entity.getPersistentData().putDouble("sx", (entity.getX()));
		entity.getPersistentData().putDouble("sy", (entity.getY() + 1.2));
		entity.getPersistentData().putDouble("sz", (entity.getZ()));
		entity.getPersistentData().putDouble("tx",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
		entity.getPersistentData().putDouble("ty",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
		entity.getPersistentData().putDouble("tz",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
		entity.getPersistentData().putDouble("range", Math.sqrt(Math.pow(entity.getPersistentData().getDouble("sx") - entity.getPersistentData().getDouble("tx"), 2)
				+ Math.pow(entity.getPersistentData().getDouble("sy") - entity.getPersistentData().getDouble("ty"), 2) + Math.pow(entity.getPersistentData().getDouble("sz") - entity.getPersistentData().getDouble("tz"), 2)));
		entity.getPersistentData().putDouble("x+", ((entity.getPersistentData().getDouble("sx") - entity.getPersistentData().getDouble("tx")) / entity.getPersistentData().getDouble("range")));
		entity.getPersistentData().putDouble("y+", ((entity.getPersistentData().getDouble("sy") - entity.getPersistentData().getDouble("ty")) / entity.getPersistentData().getDouble("range")));
		entity.getPersistentData().putDouble("z+", ((entity.getPersistentData().getDouble("sz") - entity.getPersistentData().getDouble("tz")) / entity.getPersistentData().getDouble("range")));
		entity.getPersistentData().putDouble("size", 0);
		entity.getPersistentData().putDouble("h", 0);
		for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("range") * 5); index0++) {
			delay = delay + 0.5;
			CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
				entity.getPersistentData().putDouble("h", (entity.getPersistentData().getDouble("h") + 0.5));
				entity.getPersistentData().putDouble("size", (entity.getPersistentData().getDouble("size") + 1));
				entity.getPersistentData().putDouble("sx", (entity.getPersistentData().getDouble("sx") + entity.getPersistentData().getDouble("x+") * (-0.2)));
				entity.getPersistentData().putDouble("sy", (entity.getPersistentData().getDouble("sy") + entity.getPersistentData().getDouble("y+") * (-0.2)));
				entity.getPersistentData().putDouble("sz", (entity.getPersistentData().getDouble("sz") + entity.getPersistentData().getDouble("z+") * (-0.2)));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, (entity.getPersistentData().getDouble("sx") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepZ()),
							(entity.getPersistentData().getDouble("sy") + Math.cos(entity.getPersistentData().getDouble("h"))),
							(entity.getPersistentData().getDouble("sz") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepX()), 4, 0.1, 0.1, 0.1, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMALL_FLAME, (entity.getPersistentData().getDouble("sx") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepZ()),
							(entity.getPersistentData().getDouble("sy") + Math.cos(entity.getPersistentData().getDouble("h"))),
							(entity.getPersistentData().getDouble("sz") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepX()), 4, 0.2, 0.2, 0.2, 0);
				HeliodsFairDamageProcedure.execute(world, entity.getPersistentData().getDouble("sx") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepZ(),
						entity.getPersistentData().getDouble("sy") + Math.cos(entity.getPersistentData().getDouble("h")),
						entity.getPersistentData().getDouble("sz") + Math.sin(entity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepX(), entity);
			});
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
		}
	}
}
