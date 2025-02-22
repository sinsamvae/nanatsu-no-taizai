package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.HideAndSeekEntity;

public class HideAndSeekModel extends GeoModel<HideAndSeekEntity> {
	@Override
	public ResourceLocation getAnimationResource(HideAndSeekEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/hideandseek.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HideAndSeekEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/hideandseek.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HideAndSeekEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
