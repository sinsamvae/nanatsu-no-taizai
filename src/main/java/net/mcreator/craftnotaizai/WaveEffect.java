/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.mcreator.craftnotaizai as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.mcreator.craftnotaizai;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WaveEffect {
	public static void createShockwave(Level world, BlockPos center, int maxRadius, int damage) {
		for (int radius = 2; radius <= maxRadius; radius++) {
			for (BlockPos pos : getRing(center, radius)) {
				CraftNoTaizaiMod.queueServerWork(radius * 4, () -> {
					//Some Particles
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(pos.getX() + 0.5, (pos.getY() + 1.1), pos.getZ() + 0.5), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("/particle sweep_attack ~ ~ ~ 0 0 0 1 0 normal"));
					// Displace the block at the current position
					if (world.getBlockState(pos).getBlock() != Blocks.AIR) {
						if (!((world.getBlockState(pos)).getBlock() == Blocks.WATER) && !world.isEmptyBlock(pos)) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(pos.getX() + 0.5, (pos.getY()), pos.getZ() + 0.5), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("/summon falling_block ~ ~1 ~ {BlockState:{Name:\"" + "" + ForgeRegistries.BLOCKS.getKey((world.getBlockState(pos)).getBlock()).toString() + "\"},Time:1,Motion:[" + "0.0,"
												+ new java.text.DecimalFormat("##.##").format(0.2) + ",0.0" + "]}"));
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(pos.getX() + 0.5, (pos.getY()), pos.getZ() + 0.5), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("/fill ~ ~ ~ ~ ~ ~ air replace"));
						}
					}
					// Damage entities within the current position
					AABB aabb = new AABB(pos).inflate(0.5);
					for (Entity entity : world.getEntitiesOfClass(LivingEntity.class, aabb)) {
						if (entity instanceof Player) {
							continue;
						}
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), damage);
						entity.setDeltaMovement(entity.getDeltaMovement().x(), 1.1, entity.getDeltaMovement().z);
					}
				});
			}
		}
	}

	// Helper method to get a ring of blocks at a specific radius
	private static Iterable<BlockPos> getRing(BlockPos center, int radius) {
		List<BlockPos> positions = new ArrayList<>();
		for (int dx = -radius; dx <= radius; dx++) {
			for (int dz = -radius; dz <= radius; dz++) {
				if (Math.sqrt(dx * dx + dz * dz) >= radius - 0.5 && Math.sqrt(dx * dx + dz * dz) <= radius + 0.5) {
					positions.add(center.offset(dx, 0, dz));
				}
			}
		}
		return positions;
	}
}
