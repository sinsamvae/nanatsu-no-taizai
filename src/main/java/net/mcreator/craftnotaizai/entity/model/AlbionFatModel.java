package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.AlbionFatEntity;

public class AlbionFatModel extends GeoModel<AlbionFatEntity> {
	@Override
	public ResourceLocation getAnimationResource(AlbionFatEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/albion.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AlbionFatEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/albion.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AlbionFatEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
