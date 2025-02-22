package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class MagicAbilitySlot7Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean can_set = false;
		double check = 0;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learn_skills == true) {
			if (!(MagicScroll7Procedure.execute(entity)).equals("LOCKED")) {
				can_set = true;
				for (int index0 = 0; index0 < 8; index0++) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
							.equals(MagicScroll7Procedure.execute(entity))) {
						can_set = false;
					}
					check = check + 1;
				}
				if (can_set) {
					((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), MagicScroll7Procedure.execute(entity));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(MagicScroll7Procedure.execute(entity)), false);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You already have this skill"), false);
				}
			}
		}
		if (!(DisplayAbility7Procedure.execute(entity)).equals("LOCKED")) {
			can_set = true;
			for (int index1 = 0; index1 < 8; index1++) {
				if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
						.equals(DisplayAbility7Procedure.execute(entity))) {
					can_set = false;
				}
				check = check + 1;
			}
			if (can_set) {
				((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
						.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), DisplayAbility7Procedure.execute(entity));
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(DisplayAbility7Procedure.execute(entity)), false);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You already have this skill"), false);
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).SlotSwitch == 2) {
			MagicAbility15Procedure.execute(entity);
		}
	}
}
