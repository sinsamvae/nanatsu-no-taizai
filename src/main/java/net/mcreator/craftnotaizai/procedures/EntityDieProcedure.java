package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.entity.TyrantDragonEntity;
import net.mcreator.craftnotaizai.entity.TrollEntity;
import net.mcreator.craftnotaizai.entity.MutilatorRabbitsEntity;
import net.mcreator.craftnotaizai.entity.HawksEntity;
import net.mcreator.craftnotaizai.entity.GeckolibKrakenEntity;
import net.mcreator.craftnotaizai.entity.EarthCrawlerEntity;
import net.mcreator.craftnotaizai.entity.DuskBison1Entity;
import net.mcreator.craftnotaizai.entity.AngleCureEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityDieProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof HawksEntity) {
			if (entity.isOnFire() || entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.COOKED_PORKCHOP));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.PORKCHOP));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity instanceof MutilatorRabbitsEntity) {
			if (entity.isOnFire() || entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.COOKED_RABBIT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.RABBIT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity instanceof GeckolibKrakenEntity) {
			if (entity.isOnFire() || entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.COOKEDTENTACLES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.TENTACLES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity instanceof AngleCureEntity) {
			if (entity.isOnFire() || entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.COOKED_ANGLE_MEAT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.ANGLE_CURE_MEAT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity instanceof EarthCrawlerEntity) {
			if (entity.isOnFire() || entity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.EARTH_CRAWLER_TAIL_COOKED.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.EARTH_CRAWLER_TAIL.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity instanceof TrollEntity) {
			if (entity.isOnFire() || entity instanceof LivingEntity _livEnt27 && _livEnt27.hasEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.COOK_TROLL_EAR.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.TROLL_EAR.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity instanceof TyrantDragonEntity) {
			if (entity.isOnFire() || entity instanceof LivingEntity _livEnt32 && _livEnt32.hasEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.TYRANT_DRAGON_COOKED_MEAT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.TYRANT_DRAGON_MEAT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity instanceof DuskBison1Entity) {
			if (entity.isOnFire() || entity instanceof LivingEntity _livEnt37 && _livEnt37.hasEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get())) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.COOKED_DUSK_MEAT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.UNCOOKED_DUSK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
