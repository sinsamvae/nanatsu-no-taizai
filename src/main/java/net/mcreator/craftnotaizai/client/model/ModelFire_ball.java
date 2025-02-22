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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelFire_ball<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "model_fire_ball"), "main");
	public final ModelPart bone;

	public ModelFire_ball(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 21.5F, 1.5F));
		PartDefinition Effects = bone.addOrReplaceChild("Effects",
				CubeListBuilder.create().texOffs(6, 18).addBox(1.5F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(1.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-3.5F, -4.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 8).addBox(-3.5F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 6)
						.addBox(0.0F, -5.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 16).addBox(-3.0F, -5.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 4)
						.addBox(0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 18).addBox(-2.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(1.0F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 14).addBox(-3.0F, -4.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 19)
						.addBox(0.0F, -2.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 19).addBox(-1.0F, -4.0F, 3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -2.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 2.5F, -1.5F));
		PartDefinition Pads = bone.addOrReplaceChild("Pads",
				CubeListBuilder.create().texOffs(16, 10).addBox(-1.5F, -1.5F, -2.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 0).addBox(-1.5F, -1.5F, 1.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Pads.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 10).addBox(-1.5F, -1.5F, -2.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-1.5F, -1.5F, 1.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = Pads.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 14).addBox(-1.5F, -1.5F, -2.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(-1.5F, -1.5F, 1.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
