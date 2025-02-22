package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GalandStory2Entity;

public class GalandStory2Model extends GeoModel<GalandStory2Entity> {
	@Override
	public ResourceLocation getAnimationResource(GalandStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/galand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GalandStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/galand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GalandStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
