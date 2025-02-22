package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class GigaFallOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.onGround()) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
