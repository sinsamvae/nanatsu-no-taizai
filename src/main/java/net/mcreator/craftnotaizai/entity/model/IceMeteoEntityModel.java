package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.IceMeteoEntityEntity;

public class IceMeteoEntityModel extends GeoModel<IceMeteoEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(IceMeteoEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/ice_spike_2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IceMeteoEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/ice_spike_2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IceMeteoEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
