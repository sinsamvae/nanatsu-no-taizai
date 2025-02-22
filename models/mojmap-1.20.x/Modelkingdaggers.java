// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelkingdaggers<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kingdaggers"), "main");
	private final ModelPart kingsdagger;

	public Modelkingdaggers(ModelPart root) {
		this.kingsdagger = root.getChild("kingsdagger");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition kingsdagger = partdefinition.addOrReplaceChild("kingsdagger", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(36, 25).addBox(-1.0F, -1.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.85F))
				.texOffs(36, 35).addBox(-1.2F, -1.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.851F))
				.texOffs(9, 40).addBox(-1.348F, -1.85F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.852F))
				.texOffs(18, 40).addBox(-0.648F, -1.85F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.852F))
				.texOffs(0, 40).addBox(-0.8F, -1.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.851F))
				.texOffs(36, 30).addBox(-1.0F, -1.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.85F))
				.texOffs(9, 5).addBox(-1.5F, -2.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(0, 5)
				.addBox(-1.0F, -2.25F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(9, 0)
				.addBox(-1.0F, -2.25F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(9, 10)
				.addBox(-1.5F, -2.35F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(0, 10)
				.addBox(-1.5F, -2.35F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(18, 0)
				.addBox(-0.5F, -2.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(9, 15)
				.addBox(-0.5F, -2.35F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(0, 15)
				.addBox(-0.5F, -2.35F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(18, 15)
				.addBox(0.0F, -2.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(18, 10)
				.addBox(0.0F, -2.55F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(18, 5)
				.addBox(0.0F, -2.55F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(0, 35)
				.addBox(-1.0F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(27, 30)
				.addBox(-1.0F, -4.75F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(18, 30)
				.addBox(-1.0F, -4.75F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(9, 30)
				.addBox(-1.5F, -4.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(0, 30)
				.addBox(-1.5F, -4.65F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(27, 25)
				.addBox(-1.5F, -4.65F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(27, 20)
				.addBox(-0.5F, -4.65F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(27, 15)
				.addBox(-0.5F, -4.65F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(27, 10)
				.addBox(-0.5F, -4.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(0, 45)
				.addBox(-1.0F, -5.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(45, 0)
				.addBox(-0.752F, -6.05F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.752F)).texOffs(45, 5)
				.addBox(-1.248F, -6.05F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.752F)).texOffs(36, 40)
				.addBox(-0.7F, -5.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.752F)).texOffs(27, 40)
				.addBox(-1.3F, -5.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.752F)).texOffs(36, 60)
				.addBox(-1.4F, -5.798F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7515F)).texOffs(36, 60)
				.addBox(-1.747F, -5.948F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7525F)).texOffs(36, 60)
				.mirror().addBox(-0.253F, -5.948F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7525F)).mirror(false)
				.texOffs(27, 60).addBox(-0.6F, -5.798F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7515F))
				.texOffs(54, 60).addBox(-0.35F, -6.046F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.751F))
				.texOffs(63, 0).addBox(-0.002F, -6.046F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.752F))
				.texOffs(63, 5).addBox(-1.998F, -6.046F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.752F))
				.texOffs(45, 60).addBox(-1.65F, -6.046F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.751F))
				.texOffs(63, 10).addBox(-0.55F, -6.542F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.751F))
				.texOffs(63, 20).addBox(-0.15F, -6.542F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.752F))
				.texOffs(63, 25).addBox(-1.85F, -6.542F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.752F))
				.texOffs(63, 15).addBox(-1.7F, -6.542F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.751F))
				.texOffs(18, 45).addBox(-1.248F, -6.546F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.752F))
				.texOffs(45, 15).addBox(-0.752F, -6.546F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.752F))
				.texOffs(45, 30).addBox(-0.752F, -6.796F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.753F))
				.texOffs(27, 45).addBox(-1.248F, -6.796F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.753F))
				.texOffs(63, 55).addBox(-0.55F, -6.792F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.754F))
				.texOffs(63, 50).addBox(-1.7F, -6.792F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.754F))
				.texOffs(63, 45).addBox(-0.15F, -6.792F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.753F))
				.texOffs(63, 40).addBox(-1.85F, -6.792F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.753F))
				.texOffs(63, 35).addBox(-0.3F, -7.242F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7555F))
				.texOffs(45, 25).addBox(-0.755F, -7.246F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(63, 30).addBox(-1.7F, -7.242F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7555F))
				.texOffs(45, 20).addBox(-1.245F, -7.246F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(36, 45).addBox(-1.245F, -7.735F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(0, 65).addBox(-1.7F, -7.731F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7555F))
				.texOffs(45, 35).addBox(-0.755F, -7.735F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(63, 60).addBox(-0.3F, -7.731F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7555F))
				.texOffs(45, 45).addBox(-0.755F, -8.224F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(18, 65).addBox(-1.45F, -8.22F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7555F))
				.texOffs(9, 65).addBox(-0.55F, -8.22F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7555F))
				.texOffs(45, 40).addBox(-1.245F, -8.224F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(9, 50).addBox(-1.245F, -9.203F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(36, 50).addBox(-1.0F, -9.693F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(45, 50).addBox(-1.0F, -10.083F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.855F))
				.texOffs(54, 0).addBox(-1.0F, -10.323F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9F))
				.texOffs(36, 65).addBox(-0.55F, -8.709F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7555F))
				.texOffs(27, 65).addBox(-1.45F, -8.709F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7555F))
				.texOffs(0, 50).addBox(-0.755F, -9.203F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(27, 50).addBox(-1.245F, -8.713F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(18, 50).addBox(-0.755F, -8.713F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.755F))
				.texOffs(27, 5).addBox(0.0F, -4.45F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(27, 0).addBox(0.0F, -4.45F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(18, 25).addBox(0.0F, -4.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(36, 20).addBox(-2.0F, -2.55F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(36, 15).addBox(-2.0F, -2.55F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(36, 10).addBox(-2.0F, -2.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(36, 5).addBox(-2.0F, -4.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(36, 0).addBox(-2.0F, -4.45F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(27, 35).addBox(-2.0F, -4.45F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(9, 45).addBox(-1.25F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(45, 10).addBox(-0.75F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r1 = kingsdagger.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(54, 35)
						.addBox(-1.0F, -1.275F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(54, 40)
						.addBox(-1.0F, -1.025F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(54, 45)
						.addBox(-1.0F, -1.025F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(54, 55)
						.addBox(-0.5F, -1.175F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(0, 60)
						.addBox(-0.5F, -0.925F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(9, 60)
						.addBox(-0.5F, -0.925F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(54, 50)
						.addBox(-1.5F, -0.925F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(0, 55)
						.addBox(-1.5F, -0.925F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(9, 55)
						.addBox(-1.5F, -1.175F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(18, 35)
						.addBox(-2.0F, -0.975F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(18, 60)
						.addBox(0.0F, -0.975F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)),
				PartPose.offsetAndRotation(-1.25F, -2.475F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = kingsdagger.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(18, 55)
						.addBox(-2.0F, -0.975F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(9, 35)
						.addBox(0.0F, -0.975F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(54, 5)
						.addBox(-0.5F, -1.175F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(54, 10)
						.addBox(-0.5F, -0.925F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(54, 15)
						.addBox(-0.5F, -0.925F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(27, 55)
						.addBox(-1.5F, -0.925F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(36, 55)
						.addBox(-1.5F, -0.925F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(45, 55)
						.addBox(-1.5F, -1.175F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(54, 20)
						.addBox(-1.0F, -1.025F, -1.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(54, 25)
						.addBox(-1.0F, -1.025F, -0.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).texOffs(54, 30)
						.addBox(-1.0F, -1.275F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)),
				PartPose.offsetAndRotation(1.25F, -2.475F, 0.0F, 0.0F, 0.0F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		kingsdagger.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}