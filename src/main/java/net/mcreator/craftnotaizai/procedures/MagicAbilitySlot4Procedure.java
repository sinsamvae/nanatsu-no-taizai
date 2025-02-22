package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class MagicAbilitySlot4Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean can_set = false;
		double check = 0;
		if (!(DisplayAbility4Procedure.execute(entity)).equals("LOCKED")) {
			can_set = true;
			for (int index0 = 0; index0 < 8; index0++) {
				if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
						.equals(DisplayAbility4Procedure.execute(entity))) {
					can_set = false;
				}
				check = check + 1;
			}
			if (can_set) {
				((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
						.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), DisplayAbility4Procedure.execute(entity));
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(DisplayAbility4Procedure.execute(entity)), false);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You already have this skill"), false);
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learn_skills == true) {
			if (!(MagicScrollSkill4Procedure.execute(entity)).equals("LOCKED")) {
				can_set = true;
				for (int index1 = 0; index1 < 8; index1++) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
							.equals(MagicScrollSkill4Procedure.execute(entity))) {
						can_set = false;
					}
					check = check + 1;
				}
				if (can_set) {
					((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), MagicScrollSkill4Procedure.execute(entity));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(MagicScrollSkill4Procedure.execute(entity)), false);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You already have this skill"), false);
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learn_demon_skills == true) {
			if (!(DisplayDemonSkill4Procedure.execute(entity)).equals("LOCKED")) {
				can_set = true;
				for (int index2 = 0; index2 < 8; index2++) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
							.equals(DisplayDemonSkill4Procedure.execute(entity))) {
						can_set = false;
					}
					check = check + 1;
				}
				if (can_set) {
					((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), DisplayDemonSkill4Procedure.execute(entity));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(DisplayDemonSkill4Procedure.execute(entity)), false);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You already have this skill"), false);
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).SlotSwitch == 2) {
			MagicAbilitySlot12Procedure.execute(entity);
		}
	}
}
