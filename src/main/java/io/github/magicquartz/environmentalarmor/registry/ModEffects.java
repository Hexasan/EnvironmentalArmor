package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.WaterResistance;
import io.github.magicquartz.environmentalarmor.extensions.BrewingRecipes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {

    public static final StatusEffect WATER_RESISTANCE = new WaterResistance();
    public static final StatusEffectInstance WATER_RESISTANCE_INSTANCE = new StatusEffectInstance(WATER_RESISTANCE, 9600, 0);
    public static final Potion WATER_RESISTANCE_POTION = new Potion("water_resistance", WATER_RESISTANCE_INSTANCE);

    public static void registerEffects() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Main.MOD_ID, "water_resistance"), WATER_RESISTANCE);
        Registry.register(Registry.POTION, new Identifier(Main.MOD_ID, "water_resist_potion"), WATER_RESISTANCE_POTION);
        BrewingRecipes.registerPotionRecipe(Potions.AWKWARD, Items.SCUTE, WATER_RESISTANCE_POTION);
    }
}
