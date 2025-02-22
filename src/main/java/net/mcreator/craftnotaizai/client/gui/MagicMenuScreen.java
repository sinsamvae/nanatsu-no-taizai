package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.MagicMenuMenu;
import net.mcreator.craftnotaizai.procedures.SetSlotButtonProcedure;
import net.mcreator.craftnotaizai.procedures.ReturnPossessionProcedure;
import net.mcreator.craftnotaizai.procedures.ReturnPageProcedure;
import net.mcreator.craftnotaizai.procedures.PossessionSwitchProcedure;
import net.mcreator.craftnotaizai.procedures.PossessionSkillProcedure;
import net.mcreator.craftnotaizai.procedures.PossessionSkill2Procedure;
import net.mcreator.craftnotaizai.procedures.MagicScrollSkill4Procedure;
import net.mcreator.craftnotaizai.procedures.MagicScrollSkill3Procedure;
import net.mcreator.craftnotaizai.procedures.MagicScrollSkill2Procedure;
import net.mcreator.craftnotaizai.procedures.MagicScroll8Procedure;
import net.mcreator.craftnotaizai.procedures.MagicScroll7Procedure;
import net.mcreator.craftnotaizai.procedures.MagicScroll6Procedure;
import net.mcreator.craftnotaizai.procedures.MagicScroll5Procedure;
import net.mcreator.craftnotaizai.procedures.LearnSkillsDisplay1Procedure;
import net.mcreator.craftnotaizai.procedures.LearnDemonSkillsDisplayProcedure;
import net.mcreator.craftnotaizai.procedures.LearnDemonKingDisplayProcedure;
import net.mcreator.craftnotaizai.procedures.DisplaySlotProcedure;
import net.mcreator.craftnotaizai.procedures.DisplaySlot3Procedure;
import net.mcreator.craftnotaizai.procedures.DisplaySlot2Procedure;
import net.mcreator.craftnotaizai.procedures.DisplaySlot1Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayMagicProcedure;
import net.mcreator.craftnotaizai.procedures.DisplayDemonSkill4Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayDemonSkill3Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayDemonSkill2Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayDemonSkill1Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayDemonSKill5Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayDemonKingSkillProcedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbilty17Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility9Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility8Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility7Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility6Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility5Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility4Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility3Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility2Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility24Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility23Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility22Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility21Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility20Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility1Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility19Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility18Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility16Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility15Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility14Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility13Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility11Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayAbility10Procedure;
import net.mcreator.craftnotaizai.procedures.Display12Procedure;
import net.mcreator.craftnotaizai.procedures.DemonKingPowerReturnProcedure;
import net.mcreator.craftnotaizai.procedures.DemonBloodReturnProcedure;
import net.mcreator.craftnotaizai.network.MagicMenuButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MagicMenuScreen extends AbstractContainerScreen<MagicMenuMenu> {
	private final static HashMap<String, Object> guistate = MagicMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_blood;
	ImageButton imagebutton_plusbuttonoutline;
	ImageButton imagebutton_plusbuttonmagic;
	ImageButton imagebutton_plusbuttonover;
	ImageButton imagebutton_plusbuttonover1;
	ImageButton imagebutton_plusbuttonover2;
	ImageButton imagebutton_plusbuttonover3;
	ImageButton imagebutton_plusbuttonover4;
	ImageButton imagebutton_plusbuttonover5;
	ImageButton imagebutton_plusbuttonover6;
	ImageButton imagebutton_overarrow2;
	ImageButton imagebutton_slot;
	ImageButton imagebutton_restart;
	ImageButton imagebutton_berserk_mode;
	ImageButton imagebutton_restart1;
	ImageButton imagebutton_goddess_particle_7;

	public MagicMenuScreen(MagicMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (DemonBloodReturnProcedure.execute(entity))
			if (mouseX > leftPos + -94 && mouseX < leftPos + -70 && mouseY > topPos + -79 && mouseY < topPos + -55)
				guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.magic_menu.tooltip_demon_blood_skills"), mouseX, mouseY);
		if (mouseX > leftPos + -94 && mouseX < leftPos + -70 && mouseY > topPos + -103 && mouseY < topPos + -79)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.magic_menu.tooltip_learned_skills_from_magic_scroll"), mouseX, mouseY);
		if (mouseX > leftPos + -117 && mouseX < leftPos + -93 && mouseY > topPos + -69 && mouseY < topPos + -45)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.magic_menu.tooltip_reset"), mouseX, mouseY);
		if (DemonKingPowerReturnProcedure.execute(entity))
			if (mouseX > leftPos + -70 && mouseX < leftPos + -46 && mouseY > topPos + -103 && mouseY < topPos + -79)
				guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.magic_menu.tooltip_demon_king_magic"), mouseX, mouseY);
		if (mouseX > leftPos + 101 && mouseX < leftPos + 125 && mouseY > topPos + -104 && mouseY < topPos + -80)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.magic_menu.tooltip_back"), mouseX, mouseY);
		if (ReturnPossessionProcedure.execute(entity))
			if (mouseX > leftPos + -70 && mouseX < leftPos + -46 && mouseY > topPos + -79 && mouseY < topPos + -55)
				guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.magic_menu.tooltip_goddess"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/gui.png"), this.leftPos + -94, this.topPos + -102, 0, 0, 196, 186, 196, 186);

		RenderSystem.disableBlend();
	}

	public static HashMap<String, String> getTextboxValues() {
		return textstate;
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				DisplayMagicProcedure.execute(entity), -87, -56, -1, false);
		guiGraphics.drawString(this.font,

				DisplaySlotProcedure.execute(entity), 38, 61, -1, false);
		if (DisplaySlot1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility1Procedure.execute(entity), -80, -44, -1, false);
		if (DisplaySlot1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility2Procedure.execute(entity), -80, -31, -1, false);
		if (DisplaySlot1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility3Procedure.execute(entity), -80, -17, -1, false);
		if (DisplaySlot1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility4Procedure.execute(entity), -80, -3, -1, false);
		if (DisplaySlot1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility5Procedure.execute(entity), -80, 11, -1, false);
		if (DisplaySlot1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility6Procedure.execute(entity), -80, 25, -1, false);
		if (DisplaySlot1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility7Procedure.execute(entity), -80, 39, -1, false);
		if (DisplaySlot1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility8Procedure.execute(entity), -80, 53, -1, false);
		if (DisplaySlot2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility9Procedure.execute(entity), -80, -44, -1, false);
		if (DisplaySlot2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility10Procedure.execute(entity), -80, -31, -1, false);
		if (DisplaySlot2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility11Procedure.execute(), -80, -17, -1, false);
		if (DisplaySlot2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					Display12Procedure.execute(), -80, -3, -1, false);
		if (DisplaySlot2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility13Procedure.execute(), -80, 11, -1, false);
		if (DisplaySlot2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility14Procedure.execute(), -80, 25, -1, false);
		if (DisplaySlot2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility15Procedure.execute(), -80, 39, -1, false);
		if (DisplaySlot2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility16Procedure.execute(), -80, 53, -1, false);
		if (DisplaySlot3Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbilty17Procedure.execute(), -80, -44, -1, false);
		if (DisplaySlot3Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility18Procedure.execute(), -80, -31, -1, false);
		if (DisplaySlot3Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility19Procedure.execute(), -80, -17, -1, false);
		if (DisplaySlot3Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility20Procedure.execute(), -80, -3, -1, false);
		if (DisplaySlot3Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility21Procedure.execute(), -80, 11, -1, false);
		if (DisplaySlot3Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility22Procedure.execute(), -80, 25, -1, false);
		if (DisplaySlot3Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility23Procedure.execute(), -80, 39, -1, false);
		if (DisplaySlot3Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayAbility24Procedure.execute(), -80, 53, -1, false);
		if (LearnSkillsDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					SetSlotButtonProcedure.execute(entity), -80, -44, -1, false);
		if (LearnSkillsDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					MagicScrollSkill2Procedure.execute(entity), -80, -31, -1, false);
		if (LearnSkillsDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					MagicScrollSkill3Procedure.execute(entity), -80, -17, -1, false);
		if (LearnSkillsDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					MagicScrollSkill4Procedure.execute(entity), -80, -4, -1, false);
		if (LearnSkillsDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					MagicScroll5Procedure.execute(entity), -80, 11, -1, false);
		if (LearnSkillsDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					MagicScroll6Procedure.execute(entity), -80, 25, -1, false);
		if (LearnSkillsDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					MagicScroll7Procedure.execute(entity), -80, 39, -1, false);
		if (LearnSkillsDisplay1Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					MagicScroll8Procedure.execute(entity), -80, 53, -1, false);
		if (LearnDemonSkillsDisplayProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayDemonSkill1Procedure.execute(entity), -80, -44, -1, false);
		if (LearnDemonSkillsDisplayProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayDemonSkill2Procedure.execute(entity), -80, -31, -1, false);
		if (LearnDemonSkillsDisplayProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayDemonSkill3Procedure.execute(entity), -80, -17, -1, false);
		if (LearnDemonSkillsDisplayProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayDemonSkill4Procedure.execute(entity), -80, -3, -1, false);
		if (LearnDemonSkillsDisplayProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayDemonSKill5Procedure.execute(entity), -80, 11, -1, false);
		if (LearnDemonKingDisplayProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					DisplayDemonKingSkillProcedure.execute(entity), -80, -44, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.magic_menu.label_empty"), 80, -96, -1, false);
		guiGraphics.drawString(this.font,

				ReturnPageProcedure.execute(entity), 38, -96, -1, false);
		if (PossessionSwitchProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					PossessionSkillProcedure.execute(entity), -79, -44, -1, false);
		if (PossessionSwitchProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					PossessionSkill2Procedure.execute(entity), -80, -31, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_blood = new ImageButton(this.leftPos + -92, this.topPos + -78, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_blood.png"), 16, 32, e -> {
			if (DemonBloodReturnProcedure.execute(entity)) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(0, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (DemonBloodReturnProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_blood", imagebutton_blood);
		this.addRenderableWidget(imagebutton_blood);
		imagebutton_plusbuttonoutline = new ImageButton(this.leftPos + -91, this.topPos + -99, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonoutline.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(1, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonoutline", imagebutton_plusbuttonoutline);
		this.addRenderableWidget(imagebutton_plusbuttonoutline);
		imagebutton_plusbuttonmagic = new ImageButton(this.leftPos + -88, this.topPos + -42, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonmagic.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(2, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 2, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonmagic", imagebutton_plusbuttonmagic);
		this.addRenderableWidget(imagebutton_plusbuttonmagic);
		imagebutton_plusbuttonover = new ImageButton(this.leftPos + -88, this.topPos + -29, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(3, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 3, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover", imagebutton_plusbuttonover);
		this.addRenderableWidget(imagebutton_plusbuttonover);
		imagebutton_plusbuttonover1 = new ImageButton(this.leftPos + -88, this.topPos + -15, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover1.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(4, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 4, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover1", imagebutton_plusbuttonover1);
		this.addRenderableWidget(imagebutton_plusbuttonover1);
		imagebutton_plusbuttonover2 = new ImageButton(this.leftPos + -88, this.topPos + -1, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover2.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(5, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 5, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover2", imagebutton_plusbuttonover2);
		this.addRenderableWidget(imagebutton_plusbuttonover2);
		imagebutton_plusbuttonover3 = new ImageButton(this.leftPos + -88, this.topPos + 13, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover3.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(6, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 6, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover3", imagebutton_plusbuttonover3);
		this.addRenderableWidget(imagebutton_plusbuttonover3);
		imagebutton_plusbuttonover4 = new ImageButton(this.leftPos + -88, this.topPos + 27, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover4.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(7, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 7, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover4", imagebutton_plusbuttonover4);
		this.addRenderableWidget(imagebutton_plusbuttonover4);
		imagebutton_plusbuttonover5 = new ImageButton(this.leftPos + -88, this.topPos + 41, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover5.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(8, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 8, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover5", imagebutton_plusbuttonover5);
		this.addRenderableWidget(imagebutton_plusbuttonover5);
		imagebutton_plusbuttonover6 = new ImageButton(this.leftPos + -88, this.topPos + 55, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover6.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(9, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 9, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover6", imagebutton_plusbuttonover6);
		this.addRenderableWidget(imagebutton_plusbuttonover6);
		imagebutton_overarrow2 = new ImageButton(this.leftPos + 74, this.topPos + -99, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow2.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(10, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 10, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_overarrow2", imagebutton_overarrow2);
		this.addRenderableWidget(imagebutton_overarrow2);
		imagebutton_slot = new ImageButton(this.leftPos + 23, this.topPos + 57, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_slot.png"), 64, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(11, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 11, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_slot", imagebutton_slot);
		this.addRenderableWidget(imagebutton_slot);
		imagebutton_restart = new ImageButton(this.leftPos + -115, this.topPos + -68, 20, 20, 0, 0, 20, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_restart.png"), 20, 40, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(12, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 12, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_restart", imagebutton_restart);
		this.addRenderableWidget(imagebutton_restart);
		imagebutton_berserk_mode = new ImageButton(this.leftPos + -69, this.topPos + -98, 20, 20, 0, 0, 20, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_berserk_mode.png"), 20, 40, e -> {
			if (DemonKingPowerReturnProcedure.execute(entity)) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(13, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 13, x, y, z, textstate);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (DemonKingPowerReturnProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_berserk_mode", imagebutton_berserk_mode);
		this.addRenderableWidget(imagebutton_berserk_mode);
		imagebutton_restart1 = new ImageButton(this.leftPos + 103, this.topPos + -102, 20, 20, 0, 0, 20, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_restart1.png"), 20, 40, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(14, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 14, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_restart1", imagebutton_restart1);
		this.addRenderableWidget(imagebutton_restart1);
		imagebutton_goddess_particle_7 = new ImageButton(this.leftPos + -69, this.topPos + -77, 20, 20, 0, 0, 20, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_goddess_particle_7.png"), 20, 40, e -> {
			if (ReturnPossessionProcedure.execute(entity)) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuButtonMessage(15, x, y, z, textstate));
				MagicMenuButtonMessage.handleButtonAction(entity, 15, x, y, z, textstate);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnPossessionProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_goddess_particle_7", imagebutton_goddess_particle_7);
		this.addRenderableWidget(imagebutton_goddess_particle_7);
	}
}
