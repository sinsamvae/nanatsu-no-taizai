package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GigaFallEntity;

public class GigaFallModel extends GeoModel<GigaFallEntity> {
	@Override
	public ResourceLocation getAnimationResource(GigaFallEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/giga_fall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GigaFallEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/giga_fall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GigaFallEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
