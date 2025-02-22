
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.LuigiEntity;
import net.mcreator.craftnotaizai.client.model.Modelminecraftskin;

public class LuigiRenderer extends MobRenderer<LuigiEntity, Modelminecraftskin<LuigiEntity>> {
	public LuigiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelminecraftskin(context.bakeLayer(Modelminecraftskin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LuigiEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/village_boy.png");
	}
}
