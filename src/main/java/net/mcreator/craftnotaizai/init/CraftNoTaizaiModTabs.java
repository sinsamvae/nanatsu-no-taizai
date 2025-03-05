
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftNoTaizaiModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<CreativeModeTab> INCANTATION_ORB = REGISTRY.register("incantation_orb",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.incantation_orb")).icon(() -> new ItemStack(CraftNoTaizaiModItems.PERFECT_CUBE_ORB.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.HYPER_RECOVERY.get());
				tabData.accept(CraftNoTaizaiModItems.EMPTYORB.get());
				tabData.accept(CraftNoTaizaiModItems.LUME_ORB.get());
				tabData.accept(CraftNoTaizaiModItems.TELEPORTATION_ORB.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ARMOR = REGISTRY.register("armor",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.armor")).icon(() -> new ItemStack(CraftNoTaizaiModItems.GIL_THUNDER_ARMOR_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.GIL_THUNDER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GIL_THUNDER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.HELBRUM_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.HELBRUM_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.HOWZER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.HOWZER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.SLADER_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.SLADER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.SLADER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_OUTFIT_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.KING_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.KING_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MERLIN_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MERLIN_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODASOUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODASOUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ARTHER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ARTHER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.DIANEOUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.DIANEOUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHOARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHOARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODASDANAFORARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODASDANAFORARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHO_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHO_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.KNIGHTARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.KNIGHTARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.KNIGHTARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ROYALKNIGHT_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.ROYALKNIGHT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ROYALKNIGHT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.FRIESIAARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.FRIESIAARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.FRIESIAARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GOLGIUSARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.GOLGIUSARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GOLGIUSARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MURAMO_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.MURAMO_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MURAMO_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ANDRE_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ANDRE_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.PARADA_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.PARADA_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.PARADA_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.SOLDIER_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.SOLDIER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.SOLDIER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.TWIGO_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.TWIGO_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.RUIN_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.RUIN_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.RUIN_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_ARMOR_2_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_ARMOR_2_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.HOWZER_ARMOR_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.HOWZER_ARMOR_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.CAIN_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.CAIN_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.FAIRY_HELBRAM_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.FAIRY_HELBRAM_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GREEN_KNIGHT_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.GREEN_KNIGHT_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GREEN_KNIGHT_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.RED_KNIGHT_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.RED_KNIGHT_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.RED_KNIGHT_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.DREYFUS_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.DREYFUS_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.HENDRICKSON_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.HENDRICKSON_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.HUGO_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.HUGO_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.HUGO_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.JILLIAN_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.JILLIAN_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.SIMON_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.SIMON_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.WEINHEIDT_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.WEINHEIDT_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.VIVIAN_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.VIVIAN_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.VIVIAN_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GUSTAF_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.GUSTAF_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GUSTAF_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.BOAR_HAT_OUTFIT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.BOAR_HAT_OUTFIT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MERLIN_ARMOR_CHEST_PLATE_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.MERLIN_ARMOR_CHEST_PLATE_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MERLIN_ARMOR_CHEST_PLATE_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.DIANE_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.DIANE_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.DIANE_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ESCANOR_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.ESCANOR_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ESCANOR_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.KINGS_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.KINGS_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.KINGS_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODAS_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODAS_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODAS_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODAS_BOAR_HAT_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODAS_BOAR_HAT_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_ARMOR_S_2_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_ARMOR_S_2_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_ARMOR_S_2_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_ARMOR_S_2_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_ARMOR_S_2_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ESCANOR_TAVERN_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.ESCANOR_TAVERN_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ESCANOR_TAVERN_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ELAINE_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ELAINE_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ESCANOR_ARMOR_2_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ESCANOR_ARMOR_2_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ESTAROSSAARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ESTAROSSAARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MONSSPEET_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MONSSPEET_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.ZELDRIS_ARMOR_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.ZELDRIS_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.ZELDRIS_ARMOR_LEGGINGS.get());
				tabData.accept(CraftNoTaizaiModItems.MELASCULA_ARMOR_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.MELASCULA_ARMOR_LEGGINGS.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SACRED_TREASURE = REGISTRY.register("sacred_treasure",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.sacred_treasure")).icon(() -> new ItemStack(CraftNoTaizaiModItems.LOSTVAYNE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.RHITTA.get());
				tabData.accept(CraftNoTaizaiModItems.CHASTIEFOL_2.get());
				tabData.accept(CraftNoTaizaiModItems.GIDEON.get());
				tabData.accept(CraftNoTaizaiModItems.ALDAN.get());
				tabData.accept(CraftNoTaizaiModItems.LOSTVAYNE.get());
				tabData.accept(CraftNoTaizaiModItems.TWIN_BOW_HERRITT.get());
				tabData.accept(CraftNoTaizaiModItems.HEAT_FORK.get());
				tabData.accept(CraftNoTaizaiModItems.HOLY_STAFF_COURE_CHOUSE.get());
				tabData.accept(CraftNoTaizaiModItems.BASQUIAS.get());
				tabData.accept(CraftNoTaizaiModItems.REAPER_SCYTHE.get());
				tabData.accept(CraftNoTaizaiModItems.FLYING_SAUCER.get());
				tabData.accept(CraftNoTaizaiModItems.STAFF_OF_IMPRISONMENT.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ITEMS = REGISTRY.register("items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.items")).icon(() -> new ItemStack(CraftNoTaizaiModItems.COFFIN_OF_ETERNAL_DARKNESS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.FOUNTAIN_OF_YOUTH.get());
				tabData.accept(CraftNoTaizaiModItems.EMPTY_NEEDLE.get());
				tabData.accept(CraftNoTaizaiModItems.GRAY_DEMON_BLOOD_NEEDLE.get());
				tabData.accept(CraftNoTaizaiModItems.MAGIC_SCROLL.get());
				tabData.accept(CraftNoTaizaiModItems.COFFIN_OF_ETERNAL_DARKNESS.get());
				tabData.accept(CraftNoTaizaiModItems.AGAVE.get());
				tabData.accept(CraftNoTaizaiModItems.CHICKEN_MATANGO_MUSH_ROOM.get());
				tabData.accept(CraftNoTaizaiModItems.GODDESS_AMBER.get());
				tabData.accept(CraftNoTaizaiModItems.GODDESS_AMBER_SHARD.get());
				tabData.accept(CraftNoTaizaiModItems.BALORS_MAGICAL_EYE_HELMET.get());
				tabData.accept(CraftNoTaizaiModItems.HOLY_TREE_SHARD.get());
				tabData.accept(CraftNoTaizaiModItems.MONSTER_BLOCK.get());
				tabData.accept(CraftNoTaizaiModItems.PEACE_AMULET_CHESTPLATE.get());
				tabData.accept(CraftNoTaizaiModItems.BRITANNIA_COINS.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> WEAPONS = REGISTRY.register("weapons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.weapons")).icon(() -> new ItemStack(CraftNoTaizaiModItems.DRAGON_HANDLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.DRAGON_HANDLE.get());
				tabData.accept(CraftNoTaizaiModItems.LIZ_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.LIZ_SNEATH_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.BELL_STAFF.get());
				tabData.accept(CraftNoTaizaiModItems.WHIP.get());
				tabData.accept(CraftNoTaizaiModItems.BOW.get());
				tabData.accept(CraftNoTaizaiModItems.CURVED_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.HALBERT.get());
				tabData.accept(CraftNoTaizaiModItems.HENDRIKSON_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.DEMON_KING_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.DREYFUS_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.KATANA.get());
				tabData.accept(CraftNoTaizaiModItems.SCYTHE.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHO_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.GOLGIUS_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.TWIGOSWORD.get());
				tabData.accept(CraftNoTaizaiModItems.SPIRALEDLANCE.get());
				tabData.accept(CraftNoTaizaiModItems.RAPIER.get());
				tabData.accept(CraftNoTaizaiModItems.GIL_THUNDER_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.HELBRUMSWORD.get());
				tabData.accept(CraftNoTaizaiModItems.SEQUENCE.get());
				tabData.accept(CraftNoTaizaiModItems.SAW_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.AXE_2.get());
				tabData.accept(CraftNoTaizaiModItems.SAW_BLADE.get());
				tabData.accept(CraftNoTaizaiModItems.LONG_AXE.get());
				tabData.accept(CraftNoTaizaiModItems.GUARD_SPEAR.get());
				tabData.accept(CraftNoTaizaiModItems.DOUBLE_SIDED_SPEAR.get());
				tabData.accept(CraftNoTaizaiModItems.ZELDRIS_SWORD.get());
				tabData.accept(CraftNoTaizaiModItems.ESTARROSA_SWORD.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> FOODS = REGISTRY.register("foods",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.foods")).icon(() -> new ItemStack(CraftNoTaizaiModItems.UNCOOKED_DUSK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.UNCOOKED_DUSK.get());
				tabData.accept(CraftNoTaizaiModItems.COOKED_DUSK_MEAT.get());
				tabData.accept(CraftNoTaizaiModItems.TENTACLES.get());
				tabData.accept(CraftNoTaizaiModItems.COOKEDTENTACLES.get());
				tabData.accept(CraftNoTaizaiModItems.APPLEPIE.get());
				tabData.accept(CraftNoTaizaiModItems.BAKE_APPLE_PIE.get());
				tabData.accept(CraftNoTaizaiModItems.TYRANT_DRAGON_MEAT.get());
				tabData.accept(CraftNoTaizaiModItems.TYRANT_DRAGON_COOKED_MEAT.get());
				tabData.accept(CraftNoTaizaiModItems.EARTH_CRAWLER_TAIL.get());
				tabData.accept(CraftNoTaizaiModItems.EARTH_CRAWLER_TAIL_COOKED.get());
				tabData.accept(CraftNoTaizaiModItems.ANGLE_CURE_MEAT.get());
				tabData.accept(CraftNoTaizaiModItems.COOKED_ANGLE_MEAT.get());
				tabData.accept(CraftNoTaizaiModItems.TROLL_EAR.get());
				tabData.accept(CraftNoTaizaiModItems.COOK_TROLL_EAR.get());
				tabData.accept(CraftNoTaizaiModItems.MINIMUM_TABLETS.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SDS_BLOCKS = REGISTRY.register("sds_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.sds_blocks")).icon(() -> new ItemStack(CraftNoTaizaiModBlocks.PERFECT_CUBE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModBlocks.CAPITALOFTHE_DEAD_BLOCK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.PERFECT_CUBE.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BAR_DOOR.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.HAY_BALE_ROOF.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.AREA_GROUND.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.AREAWOOD.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.AREAFENCE.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.AREA_SLAB.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.AREA_WOOD_SLAB.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.TALA_VILLAGE_FLOWER.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.CAPITAL_OF_THE_DEAD_GROUND_BLOCK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.CAPITAL_OF_THE_DEAD_GROUND.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.SLEEPING_FOREST_WOOD.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.SLEEPING_FOREST_PLANK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREES_LOG.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_KING_LOG.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_KING_LEAVE.get().asItem());
				tabData.accept(CraftNoTaizaiModItems.EMPTY_MUG.get());
				tabData.accept(CraftNoTaizaiModBlocks.GODDASS_ORE.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREE_WOOD.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREE_FENCE.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREE_STAIRES.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREE_SLAB.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BASTE_DUNGEON_WALLS.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.BASTE_DUNGEON_ROOF.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.PURGATORY_BLOCK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.PURGATORY_SLAB.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.PURGATORY_STAIR.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.PURGATORY_BRICK.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.PURGATORY_BRICK_SLAB.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.PURGATORY_BRICK_STAIR.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.SLEEPING_FOREST_DIRT.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.TOWER_OF_TRIALS.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.CAVE_OF_TRAINING.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.SIDE_MOUNTAIN.get().asItem());
				tabData.accept(CraftNoTaizaiModBlocks.RHITTA_BLOCK.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SPAWN_EGGS = REGISTRY.register("spawn_eggs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.craft_no_taizai.spawn_eggs")).icon(() -> new ItemStack(CraftNoTaizaiModItems.TWIGO_ANIMATED_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CraftNoTaizaiModItems.MANTA_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.CHICKEN_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GECKOLIB_KRAKEN_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.RED_DEMON_GECKOLIB_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.HAWKS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.BLACK_HOUND_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.SWORD_WOLF_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DALE_ARMORED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DALEFINAL_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ELAINE_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.INSECT_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GRAY_DEMON_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.HIDE_AND_SEEK_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.VINE_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.LUIGI_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.TYRANT_DRAGON_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MUTILATOR_RABBITS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ANGLE_CURE_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DUSK_BISON_1_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHO_DEMON_FORM_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.TROLL_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.KULUMIL_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.PUORA_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.EARTH_CRAWLER_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.CLAY_DRAGON_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MURAMO_DEMON_FORM_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ANDRE_DEMON_FORM_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GRAY_DEMON_ENTITY_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GOLGIUS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DIANE_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.RUIN_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.FRIESIA_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.TAIZOO_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GRIAMORE_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.CAIN_BARZAD_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.JERICHO_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GUILA_DEMONANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.HELBREM_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GIL_THUNDER_ANIMATED_2_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.RED_KNIGHT_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GREEN_KNIGHT_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DREYFUS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.FAIRY_HELBREM_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DEAD_HELBRAMANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.VIVIAN_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ROYAL_GURARD_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ROYAL_GUARD_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.SOLDIER_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.STORY_BAN_2_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.PARADA_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DEMON_HENDRICKSON_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ANDRE_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MURAMO_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DUMBLEBBAS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.WEINHEIDT_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.HUGO_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.JILLIAN_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.SIMON_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.BAN_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GUSTAF_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DIANE_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.KING_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MELIODAS_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MERLIN_BOSS_ANIMATED_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GERHEADE_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DOGEDO_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GOWTHER_STORY_1_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ALBION_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ALBION_FAT_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.TALL_ALBION_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ALBION_TALL_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DEMON_KING_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GALAND_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MATRONA_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.THEO_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.JENNA_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ZANERI_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ESCANOR_BOSS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GLOXINA_BOSS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MOSS_DRAGON_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ANAON_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.KING_STORY_1_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GALAND_STORY_2_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ELAINE_STORY_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GALAND_OVER_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DUBS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.BLUE_DEMON_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.JIGUMO_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DROLE_BOSS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.DERIERI_BOSS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ESTAROSSA_BOSS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.FRAUDRIN_BOSS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GALAND_BOSS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.GRAY_ROAD_BOSS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MELASCULA_BOSS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.MONSPEET_BOSS_SPAWN_EGG.get());
				tabData.accept(CraftNoTaizaiModItems.ZELDRIS_BOSS_SPAWN_EGG.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

			tabData.accept(CraftNoTaizaiModBlocks.KEG.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(CraftNoTaizaiModItems.CLOVER_SPAWN_EGG.get());
			tabData.accept(CraftNoTaizaiModItems.KALEIDOSCOPE_ENTITY_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(CraftNoTaizaiModItems.CARBON_STEEL.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

			tabData.accept(CraftNoTaizaiModItems.DEMON_BLOOD.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(CraftNoTaizaiModItems.AGAVE_SEEDS.get());
			tabData.accept(CraftNoTaizaiModBlocks.FAIRY_TREE_SAPLINGS.get().asItem());
			tabData.accept(CraftNoTaizaiModBlocks.HOLY_TREE_ORE.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(CraftNoTaizaiModItems.SEVEN_DEADLY_SINS_OPENING.get());

		}
	}
}
