
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.SunflowerEntity;
import net.mcreator.craftnotaizai.client.model.Modelsunflower;

import com.mojang.blaze3d.vertex.PoseStack;

public class SunflowerRenderer extends MobRenderer<SunflowerEntity, Modelsunflower<SunflowerEntity>> {
	public SunflowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsunflower(context.bakeLayer(Modelsunflower.LAYER_LOCATION)), 1.4f);
	}

	@Override
	protected void scale(SunflowerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.4f, 1.4f, 1.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(SunflowerEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/sunflower-texture.png");
	}
}
