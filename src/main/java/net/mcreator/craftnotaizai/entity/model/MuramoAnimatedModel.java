package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.MuramoAnimatedEntity;

public class MuramoAnimatedModel extends GeoModel<MuramoAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(MuramoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/royal_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MuramoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/royal_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MuramoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
