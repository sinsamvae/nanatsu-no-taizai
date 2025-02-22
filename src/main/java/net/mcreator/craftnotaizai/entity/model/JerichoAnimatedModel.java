package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.JerichoAnimatedEntity;

public class JerichoAnimatedModel extends GeoModel<JerichoAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(JerichoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/jericho_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JerichoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/jericho_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JerichoAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
