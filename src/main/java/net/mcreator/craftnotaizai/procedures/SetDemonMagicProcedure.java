package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class SetDemonMagicProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double RandomMagic = 0;
		RandomMagic = Mth.nextInt(RandomSource.create(), 1, 340);
		if (RandomMagic <= 60) {
			{
				String _setval = "HellBlaze";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 60 && RandomMagic <= 110) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).Invasion) {
				{
					String _setval = "Invasion";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).Invasion = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			} else {
				RandomMagic = Mth.nextInt(RandomSource.create(), 1, 180);
				if (RandomMagic <= 60) {
					{
						String _setval = "HellBlaze";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 60 && RandomMagic <= 90) {
					{
						String _setval = "Combo Star";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 90 && RandomMagic <= 120) {
					{
						String _setval = "Critical Over";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 120 && RandomMagic <= 150) {
					{
						String _setval = "Curse";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 150 && RandomMagic <= 180) {
					{
						String _setval = "Full Size";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 120 && RandomMagic <= 150) {
					{
						String _setval = "Hell Gate";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 150 && RandomMagic <= 180) {
					{
						String _setval = "Trick Star";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if (RandomMagic >= 110 && RandomMagic <= 120) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).full_counter) {
				{
					String _setval = "Full Counter";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MagicalCounter = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).full_counter = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			} else {
				RandomMagic = Mth.nextInt(RandomSource.create(), 1, 180);
				if (RandomMagic <= 60) {
					{
						String _setval = "HellBlaze";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 60 && RandomMagic <= 90) {
					{
						String _setval = "Combo Star";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 90 && RandomMagic <= 120) {
					{
						String _setval = "Critical Over";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 120 && RandomMagic <= 150) {
					{
						String _setval = "Curse";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 150 && RandomMagic <= 180) {
					{
						String _setval = "Full Size";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 120 && RandomMagic <= 150) {
					{
						String _setval = "Hell Gate";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 150 && RandomMagic <= 180) {
					{
						String _setval = "Trick Star";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if (RandomMagic >= 120 && RandomMagic <= 150) {
			{
				String _setval = "Combo Star";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 150 && RandomMagic <= 160) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).fullcounter) {
				{
					String _setval = "Full Counter";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MagicalCounter = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).fullcounter = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			} else {
				RandomMagic = Mth.nextInt(RandomSource.create(), 1, 180);
				if (RandomMagic <= 60) {
					{
						String _setval = "HellBlaze";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 60 && RandomMagic <= 90) {
					{
						String _setval = "Combo Star";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 90 && RandomMagic <= 120) {
					{
						String _setval = "Critical Over";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 120 && RandomMagic <= 150) {
					{
						String _setval = "Curse";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 150 && RandomMagic <= 180) {
					{
						String _setval = "Full Size";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 120 && RandomMagic <= 150) {
					{
						String _setval = "Hell Gate";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 150 && RandomMagic <= 180) {
					{
						String _setval = "Trick Star";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if (RandomMagic >= 160 && RandomMagic <= 190) {
			{
				String _setval = "Critical Over";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 190 && RandomMagic <= 220) {
			{
				String _setval = "Curse";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 220 && RandomMagic <= 250) {
			{
				String _setval = "Full Size";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 250 && RandomMagic <= 280) {
			{
				String _setval = "Hell Gate";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (RandomMagic >= 280 && RandomMagic <= 310) {
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).OminousNebula) {
				{
					String _setval = "Ominous Nebula";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).OminousNebula = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			} else {
				RandomMagic = Mth.nextInt(RandomSource.create(), 1, 180);
				if (RandomMagic <= 60) {
					{
						String _setval = "HellBlaze";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 60 && RandomMagic <= 90) {
					{
						String _setval = "Combo Star";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 90 && RandomMagic <= 120) {
					{
						String _setval = "Critical Over";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 120 && RandomMagic <= 150) {
					{
						String _setval = "Curse";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 150 && RandomMagic <= 180) {
					{
						String _setval = "Full Size";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 120 && RandomMagic <= 150) {
					{
						String _setval = "Hell Gate";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (RandomMagic >= 150 && RandomMagic <= 180) {
					{
						String _setval = "Trick Star";
						entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.magic = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if (RandomMagic >= 310 && RandomMagic <= 340) {
			{
				String _setval = "Trick Star";
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
