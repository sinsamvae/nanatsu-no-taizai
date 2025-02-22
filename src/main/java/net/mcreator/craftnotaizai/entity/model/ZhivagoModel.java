package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.ZhivagoEntity;

public class ZhivagoModel extends GeoModel<ZhivagoEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZhivagoEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/zhivago.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZhivagoEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/zhivago.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZhivagoEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
