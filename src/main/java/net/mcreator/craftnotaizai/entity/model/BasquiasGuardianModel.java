package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.BasquiasGuardianEntity;

public class BasquiasGuardianModel extends GeoModel<BasquiasGuardianEntity> {
	@Override
	public ResourceLocation getAnimationResource(BasquiasGuardianEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/basquias_guardian.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BasquiasGuardianEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/basquias_guardian.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BasquiasGuardianEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
