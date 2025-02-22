package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.craftnotaizai.entity.BrilliantDetonationProjectileEntity;
import net.mcreator.craftnotaizai.client.model.ModelBrilliant_Detonation;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BrilliantDetonationProjectileRenderer extends EntityRenderer<BrilliantDetonationProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/entities/sun_curel.png");
	private final ModelBrilliant_Detonation model;

	public BrilliantDetonationProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelBrilliant_Detonation(context.bakeLayer(ModelBrilliant_Detonation.LAYER_LOCATION));
	}

	@Override
	public void render(BrilliantDetonationProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(BrilliantDetonationProjectileEntity entity) {
		return texture;
	}
}
