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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelteddybear_king<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelteddybear_king"), "main");
	public final ModelPart kingsbear;

	public Modelteddybear_king(ModelPart root) {
		this.kingsbear = root.getChild("kingsbear");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition kingsbear = partdefinition.addOrReplaceChild("kingsbear",
				CubeListBuilder.create().texOffs(0, 0).addBox(-15.8326F, 1.9681F, -5.7344F, 32.0F, 32.0F, 16.5F, new CubeDeformation(0.0F)).texOffs(0, 50).addBox(-12.8326F, 33.9681F, -5.9844F, 26.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
						.texOffs(71, 69).addBox(-14.0576F, -10.3745F, -5.4844F, 28.45F, 12.55F, 16.0F, new CubeDeformation(0.0F)).texOffs(233, 187).addBox(-4.0576F, -0.3745F, -9.4844F, 8.45F, 12.55F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 229)
						.addBox(-2.3326F, -1.6245F, -10.9844F, 5.0F, 4.55F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 229).addBox(-2.5576F, 12.1255F, -9.4844F, 5.45F, 5.05F, 4.0F, new CubeDeformation(0.0F)).texOffs(239, 0)
						.addBox(4.9424F, -10.3745F, -5.9844F, 7.0F, 7.0F, 3.5F, new CubeDeformation(0.0F)).texOffs(70, 54).addBox(8.1924F, -7.3745F, -6.4844F, 1.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(143, 109)
						.addBox(-5.5576F, -13.4745F, -5.4844F, 11.45F, 3.1F, 16.0F, new CubeDeformation(0.0F)).texOffs(185, 113).addBox(-2.7168F, -21.4819F, -5.4844F, 5.7685F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(239, 0).mirror()
						.addBox(-11.6076F, -10.3745F, -5.9844F, 7.0F, 7.0F, 3.5F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 54).mirror().addBox(-8.8576F, -7.3745F, -6.4844F, 1.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-0.1674F, -33.9681F, -2.5156F));
		PartDefinition cube_r1 = kingsbear.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(91, 206).mirror().addBox(0.1158F, -20.5F, -9.0F, 7.7685F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(184, 79)
						.addBox(-0.0842F, -20.5F, -9.0F, 7.9685F, 8.0F, 4.75F, new CubeDeformation(0.0F)).texOffs(183, 0).addBox(-14.5F, -2.8842F, -15.0F, 8.0F, 5.7685F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1674F, -6.9819F, 9.5156F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r2 = kingsbear.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(184, 79).mirror().addBox(-7.8842F, -20.5F, -9.0F, 7.9685F, 8.0F, 4.75F, new CubeDeformation(0.0F)).mirror(false).texOffs(183, 0).mirror()
						.addBox(6.5F, -2.8842F, -15.0F, 8.0F, 5.7685F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(185, 113).mirror().addBox(-2.8842F, -14.5F, -15.0F, 5.7685F, 8.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(140, 189).addBox(-2.8842F, -14.5F, -15.0F, 5.7685F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(91, 206).addBox(-7.8842F, -20.5F, -9.0F, 7.7685F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(140, 189)
						.addBox(-2.8842F, -14.5F, -15.0F, 5.7685F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1674F, -6.9819F, 9.5156F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r3 = kingsbear.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-7.0F, -5.0F, -8.25F, 12.25F, 18.55F, 16.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-13.2113F, 5.7858F, 2.5156F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r4 = kingsbear.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 149).addBox(-1.225F, -1.775F, -2.0F, 2.45F, 5.55F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3044F, 10.5011F, -7.4844F, 0.0F, 0.0F, 3.0107F));
		PartDefinition cube_r5 = kingsbear.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(130, 99).addBox(-4.225F, -6.275F, -2.0F, 2.45F, 7.55F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6006F, 6.7802F, -7.4844F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r6 = kingsbear.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(173, 162).addBox(-1.225F, -2.775F, -2.0F, 2.45F, 5.55F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8389F, 14.2115F, -7.4844F, 0.0F, 0.0F, 2.618F));
		PartDefinition cube_r7 = kingsbear.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(2.0158F, -4.0F, -2.75F, 1.8685F, 10.3F, 5.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(10.892F, -20.9697F, 2.5156F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r8 = kingsbear.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(185, 113).addBox(-2.8842F, -4.0F, -8.0F, 5.7685F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1856F, -16.6826F, 2.5156F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r9 = kingsbear.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(182, 109).mirror().addBox(-0.9342F, -2.6F, -2.75F, 1.8685F, 7.75F, 5.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(10.5637F, -24.9358F, 2.5156F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r10 = kingsbear.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(42, 122).mirror().addBox(-3.8842F, -4.0F, -2.75F, 1.8685F, 8.0F, 5.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.1486F, -21.263F, 2.5156F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r11 = kingsbear.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(182, 109).addBox(-0.9342F, -2.6F, -2.75F, 1.8685F, 7.75F, 5.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.2289F, -24.9358F, 2.5156F, 0.0F, 0.0F, 1.1781F));
		PartDefinition cube_r12 = kingsbear.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 50).addBox(-3.8842F, -4.0F, -2.75F, 1.8685F, 10.3F, 5.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5572F, -20.9697F, 2.5156F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r13 = kingsbear.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 122).addBox(2.0158F, -4.0F, -2.75F, 1.8685F, 8.0F, 5.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.8137F, -21.263F, 2.5156F, 0.0F, 0.0F, -0.6545F));
		PartDefinition cube_r14 = kingsbear.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(202, 80).addBox(-2.8842F, -4.0F, -8.0F, 5.7685F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2572F, -14.4065F, 2.5156F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r15 = kingsbear.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(202, 80).addBox(-2.8842F, -14.5F, -15.0F, 5.7685F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1674F, -6.9819F, 9.5156F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r16 = kingsbear.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 149).mirror().addBox(-7.0F, -27.0F, -8.0F, 12.25F, 9.55F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-17.9757F, 17.2881F, 2.5156F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r17 = kingsbear.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 122).mirror().addBox(-6.125F, -0.275F, -8.5F, 12.25F, 8.55F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(22.3056F, 29.3156F, 2.5156F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r18 = kingsbear.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(141, 20).mirror().addBox(-6.125F, 0.725F, -8.5F, 12.25F, 7.55F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(21.2467F, 23.6958F, 2.5156F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r19 = kingsbear.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(143, 135).mirror().addBox(-6.125F, -14.775F, -8.25F, 12.25F, 8.55F, 16.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(23.1064F, 31.4824F, 2.5156F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r20 = kingsbear.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(173, 162).mirror().addBox(-1.225F, -2.775F, -2.0F, 2.45F, 5.55F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.1737F, 14.2115F, -7.4844F, 0.0F, 0.0F, -2.618F));
		PartDefinition cube_r21 = kingsbear.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 149).mirror().addBox(-1.225F, -1.775F, -2.0F, 2.45F, 5.55F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.6393F, 10.5011F, -7.4844F, 0.0F, 0.0F, -3.0107F));
		PartDefinition cube_r22 = kingsbear.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(130, 99).mirror().addBox(1.775F, -6.275F, -2.0F, 2.45F, 7.55F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9355F, 6.7802F, -7.4844F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r23 = kingsbear.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 149).addBox(-5.25F, -27.0F, -8.0F, 12.25F, 9.55F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.3105F, 17.2881F, 2.5156F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r24 = kingsbear.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(99, 0).addBox(-5.25F, -5.0F, -8.25F, 12.25F, 18.55F, 16.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5461F, 5.7858F, 2.5156F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r25 = kingsbear.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(101, 117).mirror().addBox(-6.125F, -8.275F, -8.5F, 12.25F, 16.55F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(14.6153F, 40.8249F, 2.5156F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r26 = kingsbear.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(101, 117).addBox(-6.125F, -8.275F, -8.5F, 12.25F, 16.55F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.2805F, 40.8249F, 2.5156F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r27 = kingsbear.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 122).addBox(-6.125F, -0.275F, -8.5F, 12.25F, 8.55F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.9707F, 29.3156F, 2.5156F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r28 = kingsbear.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(141, 20).addBox(-6.125F, 0.725F, -8.5F, 12.25F, 7.55F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.9118F, 23.6958F, 2.5156F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r29 = kingsbear.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(143, 135).addBox(-6.125F, -14.775F, -8.25F, 12.25F, 8.55F, 16.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.7716F, 31.4824F, 2.5156F, 0.0F, 0.0F, 0.2618F));
		PartDefinition rightfoot = kingsbear.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(233, 229).addBox(-0.3981F, -5.2699F, -4.95F, 7.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-14.4344F, 53.238F, 2.4656F));
		PartDefinition cube_r30 = rightfoot.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(208, 239).addBox(-1.35F, -11.75F, -4.9F, 2.0F, 15.25F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r31 = rightfoot.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(160, 129).addBox(-3.25F, 5.5F, -5.0F, 6.5F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1019F, -1.0199F, -13.45F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r32 = rightfoot.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(126, 152).addBox(-3.1F, -1.6F, -1.1F, 6.2F, 4.2F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1019F, 2.33F, -6.1815F, 1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r33 = rightfoot.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(249, 92).addBox(2.75F, -10.125F, -4.9F, 1.0F, 15.25F, 9.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7988F, -1.9682F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition leftfoot = kingsbear.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(233, 229).mirror().addBox(-6.6019F, -5.2699F, -4.95F, 7.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(14.7693F, 53.238F, 2.4656F));
		PartDefinition cube_r34 = leftfoot.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(249, 92).mirror().addBox(-3.75F, -10.125F, -4.9F, 1.0F, 15.25F, 9.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.7988F, -1.9682F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r35 = leftfoot.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(160, 129).mirror().addBox(-3.25F, 5.5F, -5.0F, 6.5F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1019F, -1.0199F, -13.45F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r36 = leftfoot.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(126, 152).mirror().addBox(-3.1F, -1.6F, -1.1F, 6.2F, 4.2F, 2.2F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1019F, 2.33F, -6.1815F, 1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r37 = leftfoot.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(208, 239).mirror().addBox(-0.65F, -11.75F, -4.9F, 2.0F, 15.25F, 9.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition upperlefthand = kingsbear.addOrReplaceChild("upperlefthand", CubeListBuilder.create(), PartPose.offset(37.0848F, -12.8415F, 2.5156F));
		PartDefinition lowerlefthand = kingsbear.addOrReplaceChild("lowerlefthand", CubeListBuilder.create(), PartPose.offset(30.5634F, 29.0427F, -15.4844F));
		PartDefinition cube_r38 = lowerlefthand.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(141, 0).addBox(-0.8415F, -4.534F, -4.25F, 5.4F, 5.35F, 8.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5606F, -0.9856F, -1.0954F, -1.4416F, 1.0839F, -2.911F));
		PartDefinition cube_r39 = lowerlefthand.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(41, 229).addBox(-3.7997F, -2.6463F, -5.25F, 7.6F, 10.55F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5606F, -0.9856F, -1.0954F, 1.3705F, 1.2631F, -0.0749F));
		PartDefinition cube_r40 = lowerlefthand.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(223, 42).addBox(-2.0178F, -0.2171F, -5.25F, 8.6F, 14.55F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9662F, -0.3584F, -0.3783F, 1.4657F, 0.3081F, 0.0524F));
		PartDefinition cube_r41 = lowerlefthand.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(173, 178).addBox(1.3345F, 1.2132F, -5.25F, 12.25F, 14.55F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3786F, -0.861F, 0.1861F));
		PartDefinition lowerrighthand = kingsbear.addOrReplaceChild("lowerrighthand", CubeListBuilder.create(), PartPose.offset(-30.2286F, 29.0427F, -15.4844F));
		PartDefinition cube_r42 = lowerrighthand.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(173, 178).mirror().addBox(-13.5845F, 1.2132F, -5.25F, 12.25F, 14.55F, 10.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3786F, 0.861F, -0.1861F));
		PartDefinition cube_r43 = lowerrighthand.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(223, 42).mirror().addBox(-6.5822F, -0.2171F, -5.25F, 8.6F, 14.55F, 10.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.9662F, -0.3584F, -0.3783F, 1.4657F, -0.3081F, -0.0524F));
		PartDefinition cube_r44 = lowerrighthand.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(41, 229).mirror().addBox(-3.8003F, -2.6463F, -5.25F, 7.6F, 10.55F, 10.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.5606F, -0.9856F, -1.0954F, 1.3705F, -1.2631F, 0.0749F));
		PartDefinition cube_r45 = lowerrighthand.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(141, 0).mirror().addBox(-4.5585F, -4.534F, -4.25F, 5.4F, 5.35F, 8.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.5606F, -0.9856F, -1.0954F, -1.4416F, -1.0839F, 2.911F));
		PartDefinition upperrighthand = kingsbear.addOrReplaceChild("upperrighthand", CubeListBuilder.create(), PartPose.offset(-38.3763F, -9.8027F, 2.5156F));
		PartDefinition cube_r46 = upperrighthand.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(80, 231).addBox(-4.3F, -3.275F, -5.25F, 7.6F, 10.55F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r47 = upperrighthand.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(42, 85).addBox(-3.8F, -1.55F, -4.25F, 5.4F, 5.35F, 8.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6264F, -3.0387F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r48 = upperrighthand.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(220, 160).addBox(-6.125F, -7.275F, -5.25F, 8.6F, 14.55F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9448F, 10.7951F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r49 = upperrighthand.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(137, 162).addBox(-6.125F, -5.275F, -5.25F, 12.25F, 14.55F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2875F, 16.2201F, 0.0F, 0.0F, 0.0F, -1.1781F));
		PartDefinition upperlefthand2 = kingsbear.addOrReplaceChild("upperlefthand2", CubeListBuilder.create(), PartPose.offset(38.7112F, -9.8027F, 2.5156F));
		PartDefinition cube_r50 = upperlefthand2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(137, 162).mirror().addBox(-6.125F, -5.275F, -5.25F, 12.25F, 14.55F, 10.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.2875F, 16.2201F, 0.0F, 0.0F, 0.0F, 1.1781F));
		PartDefinition upperlefthand3 = kingsbear.addOrReplaceChild("upperlefthand3", CubeListBuilder.create(), PartPose.offset(38.7112F, -9.8027F, 2.5156F));
		PartDefinition cube_r51 = upperlefthand3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(220, 160).mirror().addBox(-2.475F, -7.275F, -5.25F, 8.6F, 14.55F, 10.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.9448F, 10.7951F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition upperlefthand4 = kingsbear.addOrReplaceChild("upperlefthand4", CubeListBuilder.create(), PartPose.offset(38.7112F, -9.8027F, 2.5156F));
		PartDefinition cube_r52 = upperlefthand4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(42, 85).mirror().addBox(-1.6F, -1.55F, -4.25F, 5.4F, 5.35F, 8.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6264F, -3.0387F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition upperlefthand5 = kingsbear.addOrReplaceChild("upperlefthand5", CubeListBuilder.create(), PartPose.offset(38.7112F, -9.8027F, 2.5156F));
		PartDefinition cube_r53 = upperlefthand5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(80, 231).mirror().addBox(-3.3F, -3.275F, -5.25F, 7.6F, 10.55F, 10.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		kingsbear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
