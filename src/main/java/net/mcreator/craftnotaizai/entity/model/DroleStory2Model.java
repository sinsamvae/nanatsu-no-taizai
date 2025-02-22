package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DroleStory2Entity;

public class DroleStory2Model extends GeoModel<DroleStory2Entity> {
	@Override
	public ResourceLocation getAnimationResource(DroleStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/drole.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DroleStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/drole.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DroleStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
