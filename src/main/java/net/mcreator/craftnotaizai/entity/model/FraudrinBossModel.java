package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.FraudrinBossEntity;

public class FraudrinBossModel extends GeoModel<FraudrinBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(FraudrinBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/fraudrin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FraudrinBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/fraudrin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FraudrinBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
