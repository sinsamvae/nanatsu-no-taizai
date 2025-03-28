package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DemonMarkMeliodasEntity;

public class DemonMarkMeliodasModel extends GeoModel<DemonMarkMeliodasEntity> {
	@Override
	public ResourceLocation getAnimationResource(DemonMarkMeliodasEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/diane_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DemonMarkMeliodasEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/diane_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DemonMarkMeliodasEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
