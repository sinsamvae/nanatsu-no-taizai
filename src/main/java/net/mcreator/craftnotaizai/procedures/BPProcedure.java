package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class BPProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		String Power_Level = "";
		double BP = 0;
		double damage = 0;
		BP = Math.round(((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth
				+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Spirit
				+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack
				+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Agility
				+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxmana
				+ (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength) / 3);
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("SunShine")
				&& !((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.ESCANOR_TAVERN_HELMET.get())) {
			if (world.dayTime() % 24000 >= 23000 && world.dayTime() % 24000 <= 23460) {
				BP = Math.round(BP * 1);
			} else if (world.dayTime() % 24000 >= 23460 && world.dayTime() % 24000 <= 23992) {
				BP = Math.round(BP * 1.3);
			} else if (world.dayTime() % 24000 >= 23992 && world.dayTime() % 24000 <= 0) {
				BP = Math.round(BP * 1.5);
			} else if (world.dayTime() % 24000 >= 0 && world.dayTime() % 24000 <= 1000) {
				BP = Math.round(BP * 1.8);
			} else if (world.dayTime() % 24000 >= 1000 && world.dayTime() % 24000 <= 6000) {
				BP = Math.round(BP * 2);
			} else if (world.dayTime() % 24000 >= 6000 && world.dayTime() % 24000 <= 9000) {
				BP = Math.round(BP * 10);
			} else if (world.dayTime() % 24000 >= 9000 && world.dayTime() % 24000 <= 12542) {
				BP = Math.round(BP / 1.3);
			} else if (world.dayTime() % 24000 >= 12542 && world.dayTime() % 24000 <= 12786) {
				BP = Math.round(BP / 1.5);
			} else if (world.dayTime() % 24000 >= 12786 && world.dayTime() % 24000 <= 13000) {
				BP = Math.round(BP / 1.8);
			} else if (world.dayTime() % 24000 >= 13000 && world.dayTime() % 24000 <= 13670) {
				BP = Math.round(BP / 2);
			} else if (world.dayTime() % 24000 >= 18000 && world.dayTime() % 24000 <= 22300) {
				BP = Math.round(BP / 10);
			}
		}
		Power_Level = "BP: " + new java.text.DecimalFormat("##").format(BP);
		return Power_Level;
	}
}
