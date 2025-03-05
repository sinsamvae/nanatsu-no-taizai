package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GrayRoadBossEntity;

public class GrayRoadBossModel extends GeoModel<GrayRoadBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrayRoadBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gillian.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrayRoadBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gillian.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrayRoadBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
