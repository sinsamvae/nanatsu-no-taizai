package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.JigumoEntity;

public class JigumoModel extends GeoModel<JigumoEntity> {
	@Override
	public ResourceLocation getAnimationResource(JigumoEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/jigumo_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JigumoEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/jigumo_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JigumoEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
