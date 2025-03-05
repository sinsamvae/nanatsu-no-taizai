
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.craftnotaizai.client.gui.ZaneriGuiScreen;
import net.mcreator.craftnotaizai.client.gui.TheoTowerScreen;
import net.mcreator.craftnotaizai.client.gui.TheoGuiScreen;
import net.mcreator.craftnotaizai.client.gui.TheoCaveScreen;
import net.mcreator.craftnotaizai.client.gui.TeleportationGuiScreen;
import net.mcreator.craftnotaizai.client.gui.StoryBoardScreen;
import net.mcreator.craftnotaizai.client.gui.SideQuestGuiScreen;
import net.mcreator.craftnotaizai.client.gui.SettingsUIScreen;
import net.mcreator.craftnotaizai.client.gui.PossessionScreen;
import net.mcreator.craftnotaizai.client.gui.MonsterBlockGuiScreen;
import net.mcreator.craftnotaizai.client.gui.MagicMenuScreen;
import net.mcreator.craftnotaizai.client.gui.KegGuiScreen;
import net.mcreator.craftnotaizai.client.gui.JennaGuiScreen;
import net.mcreator.craftnotaizai.client.gui.HumanClanUiScreen;
import net.mcreator.craftnotaizai.client.gui.GuildGuiScreen;
import net.mcreator.craftnotaizai.client.gui.GuildAcceptGuiScreen;
import net.mcreator.craftnotaizai.client.gui.GoddessClanScreen;
import net.mcreator.craftnotaizai.client.gui.GiantClanScreen;
import net.mcreator.craftnotaizai.client.gui.FairyClanUiScreen;
import net.mcreator.craftnotaizai.client.gui.DubsTradeScreen;
import net.mcreator.craftnotaizai.client.gui.DisasterMenuScreen;
import net.mcreator.craftnotaizai.client.gui.DemonStatScreen;
import net.mcreator.craftnotaizai.client.gui.DemonKingGuiScreen;
import net.mcreator.craftnotaizai.client.gui.DemonClanScreen;
import net.mcreator.craftnotaizai.client.gui.CloverTradingScreen;
import net.mcreator.craftnotaizai.client.gui.ClonesGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftNoTaizaiModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CraftNoTaizaiModMenus.DEMON_CLAN.get(), DemonClanScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.DEMON_STAT.get(), DemonStatScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.STORY_BOARD.get(), StoryBoardScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.MAGIC_MENU.get(), MagicMenuScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.TELEPORTATION_GUI.get(), TeleportationGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.KEG_GUI.get(), KegGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.SIDE_QUEST_GUI.get(), SideQuestGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.CLONES_GUI.get(), ClonesGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.MONSTER_BLOCK_GUI.get(), MonsterBlockGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.DEMON_KING_GUI.get(), DemonKingGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.DISASTER_MENU.get(), DisasterMenuScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.CLOVER_TRADING.get(), CloverTradingScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.JENNA_GUI.get(), JennaGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.ZANERI_GUI.get(), ZaneriGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.THEO_GUI.get(), TheoGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.THEO_CAVE.get(), TheoCaveScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.THEO_TOWER.get(), TheoTowerScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.SETTINGS_UI.get(), SettingsUIScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.HUMAN_CLAN_UI.get(), HumanClanUiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.GIANT_CLAN.get(), GiantClanScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.FAIRY_CLAN_UI.get(), FairyClanUiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.GUILD_ACCEPT_GUI.get(), GuildAcceptGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.GUILD_GUI.get(), GuildGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.POSSESSION.get(), PossessionScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.DUBS_TRADE.get(), DubsTradeScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.GODDESS_CLAN.get(), GoddessClanScreen::new);
		});
	}
}
