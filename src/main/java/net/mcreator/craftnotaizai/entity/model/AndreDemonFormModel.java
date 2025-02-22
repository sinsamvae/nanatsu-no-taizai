package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.AndreDemonFormEntity;

public class AndreDemonFormModel extends GeoModel<AndreDemonFormEntity> {
	@Override
	public ResourceLocation getAnimationResource(AndreDemonFormEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/demonholyknight2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AndreDemonFormEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/demonholyknight2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AndreDemonFormEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
