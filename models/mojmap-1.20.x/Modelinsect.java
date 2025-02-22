// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelinsect<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "insect"), "main");
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart leftleg1;
	private final ModelPart rightleg1;
	private final ModelPart neckquestionmark;
	private final ModelPart head;
	private final ModelPart body3;
	private final ModelPart back;
	private final ModelPart leftleg2;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart leftleg3;
	private final ModelPart rightwingcover;
	private final ModelPart rightwing1;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart rightwing2;
	private final ModelPart bone15;
	private final ModelPart bone14;
	private final ModelPart bone13;
	private final ModelPart bone12;
	private final ModelPart bone11;
	private final ModelPart leftwingcover;
	private final ModelPart leftwing1;
	private final ModelPart bone10;
	private final ModelPart bone9;
	private final ModelPart bone8;
	private final ModelPart bone7;
	private final ModelPart bone6;
	private final ModelPart leftwing2;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;

	public Modelinsect(ModelPart root) {
		this.body = root.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.leftleg1 = this.body2.getChild("leftleg1");
		this.rightleg1 = this.body2.getChild("rightleg1");
		this.neckquestionmark = this.body2.getChild("neckquestionmark");
		this.head = this.neckquestionmark.getChild("head");
		this.body3 = this.body2.getChild("body3");
		this.back = this.body3.getChild("back");
		this.leftleg2 = this.body3.getChild("leftleg2");
		this.rightleg2 = this.body3.getChild("rightleg2");
		this.rightleg3 = this.body3.getChild("rightleg3");
		this.leftleg3 = this.body3.getChild("leftleg3");
		this.rightwingcover = this.body.getChild("rightwingcover");
		this.rightwing1 = this.rightwingcover.getChild("rightwing1");
		this.bone16 = this.rightwing1.getChild("bone16");
		this.bone17 = this.rightwing1.getChild("bone17");
		this.bone18 = this.rightwing1.getChild("bone18");
		this.bone19 = this.rightwing1.getChild("bone19");
		this.bone20 = this.rightwing1.getChild("bone20");
		this.rightwing2 = this.rightwingcover.getChild("rightwing2");
		this.bone15 = this.rightwing2.getChild("bone15");
		this.bone14 = this.rightwing2.getChild("bone14");
		this.bone13 = this.rightwing2.getChild("bone13");
		this.bone12 = this.rightwing2.getChild("bone12");
		this.bone11 = this.rightwing2.getChild("bone11");
		this.leftwingcover = this.body.getChild("leftwingcover");
		this.leftwing1 = this.leftwingcover.getChild("leftwing1");
		this.bone10 = this.leftwing1.getChild("bone10");
		this.bone9 = this.leftwing1.getChild("bone9");
		this.bone8 = this.leftwing1.getChild("bone8");
		this.bone7 = this.leftwing1.getChild("bone7");
		this.bone6 = this.leftwing1.getChild("bone6");
		this.leftwing2 = this.leftwingcover.getChild("leftwing2");
		this.bone = this.leftwing2.getChild("bone");
		this.bone2 = this.leftwing2.getChild("bone2");
		this.bone3 = this.leftwing2.getChild("bone3");
		this.bone4 = this.leftwing2.getChild("bone4");
		this.bone5 = this.leftwing2.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition body2 = body.addOrReplaceChild("body2",
				CubeListBuilder.create().texOffs(32, 8)
						.addBox(-3.0F, -1.775F, -1.3496F, 6.0F, 3.55F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 20)
						.addBox(-3.0F, -2.5F, -0.6425F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 20)
						.addBox(-3.0F, -1.775F, 1.0646F, 6.0F, 3.55F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -9.0F, -7.5575F));

		PartDefinition cube_r1 = body2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(15, 39).addBox(-2.975F, -0.5F, -0.5F, 5.95F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.7929F, 1.3575F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 39).addBox(-2.975F, -0.5F, -0.5F, 5.95F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.7929F, -0.6425F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(30, 39).addBox(-2.975F, -0.5F, -0.5F, 5.95F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.7929F, 1.3575F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(36, 4).addBox(-2.975F, -0.5F, -0.5F, 5.95F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.7929F, -0.6425F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(32, 25).addBox(-2.975F, -0.9F, -0.5F, 6.0F, 1.9F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.025F, 0.6777F, -1.2704F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(34, 17).addBox(-2.975F, -1.0F, -0.5F, 6.0F, 1.9F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.025F, -0.6777F, -1.2704F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftleg1 = body2.addOrReplaceChild("leftleg1", CubeListBuilder.create(),
				PartPose.offset(3.0067F, 1.4391F, 0.8716F));

		PartDefinition cube_r7 = leftleg1.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(20, 67).addBox(1.9903F, 3.4497F, 0.0F, 1.7F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7544F, 6.1614F, -0.0141F, -0.0843F, 0.0226F, 0.2608F));

		PartDefinition cube_r8 = leftleg1.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(56, 16).addBox(0.8893F, -0.4007F, -0.6F, 1.2F, 5.0F, 1.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7544F, 6.1614F, -0.0141F, -0.0865F, -0.0114F, -0.1304F));

		PartDefinition cube_r9 = leftleg1.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(58, 31)
						.addBox(0.8836F, -4.5707F, -0.6F, 1.2F, 5.0F, 1.2F, new CubeDeformation(0.0F)).texOffs(63, 33)
						.addBox(0.6336F, -7.5707F, -0.85F, 1.7F, 3.0F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7544F, 6.1614F, -0.0141F, -0.0756F, -0.0436F, -0.5219F));

		PartDefinition rightleg1 = body2.addOrReplaceChild("rightleg1", CubeListBuilder.create(),
				PartPose.offset(-3.0067F, 1.4391F, 0.8716F));

		PartDefinition cube_r10 = rightleg1.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(29, 54).addBox(-3.6903F, 3.4497F, 0.0F, 1.7F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7544F, 6.1614F, -0.0141F, -0.0843F, -0.0226F, -0.2608F));

		PartDefinition cube_r11 = rightleg1.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(12, 55).addBox(-2.0893F, -0.4007F, -0.6F, 1.2F, 5.0F, 1.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7544F, 6.1614F, -0.0141F, -0.0865F, 0.0114F, 0.1304F));

		PartDefinition cube_r12 = rightleg1.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(56, 6)
						.addBox(-2.0836F, -4.5707F, -0.6F, 1.2F, 5.0F, 1.2F, new CubeDeformation(0.0F)).texOffs(63, 28)
						.addBox(-2.3336F, -7.5707F, -0.85F, 1.7F, 3.0F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7544F, 6.1614F, -0.0141F, -0.0756F, 0.0436F, 0.5219F));

		PartDefinition neckquestionmark = body2.addOrReplaceChild("neckquestionmark", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.7371F, -1.4719F));

		PartDefinition cube_r13 = neckquestionmark.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(64, 59).addBox(-0.5373F, -0.6736F, -2.6286F, 1.2F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.4741F, -0.0102F, 1.1868F));

		PartDefinition cube_r14 = neckquestionmark.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(70, 46).addBox(-0.3672F, -1.3847F, -2.5219F, 1.1F, 1.3F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.2935F, -0.2733F, 1.5902F));

		PartDefinition cube_r15 = neckquestionmark.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(27, 70).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.25F, -1.3541F, -7.8212F, 1.6111F, -0.0167F, -2.7492F));

		PartDefinition cube_r16 = neckquestionmark.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(37, 70).addBox(-0.25F, 0.2F, -1.4F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, -0.8763F, -8.3425F, 1.6144F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = neckquestionmark.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(70, 40).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.25F, -1.3541F, -7.8212F, 1.6111F, 0.0167F, 2.7492F));

		PartDefinition cube_r18 = neckquestionmark.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(71, 6).addBox(-3.4836F, -2.0986F, -2.6811F, 1.0F, 1.15F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 0.9414F, -0.6225F, 0.7899F));

		PartDefinition cube_r19 = neckquestionmark.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(46, 60).addBox(-0.75F, -1.0F, -0.5F, 0.0F, 3.25F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1421F, 2.0355F, -7.4577F, 1.7823F, 0.0331F, -0.0045F));

		PartDefinition cube_r20 = neckquestionmark.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(59, 53).addBox(-1.7105F, -3.2161F, -2.6372F, 1.5F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.1039F, 0.0665F, 0.3873F));

		PartDefinition cube_r21 = neckquestionmark.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(41, 66).addBox(-1.7105F, -0.7558F, -2.6454F, 1.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.6711F, 0.0665F, 0.3873F));

		PartDefinition cube_r22 = neckquestionmark.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(23, 66).addBox(-1.7105F, 1.061F, -3.3028F, 1.25F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 2.0638F, 0.0665F, 0.3873F));

		PartDefinition cube_r23 = neckquestionmark.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(55, 70).addBox(-2.3653F, 2.5622F, -1.6602F, 1.05F, 1.4F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.4255F, 0.3492F, 0.8453F));

		PartDefinition cube_r24 = neckquestionmark.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 71).addBox(-0.9853F, 1.4622F, -2.7167F, 1.35F, 1.1F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.6618F, 0.3664F, 1.4987F));

		PartDefinition cube_r25 = neckquestionmark.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 67).addBox(-0.702F, -2.2847F, -2.531F, 1.0F, 2.2F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.2338F, -0.1937F, 1.8467F));

		PartDefinition cube_r26 = neckquestionmark.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(65, 48).addBox(0.0433F, -2.8847F, -2.2861F, 1.25F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.1948F, 0.0934F, 2.5813F));

		PartDefinition cube_r27 = neckquestionmark.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(63, 64).addBox(-0.6324F, -0.6736F, -2.4614F, 1.7F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.4857F, 0.0471F, 1.7951F));

		PartDefinition cube_r28 = neckquestionmark.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(65, 38).addBox(-0.2067F, -0.6736F, -2.1876F, 1.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.5439F, 0.0934F, 2.5813F));

		PartDefinition cube_r29 = neckquestionmark.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(10, 67).addBox(-1.399F, 1.3122F, -2.8622F, 1.0F, 2.75F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.7385F, 0.3393F, 1.7201F));

		PartDefinition cube_r30 = neckquestionmark.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(65, 43).addBox(-0.2067F, 1.3122F, -2.9114F, 1.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.9366F, 0.0934F, 2.5813F));

		PartDefinition cube_r31 = neckquestionmark.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(66, 10).addBox(-1.2933F, 1.3122F, -2.9114F, 1.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.9366F, -0.0934F, -2.5813F));

		PartDefinition cube_r32 = neckquestionmark.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(15, 67).addBox(0.399F, 1.3122F, -2.8622F, 1.0F, 2.75F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.7385F, -0.3393F, -1.7201F));

		PartDefinition cube_r33 = neckquestionmark.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(70, 43).addBox(1.3153F, 2.5622F, -1.6602F, 1.05F, 1.4F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.4255F, -0.3492F, -0.8453F));

		PartDefinition cube_r34 = neckquestionmark.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(5, 59).addBox(-1.25F, 1.1711F, -3.1593F, 2.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r35 = neckquestionmark.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(17, 59).addBox(-1.25F, -0.709F, -2.4707F, 2.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r36 = neckquestionmark.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(10, 48).addBox(-1.25F, -4.2705F, -2.4647F, 2.5F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r37 = neckquestionmark.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(71, 9).addBox(2.4836F, -2.0986F, -2.6811F, 1.0F, 1.15F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 0.9414F, 0.6225F, -0.7899F));

		PartDefinition cube_r38 = neckquestionmark.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(61, 17).addBox(0.2105F, -3.2161F, -2.6372F, 1.5F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.1039F, -0.0665F, -0.3873F));

		PartDefinition cube_r39 = neckquestionmark.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(55, 65).addBox(0.2105F, -0.7558F, -2.6454F, 1.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.6711F, -0.0665F, -0.3873F));

		PartDefinition cube_r40 = neckquestionmark.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(46, 60).addBox(0.75F, -1.0F, -0.5F, 0.0F, 3.25F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1421F, 2.0355F, -7.4577F, 1.7823F, -0.0331F, 0.0045F));

		PartDefinition cube_r41 = neckquestionmark.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(70, 49).addBox(-0.7328F, -1.3847F, -2.5219F, 1.1F, 1.3F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.2935F, 0.2733F, -1.5902F));

		PartDefinition cube_r42 = neckquestionmark.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(5, 67).addBox(-0.298F, -2.2847F, -2.531F, 1.0F, 2.2F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.2338F, 0.1937F, -1.8467F));

		PartDefinition cube_r43 = neckquestionmark.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(66, 20).addBox(-1.2933F, -2.8847F, -2.2861F, 1.25F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.1948F, -0.0934F, -2.5813F));

		PartDefinition cube_r44 = neckquestionmark.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(32, 53).addBox(-1.25F, -3.9381F, -2.1937F, 2.5F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.2217F, 0.0F, -3.1416F));

		PartDefinition cube_r45 = neckquestionmark.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(29, 59).addBox(-1.25F, 1.3353F, -2.8072F, 2.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.9635F, 0.0F, 3.1416F));

		PartDefinition cube_r46 = neckquestionmark.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(59, 23).addBox(-1.25F, -0.6921F, -2.0826F, 2.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.5708F, 0.0F, -3.1416F));

		PartDefinition cube_r47 = neckquestionmark.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(66, 15).addBox(-1.2933F, -0.6736F, -2.1876F, 1.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.5439F, -0.0934F, -2.5813F));

		PartDefinition cube_r48 = neckquestionmark.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(65, 0).addBox(-0.6627F, -0.6736F, -2.6286F, 1.2F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.4741F, 0.0102F, -1.1868F));

		PartDefinition cube_r49 = neckquestionmark.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(36, 65).addBox(-1.0676F, -0.6736F, -2.4614F, 1.7F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.4857F, -0.0471F, -1.7951F));

		PartDefinition cube_r50 = neckquestionmark.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(5, 71).addBox(-0.3647F, 1.4622F, -2.7167F, 1.35F, 1.1F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 1.6618F, -0.3664F, -1.4987F));

		PartDefinition cube_r51 = neckquestionmark.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(66, 5).addBox(0.4605F, 1.061F, -3.3028F, 1.25F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1213F, -4.9572F, 2.0638F, -0.0665F, -0.3873F));

		PartDefinition head = neckquestionmark.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0252F, -9.3151F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(45, 40).addBox(-0.5F, 0.0F, -0.25F, 1.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 1.8675F, -2.0112F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(18, 0).addBox(-0.5F, 0.0F, -0.25F, 1.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 1.8675F, -2.0112F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(56, 23)
						.addBox(-0.9F, -0.6937F, -1.1645F, 0.0F, 1.9F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 64)
						.addBox(-1.0F, -0.2937F, -0.1645F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3906F, -0.3319F, 0.3054F, 0.0F, -3.1416F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(7, 49).addBox(1.15F, -1.0F, -1.25F, 0.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0994F, -2.0375F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(68, 28)
						.addBox(0.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 31)
						.addBox(-1.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.7527F, -2.4741F, 2.7489F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(68, 34)
						.addBox(0.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 61)
						.addBox(-1.15F, -1.0F, -1.25F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 63)
						.addBox(-1.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0994F, -2.0375F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(68, 66)
						.addBox(0.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 69)
						.addBox(-1.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3089F, -1.3967F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(28, 67).addBox(-1.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 0.2494F, -2.0375F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(66, 25).addBox(-1.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -0.1589F, -1.3967F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(69, 59)
						.addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 69)
						.addBox(0.25F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 71)
						.addBox(-1.25F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3144F, -0.6772F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(17, 64).addBox(-1.0F, 0.2407F, 0.0673F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3906F, -0.3319F, -0.1745F, 0.0F, -3.1416F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(29, 64).addBox(-1.0F, -0.913F, -0.1186F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3906F, -0.3319F, 0.7418F, 0.0F, -3.1416F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(49, 16).addBox(-1.0F, -1.0777F, 0.2667F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3906F, -0.3319F, 1.4835F, 0.0F, -3.1416F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.9F, -0.6937F, -1.1645F, 0.0F, 1.9F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3906F, -0.3319F, 0.3054F, 0.0F, 3.1416F));

		PartDefinition body3 = body2.addOrReplaceChild("body3",
				CubeListBuilder.create().texOffs(28, 28)
						.addBox(-2.5F, -2.0F, -0.1978F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
						.addBox(-2.5F, -2.775F, 1.65F, 5.0F, 5.55F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.7553F));

		PartDefinition cube_r66 = body3.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(28, 35).addBox(-2.45F, -0.5F, -1.0F, 4.95F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.025F, 1.9207F, 0.9175F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body3.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(34, 13).addBox(-2.45F, -2.2525F, -0.2117F, 4.95F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.025F, 0.0F, 4.4401F, -2.7489F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body3.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(13, 28).addBox(-2.5F, -2.0F, -1.0576F, 5.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.4401F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body3.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(13, 35).addBox(-2.45F, 1.2525F, -0.2117F, 4.95F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.025F, 0.0F, 4.4401F, 2.7489F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body3.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(36, 0).addBox(-2.45F, -2.0F, -1.0F, 4.95F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.025F, -0.5349F, 1.4915F, 0.3927F, 0.0F, 0.0F));

		PartDefinition back = body3.addOrReplaceChild("back", CubeListBuilder.create().texOffs(33, 42)
				.addBox(-2.4482F, -1.7404F, -0.1629F, 4.9F, 3.55F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
				.addBox(-2.7482F, -2.9904F, 0.7806F, 5.5F, 6.05F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
				.addBox(-3.2482F, -3.4904F, 2.7806F, 6.5F, 7.05F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0018F, -0.0346F, 5.2194F));

		PartDefinition cube_r71 = back.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(71, 12).addBox(-0.5F, -1.05F, -0.55F, 1.0F, 1.9F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0177F, 3.0675F, 13.4149F, 0.1729F, 0.0F, 0.0F));

		PartDefinition cube_r72 = back.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(5, 53).addBox(-0.75F, -1.6706F, 0.3454F, 1.5F, 3.05F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0018F, 1.9621F, 11.5901F, -0.4816F, 0.0F, 0.0F));

		PartDefinition cube_r73 = back.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, -2.3823F, -1.4667F, 3.0F, 4.3F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0018F, 1.9621F, 11.5901F, -0.3943F, 0.0F, 0.0F));

		PartDefinition cube_r74 = back.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(0, 30).addBox(-2.25F, -3.1664F, -3.0539F, 4.5F, 5.55F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0018F, 1.9621F, 11.5901F, -0.2634F, 0.0F, 0.0F));

		PartDefinition cube_r75 = back.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(17, 11).addBox(-3.0F, -4.2557F, -4.7265F, 6.0F, 6.8F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0018F, 1.9621F, 11.5901F, -0.1761F, 0.0F, 0.0F));

		PartDefinition cube_r76 = back.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.65F, -3.925F, -1.0F, 7.3F, 7.85F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0018F, 0.1083F, 5.4696F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r77 = back.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(21, 8).addBox(-3.2F, -0.775F, -0.5F, 4.85F, 1.55F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7768F, 2.1404F, 0.7055F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r78 = back.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(49, 13).addBox(-3.2F, -0.775F, -0.5F, 4.85F, 1.55F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7768F, -2.0712F, 0.7055F, -0.6545F, 0.0F, 0.0F));

		PartDefinition leftleg2 = body3.addOrReplaceChild("leftleg2", CubeListBuilder.create(),
				PartPose.offset(3.0096F, 1.8177F, 1.4522F));

		PartDefinition cube_r79 = leftleg2.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(52, 66).addBox(-1.1F, -2.5F, 0.0F, 1.7F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6818F, 12.3381F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r80 = leftleg2.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(54, 54).addBox(-0.6F, -2.0F, -0.6F, 1.2F, 5.0F, 1.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.922F, 7.1825F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r81 = leftleg2.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(0, 55).addBox(-0.75F, 0.1F, -0.6F, 1.2F, 5.0F, 1.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3161F, 0.9296F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r82 = leftleg2.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(12, 62).addBox(-1.45F, -3.15F, 1.4F, 1.7F, 3.0F, 1.7F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8308F, 0.9211F, -2.25F, 0.0F, 0.0F, -0.5236F));

		PartDefinition rightleg2 = body3.addOrReplaceChild("rightleg2", CubeListBuilder.create(),
				PartPose.offset(-3.0096F, 1.8177F, 1.4522F));

		PartDefinition cube_r83 = rightleg2.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(0, 62).addBox(-0.25F, -3.15F, 1.4F, 1.7F, 3.0F, 1.7F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8308F, 0.9211F, -2.25F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r84 = rightleg2.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(24, 54).addBox(-0.45F, 0.1F, -0.6F, 1.2F, 5.0F, 1.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3161F, 0.9296F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r85 = rightleg2.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(49, 66).addBox(-0.6F, -2.5F, 0.0F, 1.7F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6819F, 12.3381F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r86 = rightleg2.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(49, 54).addBox(-0.6F, -2.0F, -0.6F, 1.2F, 5.0F, 1.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.922F, 7.1825F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightleg3 = body3.addOrReplaceChild("rightleg3", CubeListBuilder.create(),
				PartPose.offset(-2.4829F, 1.8891F, 3.8351F));

		PartDefinition cube_r87 = rightleg3.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(51, 61)
						.addBox(-2.1636F, -7.8616F, -0.85F, 1.7F, 3.0F, 1.7F, new CubeDeformation(0.0F)).texOffs(53, 39)
						.addBox(-1.9136F, -4.8616F, -0.6F, 1.2F, 5.0F, 1.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0028F, 6.1965F, 0.0172F, 0.0807F, -0.0334F, 0.3914F));

		PartDefinition cube_r88 = rightleg3.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(44, 53).addBox(-1.8209F, -0.6044F, -0.6F, 1.2F, 5.0F, 1.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0028F, 6.1965F, 0.0172F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r89 = rightleg3.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(46, 66).addBox(-3.3644F, 3.3642F, 0.0F, 1.7F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0028F, 6.1965F, 0.0172F, 0.0807F, 0.0334F, -0.3914F));

		PartDefinition leftleg3 = body3.addOrReplaceChild("leftleg3", CubeListBuilder.create(),
				PartPose.offset(2.4829F, 1.8891F, 3.8351F));

		PartDefinition cube_r90 = leftleg3.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(24, 61)
						.addBox(0.4636F, -7.8616F, -0.85F, 1.7F, 3.0F, 1.7F, new CubeDeformation(0.0F)).texOffs(53, 32)
						.addBox(0.7136F, -4.8616F, -0.6F, 1.2F, 5.0F, 1.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0028F, 6.1965F, 0.0172F, 0.0807F, 0.0334F, -0.3914F));

		PartDefinition cube_r91 = leftleg3.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(39, 53).addBox(0.6209F, -0.6044F, -0.6F, 1.2F, 5.0F, 1.2F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0028F, 6.1965F, 0.0172F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftleg3.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(60, 65).addBox(1.6644F, 3.3642F, 0.0F, 1.7F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0028F, 6.1965F, 0.0172F, 0.0807F, -0.0334F, 0.3914F));

		PartDefinition rightwingcover = body.addOrReplaceChild("rightwingcover", CubeListBuilder.create(),
				PartPose.offset(-2.65F, -11.4931F, -8.1856F));

		PartDefinition cube_r93 = rightwingcover.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(17, 53).addBox(-1.5F, -2.5F, 0.0F, 3.5F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.15F, -10.7227F, 14.2352F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r94 = rightwingcover.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(33, 47).addBox(-3.0F, -2.5F, 0.0F, 4.5F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.65F, -9.0191F, 9.5546F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightwingcover.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(22, 42).addBox(-4.0F, -2.5F, 0.0F, 5.5F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.65F, -6.4407F, 5.3055F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightwingcover.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(42, 48).addBox(-3.0F, -3.0F, 0.0F, 4.5F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.65F, -2.6207F, 1.3937F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightwingcover.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(64, 56).addBox(-1.5F, -1.5F, -0.5F, 3.5F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.15F, -0.2774F, 0.6388F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightwing1 = rightwingcover.addOrReplaceChild("rightwing1", CubeListBuilder.create(),
				PartPose.offset(-0.35F, -4.4682F, 8.2014F));

		PartDefinition bone16 = rightwing1.addOrReplaceChild("bone16", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone16
				.addOrReplaceChild("cube_r98",
						CubeListBuilder.create().texOffs(58, 0).addBox(-1.75F, 3.2536F, -2.465F, 3.75F, 4.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone17 = rightwing1.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r99 = bone17.addOrReplaceChild(
				"cube_r99", CubeListBuilder.create().texOffs(68, 69).addBox(-0.75F, 6.1766F, -4.5321F, 2.75F, 2.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition bone18 = rightwing1.addOrReplaceChild("bone18", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bone18.addOrReplaceChild(
				"cube_r100", CubeListBuilder.create().texOffs(43, 28).addBox(-2.75F, -1.29F, -1.7023F, 4.75F, 5.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone19 = rightwing1.addOrReplaceChild("bone19", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r101 = bone19.addOrReplaceChild(
				"cube_r101", CubeListBuilder.create().texOffs(26, 48).addBox(-1.75F, -5.891F, -1.9412F, 3.75F, 5.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.309F, 0.0F, 0.0F));

		PartDefinition bone20 = rightwing1.addOrReplaceChild("bone20", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r102 = bone20.addOrReplaceChild(
				"cube_r102", CubeListBuilder.create().texOffs(59, 59).addBox(-0.75F, -10.4644F, -2.9347F, 2.75F, 5.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.4835F, 0.0F, 0.0F));

		PartDefinition rightwing2 = rightwingcover.addOrReplaceChild("rightwing2", CubeListBuilder.create(),
				PartPose.offset(-0.35F, -2.5843F, 8.9722F));

		PartDefinition bone15 = rightwing2.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r103 = bone15.addOrReplaceChild(
				"cube_r103", CubeListBuilder.create().texOffs(61, 5).addBox(-0.25F, -10.4644F, -2.9347F, 2.25F, 5.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7017F, 0.0F, 0.0F));

		PartDefinition bone14 = rightwing2.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r104 = bone14.addOrReplaceChild(
				"cube_r104", CubeListBuilder.create().texOffs(51, 48).addBox(-1.25F, -5.891F, -1.9412F, 3.25F, 5.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5272F, 0.0F, 0.0F));

		PartDefinition bone13 = rightwing2.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r105 = bone13
				.addOrReplaceChild("cube_r105",
						CubeListBuilder.create().texOffs(47, 7).addBox(-2.25F, -1.29F, -1.7023F, 4.25F, 5.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.309F, 0.0F, 0.0F));

		PartDefinition bone12 = rightwing2.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r106 = bone12.addOrReplaceChild(
				"cube_r106", CubeListBuilder.create().texOffs(58, 48).addBox(-1.25F, 3.2536F, -2.465F, 3.25F, 4.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone11 = rightwing2.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r107 = bone11.addOrReplaceChild(
				"cube_r107", CubeListBuilder.create().texOffs(70, 3).addBox(-0.25F, 6.1766F, -4.5321F, 2.25F, 2.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leftwingcover = body.addOrReplaceChild("leftwingcover", CubeListBuilder.create(),
				PartPose.offset(2.65F, -11.4931F, -8.1856F));

		PartDefinition cube_r108 = leftwingcover.addOrReplaceChild("cube_r108",
				CubeListBuilder.create().texOffs(51, 0).addBox(-2.0F, -2.5F, 0.0F, 3.5F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, -10.7227F, 14.2352F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftwingcover.addOrReplaceChild("cube_r109",
				CubeListBuilder.create().texOffs(44, 42).addBox(-1.5F, -2.5F, 0.0F, 4.5F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.65F, -9.0191F, 9.5546F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r110 = leftwingcover.addOrReplaceChild("cube_r110",
				CubeListBuilder.create().texOffs(11, 42).addBox(-1.5F, -2.5F, 0.0F, 5.5F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.65F, -6.4407F, 5.3055F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r111 = leftwingcover.addOrReplaceChild("cube_r111",
				CubeListBuilder.create().texOffs(17, 48).addBox(-1.5F, -3.0F, 0.0F, 4.5F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.65F, -2.6207F, 1.3937F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r112 = leftwingcover.addOrReplaceChild("cube_r112",
				CubeListBuilder.create().texOffs(64, 53).addBox(-2.0F, -1.5F, -0.5F, 3.5F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, -0.2774F, 0.6388F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftwing1 = leftwingcover.addOrReplaceChild("leftwing1", CubeListBuilder.create(),
				PartPose.offset(0.35F, -4.4682F, 8.2014F));

		PartDefinition bone10 = leftwing1.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r113 = bone10.addOrReplaceChild(
				"cube_r113", CubeListBuilder.create().texOffs(41, 60).addBox(-2.0F, -10.4644F, -2.9347F, 2.75F, 5.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.4835F, 0.0F, 0.0F));

		PartDefinition bone9 = leftwing1.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r114 = bone9
				.addOrReplaceChild("cube_r114",
						CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -5.891F, -1.9412F, 3.75F, 5.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.309F, 0.0F, 0.0F));

		PartDefinition bone8 = leftwing1.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r115 = bone8
				.addOrReplaceChild("cube_r115",
						CubeListBuilder.create().texOffs(44, 34).addBox(-2.0F, -1.29F, -1.7023F, 4.75F, 5.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone7 = leftwing1.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r116 = bone7
				.addOrReplaceChild("cube_r116",
						CubeListBuilder.create().texOffs(58, 38).addBox(-2.0F, 3.2536F, -2.465F, 3.75F, 4.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition bone6 = leftwing1.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r117 = bone6
				.addOrReplaceChild("cube_r117",
						CubeListBuilder.create().texOffs(70, 0).addBox(-2.0F, 6.1766F, -4.5321F, 2.75F, 2.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition leftwing2 = leftwingcover.addOrReplaceChild("leftwing2", CubeListBuilder.create(),
				PartPose.offset(0.35F, -2.5843F, 8.9722F));

		PartDefinition bone = leftwing2.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r118 = bone.addOrReplaceChild(
				"cube_r118", CubeListBuilder.create().texOffs(70, 37).addBox(-2.0F, 6.1766F, -4.5321F, 2.25F, 2.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone2 = leftwing2.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r119 = bone2
				.addOrReplaceChild("cube_r119",
						CubeListBuilder.create().texOffs(58, 43).addBox(-2.0F, 3.2536F, -2.465F, 3.25F, 4.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone3 = leftwing2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r120 = bone3
				.addOrReplaceChild("cube_r120",
						CubeListBuilder.create().texOffs(47, 20).addBox(-2.0F, -1.29F, -1.7023F, 4.25F, 5.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.309F, 0.0F, 0.0F));

		PartDefinition bone4 = leftwing2.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r121 = bone4.addOrReplaceChild(
				"cube_r121", CubeListBuilder.create().texOffs(52, 26).addBox(-2.0F, -5.891F, -1.9412F, 3.25F, 5.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5272F, 0.0F, 0.0F));

		PartDefinition bone5 = leftwing2.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r122 = bone5.addOrReplaceChild(
				"cube_r122", CubeListBuilder.create().texOffs(61, 11).addBox(-2.0F, -10.4644F, -2.9347F, 2.25F, 5.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7017F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}