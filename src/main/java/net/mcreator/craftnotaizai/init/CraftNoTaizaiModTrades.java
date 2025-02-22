
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CraftNoTaizaiModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.PUMPKIN_SEEDS, 3),

					new ItemStack(CraftNoTaizaiModItems.AGAVE_SEEDS.get(), 2), 10, 3, 0.03f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.WHEAT_SEEDS, 2),

					new ItemStack(CraftNoTaizaiModItems.AGAVE_SEEDS.get()), 10, 2, 0.03f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.TORCHFLOWER_SEEDS, 3),

					new ItemStack(CraftNoTaizaiModItems.AGAVE_SEEDS.get(), 2), 10, 3, 0.03f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.MELON_SEEDS, 2),

					new ItemStack(CraftNoTaizaiModItems.AGAVE_SEEDS.get()), 10, 2, 0.03f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.BEETROOT_SEEDS, 3),

					new ItemStack(CraftNoTaizaiModItems.AGAVE_SEEDS.get(), 2), 10, 3, 0.03f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9),

					new ItemStack(CraftNoTaizaiModItems.BRITANNIA_COINS.get(), 4), 10, 12, 0.06f));
		}
	}
}
