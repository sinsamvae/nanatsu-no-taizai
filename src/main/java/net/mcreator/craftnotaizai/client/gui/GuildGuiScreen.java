package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.GuildGuiMenu;
import net.mcreator.craftnotaizai.procedures.ReturnPageProcedure;
import net.mcreator.craftnotaizai.procedures.PlayerInGuildProcedure;
import net.mcreator.craftnotaizai.procedures.GuildNameProcedure;
import net.mcreator.craftnotaizai.procedures.GuildMemberProcedure;
import net.mcreator.craftnotaizai.procedures.GuildMember5Procedure;
import net.mcreator.craftnotaizai.procedures.GuildMember4Procedure;
import net.mcreator.craftnotaizai.procedures.GuildMember3Procedure;
import net.mcreator.craftnotaizai.procedures.GuildMember2Procedure;
import net.mcreator.craftnotaizai.network.GuildGuiButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuildGuiScreen extends AbstractContainerScreen<GuildGuiMenu> {
	private final static HashMap<String, Object> guistate = GuildGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_overarrow;
	ImageButton imagebutton_1button;
	ImageButton imagebutton_restart;

	public GuildGuiScreen(GuildGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/guild_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 103 && mouseX < leftPos + 127 && mouseY > topPos + -105 && mouseY < topPos + -81)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.guild_gui.tooltip_back"), mouseX, mouseY);
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
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				GuildNameProcedure.execute(entity), -19, -75, -1, false);
		guiGraphics.drawString(this.font,

				ReturnPageProcedure.execute(entity), 36, -100, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.guild_gui.label_empty"), 76, -100, -1, false);
		if (PlayerInGuildProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.guild_gui.label_leave"), -6, 65, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.guild_gui.label_members"), -14, -56, -1, false);
		guiGraphics.drawString(this.font,

				GuildMemberProcedure.execute(entity), -23, -43, -1, false);
		guiGraphics.drawString(this.font,

				GuildMember2Procedure.execute(entity), -24, -21, -1, false);
		guiGraphics.drawString(this.font,

				GuildMember3Procedure.execute(entity), -24, 1, -1, false);
		guiGraphics.drawString(this.font,

				GuildMember4Procedure.execute(entity), -24, 22, -1, false);
		guiGraphics.drawString(this.font,

				GuildMember5Procedure.execute(entity), -24, 41, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_overarrow = new ImageButton(this.leftPos + 71, this.topPos + -103, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new GuildGuiButtonMessage(0, x, y, z, textstate));
				GuildGuiButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_overarrow", imagebutton_overarrow);
		this.addRenderableWidget(imagebutton_overarrow);
		imagebutton_1button = new ImageButton(this.leftPos + -25, this.topPos + 61, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_1button.png"), 64, 32, e -> {
			if (PlayerInGuildProcedure.execute(entity)) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new GuildGuiButtonMessage(1, x, y, z, textstate));
				GuildGuiButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PlayerInGuildProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_1button", imagebutton_1button);
		this.addRenderableWidget(imagebutton_1button);
		imagebutton_restart = new ImageButton(this.leftPos + 104, this.topPos + -104, 20, 20, 0, 0, 20, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_restart.png"), 20, 40, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new GuildGuiButtonMessage(2, x, y, z, textstate));
				GuildGuiButtonMessage.handleButtonAction(entity, 2, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_restart", imagebutton_restart);
		this.addRenderableWidget(imagebutton_restart);
	}
}
