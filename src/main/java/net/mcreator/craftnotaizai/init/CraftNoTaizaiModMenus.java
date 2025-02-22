
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.craftnotaizai.world.inventory.ZaneriGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.TheoTowerMenu;
import net.mcreator.craftnotaizai.world.inventory.TheoGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.TheoCaveMenu;
import net.mcreator.craftnotaizai.world.inventory.TeleportationGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.StoryBoardMenu;
import net.mcreator.craftnotaizai.world.inventory.SideQuestGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.SettingsUIMenu;
import net.mcreator.craftnotaizai.world.inventory.PossessionMenu;
import net.mcreator.craftnotaizai.world.inventory.MonsterBlockGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.MagicMenuMenu;
import net.mcreator.craftnotaizai.world.inventory.KegGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.JennaGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.HumanClanUiMenu;
import net.mcreator.craftnotaizai.world.inventory.GuildGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.GuildAcceptGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.GiantClanMenu;
import net.mcreator.craftnotaizai.world.inventory.FairyClanUiMenu;
import net.mcreator.craftnotaizai.world.inventory.DubsTradeMenu;
import net.mcreator.craftnotaizai.world.inventory.DisasterMenuMenu;
import net.mcreator.craftnotaizai.world.inventory.DemonStatMenu;
import net.mcreator.craftnotaizai.world.inventory.DemonKingGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.DemonClanMenu;
import net.mcreator.craftnotaizai.world.inventory.CloverTradingMenu;
import net.mcreator.craftnotaizai.world.inventory.ClonesGuiMenu;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class CraftNoTaizaiModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<MenuType<DemonClanMenu>> DEMON_CLAN = REGISTRY.register("demon_clan", () -> IForgeMenuType.create(DemonClanMenu::new));
	public static final RegistryObject<MenuType<DemonStatMenu>> DEMON_STAT = REGISTRY.register("demon_stat", () -> IForgeMenuType.create(DemonStatMenu::new));
	public static final RegistryObject<MenuType<StoryBoardMenu>> STORY_BOARD = REGISTRY.register("story_board", () -> IForgeMenuType.create(StoryBoardMenu::new));
	public static final RegistryObject<MenuType<MagicMenuMenu>> MAGIC_MENU = REGISTRY.register("magic_menu", () -> IForgeMenuType.create(MagicMenuMenu::new));
	public static final RegistryObject<MenuType<TeleportationGuiMenu>> TELEPORTATION_GUI = REGISTRY.register("teleportation_gui", () -> IForgeMenuType.create(TeleportationGuiMenu::new));
	public static final RegistryObject<MenuType<KegGuiMenu>> KEG_GUI = REGISTRY.register("keg_gui", () -> IForgeMenuType.create(KegGuiMenu::new));
	public static final RegistryObject<MenuType<SideQuestGuiMenu>> SIDE_QUEST_GUI = REGISTRY.register("side_quest_gui", () -> IForgeMenuType.create(SideQuestGuiMenu::new));
	public static final RegistryObject<MenuType<ClonesGuiMenu>> CLONES_GUI = REGISTRY.register("clones_gui", () -> IForgeMenuType.create(ClonesGuiMenu::new));
	public static final RegistryObject<MenuType<MonsterBlockGuiMenu>> MONSTER_BLOCK_GUI = REGISTRY.register("monster_block_gui", () -> IForgeMenuType.create(MonsterBlockGuiMenu::new));
	public static final RegistryObject<MenuType<DemonKingGuiMenu>> DEMON_KING_GUI = REGISTRY.register("demon_king_gui", () -> IForgeMenuType.create(DemonKingGuiMenu::new));
	public static final RegistryObject<MenuType<DisasterMenuMenu>> DISASTER_MENU = REGISTRY.register("disaster_menu", () -> IForgeMenuType.create(DisasterMenuMenu::new));
	public static final RegistryObject<MenuType<CloverTradingMenu>> CLOVER_TRADING = REGISTRY.register("clover_trading", () -> IForgeMenuType.create(CloverTradingMenu::new));
	public static final RegistryObject<MenuType<JennaGuiMenu>> JENNA_GUI = REGISTRY.register("jenna_gui", () -> IForgeMenuType.create(JennaGuiMenu::new));
	public static final RegistryObject<MenuType<ZaneriGuiMenu>> ZANERI_GUI = REGISTRY.register("zaneri_gui", () -> IForgeMenuType.create(ZaneriGuiMenu::new));
	public static final RegistryObject<MenuType<TheoGuiMenu>> THEO_GUI = REGISTRY.register("theo_gui", () -> IForgeMenuType.create(TheoGuiMenu::new));
	public static final RegistryObject<MenuType<TheoCaveMenu>> THEO_CAVE = REGISTRY.register("theo_cave", () -> IForgeMenuType.create(TheoCaveMenu::new));
	public static final RegistryObject<MenuType<TheoTowerMenu>> THEO_TOWER = REGISTRY.register("theo_tower", () -> IForgeMenuType.create(TheoTowerMenu::new));
	public static final RegistryObject<MenuType<SettingsUIMenu>> SETTINGS_UI = REGISTRY.register("settings_ui", () -> IForgeMenuType.create(SettingsUIMenu::new));
	public static final RegistryObject<MenuType<HumanClanUiMenu>> HUMAN_CLAN_UI = REGISTRY.register("human_clan_ui", () -> IForgeMenuType.create(HumanClanUiMenu::new));
	public static final RegistryObject<MenuType<GiantClanMenu>> GIANT_CLAN = REGISTRY.register("giant_clan", () -> IForgeMenuType.create(GiantClanMenu::new));
	public static final RegistryObject<MenuType<FairyClanUiMenu>> FAIRY_CLAN_UI = REGISTRY.register("fairy_clan_ui", () -> IForgeMenuType.create(FairyClanUiMenu::new));
	public static final RegistryObject<MenuType<GuildAcceptGuiMenu>> GUILD_ACCEPT_GUI = REGISTRY.register("guild_accept_gui", () -> IForgeMenuType.create(GuildAcceptGuiMenu::new));
	public static final RegistryObject<MenuType<GuildGuiMenu>> GUILD_GUI = REGISTRY.register("guild_gui", () -> IForgeMenuType.create(GuildGuiMenu::new));
	public static final RegistryObject<MenuType<PossessionMenu>> POSSESSION = REGISTRY.register("possession", () -> IForgeMenuType.create(PossessionMenu::new));
	public static final RegistryObject<MenuType<DubsTradeMenu>> DUBS_TRADE = REGISTRY.register("dubs_trade", () -> IForgeMenuType.create(DubsTradeMenu::new));
}
