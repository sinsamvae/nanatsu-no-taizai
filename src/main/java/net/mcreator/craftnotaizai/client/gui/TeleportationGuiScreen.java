package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.world.inventory.TeleportationGuiMenu;
import net.mcreator.craftnotaizai.network.TeleportationGuiButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TeleportationGuiScreen extends AbstractContainerScreen<TeleportationGuiMenu> {
	private final static HashMap<String, Object> guistate = TeleportationGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	public static EditBox X;
	public static EditBox Z;
	public static EditBox Y;
	ImageButton imagebutton_slot2;

	public TeleportationGuiScreen(TeleportationGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/teleportation_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		X.render(guiGraphics, mouseX, mouseY, partialTicks);
		Z.render(guiGraphics, mouseX, mouseY, partialTicks);
		Y.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/gui.png"), this.leftPos + -93, this.topPos + -104, 0, 0, 196, 186, 196, 186);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (X.isFocused())
			return X.keyPressed(key, b, c);
		if (Z.isFocused())
			return Z.keyPressed(key, b, c);
		if (Y.isFocused())
			return Y.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		X.tick();
		Z.tick();
		Y.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String XValue = X.getValue();
		String ZValue = Z.getValue();
		String YValue = Y.getValue();
		super.resize(minecraft, width, height);
		X.setValue(XValue);
		Z.setValue(ZValue);
		Y.setValue(YValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.teleportation_gui.label_teleport"), -21, -50, -1, false);
	}

	@Override
	public void init() {
		super.init();
		X = new EditBox(this.font, this.leftPos + -59, this.topPos + -28, 118, 18, Component.translatable("gui.craft_no_taizai.teleportation_gui.X")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_no_taizai.teleportation_gui.X").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_no_taizai.teleportation_gui.X").getString());
				else
					setSuggestion(null);
			}
		};
		X.setSuggestion(Component.translatable("gui.craft_no_taizai.teleportation_gui.X").getString());
		X.setMaxLength(32767);
		guistate.put("text:X", X);
		this.addWidget(this.X);
		Z = new EditBox(this.font, this.leftPos + -59, this.topPos + 18, 118, 18, Component.translatable("gui.craft_no_taizai.teleportation_gui.Z")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_no_taizai.teleportation_gui.Z").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_no_taizai.teleportation_gui.Z").getString());
				else
					setSuggestion(null);
			}
		};
		Z.setSuggestion(Component.translatable("gui.craft_no_taizai.teleportation_gui.Z").getString());
		Z.setMaxLength(32767);
		guistate.put("text:Z", Z);
		this.addWidget(this.Z);
		Y = new EditBox(this.font, this.leftPos + -59, this.topPos + -5, 118, 18, Component.translatable("gui.craft_no_taizai.teleportation_gui.Y")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_no_taizai.teleportation_gui.Y").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_no_taizai.teleportation_gui.Y").getString());
				else
					setSuggestion(null);
			}
		};
		Y.setSuggestion(Component.translatable("gui.craft_no_taizai.teleportation_gui.Y").getString());
		Y.setMaxLength(32767);
		guistate.put("text:Y", Y);
		this.addWidget(this.Y);
		imagebutton_slot2 = new ImageButton(this.leftPos + -32, this.topPos + -53, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_slot2.png"), 64, 32, e -> {
			if (true) {
				textstate.put("textin:X", X.getValue());
				textstate.put("textin:Z", Z.getValue());
				textstate.put("textin:Y", Y.getValue());
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new TeleportationGuiButtonMessage(0, x, y, z, textstate));
				TeleportationGuiButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_slot2", imagebutton_slot2);
		this.addRenderableWidget(imagebutton_slot2);
	}
}
