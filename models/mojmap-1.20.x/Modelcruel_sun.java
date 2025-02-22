// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcruel_sun<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cruel_sun"), "main");
	private final ModelPart cruelsun;

	public Modelcruel_sun(ModelPart root) {
		this.cruelsun = root.getChild("cruelsun");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cruelsun = partdefinition.addOrReplaceChild("cruelsun",
				CubeListBuilder.create().texOffs(41, 0)
						.addBox(-4.05F, -5.25F, -4.05F, 8.1F, 8.5F, 8.1F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-10.05F, -10.25F, 0.0F, 20.1F, 18.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 18)
						.addBox(-3.5F, -6.0F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(41, 27)
						.addBox(-3.5F, 3.0F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(41, 36)
						.addBox(3.95F, -4.55F, -3.5F, 1.0F, 7.1F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-3.5F, -4.5F, -5.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 60)
						.addBox(-3.5F, -4.5F, 4.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 51)
						.addBox(-4.95F, -4.55F, -3.5F, 0.95F, 7.1F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition cube_r1 = cruelsun.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(26, 69).addBox(-3.5F, -3.5F, -0.5F, 2.05F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6213F, -1.0F, -2.1716F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r2 = cruelsun.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(70, 27).addBox(1.45F, -3.5F, -0.5F, 2.05F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6213F, -1.0F, -2.1716F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r3 = cruelsun.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(70, 18).addBox(1.45F, -3.5F, -0.5F, 2.05F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6213F, -1.0F, 2.1716F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r4 = cruelsun.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(19, 69).addBox(-3.5F, -3.5F, -0.5F, 2.05F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6213F, -1.0F, 2.1716F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r5 = cruelsun.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(34, 66).addBox(-3.5F, -0.5F, 1.4F, 7.0F, 1.0F, 2.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.1716F, -5.6213F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r6 = cruelsun.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(58, 54).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8536F, 2.9393F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r7 = cruelsun.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 69).addBox(-3.5F, -0.5F, -1.05F, 7.0F, 1.0F, 2.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.904F, 3.8889F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r8 = cruelsun.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(58, 45).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8536F, 2.9393F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r9 = cruelsun.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(58, 63).addBox(-3.5F, -0.5F, 1.4F, 7.0F, 1.0F, 2.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.1716F, -5.6213F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r10 = cruelsun.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(53, 67).addBox(-3.5F, -0.5F, -1.05F, 7.0F, 1.0F, 2.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.904F, 3.8889F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r11 = cruelsun.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(58, 36).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8536F, -4.9393F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r12 = cruelsun.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(58, 36).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8536F, -4.9393F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r13 = cruelsun.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 40).mirror()
						.addBox(-10.05F, -9.25F, 0.0F, 20.1F, 18.5F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cruelsun.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}