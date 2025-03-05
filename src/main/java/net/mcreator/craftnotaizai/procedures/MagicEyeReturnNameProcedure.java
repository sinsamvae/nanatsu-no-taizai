package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import java.util.List;
import java.util.Comparator;

public class MagicEyeReturnNameProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		Entity entity_target = null;
		boolean target = false;
		String BP = "";
		double range = 0;
		BP = "NONE";
		for (int index0 = 0; index0 < 20; index0++) {
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(range)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(range)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(range)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(target || entity == entityiterator) && (entityiterator instanceof Player || entityiterator instanceof LivingEntity)) {
						target = true;
						entity_target = entityiterator;
					}
				}
			}
			if (target && entity_target instanceof Player) {
				return "\u00A7eDisplayName: " + (entity_target.getDisplayName().getString() + " lv:"
						+ new java.text.DecimalFormat("##").format((entity_target.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level));
			} else if (target && entity_target instanceof LivingEntity) {
				return "\u00A7eDisplayName: " + (entity_target.getDisplayName().getString() + " lv:" + new java.text.DecimalFormat("##").format(entity_target.getPersistentData().getDouble("level")));
			}
			range = range + 1;
		}
		return BP;
	}
}
