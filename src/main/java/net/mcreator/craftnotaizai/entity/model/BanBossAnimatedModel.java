package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.BanBossAnimatedEntity;

public class BanBossAnimatedModel extends GeoModel<BanBossAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(BanBossAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/ban_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BanBossAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/ban_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BanBossAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
