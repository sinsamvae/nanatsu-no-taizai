// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelchickenmatango<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "chickenmatango"), "main");
	private final ModelPart Chicken_Matango;

	public Modelchickenmatango(ModelPart root) {
		this.Chicken_Matango = root.getChild("Chicken_Matango");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Chicken_Matango = partdefinition.addOrReplaceChild("Chicken_Matango", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition arms = Chicken_Matango.addOrReplaceChild("arms", CubeListBuilder.create(),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r1 = arms.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.25F, -3.75F, -2.5F, 10.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7427F, -26.72F, -1.5F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r2 = arms.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -3.75F, -2.5F, 10.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.25F, -26.0F, -1.5F, 0.0F, 0.0F, -0.4363F));

		PartDefinition body = Chicken_Matango.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(126, 0)
						.addBox(-14.0F, -55.0F, -11.0F, 27.0F, 13.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(107, 99)
						.addBox(-13.0F, -42.0F, -11.0F, 25.0F, 18.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 99)
						.addBox(-14.0F, -24.0F, -12.0F, 27.0F, 33.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(182, 74)
						.addBox(-13.0F, -23.0F, -15.0F, 25.0F, 31.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 159)
						.addBox(-13.0F, -23.0F, 13.0F, 25.0F, 31.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(138, 142)
						.addBox(-17.0F, -23.0F, -11.0F, 3.0F, 31.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(83, 142)
						.addBox(13.0F, -23.0F, -11.0F, 3.0F, 31.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(-2, -2)
						.addBox(-22.7F, -4.7F, -20.6F, 44.0F, 7.0F, 43.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-18.7F, -15.7F, -17.6F, 37.0F, 11.0F, 37.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3F, -57.3F, 0.6F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Chicken_Matango.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}