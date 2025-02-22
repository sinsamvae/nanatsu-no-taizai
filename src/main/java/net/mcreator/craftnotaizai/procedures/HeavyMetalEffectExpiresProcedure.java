package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.DumblebbasAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DianeBossAnimatedEntity;
import net.mcreator.craftnotaizai.entity.DianeAnimatedEntity;

public class HeavyMetalEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof DianeBossAnimatedEntity animatable)
			animatable.setTexture("diane");
		if (entity instanceof DianeAnimatedEntity animatable)
			animatable.setTexture("diane");
		if (entity instanceof DumblebbasAnimatedEntity animatable)
			animatable.setTexture("dumblebas");
	}
}
