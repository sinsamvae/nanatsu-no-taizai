package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.WeinheidtAnimatedEntity;

public class WeinheidtAnimatedModel extends GeoModel<WeinheidtAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(WeinheidtAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/weinheidt_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WeinheidtAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/weinheidt_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WeinheidtAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
