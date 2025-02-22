package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.ZeldrisStoryEntity;

public class ZeldrisStoryModel extends GeoModel<ZeldrisStoryEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZeldrisStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/zeldris.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZeldrisStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/zeldris.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZeldrisStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
