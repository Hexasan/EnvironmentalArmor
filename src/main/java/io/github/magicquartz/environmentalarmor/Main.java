package io.github.magicquartz.environmentalarmor;

import io.github.magicquartz.environmentalarmor.registry.*;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    public static final String MOD_ID = "enva";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModArmor.registerArmor();
        ModEffects.registerEffects();
        ModOres.registerOres();
        ModBlocks.registerBlocks();
    }
}
