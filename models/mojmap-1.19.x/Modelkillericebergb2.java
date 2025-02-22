// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelkillericebergb2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "killericebergb2"), "main");
	private final ModelPart bone7;

	public Modelkillericebergb2(ModelPart root) {
		this.bone7 = root.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition bone5 = bone7.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-18.0F, -29.0F, 11.45F));

		PartDefinition bone2 = bone7.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -29.0F, 1.45F));

		PartDefinition bone4 = bone7.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.0F, -24.0F, -8.55F));

		PartDefinition bone6 = bone7.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, -16.0F, 11.45F));

		PartDefinition bone3 = bone7.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -16.0F, -8.55F));

		PartDefinition bone = bone7.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -23.0F, 7.45F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}