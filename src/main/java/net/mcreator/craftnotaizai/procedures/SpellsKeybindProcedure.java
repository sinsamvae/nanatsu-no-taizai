package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SpellsKeybindProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		DarkDestoryKeybindProcedure.execute(world, entity);
		FreezeCoffinKeybindProcedure.execute(world, entity);
		FireStormKeybindProcedure.execute(entity);
		BusterIceKeybindProcedure.execute(entity);
		HardProtectionKeyBindProcedure.execute(entity);
		AquaDressKeybindProcedure.execute(entity);
		PowerAmplifyKeybindProcedure.execute(world, entity);
		FlightKeyBindProcedure.execute(entity);
		RapidMovementSkillProcedure.execute(world, entity);
		ResistFireProcedure.execute(entity);
		MagicDetectionKeyProcedure.execute(entity);
		SpiralHailKeyBindProcedure.execute(world, x, y, z, entity);
		TeleportationKeyBindProcedure.execute(world, x, y, z, entity);
	}
}
