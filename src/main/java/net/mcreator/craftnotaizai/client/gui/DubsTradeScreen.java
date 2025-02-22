package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.DubsTradeMenu;
import net.mcreator.craftnotaizai.procedures.CostAmountVarProcedure;
import net.mcreator.craftnotaizai.network.DubsTradeButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DubsTradeScreen extends AbstractContainerScreen<DubsTradeMenu> {
	private final static HashMap<String, Object> guistate = DubsTradeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_1button;

	public DubsTradeScreen(DubsTradeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/dubs_trade.png");

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

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/clover_gui.png"), this.leftPos + -89, this.topPos + -83, 0, 0, 176, 166, 176, 166);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/britannia_coins.png"), this.leftPos + -70, this.topPos + -47, 0, 0, 16, 16, 16, 16);

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
	public void containerTick() {
		super.containerTick();
		CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DubsTradeMenu.DubsTradeOtherMessage(0, x, y, z, textstate));
		DubsTradeMenu.DubsTradeOtherMessage.handleOtherAction(entity, 0, x, y, z, textstate);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				CostAmountVarProcedure.execute(entity), -37, -60, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.dubs_trade.label_trade"), -15, -44, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_1button = new ImageButton(this.leftPos + -34, this.topPos + -47, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_1button.png"), 64, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DubsTradeButtonMessage(0, x, y, z, textstate));
				DubsTradeButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_1button", imagebutton_1button);
		this.addRenderableWidget(imagebutton_1button);
	}
}
