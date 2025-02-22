package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.FriesiaAnimatedEntity;

public class FriesiaAnimatedModel extends GeoModel<FriesiaAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(FriesiaAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/friesia_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FriesiaAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/friesia_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FriesiaAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
