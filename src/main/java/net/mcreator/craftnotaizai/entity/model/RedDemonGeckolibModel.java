package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.RedDemonGeckolibEntity;

public class RedDemonGeckolibModel extends GeoModel<RedDemonGeckolibEntity> {
	@Override
	public ResourceLocation getAnimationResource(RedDemonGeckolibEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/demonred5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RedDemonGeckolibEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/demonred5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RedDemonGeckolibEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
