
package net.mcreator.craftnotaizai.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.procedures.TrueMagicEyeProcedure;
import net.mcreator.craftnotaizai.procedures.MagicEyeReturnStrProcedure;
import net.mcreator.craftnotaizai.procedures.MagicEyeReturnMaxManaProcedure;
import net.mcreator.craftnotaizai.procedures.MagicEyeReturnDexProcedure;
import net.mcreator.craftnotaizai.procedures.MagicEyeReturnBPProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MagicalEyeOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (TrueMagicEyeProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/drole_eye.png"), 0, 0, 0, 0, w, h, w, h);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					MagicEyeReturnBPProcedure.execute(world, entity), w / 2 + -115, h / 2 + -39, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					MagicEyeReturnStrProcedure.execute(world, entity), w / 2 + -115, h / 2 + 24, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					MagicEyeReturnDexProcedure.execute(world, entity), w / 2 + 62, h / 2 + -39, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					MagicEyeReturnMaxManaProcedure.execute(world, entity), w / 2 + 62, h / 2 + 25, -1, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
