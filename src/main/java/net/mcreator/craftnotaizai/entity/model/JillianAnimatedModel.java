package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.JillianAnimatedEntity;

public class JillianAnimatedModel extends GeoModel<JillianAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(JillianAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/jillian_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JillianAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/jillian_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JillianAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
