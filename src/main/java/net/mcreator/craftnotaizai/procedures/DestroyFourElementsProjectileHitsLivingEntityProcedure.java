package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class DestroyFourElementsProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(35);
	}
}
