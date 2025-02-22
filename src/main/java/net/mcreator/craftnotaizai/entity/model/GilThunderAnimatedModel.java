package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GilThunderAnimatedEntity;

public class GilThunderAnimatedModel extends GeoModel<GilThunderAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(GilThunderAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gilthunder_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GilThunderAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gilthunder_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GilThunderAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
