package io.github.magicquartz.environmentalarmor.mixin;

import io.github.apace100.origins.component.OriginComponent;
import io.github.apace100.origins.power.DamageOverTimePower;
import io.github.magicquartz.environmentalarmor.power.EnvironmentalArmorPowers;
import io.github.magicquartz.environmentalarmor.registry.ModEffects;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    @Shadow public abstract void tick();

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo info) {
        if(OriginComponent.hasPower(this, DamageOverTimePower.class) && isTouchingWaterOrRain() && hasStatusEffect(ModEffects.WATER_RESISTANCE) && EnvironmentalArmorPowers.WATER_DAMAGE.isActive(this)) {
            // For enderians and blazeborns which are vulnerable to water.
            List<DamageOverTimePower> powers = OriginComponent.getPowers(this, DamageOverTimePower.class);
            powers.get(0).setValue(20);
        }
    }
}
