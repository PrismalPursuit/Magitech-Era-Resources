
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

public class TheWizardOfWubzItem extends RecordItem {
	public TheWizardOfWubzItem() {
		super(4, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magitech_era_resources:vyletpony_girlswhoarewizards_4")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4370);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Ft. Tracy Brakes"));
		list.add(Component.literal("Girls Who Are Wizards - 4"));
		list.add(Component.literal("07-11-24"));
	}
}
