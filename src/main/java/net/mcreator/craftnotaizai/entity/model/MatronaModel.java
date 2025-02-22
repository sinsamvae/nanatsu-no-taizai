package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.MatronaEntity;

public class MatronaModel extends GeoModel<MatronaEntity> {
	@Override
	public ResourceLocation getAnimationResource(MatronaEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/griamore_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MatronaEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/griamore_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MatronaEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
