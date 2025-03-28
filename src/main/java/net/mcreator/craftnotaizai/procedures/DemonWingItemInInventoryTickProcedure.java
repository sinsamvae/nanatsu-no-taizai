package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class DemonWingItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.setHoverName(Component.literal((entity.getDisplayName().getString())));
		if (!(entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).berserkmode) {
			itemstack.shrink(1);
		}
		if ((entity.getDisplayName().getString()).equals(itemstack.getDisplayName().getString())) {
			itemstack.shrink(1);
		}
	}
}
