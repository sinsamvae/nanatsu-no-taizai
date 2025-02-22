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
public class Modelthrowingknives<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelthrowingknives"), "main");
	public final ModelPart throwingknives;

	public Modelthrowingknives(ModelPart root) {
		this.throwingknives = root.getChild("throwingknives");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition throwingknives = partdefinition.addOrReplaceChild("throwingknives", CubeListBuilder.create(), PartPose.offset(-0.025F, 9.1708F, 1.5962F));
		PartDefinition group2 = throwingknives.addOrReplaceChild("group2",
				CubeListBuilder.create().texOffs(17, 22).addBox(-0.25F, -0.559F, -5.75F, 0.55F, 0.65F, 0.5F, new CubeDeformation(0.0F)).texOffs(5, 18).addBox(-0.3F, -1.9795F, -6.1462F, 0.65F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = group2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 21).addBox(-0.3F, -0.25F, -0.55F, 0.6F, 0.5F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, 0.291F, -5.65F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = group2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 2).addBox(-0.3F, -0.25F, -0.55F, 0.6F, 0.5F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, -0.75F, -5.65F, -0.3927F, 0.0F, 0.0F));
		PartDefinition group3 = throwingknives.addOrReplaceChild("group3", CubeListBuilder.create().texOffs(17, 20).addBox(-0.275F, -2.2773F, -6.1435F, 0.6F, 0.5F, 1.1F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r3 = group3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 15).addBox(-0.275F, -0.325F, -0.25F, 0.55F, 0.65F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, -2.455F, -5.254F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r4 = group3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 0).addBox(-0.3F, -0.55F, -0.25F, 0.6F, 1.1F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, -2.9891F, -5.1951F, 0.7854F, 0.0F, 0.0F));
		PartDefinition group4 = throwingknives.addOrReplaceChild("group4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = group4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 18).addBox(-0.325F, -0.5F, -0.5F, 0.65F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, -3.424F, -4.7623F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r6 = group4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 8).addBox(-0.275F, -0.325F, -0.375F, 0.55F, 0.65F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, -4.0669F, -3.6967F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r7 = group4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 6).addBox(-0.3F, -0.25F, -0.55F, 0.6F, 0.5F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, -3.8902F, -4.2623F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r8 = group4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 21).addBox(-0.3F, -0.55F, -0.25F, 0.6F, 1.1F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, -4.6263F, -3.5262F, 0.3927F, 0.0F, 0.0F));
		PartDefinition group5 = throwingknives.addOrReplaceChild("group5", CubeListBuilder.create().texOffs(10, 18).addBox(-0.275F, -6.0074F, -1.6634F, 0.6F, 1.1F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r9 = group5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(17, 8).addBox(-0.325F, -0.5F, -0.5F, 0.65F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, -4.978F, -2.9706F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r10 = group5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 4).addBox(-0.275F, -0.25F, -0.325F, 0.55F, 0.5F, 0.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, -5.1213F, -1.8327F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r11 = group5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(5, 0).addBox(-0.3F, -0.25F, -0.55F, 0.6F, 0.5F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, -5.059F, -2.3752F, -0.7854F, 0.0F, 0.0F));
		PartDefinition group = throwingknives.addOrReplaceChild(
				"group", CubeListBuilder.create().texOffs(12, 4).addBox(-0.3F, 1.5226F, -5.4044F, 0.6F, 1.25F, 1.85F, new CubeDeformation(0.0F)).texOffs(7, 11).addBox(-0.3F, 2.5226F, -5.4044F, 0.6F, 1.25F, 1.85F, new CubeDeformation(0.0F))
						.texOffs(12, 13).addBox(-0.3F, 3.5226F, -5.6544F, 0.6F, 1.25F, 1.6F, new CubeDeformation(0.0F)).texOffs(21, 21).addBox(-0.3F, 4.5226F, -5.4044F, 0.6F, 1.0F, 0.85F, new CubeDeformation(0.0F)),
				PartPose.offset(0.025F, -3.7268F, -0.0747F));
		PartDefinition cube_r12 = group.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 0).addBox(-0.3F, -0.3135F, -0.6843F, 0.6F, 0.6F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.4936F, -0.7291F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r13 = group.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(17, 3).addBox(-0.3F, -0.3135F, -0.7873F, 0.6F, 0.6F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0242F, 0.521F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r14 = group.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 9).addBox(-0.3F, -0.3412F, -0.9795F, 0.6F, 0.6F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3471F, 1.6724F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r15 = group.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 14).addBox(-0.3F, -0.3F, -0.875F, 0.6F, 0.6F, 1.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.9973F, 1.5997F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r16 = group.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 10).addBox(-0.3F, -0.3F, -1.125F, 0.6F, 0.6F, 2.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.7627F, -0.248F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r17 = group.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(7, 15).addBox(-0.3F, -5.375F, 0.2F, 0.6F, 0.5F, 1.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.1476F, -3.1902F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r18 = group.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 0).addBox(-0.3F, -0.5F, -1.05F, 0.6F, 1.0F, 2.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.946F, -0.0966F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r19 = group.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(5, 3).addBox(-0.3F, -0.625F, -1.05F, 0.6F, 1.25F, 2.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6809F, -0.7153F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r20 = group.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(7, 7).addBox(-0.3F, -0.625F, -1.05F, 0.6F, 1.25F, 2.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1505F, -1.9528F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r21 = group.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 5).addBox(-0.3F, -0.875F, -1.05F, 0.6F, 1.75F, 2.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4405F, -3.8973F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r22 = group.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3F, -1.0F, -1.05F, 0.6F, 2.0F, 2.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.4682F, -2.925F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r23 = group.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(9, 20).addBox(-0.3F, -1.0F, -0.3F, 0.6F, 2.0F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3521F, -2.0411F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r24 = group.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(4, 22).addBox(-0.3F, -0.625F, -0.3F, 0.6F, 1.25F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.3243F, -3.0134F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r25 = group.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(18, 16).addBox(-0.3F, -1.125F, -0.3F, 0.6F, 2.25F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.5334F, -3.7642F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r26 = group.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(13, 17).addBox(-0.3F, -1.25F, -0.3F, 0.6F, 2.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.4966F, -4.5774F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r27 = group.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(19, 11).addBox(-0.3F, -1.125F, -0.3F, 0.6F, 2.25F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.3838F, -5.2801F, 0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		throwingknives.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
