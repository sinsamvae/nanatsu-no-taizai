package net.mcreator.craftnotaizai;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber(modid = "craft_no_taizai", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class VanillaOverlayHider {
	@SubscribeEvent
	public static void RenderHealthBar(RenderGuiOverlayEvent.Pre event) {
		Entity entity = Minecraft.getInstance().player;
		if (entity == null)
			return;
		if (true) {
			if (VanillaGuiOverlay.PLAYER_HEALTH.type() == event.getOverlay()) {
				event.setCanceled(true);
			}
		}
	}
}
