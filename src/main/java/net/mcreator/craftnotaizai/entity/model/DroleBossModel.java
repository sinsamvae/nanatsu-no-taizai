package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DroleBossEntity;

public class DroleBossModel extends GeoModel<DroleBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(DroleBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/drole.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DroleBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/drole.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DroleBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
