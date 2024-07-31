
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magitecheraresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magitecheraresources.block.LgbtWallFlagProgressiveBlock;
import net.mcreator.magitecheraresources.block.LgbtWallFlagPolyamorousBlock;
import net.mcreator.magitecheraresources.block.LgbtWallFlagInclusiveBlock;
import net.mcreator.magitecheraresources.block.LgbtWallFlagDemigirlBlock;
import net.mcreator.magitecheraresources.block.LgbtWallFlagDemiboyBlock;
import net.mcreator.magitecheraresources.block.DarknerOakWoodBlock;
import net.mcreator.magitecheraresources.block.DarknerOakStairsBlock;
import net.mcreator.magitecheraresources.block.DarknerOakSlabBlock;
import net.mcreator.magitecheraresources.block.DarknerOakPressurePlateBlock;
import net.mcreator.magitecheraresources.block.DarknerOakPlanksBlock;
import net.mcreator.magitecheraresources.block.DarknerOakLogBlock;
import net.mcreator.magitecheraresources.block.DarknerOakLeavesBlock;
import net.mcreator.magitecheraresources.block.DarknerOakFenceGateBlock;
import net.mcreator.magitecheraresources.block.DarknerOakFenceBlock;
import net.mcreator.magitecheraresources.block.DarknerOakButtonBlock;
import net.mcreator.magitecheraresources.MagitechEraResourcesMod;

public class MagitechEraResourcesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagitechEraResourcesMod.MODID);
	public static final RegistryObject<Block> LGBT_WALL_FLAG_DEMIBOY = REGISTRY.register("lgbt_wall_flag_demiboy", () -> new LgbtWallFlagDemiboyBlock());
	public static final RegistryObject<Block> LGBT_WALL_FLAG_DEMIGIRL = REGISTRY.register("lgbt_wall_flag_demigirl", () -> new LgbtWallFlagDemigirlBlock());
	public static final RegistryObject<Block> LGBT_WALL_FLAG_INCLUSIVE = REGISTRY.register("lgbt_wall_flag_inclusive", () -> new LgbtWallFlagInclusiveBlock());
	public static final RegistryObject<Block> LGBT_WALL_FLAG_POLYAMOROUS = REGISTRY.register("lgbt_wall_flag_polyamorous", () -> new LgbtWallFlagPolyamorousBlock());
	public static final RegistryObject<Block> LGBT_WALL_FLAG_PROGRESSIVE = REGISTRY.register("lgbt_wall_flag_progressive", () -> new LgbtWallFlagProgressiveBlock());
	public static final RegistryObject<Block> DARKNER_OAK_WOOD = REGISTRY.register("darkner_oak_wood", () -> new DarknerOakWoodBlock());
	public static final RegistryObject<Block> DARKNER_OAK_LOG = REGISTRY.register("darkner_oak_log", () -> new DarknerOakLogBlock());
	public static final RegistryObject<Block> DARKNER_OAK_PLANKS = REGISTRY.register("darkner_oak_planks", () -> new DarknerOakPlanksBlock());
	public static final RegistryObject<Block> DARKNER_OAK_LEAVES = REGISTRY.register("darkner_oak_leaves", () -> new DarknerOakLeavesBlock());
	public static final RegistryObject<Block> DARKNER_OAK_STAIRS = REGISTRY.register("darkner_oak_stairs", () -> new DarknerOakStairsBlock());
	public static final RegistryObject<Block> DARKNER_OAK_SLAB = REGISTRY.register("darkner_oak_slab", () -> new DarknerOakSlabBlock());
	public static final RegistryObject<Block> DARKNER_OAK_FENCE = REGISTRY.register("darkner_oak_fence", () -> new DarknerOakFenceBlock());
	public static final RegistryObject<Block> DARKNER_OAK_FENCE_GATE = REGISTRY.register("darkner_oak_fence_gate", () -> new DarknerOakFenceGateBlock());
	public static final RegistryObject<Block> DARKNER_OAK_PRESSURE_PLATE = REGISTRY.register("darkner_oak_pressure_plate", () -> new DarknerOakPressurePlateBlock());
	public static final RegistryObject<Block> DARKNER_OAK_BUTTON = REGISTRY.register("darkner_oak_button", () -> new DarknerOakButtonBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
