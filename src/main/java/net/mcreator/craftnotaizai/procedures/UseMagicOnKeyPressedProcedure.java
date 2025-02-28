package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class UseMagicOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		CraftNoTaizaiMod.queueServerWork((int) (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Melody, () -> {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Melody == 200) {
				{
					double _setval = 0;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Melody = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			ThunderboltbindOnKeyPressedProcedure.execute(world, x, y, z, entity);
			TransparencyBindOnKeyPressedProcedure.execute(entity);
			GoenNoJujinKeybindProcedure.execute(world, x, y, z, entity);
			WindShooterKeybindProcedure.execute(world, x, y, z, entity);
			FlickStoneKeybindProcedure.execute(entity);
			GravityManipulationKeybindProcedure.execute(entity);
			GodSpeedProcedure.execute(world, x, y, z, entity);
			AuraBurstKeybindProcedure.execute(world, entity);
			UseMagicPressed2Procedure.execute(world, x, y, z, entity);
			UseMagicPressed3Procedure.execute(world, x, y, z, entity);
			DemonModeOnOnKeyPressedProcedure.execute(world, entity);
			HumandemonmarkProcedure.execute(entity);
			ChastiefolButtonPressProcedure.execute(world, x, y, z, entity);
			UseMagicPressed4Procedure.execute(world, x, y, z, entity);
			BulletSquallKeyBindProcedure.execute(world, x, y, z, entity);
		});
	}
}
