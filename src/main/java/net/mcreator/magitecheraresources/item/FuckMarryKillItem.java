
package net.mcreator.magitecheraresources.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class FuckMarryKillItem extends RecordItem {
	public FuckMarryKillItem() {
		super(14, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magitech_era_resources:vyletpony_single_fuckmarrykill")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4929);
	}
}
