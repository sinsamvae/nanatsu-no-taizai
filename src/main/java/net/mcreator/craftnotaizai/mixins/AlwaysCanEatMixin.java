package net.mcreator.craftnotaizai.mixins;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.player.Player;

@Mixin(Player.class)
public class AlwaysCanEatMixin {
	@Inject(method = "canEat", at = @At("HEAD"), cancellable = true)
	private void alwaysCanEat(boolean p_36392_, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}
