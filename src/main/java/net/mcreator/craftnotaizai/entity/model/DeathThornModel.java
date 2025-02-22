package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DeathThornEntity;

public class DeathThornModel extends GeoModel<DeathThornEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeathThornEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/death_thorn.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeathThornEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/death_thorn.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeathThornEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
