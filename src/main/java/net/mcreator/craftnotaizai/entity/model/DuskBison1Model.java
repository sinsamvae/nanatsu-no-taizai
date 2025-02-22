package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.DuskBison1Entity;

public class DuskBison1Model extends GeoModel<DuskBison1Entity> {
	@Override
	public ResourceLocation getAnimationResource(DuskBison1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/bison_dusk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DuskBison1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/bison_dusk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DuskBison1Entity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
