package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModGameRules;

import java.util.List;
import java.util.Comparator;

public class MerlinBossEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double drop = 0;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(65 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player && !(entityiterator == entity)) {
					{
						double _setval = ((entityiterator.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).xp
								+ Math.ceil(entityiterator.getPersistentData().getDouble("level")) * 0.5 + 800) * ((world.getLevelData().getGameRules().getInt(CraftNoTaizaiModGameRules.CRAFT_NO_TAIZAI_XP_AMOUNT)) / 10);
						entityiterator.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.xp = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
				if (entityiterator instanceof Player && !(entityiterator instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel
						&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("craft_no_taizai:defeat_merlin"))).isDone())) {
					if (entityiterator instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_no_taizai:defeat_merlin"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (!CraftNoTaizaiModVariables.MapVariables.get(world).Aldan) {
			drop = Mth.nextInt(RandomSource.create(), 1, 100);
			if (drop <= 15) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftNoTaizaiModItems.ALDAN.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).Aldan = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
