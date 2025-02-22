// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDeathball<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "deathball"), "main");
	private final ModelPart Inside;
	private final ModelPart Outside;

	public ModelDeathball(ModelPart root) {
		this.Inside = root.getChild("Inside");
		this.Outside = root.getChild("Outside");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Inside = partdefinition.addOrReplaceChild("Inside", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = Inside.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 1)
				.addBox(-12.5F, -13.0F, 0.5F, 12.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(36, 32)
				.addBox(-13.5F, -12.0F, 1.5F, 1.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
				.addBox(-0.5F, -12.0F, 1.5F, 1.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
				.addBox(-12.1637F, -12.0F, -0.75F, 11.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 29)
				.addBox(-12.1637F, -12.0F, 13.75F, 11.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 0.0F, -8.0F));

		PartDefinition Outside = partdefinition.addOrReplaceChild("Outside", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone2 = Outside.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(62, 93)
				.addBox(-14.5F, -17.5F, -1.5F, 16.0F, 18.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(62, 93)
				.addBox(-15.25F, -16.0F, -0.5F, 1.0F, 16.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(62, 93)
				.addBox(1.3125F, -16.0F, 0.5F, 1.0F, 16.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(62, 93)
				.addBox(-13.2262F, -16.25F, -2.25F, 13.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 93)
				.addBox(-12.6637F, -16.75F, 15.3125F, 13.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 0.0F, -8.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Inside.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Outside.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}