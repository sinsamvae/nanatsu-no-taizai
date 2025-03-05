package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GalandOverBossEntity;

public class GalandOverBossModel extends GeoModel<GalandOverBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(GalandOverBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/galand_over.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GalandOverBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/galand_over.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GalandOverBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
