package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GalandOverEntity;

public class GalandOverModel extends GeoModel<GalandOverEntity> {
	@Override
	public ResourceLocation getAnimationResource(GalandOverEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/galand_over.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GalandOverEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/galand_over.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GalandOverEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
