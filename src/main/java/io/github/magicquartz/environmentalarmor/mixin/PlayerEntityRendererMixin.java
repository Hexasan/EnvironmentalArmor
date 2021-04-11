package io.github.magicquartz.environmentalarmor.mixin;

import io.github.magicquartz.environmentalarmor.extensions.CustomArmorFeatureRenderer;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntityRenderer.class)
public class PlayerEntityRendererMixin extends LivingEntityRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {

    public PlayerEntityRendererMixin(EntityRenderDispatcher dispatcher, PlayerEntityModel<AbstractClientPlayerEntity> model, float shadowRadius) {
        super(dispatcher, model, shadowRadius);
    }

    // Inject the custom helmet feature renderer
    @Inject(at = @At(value = "TAIL", target = "Lnet/minecraft/client/render/entity/PlayerEntityRenderer;<init>(Lnet/minecraft/client/render/entity/EntityRenderDispatcher;Z)V"), method = "<init>(Lnet/minecraft/client/render/entity/EntityRenderDispatcher;Z)V")
    public void addCustomFeatureRenderer(EntityRenderDispatcher dispatcher, boolean bl, CallbackInfo ci){
        this.addFeature(new CustomArmorFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(AbstractClientPlayerEntity entity) {
        return entity.getSkinTexture();
    }
}