package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class WickedBiteOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("Despawn", (entity.getPersistentData().getDouble("Despawn") + 1));
		if (entity.getPersistentData().getDouble("Despawn") >= 50) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
