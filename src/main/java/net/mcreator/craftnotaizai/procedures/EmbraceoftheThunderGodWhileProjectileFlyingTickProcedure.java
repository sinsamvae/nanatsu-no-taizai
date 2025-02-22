package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class EmbraceoftheThunderGodWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double delay = 0;
		double sevy = 0;
		double a = 0;
		double sevx = 0;
		double sevz = 0;
		double sev = 0;
		double tedy = 0;
		double tedz = 0;
		double ted = 0;
		double tedx = 0;
		double sevz2 = 0;
		double sevy2 = 0;
		double sevx2 = 0;
		double cubesize = 0;
		double sev2 = 0;
		immediatesourceentity.setNoGravity(true);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.LIGHTNING.get()), x, y, z, 25, 1, 2, 1, 0);
		immediatesourceentity.getPersistentData().putDouble("range", 0);
		immediatesourceentity.getPersistentData().putDouble("sx", (immediatesourceentity.getX()));
		immediatesourceentity.getPersistentData().putDouble("sy", (immediatesourceentity.getY() + 1.2));
		immediatesourceentity.getPersistentData().putDouble("sz", (immediatesourceentity.getZ()));
		immediatesourceentity.getPersistentData().putDouble("tx", (immediatesourceentity.level().clip(
				new ClipContext(immediatesourceentity.getEyePosition(1f), immediatesourceentity.getEyePosition(1f).add(immediatesourceentity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, immediatesourceentity))
				.getBlockPos().getX()));
		immediatesourceentity.getPersistentData().putDouble("ty", (immediatesourceentity.level().clip(
				new ClipContext(immediatesourceentity.getEyePosition(1f), immediatesourceentity.getEyePosition(1f).add(immediatesourceentity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, immediatesourceentity))
				.getBlockPos().getY()));
		immediatesourceentity.getPersistentData().putDouble("tz", (immediatesourceentity.level().clip(
				new ClipContext(immediatesourceentity.getEyePosition(1f), immediatesourceentity.getEyePosition(1f).add(immediatesourceentity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, immediatesourceentity))
				.getBlockPos().getZ()));
		immediatesourceentity.getPersistentData().putDouble("range",
				Math.sqrt(Math.pow(immediatesourceentity.getPersistentData().getDouble("sx") - immediatesourceentity.getPersistentData().getDouble("tx"), 2)
						+ Math.pow(immediatesourceentity.getPersistentData().getDouble("sy") - immediatesourceentity.getPersistentData().getDouble("ty"), 2)
						+ Math.pow(immediatesourceentity.getPersistentData().getDouble("sz") - immediatesourceentity.getPersistentData().getDouble("tz"), 2)));
		immediatesourceentity.getPersistentData().putDouble("x+",
				((immediatesourceentity.getPersistentData().getDouble("sx") - immediatesourceentity.getPersistentData().getDouble("tx")) / immediatesourceentity.getPersistentData().getDouble("range")));
		immediatesourceentity.getPersistentData().putDouble("y+",
				((immediatesourceentity.getPersistentData().getDouble("sy") - immediatesourceentity.getPersistentData().getDouble("ty")) / immediatesourceentity.getPersistentData().getDouble("range")));
		immediatesourceentity.getPersistentData().putDouble("z+",
				((immediatesourceentity.getPersistentData().getDouble("sz") - immediatesourceentity.getPersistentData().getDouble("tz")) / immediatesourceentity.getPersistentData().getDouble("range")));
		immediatesourceentity.getPersistentData().putDouble("size", 0);
		immediatesourceentity.getPersistentData().putDouble("h", 0);
		for (int index0 = 0; index0 < (int) (immediatesourceentity.getPersistentData().getDouble("range") * 5); index0++) {
			delay = delay + 0.5;
			CraftNoTaizaiMod.queueServerWork((int) delay, () -> {
				immediatesourceentity.getPersistentData().putDouble("h", (immediatesourceentity.getPersistentData().getDouble("h") + 0.5));
				immediatesourceentity.getPersistentData().putDouble("size", (immediatesourceentity.getPersistentData().getDouble("size") + 0.05));
				immediatesourceentity.getPersistentData().putDouble("sx", (immediatesourceentity.getPersistentData().getDouble("sx") + immediatesourceentity.getPersistentData().getDouble("x+") * (-0.2)));
				immediatesourceentity.getPersistentData().putDouble("sy", (immediatesourceentity.getPersistentData().getDouble("sy") + immediatesourceentity.getPersistentData().getDouble("y+") * (-0.2)));
				immediatesourceentity.getPersistentData().putDouble("sz", (immediatesourceentity.getPersistentData().getDouble("sz") + immediatesourceentity.getPersistentData().getDouble("z+") * (-0.2)));
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.LIGHTNING.get()),
							(immediatesourceentity.getPersistentData().getDouble("sx") + Math.sin(immediatesourceentity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepZ()),
							(immediatesourceentity.getPersistentData().getDouble("sy") + Math.cos(immediatesourceentity.getPersistentData().getDouble("h"))),
							(immediatesourceentity.getPersistentData().getDouble("sz") + Math.sin(immediatesourceentity.getPersistentData().getDouble("h")) * (entity.getDirection()).getStepX()), 4, 0.1, 0.1, 0.1, 0);
				ProjectileFullCounterProcedure.execute(world, x, y, z, entity, immediatesourceentity);
			});
		}
		immediatesourceentity.getPersistentData().putDouble("Flying", (immediatesourceentity.getPersistentData().getDouble("Flying") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("Flying") >= 200) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
