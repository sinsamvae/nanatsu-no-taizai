package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.HendricksonAnimatedEntity;

public class HendricksonAnimatedModel extends GeoModel<HendricksonAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(HendricksonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/hendrickson_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HendricksonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/hendrickson_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HendricksonAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
