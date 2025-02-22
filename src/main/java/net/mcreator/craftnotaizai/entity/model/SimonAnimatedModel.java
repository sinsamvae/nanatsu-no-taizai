package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.SimonAnimatedEntity;

public class SimonAnimatedModel extends GeoModel<SimonAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(SimonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/simon_animated_rm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SimonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/simon_animated_rm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SimonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
