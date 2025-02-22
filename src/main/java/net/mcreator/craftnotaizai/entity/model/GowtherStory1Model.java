package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GowtherStory1Entity;

public class GowtherStory1Model extends GeoModel<GowtherStory1Entity> {
	@Override
	public ResourceLocation getAnimationResource(GowtherStory1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/diane_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GowtherStory1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/diane_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GowtherStory1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
