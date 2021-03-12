package io.github.magicquartz.environmentalarmor.extensions;

import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.potion.Potion;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.recipe.Ingredient;

import java.util.List;

public class BrewingRecipes extends BrewingRecipeRegistry {
    private static final List<Recipe<Potion>> POTION_RECIPES = Lists.newArrayList();

    public static void registerPotionRecipe(Potion input, Item item, Potion output) {
        POTION_RECIPES.add(new Recipe(input, Ingredient.ofItems(new ItemConvertible[]{item}), output));
    }

    static class Recipe<T> {
        private final T input;
        private final Ingredient ingredient;
        private final T output;

        public Recipe(T object, Ingredient ingredient, T object2) {
            this.input = object;
            this.ingredient = ingredient;
            this.output = object2;
        }
    }
}
