package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.craftnotaizai.entity.HelbramSwordEntity;
import net.mcreator.craftnotaizai.client.model.ModelHelbram_Sword_Particles;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HelbramSwordRenderer extends EntityRenderer<HelbramSwordEntity> {
	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/entities/helbram_sword_particles.png");
	private final ModelHelbram_Sword_Particles model;

	public HelbramSwordRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelHelbram_Sword_Particles(context.bakeLayer(ModelHelbram_Sword_Particles.LAYER_LOCATION));
	}

	@Override
	public void render(HelbramSwordEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(HelbramSwordEntity entity) {
		return texture;
	}
}
