
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magitecheraresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.magitecheraresources.item.WeDoALittleTrollingItem;
import net.mcreator.magitecheraresources.item.SimplePonyItem;
import net.mcreator.magitecheraresources.item.NoMatterWhat2021Item;
import net.mcreator.magitecheraresources.item.MineNice2MeItem;
import net.mcreator.magitecheraresources.item.InARush2023Item;
import net.mcreator.magitecheraresources.item.FuckMarryKillItem;
import net.mcreator.magitecheraresources.item.EverythingGlimmerItem;
import net.mcreator.magitecheraresources.item.BitOfAMonsterItem;
import net.mcreator.magitecheraresources.MagitechEraResourcesMod;

public class MagitechEraResourcesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagitechEraResourcesMod.MODID);
	public static final RegistryObject<Item> MINE_NICE_2_ME = REGISTRY.register("mine_nice_2_me", () -> new MineNice2MeItem());
	public static final RegistryObject<Item> BIT_OF_A_MONSTER = REGISTRY.register("bit_of_a_monster", () -> new BitOfAMonsterItem());
	public static final RegistryObject<Item> SIMPLE_PONY = REGISTRY.register("simple_pony", () -> new SimplePonyItem());
	public static final RegistryObject<Item> EVERYTHING_GLIMMER = REGISTRY.register("everything_glimmer", () -> new EverythingGlimmerItem());
	public static final RegistryObject<Item> FUCK_MARRY_KILL = REGISTRY.register("fuck_marry_kill", () -> new FuckMarryKillItem());
	public static final RegistryObject<Item> IN_A_RUSH_2023 = REGISTRY.register("in_a_rush_2023", () -> new InARush2023Item());
	public static final RegistryObject<Item> NO_MATTER_WHAT_2021 = REGISTRY.register("no_matter_what_2021", () -> new NoMatterWhat2021Item());
	public static final RegistryObject<Item> WE_DO_A_LITTLE_TROLLING = REGISTRY.register("we_do_a_little_trolling", () -> new WeDoALittleTrollingItem());
	// Start of user code block custom items
	// End of user code block custom items
}
