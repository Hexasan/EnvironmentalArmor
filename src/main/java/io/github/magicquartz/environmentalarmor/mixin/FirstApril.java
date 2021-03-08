package io.github.magicquartz.environmentalarmor.mixin;

import io.github.apace100.origins.component.OriginComponent;
import io.github.apace100.origins.power.TargetActionOnHitPower;
import io.github.magicquartz.environmentalarmor.CustomDamageSource;
import io.github.magicquartz.environmentalarmor.power.EnvironmentalArmorPowers;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Mixin(PlayerEntity.class)
public abstract class FirstApril extends LivingEntity {

    @Shadow public abstract boolean damage(DamageSource source, float amount);

    @Shadow public abstract void sendMessage(Text message, boolean actionBar);

    protected FirstApril(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(at = @At("HEAD"), method = "attack")
    private void attack(CallbackInfo info) { // For bees.
        if(EnvironmentalArmorPowers.STINGER.isActive(this)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd");
            LocalDateTime now = LocalDateTime.now();
            if(dtf.format(now).equals("04/01")) {
                DamageSource naturalCauses = new CustomDamageSource("natural_causes");
                damage(naturalCauses, getHealth());
            }
        }
    }
}
