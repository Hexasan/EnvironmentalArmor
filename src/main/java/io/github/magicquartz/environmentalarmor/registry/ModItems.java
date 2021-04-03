package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.extensions.GlassBowlItem;
import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.extensions.SunscreenItem;
import io.github.magicquartz.environmentalarmor.toolmaterials.MagnesiumToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Glass bowl
    public static final Item GLASS_BOWL = new GlassBowlItem(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));

    // Magnesium
    public static final Item MAGNESIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item MAGNESIUM_DUST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final BlockItem MAGNESIUM_ORE = new BlockItem(ModBlocks.MAGNESIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MAGNESIUM_BLOCK = new BlockItem(ModBlocks.MAGNESIUM_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    //Sunscreen
    public static final ToolItem SUNSCREEN = new SunscreenItem(new MagnesiumToolMaterial(), new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).maxDamage(3));

    public static void register() {
        //Glass bowl
        Registry.register(Registry.ITEM, Main.identifier("glass_bowl"), GLASS_BOWL);

        // Magnesium
        Registry.register(Registry.ITEM, Main.identifier("magnesium_ingot"), MAGNESIUM_INGOT);
        Registry.register(Registry.ITEM, Main.identifier("magnesium_dust"), MAGNESIUM_DUST);
        Registry.register(Registry.ITEM, Main.identifier("magnesium_ore"), MAGNESIUM_ORE);
        Registry.register(Registry.ITEM, Main.identifier("magnesium_block"), MAGNESIUM_BLOCK);

        //Sunscreen
        Registry.register(Registry.ITEM, Main.identifier("sunscreen"), SUNSCREEN);
    }
}
