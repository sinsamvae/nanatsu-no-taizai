package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DeathpierceEntity;

public class DeathpierceModel extends GeoModel<DeathpierceEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeathpierceEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/death_pierce.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeathpierceEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/death_pierce.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeathpierceEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
