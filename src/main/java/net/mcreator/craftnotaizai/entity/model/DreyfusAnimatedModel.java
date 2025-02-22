package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DreyfusAnimatedEntity;

public class DreyfusAnimatedModel extends GeoModel<DreyfusAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(DreyfusAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/dreyfus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DreyfusAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/dreyfus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DreyfusAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
