package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

public class FakeBallProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double effect = 0;
		double wide = 0;
		double rep = 0;
		double height = 0;
		effect = Mth.nextInt(RandomSource.create(), 1, 4);
		if (effect == 1) {
			entity.setSecondsOnFire(15);
		}
		if (effect == 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.FREZZE.get(), 80, 1, false, false));
		}
		if (effect == 3) {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (effect == 4) {
			for (int index0 = 0; index0 < 360; index0++) {
				rep = rep + 2 * (Math.PI / 80);
				height = height + 2;
				wide = wide + Math.PI / 80;
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, (entity.getX() + Math.sin(rep) * Math.sin(wide)), (entity.getY() + height), (entity.getZ() + Math.cos(rep) * Math.sin(wide)), 360, 2.5, (-2), 2.5, 0);
			}
		}
	}
}
