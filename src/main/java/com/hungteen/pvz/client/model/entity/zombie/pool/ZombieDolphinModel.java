package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.common.entity.zombie.pool.ZombieDolphinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings

public class ZombieDolphinModel extends EntityModel<ZombieDolphinEntity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer tail;
	private final ModelRenderer tail_fin;
	private final ModelRenderer back_fin;
	private final ModelRenderer left_fin;
	private final ModelRenderer right_fin;

	public ZombieDolphinModel() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, -3.0F);
		body.texOffs(22, 19).addBox(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -4.0F, -3.0F);
		body.addChild(head);
		head.texOffs(0, 33).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setPos(0.0F, 4.0F, -3.0F);
		head.addChild(nose);
		nose.texOffs(51, 26).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -2.5F, 14.0F);
		body.addChild(tail);
		tail.texOffs(0, 46).addBox(-2.0F, -2.5F, -1.0F, 4.0F, 5.0F, 11.0F, 0.0F, false);

		tail_fin = new ModelRenderer(this);
		tail_fin.setPos(0.0F, 0.0F, 9.0F);
		tail.addChild(tail_fin);
		tail_fin.texOffs(32, 40).addBox(-5.0F, -0.5F, -1.0F, 10.0F, 1.0F, 6.0F, 0.0F, false);

		back_fin = new ModelRenderer(this);
		back_fin.setPos(0.0F, -11.0F, -2.0F);
		body.addChild(back_fin);
		back_fin.texOffs(51, 16).addBox(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		left_fin = new ModelRenderer(this);
		left_fin.setPos(4.5F, 0.0F, 1.0F);
		body.addChild(left_fin);
		left_fin.texOffs(48, 48).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);

		right_fin = new ModelRenderer(this);
		right_fin.setPos(-4.5F, 0.0F, 1.0F);
		body.addChild(right_fin);
		right_fin.texOffs(48, 48).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(ZombieDolphinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.body.xRot = headPitch * ((float) Math.PI / 180F);
		this.body.yRot = netHeadYaw * ((float) Math.PI / 180F);
		this.tail.xRot = 0.0F;
		this.tail_fin.xRot = 0.0F;
		if (Entity.getHorizontalDistanceSqr(entity.getDeltaMovement()) > 1.0E-7D) {
			this.body.xRot += -0.05F + -0.05F * MathHelper.cos(ageInTicks * 0.3F);
			this.tail.xRot = -0.1F * MathHelper.cos(ageInTicks * 0.3F);
			this.tail_fin.xRot = -0.2F * MathHelper.cos(ageInTicks * 0.3F);
		}
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}