
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.DemonKingEntity;
import net.mcreator.craftnotaizai.client.model.Modeldemon_king;

import com.mojang.blaze3d.vertex.PoseStack;

public class DemonKingRenderer extends MobRenderer<DemonKingEntity, Modeldemon_king<DemonKingEntity>> {
	public DemonKingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldemon_king(context.bakeLayer(Modeldemon_king.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(DemonKingEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(DemonKingEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/demon_king_texture_purple.png");
	}
}
