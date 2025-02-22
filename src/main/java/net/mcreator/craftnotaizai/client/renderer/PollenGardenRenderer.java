
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.craftnotaizai.entity.PollenGardenEntity;
import net.mcreator.craftnotaizai.client.model.ModelPollenGarden3;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PollenGardenRenderer extends MobRenderer<PollenGardenEntity, ModelPollenGarden3<PollenGardenEntity>> {
	public PollenGardenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPollenGarden3(context.bakeLayer(ModelPollenGarden3.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<PollenGardenEntity, ModelPollenGarden3<PollenGardenEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("craft_no_taizai:textures/entities/pollengaren.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PollenGardenEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	protected void scale(PollenGardenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(PollenGardenEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/pollengaren.png");
	}
}
