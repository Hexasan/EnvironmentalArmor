package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.GlassBowlItem;
import io.github.magicquartz.environmentalarmor.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item GLASS_BOWL = new GlassBowlItem(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "glass_bowl"), GLASS_BOWL);
    }
}
