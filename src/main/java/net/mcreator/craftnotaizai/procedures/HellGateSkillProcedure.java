package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.HellGateRedDemonsEntity;

import java.util.List;
import java.util.Comparator;

public class HellGateSkillProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double distance_in_blocks = 0;
		double y_offset = 0;
		y_offset = 3;
		distance_in_blocks = 1;
		world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.HELL_GATE_PARTICLES.get()), (entity.getX() + entity.getLookAngle().x * distance_in_blocks), (entity.getY() + y_offset),
				(entity.getZ() + entity.getLookAngle().z * distance_in_blocks), 0, 0, 0);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = CraftNoTaizaiModEntities.HELL_GATE_RED_DEMONS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof HellGateRedDemonsEntity && !(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
					if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
						_toTame.tame(_owner);
				}
			}
		}
	}
}
