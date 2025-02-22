// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBlaze<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "blaze"), "main");
	private final ModelPart bone;

	public ModelBlaze(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-22.0F, -25.0F, -7.1875F, 28.0F, 28.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(143, 33)
				.addBox(-21.0F, -24.0F, -10.625F, 26.0F, 26.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(152, 14)
				.addBox(-26.0F, -23.8125F, -5.75F, 22.0F, 25.75F, 25.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
				.addBox(-16.0F, -23.875F, -6.0F, 25.0F, 25.75F, 25.0F, new CubeDeformation(0.0F)).texOffs(3, 73)
				.addBox(-20.0F, -24.0F, 3.125F, 24.0F, 26.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(37, 88)
				.addBox(-20.0F, -29.5F, -5.0625F, 24.0F, 23.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(81, 79)
				.addBox(-20.0F, -19.5F, -4.0F, 24.0F, 24.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

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