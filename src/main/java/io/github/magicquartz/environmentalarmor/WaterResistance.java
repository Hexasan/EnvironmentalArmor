package io.github.magicquartz.environmentalarmor;

import io.github.apace100.origins.command.OriginArgument;
import io.github.apace100.origins.origin.Origin;
import io.github.apace100.origins.power.*;
import io.github.apace100.origins.power.factory.PowerFactories;
import io.github.apace100.origins.power.factory.PowerFactory;
import io.github.apace100.origins.util.SerializableData;
import io.github.apace100.origins.util.SerializableDataType;
import io.github.magicquartz.environmentalarmor.power.EnvironmentalArmorPowers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import io.github.apace100.origins.*;
import net.minecraft.util.Identifier;

import javax.swing.*;
import java.util.Date;

public class WaterResistance extends StatusEffect {
    public WaterResistance() {
        super(StatusEffectType.BENEFICIAL, 0x00BBFF);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {

        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            PowerType<Power> WATER_DAMAGE = new PowerTypeReference<>(new Identifier(Origins.MODID, "water_vulnerability"));
            if(EnvironmentalArmorPowers.WATER_DAMAGE.isActive(player)) {
                String damageSource = player.getRecentDamageSource().getName();
                if(!damageSource.equals("none")) {
                    player.sendMessage(new LiteralText("Damage source: " + damageSource), false);
                    damageSource = "none";
                }
            }
        }
    }
}
