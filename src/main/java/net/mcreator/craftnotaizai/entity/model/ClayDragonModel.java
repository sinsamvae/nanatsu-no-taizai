package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.ClayDragonEntity;

public class ClayDragonModel extends GeoModel<ClayDragonEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClayDragonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/clay_dragon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClayDragonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/clay_dragon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClayDragonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
