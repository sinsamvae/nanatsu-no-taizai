package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.ZeldrisBossEntity;

public class ZeldrisBossModel extends GeoModel<ZeldrisBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZeldrisBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/zeldris.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZeldrisBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/zeldris.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZeldrisBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
