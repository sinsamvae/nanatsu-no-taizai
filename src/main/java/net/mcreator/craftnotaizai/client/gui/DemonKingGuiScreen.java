package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.DemonKingGuiMenu;
import net.mcreator.craftnotaizai.procedures.DisplayDemonKingProcedure;
import net.mcreator.craftnotaizai.network.DemonKingGuiButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DemonKingGuiScreen extends AbstractContainerScreen<DemonKingGuiMenu> {
	private final static HashMap<String, Object> guistate = DemonKingGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_button_1;
	ImageButton imagebutton_button_2;

	public DemonKingGuiScreen(DemonKingGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/demon_king_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (DisplayDemonKingProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -140, this.topPos + 120, 17, 0f, 0, livingEntity);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.demon_king_gui.label_empty"), -51, -13, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.demon_king_gui.label_accept"), -46, -13, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.demon_king_gui.label_empty1"), -51, 14, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.demon_king_gui.label_deny"), -46, 14, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.demon_king_gui.label_welcome_demon_i_shall_share_bit"), -34, -65, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.demon_king_gui.label_of_my_power"), -34, -51, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.demon_king_gui.label_i_shall_give_you_bit_of_my_power"), -34, -37, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_button_1 = new ImageButton(this.leftPos + -60, this.topPos + -18, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_button_1.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonKingGuiButtonMessage(0, x, y, z, textstate));
				DemonKingGuiButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_button_1", imagebutton_button_1);
		this.addRenderableWidget(imagebutton_button_1);
		imagebutton_button_2 = new ImageButton(this.leftPos + -60, this.topPos + 11, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_button_2.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DemonKingGuiButtonMessage(1, x, y, z, textstate));
				DemonKingGuiButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_button_2", imagebutton_button_2);
		this.addRenderableWidget(imagebutton_button_2);
	}
}
