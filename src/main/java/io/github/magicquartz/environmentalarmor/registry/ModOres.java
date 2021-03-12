package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.Main;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModOres {
    private static final ConfiguredFeature<?, ?> ORE_MAGNESIUM_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                    ModBlocks.MAGNESIUM_ORE.getDefaultState(),
                    9))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(20);

    public static void registerOres() {
        RegistryKey<ConfiguredFeature<?, ?>> oreMagnesiumEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(Main.MOD_ID, "magnesium_ore_end"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreMagnesiumEnd.getValue(), ORE_MAGNESIUM_END);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreMagnesiumEnd);
    }
}
