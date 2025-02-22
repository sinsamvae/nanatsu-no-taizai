package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.MonspeitStory2Entity;

public class MonspeitStory2Model extends GeoModel<MonspeitStory2Entity> {
	@Override
	public ResourceLocation getAnimationResource(MonspeitStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/diane_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MonspeitStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/diane_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MonspeitStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
