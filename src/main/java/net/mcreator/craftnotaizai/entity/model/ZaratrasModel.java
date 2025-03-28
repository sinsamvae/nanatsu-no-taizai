package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.ZaratrasEntity;

public class ZaratrasModel extends GeoModel<ZaratrasEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZaratrasEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/zaratras.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZaratrasEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/zaratras.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZaratrasEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
