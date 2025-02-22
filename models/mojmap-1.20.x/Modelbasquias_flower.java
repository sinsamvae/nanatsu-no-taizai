// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbasquias_flower<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "basquias_flower"), "main");
	private final ModelPart flower;

	public Modelbasquias_flower(ModelPart root) {
		this.flower = root.getChild("flower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition flower = partdefinition.addOrReplaceChild("flower", CubeListBuilder.create().texOffs(0, 27)
				.addBox(-7.0F, -5.0F, -7.0F, 14.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = flower.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(75, 75).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.8162F, 0.6526F, 7.2771F, 0.0F, -0.2182F, 0.2182F));

		PartDefinition cube_r2 = flower.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(31, 71).addBox(-5.0F, -0.5F, -1.25F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.1774F, 0.5109F, 6.9345F, 0.0F, -0.6109F, 0.2182F));

		PartDefinition cube_r3 = flower.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 118)
				.addBox(-3.1732F, -0.5825F, -0.4666F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 25)
				.addBox(-0.3268F, -0.9175F, -1.0334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.4752F, -8.2833F, -0.1046F, -2.6831F, -0.0122F, -3.14F));

		PartDefinition cube_r4 = flower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 118)
				.addBox(-0.8268F, -0.5825F, -0.4666F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 100)
				.addBox(-2.6732F, -0.9175F, -1.0334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4752F, -8.2833F, 0.6454F, -2.6486F, 0.3623F, -2.961F));

		PartDefinition cube_r5 = flower.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(118, 39)
				.addBox(-0.8268F, -0.5825F, -0.4666F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 115)
				.addBox(-2.6732F, -0.9175F, -1.0334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4752F, -15.2833F, 2.6454F, -2.6747F, -0.1832F, 3.0425F));

		PartDefinition cube_r6 = flower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(118, 67)
				.addBox(-3.1732F, -0.5825F, -0.4666F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 77)
				.addBox(-0.3268F, -0.9175F, -1.0334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4752F, -17.2833F, 2.6454F, -2.7211F, 0.2772F, 3.0384F));

		PartDefinition cube_r7 = flower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(120, 92)
				.addBox(-2.1732F, -0.5825F, -0.5334F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 114)
				.addBox(-0.3268F, -0.9175F, -0.9666F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4752F, -20.2833F, 12.6046F, -0.8731F, 0.8217F, -0.9382F));

		PartDefinition cube_r8 = flower.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(80, 119)
				.addBox(-0.8268F, -0.5825F, -0.4666F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 105)
				.addBox(-2.6732F, -0.9175F, -1.0334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5248F, -22.5333F, 6.8954F, -0.4267F, -0.1219F, -0.0133F));

		PartDefinition cube_r9 = flower.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(120, 62)
				.addBox(-2.1732F, -0.5825F, -0.4666F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 110)
				.addBox(-0.3268F, -0.9175F, -1.0334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5248F, -22.5333F, 5.8954F, -0.4264F, -0.1167F, 0.1213F));

		PartDefinition cube_r10 = flower.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(92, 26)
				.addBox(-0.8268F, -0.5825F, -0.5334F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 47)
				.addBox(-2.6732F, -0.9175F, -0.9666F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7748F, -33.5333F, 11.8546F, -0.2919F, -0.0101F, -0.2563F));

		PartDefinition cube_r11 = flower.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 89).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7062F, -46.8053F, 3.2543F, -1.3469F, -0.493F, -1.4911F));

		PartDefinition cube_r12 = flower.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(119, 36).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7062F, -51.3053F, 6.7457F, 1.3286F, -0.6168F, -1.2418F));

		PartDefinition cube_r13 = flower.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(71, 119).addBox(-2.1732F, -0.5825F, -0.4666F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5248F, -41.2833F, 8.3954F, 0.9544F, -1.2256F, -0.7957F));

		PartDefinition cube_r14 = flower.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(119, 74).addBox(-2.1732F, -0.5825F, -0.5334F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5248F, -42.2833F, 15.1046F, 1.013F, 1.1922F, 1.2326F));

		PartDefinition cube_r15 = flower.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 92).addBox(-1.1732F, -0.5825F, -0.5334F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5248F, -40.5333F, 12.1046F, 0.3241F, 0.1758F, 0.3117F));

		PartDefinition cube_r16 = flower.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(80, 15).addBox(-1.1732F, -0.5825F, -0.5334F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7748F, -49.2833F, 4.3546F, 0.319F, 0.0101F, 0.2563F));

		PartDefinition cube_r17 = flower.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(83, 45).addBox(-0.8268F, -0.5825F, -0.5334F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7748F, -49.2833F, 5.6046F, 0.319F, -0.0101F, -0.2563F));

		PartDefinition cube_r18 = flower.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(92, 29).addBox(-0.8268F, -0.5825F, -0.5334F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7748F, -40.5333F, 11.8546F, 0.319F, -0.0101F, -0.2563F));

		PartDefinition cube_r19 = flower.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(29, 94)
				.addBox(-1.1732F, -0.5825F, -0.5334F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 104)
				.addBox(-0.3268F, -0.9175F, -0.9666F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7748F, -31.5333F, 10.8546F, -0.2401F, -0.1679F, -0.3764F));

		PartDefinition cube_r20 = flower.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(87, 102)
				.addBox(-1.1732F, -0.5825F, -0.5334F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 106)
				.addBox(-0.3268F, -0.9175F, -0.9666F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5248F, -29.2833F, 16.6046F, -0.5653F, 1.0262F, -0.556F));

		PartDefinition cube_r21 = flower.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(44, 120)
				.addBox(-2.1732F, -0.5825F, -0.4666F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 20)
				.addBox(-0.3268F, -0.9175F, -1.0334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5248F, -33.2833F, 7.1454F, -0.4046F, -1.0748F, 0.5352F));

		PartDefinition cube_r22 = flower.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(120, 95)
				.addBox(-2.1732F, -0.5825F, -0.4666F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 42)
				.addBox(-0.3268F, -0.9175F, -1.0334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5248F, -24.2833F, 0.1454F, -0.8284F, -0.867F, 1.0425F));

		PartDefinition cube_r23 = flower.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(35, 118)
				.addBox(-0.8268F, -0.5825F, -0.5334F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 114)
				.addBox(-2.6732F, -0.9175F, -0.9666F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5248F, -14.7833F, 9.8546F, -2.1269F, -1.4455F, 1.8801F));

		PartDefinition cube_r24 = flower.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(92, 118)
				.addBox(-3.1732F, -0.5825F, -0.4666F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 82)
				.addBox(-0.3268F, -0.9175F, -1.0334F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4752F, -17.2833F, -4.8546F, -1.2654F, -1.0472F, 1.5708F));

		PartDefinition cube_r25 = flower.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(63, 91)
				.addBox(-2.9232F, -0.5825F, -0.5334F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 5)
				.addBox(-0.0768F, -0.9175F, -0.9666F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7748F, -8.816F, 8.2025F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition cube_r26 = flower.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(119, 30)
				.addBox(-2.9232F, -0.5825F, -0.4666F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(103, 118)
				.addBox(-0.0768F, -0.9175F, -1.0334F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2252F, -8.816F, -7.1025F, -1.5708F, -1.4399F, 1.5708F));

		PartDefinition cube_r27 = flower.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(117, 47).addBox(0.1639F, -1.2229F, -1.4466F, 3.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6477F, -0.7216F, -9.6466F, 2.4939F, -1.3143F, -2.6654F));

		PartDefinition cube_r28 = flower.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(113, 17).addBox(-4.2081F, -0.2771F, -0.7242F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6477F, -0.7216F, -9.6466F, 0.6958F, -1.3297F, -0.8369F));

		PartDefinition cube_r29 = flower.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(119, 33).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9201F, -0.5099F, -15.3883F, 1.8005F, -1.4024F, -1.9512F));

		PartDefinition cube_r30 = flower.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(107, 92).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0051F, -1.1546F, -11.8459F, 0.341F, -1.061F, -0.4478F));

		PartDefinition cube_r31 = flower.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(92, 87).addBox(-0.4351F, -1.75F, -1.4524F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.409F, -1.5361F, -9.9593F, 0.0F, -1.309F, -0.0873F));

		PartDefinition cube_r32 = flower.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(117, 52).addBox(-3.3928F, -1.2654F, -0.9865F, 3.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.6297F, -0.7375F, -13.0869F, 0.0F, 1.0036F, 0.2182F));

		PartDefinition cube_r33 = flower.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(105, 60).addBox(-4.9598F, -2.1045F, -1.4597F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.6916F, -1.1103F, -11.3048F, 0.0F, 1.309F, 0.2182F));

		PartDefinition cube_r34 = flower.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(107, 97).addBox(-3.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.8897F, -0.0517F, -14.3836F, 0.0F, 0.6109F, 0.2182F));

		PartDefinition cube_r35 = flower.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(117, 57).addBox(-2.8928F, -1.2654F, -0.9865F, 3.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.1203F, 0.6038F, -2.6033F, 0.0F, -0.0436F, 0.2182F));

		PartDefinition cube_r36 = flower.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(106, 67).addBox(-7.2382F, -1.9157F, -1.5127F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.932F, 0.443F, -3.1482F, 0.0F, 0.1745F, 0.2182F));

		PartDefinition cube_r37 = flower.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(0, 118).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.122F, 1.1642F, -1.806F, 0.0F, -0.4363F, 0.2182F));

		PartDefinition cube_r38 = flower.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(106, 74).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7935F, 0.4463F, -9.8578F, -0.0894F, 0.3829F, 0.1572F));

		PartDefinition cube_r39 = flower.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(90, 0).addBox(-4.6752F, -1.1848F, -1.2199F, 5.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0996F, -0.0225F, -8.7751F, 0.0F, 0.7854F, 0.3927F));

		PartDefinition cube_r40 = flower.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(66, 68).addBox(-2.1862F, -2.5F, -7.5108F, 5.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.4897F, -0.5F, 0.3266F, 0.0F, 0.3927F, 0.2182F));

		PartDefinition cube_r41 = flower.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(53, 10)
						.addBox(-3.5F, -1.5F, -2.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-3.5F, -2.5F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.9879F, -0.3896F, 4.0F, 0.0F, -0.2182F, 0.2182F));

		PartDefinition cube_r42 = flower.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.864F, -0.4729F, -0.8532F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0633F, 0.2287F, 12.617F, -2.8529F, 0.7249F, -2.9856F));

		PartDefinition cube_r43 = flower.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(100, 40).addBox(-1.1427F, -0.5271F, -1.387F, 6.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0633F, 0.2287F, 12.617F, -2.6614F, 1.0912F, -2.7472F));

		PartDefinition cube_r44 = flower.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(43, 35).addBox(-5.5982F, -1.0403F, -3.4619F, 6.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7784F, -0.4635F, 10.8813F, -0.8424F, -1.2995F, 0.9085F));

		PartDefinition cube_r45 = flower.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(65, 102).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.069F, 0.3999F, 13.689F, -1.1324F, -1.3481F, 1.2074F));

		PartDefinition cube_r46 = flower.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(22, 89).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0258F, -0.3602F, 10.3741F, -0.4102F, -1.0455F, 0.4445F));

		PartDefinition cube_r47 = flower.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(51, 91).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.854F, -1.7297F, 7.2491F, -0.5839F, -1.1996F, 0.6366F));

		PartDefinition cube_r48 = flower.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(0, 33).addBox(-5.8205F, -2.0403F, -0.7915F, 4.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7784F, -0.4635F, 10.8813F, -2.1097F, -1.3356F, 2.2067F));

		PartDefinition cube_r49 = flower.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.9934F, 0.8027F, 8.8472F, 0.0F, 1.0036F, -0.2182F));

		PartDefinition cube_r50 = flower.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(105, 13).addBox(-1.0F, -0.5F, -1.25F, 6.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.9274F, 0.5109F, 7.4345F, 0.0F, 0.6109F, -0.2182F));

		PartDefinition cube_r51 = flower.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(70, 10).addBox(1.0F, -1.25F, -1.75F, 6.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.4309F, 0.1177F, 4.5135F, 0.0F, 0.2182F, -0.2182F));

		PartDefinition cube_r52 = flower.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(112, 120).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.3759F, 0.5323F, -6.4125F, 0.0F, -0.2618F, -0.2182F));

		PartDefinition cube_r53 = flower.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(107, 87).addBox(-0.5596F, -1.1848F, -0.9547F, 5.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5252F, -0.0673F, -6.2826F, 0.0F, -0.0436F, -0.2182F));

		PartDefinition cube_r54 = flower.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(88, 60).addBox(-2.8138F, -2.5F, -7.5108F, 5.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.4897F, -0.5F, 0.3266F, 0.0F, -0.3927F, -0.2182F));

		PartDefinition cube_r55 = flower.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5633F, -1.7297F, 4.1516F, 0.0F, 0.5236F, -0.2182F));

		PartDefinition cube_r56 = flower.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(0, 104).addBox(-2.5F, -1.0341F, -2.0095F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(-0.32F)),
				PartPose.offsetAndRotation(-0.5F, -48.4382F, 5.3231F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r57 = flower.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 47)
				.addBox(-8.5541F, -8.5897F, -1.224F, 17.0F, 17.0F, 6.0F, new CubeDeformation(-0.35F)).texOffs(0, 71)
				.addBox(-6.8854F, -6.5254F, -3.2098F, 13.0F, 13.0F, 4.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.8F, -47.04F, -19.3565F, 0.178F, 0.0982F, -0.3875F));

		PartDefinition cube_r58 = flower.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(47, 47).addBox(-7.8221F, -7.2392F, -2.1463F, 15.0F, 15.0F, 5.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.8F, -47.04F, -19.3565F, 0.1374F, -0.2036F, 0.3414F));

		PartDefinition cube_r59 = flower.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(105, 0).addBox(-4.8292F, -4.6641F, -5.2405F, 9.0F, 9.0F, 3.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.8F, -47.04F, -19.3565F, 0.1146F, 0.2398F, -0.7595F));

		PartDefinition cube_r60 = flower.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(88, 45).addBox(-5.8829F, -5.3762F, -4.1767F, 11.0F, 11.0F, 3.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.8F, -47.04F, -19.3565F, 0.1857F, -0.0564F, -0.0261F));

		PartDefinition cube_r61 = flower.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(105, 0).addBox(-4.1759F, -4.3384F, 9.7014F, 9.0F, 9.0F, 3.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.8F, -47.04F, -19.3565F, 0.1976F, 0.0674F, -0.7869F));

		PartDefinition cube_r62 = flower.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(53, 0)
				.addBox(-7.5275F, 8.9109F, 1.1175F, 15.0F, 3.0F, 6.0F, new CubeDeformation(-0.35F)).texOffs(57, 35)
				.addBox(-7.5275F, -11.6891F, 1.1175F, 15.0F, 3.0F, 6.0F, new CubeDeformation(-0.35F)).texOffs(94, 96)
				.addBox(8.7725F, -7.3891F, 1.1175F, 3.0F, 15.0F, 6.0F, new CubeDeformation(-0.35F)).texOffs(52, 100)
				.addBox(-11.8275F, -7.3891F, 1.1175F, 3.0F, 15.0F, 6.0F, new CubeDeformation(-0.35F)).texOffs(0, 0)
				.addBox(-9.5248F, -9.3999F, 0.7177F, 19.0F, 19.0F, 7.0F, new CubeDeformation(-0.35F)).texOffs(134, 3)
				.addBox(-0.9928F, -1.3502F, -13.1783F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.35F)).texOffs(134, 3)
				.addBox(-1.4975F, -1.7662F, -10.049F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.35F)).texOffs(131, 0)
				.addBox(-1.9411F, -2.2434F, -7.3102F, 4.0F, 4.0F, 7.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.8F, -47.04F, -19.3565F, 0.1105F, 0.2085F, -1.1751F));

		PartDefinition cube_r63 = flower.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 47)
				.addBox(-8.4467F, -8.4117F, 2.7177F, 17.0F, 17.0F, 6.0F, new CubeDeformation(-0.35F)).texOffs(0, 71)
				.addBox(-6.778F, -6.3473F, 6.7034F, 13.0F, 13.0F, 4.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.8F, -47.04F, -19.3565F, 0.225F, 0.0701F, -0.3933F));

		PartDefinition cube_r64 = flower.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(47, 47).addBox(-8.7702F, -6.7212F, 4.5646F, 15.0F, 15.0F, 5.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.8F, -47.04F, -19.3565F, 0.2727F, 0.0447F, 0.3931F));

		PartDefinition cube_r65 = flower.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(88, 45).addBox(-6.3379F, -5.1306F, 8.6554F, 11.0F, 11.0F, 3.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.8F, -47.04F, -19.3565F, 0.2514F, 0.0622F, 0.0002F));

		PartDefinition cube_r66 = flower.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(71, 102).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.0F, -49.9358F, -6.3436F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r67 = flower.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(25, 106).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F,
						new CubeDeformation(-0.34F)),
				PartPose.offsetAndRotation(0.0F, -50.904F, -1.4212F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r68 = flower.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(94, 26).addBox(-2.5F, -5.9659F, -2.0095F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(-0.5F, -48.4382F, 5.3231F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r69 = flower.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(0, 89).addBox(-3.5F, -3.5F, -3.5F, 7.0F, 7.0F, 7.0F,
						new CubeDeformation(-0.31F)),
				PartPose.offsetAndRotation(0.0F, -43.5208F, 10.7791F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r70 = flower.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(29, 91).addBox(-3.0F, -4.0F, -3.0F, 7.0F, 7.0F, 7.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.5F, -38.1515F, 11.7317F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r71 = flower.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(67, 87).addBox(-4.0F, -1.5F, -4.0F, 8.0F, 6.0F, 8.0F,
						new CubeDeformation(-0.21F)),
				PartPose.offsetAndRotation(0.0F, -35.172F, 12.0965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r72 = flower.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(80, 10).addBox(-3.5F, -0.5F, -3.5F, 8.0F, 7.0F, 8.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.5F, -31.6574F, 10.9965F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r73 = flower.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(38, 68).addBox(-5.0F, -9.0F, -5.0F, 9.0F, 13.0F, 9.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.5F, -19.5048F, 4.4962F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r74 = flower.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(75, 68).addBox(-5.0F, -4.0F, -5.0F, 10.0F, 8.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.2858F, 1.8289F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r75 = flower.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(43, 15).addBox(-6.0F, -3.5F, -6.0F, 12.0F, 7.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.6F, 0.5F, -0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		flower.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}