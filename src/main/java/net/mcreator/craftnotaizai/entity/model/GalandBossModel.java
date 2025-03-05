package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GalandBossEntity;

public class GalandBossModel extends GeoModel<GalandBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(GalandBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/galand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GalandBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/galand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GalandBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
