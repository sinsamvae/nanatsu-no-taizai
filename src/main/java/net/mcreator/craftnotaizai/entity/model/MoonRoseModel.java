package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.MoonRoseEntity;

public class MoonRoseModel extends GeoModel<MoonRoseEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoonRoseEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/moonrose.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoonRoseEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/moonrose.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoonRoseEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
