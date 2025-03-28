package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class UseMagicPressed4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ChaosKeyBindProcedure.execute(world, y, entity);
		DisasterKeybindProcedure.execute(world, x, y, z, entity);
		GroundKeyBindProcedure.execute(world, y, entity);
		CurseKeyBindProcedure.execute(world, entity);
		FullCounterKeyBindProcedure.execute(world, x, y, z, entity);
		HellGateKeyBindProcedure.execute(world, x, y, z, entity);
		OminousNebulaKeyBindProcedure.execute(world, x, y, z, entity);
		GodKeyBindProcedure.execute(entity);
		BlizzardKeyBindProcedure.execute(entity);
		ArkKeyBindProcedure.execute(world, entity);
		DroleDanceKeyBindProcedure.execute(world, entity);
		TheRulerKeybindProcedure.execute(entity);
		LaiKeybindProcedure.execute(world, x, y, z, entity);
		OceanKeyBindProcedure.execute(world, entity);
		FlashKeybindProcedure.execute(entity);
		MaelSunShineKeybindProcedure.execute(world, entity);
		TornadoKeyBindProcedure.execute(world, entity);
		LudocielArkKeybindProcedure.execute(world, entity);
	}
}
