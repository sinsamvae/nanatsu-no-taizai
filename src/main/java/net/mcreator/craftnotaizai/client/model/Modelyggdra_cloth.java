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
public class Modelyggdra_cloth<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelyggdra_cloth"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelyggdra_cloth(ModelPart root) {
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
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 27).addBox(-4.0F, -1.0F, -2.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(46, 60).addBox(-1.0F, 0.95F, -3.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(0, 38)
						.addBox(-2.0F, 0.5F, -2.7F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(69, 67).addBox(-2.5F, 1.0F, -2.55F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(69, 67).mirror()
						.addBox(1.5F, 1.0F, -2.55F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(27, 27).addBox(-4.0F, 4.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(23, 37)
						.addBox(-4.0F, 9.5F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(25, 19).addBox(-4.0F, 10.5F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.65F)).texOffs(25, 0)
						.addBox(-4.0F, 11.5F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.85F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(69, 67).addBox(1.091F, -4.7123F, -2.225F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(69, 67).mirror()
				.addBox(4.4497F, -3.8284F, -2.275F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.5F, -0.375F, 0.0F, 0.0F, -0.7854F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(69, 67).mirror().addBox(-2.091F, -4.7123F, -2.225F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(69, 67).addBox(-5.4497F,
				-3.8284F, -2.275F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 6.5F, -0.375F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Head = partdefinition
				.addOrReplaceChild(
						"Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.4F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(0, 17).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(22, 27)
								.mirror().addBox(-1.0F, -1.0F, -4.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(25, 9).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.7F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(22, 27).addBox(-2.9523F, -0.2528F, -2.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, -1.45F, -2.05F, 0.0F, 0.0F, -0.3491F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(22, 27).mirror().addBox(0.9523F, -0.2528F, -2.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.45F, -2.05F, 0.0F, 0.0F, 0.3491F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(49, 43).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(61, 60).addBox(-3.0F, 3.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.27F)).texOffs(32, 43)
						.addBox(-3.0F, 5.04F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)).texOffs(34, 53).addBox(-3.0F, 6.04F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.9F)).texOffs(0, 59)
						.addBox(-3.0F, 9.54F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.27F)).texOffs(63, 5).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.7F)).texOffs(61, 17)
						.addBox(-3.0F, 0.15F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(38, 74).addBox(-7.5F, 5.39F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(56, 72)
						.addBox(-6.0F, 6.04F, -0.5F, 3.0F, 8.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(77, 65).addBox(0.9718F, -3.2053F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.27F)),
				PartPose.offsetAndRotation(-3.75F, 9.1245F, 0.0F, 0.0F, 0.0F, -1.2654F));
		PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2",
				CubeListBuilder.create().texOffs(39, 61).addBox(-3.8251F, 3.9222F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)).texOffs(0, 17).addBox(-4.3747F, 4.2657F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-3.75F, 9.1245F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition RightArm_r3 = RightArm.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(74, 25).addBox(-7.5187F, 6.5046F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.26F)),
				PartPose.offsetAndRotation(-3.75F, 9.1245F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition RightArm_r4 = RightArm.addOrReplaceChild("RightArm_r4",
				CubeListBuilder.create().texOffs(74, 55).addBox(-0.6998F, 4.9759F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.27F)).texOffs(0, 0).addBox(-2.1598F, 4.9759F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.27F)),
				PartPose.offsetAndRotation(-3.75F, 9.1245F, 0.0F, 0.0F, 0.0F, 0.0785F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(49, 43).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(61, 60).mirror()
						.addBox(-1.0F, 3.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.27F)).mirror(false).texOffs(32, 43).mirror().addBox(-1.0F, 5.04F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)).mirror(false).texOffs(34, 53).mirror()
						.addBox(-1.0F, 6.04F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.9F)).mirror(false).texOffs(0, 59).mirror().addBox(-1.0F, 9.54F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.27F)).mirror(false).texOffs(56, 72).mirror()
						.addBox(3.0F, 6.04F, -0.5F, 3.0F, 8.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(38, 74).mirror().addBox(5.5F, 5.39F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(63, 5).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.7F)).mirror(false).texOffs(61, 17).mirror().addBox(-1.0F, 0.15F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(2.3747F, 4.2657F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(39, 61).mirror()
				.addBox(-0.1749F, 3.9222F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(3.75F, 9.1245F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.1598F, 4.9759F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false).texOffs(74, 55).mirror()
				.addBox(-1.3002F, 4.9759F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false), PartPose.offsetAndRotation(3.75F, 9.1245F, 0.0F, 0.0F, 0.0F, -0.0785F));
		PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(74, 25).mirror().addBox(5.5187F, 6.5046F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false),
				PartPose.offsetAndRotation(3.75F, 9.1245F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition LeftArm_r4 = LeftArm.addOrReplaceChild("LeftArm_r4", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(-2.9718F, -3.2053F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false),
				PartPose.offsetAndRotation(3.75F, 9.1245F, 0.0F, 0.0F, 0.0F, 1.2654F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-1.9F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(48, 33).mirror().addBox(-1.9F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F))
						.mirror(false).texOffs(74, 19).mirror().addBox(-0.4F, 8.25F, -2.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(0, 72).mirror().addBox(-0.9F, 7.75F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.25F))
						.mirror(false).texOffs(33, 6).mirror().addBox(-1.9F, 11.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)).mirror(false).texOffs(13, 68).mirror().addBox(-1.9F, 4.75F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.7F))
						.mirror(false).texOffs(65, 33).mirror().addBox(-1.9F, 3.75F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.9F)).mirror(false).texOffs(64, 49).mirror().addBox(-1.9F, 2.75F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(1.1F))
						.mirror(false).texOffs(67, 11).mirror().addBox(-1.9F, 5.75F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(50, 0).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(48, 33).addBox(-2.1F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(74, 19)
						.addBox(-0.6F, 8.25F, -2.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 72).addBox(-1.1F, 7.75F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(33, 6)
						.addBox(-2.1F, 11.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.24F)).texOffs(13, 68).addBox(-2.1F, 4.75F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.7F)).texOffs(65, 33)
						.addBox(-2.1F, 3.75F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.9F)).texOffs(64, 49).addBox(-2.1F, 2.75F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(1.1F)).texOffs(67, 11)
						.addBox(-2.1F, 5.75F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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
