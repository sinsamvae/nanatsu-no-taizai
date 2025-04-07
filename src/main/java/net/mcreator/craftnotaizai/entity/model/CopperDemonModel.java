package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.CopperDemonEntity;

public class CopperDemonModel extends GeoModel<CopperDemonEntity> {
	@Override
	public ResourceLocation getAnimationResource(CopperDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/copper_demon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CopperDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/copper_demon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CopperDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
