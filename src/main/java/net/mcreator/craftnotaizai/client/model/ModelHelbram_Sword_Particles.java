package net.mcreator.craftnotaizai.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelHelbram_Sword_Particles<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "model_helbram_sword_particles"), "main");
	public final ModelPart Helbramssword;

	public ModelHelbram_Sword_Particles(ModelPart root) {
		this.Helbramssword = root.getChild("Helbramssword");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Helbramssword = partdefinition.addOrReplaceChild("Helbramssword",
				CubeListBuilder.create().texOffs(11, 4).addBox(-0.275F, -7.0F, -1.3F, 0.6F, 1.25F, 2.25F, new CubeDeformation(0.0F)).texOffs(10, 14).addBox(-0.275F, -8.0F, -1.1F, 0.6F, 1.0F, 2.15F, new CubeDeformation(0.0F)).texOffs(17, 6)
						.addBox(-0.275F, -9.0F, -0.85F, 0.6F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 12).addBox(-0.275F, -9.75F, -0.6F, 0.6F, 0.75F, 1.85F, new CubeDeformation(0.0F)).texOffs(20, 19)
						.addBox(-0.275F, -10.5F, -0.35F, 0.6F, 0.75F, 1.75F, new CubeDeformation(0.0F)).texOffs(22, 10).addBox(-0.275F, -11.25F, -0.05F, 0.6F, 0.75F, 1.45F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-0.275F, -12.0F, 0.4F, 0.6F, 0.75F, 1.1F, new CubeDeformation(0.0F)).texOffs(23, 0).addBox(-0.275F, -12.75F, 0.8F, 0.6F, 0.75F, 0.7F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-0.275F, -13.5F, 1.15F, 0.6F, 0.75F, 0.35F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(-0.475F, 3.8464F, -0.35F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.425F, 3.15F, -1.4F, 0.9F, 0.9F, 3.1F, new CubeDeformation(0.0F)).texOffs(5, 10).addBox(-0.275F, -4.75F, -0.85F, 0.6F, 2.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 20)
						.addBox(-0.275F, -4.55F, 1.15F, 0.6F, 1.7F, 0.1F, new CubeDeformation(0.0F)).texOffs(19, 10).addBox(-0.275F, -4.05F, 1.25F, 0.6F, 0.85F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-0.275F, -2.25F, -0.8F, 0.6F, 1.5F, 1.9F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(-0.275F, -0.75F, -0.75F, 0.6F, 2.5F, 1.8F, new CubeDeformation(0.0F)).texOffs(15, 16)
						.addBox(-0.275F, 1.75F, -0.825F, 0.6F, 1.5F, 1.95F, new CubeDeformation(0.0F)).texOffs(16, 4).addBox(-0.425F, 3.2449F, 1.94F, 0.9F, 0.5F, 0.75F, new CubeDeformation(0.0F)).texOffs(6, 2)
						.addBox(-0.425F, 3.3449F, 2.69F, 0.9F, 0.3F, 0.25F, new CubeDeformation(0.0F)).texOffs(9, 4).addBox(-0.425F, 3.3949F, 2.94F, 0.9F, 0.2F, 0.25F, new CubeDeformation(0.0F)).texOffs(5, 7)
						.addBox(-0.425F, 3.3949F, -2.89F, 0.9F, 0.2F, 0.25F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(-0.425F, 3.3449F, -2.64F, 0.9F, 0.3F, 0.25F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-0.425F, 3.2449F, -2.39F, 0.9F, 0.5F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(-0.275F, -5.75F, -1.1F, 0.6F, 1.0F, 2.15F, new CubeDeformation(0.0F)).texOffs(17, 21)
						.addBox(-0.275F, -4.75F, -1.0F, 0.6F, 1.5F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.025F, 14.1536F, -0.15F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition cube_r1 = Helbramssword.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.95F, 0.15F, 0.9F, 1.2F, 0.35F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.075F, 6.8464F, -0.5F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Helbramssword.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 5).addBox(-0.5F, -2.95F, -0.5F, 0.9F, 1.2F, 0.35F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.075F, 6.8464F, 0.8F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Helbramssword.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, -0.1F, -0.25F, 1.0F, 0.6F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, 4.0046F, 0.6516F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Helbramssword.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 16).addBox(-0.5F, -0.1F, -1.75F, 1.0F, 0.6F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, 4.0046F, -0.3516F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Helbramssword.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 5).addBox(-0.5F, -0.5F, -1.75F, 1.0F, 0.6F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, 2.9883F, -0.3516F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Helbramssword.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 0.6F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.025F, 2.9883F, 0.6516F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Helbramssword.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 19).addBox(-0.5F, -0.5F, -1.0F, 1.05F, 1.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1464F, 0.15F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Helbramssword.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 3).addBox(-0.9F, 5.1606F, -3.22F, 0.9F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.475F, 3.8464F, 0.65F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Helbramssword.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(22, 16).addBox(-0.3F, -1.0F, -0.5F, 0.8F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.075F, 12.0478F, 1.476F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Helbramssword.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
