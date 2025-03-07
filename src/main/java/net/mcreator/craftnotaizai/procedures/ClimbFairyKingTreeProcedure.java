package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ClimbFairyKingTreeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getY(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double y, Entity entity) {
		execute(null, world, y, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		if (entity.getXRot() <= 25 && (world.getBlockState(BlockPos.containing(entity.getX() + entity.getLookAngle().x, y, entity.getZ() + entity.getLookAngle().z))).getBlock() == CraftNoTaizaiModBlocks.FAIRY_KING_LOG.get()) {
			entity.setDeltaMovement(new Vec3(0, 0.15, 0));
		}
	}
}
