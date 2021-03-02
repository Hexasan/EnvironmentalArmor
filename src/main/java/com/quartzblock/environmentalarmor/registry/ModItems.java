package com.quartzblock.environmentalarmor.registry;

import com.quartzblock.environmentalarmor.GlassBowlItem;
import com.quartzblock.environmentalarmor.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item GLASS_BOWL = new GlassBowlItem(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
    //public static final Item WATER_GLASS_BOWL = new Item(new Item.Settings().maxCount(1));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "glass_bowl"), GLASS_BOWL);
        //Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "water_glass_bowl"), WATER_GLASS_BOWL);
    }
}
