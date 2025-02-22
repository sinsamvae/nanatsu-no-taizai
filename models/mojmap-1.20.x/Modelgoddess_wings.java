// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgoddess_wings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "goddess_wings"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelgoddess_wings(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(31, 53).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.7086F, -1.0112F, 4.7157F, 0.6353F, -0.4981F, -0.9959F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(58, 53).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.391F, -2.5259F, 5.3981F, 0.7459F, -0.274F, -1.2859F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(6, 0).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.8529F, -4.2107F, 6.86F, -0.3655F, -0.7119F, 0.5299F));

		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(56, 22).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.7575F, -3.184F, 7.7646F, -0.6863F, -0.4176F, 1.1111F));

		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(40, 0).mirror()
						.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.9861F, -0.2617F, 8.9932F, -0.7363F, -0.3035F, 1.2523F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(47, 44).mirror()
						.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.5907F, 2.4505F, 9.5979F, -0.7777F, -0.1231F, 1.4468F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(31, 46).mirror()
						.addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.8633F, 5.3787F, 9.8704F, -0.7835F, -0.0617F, 1.509F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(24, 60).mirror()
						.addBox(-1.5F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.001F, 8.3498F, 10.0081F, -0.7849F, -0.0308F, 1.5399F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(21, 43).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.1395F, 13.8237F, 10.1466F, -0.7854F, 0.0F, 1.5708F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(10, 55).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.109F, 15.801F, 10.1161F, -0.7849F, 0.0308F, 1.6017F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(3, 51).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(9.009F, 16.851F, 10.0161F, -0.7849F, 0.0308F, 1.6017F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(20, 53).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0849F, -3.9947F, 6.092F, 0.6155F, -0.5236F, -0.9553F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(54, 62).mirror()
						.addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.3964F, 0.75F, 2.4036F, 0.3655F, -0.7119F, -0.5299F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(54, 62).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3964F, 0.75F, 2.4036F, 0.3655F, 0.7119F, 0.5299F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(31, 53).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7086F, -1.0112F, 4.7157F, 0.6353F, 0.4981F, 0.9959F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(58, 53).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.391F, -2.5259F, 5.3981F, 0.7459F, 0.274F, 1.2859F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(6, 0).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8529F, -4.2107F, 6.86F, -0.3655F, 0.7119F, -0.5299F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(56, 22).addBox(-2.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7575F, -3.184F, 7.7646F, -0.6863F, 0.4176F, -1.1111F));

		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(40, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.9861F, -0.2617F, 8.9932F, -0.7363F, 0.3035F, -1.2523F));

		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(47, 44).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5907F, 2.4505F, 9.5979F, -0.7777F, 0.1231F, -1.4468F));

		PartDefinition cube_r21 = Body.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(31, 46).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.8633F, 5.3787F, 9.8704F, -0.7835F, 0.0617F, -1.509F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(24, 60).addBox(-4.5F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.001F, 8.3498F, 10.0081F, -0.7849F, 0.0308F, -1.5399F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(21, 43).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.1395F, 13.8237F, 10.1466F, -0.7854F, 0.0F, -1.5708F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(10, 55).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.109F, 15.801F, 10.1161F, -0.7849F, -0.0308F, -1.6017F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(3, 51).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-9.009F, 16.851F, 10.0161F, -0.7849F, -0.0308F, -1.6017F));

		PartDefinition cube_r26 = Body.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(20, 53).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0849F, -3.9947F, 6.092F, 0.6155F, 0.5236F, 0.9553F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -11.0F, -2.0F, 0.0F, 24.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4142F, 6.0F, 3.4142F, 0.0F, -0.7854F, 0.0F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, -11.0F, -2.0F, 0.0F, 24.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4142F, 6.0F, 3.4142F, 0.0F, 0.7854F, 0.0F));

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
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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