package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GuilaAnimatedEntity;

public class GuilaAnimatedModel extends GeoModel<GuilaAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(GuilaAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/guila_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GuilaAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/guila_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GuilaAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
