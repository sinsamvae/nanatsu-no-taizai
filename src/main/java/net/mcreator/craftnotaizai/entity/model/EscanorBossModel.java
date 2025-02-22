package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.EscanorBossEntity;

public class EscanorBossModel extends GeoModel<EscanorBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(EscanorBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/escanor_mob.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EscanorBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/escanor_mob.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EscanorBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
