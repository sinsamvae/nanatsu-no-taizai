package net.mcreator.craftnotaizai.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.item.BellStaffItem;

public class BellStaffItemModel extends GeoModel<BellStaffItem> {
	@Override
	public ResourceLocation getAnimationResource(BellStaffItem animatable) {
		return new ResourceLocation("craft_no_taizai", "animations/bellstaff.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BellStaffItem animatable) {
		return new ResourceLocation("craft_no_taizai", "geo/bellstaff.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BellStaffItem animatable) {
		return new ResourceLocation("craft_no_taizai", "textures/item/bellstaff.png");
	}
}
