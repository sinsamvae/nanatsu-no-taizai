package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class EarthGolemOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		double ran = 0;
		if (!(null == (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null))) {
			entity.setCustomName(Component.literal(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getDisplayName().getString())));
			entity.getPersistentData().putDouble("BP",
					Math.ceil((entity.getPersistentData().getDouble("strength") + entity.getPersistentData().getDouble("Spirit") + entity.getPersistentData().getDouble("ManaDmg") + entity.getPersistentData().getDouble("Mana")) / 3));
			entity.getPersistentData().putDouble("strength", (Math.ceil(
					0.45 * ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength)
					+ 3));
			entity.getPersistentData().putDouble("CloneHealth", (Math.ceil(
					0.45 * ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth)
					+ 3));
			entity.getPersistentData().putDouble("Spirit",
					(Math.ceil(0.45
							* ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Spirit)
							+ 3));
			entity.getPersistentData().putDouble("Mana",
					(Math.ceil(0.45
							* ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxmana)
							+ 3));
			entity.getPersistentData().putDouble("ManaDmg", (Math.ceil(
					0.45 * ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack)
					+ 3));
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)) {
					if (entity instanceof Mob) {
						try {
							((Mob) entity).setTarget(null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
