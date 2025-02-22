package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.MossDragonEntity;

public class MossDragonModel extends GeoModel<MossDragonEntity> {
	@Override
	public ResourceLocation getAnimationResource(MossDragonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/mossdragon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MossDragonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/mossdragon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MossDragonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
