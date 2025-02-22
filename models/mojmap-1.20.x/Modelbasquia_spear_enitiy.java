// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbasquia_spear_enitiy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "basquia_spear_enitiy"), "main");
	private final ModelPart GloxianaSpear;

	public Modelbasquia_spear_enitiy(ModelPart root) {
		this.GloxianaSpear = root.getChild("GloxianaSpear");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition GloxianaSpear = partdefinition.addOrReplaceChild("GloxianaSpear", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-0.65F, -2.0F, -0.65F, 1.3F, 26.0F, 1.3F, new CubeDeformation(0.0F))
				.texOffs(23, 13).addBox(-0.65F, -2.5F, -0.85F, 1.3F, 0.5F, 1.7F, new CubeDeformation(0.0F))
				.texOffs(16, 14).addBox(-0.65F, -3.25F, -1.05F, 1.3F, 0.75F, 2.1F, new CubeDeformation(0.0F))
				.texOffs(16, 6).addBox(-0.6F, -4.0F, -1.15F, 1.2F, 0.75F, 2.3F, new CubeDeformation(0.0F))
				.texOffs(7, 11).addBox(-0.6F, -5.0F, -1.45F, 1.2F, 1.0F, 2.9F, new CubeDeformation(0.0F)).texOffs(7, 6)
				.addBox(-0.55F, -6.0F, -1.75F, 1.1F, 1.0F, 3.5F, new CubeDeformation(0.0F)).texOffs(7, 0)
				.addBox(-0.55F, -7.0F, -2.0F, 1.1F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(21, 18)
				.addBox(-0.5F, -16.0964F, -1.1461F, 1.0F, 0.7F, 1.9096F, new CubeDeformation(0.0F)).texOffs(25, 0)
				.addBox(-0.5F, -18.5464F, -0.6461F, 1.0F, 2.45F, 0.9F, new CubeDeformation(0.0F)).texOffs(7, 16)
				.addBox(-0.475F, -19.1964F, -1.1961F, 0.95F, 0.7F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 22)
				.addBox(-0.475F, -19.6964F, -1.0961F, 0.95F, 0.5F, 1.8F, new CubeDeformation(0.0F)).texOffs(28, 20)
				.addBox(-0.475F, -20.1964F, -0.8961F, 0.95F, 0.5F, 1.4F, new CubeDeformation(0.0F)).texOffs(35, 4)
				.addBox(-0.475F, -20.6964F, -0.6961F, 0.95F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 12)
				.addBox(-0.475F, -21.1964F, -0.4961F, 0.95F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(18, 5)
				.addBox(-0.475F, -21.2964F, -0.2961F, 0.95F, 0.1F, 0.2F, new CubeDeformation(0.0F)).texOffs(22, 26)
				.addBox(-0.125F, -15.3964F, -1.1461F, 0.25F, 0.45F, 1.9096F, new CubeDeformation(0.0F)).texOffs(7, 20)
				.addBox(-0.5F, -7.1964F, -1.1461F, 1.0F, 0.7F, 1.9096F, new CubeDeformation(0.0F)).texOffs(2, 28)
				.addBox(-0.125F, -7.6464F, -1.1461F, 0.25F, 0.45F, 1.9096F, new CubeDeformation(0.0F)).texOffs(12, 29)
				.addBox(-0.5F, -12.2512F, 3.9087F, 1.0F, 1.9096F, 0.7F, new CubeDeformation(0.0F)).texOffs(21, 33)
				.addBox(-0.125F, -12.2512F, 3.4587F, 0.25F, 1.9096F, 0.45F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 1.5708F, -3.1416F));

		PartDefinition cube_r1 = GloxianaSpear.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 33)
				.addBox(-0.125F, -11.2239F, 13.4932F, 0.25F, 1.9096F, 0.45F, new CubeDeformation(0.0F)).texOffs(30, 10)
				.addBox(-0.5F, -11.2239F, 13.9432F, 1.0F, 1.9096F, 0.7F, new CubeDeformation(0.0F)).texOffs(35, 6)
				.addBox(-0.675F, 15.8145F, -16.5699F, 1.35F, 0.6F, 0.6F, new CubeDeformation(0.0F)).texOffs(18, 0)
				.addBox(-0.725F, 14.2866F, -15.942F, 1.45F, 1.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.9252F, 0.1099F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = GloxianaSpear.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 33)
				.addBox(-0.125F, -14.2091F, 8.8141F, 0.25F, 1.9096F, 0.45F, new CubeDeformation(0.0F)).texOffs(31, 22)
				.addBox(-0.5F, -14.2091F, 9.2641F, 1.0F, 1.9096F, 0.7F, new CubeDeformation(0.0F)).texOffs(35, 9)
				.addBox(0.0F, -8.4543F, 4.9593F, 0.0F, 1.2F, 1.1596F, new CubeDeformation(0.0F)).texOffs(30, 0)
				.addBox(-0.125F, -9.6043F, 4.2093F, 0.25F, 0.45F, 1.9096F, new CubeDeformation(0.0F)).texOffs(23, 9)
				.addBox(-0.5F, -9.1543F, 4.2093F, 1.0F, 0.7F, 1.9096F, new CubeDeformation(0.0F)).texOffs(28, 17)
				.addBox(-0.125F, -17.3543F, 4.2093F, 0.25F, 0.45F, 1.9096F, new CubeDeformation(0.0F)).texOffs(14, 18)
				.addBox(-0.5F, -18.0543F, 4.2093F, 1.0F, 0.7F, 1.9096F, new CubeDeformation(0.0F)).texOffs(30, 3)
				.addBox(-0.5F, -19.916F, 8.0265F, 1.0F, 0.9F, 1.2F, new CubeDeformation(0.0F)).texOffs(30, 6)
				.addBox(-0.7F, 19.2998F, -9.2612F, 1.4F, 1.65F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.9252F, 0.1099F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = GloxianaSpear.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 33)
				.addBox(-0.125F, -13.9786F, -2.0706F, 0.25F, 1.9096F, 0.45F, new CubeDeformation(0.0F)).texOffs(17, 29)
				.addBox(-0.5F, -13.9786F, -1.6206F, 1.0F, 1.9096F, 0.7F, new CubeDeformation(0.0F)).texOffs(11, 33)
				.addBox(-0.5F, -13.9786F, -10.5206F, 1.0F, 0.9096F, 0.7F, new CubeDeformation(0.0F)).texOffs(14, 16)
				.addBox(-0.125F, -13.9786F, -9.8206F, 0.25F, 0.6596F, 0.45F, new CubeDeformation(0.0F)).texOffs(32, 26)
				.addBox(-0.5F, -22.5318F, -9.7919F, 1.0F, 2.85F, 0.25F, new CubeDeformation(0.0F)).texOffs(7, 28)
				.addBox(-0.5F, -19.6818F, -9.7919F, 1.0F, 0.9F, 1.2F, new CubeDeformation(0.0F)).texOffs(27, 26)
				.addBox(-0.125F, -17.1238F, -6.6754F, 0.25F, 0.45F, 1.9096F, new CubeDeformation(0.0F)).texOffs(23, 5)
				.addBox(-0.5F, -17.8238F, -6.6754F, 1.0F, 0.7F, 1.9096F, new CubeDeformation(0.0F)).texOffs(21, 22)
				.addBox(-0.125F, -9.3738F, -6.9254F, 0.25F, 0.45F, 2.1596F, new CubeDeformation(0.0F)).texOffs(16, 10)
				.addBox(-0.5F, -8.9238F, -7.1754F, 1.0F, 0.7F, 2.4096F, new CubeDeformation(0.0F)).texOffs(17, 25)
				.addBox(-0.7F, 19.3839F, 8.2582F, 1.4F, 1.65F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.9252F, 0.1099F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = GloxianaSpear.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 33)
				.addBox(-0.125F, -10.798F, -6.6192F, 0.25F, 1.9096F, 0.45F, new CubeDeformation(0.0F)).texOffs(22, 29)
				.addBox(-0.5F, -10.798F, -6.1692F, 1.0F, 1.9096F, 0.7F, new CubeDeformation(0.0F)).texOffs(24, 33)
				.addBox(-0.125F, -10.798F, -14.3692F, 0.25F, 1.9096F, 0.45F, new CubeDeformation(0.0F)).texOffs(27, 29)
				.addBox(-0.5F, -10.798F, -15.0692F, 1.0F, 1.9096F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.9252F, 0.1099F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r5 = GloxianaSpear.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(32, 30).addBox(-0.5F, -22.6975F, 8.9765F, 1.0F, 2.85F, 0.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.8619F, 0.0837F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = GloxianaSpear.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(23, 17).addBox(-0.475F, -0.1F, -0.05F, 0.95F, 0.15F, 0.15F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.6387F, -0.2354F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		GloxianaSpear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}