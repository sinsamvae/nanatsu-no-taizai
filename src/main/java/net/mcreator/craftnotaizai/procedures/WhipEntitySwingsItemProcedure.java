package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.craftnotaizai.item.WhipItem;

public class WhipEntitySwingsItemProcedure {
	public static void execute(ItemStack itemstack) {
		double distance = 0;
		if (itemstack.getItem() instanceof WhipItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "attack");
	}
}
