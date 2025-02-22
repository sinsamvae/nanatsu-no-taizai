package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GuilaDemonanimatedEntity;

public class GuilaDemonanimatedModel extends GeoModel<GuilaDemonanimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(GuilaDemonanimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/guila_mob_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GuilaDemonanimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/guila_mob_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GuilaDemonanimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
