package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GalandEntity;

public class GalandModel extends GeoModel<GalandEntity> {
	@Override
	public ResourceLocation getAnimationResource(GalandEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/galand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GalandEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/galand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GalandEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
