
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.LightningSpreeEntityEntity;
import net.mcreator.craftnotaizai.client.model.ModelPollenGarden3;

import com.mojang.blaze3d.vertex.PoseStack;

public class LightningSpreeEntityRenderer extends MobRenderer<LightningSpreeEntityEntity, ModelPollenGarden3<LightningSpreeEntityEntity>> {
	public LightningSpreeEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPollenGarden3(context.bakeLayer(ModelPollenGarden3.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(LightningSpreeEntityEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(LightningSpreeEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/lightning_spree.png");
	}
}
