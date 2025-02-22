package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.ElaineStoryEntity;

public class ElaineStoryModel extends GeoModel<ElaineStoryEntity> {
	@Override
	public ResourceLocation getAnimationResource(ElaineStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/elaine_undead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElaineStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/elaine_undead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElaineStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
