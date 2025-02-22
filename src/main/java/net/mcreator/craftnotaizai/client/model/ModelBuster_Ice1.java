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

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBuster_Ice1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "model_buster_ice_1"), "main");
	public final ModelPart Diamond;

	public ModelBuster_Ice1(ModelPart root) {
		this.Diamond = root.getChild("Diamond");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Diamond = partdefinition.addOrReplaceChild("Diamond",
				CubeListBuilder.create().texOffs(31, 24).addBox(-8.0F, -5.5F, -3.3137F, 16.0F, 7.0F, 6.6274F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-3.3137F, -5.5F, -8.0F, 6.6274F, 7.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(27, 59)
						.addBox(-2.8995F, -7.5F, -7.0F, 5.799F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 76).addBox(-7.0F, -7.5F, -2.8995F, 14.0F, 2.0F, 5.799F, new CubeDeformation(0.0F)).texOffs(89, 0)
						.addBox(-2.2782F, -8.5F, -5.5F, 4.5563F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(92, 71).addBox(-5.5F, -8.5F, -2.2782F, 11.0F, 1.0F, 4.5563F, new CubeDeformation(0.0F)).texOffs(47, 15)
						.addBox(-1.4497F, -9.5F, -3.5F, 2.8995F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(102, 13).addBox(-3.5F, -9.5F, -1.4497F, 7.0F, 1.0F, 2.8995F, new CubeDeformation(0.0F)).texOffs(72, 33)
						.addBox(-7.0F, -0.5F, -2.8995F, 14.0F, 5.0F, 5.799F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-2.8995F, -0.5F, -7.0F, 5.799F, 5.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(55, 63)
						.addBox(-2.6924F, 4.5F, -6.5F, 5.3848F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(36, 80).addBox(-6.5F, 4.5F, -2.6924F, 13.0F, 3.0F, 5.3848F, new CubeDeformation(0.0F)).texOffs(0, 85)
						.addBox(-2.2782F, 7.5F, -5.5F, 4.5563F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(44, 89).addBox(-5.5F, 7.5F, -2.2782F, 11.0F, 2.0F, 4.5563F, new CubeDeformation(0.0F)).texOffs(74, 97)
						.addBox(-1.864F, 9.5F, -4.5F, 3.7279F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-4.5F, 9.5F, -1.864F, 9.0F, 2.0F, 3.7279F, new CubeDeformation(0.0F)).texOffs(48, 104)
						.addBox(-1.2426F, 11.5F, -3.0F, 2.4853F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(27, 48).addBox(-3.0F, 11.5F, -1.2426F, 6.0F, 1.0F, 2.4853F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6213F, 12.5F, -1.5F, 1.2426F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(-1.5F, 12.5F, -0.6213F, 3.0F, 1.0F, 1.2426F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6213F, -10.5F, -1.5F, 1.2426F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(-1.5F, -10.5F, -0.6213F, 3.0F, 1.0F, 1.2426F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, -3.1416F));
		PartDefinition cube_r1 = Diamond.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(6, 5).addBox(-1.5F, -0.5F, -0.6213F, 3.0F, 1.0F, 1.2426F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(-0.6213F, -0.5F, -1.5F, 1.2426F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(-1.5F, 22.5F, -0.6213F, 3.0F, 1.0F, 1.2426F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(-0.6213F, 22.5F, -1.5F, 1.2426F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 68)
						.addBox(-3.0F, 21.5F, -1.2426F, 6.0F, 1.0F, 2.4853F, new CubeDeformation(0.0F)).texOffs(95, 104).addBox(-1.2426F, 21.5F, -3.0F, 2.4853F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(92, 97)
						.addBox(-4.5F, 19.5F, -1.864F, 9.0F, 2.0F, 3.7279F, new CubeDeformation(0.0F)).texOffs(0, 99).addBox(-1.864F, 19.5F, -4.5F, 3.7279F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(77, 89)
						.addBox(-5.5F, 17.5F, -2.2782F, 11.0F, 2.0F, 4.5563F, new CubeDeformation(0.0F)).texOffs(87, 45).addBox(-2.2782F, 17.5F, -5.5F, 4.5563F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(73, 80)
						.addBox(-6.5F, 14.5F, -2.6924F, 13.0F, 3.0F, 5.3848F, new CubeDeformation(0.0F)).texOffs(65, 2).addBox(-2.6924F, 14.5F, -6.5F, 5.3848F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(33, 39)
						.addBox(-2.8995F, 9.5F, -7.0F, 5.799F, 5.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(71, 19).addBox(-7.0F, 9.5F, -2.8995F, 14.0F, 5.0F, 5.799F, new CubeDeformation(0.0F)).texOffs(105, 78)
						.addBox(-3.5F, 0.5F, -1.4497F, 7.0F, 1.0F, 2.8995F, new CubeDeformation(0.0F)).texOffs(27, 102).addBox(-1.4497F, 0.5F, -3.5F, 2.8995F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(50, 97)
						.addBox(-5.5F, 1.5F, -2.2782F, 11.0F, 1.0F, 4.5563F, new CubeDeformation(0.0F)).texOffs(22, 89).addBox(-2.2782F, 1.5F, -5.5F, 4.5563F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(79, 62)
						.addBox(-7.0F, 2.5F, -2.8995F, 14.0F, 2.0F, 5.799F, new CubeDeformation(0.0F)).texOffs(60, 45).addBox(-2.8995F, 2.5F, -7.0F, 5.799F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.3137F, 4.5F, -8.0F, 6.6274F, 7.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(31, 0).addBox(-8.0F, 4.5F, -3.3137F, 16.0F, 7.0F, 6.6274F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Diamond.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
