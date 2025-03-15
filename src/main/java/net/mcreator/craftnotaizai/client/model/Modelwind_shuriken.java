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

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelwind_shuriken<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelwind_shuriken"), "main");
	public final ModelPart windattack;

	public Modelwind_shuriken(ModelPart root) {
		this.windattack = root.getChild("windattack");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition windattack = partdefinition.addOrReplaceChild("windattack",
				CubeListBuilder.create().texOffs(4, 34).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-9.0F, -1.5F, -9.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(2, 46)
						.addBox(-9.0F, -2.75F, -9.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(2, 46).mirror().addBox(-9.0F, -0.75F, -9.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 21)
						.addBox(-4.0F, -2.5F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 1.5708F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		windattack.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
