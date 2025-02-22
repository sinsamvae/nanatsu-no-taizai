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
public class Modelmodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelmodel"), "main");
	public final ModelPart Body;
	public final ModelPart leftwing;
	public final ModelPart rightwing;

	public Modelmodel(ModelPart root) {
		this.Body = root.getChild("Body");
		this.leftwing = root.getChild("leftwing");
		this.rightwing = root.getChild("rightwing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leftwing = Body.addOrReplaceChild("leftwing", CubeListBuilder.create(), PartPose.offset(4.0F, 0.1132F, 6.0604F));
		PartDefinition Body_r1 = leftwing.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -7.5618F, -2.5815F, 0.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 3.0427F, -0.75F, 2.9929F));
		PartDefinition Body_r2 = leftwing.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(26, 19).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.36F)),
				PartPose.offsetAndRotation(3.9503F, 13.483F, 1.1475F, -2.9351F, -0.75F, 2.9929F));
		PartDefinition Body_r3 = leftwing.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.36F)),
				PartPose.offsetAndRotation(3.7565F, 8.261F, 1.772F, -3.0223F, -0.75F, 2.9929F));
		PartDefinition Body_r4 = leftwing.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(14, 0).addBox(-0.5F, -0.6222F, -3.1766F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.36F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 3.1299F, -0.75F, 2.9929F));
		PartDefinition Body_r5 = leftwing.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(17, 8).addBox(-0.5F, -2.3064F, -3.1466F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.34F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 2.9118F, -0.75F, 2.9929F));
		PartDefinition Body_r6 = leftwing.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(17, 13).addBox(-0.5F, -2.853F, -3.5399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.32F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 2.65F, -0.75F, 2.9929F));
		PartDefinition Body_r7 = leftwing.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(17, 17).addBox(-0.5F, -3.1475F, -4.1326F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 2.3446F, -0.75F, 2.9929F));
		PartDefinition Body_r8 = leftwing.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -4.9049F, -1.3656F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 3.0427F, -0.75F, 2.9929F));
		PartDefinition Body_r9 = leftwing.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(19, 4).addBox(-0.5F, -3.5891F, -0.6544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -3.0223F, -0.75F, 2.9929F));
		PartDefinition Body_r10 = leftwing.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(17, 21).addBox(-0.5F, -2.1421F, -0.0801F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -2.7169F, -0.75F, 2.9929F));
		PartDefinition Body_r11 = leftwing.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(22, 8).addBox(-0.5F, -0.6352F, -0.0291F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -2.586F, -0.75F, 2.9929F));
		PartDefinition Body_r12 = leftwing.addOrReplaceChild("Body_r12", CubeListBuilder.create().texOffs(22, 15).addBox(-0.5F, 0.9112F, -0.6942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -0.8133F, 0.75F, -0.1486F));
		PartDefinition Body_r13 = leftwing.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(22, 12).addBox(-0.5F, 5.0038F, -0.5833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -1.206F, 0.75F, -0.1486F));
		PartDefinition Body_r14 = leftwing.addOrReplaceChild("Body_r14",
				CubeListBuilder.create().texOffs(22, 18).addBox(-0.5F, 1.0356F, 0.4144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(21, 24).addBox(-0.5F, 3.7529F, 1.4247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -1.5987F, 0.75F, -0.1486F));
		PartDefinition Body_r15 = leftwing.addOrReplaceChild("Body_r15",
				CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, 1.9089F, -0.3146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).texOffs(24, 3).addBox(-0.5F, 3.366F, -0.1087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -1.206F, 0.75F, -0.1486F));
		PartDefinition Body_r16 = leftwing.addOrReplaceChild("Body_r16", CubeListBuilder.create().texOffs(22, 21).addBox(-0.5F, 2.5008F, -1.4147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -0.8133F, 0.75F, -0.1486F));
		PartDefinition rightwing = Body.addOrReplaceChild("rightwing", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.1132F, 6.0604F));
		PartDefinition Body_r17 = rightwing.addOrReplaceChild("Body_r17", CubeListBuilder.create().texOffs(9, 0).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.36F)).mirror(false),
				PartPose.offsetAndRotation(-3.7565F, 8.261F, 1.772F, -3.0223F, 0.75F, -2.9929F));
		PartDefinition Body_r18 = rightwing.addOrReplaceChild("Body_r18", CubeListBuilder.create().texOffs(14, 0).mirror().addBox(-0.5F, -0.6222F, -3.1766F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.36F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 3.1299F, 0.75F, -2.9929F));
		PartDefinition Body_r19 = rightwing.addOrReplaceChild("Body_r19", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -7.5618F, -2.5815F, 0.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 3.0427F, 0.75F, -2.9929F));
		PartDefinition Body_r20 = rightwing.addOrReplaceChild("Body_r20", CubeListBuilder.create().texOffs(26, 19).mirror().addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.36F)).mirror(false),
				PartPose.offsetAndRotation(-3.9503F, 13.483F, 1.1475F, -2.9351F, 0.75F, -2.9929F));
		PartDefinition Body_r21 = rightwing.addOrReplaceChild("Body_r21", CubeListBuilder.create().texOffs(17, 8).mirror().addBox(-0.5F, -2.3064F, -3.1466F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.34F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 2.9118F, 0.75F, -2.9929F));
		PartDefinition Body_r22 = rightwing.addOrReplaceChild("Body_r22", CubeListBuilder.create().texOffs(17, 13).mirror().addBox(-0.5F, -2.853F, -3.5399F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 2.65F, 0.75F, -2.9929F));
		PartDefinition Body_r23 = rightwing.addOrReplaceChild("Body_r23", CubeListBuilder.create().texOffs(17, 17).mirror().addBox(-0.5F, -3.1475F, -4.1326F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 2.3446F, 0.75F, -2.9929F));
		PartDefinition Body_r24 = rightwing.addOrReplaceChild("Body_r24", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-0.5F, -4.9049F, -1.3656F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 3.0427F, 0.75F, -2.9929F));
		PartDefinition Body_r25 = rightwing.addOrReplaceChild("Body_r25", CubeListBuilder.create().texOffs(19, 4).mirror().addBox(-0.5F, -3.5891F, -0.6544F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, -3.0223F, 0.75F, -2.9929F));
		PartDefinition Body_r26 = rightwing.addOrReplaceChild("Body_r26", CubeListBuilder.create().texOffs(17, 21).mirror().addBox(-0.5F, -2.1421F, -0.0801F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, -2.7169F, 0.75F, -2.9929F));
		PartDefinition Body_r27 = rightwing.addOrReplaceChild("Body_r27", CubeListBuilder.create().texOffs(22, 8).mirror().addBox(-0.5F, -0.6352F, -0.0291F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, -2.586F, 0.75F, -2.9929F));
		PartDefinition Body_r28 = rightwing.addOrReplaceChild("Body_r28", CubeListBuilder.create().texOffs(22, 15).mirror().addBox(-0.5F, 0.9112F, -0.6942F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, -0.8133F, -0.75F, 0.1486F));
		PartDefinition Body_r29 = rightwing.addOrReplaceChild("Body_r29", CubeListBuilder.create().texOffs(22, 12).mirror().addBox(-0.5F, 5.0038F, -0.5833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, -1.206F, -0.75F, 0.1486F));
		PartDefinition Body_r30 = rightwing.addOrReplaceChild("Body_r30", CubeListBuilder.create().texOffs(22, 18).mirror().addBox(-0.5F, 1.0356F, 0.4144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false).texOffs(21, 24).mirror()
				.addBox(-0.5F, 3.7529F, 1.4247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, -1.5987F, -0.75F, 0.1486F));
		PartDefinition Body_r31 = rightwing.addOrReplaceChild("Body_r31", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, 1.9089F, -0.3146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false).texOffs(24, 3).mirror()
				.addBox(-0.5F, 3.366F, -0.1087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, -1.206F, -0.75F, 0.1486F));
		PartDefinition Body_r32 = rightwing.addOrReplaceChild("Body_r32", CubeListBuilder.create().texOffs(22, 21).mirror().addBox(-0.5F, 2.5008F, -1.4147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, -0.8133F, -0.75F, 0.1486F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
