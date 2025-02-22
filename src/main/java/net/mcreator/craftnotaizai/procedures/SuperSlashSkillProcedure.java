package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.SuperSlashEntity;

public class SuperSlashSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double damage = 0;
		damage = Math.ceil(0.45 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack
				* (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack_boost) + 3;
		damage = damage * ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage / 100);
		if (world.dayTime() % 24000 >= 23000 && world.dayTime() % 24000 <= 23460) {
			damage = damage * 1;
		} else if (world.dayTime() % 24000 >= 23460 && world.dayTime() % 24000 <= 23992) {
			damage = damage * 3;
		} else if (world.dayTime() % 24000 >= 23992 && world.dayTime() % 24000 <= 0) {
			damage = damage * 10;
		} else if (world.dayTime() % 24000 >= 0 && world.dayTime() % 24000 <= 1000) {
			damage = damage * 13.5;
		} else if (world.dayTime() % 24000 >= 1000 && world.dayTime() % 24000 <= 5723) {
			damage = damage * 15;
		} else if (world.dayTime() % 24000 >= 5723 && world.dayTime() % 24000 <= 11834) {
			damage = damage * 20;
		} else if (world.dayTime() % 24000 >= 11834 && world.dayTime() % 24000 <= 12040) {
			damage = damage / 3;
		} else if (world.dayTime() % 24000 >= 12040 && world.dayTime() % 24000 <= 12786) {
			damage = damage / 10;
		} else if (world.dayTime() % 24000 >= 12786 && world.dayTime() % 24000 <= 13188) {
			damage = damage / 13.5;
		} else if (world.dayTime() % 24000 >= 13188 && world.dayTime() % 24000 <= 17843) {
			damage = damage / 15;
		} else if (world.dayTime() % 24000 >= 18000 && world.dayTime() % 24000 <= 23000) {
			damage = damage / 20;
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level();
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new SuperSlashEntity(CraftNoTaizaiModEntities.SUPER_SLASH.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, (float) damage, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
		}
	}
}
