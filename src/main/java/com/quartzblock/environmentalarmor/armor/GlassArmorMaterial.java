package com.quartzblock.environmentalarmor.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class GlassArmorMaterial implements ArmorMaterial {
    @Override
    public int getDurability(EquipmentSlot slot) {
        return 5;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return "glass";
    }

    @Override
    public float getToughness() {
        return 1;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
