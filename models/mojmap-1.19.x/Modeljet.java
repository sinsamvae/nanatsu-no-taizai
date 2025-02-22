// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeljet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "jet"),
			"main");
	private final ModelPart fist;

	public Modeljet(ModelPart root) {
		this.fist = root.getChild("fist");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fist = partdefinition.addOrReplaceChild("fist", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.8568F, 9.1599F, -0.0405F, -1.4443F, -1.5708F, 1.5708F));

		PartDefinition head_r1 = fist.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(58, 60).addBox(-3.176F, -4.976F, -3.176F, 6.352F, 9.952F, 6.352F,
						new CubeDeformation(-2.24F)),
				PartPose.offsetAndRotation(0.0024F, 2.8334F, 4.816F, 2.114F, 1.2624F, -2.1077F));

		PartDefinition head_r2 = fist.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(0, 51).addBox(-3.384F, -5.184F, -3.384F, 6.768F, 10.368F, 6.768F,
						new CubeDeformation(-2.16F)),
				PartPose.offsetAndRotation(2.3362F, 1.9877F, 4.6672F, -2.5286F, 1.2624F, -2.1077F));

		PartDefinition head_r3 = fist.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(0, 69).addBox(-3.176F, -4.976F, -3.176F, 6.352F, 9.952F, 6.352F,
						new CubeDeformation(-2.24F)),
				PartPose.offsetAndRotation(-0.455F, 3.5709F, 1.0616F, 2.114F, 1.2624F, -2.1077F));

		PartDefinition head_r4 = fist.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(53, 0).addBox(-3.384F, -5.184F, -3.384F, 6.768F, 10.368F, 6.768F,
						new CubeDeformation(-2.16F)),
				PartPose.offsetAndRotation(2.0414F, 2.3123F, 0.9994F, -2.5286F, 1.2624F, -2.1077F));

		PartDefinition head_r5 = fist.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(29, 60).addBox(-3.384F, -5.184F, -3.384F, 6.768F, 10.368F, 6.768F,
						new CubeDeformation(-2.16F)),
				PartPose.offsetAndRotation(1.7534F, 2.3123F, -2.1686F, -2.5286F, 1.2624F, -2.1077F));

		PartDefinition head_r6 = fist.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(52, 77).addBox(-3.176F, -4.976F, -3.176F, 6.352F, 9.952F, 6.352F,
						new CubeDeformation(-2.24F)),
				PartPose.offsetAndRotation(-0.743F, 3.5709F, -2.1064F, 2.114F, 1.2624F, -2.1077F));

		PartDefinition head_r7 = fist.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(74, 18).addBox(-3.176F, -4.976F, -3.176F, 6.352F, 9.952F, 6.352F,
						new CubeDeformation(-2.24F)),
				PartPose.offsetAndRotation(-0.743F, 2.4189F, -4.6984F, 2.114F, 1.2624F, -2.1077F));

		PartDefinition head_r8 = fist.addOrReplaceChild("head_r8",
				CubeListBuilder.create().texOffs(45, 24).addBox(-3.384F, -5.184F, -3.384F, 6.768F, 10.368F, 6.768F,
						new CubeDeformation(-2.16F)),
				PartPose.offsetAndRotation(1.7534F, 1.1603F, -4.7606F, -2.5286F, 1.2624F, -2.1077F));

		PartDefinition head_r9 = fist.addOrReplaceChild("head_r9",
				CubeListBuilder.create().texOffs(37, 43).addBox(-7.4F, -3.8F, -3.8F, 14.8F, 7.6F, 7.6F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(-3.3141F, -4.1929F, -2.955F, 1.4786F, 0.4678F, 1.6044F));

		PartDefinition head_r10 = fist.addOrReplaceChild("head_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.75F, -7.4F, -3.8F, 17.5F, 14.8F, 7.6F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(0.865F, -4.3125F, 1.5017F, -1.7083F, 1.2624F, -2.1077F));

		PartDefinition head_r11 = fist.addOrReplaceChild("head_r11",
				CubeListBuilder.create().texOffs(0, 24).addBox(-4.632F, -6.432F, -6.3195F, 9.264F, 12.864F, 12.639F,
						new CubeDeformation(-1.68F)),
				PartPose.offsetAndRotation(-3.4969F, -11.6614F, 3.6428F, -0.3054F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		fist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}