package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.HugoAnimatedEntity;

public class HugoAnimatedModel extends GeoModel<HugoAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(HugoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/hugo_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HugoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/hugo_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HugoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
