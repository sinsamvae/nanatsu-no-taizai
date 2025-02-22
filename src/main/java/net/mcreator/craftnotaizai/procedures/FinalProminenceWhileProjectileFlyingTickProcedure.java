package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class FinalProminenceWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double delay = 0;
		double rep = 0;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double wide = 0;
		double startX = 0;
		double startY = 0;
		double startZ = 0;
		double numParticles = 0;
		double radius = 0;
		double heighOffset = 0;
		double deltaYaw = 0;
		double deltaY = 0;
		double angle = 0;
		double yaw = 0;
		double t = 0;
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
		ProjectileFullCounterProcedure.execute(world, x, y, z, entity, immediatesourceentity);
		{
			Entity _ent = immediatesourceentity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle dust 0.94 0.55 0 5 ~ ~1 ~ 0 0 0 0 1");
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.LAVA, x, y, z, 4, 0.5, 0.5, 0.5, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 4, 0.5, 0.5, 0.5, 0);
		immediatesourceentity.getPersistentData().putDouble("Flying", (immediatesourceentity.getPersistentData().getDouble("Flying") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("Flying") >= 200) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
