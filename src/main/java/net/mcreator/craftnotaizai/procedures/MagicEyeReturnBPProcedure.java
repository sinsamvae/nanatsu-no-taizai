package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import java.util.List;
import java.util.Comparator;

public class MagicEyeReturnBPProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		Entity entity_target = null;
		double dex = 0;
		double range = 0;
		String BP = "";
		boolean target = false;
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
				return "\u00A7eSpirit: " + new java.text.DecimalFormat("##.##").format(Math.ceil((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).BP));
			} else if (target && entity_target instanceof LivingEntity) {
				if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE)) {
					dex = Math.ceil((entity_target instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)
							+ (entity_target instanceof LivingEntity _attributeContext ? _attributeContext.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE) : 0.0D)
							+ (entity_target instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0));
				} else {
					dex = 0;
				}
				return "\u00A7eBP: " + new java.text.DecimalFormat("##.##").format(Math.ceil(dex));
			}
			range = range + 1;
		}
		return BP;
	}
}
