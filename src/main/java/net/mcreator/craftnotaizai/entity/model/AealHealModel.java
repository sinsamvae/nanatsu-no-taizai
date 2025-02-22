package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.AealHealEntity;

public class AealHealModel extends GeoModel<AealHealEntity> {
	@Override
	public ResourceLocation getAnimationResource(AealHealEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/blackout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AealHealEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/blackout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AealHealEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
