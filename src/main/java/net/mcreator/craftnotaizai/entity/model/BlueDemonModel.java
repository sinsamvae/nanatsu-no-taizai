package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.BlueDemonEntity;

public class BlueDemonModel extends GeoModel<BlueDemonEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlueDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/dolzzo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlueDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/dolzzo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlueDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
