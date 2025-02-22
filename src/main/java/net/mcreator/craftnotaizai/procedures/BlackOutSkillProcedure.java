package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.entity.BlackOutProjectileEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class BlackOutSkillProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double x = 0;
		double z = 0;
		double yaw = 0;
		double damage = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.TWIN_BOW_HERRITT.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.TWIN_BOW_HERRITT.get()) {
			damage = Math.ceil(0.45 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack
					* (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack_boost) + 5;
			damage = damage + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage / 100;
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
							AbstractArrow entityToSpawn = new BlackOutProjectileEntity(CraftNoTaizaiModEntities.BLACK_OUT_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) damage, 1);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
			}
		} else {
			if (entity.onGround()) {
				x = entity.getX();
				z = entity.getZ();
				yaw = entity.getYRot() + 180;
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("summon craft_no_taizai:black_out " + x + " ~ " + z + " {Rotation:[" + yaw + "f,0f]}"));
					}
				}
				CraftNoTaizaiMod.queueServerWork(6, () -> {
					BlackOutDamageProcedure.execute(world, entity);
				});
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You need to be grounded to use this move!"), true);
			}
		}
	}
}
