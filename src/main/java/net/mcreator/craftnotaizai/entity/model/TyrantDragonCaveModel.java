package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.TyrantDragonCaveEntity;

public class TyrantDragonCaveModel extends GeoModel<TyrantDragonCaveEntity> {
	@Override
	public ResourceLocation getAnimationResource(TyrantDragonCaveEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/tyrant_dragon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TyrantDragonCaveEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/tyrant_dragon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TyrantDragonCaveEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
