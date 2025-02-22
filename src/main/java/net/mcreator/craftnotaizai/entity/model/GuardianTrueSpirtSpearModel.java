package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GuardianTrueSpirtSpearEntity;

public class GuardianTrueSpirtSpearModel extends GeoModel<GuardianTrueSpirtSpearEntity> {
	@Override
	public ResourceLocation getAnimationResource(GuardianTrueSpirtSpearEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/guardian_true_spirt_spear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GuardianTrueSpirtSpearEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/guardian_true_spirt_spear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GuardianTrueSpirtSpearEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
