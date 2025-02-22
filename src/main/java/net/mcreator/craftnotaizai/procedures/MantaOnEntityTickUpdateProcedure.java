package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.entity.MantaEntity;

public class MantaOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		double MoveX = 0;
		double MoveZ = 0;
		if (entity instanceof MantaEntity == entity.isVehicle() && entity.getPersistentData().getBoolean("Montado") == true) {
			speed = 0.8;
			Yaw = entity.getYRot();
			MoveX = speed * Math.cos((Yaw + 90) * (Math.PI / 180));
			MoveZ = speed * Math.sin((Yaw + 90) * (Math.PI / 180));
			entity.setDeltaMovement(new Vec3(MoveX, (entity.getXRot() * (-0.03)), MoveZ));
		} else {
			if (entity.isVehicle() && !entity.getPersistentData().getBoolean("Montado")) {
				speed = 0;
				entity.setDeltaMovement(new Vec3(0, (entity.getPersistentData().getDouble("MoveY")), 0));
			}
		}
		if (entity instanceof MantaEntity == !entity.isVehicle()) {
			entity.setDeltaMovement(new Vec3(0, (-0.3), 0));
		}
	}
}
