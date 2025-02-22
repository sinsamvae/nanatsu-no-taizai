package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GriamoreAnimatedEntity;

public class GriamoreAnimatedModel extends GeoModel<GriamoreAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(GriamoreAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/griamore_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GriamoreAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/griamore_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GriamoreAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
