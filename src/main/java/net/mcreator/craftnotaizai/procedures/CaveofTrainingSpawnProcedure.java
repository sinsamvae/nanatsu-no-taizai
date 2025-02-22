package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;

import java.util.List;
import java.util.Comparator;

public class CaveofTrainingSpawnProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		double amount = 0;
		double entityspawn = 0;
		double TPY = 0;
		double TPX = 0;
		double TPZ = 0;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(65 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:cave_of_training")))) {
					amount = Mth.nextInt(RandomSource.create(), 4, 8);
					for (int index0 = 0; index0 < (int) (amount * 1); index0++) {
						entityspawn = Mth.nextInt(RandomSource.create(), 1, 3);
						if (entityspawn == 1) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CraftNoTaizaiModEntities.CLAY_DRAGON.get().spawn(_level, BlockPos.containing(entity.getX(), y, entity.getZ()), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
						}
						if (entityspawn == 2) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CraftNoTaizaiModEntities.TYRANT_DRAGON_CAVE.get().spawn(_level, BlockPos.containing(entity.getX(), y, entity.getZ()), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
						}
						if (entityspawn == 3) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CraftNoTaizaiModEntities.ANAON.get().spawn(_level, BlockPos.containing(entity.getX(), y, entity.getZ()), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
						}
					}
				}
			}
		}
	}
}
