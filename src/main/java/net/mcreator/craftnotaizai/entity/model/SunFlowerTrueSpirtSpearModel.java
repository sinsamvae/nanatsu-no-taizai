package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.SunFlowerTrueSpirtSpearEntity;

public class SunFlowerTrueSpirtSpearModel extends GeoModel<SunFlowerTrueSpirtSpearEntity> {
	@Override
	public ResourceLocation getAnimationResource(SunFlowerTrueSpirtSpearEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/sunflower_true_spirt_spear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SunFlowerTrueSpirtSpearEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/sunflower_true_spirt_spear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SunFlowerTrueSpirtSpearEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
