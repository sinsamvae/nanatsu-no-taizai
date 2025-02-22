package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class StoryvarProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		StoryButton1Procedure.execute(world, x, y, z, entity);
		Storybutton2Procedure.execute(world, x, y, z, entity);
	}
}
