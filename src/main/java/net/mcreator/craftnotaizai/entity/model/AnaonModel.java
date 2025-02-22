package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.AnaonEntity;

public class AnaonModel extends GeoModel<AnaonEntity> {
	@Override
	public ResourceLocation getAnimationResource(AnaonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/anaon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AnaonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/anaon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AnaonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
