package net.mcreator.craftnotaizai.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.block.entity.RhittaBlockTileEntity;

public class RhittaBlockBlockModel extends GeoModel<RhittaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RhittaBlockTileEntity animatable) {
		return new ResourceLocation("craft_no_taizai", "animations/rhitta_blocks.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RhittaBlockTileEntity animatable) {
		return new ResourceLocation("craft_no_taizai", "geo/rhitta_blocks.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RhittaBlockTileEntity animatable) {
		return new ResourceLocation("craft_no_taizai", "textures/block/rhitta-texture.png");
	}
}
