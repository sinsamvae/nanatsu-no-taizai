package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

import java.util.function.Supplier;
import java.util.Map;

public class SetTradesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (!entity.getPersistentData().getBoolean("clover")) {
			entity.getPersistentData().putBoolean("clover", true);
			if (entity.getPersistentData().getDouble("Playertrade") == 1) {
				random = Mth.nextInt(RandomSource.create(), 2, 5);
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("craft_no_taizai:common_clover_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
					_setstack.setCount((int) random);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity.getPersistentData().getDouble("Playertrade") == 2) {
				random = Mth.nextInt(RandomSource.create(), 3, 7);
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("craft_no_taizai:uncommon_clover_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
					_setstack.setCount((int) random);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity.getPersistentData().getDouble("Playertrade") == 3) {
				random = Mth.nextInt(RandomSource.create(), 3, 7);
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("craft_no_taizai:rare_clover_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
					_setstack.setCount((int) random);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity.getPersistentData().getDouble("Playertrade") == 4) {
				random = Mth.nextInt(RandomSource.create(), 3, 9);
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("craft_no_taizai:epic_clover_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
					_setstack.setCount((int) random);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (entity.getPersistentData().getDouble("Playertrade") == 5) {
				if (!CraftNoTaizaiModVariables.MapVariables.get(world).lostvayne) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(CraftNoTaizaiModItems.LOSTVAYNE.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("craft_no_taizai:legendary_clover_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR)))
								.copy();
						_setstack.setCount(1);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
		}
	}
}
