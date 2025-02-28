
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftNoTaizaiModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> CRAFT_NO_TAIZAI_XP_AMOUNT = GameRules.register("craftNoTaizaiXPAmount", GameRules.Category.MISC, GameRules.IntegerValue.create(10));
	public static final GameRules.Key<GameRules.IntegerValue> CRAFT_NO_TAIZAI_ISTAR = GameRules.register("craftNoTaizaiIstar", GameRules.Category.MISC, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.BooleanValue> CRAFT_NO_TAIZAI_RANDOM_MAGIC = GameRules.register("craftNoTaizaiRandomMagic", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> CRAFT_NO_TAIZAI_IMMORTILITY = GameRules.register("craftNoTaizaiImmortility", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> CRAFT_NO_TAIZAI_MANA = GameRules.register("craftNoTaizaiMana", GameRules.Category.MISC, GameRules.IntegerValue.create(0));
	public static final GameRules.Key<GameRules.BooleanValue> CRAFT_NO_TAIZAI_REROLL_MAGIC = GameRules.register("craftNoTaizaiRerollMagic", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
