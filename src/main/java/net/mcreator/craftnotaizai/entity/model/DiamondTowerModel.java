package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DiamondTowerEntity;

public class DiamondTowerModel extends GeoModel<DiamondTowerEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiamondTowerEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/diamond_tower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiamondTowerEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/diamond_tower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiamondTowerEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
