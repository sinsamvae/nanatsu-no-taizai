package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GigaCrushEntity;

public class GigaCrushModel extends GeoModel<GigaCrushEntity> {
	@Override
	public ResourceLocation getAnimationResource(GigaCrushEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/giga_fall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GigaCrushEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/giga_fall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GigaCrushEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
