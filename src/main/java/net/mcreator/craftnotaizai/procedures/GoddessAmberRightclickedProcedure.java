package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.entity.SliverDemonEntity;
import net.mcreator.craftnotaizai.entity.RedDemonGeckolibEntity;
import net.mcreator.craftnotaizai.entity.GrayDemonEntityEntity;
import net.mcreator.craftnotaizai.entity.CopperDemonEntity;
import net.mcreator.craftnotaizai.entity.BlueDemonEntity;
import net.mcreator.craftnotaizai.entity.AlbionTallEntity;
import net.mcreator.craftnotaizai.entity.AlbionFatEntity;

import java.util.List;
import java.util.Comparator;

public class GoddessAmberRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof GrayDemonEntityEntity || entityiterator instanceof RedDemonGeckolibEntity || entityiterator instanceof AlbionTallEntity || entityiterator instanceof CopperDemonEntity
						|| entityiterator instanceof BlueDemonEntity || entityiterator instanceof SliverDemonEntity || entityiterator instanceof AlbionFatEntity) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.NEUTRAL, (float) 0.05, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.NEUTRAL, (float) 0.05, 1, false);
						}
					}
					if (!entityiterator.level().isClientSide())
						entityiterator.discard();
					itemstack.shrink(1);
				}
			}
		}
	}
}
