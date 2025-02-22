package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.RedKnightAnimatedEntity;

public class RedKnightAnimatedModel extends GeoModel<RedKnightAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(RedKnightAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/red_knight_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RedKnightAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/red_knight_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RedKnightAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
