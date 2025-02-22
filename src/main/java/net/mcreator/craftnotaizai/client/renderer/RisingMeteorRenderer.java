
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.RisingMeteorEntity;
import net.mcreator.craftnotaizai.client.model.Modelrisingmetor2;

import com.mojang.blaze3d.vertex.PoseStack;

public class RisingMeteorRenderer extends MobRenderer<RisingMeteorEntity, Modelrisingmetor2<RisingMeteorEntity>> {
	public RisingMeteorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrisingmetor2(context.bakeLayer(Modelrisingmetor2.LAYER_LOCATION)), 1f);
	}

	@Override
	protected void scale(RisingMeteorEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(3.5f, 3.5f, 3.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RisingMeteorEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/risingmetor2.png");
	}
}
