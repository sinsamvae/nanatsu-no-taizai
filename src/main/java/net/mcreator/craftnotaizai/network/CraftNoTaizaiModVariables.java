package net.mcreator.craftnotaizai.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.function.Supplier;
import java.util.ArrayList;

import dev.kosmx.playerAnim.core.data.quarktool.Move;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftNoTaizaiModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CraftNoTaizaiMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		CraftNoTaizaiMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.level = original.level;
			clone.xp = original.xp;
			clone.TP = original.TP;
			clone.health = original.health;
			clone.maxhealth = original.maxhealth;
			clone.strength = original.strength;
			clone.Spirit = original.Spirit;
			clone.mana = original.mana;
			clone.maxmana = original.maxmana;
			clone.ManaAttack = original.ManaAttack;
			clone.Full_Counter_Use = original.Full_Counter_Use;
			clone.PlayerFirstJoins = original.PlayerFirstJoins;
			clone.Race = original.Race;
			clone.PurgatoryFire = original.PurgatoryFire;
			clone.heavy_metal = original.heavy_metal;
			clone.lightningarmor = original.lightningarmor;
			clone.heavy_armor = original.heavy_armor;
			clone.Transparency_Use = original.Transparency_Use;
			clone.magic = original.magic;
			clone.revengecounter = original.revengecounter;
			clone.PurgeAttack = original.PurgeAttack;
			clone.zerosign = original.zerosign;
			clone.storeddmg = original.storeddmg;
			clone.infinity_use = original.infinity_use;
			clone.BreakerOff = original.BreakerOff;
			clone.DemonMark = original.DemonMark;
			clone.berserkmode = original.berserkmode;
			clone.rCoolDown = original.rCoolDown;
			clone.PerfectShell = original.PerfectShell;
			clone.BP = original.BP;
			clone.immortality = original.immortality;
			clone.immortalityplayer = original.immortalityplayer;
			clone.forwardfly = original.forwardfly;
			clone.lokckedenity = original.lokckedenity;
			clone.range = original.range;
			clone.lock_on = original.lock_on;
			clone.target_lock = original.target_lock;
			clone.graydemonblood = original.graydemonblood;
			clone.humandemonmark = original.humandemonmark;
			clone.graydemonform = original.graydemonform;
			clone.AbsoluteCanel = original.AbsoluteCanel;
			clone.killroyale = original.killroyale;
			clone.redKill = original.redKill;
			clone.blueKill = original.blueKill;
			clone.mana_regen = original.mana_regen;
			clone.charging = original.charging;
			clone.mana_timer = original.mana_timer;
			clone.Levitation = original.Levitation;
			clone.WPressed = original.WPressed;
			clone.mana_drain = original.mana_drain;
			clone.attack_cd = original.attack_cd;
			clone.TPAmount = original.TPAmount;
			clone.TPSwitchAmount = original.TPSwitchAmount;
			clone.HalfAwaken = original.HalfAwaken;
			clone.Half = original.Half;
			clone.GravityTen = original.GravityTen;
			clone.HyperGravity = original.HyperGravity;
			clone.AbilitySelect = original.AbilitySelect;
			clone.Move = original.Move;
			clone.SlotSwitch = original.SlotSwitch;
			clone.Agility = original.Agility;
			clone.SpacePressed = original.SpacePressed;
			clone.learn_skill = original.learn_skill;
			clone.damage_indicator = original.damage_indicator;
			clone.reddemonboost = original.reddemonboost;
			clone.side_quest = original.side_quest;
			clone.Story = original.Story;
			clone.JackCD = original.JackCD;
			clone.CDJack = original.CDJack;
			clone.LostVayne = original.LostVayne;
			clone.the_one = original.the_one;
			clone.combostar = original.combostar;
			clone.combostarcounter = original.combostarcounter;
			clone.TheOneUltimate = original.TheOneUltimate;
			clone.combostartick = original.combostartick;
			clone.capitalofthedeadX = original.capitalofthedeadX;
			clone.capitalofthedeadY = original.capitalofthedeadY;
			clone.capitalofthedeadZ = original.capitalofthedeadZ;
			clone.hit = original.hit;
			clone.TrickStarX = original.TrickStarX;
			clone.TrickStarY = original.TrickStarY;
			clone.TrickStarZ = original.TrickStarZ;
			clone.FullSize = original.FullSize;
			clone.CriticalOver = original.CriticalOver;
			clone.Rhitta = original.Rhitta;
			clone.rhittatick = original.rhittatick;
			clone.TrickStarYaw = original.TrickStarYaw;
			clone.physical_full_counter = original.physical_full_counter;
			clone.FullPowerDemonMark = original.FullPowerDemonMark;
			clone.teleplortionX = original.teleplortionX;
			clone.teleplortionY = original.teleplortionY;
			clone.teleplortionZ = original.teleplortionZ;
			clone.MagicScroll = original.MagicScroll;
			clone.learn_skills = original.learn_skills;
			clone.learned_spells = original.learned_spells;
			clone.spells = original.spells;
			clone.yggdra_cloth = original.yggdra_cloth;
			clone.True_Spirt_From = original.True_Spirt_From;
			clone.mana_regen_effect = original.mana_regen_effect;
			clone.hard_protection = original.hard_protection;
			clone.learn_demon_skills = original.learn_demon_skills;
			clone.aqua_dress = original.aqua_dress;
			clone.Healing_Area = original.Healing_Area;
			clone.healing_area = original.healing_area;
			clone.healing_area_timer = original.healing_area_timer;
			clone.GoddessBless = original.GoddessBless;
			clone.goddessbless = original.goddessbless;
			clone.Gloxinia = original.Gloxinia;
			clone.yggdrasil_armor = original.yggdrasil_armor;
			clone.MagicDetection = original.MagicDetection;
			clone.fire_protection = original.fire_protection;
			clone.Emerald_Octo = original.Emerald_Octo;
			clone.drole_eye = original.drole_eye;
			clone.Moon_Rose = original.Moon_Rose;
			clone.fox_hunt = original.fox_hunt;
			clone.JubakuEnsaX = original.JubakuEnsaX;
			clone.JubakuEnsaY = original.JubakuEnsaY;
			clone.JubakuEnsaZ = original.JubakuEnsaZ;
			clone.JubakuEnsaTick = original.JubakuEnsaTick;
			clone.JubakuEnsa = original.JubakuEnsa;
			clone.God = original.God;
			clone.elizbethArk = original.elizbethArk;
			clone.commandment = original.commandment;
			clone.combostarhit = original.combostarhit;
			clone.manaFill = original.manaFill;
			clone.healthFill = original.healthFill;
			clone.Purgatory = original.Purgatory;
			clone.demonkingpower = original.demonkingpower;
			clone.demonkingpage = original.demonkingpage;
			clone.God_Chance = original.God_Chance;
			clone.ThunderGodsFlash = original.ThunderGodsFlash;
			clone.defeatRedDemon = original.defeatRedDemon;
			clone.DefeatGrayDemon = original.DefeatGrayDemon;
			clone.giantskills = original.giantskills;
			clone.monsterBlock0 = original.monsterBlock0;
			clone.monsterBlock1 = original.monsterBlock1;
			clone.monsterBlock2 = original.monsterBlock2;
			clone.monsterBlock3 = original.monsterBlock3;
			clone.monsterBlock4 = original.monsterBlock4;
			clone.monsterBlock5 = original.monsterBlock5;
			clone.monsterBlock6 = original.monsterBlock6;
			clone.monsterBlock7 = original.monsterBlock7;
			clone.monsterBlock8 = original.monsterBlock8;
			clone.Monsterblock0 = original.Monsterblock0;
			clone.Monsterblock1 = original.Monsterblock1;
			clone.Monsterblock2 = original.Monsterblock2;
			clone.Monsterblock3 = original.Monsterblock3;
			clone.Monsterblock4 = original.Monsterblock4;
			clone.Monsterblock5 = original.Monsterblock5;
			clone.Monsterblock6 = original.Monsterblock6;
			clone.Monsterblock7 = original.Monsterblock7;
			clone.Monsterblock8 = original.Monsterblock8;
			clone.sidequest = original.sidequest;
			clone.questamount = original.questamount;
			clone.istarX = original.istarX;
			clone.istarY = original.istarY;
			clone.istarZ = original.istarZ;
			clone.cave_of_training_timer = original.cave_of_training_timer;
			clone.training_kick = original.training_kick;
			clone.cave_of_training_cd = original.cave_of_training_cd;
			clone.cave_of_training = original.cave_of_training;
			clone.training_id = original.training_id;
			clone.tower_of_trails = original.tower_of_trails;
			clone.tower_of_trails_cooldown = original.tower_of_trails_cooldown;
			clone.istar_kills = original.istar_kills;
			clone.HighSpeedRegeneration = original.HighSpeedRegeneration;
			clone.agility_percentage_lower = original.agility_percentage_lower;
			clone.repose_timer = original.repose_timer;
			clone.repose = original.repose;
			clone.health_display = original.health_display;
			clone.guild_stack = original.guild_stack;
			clone.guild = original.guild;
			clone.guild_number = original.guild_number;
			clone.guild_leader = original.guild_leader;
			clone.possession = original.possession;
			clone.MagicalCounter = original.MagicalCounter;
			clone.power_percentage = original.power_percentage;
			clone.PerpetualReincarnation = original.PerpetualReincarnation;
			clone.EternalLife = original.EternalLife;
			clone.Possession_Switch = original.Possession_Switch;
			clone.Awaken = original.Awaken;
			clone.drole_dance = original.drole_dance;
			clone.strength_boost = original.strength_boost;
			clone.spirit_boost = original.spirit_boost;
			clone.maxmana_boost = original.maxmana_boost;
			clone.ManaAttack_boost = original.ManaAttack_boost;
			clone.agility_boost = original.agility_boost;
			clone.kill_earthcrawler = original.kill_earthcrawler;
			clone.freeze_saber = original.freeze_saber;
			clone.weapon_boost = original.weapon_boost;
			clone.purgatory_fire_overlay = original.purgatory_fire_overlay;
			clone.cost_amount = original.cost_amount;
			clone.the_ruler = original.the_ruler;
			clone.trainingX = original.trainingX;
			clone.trainingY = original.trainingY;
			clone.trainingZ = original.trainingZ;
			clone.demon_hearts = original.demon_hearts;
			clone.defeat_bluedemon = original.defeat_bluedemon;
			clone.demon = original.demon;
			clone.defeat_drole = original.defeat_drole;
			clone.defeat_gloxinia = original.defeat_gloxinia;
			clone.hunter_fest = original.hunter_fest;
			clone.physical_hunt = original.physical_hunt;
			clone.physical_hunt_strengh = original.physical_hunt_strengh;
			clone.physical_hunt_spirt = original.physical_hunt_spirt;
			clone.physical_hunt_speed = original.physical_hunt_speed;
			clone.physical_hunt_timer = original.physical_hunt_timer;
			clone.kill_demons = original.kill_demons;
			clone.logic_cords = original.logic_cords;
			clone.string_cords = original.string_cords;
			if (!event.isWasDeath()) {
				clone.jumbvar = original.jumbvar;
				clone.hijack = original.hijack;
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "craft_no_taizai_worldvars";
		public boolean zerotime = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			zerotime = nbt.getBoolean("zerotime");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("zerotime", zerotime);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "craft_no_taizai_mapvars";
		public boolean chastiefol = false;
		public boolean fairyking = false;
		public boolean choas = false;
		public boolean immortalityworld = false;
		public boolean courechouse = false;
		public boolean Gideon = false;
		public boolean TwinBowHerritt = false;
		public boolean Aldan = false;
		public boolean sunshine = false;
		public boolean fullcounter = false;
		public boolean full_counter = false;
		public boolean heat_fork = false;
		public boolean god = false;
		public boolean purgatory = false;
		public boolean Selflessness = false;
		public boolean Pacifism = false;
		public boolean Patience = false;
		public boolean Repose = false;
		public boolean Purity = false;
		public boolean Reticence = false;
		public boolean Faith = false;
		public boolean Truth = false;
		public boolean Love = false;
		public boolean Piety = false;
		public boolean lostvayne = false;
		public boolean rhitta = false;
		public boolean Istar = false;
		public boolean Basquias = false;
		public boolean fairy_kings = false;
		public boolean Reincarnation = false;
		public boolean eternallife = false;
		public boolean ReaperScythe = false;
		public boolean FlyingSaucer = false;
		public boolean StaffOfImprisonment = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			if (nbt == null) {
				nbt = save(new CompoundTag());
			}
			chastiefol = nbt.getBoolean("chastiefol");
			fairyking = nbt.getBoolean("fairyking");
			choas = nbt.getBoolean("choas");
			immortalityworld = nbt.getBoolean("immortalityworld");
			courechouse = nbt.getBoolean("courechouse");
			Gideon = nbt.getBoolean("Gideon");
			TwinBowHerritt = nbt.getBoolean("TwinBowHerritt");
			Aldan = nbt.getBoolean("Aldan");
			sunshine = nbt.getBoolean("sunshine");
			fullcounter = nbt.getBoolean("fullcounter");
			full_counter = nbt.getBoolean("full_counter");
			heat_fork = nbt.getBoolean("heat_fork");
			god = nbt.getBoolean("god");
			purgatory = nbt.getBoolean("purgatory");
			Selflessness = nbt.getBoolean("Selflessness");
			Pacifism = nbt.getBoolean("Pacifism");
			Patience = nbt.getBoolean("Patience");
			Repose = nbt.getBoolean("Repose");
			Purity = nbt.getBoolean("Purity");
			Reticence = nbt.getBoolean("Reticence");
			Faith = nbt.getBoolean("Faith");
			Truth = nbt.getBoolean("Truth");
			Love = nbt.getBoolean("Love");
			Piety = nbt.getBoolean("Piety");
			lostvayne = nbt.getBoolean("lostvayne");
			rhitta = nbt.getBoolean("rhitta");
			Istar = nbt.getBoolean("Istar");
			Basquias = nbt.getBoolean("Basquias");
			fairy_kings = nbt.getBoolean("fairy_kings");
			Reincarnation = nbt.getBoolean("Reincarnation");
			eternallife = nbt.getBoolean("eternallife");
			ReaperScythe = nbt.getBoolean("ReaperScythe");
			FlyingSaucer = nbt.getBoolean("FlyingSaucer");
			StaffOfImprisonment = nbt.getBoolean("StaffOfImprisonment");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("chastiefol", chastiefol);
			nbt.putBoolean("fairyking", fairyking);
			nbt.putBoolean("choas", choas);
			nbt.putBoolean("immortalityworld", immortalityworld);
			nbt.putBoolean("courechouse", courechouse);
			nbt.putBoolean("Gideon", Gideon);
			nbt.putBoolean("TwinBowHerritt", TwinBowHerritt);
			nbt.putBoolean("Aldan", Aldan);
			nbt.putBoolean("sunshine", sunshine);
			nbt.putBoolean("fullcounter", fullcounter);
			nbt.putBoolean("full_counter", full_counter);
			nbt.putBoolean("heat_fork", heat_fork);
			nbt.putBoolean("god", god);
			nbt.putBoolean("purgatory", purgatory);
			nbt.putBoolean("Selflessness", Selflessness);
			nbt.putBoolean("Pacifism", Pacifism);
			nbt.putBoolean("Patience", Patience);
			nbt.putBoolean("Repose", Repose);
			nbt.putBoolean("Purity", Purity);
			nbt.putBoolean("Reticence", Reticence);
			nbt.putBoolean("Faith", Faith);
			nbt.putBoolean("Truth", Truth);
			nbt.putBoolean("Love", Love);
			nbt.putBoolean("Piety", Piety);
			nbt.putBoolean("lostvayne", lostvayne);
			nbt.putBoolean("rhitta", rhitta);
			nbt.putBoolean("Istar", Istar);
			nbt.putBoolean("Basquias", Basquias);
			nbt.putBoolean("fairy_kings", fairy_kings);
			nbt.putBoolean("Reincarnation", Reincarnation);
			nbt.putBoolean("eternallife", eternallife);
			nbt.putBoolean("ReaperScythe", ReaperScythe);
			nbt.putBoolean("FlyingSaucer", FlyingSaucer);
			nbt.putBoolean("StaffOfImprisonment", StaffOfImprisonment);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("craft_no_taizai", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double level = 1.0;
		public double xp = 0;
		public double TP = 0;
		public double health = 0;
		public double maxhealth = 15.0;
		public double strength = 0;
		public double Spirit = 0;
		public double mana = 0;
		public double maxmana = 0;
		public double ManaAttack = 0;
		public boolean Full_Counter_Use = false;
		public boolean PlayerFirstJoins = false;
		public String Race = "\"\"";
		public boolean PurgatoryFire = false;
		public boolean heavy_metal = false;
		public boolean lightningarmor = false;
		public double heavy_armor = 0;
		public boolean Transparency_Use = false;
		public String magic = "\"\"";
		public boolean revengecounter = false;
		public boolean PurgeAttack = false;
		public boolean zerosign = false;
		public double storeddmg = 0;
		public boolean infinity_use = false;
		public boolean BreakerOff = false;
		public boolean DemonMark = false;
		public boolean berserkmode = false;
		public double rCoolDown = 0;
		public boolean PerfectShell = false;
		public double BP = 0;
		public boolean immortality = false;
		public boolean immortalityplayer = false;
		public boolean forwardfly = false;
		public String lokckedenity = "\"\"";
		public double range = 0;
		public boolean jumbvar = false;
		public boolean lock_on = false;
		public String target_lock = "\"\"";
		public boolean graydemonblood = false;
		public boolean humandemonmark = false;
		public boolean graydemonform = false;
		public boolean AbsoluteCanel = false;
		public double killroyale = 0;
		public double redKill = 0;
		public double blueKill = 0;
		public double mana_regen = 0;
		public boolean charging = false;
		public double mana_timer = 0;
		public boolean Levitation = false;
		public boolean WPressed = false;
		public double mana_drain = 0;
		public double attack_cd = 0;
		public double TPAmount = 0;
		public double TPSwitchAmount = 0;
		public double HalfAwaken = 0;
		public boolean Half = false;
		public boolean GravityTen = false;
		public boolean HyperGravity = false;
		public ItemStack AbilitySelect = ItemStack.EMPTY;
		public double Move = 0;
		public double SlotSwitch = 0.0;
		public double Agility = 0;
		public boolean SpacePressed = false;
		public ItemStack learn_skill = ItemStack.EMPTY;
		public boolean damage_indicator = false;
		public boolean reddemonboost = false;
		public String side_quest = "\"\"";
		public String Story = "\"\"";
		public double JackCD = 0;
		public double CDJack = 0;
		public double LostVayne = 0;
		public boolean the_one = false;
		public boolean combostar = false;
		public double combostarcounter = 0;
		public boolean TheOneUltimate = false;
		public double combostartick = 0;
		public double capitalofthedeadX = 0;
		public double capitalofthedeadY = 0;
		public double capitalofthedeadZ = 0;
		public double hit = 0;
		public double TrickStarX = 0;
		public double TrickStarY = 0;
		public double TrickStarZ = 0;
		public boolean FullSize = false;
		public boolean CriticalOver = false;
		public double Rhitta = 0;
		public double rhittatick = 0;
		public double TrickStarYaw = 0;
		public boolean physical_full_counter = false;
		public boolean FullPowerDemonMark = false;
		public double teleplortionX = 0;
		public double teleplortionY = 0;
		public double teleplortionZ = 0;
		public double MagicScroll = 0;
		public boolean learn_skills = false;
		public double learned_spells = 0;
		public double spells = 0;
		public boolean yggdra_cloth = false;
		public boolean True_Spirt_From = false;
		public double mana_regen_effect = 0;
		public boolean hard_protection = false;
		public boolean learn_demon_skills = false;
		public boolean aqua_dress = false;
		public boolean Healing_Area = false;
		public double healing_area = 0;
		public double healing_area_timer = 0;
		public boolean GoddessBless = false;
		public double goddessbless = 0;
		public boolean Gloxinia = false;
		public boolean yggdrasil_armor = false;
		public boolean MagicDetection = false;
		public boolean fire_protection = false;
		public boolean Emerald_Octo = false;
		public boolean drole_eye = false;
		public double Moon_Rose = 0;
		public double fox_hunt = 0;
		public double JubakuEnsaX = 0;
		public double JubakuEnsaY = 0;
		public double JubakuEnsaZ = 0;
		public double JubakuEnsaTick = 0;
		public boolean JubakuEnsa = false;
		public boolean God = false;
		public boolean elizbethArk = false;
		public String commandment = "";
		public double combostarhit = 1.0;
		public double manaFill = 0;
		public double healthFill = 0;
		public boolean Purgatory = false;
		public boolean demonkingpower = false;
		public boolean demonkingpage = false;
		public boolean God_Chance = false;
		public boolean ThunderGodsFlash = false;
		public double defeatRedDemon = 0;
		public double DefeatGrayDemon = 0;
		public double giantskills = 0;
		public ItemStack monsterBlock0 = ItemStack.EMPTY;
		public ItemStack monsterBlock1 = ItemStack.EMPTY;
		public ItemStack monsterBlock2 = ItemStack.EMPTY;
		public ItemStack monsterBlock3 = ItemStack.EMPTY;
		public ItemStack monsterBlock4 = ItemStack.EMPTY;
		public ItemStack monsterBlock5 = ItemStack.EMPTY;
		public ItemStack monsterBlock6 = ItemStack.EMPTY;
		public ItemStack monsterBlock7 = ItemStack.EMPTY;
		public ItemStack monsterBlock8 = ItemStack.EMPTY;
		public double Monsterblock0 = 0;
		public double Monsterblock1 = 0;
		public double Monsterblock2 = 0;
		public double Monsterblock3 = 0;
		public double Monsterblock4 = 0;
		public double Monsterblock5 = 0;
		public double Monsterblock6 = 0;
		public double Monsterblock7 = 0;
		public double Monsterblock8 = 0;
		public ItemStack sidequest = ItemStack.EMPTY;
		public double questamount = 0;
		public double istarX = 0;
		public double istarY = 0;
		public double istarZ = 0;
		public double cave_of_training_timer = 0;
		public double training_kick = 0;
		public double cave_of_training_cd = 0;
		public boolean cave_of_training = false;
		public double training_id = 0;
		public boolean tower_of_trails = false;
		public double tower_of_trails_cooldown = 0;
		public double istar_kills = 0;
		public boolean hijack = false;
		public boolean HighSpeedRegeneration = false;
		public double agility_percentage_lower = 0;
		public double repose_timer = 0;
		public double repose = 0;
		public boolean health_display = false;
		public ItemStack guild_stack = ItemStack.EMPTY;
		public String guild = "";
		public double guild_number = 0;
		public boolean guild_leader = false;
		public boolean possession = false;
		public boolean MagicalCounter = false;
		public double power_percentage = 0.0;
		public boolean PerpetualReincarnation = false;
		public boolean EternalLife = false;
		public boolean Possession_Switch = false;
		public boolean Awaken = false;
		public boolean drole_dance = false;
		public double strength_boost = 0;
		public double spirit_boost = 0;
		public double maxmana_boost = 0;
		public double ManaAttack_boost = 0;
		public double agility_boost = 0;
		public double kill_earthcrawler = 0;
		public boolean freeze_saber = false;
		public double weapon_boost = 0;
		public boolean purgatory_fire_overlay = false;
		public double cost_amount = 0;
		public boolean the_ruler = false;
		public double trainingX = 0;
		public double trainingY = 0;
		public double trainingZ = 0;
		public double demon_hearts = 0;
		public double defeat_bluedemon = 0;
		public boolean demon = false;
		public double defeat_drole = 0;
		public double defeat_gloxinia = 0;
		public boolean hunter_fest = false;
		public double physical_hunt = 0;
		public double physical_hunt_strengh = 0;
		public double physical_hunt_spirt = 0;
		public double physical_hunt_speed = 0;
		public double physical_hunt_timer = 0;
		public double kill_demons = 0;
		public boolean logic_cords = false;
		public String string_cords = "";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CraftNoTaizaiMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("level", level);
			nbt.putDouble("xp", xp);
			nbt.putDouble("TP", TP);
			nbt.putDouble("health", health);
			nbt.putDouble("maxhealth", maxhealth);
			nbt.putDouble("strength", strength);
			nbt.putDouble("Spirit", Spirit);
			nbt.putDouble("mana", mana);
			nbt.putDouble("maxmana", maxmana);
			nbt.putDouble("ManaAttack", ManaAttack);
			nbt.putBoolean("Full_Counter_Use", Full_Counter_Use);
			nbt.putBoolean("PlayerFirstJoins", PlayerFirstJoins);
			nbt.putString("Race", Race);
			nbt.putBoolean("PurgatoryFire", PurgatoryFire);
			nbt.putBoolean("heavy_metal", heavy_metal);
			nbt.putBoolean("lightningarmor", lightningarmor);
			nbt.putDouble("heavy_armor", heavy_armor);
			nbt.putBoolean("Transparency_Use", Transparency_Use);
			nbt.putString("magic", magic);
			nbt.putBoolean("revengecounter", revengecounter);
			nbt.putBoolean("PurgeAttack", PurgeAttack);
			nbt.putBoolean("zerosign", zerosign);
			nbt.putDouble("storeddmg", storeddmg);
			nbt.putBoolean("infinity_use", infinity_use);
			nbt.putBoolean("BreakerOff", BreakerOff);
			nbt.putBoolean("DemonMark", DemonMark);
			nbt.putBoolean("berserkmode", berserkmode);
			nbt.putDouble("rCoolDown", rCoolDown);
			nbt.putBoolean("PerfectShell", PerfectShell);
			nbt.putDouble("BP", BP);
			nbt.putBoolean("immortality", immortality);
			nbt.putBoolean("immortalityplayer", immortalityplayer);
			nbt.putBoolean("forwardfly", forwardfly);
			nbt.putString("lokckedenity", lokckedenity);
			nbt.putDouble("range", range);
			nbt.putBoolean("jumbvar", jumbvar);
			nbt.putBoolean("lock_on", lock_on);
			nbt.putString("target_lock", target_lock);
			nbt.putBoolean("graydemonblood", graydemonblood);
			nbt.putBoolean("humandemonmark", humandemonmark);
			nbt.putBoolean("graydemonform", graydemonform);
			nbt.putBoolean("AbsoluteCanel", AbsoluteCanel);
			nbt.putDouble("killroyale", killroyale);
			nbt.putDouble("redKill", redKill);
			nbt.putDouble("blueKill", blueKill);
			nbt.putDouble("mana_regen", mana_regen);
			nbt.putBoolean("charging", charging);
			nbt.putDouble("mana_timer", mana_timer);
			nbt.putBoolean("Levitation", Levitation);
			nbt.putBoolean("WPressed", WPressed);
			nbt.putDouble("mana_drain", mana_drain);
			nbt.putDouble("attack_cd", attack_cd);
			nbt.putDouble("TPAmount", TPAmount);
			nbt.putDouble("TPSwitchAmount", TPSwitchAmount);
			nbt.putDouble("HalfAwaken", HalfAwaken);
			nbt.putBoolean("Half", Half);
			nbt.putBoolean("GravityTen", GravityTen);
			nbt.putBoolean("HyperGravity", HyperGravity);
			nbt.put("AbilitySelect", AbilitySelect.save(new CompoundTag()));
			nbt.putDouble("Move", Move);
			nbt.putDouble("SlotSwitch", SlotSwitch);
			nbt.putDouble("Agility", Agility);
			nbt.putBoolean("SpacePressed", SpacePressed);
			nbt.put("learn_skill", learn_skill.save(new CompoundTag()));
			nbt.putBoolean("damage_indicator", damage_indicator);
			nbt.putBoolean("reddemonboost", reddemonboost);
			nbt.putString("side_quest", side_quest);
			nbt.putString("Story", Story);
			nbt.putDouble("JackCD", JackCD);
			nbt.putDouble("CDJack", CDJack);
			nbt.putDouble("LostVayne", LostVayne);
			nbt.putBoolean("the_one", the_one);
			nbt.putBoolean("combostar", combostar);
			nbt.putDouble("combostarcounter", combostarcounter);
			nbt.putBoolean("TheOneUltimate", TheOneUltimate);
			nbt.putDouble("combostartick", combostartick);
			nbt.putDouble("capitalofthedeadX", capitalofthedeadX);
			nbt.putDouble("capitalofthedeadY", capitalofthedeadY);
			nbt.putDouble("capitalofthedeadZ", capitalofthedeadZ);
			nbt.putDouble("hit", hit);
			nbt.putDouble("TrickStarX", TrickStarX);
			nbt.putDouble("TrickStarY", TrickStarY);
			nbt.putDouble("TrickStarZ", TrickStarZ);
			nbt.putBoolean("FullSize", FullSize);
			nbt.putBoolean("CriticalOver", CriticalOver);
			nbt.putDouble("Rhitta", Rhitta);
			nbt.putDouble("rhittatick", rhittatick);
			nbt.putDouble("TrickStarYaw", TrickStarYaw);
			nbt.putBoolean("physical_full_counter", physical_full_counter);
			nbt.putBoolean("FullPowerDemonMark", FullPowerDemonMark);
			nbt.putDouble("teleplortionX", teleplortionX);
			nbt.putDouble("teleplortionY", teleplortionY);
			nbt.putDouble("teleplortionZ", teleplortionZ);
			nbt.putDouble("MagicScroll", MagicScroll);
			nbt.putBoolean("learn_skills", learn_skills);
			nbt.putDouble("learned_spells", learned_spells);
			nbt.putDouble("spells", spells);
			nbt.putBoolean("yggdra_cloth", yggdra_cloth);
			nbt.putBoolean("True_Spirt_From", True_Spirt_From);
			nbt.putDouble("mana_regen_effect", mana_regen_effect);
			nbt.putBoolean("hard_protection", hard_protection);
			nbt.putBoolean("learn_demon_skills", learn_demon_skills);
			nbt.putBoolean("aqua_dress", aqua_dress);
			nbt.putBoolean("Healing_Area", Healing_Area);
			nbt.putDouble("healing_area", healing_area);
			nbt.putDouble("healing_area_timer", healing_area_timer);
			nbt.putBoolean("GoddessBless", GoddessBless);
			nbt.putDouble("goddessbless", goddessbless);
			nbt.putBoolean("Gloxinia", Gloxinia);
			nbt.putBoolean("yggdrasil_armor", yggdrasil_armor);
			nbt.putBoolean("MagicDetection", MagicDetection);
			nbt.putBoolean("fire_protection", fire_protection);
			nbt.putBoolean("Emerald_Octo", Emerald_Octo);
			nbt.putBoolean("drole_eye", drole_eye);
			nbt.putDouble("Moon_Rose", Moon_Rose);
			nbt.putDouble("fox_hunt", fox_hunt);
			nbt.putDouble("JubakuEnsaX", JubakuEnsaX);
			nbt.putDouble("JubakuEnsaY", JubakuEnsaY);
			nbt.putDouble("JubakuEnsaZ", JubakuEnsaZ);
			nbt.putDouble("JubakuEnsaTick", JubakuEnsaTick);
			nbt.putBoolean("JubakuEnsa", JubakuEnsa);
			nbt.putBoolean("God", God);
			nbt.putBoolean("elizbethArk", elizbethArk);
			nbt.putString("commandment", commandment);
			nbt.putDouble("combostarhit", combostarhit);
			nbt.putDouble("manaFill", manaFill);
			nbt.putDouble("healthFill", healthFill);
			nbt.putBoolean("Purgatory", Purgatory);
			nbt.putBoolean("demonkingpower", demonkingpower);
			nbt.putBoolean("demonkingpage", demonkingpage);
			nbt.putBoolean("God_Chance", God_Chance);
			nbt.putBoolean("ThunderGodsFlash", ThunderGodsFlash);
			nbt.putDouble("defeatRedDemon", defeatRedDemon);
			nbt.putDouble("DefeatGrayDemon", DefeatGrayDemon);
			nbt.putDouble("giantskills", giantskills);
			nbt.put("monsterBlock0", monsterBlock0.save(new CompoundTag()));
			nbt.put("monsterBlock1", monsterBlock1.save(new CompoundTag()));
			nbt.put("monsterBlock2", monsterBlock2.save(new CompoundTag()));
			nbt.put("monsterBlock3", monsterBlock3.save(new CompoundTag()));
			nbt.put("monsterBlock4", monsterBlock4.save(new CompoundTag()));
			nbt.put("monsterBlock5", monsterBlock5.save(new CompoundTag()));
			nbt.put("monsterBlock6", monsterBlock6.save(new CompoundTag()));
			nbt.put("monsterBlock7", monsterBlock7.save(new CompoundTag()));
			nbt.put("monsterBlock8", monsterBlock8.save(new CompoundTag()));
			nbt.putDouble("Monsterblock0", Monsterblock0);
			nbt.putDouble("Monsterblock1", Monsterblock1);
			nbt.putDouble("Monsterblock2", Monsterblock2);
			nbt.putDouble("Monsterblock3", Monsterblock3);
			nbt.putDouble("Monsterblock4", Monsterblock4);
			nbt.putDouble("Monsterblock5", Monsterblock5);
			nbt.putDouble("Monsterblock6", Monsterblock6);
			nbt.putDouble("Monsterblock7", Monsterblock7);
			nbt.putDouble("Monsterblock8", Monsterblock8);
			nbt.put("sidequest", sidequest.save(new CompoundTag()));
			nbt.putDouble("questamount", questamount);
			nbt.putDouble("istarX", istarX);
			nbt.putDouble("istarY", istarY);
			nbt.putDouble("istarZ", istarZ);
			nbt.putDouble("cave_of_training_timer", cave_of_training_timer);
			nbt.putDouble("training_kick", training_kick);
			nbt.putDouble("cave_of_training_cd", cave_of_training_cd);
			nbt.putBoolean("cave_of_training", cave_of_training);
			nbt.putDouble("training_id", training_id);
			nbt.putBoolean("tower_of_trails", tower_of_trails);
			nbt.putDouble("tower_of_trails_cooldown", tower_of_trails_cooldown);
			nbt.putDouble("istar_kills", istar_kills);
			nbt.putBoolean("hijack", hijack);
			nbt.putBoolean("HighSpeedRegeneration", HighSpeedRegeneration);
			nbt.putDouble("agility_percentage_lower", agility_percentage_lower);
			nbt.putDouble("repose_timer", repose_timer);
			nbt.putDouble("repose", repose);
			nbt.putBoolean("health_display", health_display);
			nbt.put("guild_stack", guild_stack.save(new CompoundTag()));
			nbt.putString("guild", guild);
			nbt.putDouble("guild_number", guild_number);
			nbt.putBoolean("guild_leader", guild_leader);
			nbt.putBoolean("possession", possession);
			nbt.putBoolean("MagicalCounter", MagicalCounter);
			nbt.putDouble("power_percentage", power_percentage);
			nbt.putBoolean("PerpetualReincarnation", PerpetualReincarnation);
			nbt.putBoolean("EternalLife", EternalLife);
			nbt.putBoolean("Possession_Switch", Possession_Switch);
			nbt.putBoolean("Awaken", Awaken);
			nbt.putBoolean("drole_dance", drole_dance);
			nbt.putDouble("strength_boost", strength_boost);
			nbt.putDouble("spirit_boost", spirit_boost);
			nbt.putDouble("maxmana_boost", maxmana_boost);
			nbt.putDouble("ManaAttack_boost", ManaAttack_boost);
			nbt.putDouble("agility_boost", agility_boost);
			nbt.putDouble("kill_earthcrawler", kill_earthcrawler);
			nbt.putBoolean("freeze_saber", freeze_saber);
			nbt.putDouble("weapon_boost", weapon_boost);
			nbt.putBoolean("purgatory_fire_overlay", purgatory_fire_overlay);
			nbt.putDouble("cost_amount", cost_amount);
			nbt.putBoolean("the_ruler", the_ruler);
			nbt.putDouble("trainingX", trainingX);
			nbt.putDouble("trainingY", trainingY);
			nbt.putDouble("trainingZ", trainingZ);
			nbt.putDouble("demon_hearts", demon_hearts);
			nbt.putDouble("defeat_bluedemon", defeat_bluedemon);
			nbt.putBoolean("demon", demon);
			nbt.putDouble("defeat_drole", defeat_drole);
			nbt.putDouble("defeat_gloxinia", defeat_gloxinia);
			nbt.putBoolean("hunter_fest", hunter_fest);
			nbt.putDouble("physical_hunt", physical_hunt);
			nbt.putDouble("physical_hunt_strengh", physical_hunt_strengh);
			nbt.putDouble("physical_hunt_spirt", physical_hunt_spirt);
			nbt.putDouble("physical_hunt_speed", physical_hunt_speed);
			nbt.putDouble("physical_hunt_timer", physical_hunt_timer);
			nbt.putDouble("kill_demons", kill_demons);
			nbt.putBoolean("logic_cords", logic_cords);
			nbt.putString("string_cords", string_cords);
			return nbt;
		}

		public void readNBT(Tag tag) {
			if (tag == null) {
				tag = writeNBT();
			}
			CompoundTag nbt = (CompoundTag) tag;
			if (nbt == null) {
				nbt = (CompoundTag) writeNBT();
			}
			level = nbt.getDouble("level");
			xp = nbt.getDouble("xp");
			TP = nbt.getDouble("TP");
			health = nbt.getDouble("health");
			maxhealth = nbt.getDouble("maxhealth");
			strength = nbt.getDouble("strength");
			Spirit = nbt.getDouble("Spirit");
			mana = nbt.getDouble("mana");
			maxmana = nbt.getDouble("maxmana");
			ManaAttack = nbt.getDouble("ManaAttack");
			Full_Counter_Use = nbt.getBoolean("Full_Counter_Use");
			PlayerFirstJoins = nbt.getBoolean("PlayerFirstJoins");
			Race = nbt.getString("Race");
			PurgatoryFire = nbt.getBoolean("PurgatoryFire");
			heavy_metal = nbt.getBoolean("heavy_metal");
			lightningarmor = nbt.getBoolean("lightningarmor");
			heavy_armor = nbt.getDouble("heavy_armor");
			Transparency_Use = nbt.getBoolean("Transparency_Use");
			magic = nbt.getString("magic");
			revengecounter = nbt.getBoolean("revengecounter");
			PurgeAttack = nbt.getBoolean("PurgeAttack");
			zerosign = nbt.getBoolean("zerosign");
			storeddmg = nbt.getDouble("storeddmg");
			infinity_use = nbt.getBoolean("infinity_use");
			BreakerOff = nbt.getBoolean("BreakerOff");
			DemonMark = nbt.getBoolean("DemonMark");
			berserkmode = nbt.getBoolean("berserkmode");
			rCoolDown = nbt.getDouble("rCoolDown");
			PerfectShell = nbt.getBoolean("PerfectShell");
			BP = nbt.getDouble("BP");
			immortality = nbt.getBoolean("immortality");
			immortalityplayer = nbt.getBoolean("immortalityplayer");
			forwardfly = nbt.getBoolean("forwardfly");
			lokckedenity = nbt.getString("lokckedenity");
			range = nbt.getDouble("range");
			jumbvar = nbt.getBoolean("jumbvar");
			lock_on = nbt.getBoolean("lock_on");
			target_lock = nbt.getString("target_lock");
			graydemonblood = nbt.getBoolean("graydemonblood");
			humandemonmark = nbt.getBoolean("humandemonmark");
			graydemonform = nbt.getBoolean("graydemonform");
			AbsoluteCanel = nbt.getBoolean("AbsoluteCanel");
			killroyale = nbt.getDouble("killroyale");
			redKill = nbt.getDouble("redKill");
			blueKill = nbt.getDouble("blueKill");
			mana_regen = nbt.getDouble("mana_regen");
			charging = nbt.getBoolean("charging");
			mana_timer = nbt.getDouble("mana_timer");
			Levitation = nbt.getBoolean("Levitation");
			WPressed = nbt.getBoolean("WPressed");
			mana_drain = nbt.getDouble("mana_drain");
			attack_cd = nbt.getDouble("attack_cd");
			TPAmount = nbt.getDouble("TPAmount");
			TPSwitchAmount = nbt.getDouble("TPSwitchAmount");
			HalfAwaken = nbt.getDouble("HalfAwaken");
			Half = nbt.getBoolean("Half");
			GravityTen = nbt.getBoolean("GravityTen");
			HyperGravity = nbt.getBoolean("HyperGravity");
			AbilitySelect = ItemStack.of(nbt.getCompound("AbilitySelect"));
			Move = nbt.getDouble("Move");
			SlotSwitch = nbt.getDouble("SlotSwitch");
			Agility = nbt.getDouble("Agility");
			SpacePressed = nbt.getBoolean("SpacePressed");
			learn_skill = ItemStack.of(nbt.getCompound("learn_skill"));
			damage_indicator = nbt.getBoolean("damage_indicator");
			reddemonboost = nbt.getBoolean("reddemonboost");
			side_quest = nbt.getString("side_quest");
			Story = nbt.getString("Story");
			JackCD = nbt.getDouble("JackCD");
			CDJack = nbt.getDouble("CDJack");
			LostVayne = nbt.getDouble("LostVayne");
			the_one = nbt.getBoolean("the_one");
			combostar = nbt.getBoolean("combostar");
			combostarcounter = nbt.getDouble("combostarcounter");
			TheOneUltimate = nbt.getBoolean("TheOneUltimate");
			combostartick = nbt.getDouble("combostartick");
			capitalofthedeadX = nbt.getDouble("capitalofthedeadX");
			capitalofthedeadY = nbt.getDouble("capitalofthedeadY");
			capitalofthedeadZ = nbt.getDouble("capitalofthedeadZ");
			hit = nbt.getDouble("hit");
			TrickStarX = nbt.getDouble("TrickStarX");
			TrickStarY = nbt.getDouble("TrickStarY");
			TrickStarZ = nbt.getDouble("TrickStarZ");
			FullSize = nbt.getBoolean("FullSize");
			CriticalOver = nbt.getBoolean("CriticalOver");
			Rhitta = nbt.getDouble("Rhitta");
			rhittatick = nbt.getDouble("rhittatick");
			TrickStarYaw = nbt.getDouble("TrickStarYaw");
			physical_full_counter = nbt.getBoolean("physical_full_counter");
			FullPowerDemonMark = nbt.getBoolean("FullPowerDemonMark");
			teleplortionX = nbt.getDouble("teleplortionX");
			teleplortionY = nbt.getDouble("teleplortionY");
			teleplortionZ = nbt.getDouble("teleplortionZ");
			MagicScroll = nbt.getDouble("MagicScroll");
			learn_skills = nbt.getBoolean("learn_skills");
			learned_spells = nbt.getDouble("learned_spells");
			spells = nbt.getDouble("spells");
			yggdra_cloth = nbt.getBoolean("yggdra_cloth");
			True_Spirt_From = nbt.getBoolean("True_Spirt_From");
			mana_regen_effect = nbt.getDouble("mana_regen_effect");
			hard_protection = nbt.getBoolean("hard_protection");
			learn_demon_skills = nbt.getBoolean("learn_demon_skills");
			aqua_dress = nbt.getBoolean("aqua_dress");
			Healing_Area = nbt.getBoolean("Healing_Area");
			healing_area = nbt.getDouble("healing_area");
			healing_area_timer = nbt.getDouble("healing_area_timer");
			GoddessBless = nbt.getBoolean("GoddessBless");
			goddessbless = nbt.getDouble("goddessbless");
			Gloxinia = nbt.getBoolean("Gloxinia");
			yggdrasil_armor = nbt.getBoolean("yggdrasil_armor");
			MagicDetection = nbt.getBoolean("MagicDetection");
			fire_protection = nbt.getBoolean("fire_protection");
			Emerald_Octo = nbt.getBoolean("Emerald_Octo");
			drole_eye = nbt.getBoolean("drole_eye");
			Moon_Rose = nbt.getDouble("Moon_Rose");
			fox_hunt = nbt.getDouble("fox_hunt");
			JubakuEnsaX = nbt.getDouble("JubakuEnsaX");
			JubakuEnsaY = nbt.getDouble("JubakuEnsaY");
			JubakuEnsaZ = nbt.getDouble("JubakuEnsaZ");
			JubakuEnsaTick = nbt.getDouble("JubakuEnsaTick");
			JubakuEnsa = nbt.getBoolean("JubakuEnsa");
			God = nbt.getBoolean("God");
			elizbethArk = nbt.getBoolean("elizbethArk");
			commandment = nbt.getString("commandment");
			combostarhit = nbt.getDouble("combostarhit");
			manaFill = nbt.getDouble("manaFill");
			healthFill = nbt.getDouble("healthFill");
			Purgatory = nbt.getBoolean("Purgatory");
			demonkingpower = nbt.getBoolean("demonkingpower");
			demonkingpage = nbt.getBoolean("demonkingpage");
			God_Chance = nbt.getBoolean("God_Chance");
			ThunderGodsFlash = nbt.getBoolean("ThunderGodsFlash");
			defeatRedDemon = nbt.getDouble("defeatRedDemon");
			DefeatGrayDemon = nbt.getDouble("DefeatGrayDemon");
			giantskills = nbt.getDouble("giantskills");
			monsterBlock0 = ItemStack.of(nbt.getCompound("monsterBlock0"));
			monsterBlock1 = ItemStack.of(nbt.getCompound("monsterBlock1"));
			monsterBlock2 = ItemStack.of(nbt.getCompound("monsterBlock2"));
			monsterBlock3 = ItemStack.of(nbt.getCompound("monsterBlock3"));
			monsterBlock4 = ItemStack.of(nbt.getCompound("monsterBlock4"));
			monsterBlock5 = ItemStack.of(nbt.getCompound("monsterBlock5"));
			monsterBlock6 = ItemStack.of(nbt.getCompound("monsterBlock6"));
			monsterBlock7 = ItemStack.of(nbt.getCompound("monsterBlock7"));
			monsterBlock8 = ItemStack.of(nbt.getCompound("monsterBlock8"));
			Monsterblock0 = nbt.getDouble("Monsterblock0");
			Monsterblock1 = nbt.getDouble("Monsterblock1");
			Monsterblock2 = nbt.getDouble("Monsterblock2");
			Monsterblock3 = nbt.getDouble("Monsterblock3");
			Monsterblock4 = nbt.getDouble("Monsterblock4");
			Monsterblock5 = nbt.getDouble("Monsterblock5");
			Monsterblock6 = nbt.getDouble("Monsterblock6");
			Monsterblock7 = nbt.getDouble("Monsterblock7");
			Monsterblock8 = nbt.getDouble("Monsterblock8");
			sidequest = ItemStack.of(nbt.getCompound("sidequest"));
			questamount = nbt.getDouble("questamount");
			istarX = nbt.getDouble("istarX");
			istarY = nbt.getDouble("istarY");
			istarZ = nbt.getDouble("istarZ");
			cave_of_training_timer = nbt.getDouble("cave_of_training_timer");
			training_kick = nbt.getDouble("training_kick");
			cave_of_training_cd = nbt.getDouble("cave_of_training_cd");
			cave_of_training = nbt.getBoolean("cave_of_training");
			training_id = nbt.getDouble("training_id");
			tower_of_trails = nbt.getBoolean("tower_of_trails");
			tower_of_trails_cooldown = nbt.getDouble("tower_of_trails_cooldown");
			istar_kills = nbt.getDouble("istar_kills");
			hijack = nbt.getBoolean("hijack");
			HighSpeedRegeneration = nbt.getBoolean("HighSpeedRegeneration");
			agility_percentage_lower = nbt.getDouble("agility_percentage_lower");
			repose_timer = nbt.getDouble("repose_timer");
			repose = nbt.getDouble("repose");
			health_display = nbt.getBoolean("health_display");
			guild_stack = ItemStack.of(nbt.getCompound("guild_stack"));
			guild = nbt.getString("guild");
			guild_number = nbt.getDouble("guild_number");
			guild_leader = nbt.getBoolean("guild_leader");
			possession = nbt.getBoolean("possession");
			MagicalCounter = nbt.getBoolean("MagicalCounter");
			power_percentage = nbt.getDouble("power_percentage");
			PerpetualReincarnation = nbt.getBoolean("PerpetualReincarnation");
			EternalLife = nbt.getBoolean("EternalLife");
			Possession_Switch = nbt.getBoolean("Possession_Switch");
			Awaken = nbt.getBoolean("Awaken");
			drole_dance = nbt.getBoolean("drole_dance");
			strength_boost = nbt.getDouble("strength_boost");
			spirit_boost = nbt.getDouble("spirit_boost");
			maxmana_boost = nbt.getDouble("maxmana_boost");
			ManaAttack_boost = nbt.getDouble("ManaAttack_boost");
			agility_boost = nbt.getDouble("agility_boost");
			kill_earthcrawler = nbt.getDouble("kill_earthcrawler");
			freeze_saber = nbt.getBoolean("freeze_saber");
			weapon_boost = nbt.getDouble("weapon_boost");
			purgatory_fire_overlay = nbt.getBoolean("purgatory_fire_overlay");
			cost_amount = nbt.getDouble("cost_amount");
			the_ruler = nbt.getBoolean("the_ruler");
			trainingX = nbt.getDouble("trainingX");
			trainingY = nbt.getDouble("trainingY");
			trainingZ = nbt.getDouble("trainingZ");
			demon_hearts = nbt.getDouble("demon_hearts");
			defeat_bluedemon = nbt.getDouble("defeat_bluedemon");
			demon = nbt.getBoolean("demon");
			defeat_drole = nbt.getDouble("defeat_drole");
			defeat_gloxinia = nbt.getDouble("defeat_gloxinia");
			hunter_fest = nbt.getBoolean("hunter_fest");
			physical_hunt = nbt.getDouble("physical_hunt");
			physical_hunt_strengh = nbt.getDouble("physical_hunt_strengh");
			physical_hunt_spirt = nbt.getDouble("physical_hunt_spirt");
			physical_hunt_speed = nbt.getDouble("physical_hunt_speed");
			physical_hunt_timer = nbt.getDouble("physical_hunt_timer");
			kill_demons = nbt.getDouble("kill_demons");
			logic_cords = nbt.getBoolean("logic_cords");
			string_cords = nbt.getString("string_cords");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftNoTaizaiMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.level = message.data.level;
					variables.xp = message.data.xp;
					variables.TP = message.data.TP;
					variables.health = message.data.health;
					variables.maxhealth = message.data.maxhealth;
					variables.strength = message.data.strength;
					variables.Spirit = message.data.Spirit;
					variables.mana = message.data.mana;
					variables.maxmana = message.data.maxmana;
					variables.ManaAttack = message.data.ManaAttack;
					variables.Full_Counter_Use = message.data.Full_Counter_Use;
					variables.PlayerFirstJoins = message.data.PlayerFirstJoins;
					variables.Race = message.data.Race;
					variables.PurgatoryFire = message.data.PurgatoryFire;
					variables.heavy_metal = message.data.heavy_metal;
					variables.lightningarmor = message.data.lightningarmor;
					variables.heavy_armor = message.data.heavy_armor;
					variables.Transparency_Use = message.data.Transparency_Use;
					variables.magic = message.data.magic;
					variables.revengecounter = message.data.revengecounter;
					variables.PurgeAttack = message.data.PurgeAttack;
					variables.zerosign = message.data.zerosign;
					variables.storeddmg = message.data.storeddmg;
					variables.infinity_use = message.data.infinity_use;
					variables.BreakerOff = message.data.BreakerOff;
					variables.DemonMark = message.data.DemonMark;
					variables.berserkmode = message.data.berserkmode;
					variables.rCoolDown = message.data.rCoolDown;
					variables.PerfectShell = message.data.PerfectShell;
					variables.BP = message.data.BP;
					variables.immortality = message.data.immortality;
					variables.immortalityplayer = message.data.immortalityplayer;
					variables.forwardfly = message.data.forwardfly;
					variables.lokckedenity = message.data.lokckedenity;
					variables.range = message.data.range;
					variables.jumbvar = message.data.jumbvar;
					variables.lock_on = message.data.lock_on;
					variables.target_lock = message.data.target_lock;
					variables.graydemonblood = message.data.graydemonblood;
					variables.humandemonmark = message.data.humandemonmark;
					variables.graydemonform = message.data.graydemonform;
					variables.AbsoluteCanel = message.data.AbsoluteCanel;
					variables.killroyale = message.data.killroyale;
					variables.redKill = message.data.redKill;
					variables.blueKill = message.data.blueKill;
					variables.mana_regen = message.data.mana_regen;
					variables.charging = message.data.charging;
					variables.mana_timer = message.data.mana_timer;
					variables.Levitation = message.data.Levitation;
					variables.WPressed = message.data.WPressed;
					variables.mana_drain = message.data.mana_drain;
					variables.attack_cd = message.data.attack_cd;
					variables.TPAmount = message.data.TPAmount;
					variables.TPSwitchAmount = message.data.TPSwitchAmount;
					variables.HalfAwaken = message.data.HalfAwaken;
					variables.Half = message.data.Half;
					variables.GravityTen = message.data.GravityTen;
					variables.HyperGravity = message.data.HyperGravity;
					variables.AbilitySelect = message.data.AbilitySelect;
					variables.Move = message.data.Move;
					variables.SlotSwitch = message.data.SlotSwitch;
					variables.Agility = message.data.Agility;
					variables.SpacePressed = message.data.SpacePressed;
					variables.learn_skill = message.data.learn_skill;
					variables.damage_indicator = message.data.damage_indicator;
					variables.reddemonboost = message.data.reddemonboost;
					variables.side_quest = message.data.side_quest;
					variables.Story = message.data.Story;
					variables.JackCD = message.data.JackCD;
					variables.CDJack = message.data.CDJack;
					variables.LostVayne = message.data.LostVayne;
					variables.the_one = message.data.the_one;
					variables.combostar = message.data.combostar;
					variables.combostarcounter = message.data.combostarcounter;
					variables.TheOneUltimate = message.data.TheOneUltimate;
					variables.combostartick = message.data.combostartick;
					variables.capitalofthedeadX = message.data.capitalofthedeadX;
					variables.capitalofthedeadY = message.data.capitalofthedeadY;
					variables.capitalofthedeadZ = message.data.capitalofthedeadZ;
					variables.hit = message.data.hit;
					variables.TrickStarX = message.data.TrickStarX;
					variables.TrickStarY = message.data.TrickStarY;
					variables.TrickStarZ = message.data.TrickStarZ;
					variables.FullSize = message.data.FullSize;
					variables.CriticalOver = message.data.CriticalOver;
					variables.Rhitta = message.data.Rhitta;
					variables.rhittatick = message.data.rhittatick;
					variables.TrickStarYaw = message.data.TrickStarYaw;
					variables.physical_full_counter = message.data.physical_full_counter;
					variables.FullPowerDemonMark = message.data.FullPowerDemonMark;
					variables.teleplortionX = message.data.teleplortionX;
					variables.teleplortionY = message.data.teleplortionY;
					variables.teleplortionZ = message.data.teleplortionZ;
					variables.MagicScroll = message.data.MagicScroll;
					variables.learn_skills = message.data.learn_skills;
					variables.learned_spells = message.data.learned_spells;
					variables.spells = message.data.spells;
					variables.yggdra_cloth = message.data.yggdra_cloth;
					variables.True_Spirt_From = message.data.True_Spirt_From;
					variables.mana_regen_effect = message.data.mana_regen_effect;
					variables.hard_protection = message.data.hard_protection;
					variables.learn_demon_skills = message.data.learn_demon_skills;
					variables.aqua_dress = message.data.aqua_dress;
					variables.Healing_Area = message.data.Healing_Area;
					variables.healing_area = message.data.healing_area;
					variables.healing_area_timer = message.data.healing_area_timer;
					variables.GoddessBless = message.data.GoddessBless;
					variables.goddessbless = message.data.goddessbless;
					variables.Gloxinia = message.data.Gloxinia;
					variables.yggdrasil_armor = message.data.yggdrasil_armor;
					variables.MagicDetection = message.data.MagicDetection;
					variables.fire_protection = message.data.fire_protection;
					variables.Emerald_Octo = message.data.Emerald_Octo;
					variables.drole_eye = message.data.drole_eye;
					variables.Moon_Rose = message.data.Moon_Rose;
					variables.fox_hunt = message.data.fox_hunt;
					variables.JubakuEnsaX = message.data.JubakuEnsaX;
					variables.JubakuEnsaY = message.data.JubakuEnsaY;
					variables.JubakuEnsaZ = message.data.JubakuEnsaZ;
					variables.JubakuEnsaTick = message.data.JubakuEnsaTick;
					variables.JubakuEnsa = message.data.JubakuEnsa;
					variables.God = message.data.God;
					variables.elizbethArk = message.data.elizbethArk;
					variables.commandment = message.data.commandment;
					variables.combostarhit = message.data.combostarhit;
					variables.manaFill = message.data.manaFill;
					variables.healthFill = message.data.healthFill;
					variables.Purgatory = message.data.Purgatory;
					variables.demonkingpower = message.data.demonkingpower;
					variables.demonkingpage = message.data.demonkingpage;
					variables.God_Chance = message.data.God_Chance;
					variables.ThunderGodsFlash = message.data.ThunderGodsFlash;
					variables.defeatRedDemon = message.data.defeatRedDemon;
					variables.DefeatGrayDemon = message.data.DefeatGrayDemon;
					variables.giantskills = message.data.giantskills;
					variables.monsterBlock0 = message.data.monsterBlock0;
					variables.monsterBlock1 = message.data.monsterBlock1;
					variables.monsterBlock2 = message.data.monsterBlock2;
					variables.monsterBlock3 = message.data.monsterBlock3;
					variables.monsterBlock4 = message.data.monsterBlock4;
					variables.monsterBlock5 = message.data.monsterBlock5;
					variables.monsterBlock6 = message.data.monsterBlock6;
					variables.monsterBlock7 = message.data.monsterBlock7;
					variables.monsterBlock8 = message.data.monsterBlock8;
					variables.Monsterblock0 = message.data.Monsterblock0;
					variables.Monsterblock1 = message.data.Monsterblock1;
					variables.Monsterblock2 = message.data.Monsterblock2;
					variables.Monsterblock3 = message.data.Monsterblock3;
					variables.Monsterblock4 = message.data.Monsterblock4;
					variables.Monsterblock5 = message.data.Monsterblock5;
					variables.Monsterblock6 = message.data.Monsterblock6;
					variables.Monsterblock7 = message.data.Monsterblock7;
					variables.Monsterblock8 = message.data.Monsterblock8;
					variables.sidequest = message.data.sidequest;
					variables.questamount = message.data.questamount;
					variables.istarX = message.data.istarX;
					variables.istarY = message.data.istarY;
					variables.istarZ = message.data.istarZ;
					variables.cave_of_training_timer = message.data.cave_of_training_timer;
					variables.training_kick = message.data.training_kick;
					variables.cave_of_training_cd = message.data.cave_of_training_cd;
					variables.cave_of_training = message.data.cave_of_training;
					variables.training_id = message.data.training_id;
					variables.tower_of_trails = message.data.tower_of_trails;
					variables.tower_of_trails_cooldown = message.data.tower_of_trails_cooldown;
					variables.istar_kills = message.data.istar_kills;
					variables.hijack = message.data.hijack;
					variables.HighSpeedRegeneration = message.data.HighSpeedRegeneration;
					variables.agility_percentage_lower = message.data.agility_percentage_lower;
					variables.repose_timer = message.data.repose_timer;
					variables.repose = message.data.repose;
					variables.health_display = message.data.health_display;
					variables.guild_stack = message.data.guild_stack;
					variables.guild = message.data.guild;
					variables.guild_number = message.data.guild_number;
					variables.guild_leader = message.data.guild_leader;
					variables.possession = message.data.possession;
					variables.MagicalCounter = message.data.MagicalCounter;
					variables.power_percentage = message.data.power_percentage;
					variables.PerpetualReincarnation = message.data.PerpetualReincarnation;
					variables.EternalLife = message.data.EternalLife;
					variables.Possession_Switch = message.data.Possession_Switch;
					variables.Awaken = message.data.Awaken;
					variables.drole_dance = message.data.drole_dance;
					variables.strength_boost = message.data.strength_boost;
					variables.spirit_boost = message.data.spirit_boost;
					variables.maxmana_boost = message.data.maxmana_boost;
					variables.ManaAttack_boost = message.data.ManaAttack_boost;
					variables.agility_boost = message.data.agility_boost;
					variables.kill_earthcrawler = message.data.kill_earthcrawler;
					variables.freeze_saber = message.data.freeze_saber;
					variables.weapon_boost = message.data.weapon_boost;
					variables.purgatory_fire_overlay = message.data.purgatory_fire_overlay;
					variables.cost_amount = message.data.cost_amount;
					variables.the_ruler = message.data.the_ruler;
					variables.trainingX = message.data.trainingX;
					variables.trainingY = message.data.trainingY;
					variables.trainingZ = message.data.trainingZ;
					variables.demon_hearts = message.data.demon_hearts;
					variables.defeat_bluedemon = message.data.defeat_bluedemon;
					variables.demon = message.data.demon;
					variables.defeat_drole = message.data.defeat_drole;
					variables.defeat_gloxinia = message.data.defeat_gloxinia;
					variables.hunter_fest = message.data.hunter_fest;
					variables.physical_hunt = message.data.physical_hunt;
					variables.physical_hunt_strengh = message.data.physical_hunt_strengh;
					variables.physical_hunt_spirt = message.data.physical_hunt_spirt;
					variables.physical_hunt_speed = message.data.physical_hunt_speed;
					variables.physical_hunt_timer = message.data.physical_hunt_timer;
					variables.kill_demons = message.data.kill_demons;
					variables.logic_cords = message.data.logic_cords;
					variables.string_cords = message.data.string_cords;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
