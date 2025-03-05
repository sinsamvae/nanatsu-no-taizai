package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.ArdenEntity;

public class ArdenModel extends GeoModel<ArdenEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArdenEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/weinheidt_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArdenEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/weinheidt_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArdenEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
