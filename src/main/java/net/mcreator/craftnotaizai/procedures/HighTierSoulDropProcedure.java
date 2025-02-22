package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.entity.WeinheidtAnimatedEntity;
import net.mcreator.craftnotaizai.entity.VivianAnimatedEntity;
import net.mcreator.craftnotaizai.entity.SladerAnimatedEntity;
import net.mcreator.craftnotaizai.entity.SimonAnimatedEntity;
import net.mcreator.craftnotaizai.entity.RedKnightAnimatedEntity;
import net.mcreator.craftnotaizai.entity.JillianAnimatedEntity;
import net.mcreator.craftnotaizai.entity.HugoAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GustafAnimatedEntity;
import net.mcreator.craftnotaizai.entity.GreenKnightAnimatedEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HighTierSoulDropProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Demon")) {
			if (entity instanceof RedKnightAnimatedEntity || entity instanceof GreenKnightAnimatedEntity || entity instanceof WeinheidtAnimatedEntity || entity instanceof HugoAnimatedEntity || entity instanceof JillianAnimatedEntity
					|| entity instanceof SimonAnimatedEntity || entity instanceof SladerAnimatedEntity || entity instanceof VivianAnimatedEntity || entity instanceof GustafAnimatedEntity) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.HIGH_TIER_SOULS.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
