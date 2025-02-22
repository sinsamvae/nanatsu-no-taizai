package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.JerichoDemonFormEntity;

public class JerichoDemonFormModel extends GeoModel<JerichoDemonFormEntity> {
	@Override
	public ResourceLocation getAnimationResource(JerichoDemonFormEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/jericho_demon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JerichoDemonFormEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/jericho_demon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JerichoDemonFormEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
