
package net.mcreator.craftnotaizai.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class SawSwordItem extends SwordItem {
	public SawSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1651;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CraftNoTaizaiModItems.CARBON_STEEL.get()));
			}
		}, 3, -2.5f, new Item.Properties());
	}
}
