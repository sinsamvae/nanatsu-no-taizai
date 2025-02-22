package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GrayDemonHendricksonAnimatedEntity;

public class GrayDemonHendricksonAnimatedModel extends GeoModel<GrayDemonHendricksonAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrayDemonHendricksonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gray_demon_hendrick_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrayDemonHendricksonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gray_demon_hendrick_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrayDemonHendricksonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
