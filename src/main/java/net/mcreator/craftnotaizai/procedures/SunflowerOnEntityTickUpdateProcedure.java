package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class SunflowerOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double height = 0;
		entity.getPersistentData().putDouble("Despawn", (entity.getPersistentData().getDouble("Despawn") + 1));
		if (entity.getPersistentData().getDouble("Despawn") >= 30) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
