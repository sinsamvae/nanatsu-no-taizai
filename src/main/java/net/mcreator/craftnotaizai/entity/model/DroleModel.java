package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DroleEntity;

public class DroleModel extends GeoModel<DroleEntity> {
	@Override
	public ResourceLocation getAnimationResource(DroleEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/drole.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DroleEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/drole.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DroleEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
