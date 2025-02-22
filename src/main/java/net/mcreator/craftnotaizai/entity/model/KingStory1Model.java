package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.KingStory1Entity;

public class KingStory1Model extends GeoModel<KingStory1Entity> {
	@Override
	public ResourceLocation getAnimationResource(KingStory1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/ban_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KingStory1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/ban_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KingStory1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
