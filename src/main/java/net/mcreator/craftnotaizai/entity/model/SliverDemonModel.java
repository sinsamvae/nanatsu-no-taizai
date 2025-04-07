package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.SliverDemonEntity;

public class SliverDemonModel extends GeoModel<SliverDemonEntity> {
	@Override
	public ResourceLocation getAnimationResource(SliverDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/silver_demon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SliverDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/silver_demon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SliverDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
