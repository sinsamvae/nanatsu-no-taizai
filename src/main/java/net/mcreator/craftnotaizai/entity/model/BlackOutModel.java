package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.BlackOutEntity;

public class BlackOutModel extends GeoModel<BlackOutEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlackOutEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/blackout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackOutEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/blackout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackOutEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
