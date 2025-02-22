package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DemonHendricksonAnimatedEntity;

public class DemonHendricksonAnimatedModel extends GeoModel<DemonHendricksonAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(DemonHendricksonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/ban_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DemonHendricksonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/ban_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DemonHendricksonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
