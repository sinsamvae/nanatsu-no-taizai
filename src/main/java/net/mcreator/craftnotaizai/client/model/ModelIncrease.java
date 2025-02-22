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

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelIncrease<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "model_increase"), "main");
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone;

	public ModelIncrease(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone = this.bone2.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, -1.5708F, -3.1416F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -2.8939F, -0.3268F, 0.1F, 6.55F, 0.7F, new CubeDeformation(0.0F)).texOffs(3, 5)
				.addBox(-0.05F, -1.7654F, -1.1812F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)).texOffs(3, 0).addBox(-0.05F, -1.7664F, 0.3285F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.3998F, -0.0232F));
		PartDefinition cube_r1 = bone3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-0.05F, -0.375F, -0.475F, 0.1F, 0.75F, 0.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.7917F, -0.5747F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(3, 18).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9599F, -0.4917F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 2).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.678F, 0.539F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9609F, 0.539F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.679F, -0.4917F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1561F, 0.4006F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.157F, -0.3533F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 18).addBox(-0.05F, -0.85F, -0.375F, 0.1F, 1.7F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0569F, 0.3623F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone = bone2.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(5, 9).addBox(-0.75F, -0.5261F, -1.5004F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-0.75F, -0.5261F, 0.7496F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(13, 0)
						.addBox(-0.75F, -1.7278F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(-0.75F, 0.5222F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(17, 13)
						.addBox(-0.5F, 1.2222F, -0.3487F, 1.0F, 0.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.4778F, 0.0004F));
		PartDefinition hexadecagon_r1 = bone.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(5, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, -0.4309F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = bone.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(16, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, 0.4301F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = bone.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(18, 10).addBox(-0.4F, -0.25F, -0.25F, 0.8F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0222F, 0.0048F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = bone.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(17, 5).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, 0.4301F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r5 = bone.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(10, 17).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, -0.4309F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r6 = bone.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(6, 0).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, 0.7951F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r7 = bone.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(6, 3).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, -0.7959F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r8 = bone.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(13, 3).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, 1.039F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r9 = bone.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(7, 13).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, -1.0397F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r10 = bone.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(12, 14).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, -1.0397F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r11 = bone.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(0, 15).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, 1.039F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r12 = bone.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(11, 11).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, -0.7959F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r13 = bone.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(0, 12).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, 0.7951F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
