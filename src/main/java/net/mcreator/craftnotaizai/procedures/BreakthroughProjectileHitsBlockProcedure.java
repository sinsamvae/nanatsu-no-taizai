package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class BreakthroughProjectileHitsBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double delay = 0;
		entity.setDeltaMovement(new Vec3(((-0.5) * entity.getLookAngle().x), (1.5 * entity.getLookAngle().y), ((-0.5) * entity.getLookAngle().z)));
	}
}
