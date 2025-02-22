package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.TallAlbionEntity;

public class TallAlbionModel extends GeoModel<TallAlbionEntity> {
	@Override
	public ResourceLocation getAnimationResource(TallAlbionEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/tall_albion.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TallAlbionEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/tall_albion.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TallAlbionEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
