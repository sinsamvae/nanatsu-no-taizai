// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelkings_spear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kings_spear"), "main");
	private final ModelPart kingsspear;

	public Modelkings_spear(ModelPart root) {
		this.kingsspear = root.getChild("kingsspear");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition kingsspear = partdefinition.addOrReplaceChild("kingsspear",
				CubeListBuilder.create().texOffs(12, 3)
						.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(7, 0)
						.addBox(-1.0F, -6.55F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(0, 9)
						.addBox(-1.0F, -9.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(12, 0)
						.addBox(-1.5F, 1.35F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).texOffs(11, 11)
						.addBox(-1.5F, 1.95F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).texOffs(5, 9)
						.addBox(-1.5F, 2.65F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).texOffs(14, 25)
						.addBox(-0.5F, 1.65F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).texOffs(23, 24)
						.addBox(-1.5F, 2.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).texOffs(9, 24)
						.addBox(-1.0F, -10.76F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(23, 17)
						.addBox(-1.0F, -11.26F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(0, 0)
						.addBox(-0.5F, -14.71F, -2.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-1.0F, -10.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(23, 20)
						.addBox(-1.0F, -8.8F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(0, 24)
						.addBox(-1.0F, -9.51F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)),
				PartPose.offset(0.5F, 21.0F, 0.5F));

		PartDefinition cube_r1 = kingsspear.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(27, 3)
						.addBox(-0.693F, 0.14F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)).texOffs(18, 12)
						.addBox(-0.693F, 0.0F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.8974F, -8.2263F, -0.5F, 0.3518F, 0.123F, -0.1295F));

		PartDefinition cube_r2 = kingsspear.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(19, 26)
						.addBox(-0.693F, 0.14F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)).texOffs(4, 26)
						.addBox(-0.693F, 0.0F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.8974F, -8.2263F, -0.5F, -0.3518F, -0.123F, -0.1295F));

		PartDefinition cube_r3 = kingsspear.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 18)
				.addBox(-0.6146F, -0.6439F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.41F)).texOffs(17, 3)
				.addBox(-0.6239F, -0.7738F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.8974F, -8.2263F, -0.5F, 0.3556F, -0.1111F, 0.4831F));

		PartDefinition cube_r4 = kingsspear.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 17)
				.addBox(-0.554F, -0.5774F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(17, 9)
				.addBox(-0.554F, -0.2574F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(9, 17)
				.addBox(-0.554F, -0.0974F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(17, 6)
				.addBox(-0.554F, -0.4174F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)),
				PartPose.offsetAndRotation(-0.8974F, -8.2263F, -0.5F, 0.3716F, 0.0141F, 0.1567F));

		PartDefinition cube_r5 = kingsspear.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(4, 16)
				.addBox(-0.554F, -0.0974F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(14, 14)
				.addBox(-0.554F, -0.2574F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(9, 14)
				.addBox(-0.554F, -0.4174F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(0, 14)
				.addBox(-0.554F, -0.5774F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)),
				PartPose.offsetAndRotation(-0.8974F, -8.2263F, -0.5F, -0.3716F, -0.0141F, 0.1567F));

		PartDefinition cube_r6 = kingsspear.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 7)
				.addBox(-0.6146F, -0.6439F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.41F)).texOffs(5, 12)
				.addBox(-0.6239F, -0.7738F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.8974F, -8.2263F, -0.5F, -0.3556F, 0.1111F, 0.4831F));

		PartDefinition cube_r7 = kingsspear.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 3)
				.addBox(-0.3761F, -0.7738F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(5, 19)
				.addBox(-0.3854F, -0.6439F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.41F)),
				PartPose.offsetAndRotation(-0.1026F, -8.2263F, -0.5F, 0.3556F, 0.1111F, -0.4831F));

		PartDefinition cube_r8 = kingsspear.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 21)
				.addBox(-0.446F, -0.4174F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(10, 20)
				.addBox(-0.446F, -0.0974F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(18, 19)
				.addBox(-0.446F, -0.2574F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(19, 15)
				.addBox(-0.446F, -0.5774F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)),
				PartPose.offsetAndRotation(-0.1026F, -8.2263F, -0.5F, 0.3716F, -0.0141F, -0.1567F));

		PartDefinition cube_r9 = kingsspear.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(19, 0)
						.addBox(-0.307F, 0.0F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)).texOffs(27, 6)
						.addBox(-0.307F, 0.14F, -0.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.1026F, -8.2263F, -0.5F, 0.3518F, -0.123F, 0.1295F));

		PartDefinition cube_r10 = kingsspear.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(9, 27)
						.addBox(-0.307F, 0.14F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)).texOffs(27, 9)
						.addBox(-0.307F, 0.0F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)),
				PartPose.offsetAndRotation(-0.1026F, -8.2263F, -0.5F, -0.3518F, 0.123F, 0.1295F));

		PartDefinition cube_r11 = kingsspear.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(5, 22)
				.addBox(-0.446F, -0.0974F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(22, 6)
				.addBox(-0.446F, -0.2574F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(22, 9)
				.addBox(-0.446F, -0.4174F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)).texOffs(14, 22)
				.addBox(-0.446F, -0.5774F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.42F)),
				PartPose.offsetAndRotation(-0.1026F, -8.2263F, -0.5F, -0.3716F, 0.0141F, -0.1567F));

		PartDefinition cube_r12 = kingsspear.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 22)
				.addBox(-0.3854F, -0.6439F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.41F)).texOffs(23, 12)
				.addBox(-0.3761F, -0.7738F, -0.9731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.1026F, -8.2263F, -0.5F, -0.3556F, -0.1111F, -0.4831F));

		PartDefinition cube_r13 = kingsspear.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -12.21F, -0.5F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		kingsspear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}