package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.craftnotaizai.item.HolyStaffCoureChouseItem;

public class CoureChouseAnimatedEntitySwingsItemProcedure {
	public static void execute(ItemStack itemstack) {
		double distance = 0;
		if (itemstack.getItem() instanceof HolyStaffCoureChouseItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "attack");
	}
}
