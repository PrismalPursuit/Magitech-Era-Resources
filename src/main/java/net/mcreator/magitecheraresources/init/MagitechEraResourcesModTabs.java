
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
				tabData.accept(MagitechEraResourcesModItems.GIRLS_WHO_ARE_WIZARDS.get());
				tabData.accept(MagitechEraResourcesModItems.THE_STORY_OF_DJ_GOOBER.get());
				tabData.accept(MagitechEraResourcesModItems.THE_QUEEN_IS_BACK.get());
				tabData.accept(MagitechEraResourcesModItems.THE_WIZARD_OF_WUBZ.get());
				tabData.accept(MagitechEraResourcesModItems.THERES_A_MENU_THEME_NESTLED_WITHIN_US_ALL.get());
				tabData.accept(MagitechEraResourcesModItems.MUSICIANS_OF_PONYVILLE.get());
				tabData.accept(MagitechEraResourcesModItems.REFLECTED_IN_THE_EYES_OF_THE_CAVERN_LURKER.get());
				tabData.accept(MagitechEraResourcesModItems.CREATURE_CITY.get());
				tabData.accept(MagitechEraResourcesModItems.POTION_SELLER.get());
				tabData.accept(MagitechEraResourcesModItems.SACRED_DRAGON.get());
				tabData.accept(MagitechEraResourcesModItems.BATTLE_AGAINST_THE_BANISHED_SORCERER_KNIGHT_STINKLEBUG.get());
				tabData.accept(MagitechEraResourcesModItems.FACING_OBLIVION_TO_BECOME_THE_LODE_STAR.get());
				tabData.accept(MagitechEraResourcesModItems.IN_THE_NAME_OF_FRIENDSHIP.get());
			}).withSearchBar().build());
}
