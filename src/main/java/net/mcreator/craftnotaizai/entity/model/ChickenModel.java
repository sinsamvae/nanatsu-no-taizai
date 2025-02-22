package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.ChickenEntity;

public class ChickenModel extends GeoModel<ChickenEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChickenEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/chicken_matango.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChickenEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/chicken_matango.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChickenEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
