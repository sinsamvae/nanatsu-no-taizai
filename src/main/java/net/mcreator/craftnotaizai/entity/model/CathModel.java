package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.CathEntity;

public class CathModel extends GeoModel<CathEntity> {
	@Override
	public ResourceLocation getAnimationResource(CathEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/cath.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CathEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/cath.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CathEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
