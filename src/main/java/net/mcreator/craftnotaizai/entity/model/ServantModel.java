package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.ServantEntity;

public class ServantModel extends GeoModel<ServantEntity> {
	@Override
	public ResourceLocation getAnimationResource(ServantEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gerheade.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ServantEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gerheade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ServantEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
