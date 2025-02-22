// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelkillericebergb<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "killericebergb"), "main");
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart bone6;
	private final ModelPart bone4;
	private final ModelPart bone2;
	private final ModelPart bone5;

	public Modelkillericebergb(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone3 = root.getChild("bone3");
		this.bone6 = root.getChild("bone6");
		this.bone4 = root.getChild("bone4");
		this.bone2 = root.getChild("bone2");
		this.bone5 = root.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 1.0F, 7.45F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 8.0F, -8.55F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 8.0F, 11.45F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.0F, 0.0F, -8.55F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -5.0F, 1.45F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(-10, -5)
						.addBox(-2.0F, -2.0F, -8.45F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
						.addBox(-1.75F, -1.75F, -9.45F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-1.5F, -1.5F, -10.45F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-1.5F, -1.5F, 8.3F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-1.75F, -1.75F, 7.55F, 3.5F, 3.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-18.0F, -5.0F, 11.45F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}