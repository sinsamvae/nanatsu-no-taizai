
package net.mcreator.craftnotaizai.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.world.inventory.MagicMenuMenu;
import net.mcreator.craftnotaizai.procedures.SlotSwitchProcedure;
import net.mcreator.craftnotaizai.procedures.ResetMoveSelectProcedure;
import net.mcreator.craftnotaizai.procedures.PossessionButtonProcedure;
import net.mcreator.craftnotaizai.procedures.OpenStatsOnKeyPressedProcedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilityslotProcedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot8Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot7Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot6Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot5Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot4Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot3Procedure;
import net.mcreator.craftnotaizai.procedures.MagicAbilitySlot2Procedure;
import net.mcreator.craftnotaizai.procedures.LearnedSkillsProcedure;
import net.mcreator.craftnotaizai.procedures.LearnedDemonSkillsProcedure;
import net.mcreator.craftnotaizai.procedures.DemonKingPageProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeSlotProcedure;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicMenuButtonMessage {
	private final int buttonID, x, y, z;
	private HashMap<String, String> textstate;

	public MagicMenuButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.textstate = readTextState(buffer);
	}

	public MagicMenuButtonMessage(int buttonID, int x, int y, int z, HashMap<String, String> textstate) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.textstate = textstate;

	}

	public static void buffer(MagicMenuButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		writeTextState(message.textstate, buffer);
	}

	public static void handler(MagicMenuButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			HashMap<String, String> textstate = message.textstate;
			handleButtonAction(entity, buttonID, x, y, z, textstate);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z, HashMap<String, String> textstate) {
		Level world = entity.level();
		HashMap guistate = MagicMenuMenu.guistate;
		for (Map.Entry<String, String> entry : textstate.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			guistate.put(key, value);
		}
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			LearnedDemonSkillsProcedure.execute(entity);
		}
		if (buttonID == 1) {

			LearnedSkillsProcedure.execute(entity);
		}
		if (buttonID == 2) {

			MagicAbilityslotProcedure.execute(entity);
		}
		if (buttonID == 3) {

			MagicAbilitySlot2Procedure.execute(entity);
		}
		if (buttonID == 4) {

			MagicAbilitySlot3Procedure.execute(entity);
		}
		if (buttonID == 5) {

			MagicAbilitySlot4Procedure.execute(entity);
		}
		if (buttonID == 6) {

			MagicAbilitySlot5Procedure.execute(entity);
		}
		if (buttonID == 7) {

			MagicAbilitySlot6Procedure.execute(entity);
		}
		if (buttonID == 8) {

			MagicAbilitySlot7Procedure.execute(entity);
		}
		if (buttonID == 9) {

			MagicAbilitySlot8Procedure.execute(entity);
		}
		if (buttonID == 10) {

			SlotSwitchProcedure.execute(entity);
		}
		if (buttonID == 11) {

			ChangeSlotProcedure.execute(entity);
		}
		if (buttonID == 12) {

			ResetMoveSelectProcedure.execute(entity);
		}
		if (buttonID == 13) {

			DemonKingPageProcedure.execute(entity);
		}
		if (buttonID == 14) {

			OpenStatsOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 15) {

			PossessionButtonProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftNoTaizaiMod.addNetworkMessage(MagicMenuButtonMessage.class, MagicMenuButtonMessage::buffer, MagicMenuButtonMessage::new, MagicMenuButtonMessage::handler);
	}

	public static void writeTextState(HashMap<String, String> map, FriendlyByteBuf buffer) {
		buffer.writeInt(map.size());
		for (Map.Entry<String, String> entry : map.entrySet()) {
			buffer.writeComponent(Component.literal(entry.getKey()));
			buffer.writeComponent(Component.literal(entry.getValue()));
		}
	}

	public static HashMap<String, String> readTextState(FriendlyByteBuf buffer) {
		int size = buffer.readInt();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < size; i++) {
			String key = buffer.readComponent().getString();
			String value = buffer.readComponent().getString();
			map.put(key, value);
		}
		return map;
	}
}
