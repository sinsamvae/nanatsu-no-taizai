// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHail_Bullet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hail_bullet"), "main");
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart bone4;
	private final ModelPart bone3;
	private final ModelPart bone2;

	public ModelHail_Bullet(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone5 = root.getChild("bone5");
		this.bone4 = root.getChild("bone4");
		this.bone3 = root.getChild("bone3");
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.85F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.75F, -1.75F, -2.6F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.5F, -1.5F, -3.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.5F, -1.5F, -1.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-1.75F, -1.75F, -1.35F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 6.0F, 0.85F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.85F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.75F, -1.75F, -2.6F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.5F, -1.5F, -3.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.5F, -1.5F, -1.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-1.75F, -1.75F, -1.35F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 2.0F, 0.85F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.85F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.75F, -1.75F, -2.6F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.5F, -1.5F, -3.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.5F, -1.5F, -1.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-1.75F, -1.75F, -1.35F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 13.5F, 2.85F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.85F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.75F, -1.75F, -2.6F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.5F, -1.5F, -3.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.5F, -1.5F, -1.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-1.75F, -1.75F, -1.35F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 4.0F, -5.15F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.85F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.75F, -1.75F, -2.6F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.5F, -1.5F, -3.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.5F, -1.5F, -1.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-1.75F, -1.75F, -1.35F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 12.5F, -3.4F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}