package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.common.entity.zombie.pool.DolphinRiderEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings


public class DolphinRiderModel extends EntityModel<DolphinRiderEntity> {
	private final ModelRenderer total;
	private final ModelRenderer zombie;
	private final ModelRenderer up;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_hand;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer dolphin;
	private final ModelRenderer dolphin_head;
	private final ModelRenderer nose;
	private final ModelRenderer tail;
	private final ModelRenderer tail_fin;
	private final ModelRenderer back_fin;
	private final ModelRenderer left_fin;
	private final ModelRenderer right_fin;

	public DolphinRiderModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		zombie = new ModelRenderer(this);
		zombie.setPos(0.0F, -9.0F, 10.0F);
		total.addChild(zombie);


		up = new ModelRenderer(this);
		up.setPos(0.0F, 0.0F, 0.0F);
		zombie.addChild(up);
		setRotationAngle(up, 0.8727F, 0.0F, 0.0F);


		head = new ModelRenderer(this);
		head.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(head);
		setRotationAngle(head, -0.4363F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(body);
		body.texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-5.0F, -10.0F, 0.0F);
		up.addChild(right_hand);
		setRotationAngle(right_hand, -1.4399F, 0.0F, -0.2618F);
		right_hand.texOffs(32, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(5.0F, -10.0F, 0.0F);
		up.addChild(left_hand);
		setRotationAngle(left_hand, -1.4399F, 0.0F, 0.2618F);
		left_hand.texOffs(32, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(-1.9F, 0.0F, 0.0F);
		zombie.addChild(right_leg);
		setRotationAngle(right_leg, -0.8727F, 0.0F, 0.8727F);
		right_leg.texOffs(48, 0).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(1.9F, 0.0F, 0.0F);
		zombie.addChild(left_leg);
		setRotationAngle(left_leg, -0.8727F, 0.0F, -0.8727F);
		left_leg.texOffs(48, 0).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		dolphin = new ModelRenderer(this);
		dolphin.setPos(0.0F, 0.0F, -3.0F);
		total.addChild(dolphin);
		dolphin.texOffs(22, 19).addBox(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F, 0.0F, false);

		dolphin_head = new ModelRenderer(this);
		dolphin_head.setPos(0.0F, -4.0F, -3.0F);
		dolphin.addChild(dolphin_head);
		dolphin_head.texOffs(0, 33).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setPos(0.0F, 4.0F, -3.0F);
		dolphin_head.addChild(nose);
		nose.texOffs(51, 26).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -2.5F, 14.0F);
		dolphin.addChild(tail);
		tail.texOffs(0, 46).addBox(-2.0F, -2.5F, -1.0F, 4.0F, 5.0F, 11.0F, 0.0F, false);

		tail_fin = new ModelRenderer(this);
		tail_fin.setPos(0.0F, 0.0F, 9.0F);
		tail.addChild(tail_fin);
		tail_fin.texOffs(32, 40).addBox(-5.0F, -0.5F, -1.0F, 10.0F, 1.0F, 6.0F, 0.0F, false);

		back_fin = new ModelRenderer(this);
		back_fin.setPos(0.0F, -11.0F, -2.0F);
		dolphin.addChild(back_fin);
		back_fin.texOffs(51, 16).addBox(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		left_fin = new ModelRenderer(this);
		left_fin.setPos(4.5F, 0.0F, 1.0F);
		dolphin.addChild(left_fin);
		left_fin.texOffs(48, 48).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);

		right_fin = new ModelRenderer(this);
		right_fin.setPos(-4.5F, 0.0F, 1.0F);
		dolphin.addChild(right_fin);
		right_fin.texOffs(48, 48).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(DolphinRiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = -0.4363F + headPitch / (180F / (float) Math.PI);
		this.tail.xRot = 0.0F;
		this.tail_fin.xRot = 0.0F;
		if (Entity.getHorizontalDistanceSqr(entity.getDeltaMovement()) > 1.0E-7D) {
			this.tail.xRot = -0.1F * MathHelper.cos(ageInTicks * 0.3F);
			this.tail_fin.xRot = -0.2F * MathHelper.cos(ageInTicks * 0.3F);
		}
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}