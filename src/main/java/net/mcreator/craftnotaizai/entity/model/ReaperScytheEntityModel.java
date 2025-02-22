package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.ReaperScytheEntityEntity;

public class ReaperScytheEntityModel extends GeoModel<ReaperScytheEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(ReaperScytheEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/reaper_scythe_enitiy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ReaperScytheEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/reaper_scythe_enitiy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ReaperScytheEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
