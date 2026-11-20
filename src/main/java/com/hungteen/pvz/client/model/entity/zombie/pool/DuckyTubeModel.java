package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.common.entity.misc.DuckyTubeEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class DuckyTubeModel extends EntityModel<DuckyTubeEntity> {
	private final ModelRenderer total;
	private final ModelRenderer cube_r1;

	public DuckyTubeModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 13.0F, 0.0F);
		total.texOffs(0, 0).addBox(-6.0F, 7.0F, -6.0F, 12.0F, 4.0F, 12.0F, 0.0F, false);
		total.texOffs(0, 16).addBox(-3.0F, 7.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
		total.texOffs(20, 22).addBox(-2.0F, 3.5F, -7.005F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		total.texOffs(18, 16).addBox(-1.5F, 5.5F, -9.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 8.0F, 6.0F);
		total.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		cube_r1.texOffs(0, 26).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
	}


	@Override
	public void setupAnim(DuckyTubeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}
	
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}