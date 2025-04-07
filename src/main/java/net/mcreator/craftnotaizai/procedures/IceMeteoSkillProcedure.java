package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.IceMeteoEntityEntity;

import java.util.List;
import java.util.Comparator;

public class IceMeteoSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < 15; index0++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CraftNoTaizaiModEntities.ICE_METEO_ENTITY.get().spawn(_level,
						BlockPos.containing(entity.getX() + Mth.nextDouble(RandomSource.create(), -3, 3), entity.getY() + 15, entity.getZ() + Mth.nextDouble(RandomSource.create(), -3, 3)), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 15), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof IceMeteoEntityEntity && !(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
						if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
							_toTame.tame(_owner);
					}
				}
			}
		}
	}
}
