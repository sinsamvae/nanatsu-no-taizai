package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GustafAnimatedEntity;

public class GustafAnimatedModel extends GeoModel<GustafAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(GustafAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/ban_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GustafAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/ban_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GustafAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
