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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelRising_Meteor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "model_rising_meteor"), "main");
	public final ModelPart bone;

	public ModelRising_Meteor(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(66, 4).addBox(-1.0F, -2.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 0).addBox(-3.0F, -2.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 59)
						.addBox(-3.0F, -59.0F, 8.0F, 6.0F, 57.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(92, 0).addBox(-3.0F, -59.0F, -8.0F, 6.0F, 57.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 6)
						.addBox(3.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 118).addBox(3.0F, -59.0F, 6.0F, 2.0F, 57.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 4)
						.addBox(5.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 116).addBox(5.0F, -59.0F, 4.0F, 2.0F, 57.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 0)
						.addBox(7.0F, -2.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 4).addBox(7.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(7.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 10).addBox(5.0F, -2.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 0)
						.addBox(5.0F, -59.0F, -4.0F, 2.0F, 57.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 6).addBox(3.0F, -2.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(110, 59)
						.addBox(3.0F, -59.0F, -6.0F, 2.0F, 57.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 2).addBox(1.0F, -2.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 8)
						.addBox(-1.0F, -2.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 4).addBox(-3.0F, -2.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(-5.0F, -2.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(108, 0).addBox(-5.0F, -59.0F, -6.0F, 2.0F, 57.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-7.0F, -2.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 73).addBox(-7.0F, -59.0F, -4.0F, 2.0F, 57.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-9.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-9.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
						.addBox(-9.0F, -2.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 69).addBox(-9.0F, -59.0F, -2.0F, 2.0F, 57.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(7.0F, -59.0F, -2.0F, 2.0F, 57.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-7.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(122, 57)
						.addBox(-7.0F, -59.0F, 4.0F, 2.0F, 57.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 118)
						.addBox(-5.0F, -59.0F, 6.0F, 2.0F, 57.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 69).addBox(-5.0F, -59.0F, -4.0F, 2.0F, 59.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(3.0F, -59.0F, -4.0F, 2.0F, 59.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(54, 59).addBox(5.0F, -59.0F, -4.0F, 2.0F, 59.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-7.0F, -59.0F, -4.0F, 2.0F, 59.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(60, 2).addBox(1.0F, -2.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -59.0F, -6.0F, 6.0F, 59.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
