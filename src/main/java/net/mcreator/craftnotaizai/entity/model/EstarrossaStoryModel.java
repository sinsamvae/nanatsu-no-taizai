package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.EstarrossaStoryEntity;

public class EstarrossaStoryModel extends GeoModel<EstarrossaStoryEntity> {
	@Override
	public ResourceLocation getAnimationResource(EstarrossaStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/estarrossa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EstarrossaStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/estarrossa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EstarrossaStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
