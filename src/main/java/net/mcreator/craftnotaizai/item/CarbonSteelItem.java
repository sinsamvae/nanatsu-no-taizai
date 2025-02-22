
package net.mcreator.craftnotaizai.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CarbonSteelItem extends Item {
	public CarbonSteelItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
