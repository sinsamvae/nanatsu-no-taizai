package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.ClonesGuiMenu;
import net.mcreator.craftnotaizai.procedures.LostVayneVarProcedure;
import net.mcreator.craftnotaizai.network.ClonesGuiButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ClonesGuiScreen extends AbstractContainerScreen<ClonesGuiMenu> {
	private final static HashMap<String, Object> guistate = ClonesGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_slot;
	ImageButton imagebutton_slot1;

	public ClonesGuiScreen(ClonesGuiMenu container, Inventory inventory, Component text) {
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
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/clone_gui.png"), this.leftPos + -64, this.topPos + -78, 0, 0, 128, 155, 128, 155);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.clones_gui.label_clones"), -19, -24, -1, false);
		guiGraphics.drawString(this.font,

				LostVayneVarProcedure.execute(entity), -22, -47, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.clones_gui.label_despawn"), -21, 9, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_slot = new ImageButton(this.leftPos + -33, this.topPos + -27, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_slot.png"), 64, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new ClonesGuiButtonMessage(0, x, y, z, textstate));
				ClonesGuiButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_slot", imagebutton_slot);
		this.addRenderableWidget(imagebutton_slot);
		imagebutton_slot1 = new ImageButton(this.leftPos + -33, this.topPos + 6, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_slot1.png"), 64, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new ClonesGuiButtonMessage(1, x, y, z, textstate));
				ClonesGuiButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_slot1", imagebutton_slot1);
		this.addRenderableWidget(imagebutton_slot1);
	}
}
