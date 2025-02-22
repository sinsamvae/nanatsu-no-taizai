package net.mcreator.craftnotaizai.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class FairyTreeSaplingsBoneMealSuccessConditionProcedure {
	public static boolean execute() {
		double random = 0;
		random = Mth.nextInt(RandomSource.create(), 1, 100);
		return random <= 35;
	}
}
