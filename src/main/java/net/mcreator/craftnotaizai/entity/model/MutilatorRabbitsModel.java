package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.MutilatorRabbitsEntity;

public class MutilatorRabbitsModel extends GeoModel<MutilatorRabbitsEntity> {
	@Override
	public ResourceLocation getAnimationResource(MutilatorRabbitsEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/mutilator_rabbit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MutilatorRabbitsEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/mutilator_rabbit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MutilatorRabbitsEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
