package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class BlazeProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double delay = 0;
		double rep = 0;
		entity.setSecondsOnFire(20);
	}
}
