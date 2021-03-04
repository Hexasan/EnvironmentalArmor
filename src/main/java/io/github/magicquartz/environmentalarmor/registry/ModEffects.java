package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.WaterResistance;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {

    public static final StatusEffect WATER_RESISTANCE = new WaterResistance();

    public static void registerEnchants() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Main.MOD_ID, "water_protect"), WATER_RESISTANCE);
    }
}
