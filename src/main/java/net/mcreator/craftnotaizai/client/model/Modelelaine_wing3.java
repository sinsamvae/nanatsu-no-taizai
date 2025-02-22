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
public class Modelelaine_wing3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelelaine_wing_3"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelelaine_wing3(ModelPart root) {
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
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(20, 20).addBox(-6.2986F, 0.2587F, 0.5651F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, -0.3614F, -1.0243F, 0.515F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(20, 14).mirror().addBox(-11.35F, -3.3F, 0.0F, 13.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7032F, 1.8457F, 2.9977F, 0.6988F, 0.8829F, 0.7288F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(20, 27).addBox(-11.5F, 4.5F, 0.0F, 12.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8889F, -0.9268F, 6.4179F, -0.8537F, 0.7382F, -1.1386F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-2.0395F, -6.3468F, 0.5651F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 0.9452F, 0.5913F, 1.0895F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-0.5488F, -3.1661F, 0.5651F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 0.559F, 0.9602F, 0.5536F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-5.2387F, 3.7158F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, -0.9011F, 0.6711F, -1.2118F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-1.5702F, 4.6724F, 0.5651F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, -0.5954F, 0.9433F, -0.7953F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(3, 18).mirror().addBox(-2.3F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5172F, 6.0562F, 1.6201F, 1.0535F, 0.1848F, 1.3682F));
		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(0.2986F, 0.2587F, 0.5651F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, -0.3614F, 1.0243F, -0.515F));
		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(5.5317F, -1.3644F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 1.019F, -0.3837F, 1.6988F));
		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(3.4368F, -2.0833F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 0.9859F, -0.4941F, 1.7766F));
		PartDefinition Body_r12 = Body.addOrReplaceChild("Body_r12", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(1.9725F, -0.6095F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 1.0561F, -0.1579F, 1.561F));
		PartDefinition Body_r13 = Body.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-0.0282F, -1.3941F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 0.9859F, -0.4941F, 1.7766F));
		PartDefinition Body_r14 = Body.addOrReplaceChild("Body_r14", CubeListBuilder.create().texOffs(0, 8).addBox(-11.9188F, 2.4939F, 0.5651F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, -0.9859F, 0.4941F, -1.365F));
		PartDefinition Body_r15 = Body.addOrReplaceChild("Body_r15", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-7.3983F, -1.3839F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 0.9616F, 0.5558F, 1.1196F));
		PartDefinition Body_r16 = Body.addOrReplaceChild("Body_r16", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-10.9821F, 1.4765F, 0.5651F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 1.049F, 0.2227F, 1.346F));
		PartDefinition Body_r17 = Body.addOrReplaceChild("Body_r17", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-8.6502F, -8.2051F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 0.6097F, 0.9361F, 0.616F));
		PartDefinition Body_r18 = Body.addOrReplaceChild("Body_r18", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-6.9892F, -7.0993F, 0.5651F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 0.773F, 0.8243F, 0.8272F));
		PartDefinition Body_r19 = Body.addOrReplaceChild("Body_r19", CubeListBuilder.create().texOffs(14, 10).addBox(-3.9166F, -3.0379F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 0.7376F, 0.8542F, 0.7797F));
		PartDefinition Body_r20 = Body.addOrReplaceChild("Body_r20", CubeListBuilder.create().texOffs(20, 20).mirror().addBox(-3.4786F, -6.5004F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 0.9073F, 0.6611F, 1.0248F));
		PartDefinition Body_r21 = Body.addOrReplaceChild("Body_r21", CubeListBuilder.create().texOffs(35, 8).addBox(7.5149F, -0.3782F, 0.5651F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2759F, 4.4513F, 6.8982F, 1.0419F, -0.2714F, 1.6277F));
		PartDefinition Body_r22 = Body.addOrReplaceChild("Body_r22", CubeListBuilder.create().texOffs(14, 10).mirror().addBox(0.9166F, -3.0379F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 0.7376F, -0.8542F, -0.7797F));
		PartDefinition Body_r23 = Body.addOrReplaceChild("Body_r23", CubeListBuilder.create().texOffs(20, 20).addBox(4.3983F, -1.3839F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 0.9616F, -0.5558F, -1.1196F));
		PartDefinition Body_r24 = Body.addOrReplaceChild("Body_r24", CubeListBuilder.create().texOffs(20, 20).addBox(6.9821F, 1.4765F, 0.5651F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 1.049F, -0.2227F, -1.346F));
		PartDefinition Body_r25 = Body.addOrReplaceChild("Body_r25", CubeListBuilder.create().texOffs(20, 20).addBox(5.6502F, -8.2051F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 0.6097F, -0.9361F, -0.616F));
		PartDefinition Body_r26 = Body.addOrReplaceChild("Body_r26", CubeListBuilder.create().texOffs(20, 20).addBox(1.9892F, -7.0993F, 0.5651F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 0.773F, -0.8243F, -0.8272F));
		PartDefinition Body_r27 = Body.addOrReplaceChild("Body_r27", CubeListBuilder.create().texOffs(20, 20).addBox(1.4786F, -6.5004F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 0.9073F, -0.6611F, -1.0248F));
		PartDefinition Body_r28 = Body.addOrReplaceChild("Body_r28", CubeListBuilder.create().texOffs(20, 27).mirror().addBox(-0.5F, 4.5F, 0.0F, 12.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.8889F, -0.9268F, 6.4179F, -0.8537F, -0.7382F, 1.1386F));
		PartDefinition Body_r29 = Body.addOrReplaceChild("Body_r29", CubeListBuilder.create().texOffs(20, 14).addBox(-1.65F, -3.3F, 0.0F, 13.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7032F, 1.8457F, 2.9977F, 0.6988F, -0.8829F, -0.7288F));
		PartDefinition Body_r30 = Body.addOrReplaceChild("Body_r30", CubeListBuilder.create().texOffs(20, 20).addBox(-2.9605F, -6.3468F, 0.5651F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 0.9452F, -0.5913F, -1.0895F));
		PartDefinition Body_r31 = Body.addOrReplaceChild("Body_r31", CubeListBuilder.create().texOffs(35, 8).mirror().addBox(-12.5149F, -0.3782F, 0.5651F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 1.0419F, 0.2714F, -1.6277F));
		PartDefinition Body_r32 = Body.addOrReplaceChild("Body_r32", CubeListBuilder.create().texOffs(20, 20).addBox(-7.5317F, -1.3644F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 1.019F, 0.3837F, -1.6988F));
		PartDefinition Body_r33 = Body.addOrReplaceChild("Body_r33", CubeListBuilder.create().texOffs(20, 20).addBox(-5.4368F, -2.0833F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 0.9859F, 0.4941F, -1.7766F));
		PartDefinition Body_r34 = Body.addOrReplaceChild("Body_r34", CubeListBuilder.create().texOffs(20, 20).addBox(-3.9725F, -0.6095F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 1.0561F, 0.1579F, -1.561F));
		PartDefinition Body_r35 = Body.addOrReplaceChild("Body_r35", CubeListBuilder.create().texOffs(20, 20).addBox(-1.9718F, -1.3941F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 0.9859F, 0.4941F, -1.7766F));
		PartDefinition Body_r36 = Body.addOrReplaceChild("Body_r36", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(5.9188F, 2.4939F, 0.5651F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, -0.9859F, -0.4941F, 1.365F));
		PartDefinition Body_r37 = Body.addOrReplaceChild("Body_r37", CubeListBuilder.create().texOffs(20, 20).addBox(3.2387F, 3.7158F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, -0.9011F, -0.6711F, 1.2118F));
		PartDefinition Body_r38 = Body.addOrReplaceChild("Body_r38", CubeListBuilder.create().texOffs(20, 20).addBox(-5.4298F, 4.6724F, 0.5651F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, -0.5954F, -0.9433F, 0.7953F));
		PartDefinition Body_r39 = Body.addOrReplaceChild("Body_r39", CubeListBuilder.create().texOffs(3, 18).addBox(-1.2F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5172F, 6.0562F, 1.6201F, 1.0535F, -0.1848F, -1.3682F));
		PartDefinition Body_r40 = Body.addOrReplaceChild("Body_r40", CubeListBuilder.create().texOffs(20, 20).addBox(-5.4512F, -3.1661F, 0.5651F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2759F, 4.4513F, 6.8982F, 0.559F, -0.9602F, -0.5536F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
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
