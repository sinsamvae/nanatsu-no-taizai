// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsunflower_true_spirt_spear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sunflower_true_spirt_spear"), "main");
	private final ModelPart bone;
	private final ModelPart bone10;
	private final ModelPart bone9;
	private final ModelPart bone7;
	private final ModelPart bone6;
	private final ModelPart bone5;
	private final ModelPart bone4;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart bone11;
	private final ModelPart bone8;
	private final ModelPart bone17;
	private final ModelPart bone16;
	private final ModelPart bone15;
	private final ModelPart bone14;
	private final ModelPart bone13;
	private final ModelPart bone12;

	public Modelsunflower_true_spirt_spear(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone10 = root.getChild("bone10");
		this.bone9 = root.getChild("bone9");
		this.bone7 = root.getChild("bone7");
		this.bone6 = root.getChild("bone6");
		this.bone5 = root.getChild("bone5");
		this.bone4 = root.getChild("bone4");
		this.bone3 = root.getChild("bone3");
		this.bone2 = root.getChild("bone2");
		this.bone11 = root.getChild("bone11");
		this.bone8 = root.getChild("bone8");
		this.bone17 = root.getChild("bone17");
		this.bone16 = root.getChild("bone16");
		this.bone15 = root.getChild("bone15");
		this.bone14 = root.getChild("bone14");
		this.bone13 = root.getChild("bone13");
		this.bone12 = root.getChild("bone12");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-7.9113F, 2.8256F, -14.7232F, 16.0F, 1.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(144, 20)
				.addBox(-7.9113F, -0.1744F, -15.7232F, 16.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(115, 143)
				.addBox(-7.9113F, -0.1744F, 13.2768F, 16.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
				.addBox(-14.9113F, 2.8256F, -7.7232F, 7.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(63, 0)
				.addBox(-7.9113F, 3.8256F, -11.7232F, 16.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(37, 122)
				.addBox(-12.6111F, 3.8256F, -1.2232F, 5.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(40, 125)
				.addBox(-12.6111F, 3.8256F, -7.7232F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(74, 118)
				.addBox(9.0887F, 3.8256F, -7.7232F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(124, 80)
				.addBox(-10.9113F, 5.8256F, -7.7232F, 3.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(73, 27)
				.addBox(-7.9113F, 5.8256F, -9.7232F, 16.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
				.addBox(-11.9113F, -3.1744F, -11.7232F, 24.0F, 0.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(57, 91)
				.addBox(-13.9113F, -4.1744F, 8.2768F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 143)
				.addBox(-13.9113F, -4.1744F, -10.7232F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(57, 108)
				.addBox(-10.9113F, -4.1744F, 12.2768F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 20)
				.addBox(-10.9113F, -4.1744F, -13.7232F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 130)
				.addBox(8.0887F, -4.1744F, -13.7232F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(131, 20)
				.addBox(8.0887F, -4.1744F, 12.2768F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(149, 38)
				.addBox(12.0887F, -4.1744F, -10.7232F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(193, 92)
				.addBox(12.0887F, -4.1744F, 8.2768F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(97, 50)
				.addBox(-7.9113F, -3.1744F, -15.7232F, 16.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(121, 70)
				.addBox(-7.9113F, -3.1744F, 13.2768F, 16.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(120, 0)
				.addBox(-15.9113F, -3.1744F, -7.7232F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(121, 50)
				.addBox(13.0887F, -3.1744F, -7.7232F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(182, 192)
				.addBox(-10.9113F, -3.1744F, -14.7232F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
				.addBox(-14.9113F, -3.1744F, -10.7232F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
				.addBox(-12.9113F, -3.1744F, -13.7232F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(193, 0)
				.addBox(-10.9113F, -3.1744F, 13.2768F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
				.addBox(-14.9113F, -3.1744F, 8.2768F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-13.9113F, -3.1744F, 11.2768F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
				.addBox(13.0887F, -3.1744F, 8.2768F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(193, 34)
				.addBox(8.0887F, -3.1744F, 13.2768F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
				.addBox(11.0887F, -3.1744F, 13.2768F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 101)
				.addBox(13.0887F, -3.1744F, -10.7232F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
				.addBox(13.0887F, -3.1744F, -12.7232F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(67, 193)
				.addBox(8.0887F, -3.1744F, -14.7232F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 0)
				.addBox(-12.9113F, -3.1744F, 13.2768F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 22)
				.addBox(13.0887F, -3.1744F, 11.2768F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 12)
				.addBox(11.0887F, -3.1744F, -13.7232F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
				.addBox(-13.9113F, -3.1744F, -12.7232F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 135)
				.addBox(12.0887F, -4.1744F, -7.7232F, 3.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(78, 0)
				.addBox(11.0887F, -4.1744F, -12.7232F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(142, 114)
				.addBox(-7.9113F, -4.1744F, -14.7232F, 16.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(144, 47)
				.addBox(-7.9113F, -4.1744F, 12.2768F, 16.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 137)
				.addBox(-14.9113F, -4.1744F, -7.7232F, 3.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(78, 4)
				.addBox(-12.9113F, -4.1744F, -12.7232F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 12)
				.addBox(-12.9113F, -4.1744F, 11.2768F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 16)
				.addBox(11.0887F, -4.1744F, 11.2768F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(121, 124)
				.addBox(8.0887F, 5.8256F, -7.7232F, 3.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 132)
				.addBox(-15.9113F, -0.1744F, -7.7232F, 3.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(144, 129)
				.addBox(-12.9113F, 2.8256F, 8.2768F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(73, 71)
				.addBox(-12.9113F, 2.8256F, -12.7232F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(115, 159)
				.addBox(-10.9113F, 1.8256F, 13.2768F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 159)
				.addBox(-10.9113F, 1.8256F, -13.7232F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 57)
				.addBox(-13.9113F, 1.8256F, -10.7232F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 69)
				.addBox(-13.9113F, 1.8256F, 8.2768F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(111, 103)
				.addBox(8.0887F, 2.8256F, -7.7232F, 7.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(126, 27)
				.addBox(13.0887F, -0.1744F, -7.7232F, 3.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(73, 57)
				.addBox(8.0887F, 2.8256F, 8.2768F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(115, 149)
				.addBox(8.0887F, 3.8256F, 8.2768F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(147, 89)
				.addBox(-11.9113F, 3.8256F, 8.2768F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(79, 91)
				.addBox(-11.9113F, 3.8256F, -11.7232F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(120, 130)
				.addBox(8.0887F, 3.8256F, -11.7232F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(73, 64)
				.addBox(8.0887F, 2.8256F, -12.7232F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(144, 57)
				.addBox(-7.9113F, 1.8256F, -14.7232F, 16.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(144, 52)
				.addBox(-7.9113F, 1.8256F, 12.2768F, 16.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(128, 149)
				.addBox(11.0887F, 1.8256F, -12.7232F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(145, 99)
				.addBox(-12.9113F, 1.8256F, -12.7232F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(144, 136)
				.addBox(-12.9113F, 1.8256F, 11.2768F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 41)
				.addBox(11.0887F, 1.8256F, 11.2768F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(92, 141)
				.addBox(12.0887F, 1.8256F, -7.7232F, 3.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(69, 139)
				.addBox(-14.9113F, 1.8256F, -7.7232F, 3.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(15, 32)
				.addBox(13.0887F, 1.8256F, 8.2768F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 44)
				.addBox(13.0887F, 1.8256F, -10.7232F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 44)
				.addBox(13.0887F, -0.1744F, -10.7232F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(81, 157)
				.addBox(8.0887F, 1.8256F, 13.2768F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(159, 15)
				.addBox(8.0887F, 1.8256F, -13.7232F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(195, 135)
				.addBox(8.0887F, -0.1744F, -14.7232F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(147, 77)
				.addBox(13.0887F, -0.1744F, -12.7232F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 8)
				.addBox(11.0887F, -0.1744F, -13.7232F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 153)
				.addBox(11.0887F, -0.1744F, 13.2768F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 32)
				.addBox(13.0887F, -0.1744F, 11.2768F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 196)
				.addBox(8.0887F, -0.1744F, 13.2768F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 193)
				.addBox(13.0887F, -0.1744F, 8.2768F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(149, 26)
				.addBox(-13.9113F, -0.1744F, 11.2768F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 151)
				.addBox(-12.9113F, -0.1744F, 13.2768F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 193)
				.addBox(-14.9113F, -0.1744F, 8.2768F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(196, 52)
				.addBox(-10.9113F, -0.1744F, 13.2768F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(153, 136)
				.addBox(-12.9113F, -0.1744F, -13.7232F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 69)
				.addBox(-13.9113F, -0.1744F, -12.7232F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(100, 193)
				.addBox(-14.9113F, -0.1744F, -10.7232F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(196, 60)
				.addBox(-10.9113F, -0.1744F, -14.7232F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0887F, 11.1744F, 3.7232F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(144, 121)
						.addBox(-8.5F, -0.5F, 2.0F, 17.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 122)
						.addBox(-6.5F, -0.5F, 4.0F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
						.addBox(-10.5F, -0.5F, -12.0F, 21.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.302F, -2.8744F, 16.913F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(58, 126)
						.addBox(-6.5F, -0.5F, 4.0F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(144, 125)
						.addBox(-8.5F, -0.5F, 2.0F, 17.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-10.5F, -0.5F, -12.0F, 21.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.4793F, -2.8744F, 16.913F, 0.0873F, 0.7854F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(76, 80)
						.addBox(-11.25F, -0.5F, -10.5F, 13.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(142, 99)
						.addBox(3.75F, -0.5F, -6.5F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(57, 82)
						.addBox(1.75F, -0.5F, -8.5F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.3671F, -2.7244F, -9.1077F, -0.0361F, 0.3911F, -0.0944F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(58, 118)
						.addBox(-6.5F, -0.5F, -5.75F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(144, 62)
						.addBox(-8.5F, -0.5F, -3.75F, 17.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 103)
						.addBox(-10.5F, -0.5F, -1.75F, 21.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0887F, -3.1744F, -23.4732F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(143, 0)
						.addBox(-5.75F, -0.5F, -6.5F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(98, 121)
						.addBox(-3.75F, -0.5F, -8.5F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(73, 57)
						.addBox(-1.75F, -0.5F, -10.5F, 13.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.1898F, -2.7744F, -9.1077F, -0.0361F, -0.3911F, 0.0944F));

		PartDefinition bone10 = partdefinition.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-26.4149F, 21.7163F, -9.3065F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r6 = bone10.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(69, 157).addBox(6.8463F, -7.6102F, 9.3048F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(-0.5851F, -0.293F, 8.3065F, 2.8362F, 1.3526F, 0.0F));

		PartDefinition cube_r7 = bone10.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(124, 88).addBox(6.8463F, -5.6043F, 8.1441F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(-0.5851F, -0.293F, 8.3065F, 3.0107F, 1.3526F, 0.0F));

		PartDefinition cube_r8 = bone10.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(126, 27).addBox(6.8463F, -4.2453F, 6.1012F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(-0.5851F, -0.293F, 8.3065F, -3.1416F, 1.3526F, 0.0F));

		PartDefinition cube_r9 = bone10.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(184, 184).addBox(6.8463F, -1.8615F, 3.8872F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5851F, -0.293F, 8.3065F, -2.8362F, 1.3526F, 0.0F));

		PartDefinition cube_r10 = bone10.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(126, 35).addBox(6.6463F, -0.4781F, -4.4808F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.5851F, -0.293F, 8.3065F, -2.8798F, 1.3526F, 0.0F));

		PartDefinition cube_r11 = bone10.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(46, 169).addBox(6.7463F, -0.4047F, -0.1718F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.5851F, -0.293F, 8.3065F, -2.5307F, 1.3526F, 0.0F));

		PartDefinition cube_r12 = bone10.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(193, 192).addBox(6.6463F, -0.5869F, -1.178F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.5851F, -0.293F, 8.3065F, -2.7489F, 1.3526F, 0.0F));

		PartDefinition cube_r13 = bone10.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(69, 185).addBox(6.6463F, -3.484F, 3.5333F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5851F, -0.293F, 8.3065F, 0.0436F, 1.3526F, 0.0F));

		PartDefinition cube_r14 = bone10.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(131, 149).addBox(6.6463F, -6.6498F, 7.1798F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5851F, -0.293F, 8.3065F, -0.3927F, 1.3526F, 0.0F));

		PartDefinition cube_r15 = bone10.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(73, 50).addBox(6.6463F, -5.302F, 6.2254F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5851F, -0.293F, 8.3065F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition bone9 = partdefinition.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-7.7696F, 21.7163F, 25.5678F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone9.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(41, 187).addBox(-1.4F, -3.7273F, -7.9424F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, -0.811F, -0.0436F, -0.2182F, 0.0F));

		PartDefinition cube_r17 = bone9.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(146, 143).addBox(-1.4F, -7.0432F, -15.4478F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, -0.811F, 0.3927F, -0.2182F, 0.0F));

		PartDefinition cube_r18 = bone9.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(92, 148).addBox(-1.4F, -5.6429F, -8.5577F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, -0.811F, 0.2182F, -0.2182F, 0.0F));

		PartDefinition cube_r19 = bone9.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(160, 131).addBox(-1.6F, -7.2416F, -14.0035F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, -0.811F, -2.8362F, -0.2182F, 0.0F));

		PartDefinition cube_r20 = bone9.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(173, 136).addBox(-1.6F, -5.2936F, -11.7834F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, -0.811F, -3.0107F, -0.2182F, 0.0F));

		PartDefinition cube_r21 = bone9.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(145, 186).addBox(-1.6F, -3.9844F, -9.703F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, -0.811F, 3.1416F, -0.2182F, 0.0F));

		PartDefinition cube_r22 = bone9.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(186, 8).addBox(-1.6F, -1.7324F, -7.429F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, -0.811F, 2.8362F, -0.2182F, 0.0F));

		PartDefinition cube_r23 = bone9.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(173, 99).addBox(-1.4F, -0.3292F, 0.9329F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, -0.811F, 2.8798F, -0.2182F, 0.0F));

		PartDefinition cube_r24 = bone9.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(161, 171).addBox(-1.5F, -0.4193F, -4.3524F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, -0.811F, 2.5307F, -0.2182F, 0.0F));

		PartDefinition cube_r25 = bone9.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(138, 194).addBox(-1.4F, -0.4982F, -0.3543F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, -0.811F, 2.7489F, -0.2182F, 0.0F));

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 22.0357F, 27.4327F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r26 = bone7.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(143, 6).addBox(-1.5F, -1.9481F, 0.057F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0666F, -0.4916F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone7.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(162, 75).addBox(-1.5F, -1.9086F, -4.6056F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, 0.1007F, -1.1049F, -3.098F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone7.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(59, 175).addBox(-1.5F, -2.4141F, 1.4827F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.1557F, -0.159F, 2.7489F, 0.0F, 0.0F));

		PartDefinition cube_r29 = bone7.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(175, 30).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, 0.4671F, 5.1309F, 3.098F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone7.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(132, 174).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, 0.6849F, 7.4784F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone7.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(174, 71).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(0.0F, 1.0099F, 9.9489F, -3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone7.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(161, 140).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9599F, 11.9989F, -2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone7.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(176, 145).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -1.5275F, -7.915F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone7.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(15, 153).addBox(-1.5F, -1.5F, -4.0F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.8583F, -6.3662F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone7.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -1.5F, -4.0F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5198F, -13.9572F, 0.2618F, 0.0F, 0.0F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(8.4403F, 20.5825F, 25.7657F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone6.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(114, 103).addBox(-1.4995F, -2.152F, 6.0187F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(1.3608F, -0.6657F, 5.6027F, -3.0402F, -0.2443F, 3.0716F));

		PartDefinition cube_r37 = bone6.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(120, 161).addBox(-1.5F, -1.022F, 3.222F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.8234F, 1.14F, 6.1883F, -2.6424F, -0.2233F, 3.0197F));

		PartDefinition cube_r38 = bone6.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(32, 174).addBox(-1.4924F, -3.7996F, 4.0863F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.7075F, -1.3918F, 3.331F, 2.8013F, -0.2527F, 3.116F));

		PartDefinition cube_r39 = bone6.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(17, 174).addBox(-1.5F, -1.4577F, 1.9355F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(2.2768F, 1.8729F, 7.7771F, -2.7297F, -0.2233F, 3.0197F));

		PartDefinition cube_r40 = bone6.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(190, 26).addBox(-1.5F, -1.7339F, 0.4973F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(2.446F, 1.1243F, 8.9755F, 3.1082F, -0.2513F, 3.1048F));

		PartDefinition cube_r41 = bone6.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(188, 171).addBox(-1.5F, -1.5684F, -0.7288F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(2.7597F, 1.2993F, 9.9927F, -2.9093F, -0.2443F, 3.0716F));

		PartDefinition cube_r42 = bone6.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(161, 0).addBox(-1.5F, -1.6534F, -3.7638F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(2.7597F, 1.2993F, 9.9927F, -2.7348F, -0.2443F, 3.0716F));

		PartDefinition cube_r43 = bone6.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(0, 114).addBox(-1.4924F, -1.0216F, -11.7722F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.7075F, -1.3918F, 3.331F, -0.1221F, -0.2527F, 3.116F));

		PartDefinition cube_r44 = bone6.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(46, 155).addBox(-1.475F, -3.459F, -17.4563F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2153F, -3.3071F, -0.6355F, -0.1745F, -0.2618F, 3.1416F));

		PartDefinition cube_r45 = bone6.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(111, 195).addBox(-1.475F, -1.4285F, -12.2526F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3834F, -3.3052F, 1.8297F, -0.3039F, -0.2615F, 3.1299F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-19.3978F, 22.0357F, 19.3978F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(164, 150).addBox(-1.5F, -9.5816F, -41.6149F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(19.3978F, -0.2935F, -19.3978F, -2.9671F, -0.7854F, 0.0F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(174, 176).addBox(-1.5F, -2.8034F, -39.3816F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(19.3978F, -0.2935F, -19.3978F, -3.1416F, -0.7854F, 0.0F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(74, 177).addBox(-1.5F, 2.0868F, -36.7401F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(19.3978F, -0.2935F, -19.3978F, 3.0107F, -0.7854F, 0.0F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(89, 177).addBox(-1.5F, 7.6081F, -23.8868F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(19.3978F, -0.2935F, -19.3978F, 2.7489F, -0.7854F, 0.0F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(177, 80).addBox(-1.5F, -0.8394F, -34.0658F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(19.3978F, -0.2935F, -19.3978F, 3.098F, -0.7854F, 0.0F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(187, 157).addBox(-1.5F, 1.2114F, -26.7006F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(19.3978F, -0.2935F, -19.3978F, 3.0107F, -0.7854F, 0.0F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(164, 162).addBox(-1.5F, -3.4508F, -30.8911F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(19.3978F, -0.2935F, -19.3978F, -3.098F, -0.7854F, 0.0F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(189, 105).addBox(-1.5F, -1.2228F, 17.1227F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.3978F, -0.2935F, -19.3978F, 0.0873F, -0.7854F, 0.0F));

		PartDefinition cube_r54 = bone5.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(104, 177).addBox(-1.5F, -6.1044F, 18.0069F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(19.3978F, -0.2935F, -19.3978F, -0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r55 = bone5.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(0, 44).addBox(-1.5F, 1.7691F, 9.0749F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.3978F, -0.2935F, -19.3978F, 0.2618F, -0.7854F, 0.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(-24.3402F, 25.7194F, -25.9945F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(177, 167).addBox(-1.5F, -1.1493F, -0.6125F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.7222F, 0.7401F, -0.0133F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(189, 84).addBox(-1.5F, -1.5423F, -5.9355F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.7658F, 0.7401F, -0.0133F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(188, 75).addBox(-1.5F, -1.5319F, 4.2872F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(5.5035F, -0.9616F, 6.6578F, 0.2449F, 0.7401F, -0.0133F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(17, 165).addBox(-1.5F, -1.978F, -8.222F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.8187F, -2.6531F, 0.7283F, 3.0956F, 0.6678F, 0.0455F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(147, 176).addBox(-1.5F, -1.3332F, -3.0704F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.8531F, 0.7401F, -0.0133F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(0, 163).addBox(-1.5F, -0.6069F, 1.3331F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.5476F, 0.7401F, -0.0133F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(5, 62).addBox(-1.5F, 2.1413F, 8.7151F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5035F, -0.9616F, 6.6578F, 0.6812F, 0.7401F, -0.0133F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(30, 190).addBox(-1.5F, 0.5499F, 7.4754F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5035F, -0.9616F, 6.6578F, 0.5067F, 0.7401F, -0.0133F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(184, 133).addBox(-1.5F, -0.7264F, -1.7707F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(5.5035F, -0.9616F, 6.6578F, -2.8531F, 0.7401F, -0.0133F));

		PartDefinition cube_r65 = bone4.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(176, 159).addBox(-1.5F, -0.3905F, -4.7805F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(5.5035F, -0.9616F, 6.6578F, -3.1149F, 0.7401F, -0.0133F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 21.7422F, 0.0F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(178, 0).addBox(-1.5F, -6.1044F, -22.0069F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(63, 0).addBox(-1.5F, 1.7691F, -17.0749F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, -0.7854F, 0.0F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(178, 89).addBox(-1.5F, -0.8394F, 30.0658F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.098F, -0.7854F, 0.0F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(43, 178).addBox(-1.5F, 7.6081F, 19.8868F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.7489F, -0.7854F, 0.0F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(178, 107).addBox(-1.5F, 2.0868F, 32.7401F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.0107F, -0.7854F, 0.0F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(34, 165).addBox(-1.5F, -3.4508F, 25.8911F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.098F, -0.7854F, 0.0F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(179, 22).addBox(-1.5F, -2.8034F, 35.3816F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, -0.7854F, 0.0F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(165, 38).addBox(-1.5F, -9.5816F, 36.6149F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9671F, -0.7854F, 0.0F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(190, 123).addBox(-1.5F, -1.2228F, -19.1227F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, -0.7854F, 0.0F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(38, 155).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(18.2307F, 0.6255F, -18.2307F, -3.0543F, -0.7854F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(20.1001F, 22.5267F, 19.8684F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(63, 12).addBox(-1.5F, 2.0279F, 10.0408F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.1001F, -0.7845F, -19.8684F, 0.2618F, 0.7854F, 0.0F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(129, 190).addBox(-1.5F, -1.1357F, 18.1189F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.1001F, -0.7845F, -19.8684F, 0.0873F, 0.7854F, 0.0F));

		PartDefinition cube_r78 = bone2.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(179, 62).addBox(-1.5F, -6.2781F, 18.9917F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-20.1001F, -0.7845F, -19.8684F, -0.1745F, 0.7854F, 0.0F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(165, 84).addBox(-1.5F, -0.9536F, 3.219F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(4.8723F, 2.0377F, 4.7061F, -2.7869F, -0.8088F, 3.1363F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(119, 179).addBox(-1.5F, 7.9908F, -24.8107F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-20.1001F, -0.7845F, -19.8684F, 2.7489F, 0.7854F, 0.0F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(160, 190).addBox(-1.5F, 1.342F, -27.692F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-20.1001F, -0.7845F, -19.8684F, 3.0107F, 0.7854F, 0.0F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(158, 180).addBox(-1.5F, -1.6668F, -0.9296F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(6.0092F, 1.4143F, 5.7183F, 3.0675F, -0.8241F, -3.1356F));

		PartDefinition cube_r83 = bone2.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(179, 125).addBox(-1.5F, -1.4577F, 1.9355F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(6.0092F, 1.4143F, 5.7183F, -3.1284F, -0.8241F, -3.1356F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(0, 181).addBox(-1.5F, -1.8507F, -3.3875F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(6.0092F, 1.4143F, 5.7183F, -3.0848F, -0.8241F, -3.1356F));

		PartDefinition cube_r85 = bone2.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(132, 165).addBox(-1.5F, -2.3931F, -6.3331F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(6.0092F, 1.4143F, 5.7183F, -2.9102F, -0.8241F, -3.1356F));

		PartDefinition bone11 = partdefinition.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-26.6129F, 20.5825F, 8.9033F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r86 = bone11.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(149, 26).addBox(6.1657F, 0.4519F, 7.7491F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3871F, 0.8408F, -7.9033F, -2.9671F, -1.309F, 0.0F));

		PartDefinition cube_r87 = bone11.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(39, 195).addBox(6.1531F, 1.3729F, 5.655F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3871F, 0.8408F, -7.9033F, -2.7925F, -1.309F, -0.0436F));

		PartDefinition cube_r88 = bone11.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(15, 0).addBox(6.1465F, 0.3638F, 2.5479F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.3871F, 0.8408F, -7.9033F, -2.9174F, -1.3168F, -0.0988F));

		PartDefinition cube_r89 = bone11.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(79, 82).addBox(6.5945F, -3.4508F, -0.6766F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.3871F, 0.8408F, -7.9033F, 0.006F, -1.3168F, -0.4915F));

		PartDefinition cube_r90 = bone11.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(73, 41).addBox(6.3071F, -3.744F, -0.8213F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.3871F, 0.8408F, -7.9033F, 0.1806F, -1.3168F, -0.2734F));

		PartDefinition cube_r91 = bone11.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(31, 122).addBox(6.1465F, -4.0214F, -2.6859F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.3871F, 0.8408F, -7.9033F, 0.4424F, -1.3168F, -0.0988F));

		PartDefinition cube_r92 = bone11.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(124, 80).addBox(6.5945F, -3.155F, 3.5991F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.3871F, 0.8408F, -7.9033F, 0.0933F, -1.3168F, -0.4915F));

		PartDefinition cube_r93 = bone11.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(15, 190).addBox(6.3716F, -0.7058F, 6.3623F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(-0.3871F, 0.8408F, -7.9033F, 0.1806F, -1.3168F, -0.1425F));

		PartDefinition cube_r94 = bone11.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(188, 97).addBox(6.4664F, -3.1343F, 8.5721F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(-0.3871F, 0.8408F, -7.9033F, 0.0497F, -1.3168F, -0.2734F));

		PartDefinition cube_r95 = bone11.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(120, 121).addBox(6.4664F, -5.252F, 10.1552F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(-0.3871F, 0.8408F, -7.9033F, -0.1249F, -1.3168F, -0.2734F));

		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-28.2798F, 22.0357F, -0.537F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r96 = bone8.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.963F, -4.6918F, 8.2693F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2798F, -0.6124F, 0.537F, 0.0F, 1.5708F, 0.2618F));

		PartDefinition cube_r97 = bone8.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(0, 24).addBox(-0.963F, -3.1845F, 6.9584F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2798F, -0.6124F, 0.537F, 0.0F, 1.5708F, 0.0873F));

		PartDefinition cube_r98 = bone8.addOrReplaceChild("cube_r98",
				CubeListBuilder.create().texOffs(142, 103).addBox(-0.963F, -2.5183F, -1.1869F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(1.2798F, -0.6124F, 0.537F, 0.0F, 1.5708F, 3.0107F));

		PartDefinition cube_r99 = bone8.addOrReplaceChild("cube_r99",
				CubeListBuilder.create().texOffs(99, 118).addBox(-0.963F, -1.249F, 3.6933F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(1.2798F, -0.6124F, 0.537F, 0.0F, 1.5708F, -0.1745F));

		PartDefinition cube_r100 = bone8.addOrReplaceChild("cube_r100",
				CubeListBuilder.create().texOffs(120, 0).addBox(-0.963F, -2.6948F, -4.1532F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(1.2798F, -0.6124F, 0.537F, 0.0F, 1.5708F, 2.7489F));

		PartDefinition cube_r101 = bone8.addOrReplaceChild("cube_r101",
				CubeListBuilder.create().texOffs(73, 32).addBox(-0.963F, -2.6286F, -0.2507F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.2798F, -0.6124F, 0.537F, 0.0F, 1.5708F, -3.098F));

		PartDefinition cube_r102 = bone8.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(121, 57).addBox(-0.963F, -1.643F, 6.8526F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(1.2798F, -0.6124F, 0.537F, 0.0F, 1.5708F, 3.0107F));

		PartDefinition cube_r103 = bone8.addOrReplaceChild("cube_r103",
				CubeListBuilder.create().texOffs(120, 8).addBox(-0.963F, -2.2988F, 3.9517F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(1.2798F, -0.6124F, 0.537F, 0.0F, 1.5708F, 3.098F));

		PartDefinition cube_r104 = bone8.addOrReplaceChild("cube_r104",
				CubeListBuilder.create().texOffs(0, 122).addBox(-0.963F, -3.1223F, 9.2287F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(1.2798F, -0.6124F, 0.537F, 0.0F, 1.5708F, -3.1416F));

		PartDefinition cube_r105 = bone8.addOrReplaceChild("cube_r105",
				CubeListBuilder.create().texOffs(57, 82).addBox(-0.963F, -5.3542F, 10.804F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(1.2798F, -0.6124F, 0.537F, 0.0F, 1.5708F, -2.9671F));

		PartDefinition bone17 = partdefinition.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offsetAndRotation(28.2798F, 22.0357F, -0.537F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r106 = bone17.addOrReplaceChild("cube_r106",
				CubeListBuilder.create().texOffs(0, 12).addBox(-2.037F, -4.6918F, 8.2693F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2798F, -0.6124F, 0.537F, 0.0F, -1.5708F, -0.2618F));

		PartDefinition cube_r107 = bone17.addOrReplaceChild("cube_r107",
				CubeListBuilder.create().texOffs(11, 24).addBox(-2.037F, -3.1845F, 6.9584F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2798F, -0.6124F, 0.537F, 0.0F, -1.5708F, -0.0873F));

		PartDefinition cube_r108 = bone17.addOrReplaceChild("cube_r108",
				CubeListBuilder.create().texOffs(164, 26).addBox(-2.037F, -1.249F, 3.6933F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.2798F, -0.6124F, 0.537F, 0.0F, -1.5708F, 0.1745F));

		PartDefinition cube_r109 = bone17.addOrReplaceChild("cube_r109",
				CubeListBuilder.create().texOffs(143, 0).addBox(-2.037F, -2.5183F, -1.1869F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-1.2798F, -0.6124F, 0.537F, 0.0F, -1.5708F, -3.0107F));

		PartDefinition cube_r110 = bone17.addOrReplaceChild("cube_r110",
				CubeListBuilder.create().texOffs(160, 103).addBox(-2.037F, -2.6286F, -0.2507F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-1.2798F, -0.6124F, 0.537F, 0.0F, -1.5708F, 3.098F));

		PartDefinition cube_r111 = bone17.addOrReplaceChild("cube_r111",
				CubeListBuilder.create().texOffs(69, 145).addBox(-2.037F, -2.6948F, -4.1532F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-1.2798F, -0.6124F, 0.537F, 0.0F, -1.5708F, -2.7489F));

		PartDefinition cube_r112 = bone17.addOrReplaceChild("cube_r112",
				CubeListBuilder.create().texOffs(46, 143).addBox(-2.037F, -2.2988F, 3.9517F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-1.2798F, -0.6124F, 0.537F, 0.0F, -1.5708F, -3.098F));

		PartDefinition cube_r113 = bone17.addOrReplaceChild("cube_r113",
				CubeListBuilder.create().texOffs(92, 140).addBox(-2.037F, -1.643F, 6.8526F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(-1.2798F, -0.6124F, 0.537F, 0.0F, -1.5708F, -3.0107F));

		PartDefinition cube_r114 = bone17.addOrReplaceChild("cube_r114",
				CubeListBuilder.create().texOffs(0, 140).addBox(-2.037F, -3.1223F, 9.2287F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(-1.2798F, -0.6124F, 0.537F, 0.0F, -1.5708F, 3.1416F));

		PartDefinition cube_r115 = bone17.addOrReplaceChild("cube_r115",
				CubeListBuilder.create().texOffs(160, 94).addBox(-2.037F, -5.3542F, 10.804F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(-1.2798F, -0.6124F, 0.537F, 0.0F, -1.5708F, 2.9671F));

		PartDefinition bone16 = partdefinition.addOrReplaceChild("bone16", CubeListBuilder.create(),
				PartPose.offsetAndRotation(26.6129F, 20.5825F, 8.9033F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r116 = bone16.addOrReplaceChild("cube_r116",
				CubeListBuilder.create().texOffs(0, 151).addBox(-9.1657F, 0.4519F, 7.7491F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3871F, 0.8408F, -7.9033F, -2.9671F, 1.309F, 0.0F));

		PartDefinition cube_r117 = bone16.addOrReplaceChild("cube_r117",
				CubeListBuilder.create().texOffs(195, 44).addBox(-9.1531F, 1.3729F, 5.655F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3871F, 0.8408F, -7.9033F, -2.7925F, 1.309F, 0.0436F));

		PartDefinition cube_r118 = bone16.addOrReplaceChild("cube_r118",
				CubeListBuilder.create().texOffs(15, 12).addBox(-9.1465F, 0.3638F, 2.5479F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.3871F, 0.8408F, -7.9033F, -2.9174F, 1.3168F, 0.0988F));

		PartDefinition cube_r119 = bone16.addOrReplaceChild("cube_r119",
				CubeListBuilder.create().texOffs(84, 50).addBox(-9.3071F, -3.744F, -0.8213F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.3871F, 0.8408F, -7.9033F, 0.1806F, 1.3168F, 0.2734F));

		PartDefinition cube_r120 = bone16.addOrReplaceChild("cube_r120",
				CubeListBuilder.create().texOffs(160, 66).addBox(-9.5945F, -3.4508F, -0.6766F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.3871F, 0.8408F, -7.9033F, 0.006F, 1.3168F, 0.4915F));

		PartDefinition cube_r121 = bone16.addOrReplaceChild("cube_r121",
				CubeListBuilder.create().texOffs(69, 137).addBox(-9.1465F, -4.0214F, -2.6859F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.3871F, 0.8408F, -7.9033F, 0.4424F, 1.3168F, 0.0988F));

		PartDefinition cube_r122 = bone16.addOrReplaceChild("cube_r122",
				CubeListBuilder.create().texOffs(46, 135).addBox(-9.5945F, -3.155F, 3.5991F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.3871F, 0.8408F, -7.9033F, 0.0933F, 1.3168F, 0.4915F));

		PartDefinition cube_r123 = bone16.addOrReplaceChild("cube_r123",
				CubeListBuilder.create().texOffs(190, 16).addBox(-9.3716F, -0.7058F, 6.3623F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.3871F, 0.8408F, -7.9033F, 0.1806F, 1.3168F, 0.1425F));

		PartDefinition cube_r124 = bone16.addOrReplaceChild("cube_r124",
				CubeListBuilder.create().texOffs(188, 163).addBox(-9.4664F, -3.1343F, 8.5721F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(0.3871F, 0.8408F, -7.9033F, 0.0497F, 1.3168F, 0.2734F));

		PartDefinition cube_r125 = bone16.addOrReplaceChild("cube_r125",
				CubeListBuilder.create().texOffs(103, 159).addBox(-9.4664F, -5.252F, 10.1552F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.3871F, 0.8408F, -7.9033F, -0.1249F, 1.3168F, 0.2734F));

		PartDefinition bone15 = partdefinition.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offsetAndRotation(26.4149F, 22.7163F, -9.3065F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r126 = bone15.addOrReplaceChild("cube_r126",
				CubeListBuilder.create().texOffs(23, 153).addBox(-9.6463F, -6.6498F, 7.1798F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5851F, -0.293F, 8.3065F, -0.3927F, -1.3526F, 0.0F));

		PartDefinition cube_r127 = bone15.addOrReplaceChild("cube_r127",
				CubeListBuilder.create().texOffs(0, 105).addBox(-9.6463F, -5.302F, 6.2254F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5851F, -0.293F, 8.3065F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition cube_r128 = bone15.addOrReplaceChild("cube_r128",
				CubeListBuilder.create().texOffs(23, 135).addBox(-9.8463F, -5.6043F, 8.1441F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(0.5851F, -0.293F, 8.3065F, 3.0107F, -1.3526F, 0.0F));

		PartDefinition cube_r129 = bone15.addOrReplaceChild("cube_r129",
				CubeListBuilder.create().texOffs(0, 132).addBox(-9.8463F, -4.2453F, 6.1012F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.5851F, -0.293F, 8.3065F, -3.1416F, -1.3526F, 0.0F));

		PartDefinition cube_r130 = bone15.addOrReplaceChild("cube_r130",
				CubeListBuilder.create().texOffs(99, 185).addBox(-9.8463F, -1.8615F, 3.8872F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.5851F, -0.293F, 8.3065F, -2.8362F, -1.3526F, 0.0F));

		PartDefinition cube_r131 = bone15.addOrReplaceChild("cube_r131",
				CubeListBuilder.create().texOffs(99, 126).addBox(-9.6463F, -0.4781F, -4.4808F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.5851F, -0.293F, 8.3065F, -2.8798F, -1.3526F, 0.0F));

		PartDefinition cube_r132 = bone15.addOrReplaceChild("cube_r132",
				CubeListBuilder.create().texOffs(115, 170).addBox(-9.7463F, -0.4047F, -0.1718F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.5851F, -0.293F, 8.3065F, -2.5307F, -1.3526F, 0.0F));

		PartDefinition cube_r133 = bone15.addOrReplaceChild("cube_r133",
				CubeListBuilder.create().texOffs(194, 129).addBox(-9.6463F, -0.5869F, -1.178F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.5851F, -0.293F, 8.3065F, -2.7489F, -1.3526F, 0.0F));

		PartDefinition cube_r134 = bone15.addOrReplaceChild("cube_r134",
				CubeListBuilder.create().texOffs(84, 185).addBox(-9.6463F, -3.484F, 3.5333F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.5851F, -0.293F, 8.3065F, 0.0436F, -1.3526F, 0.0F));

		PartDefinition cube_r135 = bone15.addOrReplaceChild("cube_r135",
				CubeListBuilder.create().texOffs(86, 159).addBox(-9.8463F, -7.6102F, 9.3048F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.5851F, -0.293F, 8.3065F, 2.8362F, -1.3526F, 0.0F));

		PartDefinition bone14 = partdefinition.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 35.0357F, -20.4327F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r136 = bone14.addOrReplaceChild("cube_r136",
				CubeListBuilder.create().texOffs(149, 167).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9599F, -11.9989F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r137 = bone14.addOrReplaceChild("cube_r137",
				CubeListBuilder.create().texOffs(134, 182).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(0.0F, 1.0099F, -9.9489F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r138 = bone14.addOrReplaceChild("cube_r138",
				CubeListBuilder.create().texOffs(182, 38).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, 0.6849F, -7.4784F, -3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r139 = bone14.addOrReplaceChild("cube_r139",
				CubeListBuilder.create().texOffs(30, 182).addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, 0.4671F, -5.1309F, -3.098F, 0.0F, 0.0F));

		PartDefinition cube_r140 = bone14.addOrReplaceChild("cube_r140",
				CubeListBuilder.create().texOffs(15, 182).addBox(-1.5F, -2.4141F, -5.4827F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.1557F, 0.159F, -2.7489F, 0.0F, 0.0F));

		PartDefinition cube_r141 = bone14.addOrReplaceChild("cube_r141",
				CubeListBuilder.create().texOffs(64, 166).addBox(-1.5F, -1.9086F, -0.3944F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, 0.1007F, 1.1049F, 3.098F, 0.0F, 0.0F));

		PartDefinition cube_r142 = bone14.addOrReplaceChild("cube_r142",
				CubeListBuilder.create().texOffs(192, 113).addBox(-1.5F, -1.9481F, -2.057F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0666F, 0.4916F, -3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r143 = bone14.addOrReplaceChild("cube_r143",
				CubeListBuilder.create().texOffs(181, 115).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -1.5275F, 7.915F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r144 = bone14.addOrReplaceChild("cube_r144",
				CubeListBuilder.create().texOffs(56, 191).addBox(-1.5F, -1.5F, 2.0F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.8583F, 6.3662F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r145 = bone14.addOrReplaceChild("cube_r145",
				CubeListBuilder.create().texOffs(0, 69).addBox(-1.5F, -1.5F, -4.0F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5198F, 13.9572F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone13 = partdefinition.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offsetAndRotation(8.4403F, 27.5825F, -23.7657F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r146 = bone13.addOrReplaceChild("cube_r146",
				CubeListBuilder.create().texOffs(98, 168).addBox(-1.5F, -1.6534F, -1.2362F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(2.7597F, 1.2993F, -9.9927F, 2.7348F, 0.2443F, 3.0716F));

		PartDefinition cube_r147 = bone13.addOrReplaceChild("cube_r147",
				CubeListBuilder.create().texOffs(0, 189).addBox(-1.5F, -1.5684F, -3.2712F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(2.7597F, 1.2993F, -9.9927F, 2.9093F, 0.2443F, 3.0716F));

		PartDefinition cube_r148 = bone13.addOrReplaceChild("cube_r148",
				CubeListBuilder.create().texOffs(190, 66).addBox(-1.5F, -1.7339F, -4.4973F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(2.446F, 1.1243F, -8.9755F, -3.1082F, 0.2513F, 3.1048F));

		PartDefinition cube_r149 = bone13.addOrReplaceChild("cube_r149",
				CubeListBuilder.create().texOffs(54, 183).addBox(-1.5F, -1.4577F, -5.9355F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(2.2768F, 1.8729F, -7.7771F, 2.7297F, 0.2233F, 3.0197F));

		PartDefinition cube_r150 = bone13.addOrReplaceChild("cube_r150",
				CubeListBuilder.create().texOffs(81, 168).addBox(-1.5F, -1.022F, -8.222F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.8234F, 1.14F, -6.1883F, 2.6424F, 0.2233F, 3.0197F));

		PartDefinition cube_r151 = bone13.addOrReplaceChild("cube_r151",
				CubeListBuilder.create().texOffs(114, 109).addBox(-1.4995F, -2.152F, -8.0187F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(1.3608F, -0.6657F, -5.6027F, 3.0402F, 0.2443F, 3.0716F));

		PartDefinition cube_r152 = bone13.addOrReplaceChild("cube_r152",
				CubeListBuilder.create().texOffs(31, 114).addBox(-1.4924F, -1.0216F, 7.7722F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.7075F, -1.3918F, -3.331F, 0.1221F, 0.2527F, 3.116F));

		PartDefinition cube_r153 = bone13.addOrReplaceChild("cube_r153",
				CubeListBuilder.create().texOffs(195, 179).addBox(-1.475F, -1.4285F, 10.2526F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3834F, -3.3052F, -1.8297F, 0.3039F, 0.2615F, 3.1299F));

		PartDefinition cube_r154 = bone13.addOrReplaceChild("cube_r154",
				CubeListBuilder.create().texOffs(146, 155).addBox(-1.475F, -3.459F, 9.4563F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2153F, -3.3071F, 0.6355F, 0.1745F, 0.2618F, 3.1416F));

		PartDefinition cube_r155 = bone13.addOrReplaceChild("cube_r155",
				CubeListBuilder.create().texOffs(183, 46).addBox(-1.4924F, -3.7996F, -8.0863F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.7075F, -1.3918F, -3.331F, -2.8013F, 0.2527F, 3.116F));

		PartDefinition bone12 = partdefinition.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-7.7696F, 30.7163F, -21.5678F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r156 = bone12.addOrReplaceChild("cube_r156",
				CubeListBuilder.create().texOffs(187, 140).addBox(-1.6F, -1.7324F, 3.429F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, 0.811F, -2.8362F, 0.2182F, 0.0F));

		PartDefinition cube_r157 = bone12.addOrReplaceChild("cube_r157",
				CubeListBuilder.create().texOffs(0, 172).addBox(-1.5F, -0.4193F, -0.6476F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, 0.811F, -2.5307F, 0.2182F, 0.0F));

		PartDefinition cube_r158 = bone12.addOrReplaceChild("cube_r158",
				CubeListBuilder.create().texOffs(169, 184).addBox(-1.4F, -0.3292F, -4.9329F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, 0.811F, -2.8798F, 0.2182F, 0.0F));

		PartDefinition cube_r159 = bone12.addOrReplaceChild("cube_r159",
				CubeListBuilder.create().texOffs(187, 149).addBox(-1.4F, -3.7273F, 3.9424F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, 0.811F, 0.0436F, 0.2182F, 0.0F));

		PartDefinition cube_r160 = bone12.addOrReplaceChild("cube_r160",
				CubeListBuilder.create().texOffs(171, 192).addBox(-1.4F, -5.6429F, 6.5577F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, 0.811F, -0.2182F, 0.2182F, 0.0F));

		PartDefinition cube_r161 = bone12.addOrReplaceChild("cube_r161",
				CubeListBuilder.create().texOffs(147, 77).addBox(-1.4F, -7.0432F, 7.4478F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, 0.811F, -0.3927F, 0.2182F, 0.0F));

		PartDefinition cube_r162 = bone12.addOrReplaceChild("cube_r162",
				CubeListBuilder.create().texOffs(169, 10).addBox(-1.6F, -7.2416F, 9.0035F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, 0.811F, 2.8362F, 0.2182F, 0.0F));

		PartDefinition cube_r163 = bone12.addOrReplaceChild("cube_r163",
				CubeListBuilder.create().texOffs(183, 54).addBox(-1.6F, -5.2936F, 7.7834F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, 0.811F, 3.0107F, 0.2182F, 0.0F));

		PartDefinition cube_r164 = bone12.addOrReplaceChild("cube_r164",
				CubeListBuilder.create().texOffs(114, 187).addBox(-1.6F, -3.9844F, 5.703F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, 0.811F, -3.1416F, 0.2182F, 0.0F));

		PartDefinition cube_r165 = bone12.addOrReplaceChild("cube_r165",
				CubeListBuilder.create().texOffs(149, 194).addBox(-1.4F, -0.4982F, -1.6457F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.1696F, -0.032F, 0.811F, -2.7489F, 0.2182F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone17.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone16.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone15.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone14.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}