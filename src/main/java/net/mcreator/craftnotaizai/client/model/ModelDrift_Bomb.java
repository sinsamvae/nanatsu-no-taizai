package net.mcreator.craftnotaizai.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelDrift_Bomb<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "model_drift_bomb"), "main");
	public final ModelPart bb_main;

	public ModelDrift_Bomb(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(4, 4).addBox(-5.0F, -21.0F, -7.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(6, 5).addBox(-4.0F, -20.0F, -8.0F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(-4.0F, -20.0F, -6.0F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(-6.0F, -20.0F, -6.0F, 10.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(-4.0F, -20.0F, -6.0F, 10.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(8, 5).addBox(-4.0F, -22.0F, -6.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(8, 6)
						.addBox(-4.0F, -20.0F, -6.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
