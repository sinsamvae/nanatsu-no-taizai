package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DreyfusDemonEntity;

public class DreyfusDemonModel extends GeoModel<DreyfusDemonEntity> {
	@Override
	public ResourceLocation getAnimationResource(DreyfusDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/dreyfus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DreyfusDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/dreyfus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DreyfusDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
