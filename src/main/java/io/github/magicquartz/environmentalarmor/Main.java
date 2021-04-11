package io.github.magicquartz.environmentalarmor;

import io.github.magicquartz.environmentalarmor.registry.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

    public static final String MOD_ID = "enva";

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        ModArmor.register();
        ModEffects.register();
        ModOres.register();
    }

    public static Identifier identifier(String id) {
        return new Identifier(MOD_ID, id);
    }

    public static void translateToFace(MatrixStack matrixStack, PlayerEntityModel<AbstractClientPlayerEntity> model, AbstractClientPlayerEntity player, float headYaw, float headPitch) {
        if (player.isInSwimmingPose() || player.isFallFlying()) {
            matrixStack.multiply(Vector3f.POSITIVE_Z.getDegreesQuaternion(model.head.roll));
            matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(headYaw));
            matrixStack.multiply(Vector3f.POSITIVE_X.getDegreesQuaternion(-45.0F));
        } else {
            if (player.isInSneakingPose() && !model.riding) {
                matrixStack.translate(0.0F, 0.25F, 0.0F);
            }
            matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(headYaw));
            matrixStack.multiply(Vector3f.POSITIVE_X.getDegreesQuaternion(headPitch));
        }
        matrixStack.translate(0.0F, -0.25F, -0.3F);
    }
}
