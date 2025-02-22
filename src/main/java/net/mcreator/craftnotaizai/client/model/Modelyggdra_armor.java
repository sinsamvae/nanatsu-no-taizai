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
public class Modelyggdra_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelyggdra_armor"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelyggdra_armor(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(25, 25).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(28, 56).addBox(-2.5F, 2.8F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(25, 15)
						.addBox(-4.0F, 5.1F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(51, 29).addBox(-2.5F, 7.6F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 25)
						.addBox(-4.0F, 7.55F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(25, 0).addBox(-4.0F, 2.6F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(13, 53)
						.addBox(-2.5F, 5.2F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition HatLayer_r1 = Head.addOrReplaceChild("HatLayer_r1",
				CubeListBuilder.create().texOffs(46, 2).addBox(12.9512F, -1.9599F, -2.7469F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(74, 80).addBox(12.9512F, -1.9599F, -2.7469F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(45, 17).addBox(12.9512F, 2.6401F, -3.1469F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(87, 67).addBox(7.7233F, -0.5983F, -1.4993F, 2.0F, 2.0F, 2.0F, new CubeDeformation(1.1F)).texOffs(0, 0)
						.addBox(10.6512F, -0.6599F, -1.4459F, 1.0F, 2.0F, 2.0F, new CubeDeformation(1.3F)).texOffs(89, 5).addBox(3.9539F, -0.5834F, -1.5081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.9F)).texOffs(27, 81).mirror()
						.addBox(12.9512F, -1.9599F, 1.8531F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -5.5386F, 0.0955F, 0.7798F, 0.0041F, -0.2612F));
		PartDefinition HatLayer_r2 = Head.addOrReplaceChild("HatLayer_r2",
				CubeListBuilder.create().texOffs(89, 0).addBox(-9.7233F, -0.5983F, -1.4993F, 2.0F, 2.0F, 2.0F, new CubeDeformation(1.1F)).texOffs(46, 10).addBox(-16.9512F, -1.9599F, -2.7469F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(27, 81).addBox(-16.9512F, -1.9599F, 1.8531F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 81).addBox(-16.9512F, -1.9599F, -2.7469F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 23)
						.addBox(-16.9512F, 2.6401F, -3.1469F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-11.6512F, -0.6599F, -1.4459F, 1.0F, 2.0F, 2.0F, new CubeDeformation(1.3F)).texOffs(89, 38)
						.addBox(-5.9539F, -0.5834F, -1.5081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.9F)),
				PartPose.offsetAndRotation(0.0F, -5.5386F, 0.0955F, 0.7798F, -0.0041F, 0.2612F));
		PartDefinition HatLayer_r3 = Head.addOrReplaceChild("HatLayer_r3",
				CubeListBuilder.create().texOffs(0, 15).addBox(-4.0F, 4.5386F, -3.9045F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(0, 0).addBox(-4.0F, -2.4614F, -3.9045F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, -5.5386F, 0.0955F, 0.0F, 3.1416F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(43, 69).addBox(-3.0F, 1.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(73, 40).addBox(0.0F, 1.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.15F)).texOffs(73, 3)
						.addBox(0.0F, 3.8F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.15F)).texOffs(66, 33).addBox(-2.85F, 3.9F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(13, 45)
						.addBox(-2.85F, 5.9F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(33, 7).addBox(-2.85F, 10.3F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.9F)).texOffs(51, 36)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(30, 62).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(0, 57)
						.addBox(-3.5F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(60, 65).addBox(-2.25F, -1.25F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(0, 70)
						.addBox(-1.75F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightArmLayer_r1 = RightArm.addOrReplaceChild("RightArmLayer_r1", CubeListBuilder.create().texOffs(65, 80).addBox(-2.0264F, 5.8427F, 0.2681F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -2.7047F, -0.6429F, 3.0964F));
		PartDefinition RightArmLayer_r2 = RightArm.addOrReplaceChild("RightArmLayer_r2", CubeListBuilder.create().texOffs(72, 86).addBox(-2.0264F, 6.7746F, 6.9511F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, 2.7931F, -0.6429F, 3.0964F));
		PartDefinition RightArmLayer_r3 = RightArm.addOrReplaceChild("RightArmLayer_r3", CubeListBuilder.create().texOffs(63, 86).addBox(-2.0264F, 7.0467F, 3.4852F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -3.0974F, -0.6429F, 3.0964F));
		PartDefinition RightArmLayer_r4 = RightArm.addOrReplaceChild("RightArmLayer_r4", CubeListBuilder.create().texOffs(80, 63).addBox(-2.0264F, 3.3478F, -2.1978F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -2.312F, -0.6429F, 3.0964F));
		PartDefinition RightArmLayer_r5 = RightArm.addOrReplaceChild("RightArmLayer_r5", CubeListBuilder.create().texOffs(56, 79).addBox(-2.5601F, 2.5645F, -2.5998F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -2.5307F, -1.3701F, -3.0107F));
		PartDefinition RightArmLayer_r6 = RightArm.addOrReplaceChild("RightArmLayer_r6", CubeListBuilder.create().texOffs(79, 31).addBox(-2.5601F, 5.2728F, -0.4031F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -2.9234F, -1.3701F, -3.0107F));
		PartDefinition RightArmLayer_r7 = RightArm.addOrReplaceChild("RightArmLayer_r7", CubeListBuilder.create().texOffs(82, 53).addBox(-2.5601F, 6.7771F, 2.6471F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, 2.9671F, -1.3701F, -3.0107F));
		PartDefinition RightArmLayer_r8 = RightArm.addOrReplaceChild("RightArmLayer_r8", CubeListBuilder.create().texOffs(86, 26).addBox(-2.5601F, 6.8463F, 6.0736F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, 2.5744F, -1.3701F, -3.0107F));
		PartDefinition RightArmLayer_r9 = RightArm.addOrReplaceChild("RightArmLayer_r9", CubeListBuilder.create().texOffs(80, 38).addBox(-0.6615F, 2.5976F, -2.6983F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, 0.6109F, -1.5272F, 0.0873F));
		PartDefinition RightArmLayer_r10 = RightArm.addOrReplaceChild("RightArmLayer_r10", CubeListBuilder.create().texOffs(80, 0).addBox(-0.6615F, 5.3411F, -0.4814F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, 0.2182F, -1.5272F, 0.0873F));
		PartDefinition RightArmLayer_r11 = RightArm.addOrReplaceChild("RightArmLayer_r11", CubeListBuilder.create().texOffs(87, 59).addBox(-0.6615F, 6.8702F, 2.6008F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -0.1745F, -1.5272F, 0.0873F));
		PartDefinition RightArmLayer_r12 = RightArm.addOrReplaceChild("RightArmLayer_r12", CubeListBuilder.create().texOffs(45, 83).addBox(-0.6615F, 6.9499F, 6.0664F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -0.5672F, -1.5272F, 0.0873F));
		PartDefinition RightArmLayer_r13 = RightArm.addOrReplaceChild("RightArmLayer_r13", CubeListBuilder.create().texOffs(83, 78).addBox(0.25F, 6.7236F, 6.7742F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -0.5672F, -1.0472F, 0.0F));
		PartDefinition RightArmLayer_r14 = RightArm.addOrReplaceChild("RightArmLayer_r14", CubeListBuilder.create().texOffs(83, 72).addBox(0.25F, 6.9319F, 3.3413F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -0.1745F, -1.0472F, 0.0F));
		PartDefinition RightArmLayer_r15 = RightArm.addOrReplaceChild("RightArmLayer_r15", CubeListBuilder.create().texOffs(75, 49).addBox(0.25F, 5.6815F, 0.179F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, 0.2182F, -1.0472F, 0.0F));
		PartDefinition RightArmLayer_r16 = RightArm.addOrReplaceChild("RightArmLayer_r16", CubeListBuilder.create().texOffs(29, 75).addBox(0.25F, 3.1648F, -2.2184F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, 0.6109F, -1.0472F, 0.0F));
		PartDefinition RightArmLayer_r17 = RightArm.addOrReplaceChild("RightArmLayer_r17", CubeListBuilder.create().texOffs(7, 87).addBox(0.4603F, 6.5942F, 7.745F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -0.4332F, 0.2163F, 0.0289F));
		PartDefinition RightArmLayer_r18 = RightArm.addOrReplaceChild("RightArmLayer_r18", CubeListBuilder.create().texOffs(88, 88).addBox(0.4603F, 7.1838F, 4.2878F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, -0.0405F, 0.2163F, 0.0289F));
		PartDefinition RightArmLayer_r19 = RightArm.addOrReplaceChild("RightArmLayer_r19", CubeListBuilder.create().texOffs(88, 32).addBox(0.4603F, 6.2765F, 0.9571F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, 0.3522F, 0.2163F, 0.0289F));
		PartDefinition RightArmLayer_r20 = RightArm.addOrReplaceChild("RightArmLayer_r20", CubeListBuilder.create().texOffs(20, 74).addBox(0.4603F, 2.8987F, -0.8906F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4313F, 9.1128F, 0.48F, 0.614F, 0.2163F, 0.0289F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(28, 68).addBox(0.0F, 1.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(73, 11).addBox(-1.0F, 1.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.15F)).texOffs(54, 72)
						.addBox(-1.0F, 3.8F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.15F)).texOffs(13, 67).addBox(-0.15F, 3.9F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(38, 40)
						.addBox(-1.15F, 5.9F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(38, 32).addBox(-1.15F, 10.3F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.9F)).texOffs(0, 49)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(60, 59).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(47, 56)
						.addBox(-0.5F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(66, 26).addBox(-0.75F, -1.25F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(71, 68)
						.addBox(-0.25F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftArmLayer_r1 = LeftArm.addOrReplaceChild("LeftArmLayer_r1", CubeListBuilder.create().texOffs(25, 87).addBox(-2.4603F, 6.2765F, 0.9571F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, 0.3522F, -0.2163F, -0.0289F));
		PartDefinition LeftArmLayer_r2 = LeftArm.addOrReplaceChild("LeftArmLayer_r2", CubeListBuilder.create().texOffs(34, 88).addBox(-2.4603F, 7.1838F, 4.2878F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -0.0405F, -0.2163F, -0.0289F));
		PartDefinition LeftArmLayer_r3 = LeftArm.addOrReplaceChild("LeftArmLayer_r3", CubeListBuilder.create().texOffs(86, 20).addBox(-2.4603F, 6.5942F, 7.745F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -0.4332F, -0.2163F, -0.0289F));
		PartDefinition LeftArmLayer_r4 = LeftArm.addOrReplaceChild("LeftArmLayer_r4", CubeListBuilder.create().texOffs(82, 45).addBox(-2.25F, 6.7236F, 6.7742F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -0.5672F, 1.0472F, 0.0F));
		PartDefinition LeftArmLayer_r5 = LeftArm.addOrReplaceChild("LeftArmLayer_r5", CubeListBuilder.create().texOffs(36, 82).addBox(-2.25F, 6.9319F, 3.3413F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -0.1745F, 1.0472F, 0.0F));
		PartDefinition LeftArmLayer_r6 = LeftArm.addOrReplaceChild("LeftArmLayer_r6", CubeListBuilder.create().texOffs(74, 74).addBox(-2.25F, 5.6815F, 0.179F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, 0.2182F, 1.0472F, 0.0F));
		PartDefinition LeftArmLayer_r7 = LeftArm.addOrReplaceChild("LeftArmLayer_r7", CubeListBuilder.create().texOffs(65, 74).addBox(-2.25F, 3.1648F, -2.2184F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, 0.6109F, 1.0472F, 0.0F));
		PartDefinition LeftArmLayer_r8 = LeftArm.addOrReplaceChild("LeftArmLayer_r8", CubeListBuilder.create().texOffs(47, 77).addBox(0.0264F, 5.8427F, 0.2681F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -2.7047F, 0.6429F, -3.0964F));
		PartDefinition LeftArmLayer_r9 = LeftArm.addOrReplaceChild("LeftArmLayer_r9", CubeListBuilder.create().texOffs(54, 85).addBox(0.0264F, 6.7746F, 6.9511F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, 2.7931F, 0.6429F, -3.0964F));
		PartDefinition LeftArmLayer_r10 = LeftArm.addOrReplaceChild("LeftArmLayer_r10", CubeListBuilder.create().texOffs(81, 84).addBox(0.0264F, 7.0467F, 3.4852F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -3.0974F, 0.6429F, -3.0964F));
		PartDefinition LeftArmLayer_r11 = LeftArm.addOrReplaceChild("LeftArmLayer_r11", CubeListBuilder.create().texOffs(77, 24).addBox(0.0264F, 3.3478F, -2.1978F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -2.312F, 0.6429F, -3.0964F));
		PartDefinition LeftArmLayer_r12 = LeftArm.addOrReplaceChild("LeftArmLayer_r12", CubeListBuilder.create().texOffs(77, 18).addBox(-1.3385F, 2.5976F, -2.6983F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, 0.6109F, 1.5272F, -0.0873F));
		PartDefinition LeftArmLayer_r13 = LeftArm.addOrReplaceChild("LeftArmLayer_r13", CubeListBuilder.create().texOffs(38, 76).addBox(-1.3385F, 5.3411F, -0.4814F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, 0.2182F, 1.5272F, -0.0873F));
		PartDefinition LeftArmLayer_r14 = LeftArm.addOrReplaceChild("LeftArmLayer_r14", CubeListBuilder.create().texOffs(16, 87).addBox(-1.3385F, 6.8702F, 2.6008F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -0.1745F, 1.5272F, -0.0873F));
		PartDefinition LeftArmLayer_r15 = LeftArm.addOrReplaceChild("LeftArmLayer_r15", CubeListBuilder.create().texOffs(82, 8).addBox(-1.3385F, 6.9499F, 6.0664F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -0.5672F, 1.5272F, -0.0873F));
		PartDefinition LeftArmLayer_r16 = LeftArm.addOrReplaceChild("LeftArmLayer_r16", CubeListBuilder.create().texOffs(0, 76).addBox(0.5601F, 2.5645F, -2.5998F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -2.5307F, 1.3701F, 3.0107F));
		PartDefinition LeftArmLayer_r17 = LeftArm.addOrReplaceChild("LeftArmLayer_r17", CubeListBuilder.create().texOffs(75, 57).addBox(0.5601F, 5.2728F, -0.4031F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, -2.9234F, 1.3701F, 3.0107F));
		PartDefinition LeftArmLayer_r18 = LeftArm.addOrReplaceChild("LeftArmLayer_r18", CubeListBuilder.create().texOffs(0, 82).addBox(0.5601F, 6.7771F, 2.6471F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, 2.9671F, 1.3701F, 3.0107F));
		PartDefinition LeftArmLayer_r19 = LeftArm.addOrReplaceChild("LeftArmLayer_r19", CubeListBuilder.create().texOffs(84, 14).addBox(0.5601F, 6.8463F, 6.0736F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, 2.5744F, 1.3701F, 3.0107F));
		PartDefinition LeftArmLayer_r20 = LeftArm.addOrReplaceChild("LeftArmLayer_r20", CubeListBuilder.create().texOffs(11, 74).addBox(-2.4603F, 2.8987F, -0.8906F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4313F, 9.1128F, 0.48F, 0.614F, -0.2163F, -0.0289F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 64).addBox(-1.9F, 1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(13, 60).addBox(-1.9F, 3.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(60, 8)
						.addBox(-1.9F, 6.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(30, 48).addBox(-1.9F, 8.9F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(60, 44)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(21, 32).addBox(-1.9F, 2.5F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(47, 63).addBox(-2.1F, 1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(60, 19).addBox(-2.1F, 3.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(60, 0)
						.addBox(-2.1F, 6.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(47, 48).addBox(-2.1F, 8.9F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(60, 52)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 34).addBox(-2.1F, 2.5F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
