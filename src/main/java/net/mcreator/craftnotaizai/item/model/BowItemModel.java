package net.mcreator.craftnotaizai.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.item.BowItem;

public class BowItemModel extends GeoModel<BowItem> {
	@Override
	public ResourceLocation getAnimationResource(BowItem animatable) {
		return new ResourceLocation("craft_no_taizai", "animations/bow.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BowItem animatable) {
		return new ResourceLocation("craft_no_taizai", "geo/bow.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BowItem animatable) {
		return new ResourceLocation("craft_no_taizai", "textures/item/bow.png");
	}
}
