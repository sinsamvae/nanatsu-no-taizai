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
public class Modelashdragon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelashdragon"), "main");
	public final ModelPart bone;

	public Modelashdragon(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 39).addBox(-6.0F, -7.4653F, -6.3925F, 12.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(33, 106).addBox(-6.5F, -6.4653F, -5.6425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 100)
						.addBox(-6.3F, -7.3653F, -5.6425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(65, 100).addBox(5.3F, -7.3653F, -5.6425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(52, 100)
						.addBox(5.3F, -7.3653F, -1.3925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(0, 107).addBox(-6.3F, -7.3653F, -1.7925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(39, 98)
						.addBox(5.3F, -7.3653F, 2.6075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(9, 99).addBox(-6.3F, -7.3653F, 2.6075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(7, 79)
						.addBox(5.8F, -7.1153F, 4.6075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(98, 12).addBox(-6.8F, -7.1153F, 4.6075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(56, 110)
						.addBox(-6.5F, -5.4653F, -5.6425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 110).addBox(-6.5F, -6.4653F, -0.7925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 0)
						.addBox(-7.0F, -6.4653F, 4.6075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 110).addBox(-6.5F, -6.4653F, 2.6075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 110)
						.addBox(5.5F, -6.4653F, 2.6075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 110).addBox(-7.0F, -4.4653F, 5.6075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 25)
						.addBox(6.0F, -6.4653F, 4.6075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 110).addBox(6.0F, -4.4653F, 5.6075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 25)
						.addBox(5.5F, -6.4653F, -5.6425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 110).addBox(5.5F, -5.4653F, -5.6425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 110)
						.addBox(5.5F, -6.4653F, -1.3925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 65).addBox(-5.0F, -7.4653F, -7.3925F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 97)
						.addBox(-4.0F, -7.4653F, -8.3925F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-3.0F, -6.4653F, -9.3925F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 23)
						.addBox(-4.5F, -8.4653F, -6.8925F, 9.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(29, 81).addBox(-3.5F, -8.4653F, -7.8925F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-3.5F, -9.4653F, -7.3925F, 7.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(84, 34).addBox(-2.5F, -10.4653F, -4.3925F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.5F, -6.4653F, 6.6075F, 15.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-7.0F, -9.4653F, 6.6075F, 14.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(49, 59)
						.addBox(-6.5F, -11.4653F, 9.6075F, 13.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(87, 59).addBox(-5.5F, -11.4653F, 6.6075F, 11.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-5.5F, -12.4653F, 6.6075F, 11.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(49, 41).addBox(4.5F, -11.4653F, 5.6075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 34)
						.addBox(5.5F, -11.9653F, 6.6075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 39).addBox(-5.5F, -11.4653F, 5.6075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-6.5F, -11.9653F, 6.6075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 73).addBox(-4.5F, -13.4653F, 7.6075F, 9.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(87, 65)
						.addBox(-5.5F, -9.4653F, 5.6075F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 96).addBox(-4.5F, -11.4653F, 5.6075F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 43)
						.addBox(-7.0F, -3.4653F, 8.6075F, 14.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(47, 0).addBox(-6.0F, -1.4653F, 7.6075F, 12.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(5.0F, -3.4653F, 7.6075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, -3.4653F, 7.6075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 75)
						.addBox(-4.5F, 0.5347F, 7.6075F, 9.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(18, 8).addBox(-2.5F, -2.2153F, -0.6425F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(23, 13)
						.addBox(-2.0F, -2.2153F, -3.6425F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 13).addBox(-2.0F, -2.2153F, -6.6425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 13)
						.addBox(1.0F, -2.2153F, -6.6425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 23.4653F, -4.6075F, 1.5708F, 1.5708F, -3.1416F));
		PartDefinition jaw_r1 = bone
				.addOrReplaceChild(
						"jaw_r1", CubeListBuilder.create().texOffs(11, 110).addBox(-0.5F, 1.9174F, -7.9952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(91, 102)
								.addBox(-0.5F, 1.0906F, -8.1016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(0, 94).addBox(-3.5F, 2.3248F, 7.1386F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition jaw_r2 = bone.addOrReplaceChild("jaw_r2", CubeListBuilder.create().texOffs(33, 87).addBox(-1.0F, 0.4776F, -8.0933F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition jaw_r3 = bone.addOrReplaceChild("jaw_r3",
				CubeListBuilder.create().texOffs(40, 50).addBox(-2.0F, 0.5347F, -7.3925F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(109, 46).addBox(4.0F, -1.5153F, -6.3925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(109, 49)
						.addBox(-5.0F, -1.5153F, -6.3925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(99, 109).addBox(-5.0F, -2.4653F, -6.3925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 80)
						.addBox(-1.5F, -2.4653F, -8.8925F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 110).addBox(4.0F, -2.4653F, -6.3925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(87, 91)
						.addBox(-4.5F, -1.4653F, -8.3925F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 93).addBox(-4.0F, -0.4653F, -7.3925F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 16)
						.addBox(-4.0F, 1.0347F, 2.6075F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(95, 70).addBox(-3.0F, 1.0347F, -4.3925F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 59)
						.addBox(-3.5F, 1.0347F, -1.3925F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 95).addBox(-3.5F, 0.5347F, -6.3925F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 87)
						.addBox(-4.5F, -0.4653F, -4.3925F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 88).addBox(-4.0F, 0.5347F, -3.3925F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(38, 86)
						.addBox(-5.0F, -1.4653F, -4.3925F, 10.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 46).addBox(-4.5F, 0.5347F, 1.6075F, 9.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 79)
						.addBox(4.75F, -1.5153F, 4.6075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F)).texOffs(104, 98).addBox(-5.75F, -1.5153F, 4.6075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F)).texOffs(105, 0)
						.addBox(-5.75F, -2.4653F, 5.6075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 87).addBox(-5.75F, -3.3653F, 6.6075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).texOffs(105, 34)
						.addBox(4.75F, -3.3653F, 6.6075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).texOffs(105, 39).addBox(4.75F, -2.4653F, 5.6075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(105, 12)
						.addBox(4.5F, -2.4653F, -3.3925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(89, 109).addBox(4.25F, -1.9653F, -3.2425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 109)
						.addBox(-5.25F, -1.9653F, -3.2425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(103, 82).addBox(-5.5F, -2.4653F, -3.3925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 110)
						.addBox(4.75F, -2.4653F, 1.6075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(79, 109).addBox(4.75F, -1.5153F, 1.6075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(84, 109)
						.addBox(-5.75F, -1.5153F, 1.6075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(21, 110).addBox(-5.75F, -2.4653F, 1.6075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 16)
						.addBox(-5.5F, -1.4653F, 0.6075F, 11.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(78, 25).addBox(-5.0F, -0.4653F, 0.6075F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition jaw_r4 = bone.addOrReplaceChild("jaw_r4", CubeListBuilder.create().texOffs(84, 34).addBox(-1.5F, -0.1785F, -8.1644F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition jaw_r5 = bone.addOrReplaceChild("jaw_r5", CubeListBuilder.create().texOffs(47, 8).addBox(-2.5F, -0.8266F, -8.2643F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition jaw_r6 = bone.addOrReplaceChild("jaw_r6", CubeListBuilder.create().texOffs(0, 111).addBox(4.7474F, -4.2781F, 3.2561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.303F, -0.0393F, 0.1249F));
		PartDefinition jaw_r7 = bone.addOrReplaceChild("jaw_r7", CubeListBuilder.create().texOffs(86, 88).addBox(4.4025F, -3.7209F, 3.2561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2986F, -0.0651F, 0.2084F));
		PartDefinition jaw_r8 = bone.addOrReplaceChild("jaw_r8", CubeListBuilder.create().texOffs(0, 87).addBox(4.1573F, -2.8839F, 3.2561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2921F, -0.0905F, 0.2921F));
		PartDefinition jaw_r9 = bone.addOrReplaceChild("jaw_r9", CubeListBuilder.create().texOffs(53, 28).addBox(-8.7816F, -6.6979F, -0.8507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7414F, -1.0442F, -0.9083F));
		PartDefinition jaw_r10 = bone.addOrReplaceChild("jaw_r10", CubeListBuilder.create().texOffs(53, 20).addBox(-8.2134F, -6.3969F, -0.8507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8401F, -0.982F, -1.0245F));
		PartDefinition jaw_r11 = bone.addOrReplaceChild("jaw_r11", CubeListBuilder.create().texOffs(0, 20).addBox(-7.7237F, -5.7955F, -0.8507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9178F, -0.9146F, -1.1201F));
		PartDefinition jaw_r12 = bone.addOrReplaceChild("jaw_r12", CubeListBuilder.create().texOffs(55, 59).addBox(7.7816F, -6.6979F, -0.8507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7414F, 1.0442F, 0.9083F));
		PartDefinition jaw_r13 = bone.addOrReplaceChild("jaw_r13", CubeListBuilder.create().texOffs(36, 56).addBox(7.2134F, -6.3969F, -0.8507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8401F, 0.982F, 1.0245F));
		PartDefinition jaw_r14 = bone.addOrReplaceChild("jaw_r14", CubeListBuilder.create().texOffs(10, 20).addBox(6.7237F, -5.7955F, -0.8507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9178F, 0.9146F, 1.1201F));
		PartDefinition jaw_r15 = bone.addOrReplaceChild("jaw_r15", CubeListBuilder.create().texOffs(66, 110).addBox(-4.384F, -5.3664F, -4.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1034F, 0.0976F, -0.2693F));
		PartDefinition jaw_r16 = bone.addOrReplaceChild("jaw_r16", CubeListBuilder.create().texOffs(29, 71).addBox(-3.9494F, -4.6862F, -4.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0945F, 0.1062F, -0.3565F));
		PartDefinition jaw_r17 = bone.addOrReplaceChild("jaw_r17", CubeListBuilder.create().texOffs(9, 71).addBox(-3.6257F, -3.7189F, -4.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0849F, 0.114F, -0.444F));
		PartDefinition jaw_r18 = bone.addOrReplaceChild("jaw_r18", CubeListBuilder.create().texOffs(71, 110).addBox(3.384F, -5.3664F, -4.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1034F, -0.0976F, 0.2693F));
		PartDefinition jaw_r19 = bone.addOrReplaceChild("jaw_r19", CubeListBuilder.create().texOffs(80, 16).addBox(2.9494F, -4.6862F, -4.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0945F, -0.1062F, 0.3565F));
		PartDefinition jaw_r20 = bone.addOrReplaceChild("jaw_r20", CubeListBuilder.create().texOffs(49, 73).addBox(2.6257F, -3.7189F, -4.9214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0849F, -0.114F, 0.444F));
		PartDefinition jaw_r21 = bone.addOrReplaceChild("jaw_r21", CubeListBuilder.create().texOffs(110, 82).addBox(3.9325F, -5.6366F, -1.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0049F, -0.0222F, 0.304F));
		PartDefinition jaw_r22 = bone.addOrReplaceChild("jaw_r22", CubeListBuilder.create().texOffs(84, 46).addBox(3.4723F, -5.0031F, -1.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0068F, -0.0217F, 0.3913F));
		PartDefinition jaw_r23 = bone.addOrReplaceChild("jaw_r23", CubeListBuilder.create().texOffs(46, 81).addBox(3.119F, -4.0802F, -1.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0087F, -0.021F, 0.4786F));
		PartDefinition jaw_r24 = bone.addOrReplaceChild("jaw_r24", CubeListBuilder.create().texOffs(110, 90).addBox(-4.9325F, -5.6366F, -1.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0049F, 0.0222F, -0.304F));
		PartDefinition jaw_r25 = bone.addOrReplaceChild("jaw_r25", CubeListBuilder.create().texOffs(64, 86).addBox(-4.4723F, -5.0031F, -1.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0068F, 0.0217F, -0.3913F));
		PartDefinition jaw_r26 = bone.addOrReplaceChild("jaw_r26", CubeListBuilder.create().texOffs(84, 49).addBox(-4.119F, -4.0802F, -1.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0087F, 0.021F, -0.4786F));
		PartDefinition jaw_r27 = bone.addOrReplaceChild("jaw_r27", CubeListBuilder.create().texOffs(111, 0).addBox(-5.6864F, -4.741F, 3.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1731F, 0.0227F, -0.1289F));
		PartDefinition jaw_r28 = bone.addOrReplaceChild("jaw_r28", CubeListBuilder.create().texOffs(91, 88).addBox(-5.3014F, -4.1767F, 3.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1705F, 0.0376F, -0.215F));
		PartDefinition jaw_r29 = bone.addOrReplaceChild("jaw_r29", CubeListBuilder.create().texOffs(96, 88).addBox(-5.0169F, -3.3292F, 3.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1666F, 0.0522F, -0.3011F));
		PartDefinition head_r1 = bone.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(44, 28).addBox(-1.0F, -0.9477F, 1.2133F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(6.0F, -4.4042F, 25.5717F, -0.0436F, 0.2182F, -0.3054F));
		PartDefinition head_r2 = bone.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(44, 20).addBox(-1.0F, -1.398F, -2.1586F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(6.0F, -4.4042F, 25.5717F, -0.1745F, 0.2182F, -0.3054F));
		PartDefinition head_r3 = bone.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(73, 73).addBox(-1.0F, -1.6924F, -4.708F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -4.4042F, 25.5717F, 0.0F, 0.2182F, -0.3054F));
		PartDefinition head_r4 = bone.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(43, 100).addBox(-1.0F, -0.9477F, 1.2133F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-6.0F, -4.4042F, 25.5717F, -0.0436F, -0.2182F, 0.3054F));
		PartDefinition head_r5 = bone.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(47, 0).addBox(-1.0F, -1.398F, -2.1586F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-6.0F, -4.4042F, 25.5717F, -0.1745F, -0.2182F, 0.3054F));
		PartDefinition head_r6 = bone.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(22, 103).addBox(-1.0F, -1.6924F, -4.708F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.4042F, 25.5717F, 0.0F, -0.2182F, 0.3054F));
		PartDefinition head_r7 = bone.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(95, 102).addBox(-1.0F, -0.9859F, -0.308F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-7.341F, 3.7088F, 24.9906F, -0.9103F, -0.3189F, 0.2333F));
		PartDefinition head_r8 = bone.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -1.7348F, -3.6756F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-7.341F, 3.7088F, 24.9906F, -0.7794F, -0.3189F, 0.2333F));
		PartDefinition head_r9 = bone.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(40, 41).addBox(-7.9823F, -2.7132F, -2.2857F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.4095F, 23.5914F, -0.6485F, -0.3189F, 0.2333F));
		PartDefinition head_r10 = bone.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(0, 56).addBox(5.9823F, -2.12F, 1.2556F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-1.0F, 2.4095F, 23.4914F, -0.7794F, 0.3189F, -0.2333F));
		PartDefinition head_r11 = bone.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(9, 103).addBox(5.9823F, -2.0115F, 4.5307F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-1.0F, 2.4095F, 23.4914F, -0.9103F, 0.3189F, -0.2333F));
		PartDefinition head_r12 = bone.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(0, 39).addBox(5.9823F, -2.7132F, -2.2857F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.4095F, 23.4914F, -0.6485F, 0.3189F, -0.2333F));
		PartDefinition head_r13 = bone.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(17, 95).addBox(-1.0F, -1.2901F, -1.8597F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(7.6533F, -11.1786F, 25.2548F, 0.5524F, 0.3614F, 0.1572F));
		PartDefinition head_r14 = bone.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(69, 100).addBox(-1.0F, -0.8018F, 1.4956F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(7.6533F, -11.1786F, 25.2548F, 0.6833F, 0.3614F, 0.1572F));
		PartDefinition head_r15 = bone.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.2868F, -6.4278F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.6533F, -11.1786F, 25.2548F, 0.4215F, 0.3614F, 0.1572F));
		PartDefinition head_r16 = bone.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(82, 102).addBox(-1.0F, -0.8018F, 1.4956F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-7.6533F, -11.1786F, 25.2548F, 0.6833F, -0.3614F, -0.1572F));
		PartDefinition head_r17 = bone.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(0, 99).addBox(-1.0F, -1.2901F, -1.8597F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-7.6533F, -11.1786F, 25.2548F, 0.5524F, -0.3614F, -0.1572F));
		PartDefinition head_r18 = bone.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.2868F, -6.4278F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6533F, -11.1786F, 25.2548F, 0.4215F, -0.3614F, -0.1572F));
		PartDefinition head_r19 = bone.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(29, 71).addBox(-3.5F, -2.0F, -3.5F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.2921F, 16.0626F, -0.5672F, 0.0F, 0.0F));
		PartDefinition head_r20 = bone.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(85, 0).addBox(-2.5F, -0.5F, -3.0F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -14.0215F, 10.5976F, 0.3491F, 0.0F, 0.0F));
		PartDefinition head_r21 = bone.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(6, 64).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -11.9143F, -4.6863F, -0.7418F, 0.0F, 0.0F));
		PartDefinition head_r22 = bone.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(84, 41).addBox(-2.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -11.2961F, -5.252F, -0.5672F, 0.0F, 0.0F));
		PartDefinition head_r23 = bone.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(0, 48).addBox(-3.0F, 0.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -10.9763F, -5.173F, -0.3491F, 0.0F, 0.0F));
		PartDefinition head_r24 = bone.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(97, 54).addBox(-3.0F, 0.5F, -2.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.6653F, -4.7425F, -0.1309F, 0.0F, 0.0F));
		PartDefinition head_r25 = bone.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -10.6207F, 4.8749F, 0.3927F, 0.0F, 0.0F));
		PartDefinition head_r26 = bone.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(75, 107).addBox(-0.449F, -1.624F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-5.8521F, -4.9787F, -2.3925F, 0.0843F, -0.0226F, 0.2608F));
		PartDefinition head_r27 = bone.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(70, 107).addBox(-0.7073F, -0.3895F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-5.8521F, -4.9787F, -2.3925F, 0.0859F, -0.0151F, 0.1739F));
		PartDefinition head_r28 = bone.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(111, 39).addBox(-0.8402F, 0.5724F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8521F, -4.9787F, -2.3925F, 0.0873F, 0.0F, 0.0F));
		PartDefinition head_r29 = bone.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(65, 107).addBox(-0.624F, -1.624F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(5.924F, -5.2414F, -2.6425F, -0.0843F, -0.0226F, -0.2608F));
		PartDefinition head_r30 = bone.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(111, 34).addBox(-0.2303F, 0.5913F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.924F, -5.2414F, -2.6425F, -0.0873F, 0.0F, 0.0F));
		PartDefinition head_r31 = bone.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(60, 107).addBox(-0.3653F, -0.3832F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(5.924F, -5.2414F, -2.6425F, -0.0859F, -0.0151F, -0.1739F));
		PartDefinition head_r32 = bone.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(18, 103).addBox(-0.376F, -1.624F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-4.174F, -4.4914F, -7.3925F, -0.1795F, -0.7601F, 0.2564F));
		PartDefinition head_r33 = bone.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(101, 88).addBox(-0.6347F, -0.3832F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-4.174F, -4.4914F, -7.3925F, -0.0963F, -0.7721F, 0.1364F));
		PartDefinition head_r34 = bone.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(111, 11).addBox(-0.7697F, 0.5913F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.174F, -4.4914F, -7.3925F, 0.0746F, -0.774F, -0.1077F));
		PartDefinition head_r35 = bone.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(106, 88).addBox(-0.624F, -1.624F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(4.174F, -4.4914F, -7.3925F, -0.1795F, 0.7601F, -0.2564F));
		PartDefinition head_r36 = bone.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(106, 29).addBox(-0.3653F, -0.3832F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(4.174F, -4.4914F, -7.3925F, -0.0963F, 0.7721F, -0.1364F));
		PartDefinition head_r37 = bone.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(111, 29).addBox(-0.2303F, 0.5913F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.174F, -4.4914F, -7.3925F, 0.0746F, 0.774F, 0.1077F));
		PartDefinition head_r38 = bone.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(108, 19).addBox(-0.624F, -1.624F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(5.924F, -5.3414F, 1.6075F, 0.0436F, 0.0F, 0.0F));
		PartDefinition head_r39 = bone.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(111, 68).addBox(-0.2303F, 0.5913F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.924F, -5.3414F, 1.6075F, 0.0421F, -0.0113F, 0.2616F));
		PartDefinition head_r40 = bone.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(108, 16).addBox(-0.3653F, -0.3832F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(5.924F, -5.3414F, 1.6075F, 0.0435F, -0.0038F, 0.0872F));
		PartDefinition head_r41 = bone.addOrReplaceChild("head_r41",
				CubeListBuilder.create().texOffs(45, 107).addBox(-0.624F, -1.624F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(55, 107).addBox(-11.524F, -1.624F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(5.574F, -4.7914F, 4.6075F, 0.0873F, 0.0F, 0.0F));
		PartDefinition head_r42 = bone.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(40, 107).addBox(-0.3653F, -0.3832F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(5.574F, -4.7914F, 4.6075F, 0.0869F, -0.0076F, 0.0869F));
		PartDefinition head_r43 = bone.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(111, 97).addBox(-0.2303F, 0.5913F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.574F, -4.7914F, 4.6075F, 0.0843F, -0.0226F, 0.2608F));
		PartDefinition head_r44 = bone.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(103, 111).addBox(-0.7697F, 0.5913F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.574F, -4.7914F, 4.6075F, 0.0843F, 0.0226F, -0.2608F));
		PartDefinition head_r45 = bone.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(50, 107).addBox(-0.6347F, -0.3832F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-5.574F, -4.7914F, 4.6075F, 0.0869F, 0.0076F, -0.0869F));
		PartDefinition head_r46 = bone.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(107, 108).addBox(-0.376F, -1.624F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-5.924F, -5.3414F, 1.6075F, 0.1309F, 0.0F, 0.0F));
		PartDefinition head_r47 = bone.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(111, 75).addBox(-0.7697F, 0.5913F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.924F, -5.3414F, 1.6075F, 0.1265F, 0.0338F, -0.2597F));
		PartDefinition head_r48 = bone.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(108, 104).addBox(-0.6347F, -0.3832F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-5.924F, -5.3414F, 1.6075F, 0.1304F, 0.0114F, -0.0865F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
