package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GigaPickEntity;

public class GigaPickModel extends GeoModel<GigaPickEntity> {
	@Override
	public ResourceLocation getAnimationResource(GigaPickEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/giga_pick.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GigaPickEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/giga_pick.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GigaPickEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
