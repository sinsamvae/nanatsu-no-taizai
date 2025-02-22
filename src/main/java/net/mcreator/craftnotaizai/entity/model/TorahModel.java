package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.TorahEntity;

public class TorahModel extends GeoModel<TorahEntity> {
	@Override
	public ResourceLocation getAnimationResource(TorahEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/torah.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TorahEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/torah.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TorahEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
