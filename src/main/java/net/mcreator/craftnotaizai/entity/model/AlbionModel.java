package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.AlbionEntity;

public class AlbionModel extends GeoModel<AlbionEntity> {
	@Override
	public ResourceLocation getAnimationResource(AlbionEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/albion.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AlbionEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/albion.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AlbionEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
