package io.github.magicquartz.environmentalarmor.mixin;

import io.github.apace100.origins.Origins;
import io.github.apace100.origins.component.OriginComponent;
import io.github.apace100.origins.power.BurnPower;
import io.github.apace100.origins.power.DamageOverTimePower;
import io.github.apace100.origins.power.DisableRegenPower;
import io.github.apace100.origins.power.Power;
import io.github.apace100.origins.power.factory.condition.ConditionFactory;
import io.github.apace100.origins.power.factory.condition.ConditionTypes;
import io.github.apace100.origins.power.factory.condition.EntityConditions;
import io.github.apace100.origins.registry.ModRegistries;
import io.github.apace100.origins.util.OriginLootCondition;
import io.github.magicquartz.environmentalarmor.power.EnvironmentalArmorPowers;
import io.github.magicquartz.environmentalarmor.registry.ModEffects;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
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

    @Shadow public abstract void sendMessage(Text message, boolean actionBar);

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(at = @At("TAIL"), method = "tick")
    private void tick(CallbackInfo info) throws InterruptedException {
        if(OriginComponent.hasPower(this, DamageOverTimePower.class) && isTouchingWaterOrRain() && hasStatusEffect(ModEffects.WATER_RESISTANCE) && EnvironmentalArmorPowers.WATER_DAMAGE.isActive(this)) {
            // For enderians and blazeborns which are vulnerable to water.
            List<DamageOverTimePower> powers = OriginComponent.getPowers(this, DamageOverTimePower.class);
            powers.get(0).setValue(20);
        }
    }
}
