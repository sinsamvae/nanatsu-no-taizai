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
public class Modelflame_ball<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelflame_ball"), "main");
	public final ModelPart cruelsun;

	public Modelflame_ball(ModelPart root) {
		this.cruelsun = root.getChild("cruelsun");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cruelsun = partdefinition.addOrReplaceChild("cruelsun",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.85F, -16.25F, -12.15F, 24.0F, 26.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 51).addBox(-10.5F, -18.0F, -10.5F, 21.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-10.5F, 9.0F, -10.5F, 21.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 76).addBox(11.85F, -13.35F, -10.5F, 3.0F, 21.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 119)
						.addBox(-10.5F, -13.5F, -15.0F, 21.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 119).addBox(-10.5F, -13.5F, 12.0F, 21.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-15.0F, -13.35F, -10.5F, 3.0F, 21.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition cube_r1 = cruelsun.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(140, 50).addBox(-10.35F, -10.5F, -1.5F, 6.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.864F, -3.0F, -6.5147F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r2 = cruelsun.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(140, 50).addBox(4.5F, -10.5F, -1.5F, 6.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.864F, -3.0F, -6.5147F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r3 = cruelsun.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(140, 50).addBox(4.5F, -10.5F, -1.5F, 6.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.864F, -3.0F, 6.5147F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r4 = cruelsun.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(140, 50).addBox(-10.35F, -10.5F, -1.5F, 6.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.864F, -3.0F, 6.5147F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r5 = cruelsun.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 126).addBox(-10.5F, -1.5F, 4.2F, 21.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.5147F, -16.864F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r6 = cruelsun.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(98, 76).addBox(-3.0F, -1.5F, -10.5F, 6.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5607F, 8.818F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r7 = cruelsun.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 126).addBox(-10.5F, -1.5F, -3.15F, 21.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.7119F, 11.6667F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r8 = cruelsun.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(98, 76).addBox(-3.0F, -1.5F, -10.5F, 6.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.5607F, 8.818F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r9 = cruelsun.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(49, 126).addBox(-10.5F, -1.5F, 4.2F, 21.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.5147F, -16.864F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r10 = cruelsun.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(49, 126).addBox(-10.5F, -1.5F, -3.15F, 21.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.7119F, 11.6667F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r11 = cruelsun.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(98, 76).addBox(-3.0F, -1.5F, -10.5F, 6.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.5607F, -14.818F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r12 = cruelsun.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(98, 76).addBox(-3.0F, -1.5F, -10.5F, 6.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5607F, -14.818F, 0.0F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		cruelsun.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
