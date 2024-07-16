
package net.mcreator.magitecheraresources.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class InARush2023Item extends RecordItem {
	public InARush2023Item() {
		super(6, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magitech_era_resources:vyletpony_single_inarush2023")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4865);
	}
}
