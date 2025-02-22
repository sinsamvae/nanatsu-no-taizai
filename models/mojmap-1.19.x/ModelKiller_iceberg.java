// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelKiller_iceberg<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "killer_iceberg"), "main");
	private final ModelPart bone;

	public ModelKiller_iceberg(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.0637F, 6.0346F, 0.0441F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 6)
						.addBox(-0.1126F, -0.9256F, -6.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.4619F, -0.8499F, -6.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(0.6645F, -0.5236F, -5.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 50)
						.addBox(0.0645F, -0.8236F, -5.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
						.addBox(-0.9497F, -1.3378F, -5.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 46)
						.addBox(-1.2376F, -1.6256F, -5.45F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 48)
						.addBox(0.4645F, -0.9236F, -5.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 48)
						.addBox(-2.1747F, -1.2628F, -4.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 31)
						.addBox(-1.9747F, -2.3628F, -4.55F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 21)
						.addBox(-2.4247F, -2.5628F, -4.25F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 21)
						.addBox(-2.1247F, -2.8628F, -3.95F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-1.4747F, 1.4622F, -3.85F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 0)
						.addBox(-1.9747F, 1.1622F, -4.25F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0087F, 0.2398F, 0.0059F, 3.1416F, 0.0F, 2.3562F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 31)
						.addBox(-1.2769F, 0.5533F, -4.85F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(29, 38)
						.addBox(-1.7769F, 0.6533F, -4.25F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0087F, 0.2398F, 0.0059F, -3.1416F, 0.0F, 0.7418F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(40, 0)
						.addBox(-1.7769F, 0.6533F, -4.25F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 38)
						.addBox(-1.2769F, 0.5533F, -4.85F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0087F, 0.2398F, 0.0059F, 0.0F, 0.0F, 2.3998F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 34)
				.addBox(-1.4747F, 1.4622F, -3.85F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 7)
				.addBox(-1.9747F, 1.1622F, -4.25F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 28)
				.addBox(-2.1747F, -1.2628F, -4.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 45)
				.addBox(-1.9747F, -2.3628F, -4.55F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
				.addBox(-2.4247F, -2.5628F, -4.25F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 43)
				.addBox(-2.1247F, -2.8628F, -3.95F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
				.addBox(-1.2376F, -1.6256F, -5.45F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 21)
				.addBox(-0.9497F, -1.3378F, -5.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 50)
				.addBox(0.0645F, -0.8236F, -5.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 6)
				.addBox(0.6645F, -0.5236F, -5.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 13)
				.addBox(0.4645F, -0.9236F, -5.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 6)
				.addBox(-0.4619F, -0.8499F, -6.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
				.addBox(-0.1126F, -0.9256F, -6.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.2497F, -0.6378F, -7.05F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
				.addBox(-0.7548F, -1.1428F, -6.05F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(21, 6)
				.addBox(-1.7548F, -2.1428F, -5.05F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(23, 25)
				.addBox(-2.7548F, -3.1428F, -3.05F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0087F, 0.2398F, 0.0059F, 0.0F, 0.0F, 0.7854F));

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