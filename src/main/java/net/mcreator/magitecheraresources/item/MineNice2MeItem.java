
package net.mcreator.magitecheraresources.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MineNice2MeItem extends RecordItem {
	public MineNice2MeItem() {
		super(9, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magitech_era_resources:vyletpony_single_minenice2me")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2271);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Original by Bladee"));
		list.add(Component.literal("03-02-21"));
	}
}
