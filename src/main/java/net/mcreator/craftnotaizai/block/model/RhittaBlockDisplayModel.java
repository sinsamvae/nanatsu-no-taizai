package net.mcreator.craftnotaizai.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.block.display.RhittaBlockDisplayItem;

public class RhittaBlockDisplayModel extends GeoModel<RhittaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RhittaBlockDisplayItem animatable) {
		return new ResourceLocation("craft_no_taizai", "animations/rhitta_blocks.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RhittaBlockDisplayItem animatable) {
		return new ResourceLocation("craft_no_taizai", "geo/rhitta_blocks.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RhittaBlockDisplayItem entity) {
		return new ResourceLocation("craft_no_taizai", "textures/block/rhitta-texture.png");
	}
}
