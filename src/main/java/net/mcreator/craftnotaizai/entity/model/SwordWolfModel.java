package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.SwordWolfEntity;

public class SwordWolfModel extends GeoModel<SwordWolfEntity> {
	@Override
	public ResourceLocation getAnimationResource(SwordWolfEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/swordwolf1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SwordWolfEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/swordwolf1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SwordWolfEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
