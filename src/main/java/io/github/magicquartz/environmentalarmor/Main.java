package io.github.magicquartz.environmentalarmor;

import io.github.magicquartz.environmentalarmor.registry.ModArmor;
import io.github.magicquartz.environmentalarmor.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    public static final String MOD_ID = "enva";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModArmor.registerArmor();
    }
}
