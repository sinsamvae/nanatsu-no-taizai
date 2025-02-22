package net.mcreator.craftnotaizai.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.item.WhipItem;

public class WhipItemModel extends GeoModel<WhipItem> {
	@Override
	public ResourceLocation getAnimationResource(WhipItem animatable) {
		return new ResourceLocation("craft_no_taizai", "animations/green-whip.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WhipItem animatable) {
		return new ResourceLocation("craft_no_taizai", "geo/green-whip.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WhipItem animatable) {
		return new ResourceLocation("craft_no_taizai", "textures/item/green-whip-texture.png");
	}
}
