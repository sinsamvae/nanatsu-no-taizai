// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFossilization<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fossilization"), "main");
	private final ModelPart spear;

	public ModelFossilization(ModelPart root) {
		this.spear = root.getChild("spear");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition spear = partdefinition.addOrReplaceChild("spear", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.5F, -9.0807F, -0.4945F, 1.0F, 27.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 9)
				.addBox(-0.25F, -11.2315F, -2.4661F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 8)
				.addBox(-0.05F, -18.3744F, -0.3445F, 0.1F, 6.55F, 0.7F, new CubeDeformation(0.0F)).texOffs(5, 17)
				.addBox(-0.05F, -17.2459F, -1.1988F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)).texOffs(17, 3)
				.addBox(-0.05F, -17.2469F, 0.3108F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)).texOffs(10, 26)
				.addBox(-0.25F, -11.2324F, 1.4781F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 4)
				.addBox(-1.0F, -5.0807F, -0.9945F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
				.addBox(-1.0F, -9.0807F, -0.9945F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 20)
				.addBox(-0.75F, -9.5807F, -0.2445F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(25, 26)
				.addBox(-0.75F, -10.0807F, -0.1445F, 1.5F, 0.5F, 0.25F, new CubeDeformation(0.0F)).texOffs(20, 0)
				.addBox(-0.75F, 18.8709F, -1.4945F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(15, 18)
				.addBox(-0.75F, 18.8709F, 0.7555F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(20, 14)
				.addBox(-0.75F, 17.6693F, -0.2928F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(20, 11)
				.addBox(-0.75F, 19.9193F, -0.2928F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(25, 23)
				.addBox(-0.5F, 20.6193F, -0.3428F, 1.0F, 0.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0807F, -0.0055F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition hexadecagon_r1 = spear.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create()
				.texOffs(10, 23).addBox(-0.65F, 17.129F, 6.4855F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F))
				.texOffs(24, 6).addBox(-0.65F, 14.879F, 6.4855F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F))
				.texOffs(15, 21).addBox(-0.65F, 16.0807F, 7.5339F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(20, 21).addBox(-0.65F, 16.0807F, 5.2839F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(27, 12).addBox(-0.15F, -12.1547F, -4.566F, 0.3F, 0.5F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 2).addBox(-0.15F, -12.6547F, -4.566F, 0.3F, 0.5F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(27, 28).addBox(-0.05F, -13.3224F, -5.8657F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(8, 13).addBox(-0.5F, -11.1444F, -6.2096F, 1.0F, 0.5F, 1.5F, new CubeDeformation(0.0F))
				.texOffs(15, 15).addBox(-0.5F, -10.6444F, -4.9096F, 1.0F, 1.3F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.441F, 0.006F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r2 = spear.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create()
				.texOffs(12, 0).addBox(-0.4F, 13.8735F, 13.8801F, 0.8F, 0.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(8, 17).addBox(-0.75F, 12.2378F, 13.2855F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(18, 8).addBox(-0.75F, 12.2378F, 11.0355F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(18, 27).addBox(-0.05F, -13.6117F, -14.0656F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F))
				.texOffs(28, 4).addBox(-0.05F, -11.7682F, -10.7643F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.441F, 0.006F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r3 = spear.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create()
				.texOffs(15, 24).addBox(-0.65F, 17.1287F, -7.0832F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F))
				.texOffs(20, 24).addBox(-0.65F, 14.8787F, -7.0832F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F))
				.texOffs(22, 17).addBox(-0.65F, 16.0803F, -8.2848F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(5, 23).addBox(-0.65F, 16.0803F, -6.0348F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-0.5F, -10.6448F, 3.9087F, 1.0F, 1.3F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 11).addBox(-0.5F, -11.1453F, 4.71F, 1.0F, 0.5F, 1.5F, new CubeDeformation(0.0F))
				.texOffs(28, 28).addBox(-0.05F, -13.3233F, 5.3661F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(15, 27).addBox(-0.15F, -12.1538F, 3.5656F, 0.3F, 0.5F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 6).addBox(-0.15F, -12.6538F, 2.5656F, 0.3F, 0.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.441F, 0.006F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r4 = spear.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create()
				.texOffs(20, 3).addBox(-0.75F, 12.2371F, -14.0362F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(8, 20).addBox(-0.75F, 12.2371F, -11.7862F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(5, 26).addBox(-0.5F, -8.606F, 7.9586F, 1.0F, 0.65F, 0.65F, new CubeDeformation(0.0F))
				.texOffs(27, 0).addBox(-0.05F, -14.7374F, 13.9913F, 0.1F, 1.7F, 0.75F, new CubeDeformation(0.0F))
				.texOffs(27, 15).addBox(-0.05F, -14.7374F, 13.0413F, 0.1F, 0.75F, 0.95F, new CubeDeformation(0.0F))
				.texOffs(21, 27).addBox(-0.05F, -13.6124F, 13.3663F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F))
				.texOffs(24, 28).addBox(-0.05F, -11.7675F, 10.0636F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F))
				.texOffs(4, 0).addBox(-0.15F, -7.2134F, 10.3595F, 0.3F, 0.35F, 0.35F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.15F, -10.7088F, 6.8627F, 0.3F, 0.35F, 0.35F, new CubeDeformation(0.0F))
				.texOffs(8, 8).addBox(-0.35F, -9.8106F, 8.3099F, 0.7F, 1.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.441F, 0.006F, 0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		spear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}