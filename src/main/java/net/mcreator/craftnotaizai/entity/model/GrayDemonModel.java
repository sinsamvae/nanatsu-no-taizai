package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GrayDemonEntity;

public class GrayDemonModel extends GeoModel<GrayDemonEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrayDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gay_demon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrayDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gay_demon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrayDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
