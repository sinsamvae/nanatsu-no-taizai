package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.RoyalGurardAnimatedEntity;

public class RoyalGurardAnimatedModel extends GeoModel<RoyalGurardAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(RoyalGurardAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/royal_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoyalGurardAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/royal_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoyalGurardAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
