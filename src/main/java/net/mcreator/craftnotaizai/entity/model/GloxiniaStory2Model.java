package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GloxiniaStory2Entity;

public class GloxiniaStory2Model extends GeoModel<GloxiniaStory2Entity> {
	@Override
	public ResourceLocation getAnimationResource(GloxiniaStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/gloxina_boss.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GloxiniaStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/gloxina_boss.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GloxiniaStory2Entity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
