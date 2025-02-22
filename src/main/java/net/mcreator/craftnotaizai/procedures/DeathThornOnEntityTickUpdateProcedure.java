package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class DeathThornOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("Despawn", (entity.getPersistentData().getDouble("Despawn") + 1));
		if (entity.getPersistentData().getDouble("Despawn") >= 40) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
