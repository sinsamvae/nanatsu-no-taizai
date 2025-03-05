package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class DemonMarkMeliodasOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("level", 100);
	}
}
