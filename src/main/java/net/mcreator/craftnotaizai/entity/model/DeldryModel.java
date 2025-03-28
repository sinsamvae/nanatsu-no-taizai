package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DeldryEntity;

public class DeldryModel extends GeoModel<DeldryEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeldryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/deldry.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeldryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/deldry.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeldryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
