package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.craftnotaizai.entity.IncreaseTrueSpiritSpearProjectileEntity;
import net.mcreator.craftnotaizai.client.model.Modelincrease_true_spirt_spear;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class IncreaseTrueSpiritSpearProjectileRenderer extends EntityRenderer<IncreaseTrueSpiritSpearProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/entities/increase_true_spirt_spear.png");
	private final Modelincrease_true_spirt_spear model;

	public IncreaseTrueSpiritSpearProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelincrease_true_spirt_spear(context.bakeLayer(Modelincrease_true_spirt_spear.LAYER_LOCATION));
	}

	@Override
	public void render(IncreaseTrueSpiritSpearProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(IncreaseTrueSpiritSpearProjectileEntity entity) {
		return texture;
	}
}
