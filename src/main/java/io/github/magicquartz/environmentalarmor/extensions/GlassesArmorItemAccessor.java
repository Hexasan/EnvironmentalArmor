package io.github.magicquartz.environmentalarmor.extensions;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public interface GlassesArmorItemAccessor {
    void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context);
}
