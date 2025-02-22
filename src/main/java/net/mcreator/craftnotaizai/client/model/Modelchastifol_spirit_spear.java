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
public class Modelchastifol_spirit_spear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelchastifol_spirit_spear"), "main");
	public final ModelPart bone;

	public Modelchastifol_spirit_spear(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(0, 22).addBox(-1.0F, -6.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.17F)).texOffs(18, 21)
						.addBox(-1.0F, -7.22F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)).texOffs(8, 15).addBox(-1.0F, -10.62F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(15, 0)
						.addBox(-1.0F, -11.12F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(13, 20).addBox(-1.0F, -8.67F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)).texOffs(5, 20)
						.addBox(-1.0F, -9.36F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)).texOffs(0, 15).addBox(-1.0F, -9.36F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).texOffs(12, 13)
						.addBox(-1.0F, -9.36F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(13, 10).addBox(-1.0F, -9.36F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(4, 17)
						.addBox(-1.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(21, 10).addBox(-1.0F, -7.91F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).texOffs(5, 23)
						.addBox(-0.75F, 1.65F, -0.5995F, 0.5F, 0.3F, 0.1989F, new CubeDeformation(0.0F)).texOffs(14, 19).addBox(-0.75F, 2.35F, -0.5995F, 0.5F, 0.3F, 0.1989F, new CubeDeformation(0.0F)).texOffs(10, 7)
						.addBox(-0.75F, 2.0505F, -0.3F, 0.5F, 0.1989F, 0.3F, new CubeDeformation(0.0F)).texOffs(5, 16).addBox(-0.75F, 2.0505F, -1.0F, 0.5F, 0.1989F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 21.0F, 0.5F, 1.5708F, 1.5708F, -3.1416F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(18, 11).addBox(-0.25F, -0.0995F, -0.5F, 0.5F, 0.1989F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(-0.25F, -0.0995F, 0.2F, 0.5F, 0.1989F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 2.15F, -0.5F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 18).addBox(-0.25F, -0.0995F, -0.5F, 0.5F, 0.1989F, 0.3F, new CubeDeformation(0.0F)).texOffs(5, 12).addBox(-0.25F, -0.0995F, 0.2F, 0.5F, 0.1989F, 0.3F, new CubeDeformation(0.0F)).texOffs(20, 4)
						.addBox(-0.25F, 0.2F, -0.0995F, 0.5F, 0.3F, 0.1989F, new CubeDeformation(0.0F)).texOffs(23, 16).addBox(-0.25F, -0.5F, -0.0995F, 0.5F, 0.3F, 0.1989F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 2.15F, -0.5F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(14, 9).addBox(-0.25F, -0.0995F, -0.5F, 0.5F, 0.1989F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-0.25F, -0.0995F, 0.2F, 0.5F, 0.1989F, 0.3F, new CubeDeformation(0.0F)).texOffs(19, 3)
						.addBox(-0.25F, 0.2F, -0.0995F, 0.5F, 0.3F, 0.1989F, new CubeDeformation(0.0F)).texOffs(10, 21).addBox(-0.25F, -0.5F, -0.0995F, 0.5F, 0.3F, 0.1989F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 2.15F, -0.5F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(9, 14).addBox(-0.25F, -0.0995F, -0.5F, 0.5F, 0.1989F, 0.3F, new CubeDeformation(0.0F)).texOffs(9, 6).addBox(-0.25F, -0.0995F, 0.2F, 0.5F, 0.1989F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 2.15F, -0.5F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(27, 22).addBox(-0.475F, -0.3862F, -0.5562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.47F)),
				PartPose.offsetAndRotation(-0.48F, -7.9144F, -1.1764F, 1.4137F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 28).addBox(-0.475F, -0.3862F, -0.5562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-0.5F, -7.9467F, -1.2523F, 1.4137F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(5, 27).addBox(-0.485F, -0.4323F, -0.5277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.51F, -7.9821F, -1.2829F, 1.0908F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 8).addBox(-0.515F, -0.5729F, -0.4939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.51F, -7.9821F, -1.2829F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.6815F, -0.4959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)).texOffs(27, 18).addBox(-0.5F, -0.518F, -0.4764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5F, -9.7654F, -0.0726F, -2.0944F, 0.0F, 0.0F));
		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 5).addBox(-0.5F, -0.4343F, -0.6692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.5F, -9.7654F, -0.0726F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(27, 5).addBox(-0.5F, -0.6723F, -0.4618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)).texOffs(28, 25).addBox(-0.5F, -0.5089F, -0.4422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5F, -8.6652F, -1.1327F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(27, 31).addBox(-0.5F, -0.4694F, -0.6738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.5F, -8.7152F, -1.0827F, 2.2253F, 0.0F, 0.0F));
		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(31, 15).addBox(-0.5F, -0.3121F, -0.6921F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.5F, -8.2549F, -1.3117F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(30, 12).addBox(-0.5F, -0.4435F, -0.5722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.5F, -8.2549F, -1.3117F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(18, 15).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.5F, -9.521F, 0.4212F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5F, -9.3727F, 0.4473F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(4, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-0.5F, -8.5433F, 0.2367F, -0.8988F, 0.0F, 0.0F));
		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(9, 8).addBox(-0.525F, -0.4379F, -0.4697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.475F, -8.696F, 0.3479F, -0.8988F, 0.0F, 0.0F));
		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(17, 12).addBox(-0.475F, -0.5689F, -0.5043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.525F, -8.696F, 0.3479F, -0.5061F, 0.0F, 0.0F));
		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(9, 18).addBox(-0.5F, -0.5752F, -0.4967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5F, -8.8505F, 0.4215F, -0.288F, 0.0F, 0.0F));
		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(18, 25).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.5F, -9.6731F, 0.0632F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(9, 25).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.36F)),
				PartPose.offsetAndRotation(-0.5F, -10.3683F, 0.1579F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(27, 28).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5F, -10.2119F, 0.2971F, -1.1345F, 0.0F, 0.0F));
		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.6167F, -0.5137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)),
				PartPose.offsetAndRotation(-0.5F, -10.4241F, -0.0694F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(22, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.5F, -10.2936F, -0.2828F, -0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.28F)),
				PartPose.offsetAndRotation(-0.5F, -10.8807F, -0.3318F, -1.0996F, 0.0F, 0.0F));
		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(23, 20).addBox(-0.5F, -0.6941F, -0.8035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.27F)),
				PartPose.offsetAndRotation(-0.5F, -10.2741F, 0.0806F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.5F, -7.3931F, 0.1832F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5F, -7.5414F, 0.2093F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(17, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.5F, -8.659F, -1.6912F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5F, -8.4944F, -1.6893F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(19, 5).addBox(-0.5F, -0.3944F, -0.2529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.5F, -8.327F, -1.2982F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(31, 20).addBox(-0.5F, -0.3121F, -0.3079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.5F, -8.9915F, 0.2298F, 1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(14, 30).addBox(-0.5F, -0.4435F, -0.4278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.5F, -9.027F, 0.1982F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -0.3944F, -0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.5F, -9.027F, 0.1982F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(22, 30).addBox(-0.5F, -0.6879F, -0.3079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.5F, -7.973F, 0.0982F, -1.7453F, 0.0F, 0.0F));
		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(4, 31).addBox(-0.5F, -0.5565F, -0.4278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.5F, -7.973F, 0.0982F, -0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(4, 24).addBox(-0.5F, -0.6056F, -0.7471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.5F, -7.973F, 0.0982F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(9, 29).addBox(-0.475F, -0.1413F, -0.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-0.525F, -10.0802F, -0.8482F, -1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(29, 2).addBox(-0.525F, -0.2409F, -0.8035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.475F, -10.0802F, -0.8482F, -1.3963F, 0.0F, 0.0F));
		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(26, 10).addBox(-0.525F, -0.4235F, -0.6946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.36F)),
				PartPose.offsetAndRotation(-0.475F, -10.0802F, -0.8482F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(15, 3).addBox(-0.525F, -0.5101F, -0.4606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(-0.475F, -10.0802F, -0.8482F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(13, 16).addBox(-0.475F, -0.1413F, -0.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-0.525F, -9.4802F, -1.0982F, -1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(26, 15).addBox(-0.525F, -0.2409F, -0.8035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.475F, -9.4802F, -1.0982F, -1.3963F, 0.0F, 0.0F));
		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(5, 3).addBox(-0.525F, -0.4235F, -0.6946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.36F)),
				PartPose.offsetAndRotation(-0.475F, -9.4802F, -1.0982F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(5, 0).addBox(-0.525F, -0.7208F, -0.0076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(-0.475F, -9.4802F, -1.0982F, -1.2217F, 0.0F, 0.0F));
		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(5, 6).addBox(-0.525F, -0.5101F, -0.4606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(-0.475F, -9.4802F, -1.0982F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(23, 26).addBox(-0.525F, -0.5505F, -0.1446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.475F, -9.4802F, -1.0982F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(10, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5F, -10.963F, 0.116F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F)),
				PartPose.offsetAndRotation(-0.5F, -11.1031F, 0.0332F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(14, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)),
				PartPose.offsetAndRotation(-0.5F, -11.2396F, -0.1158F, 0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(9, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.44F)),
				PartPose.offsetAndRotation(-0.5F, -12.338F, -0.548F, 0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(22, 13).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5F, -12.2294F, -0.4762F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(22, 17).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F)),
				PartPose.offsetAndRotation(-0.5F, -12.0937F, -0.4163F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(23, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)),
				PartPose.offsetAndRotation(-0.5F, -11.8981F, -0.3731F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(23, 7).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.27F)),
				PartPose.offsetAndRotation(-0.5F, -11.643F, -0.3638F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(4, 13).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.24F)),
				PartPose.offsetAndRotation(-0.5F, -11.3681F, -0.4502F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(8, 11).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)),
				PartPose.offsetAndRotation(-0.5F, -10.59F, -0.5733F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(13, 6).addBox(-0.5F, -0.295F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.5F, -11.175F, -0.55F, -0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
