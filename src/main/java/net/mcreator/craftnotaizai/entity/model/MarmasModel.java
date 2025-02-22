package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.MarmasEntity;

public class MarmasModel extends GeoModel<MarmasEntity> {
	@Override
	public ResourceLocation getAnimationResource(MarmasEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/bell.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MarmasEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/bell.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MarmasEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
