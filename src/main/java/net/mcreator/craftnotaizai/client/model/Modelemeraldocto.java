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

// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelemeraldocto<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelemeraldocto"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelemeraldocto(ModelPart root) {
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
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 41).addBox(-7.9421F, 1.0716F, 6.2456F, 13.2548F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 0.4173F, -1.0075F, -0.3587F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(49, 0).addBox(-5.4797F, 0.7917F, 5.6089F, 13.2548F, 9.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 0.296F, 0.4855F, 0.2316F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(126, 67).addBox(-6.7903F, -10.599F, 12.5405F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 0.8912F, 1.1944F, -2.4559F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(111, 98).addBox(-5.0388F, -10.3873F, 11.7266F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 3.0337F, 1.235F, -0.3343F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 63).addBox(10.2621F, -8.1389F, -4.9028F, 8.0F, 7.0F, 13.2548F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, -2.709F, 0.3878F, 0.3091F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 84).addBox(-6.8004F, -9.4342F, 11.1537F, 13.2548F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, -2.7882F, -0.3324F, -0.0591F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(96, 0).addBox(-6.7109F, -10.7631F, 10.7174F, 13.2548F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, -2.8971F, 0.4708F, 0.0311F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(129, 0).addBox(-11.6519F, 2.0454F, 4.4431F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1204F, 6.7631F, -0.6376F, -2.4386F, -0.8933F, 2.7492F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(27, 124).addBox(-5.7975F, 0.2197F, 2.2034F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1204F, 6.7631F, -0.6376F, -2.5227F, -1.439F, 2.92F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(113, 40).addBox(-1.4028F, 0.4328F, 2.065F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1204F, 6.7631F, -0.6376F, 0.4369F, -0.9948F, 0.0406F));
		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 110).addBox(-0.7074F, -1.4278F, 5.5389F, 9.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 0.4631F, 0.2672F, 0.5041F));
		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(90, 59).addBox(-0.3953F, 1.1732F, 4.2926F, 13.2548F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1204F, 6.7631F, -0.6376F, 0.4556F, -0.2042F, 0.0994F));
		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(127, 12).addBox(-9.5885F, 8.9259F, -14.3655F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.25F, 14.09F, 0.8521F, -3.0205F, 0.9816F, -2.9235F));
		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 67).addBox(0.2772F, -1.4234F, -6.7532F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9491F, 20.5032F, 10.0526F, -2.9628F, 0.8249F, -3.084F));
		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(94, 14).addBox(-12.1217F, -3.7889F, -6.8525F, 13.2548F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9491F, 20.5032F, 10.0526F, -2.8678F, -0.6176F, 3.0923F));
		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(122, 122).addBox(-4.1568F, -2.8489F, -5.1368F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9491F, 20.5032F, 10.0526F, -2.8987F, 0.1687F, 2.9936F));
		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(127, 91).addBox(-1.1564F, -3.1103F, -14.7387F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 2.2117F, 0.1902F, -2.7679F));
		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(120, 83).addBox(-4.6305F, -3.4688F, -14.6915F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 2.1242F, -0.3486F, -2.6663F));
		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(93, 122).addBox(-10.01F, -0.222F, 3.6563F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7068F, 4.4408F, 1.9171F, 2.41F, -0.5032F, -1.5497F));
		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 94).addBox(-7.3411F, -1.9892F, -0.0434F, 13.2548F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7068F, 4.4408F, 1.9171F, 1.9078F, -0.6796F, -0.6052F));
		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 120).addBox(-5.0F, -3.0F, -3.5F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5562F, 5.1939F, 9.6177F, 1.0271F, -0.2884F, 1.2182F));
		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 106).addBox(-0.3191F, -1.3617F, 1.8799F, 10.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7068F, 4.4408F, 1.9171F, 1.3905F, -0.5845F, 0.4063F));
		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(123, 50).addBox(-5.3704F, -2.8735F, -15.432F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 1.756F, -0.8013F, -2.1519F));
		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(87, 1).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.1162F, -8.9761F, -0.8615F, -0.7433F, -0.2731F, 2.0683F));
		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(86, 0).addBox(-4.3119F, 10.846F, 1.5203F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.473F, -0.5051F, 7.0907F, -0.7433F, -0.2731F, 2.0683F));
		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(60, 55).addBox(-10.1408F, 5.2686F, 0.6135F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.473F, -0.5051F, 7.0907F, -0.2909F, -0.7377F, 1.2018F));
		PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 0).addBox(-8.8794F, 2.2344F, 0.0553F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.473F, -0.5051F, 7.0907F, 0.0431F, -0.7819F, 0.7218F));
		PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(103, 71).addBox(-5.9659F, 0.3578F, -0.4953F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.473F, -0.5051F, 7.0907F, 0.3575F, -0.7258F, 0.2988F));
		PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(107, 26).addBox(-1.1577F, 0.162F, -0.7941F, 10.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.473F, -0.5051F, 7.0907F, 0.4644F, -0.308F, 0.3554F));
		PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 46).addBox(2.0434F, 0.0804F, -16.4221F, 8.0F, 7.0F, 13.2548F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.473F, -0.5051F, 7.0907F, 1.1175F, -1.0071F, -0.5801F));
		PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(95, 27).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.2222F, 21.5554F, -5.1731F, -0.4985F, -0.2748F, -2.219F));
		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(94, 26).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.8072F, 18.46F, -4.55F, -0.5592F, -0.0747F, -1.8752F));
		PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(36, 76).addBox(-1.5F, -1.5F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.4763F, 16.3159F, -4.5245F, -0.4392F, 0.3653F, -1.1064F));
		PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(97, 132).addBox(0.0F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.8992F, 14.719F, -5.0006F, -0.2887F, 0.4911F, -0.7478F));
		PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(43, 20).addBox(-6.9813F, -2.7557F, -3.6179F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5441F, 9.9637F, -10.0286F, -0.088F, 0.5574F, -0.3947F));
		PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(104, 108).addBox(-1.0965F, -3.257F, -4.4973F, 10.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5441F, 9.9637F, -10.0286F, 0.0929F, 0.1538F, -0.2671F));
		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(30, 55).addBox(1.4784F, -5.1934F, -3.2049F, 8.0F, 7.0F, 13.2548F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1597F, 8.9708F, -6.151F, 0.3262F, 1.104F, 0.0566F));
		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 24).addBox(4.9889F, -7.0372F, -0.0753F, 9.0F, 8.0F, 13.2548F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1597F, 8.9708F, -6.151F, 0.1096F, 0.3135F, -0.0498F));
		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(39, 98).addBox(-6.534F, -3.0979F, -15.5501F, 13.2548F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 0.7499F, -0.8628F, -0.9351F));
		PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(86, 84).addBox(-6.586F, -1.9425F, -16.1596F, 13.2548F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 0.2962F, -0.226F, -0.3287F));
		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 76).addBox(-7.0869F, 2.6579F, 5.3008F, 13.2548F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 0.3604F, -0.2457F, -0.0914F));
		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(64, 20).addBox(-16.2429F, -0.8477F, -6.6551F, 8.0F, 7.0F, 13.2548F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 0.3736F, -1.012F, -0.5597F));
		PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(32, 33).addBox(-16.1873F, -0.3406F, -7.3802F, 9.0F, 8.0F, 13.2548F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 0.2535F, -0.2771F, -0.1565F));
		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 0).addBox(7.1048F, -1.4271F, -8.5561F, 11.0F, 10.0F, 13.2548F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.59F, 1.1021F, 0.321F, -0.3152F, 0.1448F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
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
