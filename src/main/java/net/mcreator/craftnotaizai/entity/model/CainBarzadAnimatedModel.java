package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.CainBarzadAnimatedEntity;

public class CainBarzadAnimatedModel extends GeoModel<CainBarzadAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(CainBarzadAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/cain_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CainBarzadAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/cain_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CainBarzadAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
