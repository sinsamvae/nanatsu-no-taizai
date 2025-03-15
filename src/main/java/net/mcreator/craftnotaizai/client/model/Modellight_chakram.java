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

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modellight_chakram<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modellight_chakram"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modellight_chakram(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(20, 11).addBox(-0.5F, 14.6462F, -1.0607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)).texOffs(27, 16).addBox(-0.5F, 6.4538F, -0.9393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.9858F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 1).addBox(0.0F, -4.9858F, -5.0F, 0.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(15, 14).addBox(-0.5F, -2.5F, 3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 12).addBox(-0.5F, -3.9142F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)).texOffs(14, 27)
						.addBox(-0.5F, -3.9142F, -2.5858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0002F)).texOffs(21, 27).addBox(-0.5F, -3.9142F, 0.5858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0002F)).texOffs(15, 23)
						.addBox(-0.5F, 2.9142F, 0.5858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0002F)).texOffs(15, 7).addBox(-0.5F, -2.5F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 26)
						.addBox(-0.5F, 2.9142F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)).texOffs(0, 26).addBox(-0.5F, 2.9142F, -2.5858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0002F)),
				PartPose.offsetAndRotation(0.0F, 11.05F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2",
				CubeListBuilder.create().texOffs(27, 8).addBox(-0.5F, -4.5962F, -1.0607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)).texOffs(20, 19).addBox(-0.5F, 3.5962F, -0.9393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)),
				PartPose.offsetAndRotation(0.0F, 11.05F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(20, 7).addBox(-0.5F, 6.4538F, -0.9393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)).texOffs(28, 27).addBox(-0.5F, 14.6462F, -1.0607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(14, 31).addBox(-0.5F, 2.9142F, 0.5858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0002F)).texOffs(0, 30).addBox(-0.5F, 2.9142F, -2.5858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0002F)).texOffs(29, 20)
						.addBox(-0.5F, 2.9142F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)).texOffs(27, 4).addBox(-0.5F, -3.9142F, -2.5858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0002F)).texOffs(25, 0)
						.addBox(-0.5F, -3.9142F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)).texOffs(20, 0).addBox(-0.5F, -2.5F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 15)
						.addBox(-0.5F, -3.9142F, 0.5858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0002F)).texOffs(34, -10).addBox(0.0F, -4.9858F, -5.0F, 0.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -2.9858F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(15, 0).addBox(-0.5F, -2.5F, 3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.05F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(7, 30).addBox(-0.5F, 3.5962F, -0.9393F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)).texOffs(22, 23).addBox(-0.5F, -4.5962F, -1.0607F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0001F)),
				PartPose.offsetAndRotation(0.0F, 11.05F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
