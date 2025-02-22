package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GoddessBlessEntityEntity;

public class GoddessBlessEntityModel extends GeoModel<GoddessBlessEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoddessBlessEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/blackout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoddessBlessEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/blackout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoddessBlessEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
