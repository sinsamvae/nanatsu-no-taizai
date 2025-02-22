package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.FraudrinStoryEntity;

public class FraudrinStoryModel extends GeoModel<FraudrinStoryEntity> {
	@Override
	public ResourceLocation getAnimationResource(FraudrinStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/fraudrin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FraudrinStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/fraudrin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FraudrinStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
