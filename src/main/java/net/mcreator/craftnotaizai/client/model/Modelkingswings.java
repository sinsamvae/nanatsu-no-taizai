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

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelkingswings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelkingswings"), "main");
	public final ModelPart Body;

	public Modelkingswings(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition wingone = Body.addOrReplaceChild("wingone", CubeListBuilder.create(), PartPose.offset(4.2759F, 4.4513F, 6.8982F));
		PartDefinition Body_r1 = wingone.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(20, 26).addBox(-0.5214F, -6.2504F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9073F, -0.6611F, -1.0248F));
		PartDefinition Body_r2 = wingone.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(26, 20).addBox(-0.2608F, -6.5993F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.773F, -0.8243F, -0.8272F));
		PartDefinition Body_r3 = wingone.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(21, 24).addBox(0.4002F, -6.7051F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6097F, -0.9361F, -0.616F));
		PartDefinition Body_r4 = wingone.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(19, 14).addBox(3.2321F, -1.0235F, 0.5651F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.049F, -0.2227F, -1.346F));
		PartDefinition Body_r5 = wingone.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(19, 6).addBox(-3.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8901F, -1.8412F, -2.5442F, 0.6097F, -0.9361F, -0.616F));
		PartDefinition Body_r6 = wingone.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(0, 13).addBox(-1.65F, -3.3F, 0.0F, 9.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5727F, -2.6055F, -3.9006F, 0.6988F, -0.8829F, -0.7288F));
		PartDefinition Body_r7 = wingone.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(14, 24).addBox(-2.9605F, -6.3468F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9452F, -0.5913F, -1.0895F));
		PartDefinition wingone2 = Body.addOrReplaceChild("wingone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8367F, -0.1541F, 5.2563F, 0.0F, -0.8727F, 0.0F));
		PartDefinition Body_r8 = wingone2.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(26, 16).addBox(-0.5214F, -6.2504F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1127F, 4.6053F, 1.6419F, 0.9073F, -0.6611F, -1.0248F));
		PartDefinition Body_r9 = wingone2.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(26, 18).addBox(-0.2608F, -6.5993F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1127F, 4.6053F, 1.6419F, 0.773F, -0.8243F, -0.8272F));
		PartDefinition Body_r10 = wingone2.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(0, 24).addBox(0.4002F, -6.7051F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1127F, 4.6053F, 1.6419F, 0.6097F, -0.9361F, -0.616F));
		PartDefinition Body_r11 = wingone2.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(19, 12).addBox(3.2321F, -1.0235F, 0.5651F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1127F, 4.6053F, 1.6419F, 1.049F, -0.2227F, -1.346F));
		PartDefinition Body_r12 = wingone2.addOrReplaceChild("Body_r12", CubeListBuilder.create().texOffs(19, 4).addBox(-3.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7774F, 2.7641F, -0.9024F, 0.6097F, -0.9361F, -0.616F));
		PartDefinition Body_r13 = wingone2.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(0, 13).addBox(-1.65F, -3.3F, 0.0F, 9.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4601F, 1.9998F, -2.2587F, 0.6988F, -0.8829F, -0.7288F));
		PartDefinition Body_r14 = wingone2.addOrReplaceChild("Body_r14", CubeListBuilder.create().texOffs(7, 24).addBox(-2.9605F, -6.3468F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1127F, 4.6053F, 1.6419F, 0.9452F, -0.5913F, -1.0895F));
		PartDefinition wingone3 = Body.addOrReplaceChild("wingone3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.028F, 5.4668F, 5.0356F, -0.4363F, 0.0F, 0.0F));
		PartDefinition Body_r15 = wingone3.addOrReplaceChild("Body_r15", CubeListBuilder.create().texOffs(10, 26).addBox(-0.5214F, -6.2504F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.248F, 4.4845F, 1.8626F, 0.9073F, -0.6611F, -1.0248F));
		PartDefinition Body_r16 = wingone3.addOrReplaceChild("Body_r16", CubeListBuilder.create().texOffs(15, 26).addBox(-0.2608F, -6.5993F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.248F, 4.4845F, 1.8626F, 0.773F, -0.8243F, -0.8272F));
		PartDefinition Body_r17 = wingone3.addOrReplaceChild("Body_r17", CubeListBuilder.create().texOffs(19, 20).addBox(0.4002F, -6.7051F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.248F, 4.4845F, 1.8626F, 0.6097F, -0.9361F, -0.616F));
		PartDefinition Body_r18 = wingone3.addOrReplaceChild("Body_r18", CubeListBuilder.create().texOffs(19, 10).addBox(3.2321F, -1.0235F, 0.5651F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.248F, 4.4845F, 1.8626F, 1.049F, -0.2227F, -1.346F));
		PartDefinition Body_r19 = wingone3.addOrReplaceChild("Body_r19", CubeListBuilder.create().texOffs(19, 2).addBox(-3.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6421F, 2.6433F, -0.6816F, 0.6097F, -0.9361F, -0.616F));
		PartDefinition Body_r20 = wingone3.addOrReplaceChild("Body_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-1.65F, -3.3F, 0.0F, 9.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3248F, 1.879F, -2.038F, 0.6988F, -0.8829F, -0.7288F));
		PartDefinition Body_r21 = wingone3.addOrReplaceChild("Body_r21", CubeListBuilder.create().texOffs(19, 22).addBox(-2.9605F, -6.3468F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.248F, 4.4845F, 1.8626F, 0.9452F, -0.5913F, -1.0895F));
		PartDefinition wingone4 = Body.addOrReplaceChild("wingone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.222F, 5.4668F, 5.7856F, -0.4363F, -0.8727F, 0.0F));
		PartDefinition Body_r22 = wingone4.addOrReplaceChild("Body_r22", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5214F, -6.2504F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.248F, 4.4845F, 1.8626F, 0.9073F, -0.6611F, -1.0248F));
		PartDefinition Body_r23 = wingone4.addOrReplaceChild("Body_r23", CubeListBuilder.create().texOffs(5, 26).addBox(-0.2608F, -6.5993F, 0.5651F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.248F, 4.4845F, 1.8626F, 0.773F, -0.8243F, -0.8272F));
		PartDefinition Body_r24 = wingone4.addOrReplaceChild("Body_r24", CubeListBuilder.create().texOffs(19, 16).addBox(0.4002F, -6.7051F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.248F, 4.4845F, 1.8626F, 0.6097F, -0.9361F, -0.616F));
		PartDefinition Body_r25 = wingone4.addOrReplaceChild("Body_r25", CubeListBuilder.create().texOffs(19, 8).addBox(3.2321F, -1.0235F, 0.5651F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.248F, 4.4845F, 1.8626F, 1.049F, -0.2227F, -1.346F));
		PartDefinition Body_r26 = wingone4.addOrReplaceChild("Body_r26", CubeListBuilder.create().texOffs(19, 0).addBox(-3.0F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6421F, 2.6433F, -0.6816F, 0.6097F, -0.9361F, -0.616F));
		PartDefinition Body_r27 = wingone4.addOrReplaceChild("Body_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-1.65F, -3.3F, 0.0F, 9.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3248F, 1.879F, -2.038F, 0.6988F, -0.8829F, -0.7288F));
		PartDefinition Body_r28 = wingone4.addOrReplaceChild("Body_r28", CubeListBuilder.create().texOffs(19, 18).addBox(-2.9605F, -6.3468F, 0.5651F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.248F, 4.4845F, 1.8626F, 0.9452F, -0.5913F, -1.0895F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
