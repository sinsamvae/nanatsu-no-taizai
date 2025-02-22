package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GloxinaBossEntity;

public class GloxinaBossModel extends GeoModel<GloxinaBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(GloxinaBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gloxina_boss.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GloxinaBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gloxina_boss.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GloxinaBossEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
