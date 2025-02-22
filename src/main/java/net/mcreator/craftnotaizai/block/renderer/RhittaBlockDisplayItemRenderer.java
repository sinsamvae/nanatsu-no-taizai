package net.mcreator.craftnotaizai.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.craftnotaizai.block.model.RhittaBlockDisplayModel;
import net.mcreator.craftnotaizai.block.display.RhittaBlockDisplayItem;

public class RhittaBlockDisplayItemRenderer extends GeoItemRenderer<RhittaBlockDisplayItem> {
	public RhittaBlockDisplayItemRenderer() {
		super(new RhittaBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RhittaBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
