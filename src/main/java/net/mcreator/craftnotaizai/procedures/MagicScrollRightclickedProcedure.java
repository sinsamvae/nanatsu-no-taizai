package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class MagicScrollRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String skill = "";
		boolean can_set = false;
		double check = 0;
		double random = 0;
		double max = 0;
		double magic = 0;
		itemstack.shrink(1);
		if ((itemstack.getOrCreateTag().getString("skill")).equals("")) {
			random = Mth.nextInt(RandomSource.create(), 1, 12);
			if (random == 1) {
				skill = "Dark Destory";
			}
			if (random == 2) {
				skill = "Freeze Coffin";
			}
			if (random == 3) {
				skill = "Fire Storm";
			}
			if (random == 4) {
				skill = "Buster Ice";
			}
			if (random == 5) {
				skill = "Hard Protection";
			}
			if (random == 6) {
				skill = "Aqua Dress";
			}
			if (random == 7) {
				skill = "Flight";
			}
			if (random == 8) {
				skill = "RapidMovement";
			}
			if (random == 9) {
				skill = "Resist Fire";
			}
			if (random == 10) {
				skill = "Magic Detection";
			}
			if (random == 11) {
				skill = "Spiral Hail";
			}
			if (random == 12) {
				skill = "Teleportation";
			}
			itemstack.getOrCreateTag().putString("skill", skill);
		} else {
			skill = itemstack.getOrCreateTag().getString("skill");
		}
		can_set = true;
		for (int index0 = 0; index0 < (int) (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learned_spells; index0++) {
			if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learn_skill).getOrCreateTag()
					.getString(("learn_skill" + new java.text.DecimalFormat("##").format(check + 1)))).equals(skill)) {
				can_set = false;
			}
			check = check + 1;
		}
		if (can_set) {
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learned_spells + 1;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.learned_spells = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learn_skill).getOrCreateTag().putString(
					("learn_skill" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learned_spells)), skill);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You Learn New Spell!"), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You already have this skill!"), false);
		}
	}
}
