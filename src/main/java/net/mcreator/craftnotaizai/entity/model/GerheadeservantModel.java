package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GerheadeservantEntity;

public class GerheadeservantModel extends GeoModel<GerheadeservantEntity> {
	@Override
	public ResourceLocation getAnimationResource(GerheadeservantEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gerheade.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GerheadeservantEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gerheade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GerheadeservantEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
