package net.mcreator.craftnotaizai.procedures;

import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleRegistries;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class MinimumTabletsEffectEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Giant")) {
			for (final ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
				type.getScaleData(entity).setPersistence(type.getScaleData(entity).getPersistence());
				type.getScaleData(entity).resetScale();
			}
		}
	}
}
