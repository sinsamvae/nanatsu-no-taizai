// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCrazy_Prominence<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "crazy_prominence"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;

	public ModelCrazy_Prominence(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 3)
						.addBox(-14.0F, -16.0F, 0.8125F, 15.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(-13.0F, -17.0F, 1.8125F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(-13.0F, -1.0F, 1.8125F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(14, 17)
						.addBox(-13.0F, -15.0F, 15.8125F, 13.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 17)
						.addBox(-13.0F, -15.0F, -0.1875F, 13.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(1.0F, -15.0F, 1.8125F, 1.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(-15.0F, -15.0F, 1.8125F, 1.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 14.0F, -8.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 3)
						.addBox(-7.5F, -7.5F, -7.5F, 15.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(-6.5F, -8.5F, -6.5F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(-6.5F, 7.5F, -6.5F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(14, 17)
						.addBox(-6.5F, -6.5F, 7.5F, 13.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 17)
						.addBox(-6.5F, -6.5F, -8.5F, 13.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(7.5F, -6.5F, -6.5F, 1.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(-8.5F, -6.5F, -6.5F, 1.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-15.5F, -13.5F, -10.6875F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 3)
						.addBox(-7.5F, -7.5F, -7.5F, 15.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(-6.5F, -8.5F, -6.5F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(-6.5F, 7.5F, -6.5F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(14, 17)
						.addBox(-6.5F, -6.5F, 7.5F, 13.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 17)
						.addBox(-6.5F, -6.5F, -8.5F, 13.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(7.5F, -6.5F, -6.5F, 1.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
						.addBox(-8.5F, -6.5F, -6.5F, 1.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(19.5F, -9.5F, 14.3125F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}