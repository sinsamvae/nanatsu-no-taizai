package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModGameRules;

public class GiveRerollMagicProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(CraftNoTaizaiModGameRules.CRAFT_NO_TAIZAI_REROLL_MAGIC)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CraftNoTaizaiModItems.RE_ROLL_MAGIC.get()).copy();
				_setstack.setCount(3);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
