
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

import net.mcreator.craftnotaizai.procedures.PurgatoryFrame5Procedure;
import net.mcreator.craftnotaizai.procedures.PurgatoryFrame4Procedure;
import net.mcreator.craftnotaizai.procedures.PurgatoryFrame3Procedure;
import net.mcreator.craftnotaizai.procedures.PurgatoryFrame2Procedure;
import net.mcreator.craftnotaizai.procedures.PurgatoryFrame1Procedure;
import net.mcreator.craftnotaizai.procedures.PurgatoryFireVarProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class PurgatoryFlameOverlayOverlay {
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
		if (PurgatoryFireVarProcedure.execute(entity)) {
			if (PurgatoryFrame1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/purgatory_fire_particles_1.png"), w / 2 + -201, h - 219, 0, 0, 410, 312, 410, 312);
			}
			if (PurgatoryFrame2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/purgatory_fire_particles_2.png"), w / 2 + -205, h - 216, 0, 0, 410, 312, 410, 312);
			}
			if (PurgatoryFrame3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/purgatory_fire_particles_3.png"), w / 2 + -180, h - 208, 0, 0, 410, 312, 410, 312);
			}
			if (PurgatoryFrame4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/purgatory_fire_particles_4.png"), w / 2 + -259, h - 223, 0, 0, 410, 312, 410, 312);
			}
			if (PurgatoryFrame5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("craft_no_taizai:textures/screens/purgatory_fire_particles_5.png"), w / 2 + -206, h - 247, 0, 0, 410, 312, 410, 312);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
