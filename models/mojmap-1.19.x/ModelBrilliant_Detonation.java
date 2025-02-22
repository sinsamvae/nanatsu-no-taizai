// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBrilliant_Detonation<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "brilliant_detonation"), "main");
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone3;
	private final ModelPart bone2;

	public ModelBrilliant_Detonation(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone4 = root.getChild("bone4");
		this.bone5 = root.getChild("bone5");
		this.bone3 = root.getChild("bone3");
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(20, 22)
						.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 10)
						.addBox(-5.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 44)
						.addBox(-3.0F, -5.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 36)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(20, 22)
						.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 10)
						.addBox(-5.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 44)
						.addBox(-3.0F, -5.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 36)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -17.0F, 0.0F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(20, 22)
						.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 10)
						.addBox(-5.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 44)
						.addBox(-3.0F, -5.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 36)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(16.0F, -8.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(20, 22)
						.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 10)
						.addBox(-5.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 44)
						.addBox(-3.0F, -5.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 36)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 10.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(20, 22)
						.addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 10)
						.addBox(-5.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 44)
						.addBox(-3.0F, -5.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 36)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, -11.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}