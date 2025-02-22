package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.KingBossAnimatedEntity;

public class KingBossAnimatedModel extends GeoModel<KingBossAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(KingBossAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/boss_king.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KingBossAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/boss_king.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KingBossAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
