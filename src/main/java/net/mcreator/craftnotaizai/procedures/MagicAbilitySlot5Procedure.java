package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class MagicAbilitySlot5Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean can_set = false;
		double check = 0;
		if (!(DisplayAbility5Procedure.execute(entity)).equals("LOCKED")) {
			can_set = true;
			for (int index0 = 0; index0 < 8; index0++) {
				if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
						.equals(DisplayAbility5Procedure.execute(entity))) {
					can_set = false;
				}
				check = check + 1;
			}
			if (can_set) {
				((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
						.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), DisplayAbility5Procedure.execute(entity));
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(DisplayAbility5Procedure.execute(entity)), false);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You already have this skill"), false);
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learn_skills == true) {
			if (!(MagicScroll5Procedure.execute(entity)).equals("LOCKED")) {
				can_set = true;
				for (int index1 = 0; index1 < 8; index1++) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
							.equals(MagicScroll5Procedure.execute(entity))) {
						can_set = false;
					}
					check = check + 1;
				}
				if (can_set) {
					((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), MagicScroll5Procedure.execute(entity));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(MagicScroll5Procedure.execute(entity)), false);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You already have this skill"), false);
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learn_demon_skills == true) {
			if (!(DisplayDemonSKill5Procedure.execute(entity)).equals("LOCKED")) {
				can_set = true;
				for (int index2 = 0; index2 < 8; index2++) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
							.equals(DisplayDemonSKill5Procedure.execute(entity))) {
						can_set = false;
					}
					check = check + 1;
				}
				if (can_set) {
					((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), DisplayDemonSKill5Procedure.execute(entity));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(DisplayDemonSKill5Procedure.execute(entity)), false);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You already have this skill"), false);
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).SlotSwitch == 2) {
			MagicAbility13Procedure.execute(entity);
		}
	}
}
