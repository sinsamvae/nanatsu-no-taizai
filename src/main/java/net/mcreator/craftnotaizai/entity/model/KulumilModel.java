package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.KulumilEntity;

public class KulumilModel extends GeoModel<KulumilEntity> {
	@Override
	public ResourceLocation getAnimationResource(KulumilEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/kulumil.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KulumilEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/kulumil.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KulumilEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
