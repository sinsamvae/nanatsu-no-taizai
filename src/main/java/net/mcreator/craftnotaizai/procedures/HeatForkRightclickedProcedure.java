package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.SimpleContainer;

public class HeatForkRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack food = ItemStack.EMPTY;
		double stage = 0;
		for (int index0 = 0; index0 < 2; index0++) {
			stage = stage + 1;
			if (stage == 1) {
				food = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			}
			if (stage == 2) {
				food = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
			}
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(food) : false) && food.getItem().isEdible() && world instanceof Level _level4
					&& _level4.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(food), _level4).isPresent()) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = (world instanceof Level _lvlSmeltResult
							? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(food), _lvlSmeltResult).map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
							: ItemStack.EMPTY).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				food.shrink(1);
			}
		}
	}
}
