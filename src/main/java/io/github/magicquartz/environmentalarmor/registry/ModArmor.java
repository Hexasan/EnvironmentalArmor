package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.armor.MagnesiumArmorMaterial;
import io.github.magicquartz.environmentalarmor.armor.WaterGlassArmorMaterial;
import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.armor.GlassArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModArmor {
    public static final Item GLASS_HELMET = new ArmorItem(new GlassArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item WATER_GLASS_HELMET = new ArmorItem(new WaterGlassArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings());

    // Magnesium armor
    public static final Item MAGNESIUM_HELMET = new ArmorItem(new MagnesiumArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item MAGNESIUM_CHESTPLATE = new ArmorItem(new MagnesiumArmorMaterial(), EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item MAGNESIUM_LEGGINGS = new ArmorItem(new MagnesiumArmorMaterial(), EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item MAGNESIUM_BOOTS = new ArmorItem(new MagnesiumArmorMaterial(), EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerArmor() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "glass_helmet"), GLASS_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "water_glass_bowl"), WATER_GLASS_HELMET);

        // Magnesium armor
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magnesium_helmet"), MAGNESIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magnesium_chestplate"), MAGNESIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magnesium_leggings"), MAGNESIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magnesium_boots"), MAGNESIUM_BOOTS);
    }
}
