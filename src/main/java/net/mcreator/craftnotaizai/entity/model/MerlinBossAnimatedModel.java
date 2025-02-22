package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.MerlinBossAnimatedEntity;

public class MerlinBossAnimatedModel extends GeoModel<MerlinBossAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(MerlinBossAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/diane_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MerlinBossAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/diane_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MerlinBossAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
