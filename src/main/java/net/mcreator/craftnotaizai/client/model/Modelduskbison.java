package net.mcreator.craftnotaizai.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelduskbison<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelduskbison"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart leg;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;

	public Modelduskbison(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leg = root.getChild("leg");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(141, 15).addBox(-7.0F, -9.6944F, -0.5F, 14.0F, 14.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(153, 27).addBox(-7.0F, -10.6944F, 11.0F, 14.0F, 2.0F, 2.25F, new CubeDeformation(0.0F)).texOffs(33, 76)
						.addBox(-3.0F, 0.3056F, -1.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 98).addBox(-6.0F, -0.6944F, -1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(93, 44)
						.addBox(2.0F, -0.6944F, -1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-6.0F, 0.3056F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 25)
						.addBox(-5.0F, 2.3056F, -1.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(5.0F, 0.3056F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 10)
						.addBox(-0.75F, -3.1944F, -2.75F, 1.25F, 2.25F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.25F, -3.9444F, -1.75F, 4.5F, 3.5F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.8623F, -24.5947F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(108, 10).addBox(0.75F, -0.375F, 0.0F, 2.0F, 0.75F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9659F, -3.5783F, -2.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(108, 10).addBox(-1.75F, -0.375F, -0.25F, 2.0F, 0.75F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.3194F, -2.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(108, 10).addBox(1.25F, -1.625F, -0.25F, 1.0F, 2.25F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0694F, -2.5F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(108, 10).addBox(-0.5F, -1.125F, -0.25F, 1.0F, 2.25F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0694F, -2.5F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(154, 28).addBox(-7.0F, -1.5F, 1.5F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(154, 28).addBox(-7.0F, -0.5F, -0.5F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.1944F, 13.5F, 0.3491F, 0.0F, 0.0F));
		PartDefinition horns = head.addOrReplaceChild("horns", CubeListBuilder.create(), PartPose.offsetAndRotation(8.7264F, -12.4427F, 8.4038F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r6 = horns.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 133).addBox(-1.375F, -2.175F, -1.5F, 2.75F, 4.35F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6597F, -4.3293F, 3.5504F, -1.4399F, 1.0472F, -1.3526F));
		PartDefinition cube_r7 = horns.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 135).addBox(-1.375F, -2.175F, -1.5F, 2.75F, 4.35F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0974F, -1.7928F, 2.0504F, -1.5708F, 1.0472F, -1.3526F));
		PartDefinition cube_r8 = horns.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(72, 135).addBox(-1.375F, -2.175F, -1.5F, 2.75F, 4.35F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0884F, 1.5014F, 0.0675F, -1.7017F, 1.0472F, -1.3526F));
		PartDefinition cube_r9 = horns.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 99).addBox(-2.0F, -2.175F, -0.625F, 4.0F, 4.35F, 1.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0233F, 4.9694F, -1.8819F, -2.8362F, 1.0472F, -1.3526F));
		PartDefinition cube_r10 = horns.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 133).addBox(-2.0F, -2.175F, -2.0F, 4.0F, 4.35F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2108F, 3.1289F, -0.9928F, -2.3998F, 1.0472F, -1.3526F));
		PartDefinition horns2 = head.addOrReplaceChild("horns2", CubeListBuilder.create(), PartPose.offset(-5.4843F, -12.2434F, 19.2881F));
		PartDefinition cube_r11 = horns2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(92, 84).addBox(-2.0F, -2.175F, -0.625F, 4.0F, 4.35F, 1.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.295F, 5.5379F, -13.4117F, 2.9671F, 1.0472F, -1.3526F));
		PartDefinition cube_r12 = horns2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(118, 136).addBox(-1.375F, -2.175F, -1.375F, 2.75F, 4.35F, 2.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7515F, -5.082F, -7.502F, -1.8326F, 1.0472F, -1.3526F));
		PartDefinition cube_r13 = horns2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(136, 17).addBox(-1.125F, -2.175F, -1.5F, 2.25F, 4.35F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4209F, -1.9672F, -9.3414F, -1.3526F, 1.0472F, -1.3526F));
		PartDefinition cube_r14 = horns2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(46, 133).addBox(-1.375F, -2.175F, -1.5F, 2.75F, 4.35F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2101F, 1.5115F, -11.2759F, -1.2654F, 1.0472F, -1.3526F));
		PartDefinition cube_r15 = horns2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(102, 15).addBox(-2.0F, -2.175F, -2.0F, 4.0F, 4.35F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6325F, 3.8381F, -12.4425F, -0.5672F, 1.0472F, -1.3526F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(57, 48).addBox(-5.8571F, 8.494F, -18.7031F, 11.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-7.8571F, -11.506F, -17.7031F, 16.0F, 2.0F, 26.0F, new CubeDeformation(0.0F))
						.texOffs(59, 79).addBox(9.1429F, -8.506F, -17.7031F, 3.0F, 16.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(0, 76).addBox(-11.8571F, -8.506F, -17.7031F, 3.0F, 16.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.8571F, -9.506F, -18.7031F, 18.0F, 18.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(33, 79).addBox(-7.8571F, -8.506F, 9.2969F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.1429F, 5.506F, 7.7031F));
		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(65, 15).addBox(-8.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1429F, 9.3146F, 8.6995F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(92, 79).addBox(-8.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1429F, -9.823F, 8.7478F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(65, 20).addBox(-8.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1429F, 7.8928F, 9.6612F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(92, 90).addBox(-8.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1429F, -8.823F, 10.4799F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 119).addBox(-1.5F, -1.5F, -13.0F, 3.0F, 3.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.1803F, -10.0338F, -4.7031F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(125, 90).addBox(-1.5F, -1.5F, -13.0F, 3.0F, 3.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.3098F, -9.7564F, -4.7031F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(92, 96).addBox(-1.5F, -1.5F, -13.0F, 3.0F, 3.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1805F, 9.2984F, -4.7031F, 0.0F, 0.0F, -1.3526F));
		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(108, 30).addBox(-1.5F, -1.5F, -13.0F, 3.0F, 3.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.6725F, 9.5218F, -4.7031F, 0.0F, 0.0F, 1.3526F));
		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(93, 0).addBox(-1.5F, -1.5F, -13.0F, 3.0F, 3.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.1371F, 8.0655F, -4.7031F, 0.0F, 0.0F, 1.3526F));
		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(110, 60).addBox(-1.5F, -1.5F, -13.0F, 3.0F, 3.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.9801F, 8.4626F, -4.7031F, 0.0F, 0.0F, 1.3526F));
		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(59, 122).addBox(-1.5F, -1.5F, -13.0F, 3.0F, 3.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.9801F, -8.5374F, -4.7031F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(125, 120).addBox(-1.5F, -1.5F, -13.0F, 3.0F, 3.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0479F, -8.3296F, -4.7031F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(126, 0).addBox(-1.5F, -8.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5652F, -0.506F, 9.2108F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(92, 126).addBox(-0.5F, -8.0F, 1.25F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.3571F, -0.506F, 8.0469F, 0.0F, 0.7418F, 0.0F));
		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(70, 79).addBox(-1.5F, -8.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.3341F, -0.506F, 8.053F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(105, 126).addBox(-1.5F, -8.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5717F, -0.506F, 8.1373F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(65, 0).addBox(-5.5F, -1.875F, -5.0F, 11.0F, 3.75F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3571F, 7.808F, -21.5447F, -0.1745F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.3929F, 2.6331F, 15.0641F));
		PartDefinition cube_r33 = tail.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(132, 131).addBox(-1.5F, 0.5F, -2.5F, 3.0F, 2.5F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.364F, 3.1952F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r34 = tail.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(118, 30).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.6052F, 1.8271F, -1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r35 = tail.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(98, 0).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.8222F, -0.361F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r36 = tail.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(118, 126).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.147F, -4.6613F, -0.7854F, 0.0F, 0.0F));
		PartDefinition leg = partdefinition.addOrReplaceChild("leg",
				CubeListBuilder.create().texOffs(0, 76).addBox(-2.9583F, -13.3542F, -2.625F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(33, 119).addBox(-2.7083F, -6.3542F, -2.375F, 5.5F, 7.0F, 5.5F, new CubeDeformation(0.0F))
						.texOffs(75, 152).addBox(-1.9583F, -5.6042F, 3.125F, 4.0F, 5.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 74).addBox(-1.9583F, -5.6042F, -2.875F, 4.0F, 5.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 149)
						.addBox(-3.4583F, 0.6458F, -1.125F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 147).addBox(2.5417F, 0.6458F, -1.125F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(125, 103)
						.addBox(-2.4583F, 0.6458F, -2.125F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 152).addBox(-1.4583F, 0.6458F, 2.875F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 61)
						.addBox(-1.4583F, 0.6458F, -3.125F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 95).addBox(-2.4583F, 3.6458F, -7.125F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(149, 150)
						.addBox(-3.7083F, -5.3542F, -1.375F, 1.0F, 5.0F, 3.5F, new CubeDeformation(0.0F)).texOffs(138, 150).addBox(2.2917F, -5.3542F, -1.375F, 1.0F, 5.0F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.2917F, 18.6042F, 11.625F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(59, 47).addBox(-2.9583F, -13.3542F, -2.625F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 119).addBox(-2.7083F, -6.3542F, -2.375F, 5.5F, 7.0F, 5.5F, new CubeDeformation(0.0F))
						.texOffs(152, 67).addBox(-1.9583F, -5.6042F, 3.125F, 4.0F, 5.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 152).addBox(-1.9583F, -5.6042F, -2.875F, 4.0F, 5.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(146, 8)
						.addBox(-3.4583F, 0.6458F, -1.125F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(143, 71).addBox(2.5417F, 0.6458F, -1.125F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(125, 90)
						.addBox(-2.4583F, 0.6458F, -2.125F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(95, 152).addBox(-1.4583F, 0.6458F, 2.875F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 61)
						.addBox(-1.4583F, 0.6458F, -3.125F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 90).addBox(-2.4583F, 3.6458F, -7.125F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(127, 150)
						.addBox(-3.7083F, -5.3542F, -1.375F, 1.0F, 5.0F, 3.5F, new CubeDeformation(0.0F)).texOffs(150, 45).addBox(2.2917F, -5.3542F, -1.375F, 1.0F, 5.0F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.2917F, 18.6042F, -6.375F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3",
				CubeListBuilder.create().texOffs(0, 47).addBox(-2.9583F, -13.3542F, -2.625F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(108, 60).addBox(-2.7083F, -6.3542F, -2.375F, 5.5F, 7.0F, 5.5F, new CubeDeformation(0.0F))
						.texOffs(152, 60).addBox(-1.9583F, -5.6042F, 3.125F, 4.0F, 5.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 152).addBox(-1.9583F, -5.6042F, -2.875F, 4.0F, 5.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(143, 60)
						.addBox(-3.4583F, 0.6458F, -1.125F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(141, 45).addBox(2.5417F, 0.6458F, -1.125F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 122)
						.addBox(-2.4583F, 0.6458F, -2.125F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(86, 152).addBox(-1.4583F, 0.6458F, 2.875F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 13)
						.addBox(-1.4583F, 0.6458F, -3.125F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 61).addBox(-2.4583F, 3.6458F, -7.125F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 149)
						.addBox(-3.7083F, -5.3542F, -1.375F, 1.0F, 5.0F, 3.5F, new CubeDeformation(0.0F)).texOffs(31, 149).addBox(2.2917F, -5.3542F, -1.375F, 1.0F, 5.0F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offset(7.7083F, 18.6042F, -6.375F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(0, 13).addBox(-2.9583F, -13.3542F, -2.625F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(93, 30).addBox(-2.7083F, -6.3542F, -2.375F, 5.5F, 7.0F, 5.5F, new CubeDeformation(0.0F)).texOffs(148, 0)
						.addBox(-1.9583F, -5.6042F, 3.125F, 4.0F, 5.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 98).addBox(-1.9583F, -5.6042F, -2.875F, 4.0F, 5.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(139, 0)
						.addBox(-3.4583F, 0.6458F, -1.125F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 133).addBox(2.5417F, 0.6458F, -1.125F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(113, 39)
						.addBox(-2.4583F, 0.6458F, -2.125F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(65, 0).addBox(-1.4583F, 0.6458F, 2.875F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(-1.4583F, 0.6458F, -3.125F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61).addBox(-2.4583F, 3.6458F, -7.125F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 149)
						.addBox(-3.7083F, -5.3542F, -1.375F, 1.0F, 5.0F, 3.5F, new CubeDeformation(0.0F)).texOffs(9, 149).addBox(2.2917F, -5.3542F, -1.375F, 1.0F, 5.0F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offset(8.7083F, 18.6042F, 11.625F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
