// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpeaceamulet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "peaceamulet"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart bracelet;
	private final ModelPart LeftArm;

	public Modelpeaceamulet(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.bracelet = this.RightArm.getChild("bracelet");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(17, 33)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition bracelet = RightArm.addOrReplaceChild("bracelet",
				CubeListBuilder.create().texOffs(19, 18).addBox(-2.55F, -1.1F, -2.0F, 5.0F, 2.0F, 4.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-0.95F, 7.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r1 = bracelet.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 9).addBox(-3.5F, -1.5F, -3.5F, 7.0F, 2.0F, 6.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-0.8F, 0.55F, 0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r2 = bracelet.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -1.5F, -3.5F, 7.0F, 2.0F, 6.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.3F, -0.55F, 0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r3 = bracelet.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 18).addBox(-2.5F, -1.5F, -2.5F, 5.0F, 2.0F, 4.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.bracelet.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}