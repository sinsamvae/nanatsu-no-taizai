package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.PuoraEntity;

public class PuoraModel extends GeoModel<PuoraEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuoraEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/puora.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuoraEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/puora.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuoraEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
