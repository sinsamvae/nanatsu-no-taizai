// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelearthspike<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "earthspike"), "main");
	private final ModelPart bone;

	public Modelearthspike(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(2.0F, -9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 23)
						.addBox(-3.0F, -9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-2.0F, -13.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 17)
						.addBox(-2.0F, -9.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-2.0F, -9.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(3.0F, -4.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 19)
						.addBox(-4.0F, -4.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 27)
						.addBox(-4.0F, -7.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -7.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 12)
						.addBox(-2.0F, -4.0F, -4.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-1.0F, -7.0F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 23)
						.addBox(-1.0F, -7.0F, 3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 7)
						.addBox(-2.0F, -4.0F, 3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 12)
						.addBox(-1.0F, -20.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 26)
						.addBox(-1.0F, -16.0F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-1.0F, -12.0F, 2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 32)
						.addBox(-1.0F, -16.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 31)
						.addBox(-1.0F, -12.0F, -3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 21)
						.addBox(1.0F, -16.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 30)
						.addBox(2.0F, -12.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 30)
						.addBox(-2.0F, -16.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 27)
						.addBox(-3.0F, -12.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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