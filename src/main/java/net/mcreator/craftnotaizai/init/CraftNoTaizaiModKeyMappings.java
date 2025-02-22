
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.craftnotaizai.network.WPressFLyMessage;
import net.mcreator.craftnotaizai.network.UseMagicMessage;
import net.mcreator.craftnotaizai.network.SwapMoveMessage;
import net.mcreator.craftnotaizai.network.OpenStatsMessage;
import net.mcreator.craftnotaizai.network.MantaraySpaceMessage;
import net.mcreator.craftnotaizai.network.MantaraySMoveMessage;
import net.mcreator.craftnotaizai.network.MantarayMoveMessage;
import net.mcreator.craftnotaizai.network.ManaChargeBindMessage;
import net.mcreator.craftnotaizai.network.LockOnMessage;
import net.mcreator.craftnotaizai.network.LevitationMessage;
import net.mcreator.craftnotaizai.network.DoubleJumpMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftNoTaizaiModKeyMappings {
	public static final KeyMapping OPEN_STATS = new KeyMapping("key.craft_no_taizai.open_stats", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new OpenStatsMessage(0, 0));
				OpenStatsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DOUBLE_JUMP = new KeyMapping("key.craft_no_taizai.double_jump", GLFW.GLFW_KEY_SPACE, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new DoubleJumpMessage(0, 0));
				DoubleJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MANA_CHARGE_BIND = new KeyMapping("key.craft_no_taizai.mana_charge_bind", GLFW.GLFW_KEY_LEFT_CONTROL, "key.categories.craftnotaizai") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new ManaChargeBindMessage(0, 0));
				ManaChargeBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MANA_CHARGE_BIND_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MANA_CHARGE_BIND_LASTPRESS);
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new ManaChargeBindMessage(1, dt));
				ManaChargeBindMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LEVITATION = new KeyMapping("key.craft_no_taizai.levitation", GLFW.GLFW_KEY_F, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new LevitationMessage(0, 0));
				LevitationMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping W_PRESS_F_LY = new KeyMapping("key.craft_no_taizai.w_press_f_ly", GLFW.GLFW_KEY_W, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new WPressFLyMessage(0, 0));
				WPressFLyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				W_PRESS_F_LY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - W_PRESS_F_LY_LASTPRESS);
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new WPressFLyMessage(1, dt));
				WPressFLyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LOCK_ON = new KeyMapping("key.craft_no_taizai.lock_on", GLFW.GLFW_KEY_X, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new LockOnMessage(0, 0));
				LockOnMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SWAP_MOVE = new KeyMapping("key.craft_no_taizai.swap_move", GLFW.GLFW_KEY_R, "key.categories.craftnotaizai") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new SwapMoveMessage(0, 0));
				SwapMoveMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_MAGIC = new KeyMapping("key.craft_no_taizai.use_magic", GLFW.GLFW_KEY_C, "key.categories.craftnotaizai") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new UseMagicMessage(0, 0));
				UseMagicMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MANTARAY_MOVE = new KeyMapping("key.craft_no_taizai.mantaray_move", GLFW.GLFW_KEY_W, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MantarayMoveMessage(0, 0));
				MantarayMoveMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MANTARAY_MOVE_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MANTARAY_MOVE_LASTPRESS);
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MantarayMoveMessage(1, dt));
				MantarayMoveMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MANTARAY_S_MOVE = new KeyMapping("key.craft_no_taizai.mantaray_s_move", GLFW.GLFW_KEY_S, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MantaraySMoveMessage(0, 0));
				MantaraySMoveMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MANTARAY_S_MOVE_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MANTARAY_S_MOVE_LASTPRESS);
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MantaraySMoveMessage(1, dt));
				MantaraySMoveMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MANTARAY_SPACE = new KeyMapping("key.craft_no_taizai.mantaray_space", GLFW.GLFW_KEY_SPACE, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MantaraySpaceMessage(0, 0));
				MantaraySpaceMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MANTARAY_SPACE_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MANTARAY_SPACE_LASTPRESS);
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MantaraySpaceMessage(1, dt));
				MantaraySpaceMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long MANA_CHARGE_BIND_LASTPRESS = 0;
	private static long W_PRESS_F_LY_LASTPRESS = 0;
	private static long MANTARAY_MOVE_LASTPRESS = 0;
	private static long MANTARAY_S_MOVE_LASTPRESS = 0;
	private static long MANTARAY_SPACE_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(OPEN_STATS);
		event.register(DOUBLE_JUMP);
		event.register(MANA_CHARGE_BIND);
		event.register(LEVITATION);
		event.register(W_PRESS_F_LY);
		event.register(LOCK_ON);
		event.register(SWAP_MOVE);
		event.register(USE_MAGIC);
		event.register(MANTARAY_MOVE);
		event.register(MANTARAY_S_MOVE);
		event.register(MANTARAY_SPACE);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				OPEN_STATS.consumeClick();
				DOUBLE_JUMP.consumeClick();
				MANA_CHARGE_BIND.consumeClick();
				LEVITATION.consumeClick();
				W_PRESS_F_LY.consumeClick();
				LOCK_ON.consumeClick();
				SWAP_MOVE.consumeClick();
				USE_MAGIC.consumeClick();
				MANTARAY_MOVE.consumeClick();
				MANTARAY_S_MOVE.consumeClick();
				MANTARAY_SPACE.consumeClick();
			}
		}
	}
}
