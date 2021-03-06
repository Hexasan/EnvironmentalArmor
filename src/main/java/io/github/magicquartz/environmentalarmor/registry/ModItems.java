package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.GlassBowlItem;
import io.github.magicquartz.environmentalarmor.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item GLASS_BOWL = new GlassBowlItem(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));

    // Magnesium
    public static final Item MAGNESIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item MAGNESIUM_DUST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final BlockItem MAGNESIUM_ORE = new BlockItem(ModBlocks.MAGNESIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MAGNESIUM_BLOCK = new BlockItem(ModBlocks.MAGNESIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "glass_bowl"), GLASS_BOWL);

        // Magnesium
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magnesium_ingot"), MAGNESIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magnesium_dust"), MAGNESIUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magnesium_ore"), MAGNESIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magnesium_block"), MAGNESIUM_BLOCK);
    }
}
