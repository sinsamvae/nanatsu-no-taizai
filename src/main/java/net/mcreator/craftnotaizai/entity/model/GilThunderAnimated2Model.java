package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GilThunderAnimated2Entity;

public class GilThunderAnimated2Model extends GeoModel<GilThunderAnimated2Entity> {
	@Override
	public ResourceLocation getAnimationResource(GilThunderAnimated2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gilthunder_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GilThunderAnimated2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gilthunder_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GilThunderAnimated2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
