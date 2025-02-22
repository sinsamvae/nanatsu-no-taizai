package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DumblebbasAnimatedEntity;

public class DumblebbasAnimatedModel extends GeoModel<DumblebbasAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(DumblebbasAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/griamore_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DumblebbasAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/griamore_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DumblebbasAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
