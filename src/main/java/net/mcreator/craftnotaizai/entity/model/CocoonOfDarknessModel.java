package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.CocoonOfDarknessEntity;

public class CocoonOfDarknessModel extends GeoModel<CocoonOfDarknessEntity> {
	@Override
	public ResourceLocation getAnimationResource(CocoonOfDarknessEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/blackout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CocoonOfDarknessEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/blackout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CocoonOfDarknessEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
