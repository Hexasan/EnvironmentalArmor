package com.quartzblock.environmentalarmor.registry;

import com.quartzblock.environmentalarmor.GlassBowlItem;
import com.quartzblock.environmentalarmor.Main;
import com.quartzblock.environmentalarmor.WaterRessistance;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPotions {

    //public static final Potion WATER_RESSISTANCE = new WaterRessistance("water_protect", new StatusEffectInstance());

    public static void registerEnchants() {
        //Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "water_glass_bowl"), WATER_GLASS_BOWL);
    }
}
