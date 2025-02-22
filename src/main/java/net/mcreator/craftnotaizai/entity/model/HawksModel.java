package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.HawksEntity;

public class HawksModel extends GeoModel<HawksEntity> {
	@Override
	public ResourceLocation getAnimationResource(HawksEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/pig_grex.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HawksEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/pig_grex.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HawksEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
