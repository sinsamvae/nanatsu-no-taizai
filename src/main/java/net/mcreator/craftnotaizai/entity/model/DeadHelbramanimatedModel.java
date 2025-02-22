package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DeadHelbramanimatedEntity;

public class DeadHelbramanimatedModel extends GeoModel<DeadHelbramanimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeadHelbramanimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/dead_helbram_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeadHelbramanimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/dead_helbram_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeadHelbramanimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
