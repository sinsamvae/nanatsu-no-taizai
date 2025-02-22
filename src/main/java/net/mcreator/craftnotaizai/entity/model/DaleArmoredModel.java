package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DaleArmoredEntity;

public class DaleArmoredModel extends GeoModel<DaleArmoredEntity> {
	@Override
	public ResourceLocation getAnimationResource(DaleArmoredEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/dale.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DaleArmoredEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/dale.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DaleArmoredEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
