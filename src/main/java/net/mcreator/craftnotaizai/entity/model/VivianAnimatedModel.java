package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.VivianAnimatedEntity;

public class VivianAnimatedModel extends GeoModel<VivianAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(VivianAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/vivian_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VivianAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/vivian_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VivianAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
