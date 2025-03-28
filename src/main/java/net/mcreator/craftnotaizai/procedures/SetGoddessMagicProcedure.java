package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class SetGoddessMagicProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double magic = 0;
		magic = Mth.nextInt(RandomSource.create(), 1, 280);
		if (magic <= 60) {
			{
				String _setval = "Lai";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (magic >= 60 && magic <= 120) {
			{
				String _setval = "maelArk";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (magic >= 120 && magic <= 180) {
			{
				String _setval = "ludocielArk";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (magic >= 180 && magic <= 240) {
			{
				String _setval = "elizabethArk";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (magic >= 240 && magic <= 250) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).ocean) {
				{
					String _setval = "Ocean";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).ocean = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			} else {
				magic = Mth.nextInt(RandomSource.create(), 1, 240);
				if (magic <= 60) {
					{
						String _setval = "Lai";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 60 && magic <= 120) {
					{
						String _setval = "maelArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 120 && magic <= 180) {
					{
						String _setval = "ludocielArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 180 && magic <= 240) {
					{
						String _setval = "elizabethArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if (magic >= 250 && magic <= 260) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).flash) {
				{
					String _setval = "Flash";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).flash = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			} else {
				magic = Mth.nextInt(RandomSource.create(), 1, 240);
				if (magic <= 60) {
					{
						String _setval = "Lai";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 60 && magic <= 120) {
					{
						String _setval = "maelArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 120 && magic <= 180) {
					{
						String _setval = "ludocielArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 180 && magic <= 240) {
					{
						String _setval = "elizabethArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if (magic >= 260 && magic <= 270) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).mael_sunshine) {
				{
					String _setval = "maelSunShine";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).mael_sunshine = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			} else {
				magic = Mth.nextInt(RandomSource.create(), 1, 240);
				if (magic <= 60) {
					{
						String _setval = "Lai";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 60 && magic <= 120) {
					{
						String _setval = "maelArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 120 && magic <= 180) {
					{
						String _setval = "ludocielArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 180 && magic <= 240) {
					{
						String _setval = "elizabethArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if (magic >= 270 && magic <= 280) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).tornado) {
				{
					String _setval = "Tornado";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).tornado = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			} else {
				magic = Mth.nextInt(RandomSource.create(), 1, 240);
				if (magic <= 60) {
					{
						String _setval = "Lai";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 60 && magic <= 120) {
					{
						String _setval = "maelArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 120 && magic <= 180) {
					{
						String _setval = "ludocielArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (magic >= 180 && magic <= 240) {
					{
						String _setval = "elizabethArk";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
