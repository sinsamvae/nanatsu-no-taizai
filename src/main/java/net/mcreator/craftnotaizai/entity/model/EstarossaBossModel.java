package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.EstarossaBossEntity;

public class EstarossaBossModel extends GeoModel<EstarossaBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(EstarossaBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/estarrossa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EstarossaBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/estarrossa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EstarossaBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
