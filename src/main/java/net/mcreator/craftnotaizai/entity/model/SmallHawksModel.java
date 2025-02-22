package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.SmallHawksEntity;

public class SmallHawksModel extends GeoModel<SmallHawksEntity> {
	@Override
	public ResourceLocation getAnimationResource(SmallHawksEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/pig_grex.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SmallHawksEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/pig_grex.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SmallHawksEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
