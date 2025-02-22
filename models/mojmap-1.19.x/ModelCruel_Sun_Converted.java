// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCruel_Sun_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cruel_sun_converted"), "main");
	private final ModelPart bone;

	public ModelCruel_Sun_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(24, 38)
						.addBox(-26.0F, -29.0F, -7.1875F, 32.0F, 32.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-26.0F, -28.0F, -8.625F, 32.0F, 31.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(12, 2)
						.addBox(-28.0F, -28.0625F, -6.75F, 24.0F, 31.0F, 31.0F, new CubeDeformation(0.0F))
						.texOffs(14, 2).addBox(-16.0F, -28.125F, -7.0F, 24.0F, 31.0F, 31.0F, new CubeDeformation(0.0F))
						.texOffs(3, 4).addBox(-26.0F, -28.0F, 3.125F, 32.0F, 31.0F, 23.0F, new CubeDeformation(0.0F))
						.texOffs(0, 3).addBox(-26.0F, -30.5F, -6.0625F, 32.0F, 24.0F, 30.0F, new CubeDeformation(0.0F))
						.texOffs(0, 10).addBox(-26.0F, -19.5F, -6.0F, 32.0F, 24.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
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