package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class SetFairyMagicProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double RandomMagic = 0;
		RandomMagic = Mth.nextInt(RandomSource.create(), 1, 620);
		if (RandomMagic <= 70) {
			{
				String _setval = "Wind Shooter";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 70 && RandomMagic <= 140) {
			{
				String _setval = "Aura Burst";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 140 && RandomMagic <= 210) {
			{
				String _setval = "Bullet Squall";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 210 && RandomMagic <= 280) {
			{
				String _setval = "Goen no Jujin";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 280 && RandomMagic <= 340) {
			{
				String _setval = "Blaze";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 340 && RandomMagic <= 400) {
			{
				String _setval = "Boost";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 400 && RandomMagic <= 460) {
			{
				String _setval = "IceFang";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 460 && RandomMagic <= 510) {
			{
				String _setval = "Miracle Wind";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 510 && RandomMagic <= 560) {
			{
				String _setval = "Hunter Wisp";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 560 && RandomMagic <= 590) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).fairyking) {
				{
					String _setval = "Disaster";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).fairyking = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			} else {
				RandomMagic = Mth.nextInt(RandomSource.create(), 1, 560);
				if (RandomMagic <= 70) {
					{
						String _setval = "Wind Shooter";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 70 && RandomMagic <= 140) {
					{
						String _setval = "Aura Burst";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 140 && RandomMagic <= 210) {
					{
						String _setval = "Bullet Squall";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 210 && RandomMagic <= 280) {
					{
						String _setval = "Goen no Jujin";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 280 && RandomMagic <= 340) {
					{
						String _setval = "Blaze";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 340 && RandomMagic <= 400) {
					{
						String _setval = "Boost";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 400 && RandomMagic <= 460) {
					{
						String _setval = "IceFang";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 460 && RandomMagic <= 510) {
					{
						String _setval = "Miracle Wind";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 510 && RandomMagic <= 560) {
					{
						String _setval = "Hunter Wisp";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if (RandomMagic >= 590 && RandomMagic <= 620) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).fairy_kings) {
				{
					String _setval = "Disaster";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).fairy_kings = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
				{
					boolean _setval = true;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Gloxinia = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				RandomMagic = Mth.nextInt(RandomSource.create(), 1, 560);
				if (RandomMagic <= 70) {
					{
						String _setval = "Wind Shooter";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 70 && RandomMagic <= 140) {
					{
						String _setval = "Aura Burst";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 140 && RandomMagic <= 210) {
					{
						String _setval = "Bullet Squall";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 210 && RandomMagic <= 280) {
					{
						String _setval = "Goen no Jujin";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 280 && RandomMagic <= 340) {
					{
						String _setval = "Blaze";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 340 && RandomMagic <= 400) {
					{
						String _setval = "Boost";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 400 && RandomMagic <= 460) {
					{
						String _setval = "IceFang";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 460 && RandomMagic <= 510) {
					{
						String _setval = "Miracle Wind";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 510 && RandomMagic <= 560) {
					{
						String _setval = "Hunter Wisp";
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
