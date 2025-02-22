
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.MantaEntity;
import net.mcreator.craftnotaizai.client.model.Modelmantaray;

public class MantaRenderer extends MobRenderer<MantaEntity, Modelmantaray<MantaEntity>> {
	public MantaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmantaray(context.bakeLayer(Modelmantaray.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(MantaEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/manta_texture.png");
	}
}
