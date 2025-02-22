package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GerheadeEntity;

public class GerheadeModel extends GeoModel<GerheadeEntity> {
	@Override
	public ResourceLocation getAnimationResource(GerheadeEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gerheade.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GerheadeEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gerheade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GerheadeEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
