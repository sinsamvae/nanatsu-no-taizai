package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.HellGateRedDemonsEntity;

public class HellGateRedDemonsModel extends GeoModel<HellGateRedDemonsEntity> {
	@Override
	public ResourceLocation getAnimationResource(HellGateRedDemonsEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/demonred5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HellGateRedDemonsEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/demonred5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HellGateRedDemonsEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
