package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.StoneDroleEntity;

public class StoneDroleModel extends GeoModel<StoneDroleEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoneDroleEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/drole_stone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoneDroleEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/drole_stone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoneDroleEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
