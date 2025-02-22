package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.AndreAnimatedEntity;

public class AndreAnimatedModel extends GeoModel<AndreAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(AndreAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/royal_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AndreAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/royal_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AndreAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
