package net.mcreator.craftnotaizai.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.item.HolyStaffCoureChouseItem;

public class HolyStaffCoureChouseItemModel extends GeoModel<HolyStaffCoureChouseItem> {
	@Override
	public ResourceLocation getAnimationResource(HolyStaffCoureChouseItem animatable) {
		return new ResourceLocation("craft_no_taizai", "animations/holystaffcourechouse.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HolyStaffCoureChouseItem animatable) {
		return new ResourceLocation("craft_no_taizai", "geo/holystaffcourechouse.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HolyStaffCoureChouseItem animatable) {
		return new ResourceLocation("craft_no_taizai", "textures/item/triple-staff-texture.png");
	}
}
