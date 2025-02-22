package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.AlbionTallEntity;

public class AlbionTallModel extends GeoModel<AlbionTallEntity> {
	@Override
	public ResourceLocation getAnimationResource(AlbionTallEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/tall_albion.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AlbionTallEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/tall_albion.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AlbionTallEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
