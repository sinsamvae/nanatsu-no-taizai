package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

public class HyperRecoveryRightclicked2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double a = 0;
		double r = 0;
		double b = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 5, false, false));
		r = 1.5;
		a = Math.random() * 12;
		b = 90;
		for (int index0 = 0; index0 < 30; index0++) {
			for (int index1 = 0; index1 < 16; index1++) {
				world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.HEAL.get()), (x - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))), ((y + 1) - r * Math.sin(Math.toRadians(b))),
						(z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))), 0, 0, 0);
				b = b + 12;
			}
			b = 90;
			a = a + 12;
		}
		itemstack.shrink(1);
	}
}
