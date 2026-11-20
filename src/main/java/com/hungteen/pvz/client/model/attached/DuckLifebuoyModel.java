package com.hungteen.pvz.client.model.attached;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

// 鸭子游泳圈模型，由 HTPVZ2 的 armor 模型移植为 layer 直接渲染用的纯方块模型
public class DuckLifebuoyModel<T extends LivingEntity> extends EntityModel<T> {
	private final ModelRenderer body;

	public DuckLifebuoyModel() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 26.0F, 0.0F);
		body.texOffs(0, 0).addBox(-6.0F, 7.0F, -6.0F, 12.0F, 4.0F, 12.0F, 0.0F, false);
		body.texOffs(0, 16).addBox(-3.0F, 7.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
		body.texOffs(20, 22).addBox(-2.0F, 3.5F, -7.005F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		body.texOffs(18, 16).addBox(-1.5F, 5.5F, -9.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 8.0F, 6.0F);
		cube_r1.xRot = 0.5236F;
		cube_r1.yRot = 0.0F;
		cube_r1.zRot = 0.0F;
		body.addChild(cube_r1);
		cube_r1.texOffs(0, 26).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}
}
