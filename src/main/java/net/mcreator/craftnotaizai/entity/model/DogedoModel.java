package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DogedoEntity;

public class DogedoModel extends GeoModel<DogedoEntity> {
	@Override
	public ResourceLocation getAnimationResource(DogedoEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/dogedo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DogedoEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/dogedo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DogedoEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
