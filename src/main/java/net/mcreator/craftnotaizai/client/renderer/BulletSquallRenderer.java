
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.BulletSquallEntity;
import net.mcreator.craftnotaizai.client.model.Modelearthrock;

import com.mojang.blaze3d.vertex.PoseStack;

public class BulletSquallRenderer extends MobRenderer<BulletSquallEntity, Modelearthrock<BulletSquallEntity>> {
	public BulletSquallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelearthrock(context.bakeLayer(Modelearthrock.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(BulletSquallEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.2f, 1.2f, 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(BulletSquallEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/earth.png");
	}
}
