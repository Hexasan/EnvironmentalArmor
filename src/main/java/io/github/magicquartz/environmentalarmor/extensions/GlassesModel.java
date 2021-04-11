package io.github.magicquartz.environmentalarmor.extensions;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;

public class GlassesModel<T extends LivingEntity> extends EntityModel<T> {
    private final ModelPart glasses_model;
    public GlassesModel() {
        textureWidth = 16;
        textureHeight = 16;
        glasses_model = new ModelPart(this);
        glasses_model.setPivot(0.0F, 24.0F, 0.0F);
        glasses_model.setTextureOffset(0, 4).addCuboid(-2.0F, -2.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        glasses_model.setTextureOffset(6, 14).addCuboid(-5.0F, -3.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        glasses_model.setTextureOffset(1, 6).addCuboid(1.0F, -3.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        glasses_model.setTextureOffset(0, 6).addCuboid(-5.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        glasses_model.setTextureOffset(3, 12).addCuboid(1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        glasses_model.setTextureOffset(3, 11).addCuboid(-5.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        glasses_model.setTextureOffset(10, 12).addCuboid(4.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setAngles(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }
    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        glasses_model.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }
}
