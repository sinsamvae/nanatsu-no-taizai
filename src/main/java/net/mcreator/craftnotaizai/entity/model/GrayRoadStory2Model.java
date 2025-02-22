package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GrayRoadStory2Entity;

public class GrayRoadStory2Model extends GeoModel<GrayRoadStory2Entity> {
	@Override
	public ResourceLocation getAnimationResource(GrayRoadStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gillian.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrayRoadStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gillian.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrayRoadStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
