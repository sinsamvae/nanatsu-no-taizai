
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.ChainExplosionV2Entity;
import net.mcreator.craftnotaizai.client.model.ModelFire_ball;

import com.mojang.blaze3d.vertex.PoseStack;

public class ChainExplosionV2Renderer extends MobRenderer<ChainExplosionV2Entity, ModelFire_ball<ChainExplosionV2Entity>> {
	public ChainExplosionV2Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelFire_ball(context.bakeLayer(ModelFire_ball.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(ChainExplosionV2Entity entity, PoseStack poseStack, float f) {
		poseStack.scale(3f, 3f, 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChainExplosionV2Entity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/chainexplosionv2.png");
	}
}
