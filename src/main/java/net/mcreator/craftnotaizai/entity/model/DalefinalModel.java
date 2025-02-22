package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DalefinalEntity;

public class DalefinalModel extends GeoModel<DalefinalEntity> {
	@Override
	public ResourceLocation getAnimationResource(DalefinalEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/dale_third1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DalefinalEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/dale_third1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DalefinalEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
