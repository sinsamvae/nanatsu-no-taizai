package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.TyrantDragonEntity;

public class TyrantDragonModel extends GeoModel<TyrantDragonEntity> {
	@Override
	public ResourceLocation getAnimationResource(TyrantDragonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/tyrant_dragon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TyrantDragonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/tyrant_dragon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TyrantDragonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
