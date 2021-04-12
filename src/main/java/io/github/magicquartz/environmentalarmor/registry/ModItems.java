package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.extensions.GlassBowlItem;
import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.extensions.SunscreenItem;
import io.github.magicquartz.environmentalarmor.toolmaterials.TitaniumToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Glass bowl
    public static final Item GLASS_BOWL = new GlassBowlItem(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));

    // Titanium
    public static final Item TITANIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TITANIUM_DUST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final BlockItem TITANIUM_ORE = new BlockItem(ModBlocks.TITANIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TITANIUM_BLOCK = new BlockItem(ModBlocks.TITANIUM_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    //Sunscreen
    public static final ToolItem SUNSCREEN = new SunscreenItem(new TitaniumToolMaterial(), new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).maxDamage(3));

    public static void register() {
        //Glass bowl
        Registry.register(Registry.ITEM, Main.identifier("glass_bowl"), GLASS_BOWL);

        // Titanium
        Registry.register(Registry.ITEM, Main.identifier("titanium_ingot"), TITANIUM_INGOT);
        Registry.register(Registry.ITEM, Main.identifier("titanium_dust"), TITANIUM_DUST);
        Registry.register(Registry.ITEM, Main.identifier("titanium_ore"), TITANIUM_ORE);
        Registry.register(Registry.ITEM, Main.identifier("titanium_block"), TITANIUM_BLOCK);

        //Sunscreen
        Registry.register(Registry.ITEM, Main.identifier("sunscreen"), SUNSCREEN);
    }
}
