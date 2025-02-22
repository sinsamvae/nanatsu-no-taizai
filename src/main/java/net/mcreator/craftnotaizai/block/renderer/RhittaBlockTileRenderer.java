package net.mcreator.craftnotaizai.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.craftnotaizai.block.model.RhittaBlockBlockModel;
import net.mcreator.craftnotaizai.block.entity.RhittaBlockTileEntity;

public class RhittaBlockTileRenderer extends GeoBlockRenderer<RhittaBlockTileEntity> {
	public RhittaBlockTileRenderer() {
		super(new RhittaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RhittaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
