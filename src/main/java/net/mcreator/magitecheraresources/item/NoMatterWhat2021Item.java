
package net.mcreator.magitecheraresources.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class NoMatterWhat2021Item extends RecordItem {
	public NoMatterWhat2021Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magitech_era_resources:vyletpony_single_nomatterwhat2021")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3502);
	}
}
