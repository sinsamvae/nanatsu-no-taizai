package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.CruelSunProjectileEntity;

public class CruelSunSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double damage = 0;
		damage = Math.ceil(0.45 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack
				* (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack_boost) + 1;
		damage = damage * ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage / 100);
		if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.ESCANOR_TAVERN_HELMET.get())) {
			if (world.dayTime() % 24000 >= 23000 && world.dayTime() % 24000 <= 23460) {
				damage = Math.ceil(damage * 1);
			} else if (world.dayTime() % 24000 >= 23460 && world.dayTime() % 24000 <= 23992) {
				damage = Math.ceil(damage * 2.5);
			} else if (world.dayTime() % 24000 >= 23992 && world.dayTime() % 24000 <= 0) {
				damage = Math.ceil(damage * 5);
			} else if (world.dayTime() % 24000 >= 0 && world.dayTime() % 24000 <= 1000) {
				damage = Math.ceil(damage * 6.75);
			} else if (world.dayTime() % 24000 >= 1000 && world.dayTime() % 24000 <= 6000) {
				damage = Math.ceil(damage * 7.5);
			} else if (world.dayTime() % 24000 >= 6000 && world.dayTime() % 24000 <= 9000) {
				damage = Math.ceil(damage * 10);
			} else if (world.dayTime() % 24000 >= 9000 && world.dayTime() % 24000 <= 12542) {
				damage = Math.ceil(damage * 1);
			} else if (world.dayTime() % 24000 >= 12542 && world.dayTime() % 24000 <= 12786) {
				damage = Math.ceil(damage / 5);
			} else if (world.dayTime() % 24000 >= 12786 && world.dayTime() % 24000 <= 13000) {
				damage = Math.ceil(damage / 6.75);
			} else if (world.dayTime() % 24000 >= 13000 && world.dayTime() % 24000 <= 13670) {
				damage = Math.ceil(damage / 7.5);
			} else if (world.dayTime() % 24000 >= 18000 && world.dayTime() % 24000 <= 22300) {
				damage = Math.ceil(damage / 20);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level();
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new CruelSunProjectileEntity(CraftNoTaizaiModEntities.CRUEL_SUN_PROJECTILE.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, (float) damage, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
		}
	}
}
