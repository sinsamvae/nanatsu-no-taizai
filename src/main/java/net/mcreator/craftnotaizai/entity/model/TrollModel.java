package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.TrollEntity;

public class TrollModel extends GeoModel<TrollEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrollEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/troll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrollEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/troll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrollEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
