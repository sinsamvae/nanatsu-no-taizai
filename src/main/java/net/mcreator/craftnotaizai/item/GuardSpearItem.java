
package net.mcreator.craftnotaizai.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class GuardSpearItem extends SwordItem {
	public GuardSpearItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 3f;
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
		}, 3, -2f, new Item.Properties());
	}
}
