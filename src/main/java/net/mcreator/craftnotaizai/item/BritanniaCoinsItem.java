
package net.mcreator.craftnotaizai.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BritanniaCoinsItem extends Item {
	public BritanniaCoinsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
