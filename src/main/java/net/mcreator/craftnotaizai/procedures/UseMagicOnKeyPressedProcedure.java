package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class UseMagicOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftNoTaizaiModMobEffects.MELODY.get())) {
			CraftNoTaizaiMod.queueServerWork(100, () -> {
				ThunderboltbindOnKeyPressedProcedure.execute(world, x, y, z, entity);
				TransparencyBindOnKeyPressedProcedure.execute(entity);
				GoenNoJujinKeybindProcedure.execute(world, x, y, z, entity);
				WindShooterKeybindProcedure.execute(world, x, y, z, entity);
				FlickStoneKeybindProcedure.execute(world, entity);
				GravityManipulationKeybindProcedure.execute(entity);
				GodSpeedProcedure.execute(world, x, y, z, entity);
				AuraBurstKeybindProcedure.execute(world, entity);
				UseMagicPressed2Procedure.execute(world, x, y, z, entity);
				UseMagicPressed3Procedure.execute(world, x, y, z, entity);
				DemonModeOnOnKeyPressedProcedure.execute(world, entity);
				HumandemonmarkProcedure.execute(entity);
				ChastiefolButtonPressProcedure.execute(world, x, y, z, entity);
				UseMagicPressed4Procedure.execute(world, x, y, z, entity);
				BulletSquallKeyBindProcedure.execute(world, x, z, entity);
			});
		} else {
			ThunderboltbindOnKeyPressedProcedure.execute(world, x, y, z, entity);
			TransparencyBindOnKeyPressedProcedure.execute(entity);
			GoenNoJujinKeybindProcedure.execute(world, x, y, z, entity);
			WindShooterKeybindProcedure.execute(world, x, y, z, entity);
			FlickStoneKeybindProcedure.execute(world, entity);
			GravityManipulationKeybindProcedure.execute(entity);
			GodSpeedProcedure.execute(world, x, y, z, entity);
			AuraBurstKeybindProcedure.execute(world, entity);
			UseMagicPressed2Procedure.execute(world, x, y, z, entity);
			UseMagicPressed3Procedure.execute(world, x, y, z, entity);
			DemonModeOnOnKeyPressedProcedure.execute(world, entity);
			HumandemonmarkProcedure.execute(entity);
			ChastiefolButtonPressProcedure.execute(world, x, y, z, entity);
			UseMagicPressed4Procedure.execute(world, x, y, z, entity);
			BulletSquallKeyBindProcedure.execute(world, x, z, entity);
		}
	}
}
