
package net.mcreator.magitecheraresources.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MineNice2MeItem extends RecordItem {
	public MineNice2MeItem() {
		super(9, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magitech_era_resources:vyletpony_single_minenice2me")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2271);
	}
}
