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

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhorn<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelhorn"), "main");
	public final ModelPart horn;

	public Modelhorn(ModelPart root) {
		this.horn = root.getChild("horn");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition horn = partdefinition.addOrReplaceChild("horn",
				CubeListBuilder.create().texOffs(0, 22).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 58).addBox(-9.0F, -8.0F, -9.0F, 18.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = horn.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(92, 168).addBox(-2.8493F, -0.1015F, -14.7892F, 15.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.425F, -13.344F, 41.6071F, 3.109F, 1.3144F, 0.7217F));
		PartDefinition cube_r2 = horn.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(196, 169).addBox(-5.5F, -5.0F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(107, 196).addBox(-4.5F, -7.0F, -4.5F, 9.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.3634F, -54.7824F, 53.7071F, 3.1034F, 0.7039F, -2.5479F));
		PartDefinition cube_r3 = horn.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.2975F, -82.4982F, 52.0823F, 3.0901F, 0.719F, -3.0207F));
		PartDefinition cube_r4 = horn.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(199, 125).addBox(-2.5F, -4.0F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.4528F, -75.2841F, 52.3666F, 3.1145F, 0.7373F, -2.7879F));
		PartDefinition cube_r5 = horn.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(49, 25).addBox(-4.5F, -2.0F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(200, 16).addBox(-3.5F, -3.0F, -3.5F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.703F, -70.1214F, 52.6794F, 3.0937F, 0.7292F, -2.4941F));
		PartDefinition cube_r6 = horn.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(192, 153).addBox(-5.5F, -3.0F, -5.5F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(199, 94).addBox(-4.5F, -4.0F, -4.5F, 9.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0355F, -63.8698F, 53.337F, 3.0798F, 0.7279F, -2.3185F));
		PartDefinition cube_r7 = horn.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(168, 0).addBox(-5.9585F, -13.1746F, -6.8467F, 13.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0838F, -37.1946F, 54.3038F, 3.1331F, 0.6845F, -2.7738F));
		PartDefinition cube_r8 = horn.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 192).addBox(-4.9585F, -13.1746F, -5.8467F, 11.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.8338F, -38.1946F, 54.3038F, 3.1331F, 0.6845F, -2.7738F));
		PartDefinition cube_r9 = horn.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(186, 192).addBox(-6.2309F, -0.8153F, -6.9645F, 13.0F, 14.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.8338F, -39.3946F, 54.3038F, -3.1083F, 0.6748F, -3.0541F));
		PartDefinition cube_r10 = horn.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(107, 79).addBox(-6.1501F, -12.1601F, -13.2713F, 17.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(61, 96).addBox(-5.1501F, -12.1601F, -12.2713F, 15.0F, 14.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.983F, -19.6439F, 50.4537F, -2.9621F, 0.6791F, 2.988F));
		PartDefinition cube_r11 = horn.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(146, 153).addBox(-4.9854F, -2.9836F, -11.9078F, 15.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.983F, -19.6439F, 50.4537F, -2.9238F, 0.6988F, 2.7061F));
		PartDefinition cube_r12 = horn.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 113).addBox(-5.8539F, 7.6414F, -15.1554F, 17.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(46, 154).addBox(-4.8539F, 2.6414F, -14.1554F, 15.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.983F, -19.6439F, 50.4537F, -2.5097F, 0.6529F, 2.7456F));
		PartDefinition cube_r13 = horn.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(160, 67).addBox(-2.875F, 7.8152F, -16.7724F, 15.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.983F, -19.6439F, 50.4537F, -2.431F, 0.8071F, 2.5375F));
		PartDefinition cube_r14 = horn.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(158, 40).addBox(-3.5122F, -13.0648F, -15.7803F, 15.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.425F, -13.344F, 41.6071F, -2.2443F, 1.0336F, 2.3498F));
		PartDefinition cube_r15 = horn.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(104, 55).addBox(-5.0452F, -2.7073F, -15.8411F, 18.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.425F, -13.344F, 42.0071F, -2.3129F, 1.1569F, 2.0771F));
		PartDefinition cube_r16 = horn.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 167).addBox(-4.0452F, -6.7073F, -14.8411F, 15.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.425F, -13.344F, 41.6071F, -2.3129F, 1.1569F, 2.0771F));
		PartDefinition cube_r17 = horn.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(153, 100).addBox(-3.8087F, -3.3417F, -14.4606F, 15.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.425F, -13.344F, 41.6071F, -2.5996F, 1.28F, 1.5418F));
		PartDefinition cube_r18 = horn.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(46, 181).addBox(-4.3934F, 3.2803F, -16.6121F, 15.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.425F, -13.344F, 41.6071F, -2.21F, 1.2291F, 1.4083F));
		PartDefinition cube_r19 = horn.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(148, 20).addBox(-5.3934F, 6.7165F, -20.536F, 17.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(107, 111).addBox(-4.3934F, 6.7165F, -19.536F, 15.0F, 13.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.425F, -13.344F, 41.6071F, -1.9046F, 1.2291F, 1.4083F));
		PartDefinition cube_r20 = horn.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-9.5F, -1.0F, -9.5F, 19.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.563F, -32.0066F, 28.5539F, -1.2352F, 0.6544F, 1.2327F));
		PartDefinition cube_r21 = horn.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(102, 25).addBox(-9.6874F, 3.967F, -10.6259F, 15.0F, 14.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.5942F, -18.4557F, 36.075F, -1.4751F, 1.0112F, 1.2993F));
		PartDefinition cube_r22 = horn.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(100, 140).addBox(-17.455F, -6.1589F, -18.5956F, 15.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4892F, -22.2317F, 20.6579F, -1.3331F, 0.7957F, 1.0782F));
		PartDefinition cube_r23 = horn.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(47, 37).addBox(-19.2672F, 3.0938F, -20.4049F, 18.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4892F, -21.4817F, 20.1579F, -1.071F, 0.4743F, 0.9249F));
		PartDefinition cube_r24 = horn.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 126).addBox(-17.2672F, -6.9062F, -18.4049F, 15.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4892F, -22.2317F, 20.6579F, -1.071F, 0.4743F, 0.9249F));
		PartDefinition cube_r25 = horn.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 139).addBox(-19.0204F, -0.9392F, -20.3777F, 15.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4892F, -22.2317F, 20.6579F, -0.6826F, 0.107F, 0.6006F));
		PartDefinition cube_r26 = horn.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(60, 5).addBox(-22.0128F, -1.628F, -23.2756F, 19.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(58, 64).addBox(-20.0128F, -1.628F, -22.2756F, 15.0F, 16.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4892F, -22.2317F, 20.6579F, -0.3698F, -0.0225F, 0.3431F));
		PartDefinition cube_r27 = horn.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(153, 125).addBox(-17.321F, -1.2056F, -19.0098F, 15.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4892F, -22.2317F, 20.6579F, -0.9419F, 0.3354F, 0.8098F));
		PartDefinition cube_r28 = horn.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(116, 0).addBox(-22.9936F, 4.6273F, -25.4568F, 17.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 81).addBox(-21.9936F, 4.6273F, -24.4568F, 15.0F, 16.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4892F, -22.2317F, 20.6579F, -0.1415F, -0.0733F, 0.1305F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		horn.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
