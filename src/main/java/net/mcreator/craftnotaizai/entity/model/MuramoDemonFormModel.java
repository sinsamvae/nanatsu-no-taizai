package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.MuramoDemonFormEntity;

public class MuramoDemonFormModel extends GeoModel<MuramoDemonFormEntity> {
	@Override
	public ResourceLocation getAnimationResource(MuramoDemonFormEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/demonholyknight1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MuramoDemonFormEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/demonholyknight1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MuramoDemonFormEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
