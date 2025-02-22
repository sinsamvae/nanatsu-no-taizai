// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltwigoandsword<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "twigoandsword"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modeltwigoandsword(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition standard_scorpion = RightArm.addOrReplaceChild("standard_scorpion", CubeListBuilder.create()
				.texOffs(63, 67).addBox(-0.5F, 5.4432F, -0.8665F, 1.0F, 6.5F, 1.5F, new CubeDeformation(0.0F))
				.texOffs(63, 68).addBox(-0.3F, -8.0568F, -0.8665F, 0.6F, 13.5F, 1.3F, new CubeDeformation(0.0F))
				.texOffs(64, 64).addBox(-0.3F, -11.2068F, 0.4335F, 0.6F, 16.65F, 0.2F, new CubeDeformation(0.0F))
				.texOffs(112, 72).addBox(-0.45F, 5.4432F, 0.6335F, 0.9F, 0.75F, 1.45F, new CubeDeformation(0.0F))
				.texOffs(100, 76).addBox(-0.45F, 5.4432F, -2.3165F, 0.9F, 0.75F, 1.45F, new CubeDeformation(0.0F))
				.texOffs(114, 59).addBox(-0.55F, 5.4432F, -2.4665F, 1.1F, 0.75F, 0.15F, new CubeDeformation(0.0F))
				.texOffs(114, 59).addBox(-0.55F, 5.4432F, 2.0835F, 1.1F, 0.75F, 0.15F, new CubeDeformation(0.0F))
				.texOffs(114, 59).addBox(0.5F, 5.4432F, -0.8665F, 0.75F, 0.75F, 1.5F, new CubeDeformation(0.0F))
				.texOffs(114, 59).addBox(-1.25F, 5.4432F, -0.8665F, 0.75F, 0.75F, 1.5F, new CubeDeformation(0.0F))
				.texOffs(93, 63).addBox(-0.6F, 6.1932F, -0.9665F, 1.2F, 4.75F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 8.3068F, -8.3835F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r1 = standard_scorpion.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(114, 59).addBox(-0.5F, -0.375F, -0.875F, 0.75F, 0.75F, 1.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6842F, 5.8182F, 1.3462F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = standard_scorpion.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(114, 59).addBox(-0.5F, -0.375F, -0.875F, 0.75F, 0.75F, 1.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6842F, 5.8182F, -1.5792F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r3 = standard_scorpion.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(114, 59).addBox(-0.25F, -0.375F, -0.875F, 0.75F, 0.75F, 1.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6842F, 5.8182F, -1.5792F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r4 = standard_scorpion.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(114, 59).addBox(-0.25F, -0.375F, -0.75F, 0.75F, 0.75F, 1.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.732F, 5.8182F, 1.2308F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r5 = standard_scorpion.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(70, 67)
						.addBox(-0.3F, -0.35F, 0.75F, 0.6F, 0.55F, 0.15F, new CubeDeformation(0.0F)).texOffs(70, 66)
						.addBox(-0.3F, -0.65F, 0.6F, 0.6F, 0.9F, 0.15F, new CubeDeformation(0.0F)).texOffs(70, 65)
						.addBox(-0.3F, -1.05F, 0.45F, 0.6F, 1.35F, 0.15F, new CubeDeformation(0.0F)).texOffs(70, 66)
						.addBox(-0.3F, -1.35F, 0.3F, 0.6F, 1.75F, 0.15F, new CubeDeformation(0.0F)).texOffs(70, 67)
						.addBox(-0.3F, -1.75F, 0.15F, 0.6F, 2.25F, 0.15F, new CubeDeformation(0.0F)).texOffs(70, 66)
						.addBox(-0.3F, -2.15F, 0.0F, 0.6F, 2.75F, 0.15F, new CubeDeformation(0.0F)).texOffs(69, 68)
						.addBox(-0.3F, -2.45F, -0.15F, 0.6F, 3.05F, 0.15F, new CubeDeformation(0.0F)).texOffs(70, 66)
						.addBox(-0.3F, -2.8F, -0.3F, 0.6F, 3.4F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.4963F, -0.3597F, -0.3927F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}