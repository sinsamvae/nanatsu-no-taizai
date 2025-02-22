package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GrayDemonEntityEntity;

public class GrayDemonEntityModel extends GeoModel<GrayDemonEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrayDemonEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gay_demon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrayDemonEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gay_demon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrayDemonEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
