package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GolgiusAnimatedEntity;

public class GolgiusAnimatedModel extends GeoModel<GolgiusAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(GolgiusAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/golgius_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GolgiusAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/golgius_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GolgiusAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
