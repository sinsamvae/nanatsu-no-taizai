// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelincrease_true_spirt_spear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "increase_true_spirt_spear"), "main");
	private final ModelPart kingsword;

	public Modelincrease_true_spirt_spear(ModelPart root) {
		this.kingsword = root.getChild("kingsword");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition kingsword = partdefinition.addOrReplaceChild("kingsword",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5F, -6.0F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(5, 36)
						.addBox(-0.5F, -5.0F, -3.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 34)
						.addBox(0.0F, -5.5F, -4.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(0.0F, -5.5F, 2.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 37)
						.addBox(-0.5F, -5.0F, 2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(0.0F, -7.0F, -3.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-0.5F, -10.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 26)
						.addBox(-0.5F, -3.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(35, 7)
						.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 37)
						.addBox(-0.5F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 9)
						.addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 17)
						.addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(35, 12)
						.addBox(0.0F, 3.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-0.5F, -15.0F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(7, 28)
						.addBox(-0.5F, -20.0F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 10)
						.addBox(-1.0F, -6.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 18)
						.addBox(-1.0F, -10.0F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 26)
						.addBox(-1.0F, -15.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 0)
						.addBox(-1.0F, -20.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 32)
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 34)
						.addBox(-0.5F, -25.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(0.0F, -21.0F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 28)
						.addBox(0.0F, -27.0F, -1.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 0)
						.addBox(0.0F, -11.0F, -2.5F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(11, 18)
						.addBox(0.0F, -16.0F, -2.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		kingsword.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}