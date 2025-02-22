package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GrayRoadStoryEntity;

public class GrayRoadStoryModel extends GeoModel<GrayRoadStoryEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrayRoadStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gillian.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrayRoadStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gillian.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrayRoadStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
