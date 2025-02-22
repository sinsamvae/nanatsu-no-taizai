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
public class Modelgear_spirit_spear_rm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelgear_spirit_spear_rm"), "main");
	public final ModelPart bone;

	public Modelgear_spirit_spear_rm(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(1, 1).addBox(-0.8012F, 2.4916F, -0.8359F, 1.6F, 15.6F, 1.6F, new CubeDeformation(-0.2F)).texOffs(18, 0).addBox(-0.8312F, 1.2616F, -0.8659F, 1.66F, 1.66F, 1.66F, new CubeDeformation(-0.17F))
						.texOffs(9, 10).addBox(-0.8712F, -0.0184F, -0.9059F, 1.74F, 1.74F, 1.74F, new CubeDeformation(-0.13F)).texOffs(18, 20).addBox(-0.8012F, -6.7484F, -0.8359F, 1.6F, 1.6F, 1.6F, new CubeDeformation(-0.2F)).texOffs(18, 25)
						.addBox(-0.7512F, -7.6984F, -0.7859F, 1.5F, 1.5F, 1.5F, new CubeDeformation(-0.25F)).texOffs(9, 5).addBox(-0.8712F, -2.9184F, -0.9059F, 1.74F, 1.74F, 1.74F, new CubeDeformation(-0.13F)).texOffs(18, 5)
						.addBox(-0.8212F, -4.2484F, -0.8559F, 1.64F, 1.64F, 1.64F, new CubeDeformation(-0.18F)).texOffs(18, 10).addBox(-0.8112F, -4.2384F, -1.0459F, 1.62F, 1.62F, 1.62F, new CubeDeformation(-0.19F)).texOffs(9, 20)
						.addBox(-0.8012F, -4.2284F, -1.0359F, 1.6F, 1.6F, 1.6F, new CubeDeformation(-0.2F)).texOffs(18, 15).addBox(-0.8012F, -4.2284F, -0.6359F, 1.6F, 1.6F, 1.6F, new CubeDeformation(-0.2F)).texOffs(9, 15)
						.addBox(-0.8512F, -5.5584F, -0.8859F, 1.7F, 1.7F, 1.7F, new CubeDeformation(-0.15F)).texOffs(9, 0).addBox(-0.9112F, -1.4384F, -0.9459F, 1.82F, 1.82F, 1.82F, new CubeDeformation(-0.09F)).texOffs(16, 0)
						.addBox(-0.5012F, 17.5916F, -0.2348F, 1.0F, 0.6F, 0.3978F, new CubeDeformation(0.0F)).texOffs(16, 15).addBox(-0.5012F, 18.9916F, -0.2348F, 1.0F, 0.6F, 0.3978F, new CubeDeformation(0.0F)).texOffs(25, 39)
						.addBox(-0.5012F, 18.3927F, 0.3641F, 1.0F, 0.3978F, 0.6F, new CubeDeformation(0.0F)).texOffs(39, 38).addBox(-0.5012F, 18.3927F, -1.0359F, 1.0F, 0.3978F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9994F, 19.8542F, 0.0179F, 0.0F, -1.5708F, -3.1416F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 30).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.6F, new CubeDeformation(0.0F)).texOffs(39, 32).addBox(-0.5F, -0.1989F, 0.4F, 1.0F, 0.3978F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0012F, 18.5916F, -0.0359F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(40, 22).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.6F, new CubeDeformation(0.0F)).texOffs(30, 39).addBox(-0.5F, -0.1989F, 0.4F, 1.0F, 0.3978F, 0.6F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-0.5F, 0.4F, -0.1989F, 1.0F, 0.6F, 0.3978F, new CubeDeformation(0.0F)).texOffs(16, 5).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.6F, 0.3978F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0012F, 18.5916F, -0.0359F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(39, 35).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.6F, new CubeDeformation(0.0F)).texOffs(39, 20).addBox(-0.5F, -0.1989F, 0.4F, 1.0F, 0.3978F, 0.6F, new CubeDeformation(0.0F)).texOffs(16, 10)
						.addBox(-0.5F, 0.4F, -0.1989F, 1.0F, 0.6F, 0.3978F, new CubeDeformation(0.0F)).texOffs(7, 0).addBox(-0.5F, -1.0F, -0.1989F, 1.0F, 0.6F, 0.3978F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0012F, 18.5916F, -0.0359F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(35, 39).addBox(-0.5F, -0.1989F, -1.0F, 1.0F, 0.3978F, 0.6F, new CubeDeformation(0.0F)).texOffs(20, 39).addBox(-0.5F, -0.1989F, 0.4F, 1.0F, 0.3978F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0012F, 18.5916F, -0.0359F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 17).addBox(-0.48F, -0.3024F, -0.6423F, 1.06F, 1.06F, 1.06F, new CubeDeformation(-0.47F)),
				PartPose.offsetAndRotation(0.0388F, -1.5372F, -1.3887F, 1.4137F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 13).addBox(-0.5F, -0.3224F, -0.6623F, 1.1F, 1.1F, 1.1F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-0.0012F, -1.6018F, -1.5405F, 1.4137F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(37, 27).addBox(-0.54F, -0.4347F, -0.6254F, 1.14F, 1.14F, 1.14F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.0212F, -1.6726F, -1.6016F, 1.0908F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 0).addBox(-0.63F, -0.7457F, -0.5878F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0212F, -1.6726F, -1.6016F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(38, 3).addBox(-0.57F, -0.933F, -0.5619F, 1.14F, 1.14F, 1.14F, new CubeDeformation(-0.43F)).texOffs(35, 33).addBox(-0.6F, -0.636F, -0.5527F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0012F, -5.2393F, 0.819F, -2.0944F, 0.0F, 0.0F));
		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 33).addBox(-0.65F, -0.5186F, -0.9884F, 1.3F, 1.3F, 1.3F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.0012F, -5.2393F, 0.819F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(5, 38).addBox(-0.57F, -0.9147F, -0.4936F, 1.14F, 1.14F, 1.14F, new CubeDeformation(-0.43F)).texOffs(20, 36).addBox(-0.6F, -0.6177F, -0.4844F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0012F, -3.0388F, -1.3013F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(5, 32).addBox(-0.65F, -0.5887F, -0.9977F, 1.3F, 1.3F, 1.3F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.0012F, -3.1388F, -1.2013F, 2.2253F, 0.0F, 0.0F));
		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(31, 24).addBox(-0.65F, -0.2742F, -1.0342F, 1.3F, 1.3F, 1.3F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.0012F, -2.2182F, -1.6593F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 30).addBox(-0.7F, -0.587F, -0.8444F, 1.4F, 1.4F, 1.4F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.0012F, -2.2182F, -1.6593F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 36).addBox(-0.57F, -0.57F, -0.57F, 1.14F, 1.14F, 1.14F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.0012F, -4.7503F, 1.8065F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(5, 35).addBox(-0.6F, -0.6F, -0.6F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0012F, -4.4538F, 1.8587F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(39, 9).addBox(-0.55F, -0.55F, -0.55F, 1.1F, 1.1F, 1.1F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-0.0012F, -2.795F, 1.4376F, -0.8988F, 0.0F, 0.0F));
		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 36).addBox(-0.62F, -0.4459F, -0.5093F, 1.14F, 1.14F, 1.14F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(0.0488F, -3.1005F, 1.6599F, -0.8988F, 0.0F, 0.0F));
		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(34, 18).addBox(-0.55F, -0.7379F, -0.6085F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0512F, -3.1005F, 1.6599F, -0.5061F, 0.0F, 0.0F));
		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 35).addBox(-0.6F, -0.7504F, -0.5935F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0012F, -3.4094F, 1.8072F, -0.288F, 0.0F, 0.0F));
		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(35, 36).addBox(-0.57F, -0.57F, -0.57F, 1.14F, 1.14F, 1.14F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.0012F, -5.0546F, 1.0906F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(20, 33).addBox(-0.64F, -0.64F, -0.64F, 1.28F, 1.28F, 1.28F, new CubeDeformation(-0.36F)),
				PartPose.offsetAndRotation(-0.0012F, -6.445F, 1.28F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(10, 36).addBox(-0.6F, -0.6F, -0.6F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0012F, -6.1322F, 1.5583F, -1.1345F, 0.0F, 0.0F));
		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(30, 21).addBox(-0.68F, -0.9134F, -0.7075F, 1.36F, 1.36F, 1.36F, new CubeDeformation(-0.32F)),
				PartPose.offsetAndRotation(-0.0012F, -6.5566F, 0.8253F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(27, 27).addBox(-0.7F, -0.7F, -0.7F, 1.4F, 1.4F, 1.4F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.0012F, -6.2957F, 0.3985F, -0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(26, 24).addBox(-0.72F, -0.72F, -0.72F, 1.44F, 1.44F, 1.44F, new CubeDeformation(-0.28F)),
				PartPose.offsetAndRotation(-0.0012F, -7.4698F, 0.3005F, -1.0996F, 0.0F, 0.0F));
		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(26, 14).addBox(-0.73F, -1.1181F, -1.3369F, 1.46F, 1.46F, 1.46F, new CubeDeformation(-0.27F)),
				PartPose.offsetAndRotation(-0.0012F, -6.2566F, 1.1253F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 38).addBox(-0.57F, -0.57F, -0.57F, 1.14F, 1.14F, 1.14F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.0012F, -0.4946F, 1.3306F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(35, 30).addBox(-0.6F, -0.6F, -0.6F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0012F, -0.7912F, 1.3828F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(36, 24).addBox(-0.57F, -0.57F, -0.57F, 1.14F, 1.14F, 1.14F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.0012F, -3.0265F, -2.4183F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(35, 11).addBox(-0.6F, -0.6F, -0.6F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0012F, -2.6972F, -2.4144F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(27, 9).addBox(-0.75F, -0.5389F, -0.2558F, 1.5F, 1.5F, 1.5F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.0012F, -2.3623F, -1.6323F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(32, 27).addBox(-0.65F, -0.2742F, -0.2658F, 1.3F, 1.3F, 1.3F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.0012F, -3.6915F, 1.4238F, 1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(5, 29).addBox(-0.7F, -0.587F, -0.5556F, 1.4F, 1.4F, 1.4F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.0012F, -3.7623F, 1.3605F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(27, 0).addBox(-0.75F, -0.5389F, -1.2442F, 1.5F, 1.5F, 1.5F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.0012F, -3.7623F, 1.3605F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 32).addBox(-0.65F, -1.0258F, -0.2658F, 1.3F, 1.3F, 1.3F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.0012F, -1.6545F, 1.1605F, -1.7453F, 0.0F, 0.0F));
		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(10, 30).addBox(-0.7F, -0.813F, -0.5556F, 1.4F, 1.4F, 1.4F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.0012F, -1.6545F, 1.1605F, -0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(27, 5).addBox(-0.75F, -0.9611F, -1.2442F, 1.5F, 1.5F, 1.5F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.0012F, -1.6545F, 1.1605F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(15, 39).addBox(-0.5F, 0.1673F, -1.3563F, 1.1F, 1.1F, 1.1F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-0.0512F, -5.8688F, -0.7323F, -1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(15, 36).addBox(-0.65F, -0.0819F, -1.207F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0488F, -5.8688F, -0.7323F, -1.3963F, 0.0F, 0.0F));
		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(25, 33).addBox(-0.69F, -0.487F, -1.0292F, 1.28F, 1.28F, 1.28F, new CubeDeformation(-0.36F)),
				PartPose.offsetAndRotation(0.0488F, -5.8688F, -0.7323F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(31, 13).addBox(-0.72F, -0.6902F, -0.5912F, 1.34F, 1.34F, 1.34F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(0.0488F, -5.8688F, -0.7323F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(10, 39).addBox(-0.5F, 0.1673F, -1.3563F, 1.1F, 1.1F, 1.1F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-0.0512F, -4.6688F, -1.2323F, -1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(34, 8).addBox(-0.65F, -0.0819F, -1.207F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0488F, -4.6688F, -1.2323F, -1.3963F, 0.0F, 0.0F));
		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(15, 33).addBox(-0.69F, -0.487F, -1.0292F, 1.28F, 1.28F, 1.28F, new CubeDeformation(-0.36F)),
				PartPose.offsetAndRotation(0.0488F, -4.6688F, -1.2323F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(25, 30).addBox(-0.72F, -1.1117F, 0.3147F, 1.34F, 1.34F, 1.34F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(0.0488F, -4.6688F, -1.2323F, -1.2217F, 0.0F, 0.0F));
		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(30, 30).addBox(-0.72F, -0.6902F, -0.5912F, 1.34F, 1.34F, 1.34F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(0.0488F, -4.6688F, -1.2323F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 29).addBox(-0.75F, -0.801F, 0.0108F, 1.4F, 1.4F, 1.4F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0488F, -4.6688F, -1.2323F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(35, 15).addBox(-0.6F, -0.6F, -0.6F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0012F, -7.6343F, 1.1962F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(34, 5).addBox(-0.63F, -0.63F, -0.63F, 1.26F, 1.26F, 1.26F, new CubeDeformation(-0.37F)),
				PartPose.offsetAndRotation(-0.0012F, -7.9146F, 1.0306F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(30, 16).addBox(-0.68F, -0.68F, -0.68F, 1.36F, 1.36F, 1.36F, new CubeDeformation(-0.32F)),
				PartPose.offsetAndRotation(-0.0012F, -8.1875F, 0.7325F, 0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(39, 6).addBox(-0.56F, -0.56F, -0.56F, 1.12F, 1.12F, 1.12F, new CubeDeformation(-0.44F)),
				PartPose.offsetAndRotation(-0.0012F, -10.3844F, -0.1318F, 0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(35, 21).addBox(-0.6F, -0.6F, -0.6F, 1.2F, 1.2F, 1.2F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0012F, -10.1671F, 0.0117F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(30, 33).addBox(-0.63F, -0.63F, -0.63F, 1.26F, 1.26F, 1.26F, new CubeDeformation(-0.37F)),
				PartPose.offsetAndRotation(-0.0012F, -9.8958F, 0.1314F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(20, 30).addBox(-0.68F, -0.68F, -0.68F, 1.36F, 1.36F, 1.36F, new CubeDeformation(-0.32F)),
				PartPose.offsetAndRotation(-0.0012F, -9.5047F, 0.2178F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(26, 19).addBox(-0.73F, -0.73F, -0.73F, 1.46F, 1.46F, 1.46F, new CubeDeformation(-0.27F)),
				PartPose.offsetAndRotation(-0.0012F, -8.9945F, 0.2365F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(9, 25).addBox(-0.76F, -0.76F, -0.76F, 1.52F, 1.52F, 1.52F, new CubeDeformation(-0.24F)),
				PartPose.offsetAndRotation(-0.0012F, -8.4446F, 0.0637F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 24).addBox(-0.79F, -0.79F, -0.79F, 1.58F, 1.58F, 1.58F, new CubeDeformation(-0.21F)),
				PartPose.offsetAndRotation(-0.0012F, -6.8883F, -0.1825F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 19).addBox(-0.8F, -0.39F, -0.8F, 1.6F, 1.6F, 1.6F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.0012F, -8.0584F, -0.1359F, -0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
