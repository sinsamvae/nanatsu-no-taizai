package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;

public class AndreOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		boolean demon = false;
		random = Mth.nextInt(RandomSource.create(), 1, 10);
		if (random >= 1) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 100) * 30 && demon) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CraftNoTaizaiModEntities.ANDRE_DEMON_FORM.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				demon = true;
			}
		}
	}
}
