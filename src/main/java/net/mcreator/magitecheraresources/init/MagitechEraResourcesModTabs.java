
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magitecheraresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.magitecheraresources.MagitechEraResourcesMod;

public class MagitechEraResourcesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagitechEraResourcesMod.MODID);
	public static final RegistryObject<CreativeModeTab> MAGITECH_ERA_CREATIVE_TAB = REGISTRY.register("magitech_era_creative_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.magitech_era_resources.magitech_era_creative_tab")).icon(() -> new ItemStack(MagitechEraResourcesModItems.BIT_OF_A_MONSTER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MagitechEraResourcesModItems.BIT_OF_A_MONSTER.get());
				tabData.accept(MagitechEraResourcesModItems.MINE_NICE_2_ME.get());
				tabData.accept(MagitechEraResourcesModItems.SIMPLE_PONY.get());
				tabData.accept(MagitechEraResourcesModItems.EVERYTHING_GLIMMER.get());
				tabData.accept(MagitechEraResourcesModItems.FUCK_MARRY_KILL.get());
				tabData.accept(MagitechEraResourcesModItems.IN_A_RUSH_2023.get());
				tabData.accept(MagitechEraResourcesModItems.NO_MATTER_WHAT_2021.get());
				tabData.accept(MagitechEraResourcesModItems.WE_DO_A_LITTLE_TROLLING.get());
			}).withSearchBar().build());
}
