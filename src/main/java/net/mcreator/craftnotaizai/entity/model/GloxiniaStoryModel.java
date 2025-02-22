package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GloxiniaStoryEntity;

public class GloxiniaStoryModel extends GeoModel<GloxiniaStoryEntity> {
	@Override
	public ResourceLocation getAnimationResource(GloxiniaStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gloxina_boss.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GloxiniaStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gloxina_boss.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GloxiniaStoryEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
