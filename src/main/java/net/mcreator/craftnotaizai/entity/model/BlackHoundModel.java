package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.BlackHoundEntity;

public class BlackHoundModel extends GeoModel<BlackHoundEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlackHoundEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/blackhound1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackHoundEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/blackhound1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackHoundEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
