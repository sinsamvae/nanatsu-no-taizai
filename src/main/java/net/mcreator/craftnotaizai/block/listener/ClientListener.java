package net.mcreator.craftnotaizai.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModBlockEntities;
import net.mcreator.craftnotaizai.block.renderer.RhittaBlockTileRenderer;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

@Mod.EventBusSubscriber(modid = CraftNoTaizaiMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(CraftNoTaizaiModBlockEntities.RHITTA_BLOCK.get(), context -> new RhittaBlockTileRenderer());
	}
}
