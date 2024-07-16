
package net.mcreator.magitecheraresources.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class WeDoALittleTrollingItem extends RecordItem {
	public WeDoALittleTrollingItem() {
		super(8, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magitech_era_resources:vyletpony_single_wedoalittletrolling")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 2401);
	}
}
