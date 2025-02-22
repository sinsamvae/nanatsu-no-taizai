package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntraceIstarCordsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Story).equals("Story37")
				&& !(entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).logic_cords) {
			{
				boolean _setval = true;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.logic_cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), (new Object() {
								public String getResult(Entity _ent, String _command) {
									StringBuilder _result = new StringBuilder();
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										CommandSource _dataConsumer = new CommandSource() {
											@Override
											public void sendSystemMessage(Component message) {
												_result.append(message.getString());
											}

											@Override
											public boolean acceptsSuccess() {
												return true;
											}

											@Override
											public boolean acceptsFailure() {
												return true;
											}

											@Override
											public boolean shouldInformAdmins() {
												return false;
											}
										};
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
												_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
									}
									return _result.toString();
								}
							}.getResult(entity, "locate structure craft_no_taizai:entrace_to_istar")));
				}
			}
			{
				String _setval = new Object() {
					public String getResult(Entity _ent, String _command) {
						StringBuilder _result = new StringBuilder();
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							CommandSource _dataConsumer = new CommandSource() {
								@Override
								public void sendSystemMessage(Component message) {
									_result.append(message.getString());
								}

								@Override
								public boolean acceptsSuccess() {
									return true;
								}

								@Override
								public boolean acceptsFailure() {
									return true;
								}

								@Override
								public boolean shouldInformAdmins() {
									return false;
								}
							};
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), _command);
						}
						return _result.toString();
					}
				}.getResult(entity, "locate structure craft_no_taizai:entrace_to_istar");
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.string_cords = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
