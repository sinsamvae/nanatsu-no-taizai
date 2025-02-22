package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.StoryBanAnimatedEntity;

public class StoryBanAnimatedModel extends GeoModel<StoryBanAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoryBanAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/ban_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoryBanAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/ban_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoryBanAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
