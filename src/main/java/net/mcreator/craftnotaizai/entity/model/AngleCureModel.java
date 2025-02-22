package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.AngleCureEntity;

public class AngleCureModel extends GeoModel<AngleCureEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngleCureEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/cure_angel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngleCureEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/cure_angel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngleCureEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
