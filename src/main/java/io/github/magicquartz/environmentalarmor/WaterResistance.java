package io.github.magicquartz.environmentalarmor;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;


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
            player.sendMessage(new LiteralText("Mama."), true);
        }
    }
}
