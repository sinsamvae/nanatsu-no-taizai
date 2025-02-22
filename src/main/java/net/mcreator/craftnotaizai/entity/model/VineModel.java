package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.VineEntity;

public class VineModel extends GeoModel<VineEntity> {
	@Override
	public ResourceLocation getAnimationResource(VineEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/vine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VineEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/vine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VineEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
