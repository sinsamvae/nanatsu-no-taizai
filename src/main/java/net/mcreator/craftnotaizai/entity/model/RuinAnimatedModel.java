package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.RuinAnimatedEntity;

public class RuinAnimatedModel extends GeoModel<RuinAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(RuinAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/ruin_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RuinAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/ruin_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RuinAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
