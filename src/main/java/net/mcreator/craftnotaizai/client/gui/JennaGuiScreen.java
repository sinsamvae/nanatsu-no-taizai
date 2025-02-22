package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.JennaGuiMenu;
import net.mcreator.craftnotaizai.network.JennaGuiButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class JennaGuiScreen extends AbstractContainerScreen<JennaGuiMenu> {
	private final static HashMap<String, Object> guistate = JennaGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_button_1;
	ImageButton imagebutton_button_2;

	public JennaGuiScreen(JennaGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/jenna_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/black.png"), this.leftPos + -449, this.topPos + -254, 0, 0, 960, 540, 960, 540);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.jenna_gui.label_would_you_like_to_enter_the_cave"), -16, -52, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.jenna_gui.label_yes"), -19, 17, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.jenna_gui.label_remember_who_yourre_facing"), -16, -41, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.jenna_gui.label_the_legnedary_ten_commandments"), -16, -31, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.jenna_gui.label_youll_need_to_get_into_fighting"), -16, -21, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.jenna_gui.label_do_you_accept"), -16, -10, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.jenna_gui.label_deny"), -19, 40, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_button_1 = new ImageButton(this.leftPos + -30, this.topPos + 12, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_button_1.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new JennaGuiButtonMessage(0, x, y, z, textstate));
				JennaGuiButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_button_1", imagebutton_button_1);
		this.addRenderableWidget(imagebutton_button_1);
		imagebutton_button_2 = new ImageButton(this.leftPos + -30, this.topPos + 37, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_button_2.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new JennaGuiButtonMessage(1, x, y, z, textstate));
				JennaGuiButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_button_2", imagebutton_button_2);
		this.addRenderableWidget(imagebutton_button_2);
	}
}
