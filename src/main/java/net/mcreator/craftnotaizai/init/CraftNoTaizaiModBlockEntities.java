
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.craftnotaizai.block.entity.StageTwoAgaveBlockEntity;
import net.mcreator.craftnotaizai.block.entity.StageOneAgaveBlockEntity;
import net.mcreator.craftnotaizai.block.entity.RhittaBlockTileEntity;
import net.mcreator.craftnotaizai.block.entity.PerfectCubeBlockEntity;
import net.mcreator.craftnotaizai.block.entity.LastStageAgaveBlockEntity;
import net.mcreator.craftnotaizai.block.entity.KegBlockEntity;
import net.mcreator.craftnotaizai.block.entity.CapitaloftheDeadBlockBlockEntity;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class CraftNoTaizaiModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CAPITALOFTHE_DEAD_BLOCK = register("capitalofthe_dead_block", CraftNoTaizaiModBlocks.CAPITALOFTHE_DEAD_BLOCK, CapitaloftheDeadBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PERFECT_CUBE = register("perfect_cube", CraftNoTaizaiModBlocks.PERFECT_CUBE, PerfectCubeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEG = register("keg", CraftNoTaizaiModBlocks.KEG, KegBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STAGE_ONE_AGAVE = register("stage_one_agave", CraftNoTaizaiModBlocks.STAGE_ONE_AGAVE, StageOneAgaveBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STAGE_TWO_AGAVE = register("stage_two_agave", CraftNoTaizaiModBlocks.STAGE_TWO_AGAVE, StageTwoAgaveBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LAST_STAGE_AGAVE = register("last_stage_agave", CraftNoTaizaiModBlocks.LAST_STAGE_AGAVE, LastStageAgaveBlockEntity::new);
	public static final RegistryObject<BlockEntityType<RhittaBlockTileEntity>> RHITTA_BLOCK = REGISTRY.register("rhitta_block", () -> BlockEntityType.Builder.of(RhittaBlockTileEntity::new, CraftNoTaizaiModBlocks.RHITTA_BLOCK.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
