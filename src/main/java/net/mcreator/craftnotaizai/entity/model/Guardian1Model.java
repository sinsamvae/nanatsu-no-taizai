package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.Guardian1Entity;

public class Guardian1Model extends GeoModel<Guardian1Entity> {
	@Override
	public ResourceLocation getAnimationResource(Guardian1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/teddybear_king.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Guardian1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/teddybear_king.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Guardian1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
