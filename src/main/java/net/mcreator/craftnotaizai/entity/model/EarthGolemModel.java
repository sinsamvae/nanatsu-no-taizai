package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.EarthGolemEntity;

public class EarthGolemModel extends GeoModel<EarthGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(EarthGolemEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/dwayne_golems.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EarthGolemEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/dwayne_golems.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EarthGolemEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
