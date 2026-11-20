package com.hungteen.pvz.client.model.entity.misc;

import com.hungteen.pvz.common.entity.misc.BobsleCarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings


public class BobsleCarModel extends EntityModel<BobsleCarEntity> {
	private final ModelRenderer total;
	private final ModelRenderer mid;
	private final ModelRenderer right;
	private final ModelRenderer cube_r1;
	private final ModelRenderer left;
	private final ModelRenderer cube_r2;
	private final ModelRenderer seat1;
	private final ModelRenderer seat2;
	private final ModelRenderer seat3;
	private final ModelRenderer seat4;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer wheal;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer wheal2;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer wheal3;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer wheal4;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public BobsleCarModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		mid = new ModelRenderer(this);
		mid.setPos(0.0F, -4.0F, 12.0F);
		total.addChild(mid);
		mid.texOffs(0, 98).addBox(-9.0F, 1.0F, -31.0F, 18.0F, 2.0F, 28.0F, 0.0F, false);
		mid.texOffs(0, 98).addBox(-9.0F, 1.0F, -3.0F, 18.0F, 2.0F, 28.0F, 0.0F, false);

		right = new ModelRenderer(this);
		right.setPos(-9.0F, 2.0F, -11.0F);
		mid.addChild(right);
		right.texOffs(4, 10).addBox(-1.0F, -18.0F, -20.0F, 2.0F, 18.0F, 60.0F, 0.0F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.5F, 0.0F, -4.5F);
		right.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.6545F, 0.0F);
		cube_r1.texOffs(6, 54).addBox(-2.0F, -8.0F, -15.0F, 13.0F, 1.0F, 9.0F, 0.0F, false);

		left = new ModelRenderer(this);
		left.setPos(9.0F, 2.0F, -11.0F);
		mid.addChild(left);
		left.texOffs(4, 10).addBox(-1.0F, -18.0F, -20.0F, 2.0F, 18.0F, 60.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-9.0F, 0.0F, -11.0F);
		left.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.6545F, 0.0F);
		cube_r2.texOffs(7, 54).addBox(-1.0F, -8.0F, -15.0F, 13.0F, 1.0F, 9.0F, 0.0F, false);

		seat1 = new ModelRenderer(this);
		seat1.setPos(2.0F, 0.0F, -13.0F);
		mid.addChild(seat1);
		seat1.texOffs(70, 0).addBox(-7.5F, -2.0F, -9.0F, 11.0F, 2.0F, 10.0F, 0.0F, false);
		seat1.texOffs(70, 14).addBox(-7.5F, -12.0F, -1.0F, 11.0F, 10.0F, 2.0F, 0.0F, false);

		seat2 = new ModelRenderer(this);
		seat2.setPos(2.0F, 0.0F, 0.0F);
		mid.addChild(seat2);
		seat2.texOffs(70, 0).addBox(-7.5F, -2.0F, -9.0F, 11.0F, 2.0F, 10.0F, 0.0F, false);
		seat2.texOffs(70, 14).addBox(-7.5F, -12.0F, -1.0F, 11.0F, 10.0F, 2.0F, 0.0F, false);

		seat3 = new ModelRenderer(this);
		seat3.setPos(2.0F, 0.0F, 11.0F);
		mid.addChild(seat3);
		seat3.texOffs(70, 0).addBox(-7.5F, -2.0F, -9.0F, 11.0F, 2.0F, 10.0F, 0.0F, false);
		seat3.texOffs(70, 14).addBox(-7.5F, -12.0F, -1.0F, 11.0F, 10.0F, 2.0F, 0.0F, false);

		seat4 = new ModelRenderer(this);
		seat4.setPos(2.0F, 0.0F, 23.0F);
		mid.addChild(seat4);
		seat4.texOffs(70, 0).addBox(-7.5F, -2.0F, -9.0F, 11.0F, 2.0F, 10.0F, 0.0F, false);
		seat4.texOffs(70, 14).addBox(-7.5F, -12.0F, -1.0F, 11.0F, 10.0F, 2.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, -2.0F, -19.0F);
		total.addChild(Head);
		Head.texOffs(69, 47).addBox(-9.0F, -14.0F, -7.0F, 18.0F, 14.0F, 8.0F, 0.0F, false);
		Head.texOffs(12, 89).addBox(-8.0F, -18.0F, 0.0F, 16.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(6.0F, 9.0F, -1.0F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
		cube_r3.texOffs(0, 26).addBox(-0.98F, -27.0F, -6.0F, 0.0F, 10.0F, 10.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-4.0F, 9.0F, -1.0F);
		Head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
		cube_r4.texOffs(0, 26).addBox(-0.98F, -27.0F, -6.0F, 0.0F, 10.0F, 10.0F, 0.0F, false);

		wheal = new ModelRenderer(this);
		wheal.setPos(-9.0F, 2.0F, -17.0F);
		total.addChild(wheal);


		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.5F, -1.0F, -8.5F);
		wheal.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.5708F, 0.0F, 0.0F);
		cube_r5.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.5F, -1.0F, -3.0F);
		wheal.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.5708F, 0.0F, 0.0F);
		cube_r6.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.5F, -1.0F, 2.5F);
		wheal.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.5708F, 0.0F, 0.0F);
		cube_r7.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.5F, 0.0F, 0.5F);
		wheal.addChild(cube_r8);
		setRotationAngle(cube_r8, -1.5708F, 0.0F, 0.0F);
		cube_r8.texOffs(27, 15).addBox(-1.0F, -17.0F, -3.0F, 0.0F, 17.0F, 1.0F, 0.0F, false);

		wheal2 = new ModelRenderer(this);
		wheal2.setPos(11.0F, 2.0F, -17.0F);
		total.addChild(wheal2);


		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(-0.5F, -1.0F, -8.5F);
		wheal2.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.5708F, 0.0F, 0.0F);
		cube_r9.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(-0.5F, -1.0F, -3.0F);
		wheal2.addChild(cube_r10);
		setRotationAngle(cube_r10, -1.5708F, 0.0F, 0.0F);
		cube_r10.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(-0.5F, -1.0F, 2.5F);
		wheal2.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.5708F, 0.0F, 0.0F);
		cube_r11.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(-0.5F, 0.0F, 0.5F);
		wheal2.addChild(cube_r12);
		setRotationAngle(cube_r12, -1.5708F, 0.0F, 0.0F);
		cube_r12.texOffs(27, 15).addBox(-1.0F, -17.0F, -3.0F, 0.0F, 17.0F, 1.0F, 0.0F, false);

		wheal3 = new ModelRenderer(this);
		wheal3.setPos(-8.0F, 2.0F, 17.0F);
		total.addChild(wheal3);


		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(-0.5F, -1.0F, -8.5F);
		wheal3.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.5708F, 0.0F, 0.0F);
		cube_r13.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(-0.5F, -1.0F, -3.0F);
		wheal3.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.5708F, 0.0F, 0.0F);
		cube_r14.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(-0.5F, -1.0F, 2.5F);
		wheal3.addChild(cube_r15);
		setRotationAngle(cube_r15, -1.5708F, 0.0F, 0.0F);
		cube_r15.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(-0.5F, 0.0F, 0.5F);
		wheal3.addChild(cube_r16);
		setRotationAngle(cube_r16, -1.5708F, 0.0F, 0.0F);
		cube_r16.texOffs(27, 15).addBox(-1.0F, -17.0F, -3.0F, 0.0F, 17.0F, 1.0F, 0.0F, false);

		wheal4 = new ModelRenderer(this);
		wheal4.setPos(11.0F, 2.0F, 17.0F);
		total.addChild(wheal4);


		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(-0.5F, -1.0F, -8.5F);
		wheal4.addChild(cube_r17);
		setRotationAngle(cube_r17, -1.5708F, 0.0F, 0.0F);
		cube_r17.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(-0.5F, -1.0F, -3.0F);
		wheal4.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.5708F, 0.0F, 0.0F);
		cube_r18.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setPos(-0.5F, -1.0F, 2.5F);
		wheal4.addChild(cube_r19);
		setRotationAngle(cube_r19, -1.5708F, 0.0F, 0.0F);
		cube_r19.texOffs(28, 15).addBox(-1.0F, -13.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setPos(-0.5F, 0.0F, 0.5F);
		wheal4.addChild(cube_r20);
		setRotationAngle(cube_r20, -1.5708F, 0.0F, 0.0F);
		cube_r20.texOffs(27, 15).addBox(-1.0F, -17.0F, -3.0F, 0.0F, 17.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -4.0F, 39.0F);
		total.addChild(tail);
		tail.texOffs(11, 59).addBox(-9.0F, 2.0F, -2.0F, 18.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setPos(0.0F, 1.5F, 0.0F);
		tail.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.9599F, 0.0F, 0.0F);
		cube_r21.texOffs(9, 58).addBox(-10.0F, 0.0F, 0.0F, 20.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setPos(-9.0F, 0.0F, 3.0F);
		tail.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.9599F, 0.0F, 0.0F);
		cube_r22.texOffs(82, 12).addBox(-1.01F, -10.0F, -3.0F, 2.0F, 10.0F, 21.0F, 0.0F, false);
		cube_r22.texOffs(69, 88).addBox(17.01F, -10.0F, -3.0F, 2.0F, 10.0F, 21.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(BobsleCarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
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