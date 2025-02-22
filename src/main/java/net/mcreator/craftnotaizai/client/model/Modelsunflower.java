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
public class Modelsunflower<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelsunflower"), "main");
	public final ModelPart sunflower;

	public Modelsunflower(ModelPart root) {
		this.sunflower = root.getChild("sunflower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition sunflower = partdefinition.addOrReplaceChild("sunflower",
				CubeListBuilder.create().texOffs(50, 33).addBox(-7.238F, 24.6759F, 5.4773F, 14.5F, 6.0F, 14.5F, new CubeDeformation(0.0F)).texOffs(84, 119).addBox(1.012F, -8.7111F, -6.2727F, 11.0F, 4.7739F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-11.988F, -8.7111F, -6.2727F, 10.0F, 4.7739F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(-2.3749F, -6.3241F, -7.0227F, 4.7739F, 12.0F, 2.75F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-2.3749F, -18.3241F, -7.0227F, 4.7739F, 12.0F, 2.75F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.012F, -6.6759F, -12.7273F));
		PartDefinition cube_r1 = sunflower.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-2.3869F, -6.0F, -1.125F, 4.7739F, 12.0F, 2.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2306F, -10.5668F, -5.3977F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r2 = sunflower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 27).addBox(-2.3869F, -6.0F, -1.125F, 4.7739F, 12.0F, 2.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2547F, -2.0815F, -5.3977F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r3 = sunflower.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 48).addBox(-1.6869F, -1.7F, -1.275F, 3.3739F, 3.4F, 2.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.004F, 5.6667F, -5.6477F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r4 = sunflower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 55).addBox(-1.6869F, -1.7F, -0.9F, 3.3739F, 3.4F, 1.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0212F, -6.3161F, -5.2727F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r5 = sunflower.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 55).addBox(-1.6869F, -1.7F, -0.9F, 3.3739F, 3.4F, 1.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.9788F, -6.3161F, -5.2727F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r6 = sunflower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(49, 27).addBox(-1.6869F, -1.7F, -1.15F, 3.3739F, 3.4F, 2.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.4854F, 2.162F, -5.5227F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r7 = sunflower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 27).addBox(-1.6869F, -1.7F, -1.15F, 3.3739F, 3.4F, 2.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.4851F, -14.8085F, -5.5227F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r8 = sunflower.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(49, 33).addBox(-1.6869F, -1.7F, -1.025F, 3.3739F, 3.4F, 2.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.4854F, -14.8103F, -5.3977F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r9 = sunflower.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(49, 33).addBox(-1.6869F, -1.7F, -1.025F, 3.3739F, 3.4F, 2.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.4851F, 2.1603F, -5.3977F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r10 = sunflower.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 48).addBox(-1.6869F, -1.7F, -1.275F, 3.3739F, 3.4F, 2.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.004F, -18.3333F, -5.6477F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r11 = sunflower.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(42, 133).addBox(-2.3869F, -6.0F, -1.25F, 4.7739F, 12.0F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2547F, -10.5668F, -5.5227F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r12 = sunflower.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 133).addBox(-2.3869F, -6.0F, -1.25F, 4.7739F, 12.0F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2306F, -2.0815F, -5.5227F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r13 = sunflower.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-13.25F, 0.0F, -13.125F, 26.5F, 0.0F, 26.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, -5.8098F, -3.7981F, 1.5708F, 0.0F, -0.3927F));
		PartDefinition cube_r14 = sunflower.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(101, 63).addBox(-5.25F, -0.5F, -5.125F, 10.5F, 1.0F, 10.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, -5.8098F, -4.2981F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r15 = sunflower.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 123).addBox(-5.25F, 0.0F, -5.25F, 10.5F, 0.0F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8423F, -4.8958F, -7.3981F, 1.5708F, 0.0F, 1.6144F));
		PartDefinition cube_r16 = sunflower.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 123).addBox(-5.25F, 0.0F, -5.25F, 10.5F, 0.0F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.625F, -8.1465F, -7.2981F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r17 = sunflower.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 123).addBox(-5.25F, 0.0F, -5.25F, 10.5F, 0.0F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.625F, -5.6465F, -7.4981F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r18 = sunflower.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 123).addBox(-5.25F, 0.0F, -5.25F, 10.5F, 0.0F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.375F, -7.1465F, -7.2981F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r19 = sunflower.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 123).addBox(-5.25F, 0.0F, -5.25F, 10.5F, 0.0F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, -6.1848F, -7.8981F, 1.5708F, 0.0F, 0.48F));
		PartDefinition cube_r20 = sunflower.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 123).addBox(-5.25F, 0.0F, -5.25F, 10.5F, 0.0F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, -6.1848F, -7.0481F, 1.5708F, 0.0F, -0.3054F));
		PartDefinition cube_r21 = sunflower.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(126, 0).addBox(-3.25F, -1.5F, -3.25F, 6.5F, 3.0F, 6.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, -6.1848F, -7.2981F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r22 = sunflower.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(47, 73).addBox(-7.25F, -2.5F, -7.125F, 14.5F, 5.0F, 14.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, -5.8098F, -1.2981F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r23 = sunflower.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(81, 0).addBox(-7.25F, -2.5F, -7.125F, 14.5F, 5.0F, 14.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, -5.4055F, 1.7726F, 1.309F, 0.0F, 0.0F));
		PartDefinition cube_r24 = sunflower.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 104).addBox(-7.0F, -2.5F, -6.5F, 14.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, -4.52F, 4.8819F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r25 = sunflower.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(98, 44).addBox(-6.75F, -2.5F, -6.75F, 13.5F, 5.0F, 13.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, -2.3171F, 6.7411F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r26 = sunflower.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(90, 102).addBox(-7.0F, -1.125F, -7.0F, 14.0F, 2.25F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0954F, 10.7224F, 11.2565F, 0.2114F, 0.0551F, -0.0578F));
		PartDefinition cube_r27 = sunflower.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(41, 116).addBox(-7.0F, -0.875F, -7.0F, 14.0F, 1.75F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0612F, 6.6141F, 10.323F, 0.3505F, 0.0791F, 0.037F));
		PartDefinition cube_r28 = sunflower.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 85).addBox(-7.25F, -1.375F, -7.375F, 14.5F, 2.75F, 14.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, 1.5601F, 8.8902F, 0.4378F, 0.0791F, 0.037F));
		PartDefinition cube_r29 = sunflower.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(98, 119).addBox(-6.5F, -2.5F, -6.625F, 13.0F, 5.0F, 13.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, 0.5405F, 8.4147F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r30 = sunflower.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(96, 20).addBox(-6.25F, -5.5F, -6.25F, 12.5F, 11.0F, 12.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, 6.7829F, 10.32F, 0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r31 = sunflower.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(50, 55).addBox(-7.5F, -0.75F, -7.625F, 15.0F, 1.5F, 15.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1754F, 17.6513F, 12.1116F, 0.1412F, -0.0183F, 0.1296F));
		PartDefinition cube_r32 = sunflower.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 48).addBox(-7.75F, -0.75F, -7.75F, 15.5F, 1.5F, 15.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0984F, 14.6604F, 11.6008F, 0.1428F, 0.1178F, 0.1043F));
		PartDefinition cube_r33 = sunflower.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(47, 93).addBox(-6.75F, -4.0F, -6.75F, 13.5F, 8.0F, 13.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, 15.6466F, 11.7422F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r34 = sunflower.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 67).addBox(-7.5F, -1.0F, -7.5F, 15.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, 22.2974F, 12.4925F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r35 = sunflower.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(92, 79).addBox(-7.0F, -3.0F, -7.0F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, 22.2974F, 12.4925F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r36 = sunflower.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 27).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 4.25F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.012F, 27.6759F, 12.7273F, 0.0F, 0.0873F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		sunflower.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
