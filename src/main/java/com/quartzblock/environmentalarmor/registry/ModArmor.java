package com.quartzblock.environmentalarmor.registry;

import com.quartzblock.environmentalarmor.Main;
import com.quartzblock.environmentalarmor.armor.GlassArmorMaterial;
import com.quartzblock.environmentalarmor.armor.WaterGlassArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModArmor {
    public static final Item GLASS_HELMET = new ArmorItem(new GlassArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item WATER_GLASS_HELMET = new ArmorItem(new WaterGlassArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings());

    public static void registerArmor() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "glass_helmet"), GLASS_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "water_glass_bowl"), WATER_GLASS_HELMET);
    }
}
