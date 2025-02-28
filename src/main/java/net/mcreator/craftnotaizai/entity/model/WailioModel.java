package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.WailioEntity;

public class WailioModel extends GeoModel<WailioEntity> {
	@Override
	public ResourceLocation getAnimationResource(WailioEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/wailio.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WailioEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/wailio.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WailioEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
