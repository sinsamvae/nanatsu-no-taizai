// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelremake_evilhound<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "remake_evilhound"), "main");
	private final ModelPart bone;

	public Modelremake_evilhound(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 9)
				.addBox(-1.0F, -22.9871F, -69.1525F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(113, 18)
				.addBox(-3.0F, -22.4871F, -68.6525F, 6.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(166, 73)
				.addBox(-3.0F, -19.4871F, -68.3525F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(53, 34)
				.addBox(-6.0F, -29.4519F, -59.6225F, 12.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(139, 137)
				.addBox(-9.75F, -3.4896F, -16.6107F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, 129)
				.addBox(-10.25F, 5.5104F, -19.8607F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(139, 137)
				.addBox(6.0F, -3.4896F, -16.6107F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, 129)
				.addBox(5.5F, 5.5104F, -19.8607F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(120, 124)
				.addBox(5.75F, 5.6481F, -45.0125F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(120, 124)
				.addBox(-13.25F, 5.6481F, -45.0125F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.0F, 93.8519F, -0.4875F, 1.5708F, 1.5708F, -3.1416F));

		PartDefinition tail_r1 = bone
				.addOrReplaceChild("tail_r1",
						CubeListBuilder.create().texOffs(0, 122).addBox(-3.0F, -1.7108F, -3.2844F, 6.0F, 10.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail_r2 = bone.addOrReplaceChild("tail_r2",
				CubeListBuilder.create().texOffs(114, 137).addBox(-3.0F, -1.7108F, -3.2844F, 6.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0603F, -2.2238F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail_r3 = bone.addOrReplaceChild("tail_r3",
				CubeListBuilder.create().texOffs(74, 86).addBox(-4.0F, -1.7108F, -4.2844F, 8.0F, 11.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0504F, -8.2275F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail_r4 = bone.addOrReplaceChild("tail_r4",
				CubeListBuilder.create().texOffs(46, 137).addBox(-3.0F, -8.2111F, -2.0929F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0504F, -8.2275F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leg6_r1 = bone.addOrReplaceChild("leg6_r1",
				CubeListBuilder.create().texOffs(93, 136)
						.addBox(-2.5F, -6.5F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(93, 136)
						.addBox(16.5F, -6.5F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.25F, 0.1481F, -38.2625F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leg6_r2 = bone.addOrReplaceChild("leg6_r2",
				CubeListBuilder.create().texOffs(99, 98)
						.addBox(-3.0F, -7.0F, -4.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(99, 98)
						.addBox(16.0F, -7.0F, -4.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -13.3519F, -40.5125F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg2_r1 = bone.addOrReplaceChild("leg2_r1",
				CubeListBuilder.create().texOffs(121, 50)
						.addBox(-2.5F, -6.5F, -3.0F, 5.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(121, 50)
						.addBox(-18.5F, -6.5F, -3.0F, 5.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -4.8488F, -18.5104F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leg3_r1 = bone.addOrReplaceChild("leg3_r1",
				CubeListBuilder.create().texOffs(0, 68)
						.addBox(-3.0F, -8.0F, -5.0F, 6.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-19.0F, -8.0F, -5.0F, 6.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -11.3488F, -17.5104F, -0.5236F, 0.0F, 0.0F));

		PartDefinition head_r1 = bone.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0154F, -1.7098F, -0.9277F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 43)
				.addBox(-1.6459F, -3.7184F, -0.9277F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1986F, -32.8603F, -52.0425F, 0.0289F, -0.2163F, -0.3086F));

		PartDefinition head_r2 = bone.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(0, 96).mirror()
						.addBox(7.2996F, -6.0F, -3.1984F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -23.4519F, -53.3771F, 0.0F, 0.3054F, 0.0F));

		PartDefinition head_r3 = bone.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(0, 96).addBox(-7.2996F, -6.0F, -3.1984F, 0.0F, 13.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.4519F, -53.3771F, 0.0F, -0.3054F, 0.0F));

		PartDefinition head_r4 = bone.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(20, 82).addBox(-6.6604F, -6.0F, -4.6231F, 0.0F, 12.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.45F, -20.9084F, -51.2885F, -0.4013F, -0.2013F, 0.0846F));

		PartDefinition head_r5 = bone.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(20, 82).mirror()
						.addBox(6.6604F, -6.0F, -4.6231F, 0.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.45F, -20.9084F, -51.2885F, -0.4013F, 0.2013F, -0.0846F));

		PartDefinition head_r6 = bone.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(0, 43)
				.addBox(-0.3541F, -3.7184F, -0.9277F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 34)
				.addBox(-0.3541F, -3.7184F, -0.9277F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
				.addBox(-0.9846F, -1.7098F, -0.9277F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1986F, -32.8603F, -52.0425F, 0.0289F, 0.2163F, 0.3086F));

		PartDefinition head_r7 = bone.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(49, 0).addBox(-6.0F, -1.8787F, -5.7785F, 12.0F, 0.0F, 12.0F,
						new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(0.0F, -13.3776F, -50.4809F, -1.2217F, 0.0F, 0.0F));

		PartDefinition head_r8 = bone.addOrReplaceChild("head_r8",
				CubeListBuilder.create().texOffs(65, 13).addBox(-6.0F, -5.9743F, -4.8916F, 12.0F, 12.0F, 6.0F,
						new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(0.0F, -13.3776F, -50.4809F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head_r9 = bone.addOrReplaceChild("head_r9",
				CubeListBuilder.create().texOffs(107, 75).mirror()
						.addBox(0.0F, -6.0F, -5.5F, 0.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.0F, -26.4519F, -45.1225F, 0.4396F, 0.1186F, 0.0556F));

		PartDefinition head_r10 = bone.addOrReplaceChild("head_r10",
				CubeListBuilder.create().texOffs(107, 75).addBox(0.0F, -6.0F, -5.5F, 0.0F, 9.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -26.4519F, -45.1225F, 0.4396F, -0.1186F, -0.0556F));

		PartDefinition head_r11 = bone.addOrReplaceChild("head_r11",
				CubeListBuilder.create().texOffs(65, 74).addBox(-5.0F, 0.0F, -5.5F, 10.0F, 0.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -27.2605F, -43.2531F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head_r12 = bone.addOrReplaceChild("head_r12",
				CubeListBuilder.create().texOffs(93, 121).addBox(-3.5F, -3.5F, 1.5F, 7.0F, 8.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -26.9037F, -53.3453F, -0.6545F, 0.0F, 0.0F));

		PartDefinition head_r13 = bone.addOrReplaceChild("head_r13",
				CubeListBuilder.create().texOffs(68, 106).addBox(-4.5F, -4.5F, 1.5F, 9.0F, 10.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.2511F, -48.5852F, -0.6545F, 0.0F, 0.0F));

		PartDefinition head_r14 = bone.addOrReplaceChild("head_r14",
				CubeListBuilder.create().texOffs(39, 34).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7011F, -31.3243F, -51.9526F, 0.0093F, -0.3109F, -0.4808F));

		PartDefinition head_r15 = bone.addOrReplaceChild("head_r15",
				CubeListBuilder.create().texOffs(46, 34).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6962F, -30.5466F, -52.8323F, -0.2087F, -0.2198F, 0.008F));

		PartDefinition head_r16 = bone.addOrReplaceChild("head_r16",
				CubeListBuilder.create().texOffs(49, 0).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6962F, -30.5466F, -52.8323F, -0.2087F, 0.2198F, -0.008F));

		PartDefinition head_r17 = bone.addOrReplaceChild("head_r17",
				CubeListBuilder.create().texOffs(135, 22).addBox(-1.0F, -1.0F, -4.0F, 3.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1034F, -21.4871F, -64.2712F, 0.0F, 0.2618F, 0.0F));

		PartDefinition head_r18 = bone.addOrReplaceChild("head_r18",
				CubeListBuilder.create().texOffs(138, 41).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1034F, -21.4871F, -64.2712F, 0.0F, -0.2618F, 0.0F));

		PartDefinition head_r19 = bone.addOrReplaceChild("head_r19",
				CubeListBuilder.create().texOffs(119, 70).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.4003F, -64.3144F, 0.2182F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = bone.addOrReplaceChild("mane_rotation_r1",
				CubeListBuilder.create().texOffs(98, 0).addBox(-8.0F, -8.5F, 0.0F, 16.0F, 17.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.9239F, -28.1804F, 0.0436F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r2 = bone.addOrReplaceChild("mane_rotation_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -8.5F, -8.5F, 16.0F, 17.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.6019F, -36.7625F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head_r20 = bone.addOrReplaceChild("head_r20",
				CubeListBuilder.create().texOffs(166, 62)
						.addBox(-3.0F, -1.25F, -3.875F, 6.0F, 1.0F, 7.0F, new CubeDeformation(-0.01F)).texOffs(119, 112)
						.addBox(-3.0F, -0.25F, -4.125F, 6.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.2371F, -64.2775F, 0.5236F, 0.0F, 0.0F));

		PartDefinition body_rotation_r1 = bone.addOrReplaceChild("body_rotation_r1",
				CubeListBuilder.create().texOffs(0, 34).addBox(-6.0F, -19.0F, -3.0F, 12.0F, 19.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.8519F, -10.5125F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}