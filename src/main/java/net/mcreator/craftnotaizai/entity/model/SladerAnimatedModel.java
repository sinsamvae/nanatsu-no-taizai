package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.SladerAnimatedEntity;

public class SladerAnimatedModel extends GeoModel<SladerAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(SladerAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/slader_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SladerAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/slader_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SladerAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
