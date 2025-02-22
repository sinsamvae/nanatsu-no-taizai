package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class UseMagicPressed3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		SpellsKeybindProcedure.execute(world, x, y, z, entity);
		TempestBindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		IceFangBindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		AcidkeyPressProcedure.execute(world, x, y, z, entity);
		MiracleWindKeyPressProcedure.execute(world, x, y, z, entity);
		BlazeBindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		InfinityBindOnKeyPressedProcedure.execute(world, entity);
		CreationbindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		SnatchBindOnKeyPressedProcedure.execute(world, entity);
		InvasionBindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		SunshinekeypressProcedure.execute(world, entity);
		DisasterBindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		GrayDemonMoveProcedure.execute(world, x, y, z, entity);
		DemonRegenMoveProcedure.execute(entity);
		ComboStarKeybindProcedure.execute(world, x, y, z, entity);
		TrickStarKeyBindProcedure.execute(world, x, y, z, entity);
		FullSizeSkillProcedure.execute(entity);
		CriticalOverKeybindProcedure.execute(world, x, y, z, entity);
		TrueSpirtSpearKeybindProcedure.execute(entity);
	}
}
