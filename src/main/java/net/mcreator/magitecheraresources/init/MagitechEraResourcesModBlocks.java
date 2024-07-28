
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
import net.mcreator.magitecheraresources.MagitechEraResourcesMod;

public class MagitechEraResourcesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagitechEraResourcesMod.MODID);
	public static final RegistryObject<Block> LGBT_WALL_FLAG_POLYAMOROUS = REGISTRY.register("lgbt_wall_flag_polyamorous", () -> new LgbtWallFlagPolyamorousBlock());
	public static final RegistryObject<Block> LGBT_WALL_FLAG_DEMIBOY = REGISTRY.register("lgbt_wall_flag_demiboy", () -> new LgbtWallFlagDemiboyBlock());
	public static final RegistryObject<Block> LGBT_WALL_FLAG_DEMIGIRL = REGISTRY.register("lgbt_wall_flag_demigirl", () -> new LgbtWallFlagDemigirlBlock());
	public static final RegistryObject<Block> LGBT_WALL_FLAG_INCLUSIVE = REGISTRY.register("lgbt_wall_flag_inclusive", () -> new LgbtWallFlagInclusiveBlock());
	public static final RegistryObject<Block> LGBT_WALL_FLAG_PROGRESSIVE = REGISTRY.register("lgbt_wall_flag_progressive", () -> new LgbtWallFlagProgressiveBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
