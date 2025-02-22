package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;
import net.mcreator.craftnotaizai.client.model.Modelthe_ultimate;
import net.mcreator.craftnotaizai.client.model.Modelnormal_fairy_wings;
import net.mcreator.craftnotaizai.client.model.Modelnew_helbram_wings;
import net.mcreator.craftnotaizai.client.model.Modelkingwings;
import net.mcreator.craftnotaizai.client.model.Modelgloxiana_wings;
import net.mcreator.craftnotaizai.client.model.Modelelaine_wing3;
import net.mcreator.craftnotaizai.client.model.Modeldemon_wing;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class PlayerRenderProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		String texture = "";
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		Entity _evtEntity = _evt.getEntity();
		PlayerRenderer _pr = null;
		PoseStack poseStack = _evt.getPoseStack();
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
			com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
					(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getModelName().equals("slim") : false), _texture);
			_pr = emptyRenderer;
			emptyRenderer.clearLayers();
			emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("HellBlaze")
				|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Full Counter")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "demon_mark";
		}
		if ((entity.getDisplayName().getString()).equals("rednightwing762")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "rednightwing762_mark";
		}
		if ((entity.getDisplayName().getString()).equals("BilbLAZY")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
			}
			texture = "bilb_mark";
		}
		if ((entity.getDisplayName().getString()).equals("Cromta")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "cromta_mark1";
		}
		if ((entity.getDisplayName().getString()).equals("_Qlover")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "clover_mark";
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Invasion")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "gowthermark";
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Combo Star")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
			}
			texture = "deireri_demon_mark";
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Full Size")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "fraudrin_demon_mark";
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Trick Star")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
			}
			texture = "monspeet_mark";
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Critical Over")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
			}
			texture = "galand_mark";
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Curse")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			texture = "curse_mark";
		}
		if (!(entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).MagicalCounter
				&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Full Counter")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "estarpssa_mark";
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Hell Gate")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			texture = "hell_gate_mark";
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Ominous Nebula")) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "estarpssa_mark";
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).humandemonmark) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			texture = "hendrickson_1";
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Half) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "eliz";
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Awaken) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "eliz_aweken";
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Giant")
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).humandemonmark) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
			}
			texture = "giant_demon_mark";
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Fairy")
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).humandemonmark) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			texture = "fairy_demon_mark";
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).berserkmode) {
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			texture = "berserk";
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).graydemonform) {
			if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				if (_evt instanceof RenderLivingEvent.Pre _pre) {
					_pre.setCanceled(true);
				}
			}
			texture = "hendrickson_3";
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).FullPowerDemonMark) {
			texture = "un_demon_mark";
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Half
				|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
				|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).berserkmode
				|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).graydemonform
				|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Awaken
				|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).humandemonmark
				|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).FullPowerDemonMark) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).FullPowerDemonMark
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Levitation) {
			texture = "demon_wings";
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				Modeldemon_wing newModel = new Modeldemon_wing(context.bakeLayer(Modeldemon_wing.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Fairy")
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Gloxinia == false
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 35
				&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Disaster")) {
			texture = "kings_wing_texture2";
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				Modelkingwings newModel = new Modelkingwings(context.bakeLayer(Modelkingwings.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Fairy")
				&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Miracle Wind")) {
			texture = "elaine_wings";
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				Modelelaine_wing3 newModel = new Modelelaine_wing3(context.bakeLayer(Modelelaine_wing3.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Fairy")
				&& (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Blaze")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Boost")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("IceFang")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Wind Shooter")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Aura Burst")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Bullet Squall")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Goen no Jujin"))) {
			texture = "butterfly_wings";
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				Modelnormal_fairy_wings newModel = new Modelnormal_fairy_wings(context.bakeLayer(Modelnormal_fairy_wings.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Fairy")
				&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Hunter Wisp")) {
			texture = "helbram-wing-texture";
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				Modelnew_helbram_wings newModel = new Modelnew_helbram_wings(context.bakeLayer(Modelnew_helbram_wings.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Fairy")
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Gloxinia == true
				&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Disaster")) {
			texture = "gloxiana-wing-texture";
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				Modelgloxiana_wings newModel = new Modelgloxiana_wings(context.bakeLayer(Modelgloxiana_wings.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).heavy_metal) {
			texture = "metal";
			if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				if (_evt instanceof RenderLivingEvent.Pre _pre) {
					_pre.setCanceled(true);
				}
			}
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).TheOneUltimate) {
			texture = "the_one_ultimate";
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				Modelthe_ultimate newModel = new Modelthe_ultimate(context.bakeLayer(Modelthe_ultimate.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).lightningarmor) {
			texture = "energy_armor";
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
		if (entity instanceof LivingEntity _livEnt57 && _livEnt57.hasEffect(CraftNoTaizaiModMobEffects.FREEZE_COFFIN_POTION_EFFECT.get())) {
			texture = "freeze_coffin";
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).fire_protection) {
			texture = "fire_protection";
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).hard_protection) {
			texture = "hard_protection";
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).aqua_dress) {
			texture = "aqua_dress";
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
			}
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
		if (entity instanceof LivingEntity _livEnt83 && _livEnt83.hasEffect(CraftNoTaizaiModMobEffects.FOSSILIZATION_EFFECT.get())) {
			texture = "stone_ban";
			if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				if (_evt instanceof RenderLivingEvent.Pre _pre) {
					_pre.setCanceled(true);
				}
			}
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
					_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
				}
				new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
	}
}
