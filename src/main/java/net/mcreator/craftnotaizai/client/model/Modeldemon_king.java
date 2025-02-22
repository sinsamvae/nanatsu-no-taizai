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
public class Modeldemon_king<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modeldemon_king"), "main");
	public final ModelPart demon_king;
	public final ModelPart body;
	public final ModelPart right_skirt;
	public final ModelPart lower_right_skirt;
	public final ModelPart right_foot;
	public final ModelPart left_skirt;
	public final ModelPart lower_left_skirt;
	public final ModelPart left_foot;
	public final ModelPart head;
	public final ModelPart left_arm;
	public final ModelPart left_forearm;
	public final ModelPart bone2;
	public final ModelPart right_arm;
	public final ModelPart bone;
	public final ModelPart head2;
	public final ModelPart head3;
	public final ModelPart head4;
	public final ModelPart head5;
	public final ModelPart head6;
	public final ModelPart head7;
	public final ModelPart head8;

	public Modeldemon_king(ModelPart root) {
		this.demon_king = root.getChild("demon_king");
		this.body = this.demon_king.getChild("body");
		this.right_skirt = this.body.getChild("right_skirt");
		this.lower_right_skirt = this.right_skirt.getChild("lower_right_skirt");
		this.right_foot = this.lower_right_skirt.getChild("right_foot");
		this.left_skirt = this.body.getChild("left_skirt");
		this.lower_left_skirt = this.left_skirt.getChild("lower_left_skirt");
		this.left_foot = this.lower_left_skirt.getChild("left_foot");
		this.head = this.body.getChild("head");
		this.left_arm = this.body.getChild("left_arm");
		this.left_forearm = this.left_arm.getChild("left_forearm");
		this.bone2 = this.left_arm.getChild("bone2");
		this.right_arm = this.body.getChild("right_arm");
		this.bone = this.right_arm.getChild("bone");
		this.head2 = this.body.getChild("head2");
		this.head3 = this.body.getChild("head3");
		this.head4 = this.body.getChild("head4");
		this.head5 = this.body.getChild("head5");
		this.head6 = this.body.getChild("head6");
		this.head7 = this.body.getChild("head7");
		this.head8 = this.body.getChild("head8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition demon_king = partdefinition.addOrReplaceChild("demon_king", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition body = demon_king.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(97, 0).addBox(-8.0F, -11.185F, -2.6968F, 16.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(126, 30).addBox(-7.5F, -4.185F, -2.1968F, 15.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(51, 96)
						.addBox(-8.5F, 5.815F, -3.6968F, 17.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(97, 17).addBox(-8.0F, 2.815F, -2.6968F, 16.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(-12.0F, -21.185F, -4.1968F, 24.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(161, 14).addBox(-1.0F, -11.5892F, -3.1968F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.01F)),
				PartPose.offset(0.0F, -27.815F, -1.8032F));
		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(187, 88).mirror().addBox(-2.0F, -5.5F, -1.5F, 9.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(145, 4).mirror().addBox(-3.0F, 1.5F, -1.5F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(33, 117).mirror().addBox(-3.0F, -4.5F, -1.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(33, 117).addBox(-6.0F, -4.5F, -1.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(145, 4).addBox(-14.0F, 1.5F, -1.5F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(187, 88).addBox(-15.0F, -5.5F, -1.5F, 9.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -14.685F, -4.0968F, -0.0873F, 0.0F, 0.0F));
		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(115, 138).mirror().addBox(-3.0F, -5.0F, -4.0F, 7.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.718F, -9.9457F, 0.8032F, 0.0F, 0.0F, -1.0908F));
		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(61, 198).mirror().addBox(-1.5F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false),
				PartPose.offsetAndRotation(-4.3884F, 1.5113F, -1.6468F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(129, 189).mirror().addBox(-0.5F, -3.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false),
				PartPose.offsetAndRotation(-3.8884F, -1.0887F, -1.8468F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r5 = body.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(95, 164).mirror().addBox(0.2935F, -2.3244F, -1.075F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false),
				PartPose.offsetAndRotation(-3.7912F, -2.7882F, -1.9218F, 0.0F, 0.0F, -1.6144F));
		PartDefinition body_r6 = body.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(75, 189).mirror().addBox(-0.5F, -3.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false),
				PartPose.offsetAndRotation(0.7116F, 1.5113F, -1.4968F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r7 = body.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(149, 167).mirror().addBox(-6.2469F, 0.2767F, -0.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, -10.3892F, -3.2468F, 0.102F, -0.1932F, 1.0809F));
		PartDefinition body_r8 = body.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(115, 138).addBox(-4.0F, -5.0F, -4.0F, 7.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.718F, -9.9457F, 0.8032F, 0.0F, 0.0F, 1.0908F));
		PartDefinition body_r9 = body.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(112, 222).mirror().addBox(1.5186F, -1.5437F, -4.775F, 3.0F, 4.0F, 10.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(-4.0402F, -3.9895F, 1.5282F, 0.0F, 0.0F, -1.6581F));
		PartDefinition body_r10 = body.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(112, 222).addBox(-4.5186F, -1.5437F, -4.775F, 3.0F, 4.0F, 10.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(4.0402F, -3.9895F, 1.5282F, 0.0F, 0.0F, 1.6581F));
		PartDefinition body_r11 = body.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(95, 164).addBox(-3.2935F, -2.3244F, -1.075F, 3.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(3.7912F, -2.7882F, -1.9218F, 0.0F, 0.0F, 1.6144F));
		PartDefinition body_r12 = body.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(75, 189).addBox(-2.5F, -3.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.7116F, 1.5113F, -1.4968F, 0.0F, 0.0F, 1.5708F));
		PartDefinition body_r13 = body.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(61, 198).addBox(-2.5F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(4.3884F, 1.5113F, -1.6468F, 0.0F, 0.0F, 1.5708F));
		PartDefinition body_r14 = body.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(129, 189).addBox(-2.5F, -3.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(3.8884F, -1.0887F, -1.8468F, 0.0F, 0.0F, 1.5708F));
		PartDefinition body_r15 = body.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(149, 167).addBox(-0.7531F, 0.2767F, -0.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -10.3892F, -3.2468F, 0.102F, 0.1932F, -1.0809F));
		PartDefinition body_r16 = body.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, -24.0F, 0.0F, 48.0F, 30.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.4506F, 11.9698F, 0.1745F, 0.0F, 0.0F));
		PartDefinition right_skirt = body.addOrReplaceChild("right_skirt",
				CubeListBuilder.create().texOffs(0, 90).addBox(-8.2634F, 5.0071F, -7.5F, 10.0F, 10.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(96, 119).addBox(-7.2634F, 0.0071F, -6.5F, 9.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.7366F, 8.808F, 1.8032F));
		PartDefinition body_r17 = right_skirt.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(64, 175).addBox(-5.5F, -6.5F, -1.0F, 9.0F, 10.0F, 2.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-1.7634F, 6.5695F, 6.0703F, 0.0873F, 0.0F, 0.0F));
		PartDefinition body_r18 = right_skirt.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(173, 168).addBox(-5.5F, -6.5F, -1.0F, 10.0F, 10.0F, 2.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-2.7634F, 11.5695F, 7.0703F, 0.0873F, 0.0F, 0.0F));
		PartDefinition body_r19 = right_skirt.addOrReplaceChild("body_r19", CubeListBuilder.create().texOffs(83, 201).mirror().addBox(-1.0F, -6.5F, -6.5F, 2.0F, 10.0F, 12.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(-7.9337F, 11.8195F, 0.5F, 0.0F, 0.0F, 0.0873F));
		PartDefinition body_r20 = right_skirt.addOrReplaceChild("body_r20", CubeListBuilder.create().texOffs(228, 167).mirror().addBox(-1.0F, -6.5F, -6.5F, 2.0F, 10.0F, 11.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(-7.3337F, 6.5695F, 1.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition body_r21 = right_skirt.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(173, 155).addBox(-5.5F, -6.5F, -1.0F, 10.0F, 10.0F, 2.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-2.7634F, 11.5695F, -7.0703F, -0.0873F, 0.0F, 0.0F));
		PartDefinition body_r22 = right_skirt.addOrReplaceChild("body_r22", CubeListBuilder.create().texOffs(0, 165).addBox(-5.5F, -6.5F, -1.0F, 9.0F, 10.0F, 2.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-1.7634F, 6.5695F, -6.0703F, -0.0873F, 0.0F, 0.0F));
		PartDefinition lower_right_skirt = right_skirt.addOrReplaceChild("lower_right_skirt",
				CubeListBuilder.create().texOffs(69, 31).addBox(-7.2688F, -0.0098F, -0.25F, 11.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(3, 221).addBox(-9.2688F, 12.9902F, -2.25F, 13.0F, 14.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9945F, 15.0168F, -8.25F));
		PartDefinition body_r23 = lower_right_skirt.addOrReplaceChild("body_r23", CubeListBuilder.create().texOffs(55, 206).mirror().addBox(-1.5F, -7.5F, -9.5F, 3.0F, 14.0F, 19.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(-9.2692F, 20.6106F, 8.25F, 0.0F, 0.0F, 0.1309F));
		PartDefinition body_r24 = lower_right_skirt.addOrReplaceChild("body_r24", CubeListBuilder.create().texOffs(0, 132).mirror().addBox(-1.0F, -7.5F, -8.5F, 3.0F, 13.0F, 15.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(-7.829F, 7.7474F, 9.25F, 0.0F, 0.0F, 0.1745F));
		PartDefinition body_r25 = lower_right_skirt.addOrReplaceChild("body_r25", CubeListBuilder.create().texOffs(150, 137).addBox(-6.5F, -7.5F, -1.5F, 13.0F, 14.0F, 3.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-2.7789F, 20.6106F, 18.2504F, 0.1309F, 0.0F, 0.0F));
		PartDefinition body_r26 = lower_right_skirt.addOrReplaceChild("body_r26", CubeListBuilder.create().texOffs(115, 159).addBox(-6.5F, -7.5F, -1.0F, 11.0F, 13.0F, 2.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-0.7688F, 7.7474F, 16.8101F, 0.1745F, 0.0F, 0.0F));
		PartDefinition body_r27 = lower_right_skirt.addOrReplaceChild("body_r27", CubeListBuilder.create().texOffs(147, 220).addBox(-6.5F, -7.5F, -1.5F, 13.0F, 14.0F, 3.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-2.7789F, 20.6106F, -1.7504F, -0.1309F, 0.0F, 0.0F));
		PartDefinition body_r28 = lower_right_skirt.addOrReplaceChild("body_r28", CubeListBuilder.create().texOffs(0, 116).addBox(-6.5F, -7.5F, -1.0F, 11.0F, 13.0F, 2.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-0.7688F, 7.7474F, -0.3101F, -0.1745F, 0.0F, 0.0F));
		PartDefinition right_foot = lower_right_skirt.addOrReplaceChild("right_foot",
				CubeListBuilder.create().texOffs(177, 129).mirror().addBox(-2.9477F, -0.9866F, -1.6257F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(158, 126).mirror()
						.addBox(-2.9477F, -0.9866F, 2.3743F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(216, 131).mirror().addBox(-2.9477F, 1.0134F, -6.6257F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.3211F, 26.9769F, 7.3757F));
		PartDefinition right_leg_r1 = right_foot.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(161, 119).mirror().addBox(-0.275F, -1.0F, -0.875F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.42F)).mirror(false).texOffs(64, 154)
						.addBox(-1.725F, -1.0F, -1.375F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(176, 117).mirror().addBox(-1.725F, -1.0F, -0.875F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.42F)).mirror(false).texOffs(148, 113).mirror()
						.addBox(1.225F, -1.0F, -0.875F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.42F)).mirror(false),
				PartPose.offsetAndRotation(0.0273F, 1.9767F, -6.867F, 0.4363F, 0.0F, 0.0F));
		PartDefinition right_leg_r2 = right_foot.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(165, 109).mirror().addBox(-0.275F, -1.0F, -0.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(148, 113)
				.mirror().addBox(1.225F, -1.0F, 0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(176, 105).mirror().addBox(-1.725F, -1.0F, -0.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(148, 113)
				.mirror().addBox(-3.225F, -1.0F, 0.45F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(148, 113).mirror().addBox(-0.275F, -1.0F, -1.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(148, 113).mirror().addBox(-1.725F, -1.0F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false).texOffs(148, 113).mirror().addBox(-3.225F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.mirror(false).texOffs(148, 113).mirror().addBox(1.225F, -1.0F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false).texOffs(148, 113).mirror()
				.addBox(-1.725F, -1.0F, -1.95F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false).texOffs(148, 113).mirror().addBox(-0.275F, -1.0F, -2.45F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false).texOffs(148, 113)
				.mirror().addBox(1.225F, -1.0F, -1.45F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false).texOffs(148, 113).mirror().addBox(-3.225F, -1.0F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false),
				PartPose.offsetAndRotation(0.0273F, 2.3634F, -8.2257F, 0.1745F, 0.0F, 0.0F));
		PartDefinition right_leg_r3 = right_foot.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(148, 113).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.42F)).mirror(false),
				PartPose.offsetAndRotation(-2.1977F, 1.8182F, -6.5271F, 0.5236F, 0.0F, 0.0F));
		PartDefinition right_leg_r4 = right_foot.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(131, 49).mirror().addBox(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.0523F, 2.0134F, 2.3672F, -0.7854F, 0.0F, 0.0F));
		PartDefinition right_leg_r5 = right_foot.addOrReplaceChild("right_leg_r5", CubeListBuilder.create().texOffs(196, 113).mirror().addBox(-2.0F, -1.5F, -2.5F, 5.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.4477F, 1.4425F, -2.7419F, 0.3927F, 0.0F, 0.0F));
		PartDefinition left_skirt = body.addOrReplaceChild("left_skirt", CubeListBuilder.create().texOffs(96, 119).mirror().addBox(-1.7366F, 0.0071F, -6.5F, 9.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 90).mirror()
				.addBox(-1.7366F, 5.0071F, -7.5F, 10.0F, 10.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.7366F, 8.808F, 1.8032F));
		PartDefinition body_r29 = left_skirt.addOrReplaceChild("body_r29", CubeListBuilder.create().texOffs(83, 201).addBox(-1.0F, -6.5F, -6.5F, 2.0F, 10.0F, 12.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(7.9337F, 11.8195F, 0.5F, 0.0F, 0.0F, -0.0873F));
		PartDefinition body_r30 = left_skirt.addOrReplaceChild("body_r30", CubeListBuilder.create().texOffs(228, 167).addBox(-1.0F, -6.5F, -6.5F, 2.0F, 10.0F, 11.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(7.3337F, 6.5695F, 1.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition body_r31 = left_skirt.addOrReplaceChild("body_r31", CubeListBuilder.create().texOffs(173, 168).mirror().addBox(-4.5F, -6.5F, -1.0F, 10.0F, 10.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(2.7634F, 11.5695F, 7.0703F, 0.0873F, 0.0F, 0.0F));
		PartDefinition body_r32 = left_skirt.addOrReplaceChild("body_r32", CubeListBuilder.create().texOffs(64, 175).mirror().addBox(-3.5F, -6.5F, -1.0F, 9.0F, 10.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(1.7634F, 6.5695F, 6.0703F, 0.0873F, 0.0F, 0.0F));
		PartDefinition body_r33 = left_skirt.addOrReplaceChild("body_r33", CubeListBuilder.create().texOffs(0, 165).mirror().addBox(-3.5F, -6.5F, -1.0F, 9.0F, 10.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(1.7634F, 6.5695F, -6.0703F, -0.0873F, 0.0F, 0.0F));
		PartDefinition body_r34 = left_skirt.addOrReplaceChild("body_r34", CubeListBuilder.create().texOffs(173, 155).mirror().addBox(-4.5F, -6.5F, -1.0F, 10.0F, 10.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(2.7634F, 11.5695F, -7.0703F, -0.0873F, 0.0F, 0.0F));
		PartDefinition lower_left_skirt = left_skirt.addOrReplaceChild("lower_left_skirt", CubeListBuilder.create().texOffs(3, 221).mirror().addBox(-3.7312F, 12.9902F, -2.25F, 13.0F, 14.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 31).mirror().addBox(-3.7312F, -0.0098F, -0.25F, 11.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.9945F, 15.0168F, -8.25F));
		PartDefinition body_r35 = lower_left_skirt.addOrReplaceChild("body_r35", CubeListBuilder.create().texOffs(55, 206).addBox(-1.5F, -7.5F, -9.5F, 3.0F, 14.0F, 19.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(9.2692F, 20.6106F, 8.25F, 0.0F, 0.0F, -0.1309F));
		PartDefinition body_r36 = lower_left_skirt.addOrReplaceChild("body_r36", CubeListBuilder.create().texOffs(0, 132).addBox(-2.0F, -7.5F, -8.5F, 3.0F, 13.0F, 15.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(7.829F, 7.7474F, 9.25F, 0.0F, 0.0F, -0.1745F));
		PartDefinition body_r37 = lower_left_skirt.addOrReplaceChild("body_r37", CubeListBuilder.create().texOffs(150, 137).mirror().addBox(-6.5F, -7.5F, -1.5F, 13.0F, 14.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(2.7789F, 20.6106F, 18.2504F, 0.1309F, 0.0F, 0.0F));
		PartDefinition body_r38 = lower_left_skirt.addOrReplaceChild("body_r38", CubeListBuilder.create().texOffs(115, 159).mirror().addBox(-4.5F, -7.5F, -1.0F, 11.0F, 13.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.7688F, 7.7474F, 16.8101F, 0.1745F, 0.0F, 0.0F));
		PartDefinition body_r39 = lower_left_skirt.addOrReplaceChild("body_r39", CubeListBuilder.create().texOffs(147, 220).mirror().addBox(-6.5F, -7.5F, -1.5F, 13.0F, 14.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(2.7789F, 20.6106F, -1.7504F, -0.1309F, 0.0F, 0.0F));
		PartDefinition body_r40 = lower_left_skirt.addOrReplaceChild("body_r40", CubeListBuilder.create().texOffs(0, 116).mirror().addBox(-4.5F, -7.5F, -1.0F, 11.0F, 13.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.7688F, 7.7474F, -0.3101F, -0.1745F, 0.0F, 0.0F));
		PartDefinition left_foot = lower_left_skirt.addOrReplaceChild(
				"left_foot", CubeListBuilder.create().texOffs(177, 129).addBox(-3.0523F, -0.9866F, -1.6257F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(216, 131)
						.addBox(-3.0523F, 1.0134F, -6.6257F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(158, 126).addBox(-3.0523F, -0.9866F, 2.3743F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.3211F, 26.9769F, 7.3757F));
		PartDefinition left_leg_r1 = left_foot.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(64, 154).mirror().addBox(-0.275F, -1.0F, -1.375F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(176, 117)
						.addBox(-0.275F, -1.0F, -0.875F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.42F)).texOffs(161, 119).addBox(-1.725F, -1.0F, -0.875F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.42F)).texOffs(148, 113)
						.addBox(-3.225F, -1.0F, -0.875F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.42F)),
				PartPose.offsetAndRotation(-0.0273F, 1.9767F, -6.867F, 0.4363F, 0.0F, 0.0F));
		PartDefinition left_leg_r2 = left_foot.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(148, 113).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.42F)),
				PartPose.offsetAndRotation(2.1977F, 1.8182F, -6.5271F, 0.5236F, 0.0F, 0.0F));
		PartDefinition left_leg_r3 = left_foot.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(148, 113).addBox(-1.725F, -1.0F, -2.45F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).texOffs(148, 113).addBox(-0.275F, -1.0F, -1.95F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).texOffs(148, 113)
						.addBox(1.225F, -1.0F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).texOffs(148, 113).addBox(-3.225F, -1.0F, -1.45F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).texOffs(148, 113)
						.addBox(1.225F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).texOffs(148, 113).addBox(-0.275F, -1.0F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).texOffs(148, 113)
						.addBox(-1.725F, -1.0F, -1.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).texOffs(148, 113).addBox(-3.225F, -1.0F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).texOffs(148, 113)
						.addBox(1.225F, -1.0F, 0.45F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).texOffs(176, 105).addBox(-0.275F, -1.0F, -0.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(165, 109)
						.addBox(-1.725F, -1.0F, -0.8F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(148, 113).addBox(-3.225F, -1.0F, 0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0273F, 2.3634F, -8.2257F, 0.1745F, 0.0F, 0.0F));
		PartDefinition left_leg_r4 = left_foot.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(131, 49).addBox(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-0.0523F, 2.0134F, 2.3672F, -0.7854F, 0.0F, 0.0F));
		PartDefinition left_leg_r5 = left_foot.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(196, 113).addBox(-3.0F, -1.5F, -2.5F, 5.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(0.4477F, 1.4425F, -2.7419F, 0.3927F, 0.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(162, 193).addBox(-5.3205F, -14.1394F, -10.1505F, 11.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(95, 184).addBox(-5.3205F, -13.1394F, -11.1505F, 11.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(198, 234).addBox(-5.8205F, -13.1394F, -10.1505F, 12.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(190, 145).addBox(-5.8205F, -4.1394F, -12.1505F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(140, 241)
						.addBox(-2.8205F, -4.2936F, -9.7005F, 6.0F, 5.0F, 10.0F, new CubeDeformation(-0.01F)),
				PartPose.offset(-0.1795F, -21.2956F, 6.5038F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(116, 203).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-2.1F)),
				PartPose.offsetAndRotation(-23.4575F, -11.5402F, -6.8299F, -0.063F, -0.0803F, -1.0971F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(98, 246).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-1.9F)),
				PartPose.offsetAndRotation(-22.9232F, -12.1775F, -6.7673F, -0.0889F, -0.0501F, -0.7047F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(199, 218).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-1.6F)),
				PartPose.offsetAndRotation(-22.0466F, -12.278F, -6.7554F, -0.0983F, 0.0273F, 0.0771F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(74, 246).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-1.3F)),
				PartPose.offsetAndRotation(-20.4096F, -11.6961F, -6.906F, -0.0804F, 0.0628F, 0.4687F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(27, 163).addBox(-3.5F, -2.5F, -2.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(-17.65F, -10.9493F, -6.3901F, -0.0154F, -0.1739F, 0.0886F));
		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(204, 174).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(-15.2F, -11.5294F, -5.8401F, 0.0674F, -0.1611F, -0.3981F));
		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(231, 141).addBox(-0.325F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-13.9333F, -11.9794F, -5.5005F, 0.0F, -0.0873F, 0.0F));
		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(135, 176).mirror().addBox(-2.0F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.6795F, -11.3894F, -5.1505F, 0.0F, 0.0F, -0.2182F));
		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(231, 141).mirror().addBox(-4.675F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false),
				PartPose.offsetAndRotation(14.2923F, -11.9794F, -5.5005F, 0.0F, 0.0873F, 0.0F));
		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(143, 13).mirror().addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-2.25F)).mirror(false),
				PartPose.offsetAndRotation(23.9876F, -11.0381F, -6.8871F, -0.0274F, 0.0983F, 1.491F));
		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(116, 203).mirror().addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-2.1F)).mirror(false),
				PartPose.offsetAndRotation(23.8165F, -11.5402F, -6.8299F, -0.063F, 0.0803F, 1.0971F));
		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(98, 246).mirror().addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-1.9F)).mirror(false),
				PartPose.offsetAndRotation(23.2822F, -12.1775F, -6.7673F, -0.0889F, 0.0501F, 0.7047F));
		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(199, 218).mirror().addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-1.6F)).mirror(false),
				PartPose.offsetAndRotation(22.4056F, -12.278F, -6.7554F, -0.0983F, -0.0273F, -0.0771F));
		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(74, 246).mirror().addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-1.3F)).mirror(false),
				PartPose.offsetAndRotation(20.7686F, -11.6961F, -6.906F, -0.0804F, -0.0628F, -0.4687F));
		PartDefinition head_r15 = head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(27, 163).mirror().addBox(-2.5F, -2.5F, -2.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(-1.0F)).mirror(false),
				PartPose.offsetAndRotation(18.009F, -10.9493F, -6.3901F, -0.0154F, 0.1739F, -0.0886F));
		PartDefinition head_r16 = head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(204, 174).mirror().addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.6F)).mirror(false),
				PartPose.offsetAndRotation(15.559F, -11.5294F, -5.8401F, 0.0674F, 0.1611F, 0.3981F));
		PartDefinition head_r17 = head.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(134, 55).mirror().addBox(-0.0903F, -0.6856F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0306F, -9.5202F, -11.1505F, 0.1719F, -0.0302F, 0.1719F));
		PartDefinition head_r18 = head.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(148, 27).mirror().addBox(-2.9097F, -0.6856F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0306F, -9.5202F, -11.1505F, 0.1739F, 0.0151F, -0.0859F));
		PartDefinition head_r19 = head.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(78, 65).addBox(-1.75F, 0.7153F, -0.553F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5705F, 8.3873F, -12.398F, -0.0436F, 0.0F, 0.0F));
		PartDefinition body_r41 = head.addOrReplaceChild("body_r41", CubeListBuilder.create().texOffs(43, 113).mirror().addBox(-3.5F, -5.0F, -5.5F, 7.0F, 10.0F, 11.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(6.1283F, -0.0936F, -4.7005F, 0.0F, 0.0F, -0.6109F));
		PartDefinition body_r42 = head.addOrReplaceChild("body_r42", CubeListBuilder.create().texOffs(78, 138).mirror().addBox(-3.0F, -5.0F, -7.0F, 7.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.8974F, 1.3499F, -3.2005F, 0.0F, 0.0F, -1.0908F));
		PartDefinition body_r43 = head.addOrReplaceChild("body_r43", CubeListBuilder.create().texOffs(78, 138).addBox(-4.0F, -5.0F, -7.0F, 7.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5385F, 1.3499F, -3.2005F, 0.0F, 0.0F, 1.0908F));
		PartDefinition body_r44 = head.addOrReplaceChild("body_r44", CubeListBuilder.create().texOffs(43, 113).addBox(-3.5F, -5.0F, -5.5F, 7.0F, 10.0F, 11.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-5.7693F, -0.0936F, -4.7005F, 0.0F, 0.0F, 0.6109F));
		PartDefinition head_r20 = head.addOrReplaceChild("head_r20",
				CubeListBuilder.create().texOffs(51, 90).addBox(-3.75F, 0.7153F, -0.553F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 31).addBox(-4.75F, -2.2847F, -0.553F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5705F, 6.3873F, -12.398F, -0.0436F, 0.0F, 0.0F));
		PartDefinition head_r21 = head.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(142, 159).addBox(-2.75F, -0.2153F, -0.947F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9295F, 8.3493F, -12.2714F, -0.0436F, 0.0F, 0.0F));
		PartDefinition head_r22 = head.addOrReplaceChild("head_r22",
				CubeListBuilder.create().texOffs(67, 65).addBox(-2.75F, -0.2153F, -0.947F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 115).addBox(-3.75F, -3.2153F, -0.947F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5705F, 6.3493F, -12.2714F, -0.0436F, 0.0F, 0.0F));
		PartDefinition head_r23 = head.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(197, 44).addBox(-6.0F, -6.0F, -0.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6795F, 3.1826F, -12.5848F, -0.1745F, 0.0F, 0.0F));
		PartDefinition head_r24 = head.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(213, 203).addBox(-6.0F, -6.0F, -0.5F, 11.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6795F, 3.1826F, -12.1848F, -0.1745F, 0.0F, 0.0F));
		PartDefinition head_r25 = head.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(148, 27).addBox(-0.0903F, -0.6856F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6716F, -9.5202F, -11.1505F, 0.1739F, -0.0151F, 0.0859F));
		PartDefinition head_r26 = head.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(134, 55).addBox(-2.9097F, -0.6856F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6716F, -9.5202F, -11.1505F, 0.1719F, 0.0302F, -0.1719F));
		PartDefinition head_r27 = head.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(143, 13).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-2.25F)),
				PartPose.offsetAndRotation(-23.6286F, -11.0381F, -6.8871F, -0.0274F, -0.0983F, -1.491F));
		PartDefinition head_r28 = head.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(135, 176).addBox(-3.0F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.3205F, -11.3894F, -5.1505F, 0.0F, 0.0F, 0.2182F));
		PartDefinition left_arm = body.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(214, 48).addBox(1.4693F, -5.5444F, -4.4314F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(228, 110).addBox(2.4693F, -6.0444F, -3.4314F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
						.texOffs(141, 72).addBox(0.4693F, -5.0444F, -5.4314F, 11.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(236, 34).addBox(1.4693F, -4.0444F, -5.9314F, 9.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(236, 93)
						.addBox(1.4693F, -4.0444F, 5.0686F, 9.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(192, 0).addBox(-0.0307F, -4.5444F, -4.9314F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(141, 52)
						.addBox(10.9693F, -4.0444F, -4.4314F, 1.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(187, 70).addBox(11.4693F, -3.0444F, -3.4314F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(163, 58)
						.addBox(1.4193F, 6.9556F, -4.4314F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(163, 43).addBox(0.9193F, 4.9556F, -4.9314F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0307F, -17.1406F, 1.7346F));
		PartDefinition left_forearm = left_arm.addOrReplaceChild("left_forearm",
				CubeListBuilder.create().texOffs(79, 75).addBox(-4.417F, 13.2979F, -10.0039F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.15F)).texOffs(206, 29).addBox(-3.917F, 15.5979F, -9.5039F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.15F))
						.texOffs(211, 70).addBox(-0.917F, 23.1979F, -9.5039F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.15F)).texOffs(220, 59).addBox(1.083F, 24.4479F, -9.5039F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.15F)).texOffs(108, 65)
						.addBox(-4.917F, 8.9979F, -10.5039F, 9.0F, 7.0F, 9.0F, new CubeDeformation(0.15F)).texOffs(215, 0).addBox(-5.417F, -0.0021F, -11.0039F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(236, 76)
						.addBox(-4.917F, 2.2479F, -1.2539F, 9.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(238, 62).addBox(-4.417F, 2.2479F, -0.7539F, 8.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)).texOffs(165, 1)
						.addBox(-2.917F, 21.8979F, -9.5039F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.15F)).texOffs(102, 85).addBox(-5.917F, 0.9979F, -11.5039F, 11.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.3363F, 8.9577F, 6.0725F));
		PartDefinition left_arm_r1 = left_forearm.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(208, 60).addBox(0.4078F, 0.5726F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.13F)),
				PartPose.offsetAndRotation(0.9512F, 24.1738F, -10.2319F, 1.5269F, 1.2241F, 1.8783F));
		PartDefinition left_arm_r2 = left_forearm.addOrReplaceChild("left_arm_r2", CubeListBuilder.create().texOffs(198, 60).addBox(0.1275F, -1.1634F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)),
				PartPose.offsetAndRotation(0.9512F, 24.1738F, -10.2319F, -1.2587F, 1.5222F, -0.9103F));
		PartDefinition left_arm_r3 = left_forearm.addOrReplaceChild("left_arm_r3", CubeListBuilder.create().texOffs(206, 53).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(1.5784F, 22.4277F, -9.7414F, -1.552F, 0.6518F, -1.2107F));
		PartDefinition left_arm_r4 = left_forearm.addOrReplaceChild("left_arm_r4", CubeListBuilder.create().texOffs(176, 71).addBox(0.0998F, 0.4275F, -0.4875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.13F)),
				PartPose.offsetAndRotation(-0.2447F, 27.3933F, -6.9414F, 0.0F, 0.0F, 1.9199F));
		PartDefinition left_arm_r5 = left_forearm.addOrReplaceChild("left_arm_r5", CubeListBuilder.create().texOffs(186, 71).addBox(0.208F, 0.615F, -0.4875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.13F)),
				PartPose.offsetAndRotation(-0.4782F, 26.5933F, -8.7914F, 0.0F, 0.0F, 2.1817F));
		PartDefinition left_arm_r6 = left_forearm.addOrReplaceChild("left_arm_r6", CubeListBuilder.create().texOffs(181, 75).addBox(-0.3047F, -0.2681F, 0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.13F)),
				PartPose.offsetAndRotation(-1.3494F, 26.8958F, -6.0039F, 0.0F, 0.0F, 2.0944F));
		PartDefinition left_arm_r7 = left_forearm.addOrReplaceChild("left_arm_r7", CubeListBuilder.create().texOffs(176, 79).addBox(0.3163F, 0.8025F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.13F)),
				PartPose.offsetAndRotation(-0.2617F, 26.1433F, -3.2414F, 0.0F, 0.0F, 2.3126F));
		PartDefinition left_arm_r8 = left_forearm.addOrReplaceChild("left_arm_r8", CubeListBuilder.create().texOffs(192, 59).addBox(-0.0451F, -0.986F, -0.4875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)),
				PartPose.offsetAndRotation(-0.2617F, 26.1433F, -3.2414F, 0.0F, 0.0F, 1.9199F));
		PartDefinition left_arm_r9 = left_forearm.addOrReplaceChild("left_arm_r9", CubeListBuilder.create().texOffs(210, 67).addBox(-0.209F, -2.2128F, 0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)),
				PartPose.offsetAndRotation(-1.3494F, 26.8958F, -6.0039F, 0.0F, 0.0F, 1.7017F));
		PartDefinition left_arm_r10 = left_forearm.addOrReplaceChild("left_arm_r10", CubeListBuilder.create().texOffs(203, 63).addBox(-0.0733F, -1.2007F, -0.4875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)),
				PartPose.offsetAndRotation(-0.4782F, 26.5933F, -8.7914F, 0.0F, 0.0F, 1.789F));
		PartDefinition left_arm_r11 = left_forearm.addOrReplaceChild("left_arm_r11", CubeListBuilder.create().texOffs(249, 51).addBox(-0.1016F, -1.4153F, -0.4875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)),
				PartPose.offsetAndRotation(-0.2447F, 27.3933F, -6.9414F, 0.0F, 0.0F, 1.5272F));
		PartDefinition left_arm_r12 = left_forearm.addOrReplaceChild("left_arm_r12", CubeListBuilder.create().texOffs(216, 47).addBox(0.7377F, -2.6205F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(-0.2439F, 26.5069F, -6.1039F, 0.0F, 0.0F, 0.6981F));
		PartDefinition left_arm_r13 = left_forearm.addOrReplaceChild("left_arm_r13", CubeListBuilder.create().texOffs(216, 61).addBox(0.388F, -2.8315F, -0.5125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(-0.2617F, 26.1433F, -3.2414F, 0.0F, 0.0F, 0.9163F));
		PartDefinition left_arm_r14 = left_forearm.addOrReplaceChild("left_arm_r14", CubeListBuilder.create().texOffs(243, 48).addBox(0.7197F, -3.1099F, -0.5125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(-0.2447F, 27.3933F, -6.9414F, 0.0F, 0.0F, 0.5236F));
		PartDefinition left_arm_r15 = left_forearm.addOrReplaceChild("left_arm_r15", CubeListBuilder.create().texOffs(231, 71).addBox(0.5539F, -2.9707F, -0.5125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(-0.4782F, 26.5933F, -8.7914F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone2 = left_arm.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(173, 32).mirror().addBox(-3.917F, 16.8979F, -9.5039F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offset(6.3363F, 8.9577F, 6.0725F));
		PartDefinition right_arm = body.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(187, 70).mirror().addBox(-12.4693F, -3.0444F, -3.4314F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(163, 43).mirror()
						.addBox(-10.9193F, 4.9556F, -4.9314F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(228, 110).mirror().addBox(-9.4693F, -6.0444F, -3.4314F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(192, 0).mirror().addBox(-0.9693F, -4.5444F, -4.9314F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(236, 93).mirror()
						.addBox(-10.4693F, -4.0444F, 5.0686F, 9.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(141, 72).mirror().addBox(-11.4693F, -5.0444F, -5.4314F, 11.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(163, 58).mirror().addBox(-10.4193F, 6.9556F, -4.4314F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(236, 34).mirror()
						.addBox(-10.4693F, -4.0444F, -5.9314F, 9.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(214, 48).mirror().addBox(-10.4693F, -5.5444F, -4.4314F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(141, 52).mirror().addBox(-11.9693F, -4.0444F, -4.4314F, 1.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-12.0307F, -17.1406F, 1.7346F));
		PartDefinition bone = right_arm.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(238, 62).mirror().addBox(-3.583F, 2.2479F, -0.7539F, 8.0F, 10.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false).texOffs(102, 85).mirror()
						.addBox(-5.083F, 0.9979F, -11.5039F, 11.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(236, 76).mirror().addBox(-4.083F, 2.2479F, -1.2539F, 9.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(108, 65).mirror().addBox(-4.083F, 8.9979F, -10.5039F, 9.0F, 7.0F, 9.0F, new CubeDeformation(0.15F)).mirror(false).texOffs(79, 75).mirror()
						.addBox(-3.583F, 13.2979F, -10.0039F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.15F)).mirror(false).texOffs(211, 70).mirror().addBox(-3.083F, 23.1979F, -9.5039F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.15F)).mirror(false)
						.texOffs(220, 59).mirror().addBox(-3.083F, 24.4479F, -9.5039F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.15F)).mirror(false).texOffs(165, 1).mirror()
						.addBox(-3.083F, 21.8979F, -9.5039F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.15F)).mirror(false).texOffs(173, 32).addBox(-3.083F, 16.8979F, -9.5039F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.15F)).texOffs(206, 29).mirror()
						.addBox(-3.083F, 15.5979F, -9.5039F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.15F)).mirror(false).texOffs(215, 0).mirror().addBox(-4.583F, -0.0021F, -11.0039F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-6.3363F, 8.9577F, 6.0725F));
		PartDefinition right_arm_r1 = bone.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(206, 53).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offsetAndRotation(-1.5784F, 22.4277F, -9.7414F, -1.552F, -0.6518F, 1.2107F));
		PartDefinition right_arm_r2 = bone.addOrReplaceChild("right_arm_r2", CubeListBuilder.create().texOffs(198, 60).mirror().addBox(-1.1275F, -1.1634F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)).mirror(false),
				PartPose.offsetAndRotation(-0.9512F, 24.1738F, -10.2319F, -1.2587F, -1.5222F, 0.9103F));
		PartDefinition right_arm_r3 = bone.addOrReplaceChild("right_arm_r3", CubeListBuilder.create().texOffs(208, 60).mirror().addBox(-1.4078F, 0.5726F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.13F)).mirror(false),
				PartPose.offsetAndRotation(-0.9512F, 24.1738F, -10.2319F, 1.5269F, -1.2241F, -1.8783F));
		PartDefinition right_arm_r4 = bone.addOrReplaceChild("right_arm_r4", CubeListBuilder.create().texOffs(192, 59).mirror().addBox(-0.9549F, -0.986F, -0.4875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)).mirror(false),
				PartPose.offsetAndRotation(0.2617F, 26.1433F, -3.2414F, 0.0F, 0.0F, -1.9199F));
		PartDefinition right_arm_r5 = bone.addOrReplaceChild("right_arm_r5", CubeListBuilder.create().texOffs(210, 67).mirror().addBox(-0.791F, -2.2128F, 0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)).mirror(false),
				PartPose.offsetAndRotation(1.3494F, 26.8958F, -6.0039F, 0.0F, 0.0F, -1.7017F));
		PartDefinition right_arm_r6 = bone.addOrReplaceChild("right_arm_r6", CubeListBuilder.create().texOffs(203, 63).mirror().addBox(-0.9267F, -1.2007F, -0.4875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)).mirror(false),
				PartPose.offsetAndRotation(0.4782F, 26.5933F, -8.7914F, 0.0F, 0.0F, -1.789F));
		PartDefinition right_arm_r7 = bone.addOrReplaceChild("right_arm_r7", CubeListBuilder.create().texOffs(249, 51).mirror().addBox(-0.8984F, -1.4153F, -0.4875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.14F)).mirror(false),
				PartPose.offsetAndRotation(0.2447F, 27.3933F, -6.9414F, 0.0F, 0.0F, -1.5272F));
		PartDefinition right_arm_r8 = bone.addOrReplaceChild("right_arm_r8", CubeListBuilder.create().texOffs(243, 48).mirror().addBox(-1.7197F, -3.1099F, -0.5125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offsetAndRotation(0.2447F, 27.3933F, -6.9414F, 0.0F, 0.0F, -0.5236F));
		PartDefinition right_arm_r9 = bone.addOrReplaceChild("right_arm_r9", CubeListBuilder.create().texOffs(231, 71).mirror().addBox(-1.5539F, -2.9707F, -0.5125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offsetAndRotation(0.4782F, 26.5933F, -8.7914F, 0.0F, 0.0F, -0.7854F));
		PartDefinition right_arm_r10 = bone.addOrReplaceChild("right_arm_r10", CubeListBuilder.create().texOffs(216, 47).mirror().addBox(-1.7377F, -2.6205F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offsetAndRotation(0.2439F, 26.5069F, -6.1039F, 0.0F, 0.0F, -0.6981F));
		PartDefinition right_arm_r11 = bone.addOrReplaceChild("right_arm_r11", CubeListBuilder.create().texOffs(216, 61).mirror().addBox(-1.388F, -2.8315F, -0.5125F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offsetAndRotation(0.2617F, 26.1433F, -3.2414F, 0.0F, 0.0F, -0.9163F));
		PartDefinition right_arm_r12 = bone.addOrReplaceChild("right_arm_r12", CubeListBuilder.create().texOffs(181, 75).mirror().addBox(-0.6953F, -0.2681F, 0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.13F)).mirror(false),
				PartPose.offsetAndRotation(1.3494F, 26.8958F, -6.0039F, 0.0F, 0.0F, -2.0944F));
		PartDefinition right_arm_r13 = bone.addOrReplaceChild("right_arm_r13", CubeListBuilder.create().texOffs(176, 71).mirror().addBox(-1.0998F, 0.4275F, -0.4875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.13F)).mirror(false),
				PartPose.offsetAndRotation(0.2447F, 27.3933F, -6.9414F, 0.0F, 0.0F, -1.9199F));
		PartDefinition right_arm_r14 = bone.addOrReplaceChild("right_arm_r14", CubeListBuilder.create().texOffs(186, 71).mirror().addBox(-1.208F, 0.615F, -0.4875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.13F)).mirror(false),
				PartPose.offsetAndRotation(0.4782F, 26.5933F, -8.7914F, 0.0F, 0.0F, -2.1817F));
		PartDefinition right_arm_r15 = bone.addOrReplaceChild("right_arm_r15", CubeListBuilder.create().texOffs(176, 79).mirror().addBox(-1.3163F, 0.8025F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.13F)).mirror(false),
				PartPose.offsetAndRotation(0.2617F, 26.1433F, -3.2414F, 0.0F, 0.0F, -2.3126F));
		PartDefinition head2 = body.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(0.1795F, -21.2956F, 6.5038F));
		PartDefinition head_r29 = head2.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(197, 44).mirror().addBox(-1.0F, -6.0F, -0.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6795F, 3.1826F, -12.5848F, -0.1745F, 0.0F, 0.0F));
		PartDefinition head3 = body.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offset(0.1795F, -21.2956F, 6.5038F));
		PartDefinition head_r30 = head3.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(73, 115).mirror().addBox(-2.25F, -3.2153F, -0.947F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5705F, 6.3493F, -12.2714F, -0.0436F, 0.0F, 0.0F));
		PartDefinition head4 = body.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offset(0.1795F, -21.2956F, 6.5038F));
		PartDefinition head_r31 = head4.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(67, 65).mirror().addBox(-1.25F, -0.2153F, -0.947F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5705F, 6.3493F, -12.2714F, -0.0436F, 0.0F, 0.0F));
		PartDefinition head5 = body.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offset(0.1795F, -21.2956F, 6.5038F));
		PartDefinition head_r32 = head5.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(142, 159).mirror().addBox(0.75F, -0.2153F, -0.947F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.9295F, 8.3493F, -12.2714F, -0.0436F, 0.0F, 0.0F));
		PartDefinition head6 = body.addOrReplaceChild("head6", CubeListBuilder.create(), PartPose.offset(0.1795F, -21.2956F, 6.5038F));
		PartDefinition head_r33 = head6.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(62, 31).mirror().addBox(-5.25F, -2.2847F, -0.553F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5705F, 6.3873F, -12.398F, -0.0436F, 0.0F, 0.0F));
		PartDefinition head7 = body.addOrReplaceChild("head7", CubeListBuilder.create(), PartPose.offset(0.1795F, -21.2956F, 6.5038F));
		PartDefinition head_r34 = head7.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(51, 90).mirror().addBox(-3.25F, 0.7153F, -0.553F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5705F, 6.3873F, -12.398F, -0.0436F, 0.0F, 0.0F));
		PartDefinition head8 = body.addOrReplaceChild("head8", CubeListBuilder.create(), PartPose.offset(0.1795F, -21.2956F, 6.5038F));
		PartDefinition head_r35 = head8.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-2.25F, 0.7153F, -0.553F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5705F, 8.3873F, -12.398F, -0.0436F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		demon_king.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
