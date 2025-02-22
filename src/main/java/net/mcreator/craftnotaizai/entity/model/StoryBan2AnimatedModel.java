package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.StoryBan2AnimatedEntity;

public class StoryBan2AnimatedModel extends GeoModel<StoryBan2AnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoryBan2AnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/ban_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoryBan2AnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/ban_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoryBan2AnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
