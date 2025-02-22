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
public class ModelHellFire5<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "model_hell_fire_5"), "main");
	public final ModelPart bone;

	public ModelHellFire5(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(50, 89).addBox(-3.4693F, 5.687F, -1.4034F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)).texOffs(50, 89).addBox(-3.4693F, 5.687F, -0.3834F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F))
						.texOffs(50, 89).addBox(-4.6693F, 5.687F, -1.4034F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)).texOffs(50, 89).addBox(-4.6693F, 5.687F, -0.3834F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)).texOffs(50, 89)
						.addBox(2.5307F, 4.8049F, 0.7145F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)).texOffs(50, 89).addBox(2.5307F, 4.8049F, -0.3055F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)).texOffs(50, 89)
						.addBox(1.3307F, 4.8049F, -0.3055F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)).texOffs(50, 89).addBox(1.3307F, 4.8049F, 0.7145F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(-2.0907F, 17.234F, 3.4579F, 1.5708F, 1.5708F, -3.1416F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 24).addBox(-4.3045F, -1.174F, -0.9045F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(19.2713F, -2.5313F, -2.8853F, -0.7333F, -0.639F, 0.493F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(75, 13).addBox(-0.9682F, -1.174F, -0.931F, 8.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(10.9548F, -5.4732F, -7.5031F, -0.6229F, -0.4F, 0.2727F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 24).addBox(-2.5635F, -1.174F, -0.8565F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(10.1744F, -4.6545F, -6.218F, -1.0299F, 0.8934F, -0.914F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 24).addBox(-4.1435F, -1.174F, -0.9365F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(9.2559F, -3.7248F, -4.7587F, -0.6037F, 0.3286F, -0.219F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 24).addBox(-2.7444F, -1.174F, -0.9409F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(21.2663F, -2.1049F, -2.2159F, -0.5889F, -0.2564F, 0.1678F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 24).addBox(-2.7F, -1.9039F, -1.5147F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(4.2907F, -2.1135F, -3.5881F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(34, 0).addBox(-9.0F, 0.77F, -5.067F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.7731F, -3.2703F, -3.1917F, -0.6037F, -0.3286F, 0.219F));
		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 24).addBox(-1.2565F, -1.174F, -0.9365F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-9.0744F, -3.4748F, -4.7587F, -0.6037F, -0.3286F, 0.219F));
		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 24).addBox(-2.8365F, -1.174F, -0.8565F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-9.9929F, -4.4045F, -6.218F, -1.0299F, -0.8934F, 0.914F));
		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(75, 13).addBox(-7.4318F, -1.174F, -0.931F, 8.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-10.7734F, -5.2232F, -7.5031F, -0.6229F, 0.4F, -0.2727F));
		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0955F, -1.174F, -0.9045F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-19.0898F, -2.2813F, -2.8853F, -0.7333F, 0.639F, -0.493F));
		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 24).addBox(-2.6556F, -1.174F, -0.9409F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-21.0849F, -1.8549F, -2.2159F, -0.5889F, 0.2564F, -0.1678F));
		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 16).addBox(-3.0F, 0.77F, -5.067F, 6.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.8298F, -1.2866F, -0.2052F, -0.6037F, -0.3286F, 0.219F));
		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(37, 29).addBox(-3.0F, 0.77F, -5.067F, 6.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9093F, -0.9488F, 0.569F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 24).addBox(-2.7F, -1.9039F, -1.5147F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-4.1093F, -1.8635F, -3.5881F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 67).addBox(0.7856F, -3.5918F, -4.6419F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0907F, -2.1722F, -8.9687F, 0.3731F, 0.7742F, 0.2633F));
		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(62, 29).addBox(-0.412F, -4.0414F, -3.1581F, 4.0F, 4.0F, 7.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(2.1572F, -4.0814F, -4.3595F, 0.4215F, 0.3614F, 0.1572F));
		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(62, 42).addBox(-0.412F, -4.0414F, -3.1581F, 4.0F, 4.0F, 7.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0907F, -2.1722F, -8.9687F, 0.4215F, 0.3614F, 0.1572F));
		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(81, 37).addBox(-2.2F, -4.0414F, -1.8895F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0907F, -2.1722F, -8.9687F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(59, 55).addBox(-3.988F, -4.0414F, -3.1581F, 4.0F, 4.0F, 7.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(-1.9757F, -4.0814F, -4.3595F, 0.4215F, -0.3614F, -0.1572F));
		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(62, 42).addBox(-3.988F, -4.0414F, -3.1581F, 4.0F, 4.0F, 7.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0907F, -2.1722F, -8.9687F, 0.4215F, -0.3614F, -0.1572F));
		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(81, 50).addBox(-0.0459F, -2.2744F, -4.0421F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0907F, -2.1722F, -8.9687F, -0.0472F, 0.3923F, -0.0181F));
		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 82).addBox(-4.3541F, -2.2744F, -4.0421F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0907F, -2.1722F, -8.9687F, -0.0472F, -0.3923F, 0.0181F));
		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(25, 45).addBox(-3.7F, -2.2744F, -2.8463F, 7.0F, 4.0F, 4.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0907F, -2.1722F, -8.9687F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, 0.6634F, 7.2874F, 9.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0907F, -5.2611F, 8.573F, 0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.5F, 3.0531F, 2.8121F, 9.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(76, 19).addBox(-1.6F, 1.3167F, 1.8372F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0907F, -5.2611F, 8.573F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(28, 55).addBox(-3.0F, -1.884F, -7.3938F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0907F, -5.2611F, 8.573F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(59, 13).addBox(-2.2F, 1.1049F, -17.9977F, 4.0F, 4.0F, 7.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0907F, -5.2611F, 8.573F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(18, 63).addBox(0.9032F, -7.1351F, 2.5732F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0907F, -5.2611F, 8.573F, -0.0297F, -0.3084F, 1.3634F));
		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(66, 70).addBox(-0.8734F, -7.1642F, 2.8197F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0907F, -5.2611F, 8.573F, -0.0297F, 0.3084F, -1.3634F));
		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(71, 0).addBox(-2.3F, -1.1985F, -1.0603F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.15F)).texOffs(0, 58).addBox(-2.4F, 1.8499F, -12.6244F, 5.0F, 5.0F, 8.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0907F, -5.2611F, 8.573F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 45).addBox(-3.0F, 0.77F, -5.067F, 6.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0907F, -1.1988F, 0.569F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(37, 42).addBox(-3.0F, 0.77F, -5.067F, 6.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0113F, -1.5366F, -0.2052F, -0.6037F, 0.3286F, -0.219F));
		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, 0.77F, -5.067F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.9546F, -3.5203F, -3.1917F, -0.6037F, 0.3286F, -0.219F));
		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(50, 89).addBox(-1.16F, -2.1549F, -2.4355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)).texOffs(50, 89).addBox(0.04F, -2.1549F, -2.4355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(2.4907F, 6.0651F, 1.7768F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(50, 89).addBox(1.84F, -1.16F, -1.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)).texOffs(50, 89).addBox(1.84F, -1.16F, -0.33F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(0.0907F, 7.1649F, 3.8945F, -1.0908F, 0.0F, 0.0F));
		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(50, 89).addBox(-0.82F, -2.32F, -2.68F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.16F)),
				PartPose.offsetAndRotation(3.0907F, 7.6204F, 3.6789F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(3.0907F, 4.3902F, 2.8233F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.9F, -2.4F, -2.6F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)).texOffs(0, 0).addBox(-6.9F, -2.4F, -2.6F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(3.0907F, 2.9428F, 3.4435F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(31, 73).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(31, 73).addBox(-7.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0907F, -1.8951F, 5.6792F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(50, 89).addBox(-1.16F, -2.1549F, -2.4355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)).texOffs(50, 89).addBox(0.04F, -2.1549F, -2.4355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(-3.5093F, 6.9471F, 0.6789F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(50, 89).addBox(-4.16F, -1.16F, -0.33F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)).texOffs(50, 89).addBox(-4.16F, -1.16F, -1.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(0.0907F, 8.047F, 2.7966F, -1.0908F, 0.0F, 0.0F));
		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(50, 89).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.16F)),
				PartPose.offsetAndRotation(-2.7293F, 6.5962F, 1.6162F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-2.9093F, 4.3902F, 2.8233F, -0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
