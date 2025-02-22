package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DaleSecEntity;

public class DaleSecModel extends GeoModel<DaleSecEntity> {
	@Override
	public ResourceLocation getAnimationResource(DaleSecEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/dale_second1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DaleSecEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/dale_second1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DaleSecEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
