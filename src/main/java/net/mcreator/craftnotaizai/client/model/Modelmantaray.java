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

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmantaray<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelmantaray"), "main");
	public final ModelPart manta;

	public Modelmantaray(ModelPart root) {
		this.manta = root.getChild("manta");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition manta = partdefinition.addOrReplaceChild("manta", CubeListBuilder.create().texOffs(0, 0).addBox(-7.4382F, -1.2612F, -20.4588F, 16.0F, 3.25F, 36.1F, new CubeDeformation(0.0F)), PartPose.offset(-0.5618F, 19.2612F, 12.4588F));
		PartDefinition cube_r1 = manta.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-5.5F, -0.8F, 0.0F, 11.0F, 1.6F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5609F, -0.2165F, 66.6518F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition cube_r2 = manta.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 64).mirror().addBox(-6.5F, -0.8F, -0.975F, 13.0F, 1.6F, 1.95F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5626F, -0.2165F, 54.6518F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition cube_r3 = manta.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(128, 58).mirror().addBox(-4.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.8804F, 2.3085F, -19.0263F, -0.3927F, -0.3927F, 0.0F));
		PartDefinition cube_r4 = manta.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-4.5F, -2.0F, -9.5F, 9.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.7719F, -1.6419F, -10.414F, -0.1745F, -0.3927F, 0.0F));
		PartDefinition cube_r5 = manta.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(27, 140).mirror().addBox(-0.75F, 0.0F, -0.575F, 1.5F, 0.0F, 1.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.3146F, 3.0331F, -22.6311F, 1.7453F, -0.3927F, 0.0F));
		PartDefinition cube_r6 = manta.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-2, 252).mirror().addBox(-1.0F, 0.0F, -0.575F, 2.0F, 0.0F, 1.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.4857F, 1.3835F, -23.6974F, 1.5708F, -0.3927F, 0.0F));
		PartDefinition cube_r7 = manta.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(69, 0).addBox(-5.5F, -0.8F, 0.0F, 11.0F, 1.6F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5626F, -0.2165F, 66.6518F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition cube_r8 = manta.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(177, 38).mirror().addBox(-6.5F, -0.55F, -0.875F, 13.0F, 1.1F, 1.75F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.256F, -0.2165F, 54.6286F, 1.5708F, -1.4835F, 0.0F));
		PartDefinition cube_r9 = manta.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(64, 55).mirror().addBox(-6.5F, -2.9F, -1.025F, 13.0F, 5.8F, 2.05F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5787F, -0.2665F, 33.2703F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition cube_r10 = manta.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(56, 149).mirror().addBox(-11.5F, -1.9F, -0.975F, 23.0F, 3.8F, 1.95F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8732F, -0.2665F, 37.5132F, 1.5708F, -1.3526F, 0.0F));
		PartDefinition cube_r11 = manta.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(47, 160).mirror().addBox(-6.0F, -5.875F, -1.075F, 12.0F, 11.75F, 2.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.1751F, -0.2665F, 18.4131F, 1.5708F, -0.6981F, 0.0F));
		PartDefinition cube_r12 = manta.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-6.5F, -2.0F, -1.5F, 13.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.1809F, 2.317F, -18.5446F, -0.3927F, 0.3927F, 0.0F));
		PartDefinition cube_r13 = manta.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(169, 87).addBox(-5.5F, -10.0F, -1.0F, 11.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.0423F, 1.2197F, -6.8839F, -1.4448F, 0.3977F, 0.1056F));
		PartDefinition cube_r14 = manta.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(1, 1).addBox(-5.5F, -4.5F, -0.5F, 11.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.4607F, 0.298F, 6.3898F, -1.4011F, -0.3977F, -0.1056F));
		PartDefinition cube_r15 = manta.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-5.5F, -4.5F, -0.5F, 11.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-14.3372F, 0.298F, 6.3898F, -1.4011F, 0.3977F, 0.1056F));
		PartDefinition cube_r16 = manta.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(69, 0).addBox(-6.5F, -1.0F, -11.5F, 13.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6759F, 1.757F, -7.6686F, 0.1745F, 0.3927F, 0.0F));
		PartDefinition cube_r17 = manta.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(169, 87).mirror().addBox(-5.5F, -10.0F, -1.0F, 11.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(21.1658F, 1.2197F, -6.8839F, -1.4448F, -0.3977F, -0.1056F));
		PartDefinition cube_r18 = manta.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-6.5F, -1.0F, -11.5F, 13.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.7994F, 1.757F, -7.6686F, 0.1745F, -0.3927F, 0.0F));
		PartDefinition cube_r19 = manta.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(36, 10).mirror().addBox(-5.5F, -10.0F, -1.0F, 11.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-20.0423F, -1.7421F, -6.8839F, 1.4448F, 0.3977F, -0.1056F));
		PartDefinition cube_r20 = manta.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(128, 39).addBox(-5.5F, -4.5F, -0.5F, 11.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.3372F, -0.8204F, 6.3898F, 1.4011F, 0.3977F, -0.1056F));
		PartDefinition cube_r21 = manta.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(-21, -21).mirror().addBox(-6.5F, -1.0F, -11.5F, 13.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.6759F, -2.2794F, -7.6686F, -0.1745F, 0.3927F, 0.0F));
		PartDefinition cube_r22 = manta.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-6.5F, -2.0F, -1.5F, 13.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.1809F, -2.8394F, -18.5446F, 0.3927F, 0.3927F, 0.0F));
		PartDefinition cube_r23 = manta.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-5.5F, -2.0F, -1.5F, 11.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.362F, -1.4407F, -14.8178F, 1.1393F, 0.3977F, -0.1056F));
		PartDefinition cube_r24 = manta.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(105, 26).mirror().addBox(-15.5F, -5.0F, -0.875F, 31.0F, 10.0F, 1.75F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(25.9626F, -0.2665F, 4.173F, 1.5708F, 0.5236F, 0.0F));
		PartDefinition cube_r25 = manta.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(57, 117).mirror().addBox(-15.5F, -1.5F, -1.075F, 31.0F, 3.0F, 2.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(29.2126F, -0.2665F, 9.8021F, 1.5708F, 0.5236F, 0.0F));
		PartDefinition cube_r26 = manta.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(159, 49).mirror().addBox(-5.5F, -4.0F, -0.875F, 11.0F, 8.0F, 1.75F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-26.4013F, -0.2665F, -7.1213F, 1.5708F, -0.5236F, 0.0F));
		PartDefinition cube_r27 = manta.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(105, 26).addBox(-15.5F, -5.0F, -0.875F, 31.0F, 10.0F, 1.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.8391F, -0.2665F, 4.173F, 1.5708F, -0.5236F, 0.0F));
		PartDefinition cube_r28 = manta.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(57, 117).addBox(-15.5F, -1.5F, -1.075F, 31.0F, 3.0F, 2.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-28.0891F, -0.2665F, 9.8021F, 1.5708F, -0.5236F, 0.0F));
		PartDefinition cube_r29 = manta.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(119, 7).addBox(-11.0F, -1.5F, -1.075F, 22.0F, 3.0F, 2.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-35.9369F, -0.2665F, -5.7723F, 1.5708F, 0.829F, 0.0F));
		PartDefinition cube_r30 = manta.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(126, 91).mirror().addBox(-5.5F, -2.0F, -1.5F, 11.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(24.4856F, 0.9183F, -14.8178F, 2.0023F, -0.3977F, -0.1056F));
		PartDefinition cube_r31 = manta.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(128, 39).mirror().addBox(-5.5F, -4.5F, -0.5F, 11.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(15.4607F, -0.8204F, 6.3898F, 1.4011F, -0.3977F, 0.1056F));
		PartDefinition cube_r32 = manta.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(36, 10).addBox(-5.5F, -10.0F, -1.0F, 11.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.1658F, -1.7421F, -6.8839F, 1.4448F, -0.3977F, 0.1056F));
		PartDefinition cube_r33 = manta.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(-1, -1).addBox(-5.5F, -2.0F, -1.5F, 11.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.4856F, -1.4407F, -14.8178F, 1.1393F, -0.3977F, 0.1056F));
		PartDefinition cube_r34 = manta.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(27, 140).addBox(-0.75F, 0.0F, -0.575F, 1.5F, 0.0F, 1.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.191F, 3.0331F, -22.6311F, 1.7453F, 0.3927F, 0.0F));
		PartDefinition cube_r35 = manta.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(-2, 252).addBox(-1.0F, 0.0F, -0.575F, 2.0F, 0.0F, 1.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.3621F, 1.3835F, -23.6974F, 1.5708F, 0.3927F, 0.0F));
		PartDefinition cube_r36 = manta.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-12.0F, -18.375F, -1.075F, 24.0F, 36.75F, 2.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.493F, -0.2665F, -2.5116F, 1.5708F, 0.3927F, 0.0F));
		PartDefinition cube_r37 = manta.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(128, 58).addBox(-4.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7568F, 2.3085F, -19.0263F, -0.3927F, 0.3927F, 0.0F));
		PartDefinition cube_r38 = manta.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(126, 91).addBox(-5.5F, -2.0F, -1.5F, 11.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.362F, 0.9183F, -14.8178F, 2.0023F, 0.3977F, 0.1056F));
		PartDefinition cube_r39 = manta.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-5.5F, -2.0F, -1.5F, 11.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-13.4405F, 1.4396F, -18.9725F, 1.9635F, 0.3927F, 0.0F));
		PartDefinition cube_r40 = manta.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(119, 13).addBox(-11.0F, -1.5F, -1.075F, 22.0F, 3.0F, 2.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-35.9369F, -0.2665F, -5.7723F, 1.5708F, 0.829F, 0.0F));
		PartDefinition cube_r41 = manta.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 100).addBox(-4.5F, -2.0F, -9.5F, 9.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.6483F, -1.6419F, -10.414F, -0.1745F, 0.3927F, 0.0F));
		PartDefinition cube_r42 = manta.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-6.5F, -2.0F, -1.5F, 13.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.5167F, -1.962F, -19.3552F, 1.1781F, 0.3927F, 0.0F));
		PartDefinition cube_r43 = manta.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(-1, -1).addBox(-5.5F, -2.0F, -1.5F, 11.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.5641F, 1.4396F, -18.9725F, 1.9635F, -0.3927F, 0.0F));
		PartDefinition cube_r44 = manta.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(34, 16).addBox(-6.5F, -2.0F, -1.5F, 13.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.3044F, 2.317F, -18.5446F, -0.3927F, -0.3927F, 0.0F));
		PartDefinition cube_r45 = manta.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(-21, -21).addBox(-6.5F, -1.0F, -11.5F, 13.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.7994F, -2.2794F, -7.6686F, -0.1745F, -0.3927F, 0.0F));
		PartDefinition cube_r46 = manta.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(-1, -1).addBox(-6.5F, -2.0F, -1.5F, 13.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.3044F, -2.8394F, -18.5446F, 0.3927F, -0.3927F, 0.0F));
		PartDefinition cube_r47 = manta.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(-1, -1).addBox(-6.5F, -2.0F, -1.5F, 13.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.6402F, -1.962F, -19.3552F, 1.1781F, -0.3927F, 0.0F));
		PartDefinition cube_r48 = manta.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(159, 49).addBox(-5.5F, -4.0F, -0.875F, 11.0F, 8.0F, 1.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.5248F, -0.2665F, -7.1213F, 1.5708F, 0.5236F, 0.0F));
		PartDefinition cube_r49 = manta.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(119, 7).mirror().addBox(-11.0F, -1.5F, -1.075F, 22.0F, 3.0F, 2.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(37.0605F, -0.2665F, -5.7723F, 1.5708F, -0.829F, 0.0F));
		PartDefinition cube_r50 = manta.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(56, 149).addBox(-11.5F, -1.9F, -0.975F, 23.0F, 3.8F, 1.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9967F, -0.2665F, 37.5132F, 1.5708F, 1.3526F, 0.0F));
		PartDefinition cube_r51 = manta.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(177, 38).addBox(-6.5F, -0.55F, -0.875F, 13.0F, 1.1F, 1.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3795F, -0.2165F, 54.6286F, 1.5708F, 1.4835F, 0.0F));
		PartDefinition cube_r52 = manta.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(64, 64).addBox(-6.5F, -0.8F, -0.975F, 13.0F, 1.6F, 1.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5609F, -0.2165F, 54.6518F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition cube_r53 = manta.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(64, 55).addBox(-6.5F, -2.9F, -1.025F, 13.0F, 5.8F, 2.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5448F, -0.2665F, 33.2703F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition cube_r54 = manta.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(38, 100).addBox(-6.75F, -6.9F, -1.025F, 13.5F, 13.8F, 2.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5448F, -0.2665F, 20.0203F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition cube_r55 = manta.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(47, 160).addBox(-6.0F, -5.875F, -1.075F, 12.0F, 11.75F, 2.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.2986F, -0.2665F, 18.4131F, 1.5708F, 0.6981F, 0.0F));
		PartDefinition cube_r56 = manta.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(-1, -1).addBox(-12.0F, -18.375F, -1.075F, 24.0F, 36.75F, 2.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.6165F, -0.2665F, -2.5116F, 1.5708F, -0.3927F, 0.0F));
		PartDefinition cube_r57 = manta.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 171).addBox(-8.0F, 0.0F, -0.575F, 16.0F, 0.0F, 1.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5618F, 3.0819F, -22.992F, -1.7453F, 0.0F, 0.0F));
		PartDefinition cube_r58 = manta.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 171).addBox(-8.0F, 0.0F, -0.575F, 16.0F, 0.0F, 1.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5618F, 1.3835F, -24.3785F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r59 = manta.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(126, 77).addBox(-8.0F, -1.5F, -1.075F, 16.0F, 3.0F, 2.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5618F, -0.2665F, -22.8785F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r60 = manta.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(121, 120).addBox(-8.0F, -2.0F, -1.5F, 16.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5618F, -1.962F, -21.9567F, 1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r61 = manta.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 40).addBox(-8.0F, -1.0F, -15.55F, 16.0F, 2.0F, 31.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5618F, 2.3873F, -5.0551F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r62 = manta.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(65, 44).addBox(-8.0F, -1.0F, -15.125F, 16.0F, 2.0F, 30.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5618F, -2.2955F, -5.5937F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r63 = manta.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(54, 123).addBox(-8.0F, -0.5F, -0.5F, 16.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5618F, -3.8426F, -22.5771F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r64 = manta.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 124).addBox(-8.0F, -2.0F, -1.425F, 16.0F, 4.0F, 2.85F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5618F, 2.3457F, -21.0099F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		manta.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
