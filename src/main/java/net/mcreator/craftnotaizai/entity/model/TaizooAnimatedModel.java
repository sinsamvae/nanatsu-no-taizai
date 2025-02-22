package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.TaizooAnimatedEntity;

public class TaizooAnimatedModel extends GeoModel<TaizooAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(TaizooAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/taizoo_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TaizooAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/taizoo_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TaizooAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
