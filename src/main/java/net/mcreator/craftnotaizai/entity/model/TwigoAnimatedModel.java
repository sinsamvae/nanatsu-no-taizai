package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.TwigoAnimatedEntity;

public class TwigoAnimatedModel extends GeoModel<TwigoAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(TwigoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/twigoasword.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TwigoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/twigoasword.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TwigoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
