package com.quartzblock.environmentalarmor;

import com.quartzblock.environmentalarmor.registry.ModArmor;
import com.quartzblock.environmentalarmor.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    public static final String MOD_ID = "enva";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModArmor.registerArmor();
    }
}
