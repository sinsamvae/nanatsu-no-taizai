package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class RisingMeteorOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 1, 0));
		CraftNoTaizaiMod.queueServerWork(20, () -> {
			entity.setDeltaMovement(new Vec3(0, (-1), 0));
			CraftNoTaizaiMod.queueServerWork(20, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
			});
		});
	}
}
