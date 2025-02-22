package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ThunderGodsFlashEffectProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ThunderGodsFlash) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.LIGHTNING_2.get()), (entity.getX() + Mth.nextDouble(RandomSource.create(), -1, 1)), (entity.getY() + Mth.nextDouble(RandomSource.create(), -1, 1)),
						(entity.getZ() + Mth.nextDouble(RandomSource.create(), -1, 1)), 5, 1, 2, 1, 0.1);
		}
	}
}
