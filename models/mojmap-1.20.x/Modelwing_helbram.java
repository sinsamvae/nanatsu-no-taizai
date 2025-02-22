// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwing_helbram<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "wing_helbram"), "main");
	private final ModelPart body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelwing_helbram(ModelPart root) {
		this.body = root.getChild("body");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body_r1 = body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(19, 0).addBox(-1.9914F, 0.0F, -0.1305F, 9.0F, 19.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9914F, -23.9545F, 1.8692F, 0.0869F, 0.1308F, -0.0057F));

		PartDefinition Body_r2 = body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(34, 25).addBox(-5.0F, -2.0F, 0.0F, 9.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.3038F, -3.0354F, 3.0685F, 0.0433F, 0.1308F, -0.0057F));

		PartDefinition Body_r3 = body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(34, 20).addBox(-5.0F, -2.0F, 0.0F, 9.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3124F, -3.0297F, 3.1989F, 0.0433F, -0.1308F, 0.0057F));

		PartDefinition Body_r4 = body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0086F, 0.0F, -0.1305F, 9.0F, 19.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -23.9488F, 1.9996F, 0.0869F, -0.1308F, 0.0057F));

		PartDefinition Body_r5 = body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(0, 20).addBox(-8.0086F, 0.0F, -0.1305F, 8.0F, 19.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -24.0F, 2.0F, 0.1309F, -0.1309F, 0.0F));

		PartDefinition Body_r6 = body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(34, 35).addBox(-5.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3124F, -3.1532F, 4.1106F, 0.0873F, -0.1309F, 0.0F));

		PartDefinition Body_r7 = body.addOrReplaceChild("Body_r7",
				CubeListBuilder.create().texOffs(34, 30).addBox(-3.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3124F, -3.1532F, 4.1106F, 0.0873F, 0.1309F, 0.0F));

		PartDefinition Body_r8 = body.addOrReplaceChild("Body_r8",
				CubeListBuilder.create().texOffs(17, 20).addBox(0.0086F, 0.0F, -0.1305F, 8.0F, 19.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -24.0F, 2.0F, 0.1309F, 0.1309F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}