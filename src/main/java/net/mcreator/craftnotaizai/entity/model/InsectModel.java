package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.InsectEntity;

public class InsectModel extends GeoModel<InsectEntity> {
	@Override
	public ResourceLocation getAnimationResource(InsectEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/insect_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InsectEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/insect_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InsectEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
