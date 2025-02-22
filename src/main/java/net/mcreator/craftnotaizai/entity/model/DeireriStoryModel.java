package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DeireriStoryEntity;

public class DeireriStoryModel extends GeoModel<DeireriStoryEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeireriStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/diane_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeireriStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/diane_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeireriStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
