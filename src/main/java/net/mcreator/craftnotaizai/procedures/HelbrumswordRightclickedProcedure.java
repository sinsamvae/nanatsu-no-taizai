package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class HelbrumswordRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double yaw = 0;
		double rep = 0;
		double damage = 0;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 400);
		for (int index0 = 0; index0 < 8; index0++) {
			rep = rep + 1;
			CraftNoTaizaiMod.queueServerWork((int) rep, () -> {
				HolyTreeSwordDamageProcedure.execute(entity);
			});
		}
	}
}
