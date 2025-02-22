package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.HowzerAnimatedEntity;

public class HowzerAnimatedModel extends GeoModel<HowzerAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(HowzerAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/howzer_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HowzerAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/howzer_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HowzerAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
