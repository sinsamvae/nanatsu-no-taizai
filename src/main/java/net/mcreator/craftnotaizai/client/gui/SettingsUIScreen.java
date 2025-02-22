package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.SettingsUIMenu;
import net.mcreator.craftnotaizai.procedures.SpeedPercentageProcedure;
import net.mcreator.craftnotaizai.procedures.PowerPercentageProcedure;
import net.mcreator.craftnotaizai.procedures.DisPlayEnitiyHealthProcedure;
import net.mcreator.craftnotaizai.procedures.DamageIndicatorVarProcedure;
import net.mcreator.craftnotaizai.network.SettingsUIButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SettingsUIScreen extends AbstractContainerScreen<SettingsUIMenu> {
	private final static HashMap<String, Object> guistate = SettingsUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_restart;
	ImageButton imagebutton_statplusbutton;
	ImageButton imagebutton_statplusbutton1;
	ImageButton imagebutton_overarrow;
	ImageButton imagebutton_overarrow1;
	ImageButton imagebutton_overarrow2;
	ImageButton imagebutton_overarrow3;

	public SettingsUIScreen(SettingsUIMenu container, Inventory inventory, Component text) {
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
		if (mouseX > leftPos + -129 && mouseX < leftPos + -105 && mouseY > topPos + -57 && mouseY < topPos + -33)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.settings_ui.tooltip_back"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/settings_gui.png"), this.leftPos + -130, this.topPos + -58, 0, 0, 250, 125, 250, 125);

		RenderSystem.disableBlend();
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

				DamageIndicatorVarProcedure.execute(entity), -47, -9, -1, false);
		guiGraphics.drawString(this.font,

				DisPlayEnitiyHealthProcedure.execute(entity), -47, 17, -1, false);
		guiGraphics.drawString(this.font,

				SpeedPercentageProcedure.execute(entity), -35, -49, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.settings_ui.label_empty"), -47, -51, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.settings_ui.label_empty1"), 32, -51, -1, false);
		guiGraphics.drawString(this.font,

				PowerPercentageProcedure.execute(entity), -35, -29, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.settings_ui.label_empty2"), -47, -29, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.settings_ui.label_empty3"), 33, -29, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_restart = new ImageButton(this.leftPos + -128, this.topPos + -54, 20, 20, 0, 0, 20, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_restart.png"), 20, 40, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new SettingsUIButtonMessage(0, x, y, z, textstate));
				SettingsUIButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_restart", imagebutton_restart);
		this.addRenderableWidget(imagebutton_restart);
		imagebutton_statplusbutton = new ImageButton(this.leftPos + -63, this.topPos + -11, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new SettingsUIButtonMessage(1, x, y, z, textstate));
				SettingsUIButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_statplusbutton", imagebutton_statplusbutton);
		this.addRenderableWidget(imagebutton_statplusbutton);
		imagebutton_statplusbutton1 = new ImageButton(this.leftPos + -63, this.topPos + 15, 13, 13, 0, 0, 13, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_statplusbutton1.png"), 13, 26, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new SettingsUIButtonMessage(2, x, y, z, textstate));
				SettingsUIButtonMessage.handleButtonAction(entity, 2, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_statplusbutton1", imagebutton_statplusbutton1);
		this.addRenderableWidget(imagebutton_statplusbutton1);
		imagebutton_overarrow = new ImageButton(this.leftPos + -52, this.topPos + -54, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new SettingsUIButtonMessage(3, x, y, z, textstate));
				SettingsUIButtonMessage.handleButtonAction(entity, 3, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_overarrow", imagebutton_overarrow);
		this.addRenderableWidget(imagebutton_overarrow);
		imagebutton_overarrow1 = new ImageButton(this.leftPos + 26, this.topPos + -54, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow1.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new SettingsUIButtonMessage(4, x, y, z, textstate));
				SettingsUIButtonMessage.handleButtonAction(entity, 4, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_overarrow1", imagebutton_overarrow1);
		this.addRenderableWidget(imagebutton_overarrow1);
		imagebutton_overarrow2 = new ImageButton(this.leftPos + -52, this.topPos + -32, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow2.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new SettingsUIButtonMessage(5, x, y, z, textstate));
				SettingsUIButtonMessage.handleButtonAction(entity, 5, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_overarrow2", imagebutton_overarrow2);
		this.addRenderableWidget(imagebutton_overarrow2);
		imagebutton_overarrow3 = new ImageButton(this.leftPos + 26, this.topPos + -32, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow3.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new SettingsUIButtonMessage(6, x, y, z, textstate));
				SettingsUIButtonMessage.handleButtonAction(entity, 6, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_overarrow3", imagebutton_overarrow3);
		this.addRenderableWidget(imagebutton_overarrow3);
	}
}
