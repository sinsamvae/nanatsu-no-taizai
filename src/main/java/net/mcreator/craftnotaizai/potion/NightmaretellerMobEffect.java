
package net.mcreator.craftnotaizai.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class NightmaretellerMobEffect extends MobEffect {
	public NightmaretellerMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
