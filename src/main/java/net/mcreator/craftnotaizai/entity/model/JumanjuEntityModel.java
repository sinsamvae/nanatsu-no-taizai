package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.JumanjuEntityEntity;

public class JumanjuEntityModel extends GeoModel<JumanjuEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(JumanjuEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/tree-monster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JumanjuEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/tree-monster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JumanjuEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
