package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.DisasterMenuMenu;
import net.mcreator.craftnotaizai.procedures.DisplaySlotProcedure;
import net.mcreator.craftnotaizai.procedures.DisplayMagicProcedure;
import net.mcreator.craftnotaizai.procedures.DisasterSkillDisplay8Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterSkillDisplay7Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterSkillDisplay6Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterSkillDisplay5Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterSkillDisplay4Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterSkillDisplay3Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterSkillDisplay2Procedure;
import net.mcreator.craftnotaizai.procedures.DisasterSkillDisplay1Procedure;
import net.mcreator.craftnotaizai.network.DisasterMenuButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DisasterMenuScreen extends AbstractContainerScreen<DisasterMenuMenu> {
	private final static HashMap<String, Object> guistate = DisasterMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_slot;
	ImageButton imagebutton_restart;
	ImageButton imagebutton_plusbuttonmagic;
	ImageButton imagebutton_plusbuttonover;
	ImageButton imagebutton_plusbuttonover1;
	ImageButton imagebutton_plusbuttonover2;
	ImageButton imagebutton_plusbuttonover3;
	ImageButton imagebutton_plusbuttonover4;
	ImageButton imagebutton_plusbuttonover5;
	ImageButton imagebutton_plusbuttonover6;

	public DisasterMenuScreen(DisasterMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/disaster_menu.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -115 && mouseX < leftPos + -91 && mouseY > topPos + -42 && mouseY < topPos + -18)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.disaster_menu.tooltip_reset"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/gui.png"), this.leftPos + -99, this.topPos + -85, 0, 0, 196, 186, 196, 186);

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

				DisplayMagicProcedure.execute(entity), -98, -82, -1, false);
		guiGraphics.drawString(this.font,

				DisplaySlotProcedure.execute(entity), 24, 64, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.disaster_menu.label_slot"), 42, 78, -1, false);
		guiGraphics.drawString(this.font,

				DisasterSkillDisplay1Procedure.execute(entity), -79, -44, -1, false);
		guiGraphics.drawString(this.font,

				DisasterSkillDisplay2Procedure.execute(entity), -79, -30, -1, false);
		guiGraphics.drawString(this.font,

				DisasterSkillDisplay3Procedure.execute(entity), -79, -16, -1, false);
		guiGraphics.drawString(this.font,

				DisasterSkillDisplay4Procedure.execute(entity), -79, -2, -1, false);
		guiGraphics.drawString(this.font,

				DisasterSkillDisplay5Procedure.execute(entity), -79, 12, -1, false);
		guiGraphics.drawString(this.font,

				DisasterSkillDisplay6Procedure.execute(entity), -79, 26, -1, false);
		guiGraphics.drawString(this.font,

				DisasterSkillDisplay7Procedure.execute(entity), -79, 40, -1, false);
		guiGraphics.drawString(this.font,

				DisasterSkillDisplay8Procedure.execute(entity), -79, 54, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_slot = new ImageButton(this.leftPos + 23, this.topPos + 75, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_slot.png"), 64, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DisasterMenuButtonMessage(0, x, y, z, textstate));
				DisasterMenuButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_slot", imagebutton_slot);
		this.addRenderableWidget(imagebutton_slot);
		imagebutton_restart = new ImageButton(this.leftPos + -115, this.topPos + -47, 20, 20, 0, 0, 20, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_restart.png"), 20, 40, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DisasterMenuButtonMessage(1, x, y, z, textstate));
				DisasterMenuButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_restart", imagebutton_restart);
		this.addRenderableWidget(imagebutton_restart);
		imagebutton_plusbuttonmagic = new ImageButton(this.leftPos + -88, this.topPos + -42, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonmagic.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DisasterMenuButtonMessage(2, x, y, z, textstate));
				DisasterMenuButtonMessage.handleButtonAction(entity, 2, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonmagic", imagebutton_plusbuttonmagic);
		this.addRenderableWidget(imagebutton_plusbuttonmagic);
		imagebutton_plusbuttonover = new ImageButton(this.leftPos + -88, this.topPos + -29, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DisasterMenuButtonMessage(3, x, y, z, textstate));
				DisasterMenuButtonMessage.handleButtonAction(entity, 3, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover", imagebutton_plusbuttonover);
		this.addRenderableWidget(imagebutton_plusbuttonover);
		imagebutton_plusbuttonover1 = new ImageButton(this.leftPos + -88, this.topPos + -15, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover1.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DisasterMenuButtonMessage(4, x, y, z, textstate));
				DisasterMenuButtonMessage.handleButtonAction(entity, 4, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover1", imagebutton_plusbuttonover1);
		this.addRenderableWidget(imagebutton_plusbuttonover1);
		imagebutton_plusbuttonover2 = new ImageButton(this.leftPos + -88, this.topPos + -1, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover2.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DisasterMenuButtonMessage(5, x, y, z, textstate));
				DisasterMenuButtonMessage.handleButtonAction(entity, 5, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover2", imagebutton_plusbuttonover2);
		this.addRenderableWidget(imagebutton_plusbuttonover2);
		imagebutton_plusbuttonover3 = new ImageButton(this.leftPos + -88, this.topPos + 13, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover3.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DisasterMenuButtonMessage(6, x, y, z, textstate));
				DisasterMenuButtonMessage.handleButtonAction(entity, 6, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover3", imagebutton_plusbuttonover3);
		this.addRenderableWidget(imagebutton_plusbuttonover3);
		imagebutton_plusbuttonover4 = new ImageButton(this.leftPos + -88, this.topPos + 27, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover4.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DisasterMenuButtonMessage(7, x, y, z, textstate));
				DisasterMenuButtonMessage.handleButtonAction(entity, 7, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover4", imagebutton_plusbuttonover4);
		this.addRenderableWidget(imagebutton_plusbuttonover4);
		imagebutton_plusbuttonover5 = new ImageButton(this.leftPos + -88, this.topPos + 41, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover5.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DisasterMenuButtonMessage(8, x, y, z, textstate));
				DisasterMenuButtonMessage.handleButtonAction(entity, 8, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover5", imagebutton_plusbuttonover5);
		this.addRenderableWidget(imagebutton_plusbuttonover5);
		imagebutton_plusbuttonover6 = new ImageButton(this.leftPos + -88, this.topPos + 55, 7, 7, 0, 0, 7, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_plusbuttonover6.png"), 7, 14, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DisasterMenuButtonMessage(9, x, y, z, textstate));
				DisasterMenuButtonMessage.handleButtonAction(entity, 9, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_plusbuttonover6", imagebutton_plusbuttonover6);
		this.addRenderableWidget(imagebutton_plusbuttonover6);
	}
}
