package io.github.magicquartz.environmentalarmor.power;

import io.github.apace100.origins.Origins;
import io.github.apace100.origins.power.Power;
import io.github.apace100.origins.power.PowerType;
import io.github.apace100.origins.power.PowerTypeReference;
import net.minecraft.util.Identifier;

public class EnvironmentalArmorPowers {

    public static final PowerType<Power> WATER_DAMAGE = new PowerTypeReference(new Identifier(Origins.MODID, "water_vulnerability"));
}
