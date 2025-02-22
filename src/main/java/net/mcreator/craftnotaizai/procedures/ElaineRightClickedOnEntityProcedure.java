package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModGameRules;

public class ElaineRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		double immortality = 0;
		if (world.getLevelData().getGameRules().getBoolean(CraftNoTaizaiModGameRules.CRAFT_NO_TAIZAI_IMMORTILITY)) {
			immortality = Mth.nextInt(RandomSource.create(), 1, 100);
			if (!(sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).immortalityplayer) {
				if (immortality <= 5) {
					{
						boolean _setval = true;
						sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.immortalityplayer = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftNoTaizaiModVariables.MapVariables.get(world).immortalityworld = true;
					CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(CraftNoTaizaiModItems.FOUNTAIN_OF_YOUTH.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Please Drink it!"), false);
				} else {
					{
						boolean _setval = true;
						sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.immortalityplayer = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You Have Wickedness In Your Heart!"), false);
				}
			} else {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("you have already try getting immortality"), false);
			}
		} else {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("immortality is off!"), false);
		}
		if (CraftNoTaizaiModVariables.MapVariables.get(world).immortalityworld) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("someone already has immortality"), false);
		}
	}
}
