package net.mcreator.craftnotaizai.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.item.DragonHandleSwordItem;

public class DragonHandleSwordItemModel extends GeoModel<DragonHandleSwordItem> {
	@Override
	public ResourceLocation getAnimationResource(DragonHandleSwordItem animatable) {
		return new ResourceLocation("craft_no_taizai", "animations/dragon_handle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DragonHandleSwordItem animatable) {
		return new ResourceLocation("craft_no_taizai", "geo/dragon_handle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DragonHandleSwordItem animatable) {
		return new ResourceLocation("craft_no_taizai", "textures/item/dragon-handle-texture.png");
	}
}
