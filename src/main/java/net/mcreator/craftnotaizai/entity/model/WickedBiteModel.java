package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.WickedBiteEntity;

public class WickedBiteModel extends GeoModel<WickedBiteEntity> {
	@Override
	public ResourceLocation getAnimationResource(WickedBiteEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/wicked_bite.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WickedBiteEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/wicked_bite.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WickedBiteEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
