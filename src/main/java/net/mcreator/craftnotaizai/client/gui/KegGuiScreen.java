package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.KegGuiMenu;
import net.mcreator.craftnotaizai.procedures.ReturnCups4Procedure;
import net.mcreator.craftnotaizai.procedures.ReturnCups3Procedure;
import net.mcreator.craftnotaizai.procedures.ReturnCubps2Procedure;
import net.mcreator.craftnotaizai.procedures.ReturnCubps1Procedure;
import net.mcreator.craftnotaizai.procedures.DisplayKegTickProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class KegGuiScreen extends AbstractContainerScreen<KegGuiMenu> {
	private final static HashMap<String, Object> guistate = KegGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();

	public KegGuiScreen(KegGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/keg_gui.png");

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

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/water_keg.png"), this.leftPos + -64, this.topPos + -59, 0, 0, 130, 40, 130, 40);

		if (ReturnCubps1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/water_keg_1.png"), this.leftPos + -64, this.topPos + -59, 0, 0, 130, 40, 130, 40);
		}
		if (ReturnCubps2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/water_key_2.png"), this.leftPos + -64, this.topPos + -59, 0, 0, 130, 40, 130, 40);
		}
		if (ReturnCups3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/water_keg_3.png"), this.leftPos + -64, this.topPos + -59, 0, 0, 130, 40, 130, 40);
		}
		if (ReturnCups4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/water_keg_full.png"), this.leftPos + -64, this.topPos + -59, 0, 0, 130, 40, 130, 40);
		}

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/key_gui2.png"), this.leftPos + -91, this.topPos + -83, 0, 0, 182, 166, 182, 166);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/honey_bottle_je1_be2.png"), this.leftPos + 43, this.topPos + -45, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/agave.png"), this.leftPos + -55, this.topPos + -45, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.keg_gui.label_keg"), -85, -78, -16777216, false);
		guiGraphics.drawString(this.font,

				DisplayKegTickProcedure.execute(world, x, y, z), 23, -69, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
