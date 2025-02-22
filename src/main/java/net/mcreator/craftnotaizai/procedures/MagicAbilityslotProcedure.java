package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class MagicAbilityslotProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String skill = "";
		boolean can_set = false;
		double check = 0;
		double rep = 0;
		if (!(DisplayAbility1Procedure.execute(entity)).equals("LOCKED")) {
			can_set = true;
			for (int index0 = 0; index0 < 8; index0++) {
				if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
						.equals(DisplayAbility1Procedure.execute(entity))) {
					can_set = false;
				}
				check = check + 1;
			}
			if (can_set) {
				((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
						.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), DisplayAbility1Procedure.execute(entity));
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(DisplayAbility1Procedure.execute(entity)), false);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You already have this skill"), false);
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learn_skills == true) {
			if (!(SetSlotButtonProcedure.execute(entity)).equals("LOCKED")) {
				can_set = true;
				for (int index1 = 0; index1 < 8; index1++) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
							.equals(SetSlotButtonProcedure.execute(entity))) {
						can_set = false;
					}
					check = check + 1;
				}
				if (can_set) {
					((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), SetSlotButtonProcedure.execute(entity));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(SetSlotButtonProcedure.execute(entity)), false);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You already have this skill"), false);
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).learn_demon_skills == true) {
			if (!(DisplayDemonSkill1Procedure.execute(entity)).equals("LOCKED")) {
				can_set = true;
				for (int index2 = 0; index2 < 8; index2++) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
							.equals(DisplayDemonSkill1Procedure.execute(entity))) {
						can_set = false;
					}
					check = check + 1;
				}
				if (can_set) {
					((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), DisplayDemonSkill1Procedure.execute(entity));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(DisplayDemonSkill1Procedure.execute(entity)), false);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You already have this skill"), false);
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).demonkingpage == true) {
			if (!(DisplayDemonKingSkillProcedure.execute(entity)).equals("LOCKED")) {
				can_set = true;
				for (int index3 = 0; index3 < 8; index3++) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
							.equals(DisplayDemonKingSkillProcedure.execute(entity))) {
						can_set = false;
					}
					check = check + 1;
				}
				if (can_set) {
					((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), DisplayDemonKingSkillProcedure.execute(entity));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(DisplayDemonKingSkillProcedure.execute(entity)), false);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You already have this skill"), false);
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Possession_Switch == true) {
			if (!(PossessionSkillProcedure.execute(entity)).equals("LOCKED")) {
				can_set = true;
				for (int index4 = 0; index4 < 8; index4++) {
					if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag().getString(("skill" + check)))
							.equals(PossessionSkillProcedure.execute(entity))) {
						can_set = false;
					}
					check = check + 1;
				}
				if (can_set) {
					((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).AbilitySelect).getOrCreateTag()
							.putString(("skill" + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Move), PossessionSkillProcedure.execute(entity));
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(PossessionSkillProcedure.execute(entity)), false);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You already have this skill"), false);
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).SlotSwitch == 2) {
			MagicBilitySlot9Procedure.execute(entity);
		}
	}
}
