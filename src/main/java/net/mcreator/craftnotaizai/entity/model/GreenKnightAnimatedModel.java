package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GreenKnightAnimatedEntity;

public class GreenKnightAnimatedModel extends GeoModel<GreenKnightAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(GreenKnightAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/green_knight_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreenKnightAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/green_knight_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreenKnightAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
