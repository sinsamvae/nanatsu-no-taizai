package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.PossessionMenu;
import net.mcreator.craftnotaizai.network.PossessionButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PossessionScreen extends AbstractContainerScreen<PossessionMenu> {
	private final static HashMap<String, Object> guistate = PossessionMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_1button;
	ImageButton imagebutton_1button1;

	public PossessionScreen(PossessionMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/possession.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.possession.label_accept"), -14, -24, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.possession.label_deny"), -10, 18, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.possession.label_it_looks_like_you_are_having"), -79, -104, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.possession.label_trouble_i_can_lend_you_my_power"), -79, -90, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.possession.label_if_you_wish"), -7, -74, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_1button = new ImageButton(this.leftPos + -33, this.topPos + -28, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_1button.png"), 64, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new PossessionButtonMessage(0, x, y, z, textstate));
				PossessionButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_1button", imagebutton_1button);
		this.addRenderableWidget(imagebutton_1button);
		imagebutton_1button1 = new ImageButton(this.leftPos + -33, this.topPos + 14, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_1button1.png"), 64, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new PossessionButtonMessage(1, x, y, z, textstate));
				PossessionButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_1button1", imagebutton_1button1);
		this.addRenderableWidget(imagebutton_1button1);
	}
}
