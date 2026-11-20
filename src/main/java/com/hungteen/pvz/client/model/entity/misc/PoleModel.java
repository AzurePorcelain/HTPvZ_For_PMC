package com.hungteen.pvz.client.model.entity.misc;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

public class PoleModel extends EntityModel<Entity> {
	private final ModelRenderer total;

	public PoleModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.texOffs(60, 16).addBox(-0.5F, -23.5F, -0.5F, 1.0F, 47.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}
}
