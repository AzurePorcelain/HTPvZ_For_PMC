package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.api.paz.IZombieModel;
import com.hungteen.pvz.client.model.entity.PVZEntityModel;
import com.hungteen.pvz.common.entity.zombie.pool.ZomboniEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings


public class ZomboniModel extends PVZEntityModel<ZomboniEntity> implements IZombieModel<ZomboniEntity>{
	private final ModelRenderer total;
	private final ModelRenderer zombie;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_pants;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_pants;
	private final ModelRenderer up;
	private final ModelRenderer left_hand;
	private final ModelRenderer left_sleeve;
	private final ModelRenderer body;
	private final ModelRenderer jacket;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_sleeve;
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer root;
	private final ModelRenderer bottom;
	private final ModelRenderer back;
	private final ModelRenderer front;
	private final ModelRenderer right;
	private final ModelRenderer left;
	private final ModelRenderer car;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer lunzi;
	private final ModelRenderer tyre_leftfront;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer tyre_leftfront2;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer tyre_leftfront3;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer tyre_leftfront4;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer ice;
	private final ModelRenderer ice2;

	public ZomboniModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);
		

		zombie = new ModelRenderer(this);
		zombie.setPos(-1.9F, -12.0F, 7.0F);
		total.addChild(zombie);
		

		right_leg = new ModelRenderer(this);
		right_leg.setPos(0.0F, 0.0F, 0.0F);
		zombie.addChild(right_leg);
		setRotationAngle(right_leg, -1.2217F, 0.2182F, 0.0873F);
		right_leg.texOffs(90, 56).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_pants = new ModelRenderer(this);
		right_pants.setPos(1.9F, 12.0F, 0.0F);
		right_leg.addChild(right_pants);
		right_pants.texOffs(0, 94).addBox(-3.9F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(3.8F, 0.0F, 0.0F);
		zombie.addChild(left_leg);
		setRotationAngle(left_leg, -1.2217F, -0.2182F, -0.0873F);
		left_leg.texOffs(16, 94).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_pants = new ModelRenderer(this);
		left_pants.setPos(-1.9F, 12.0F, 0.0F);
		left_leg.addChild(left_pants);
		left_pants.texOffs(56, 95).addBox(-0.1F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		up = new ModelRenderer(this);
		up.setPos(1.9F, 12.0F, 0.0F);
		zombie.addChild(up);
		

		left_hand = new ModelRenderer(this);
		left_hand.setPos(5.0F, -22.0F, 0.0F);
		up.addChild(left_hand);
		setRotationAngle(left_hand, -1.2217F, 0.1309F, 0.0F);
		left_hand.texOffs(96, 100).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		left_sleeve = new ModelRenderer(this);
		left_sleeve.setPos(-5.0F, 22.0F, 0.0F);
		left_hand.addChild(left_sleeve);
		left_sleeve.texOffs(32, 104).addBox(4.0F, -24.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -24.0F, 0.0F);
		up.addChild(body);
		body.texOffs(84, 84).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		jacket = new ModelRenderer(this);
		jacket.setPos(0.0F, 24.0F, 0.0F);
		body.addChild(jacket);
		jacket.texOffs(32, 88).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-5.0F, -22.0F, 0.0F);
		up.addChild(right_hand);
		setRotationAngle(right_hand, -1.2217F, -0.1309F, 0.0F);
		right_hand.texOffs(106, 56).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		right_sleeve = new ModelRenderer(this);
		right_sleeve.setPos(5.0F, 22.0F, 0.0F);
		right_hand.addChild(right_sleeve);
		right_sleeve.texOffs(72, 108).addBox(-7.0F, -24.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -24.0F, 0.0F);
		up.addChild(head);
		head.texOffs(0, 78).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(hat);
		hat.texOffs(78, 30).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
		hat.texOffs(108, 84).addBox(-3.5F, -34.2412F, 1.0755F, 7.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -33.5F, 3.5F);
		hat.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.texOffs(78, 56).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.5F, -31.577F, -2.5164F);
		hat.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
		cube_r2.texOffs(72, 100).addBox(-4.0F, -2.0F, -1.0F, 7.0F, 3.0F, 5.0F, 0.0F, false);

		root = new ModelRenderer(this);
		root.setPos(1.9F, 2.0F, -5.0F);
		zombie.addChild(root);
		setRotationAngle(root, 0.0F, 1.5708F, 0.0F);
		

		bottom = new ModelRenderer(this);
		bottom.setPos(0.0F, 4.0F, 0.0F);
		root.addChild(bottom);
		setRotationAngle(bottom, 1.5708F, 0.0F, 0.0F);
		bottom.texOffs(0, 60).addBox(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F, 0.0F, false);

		back = new ModelRenderer(this);
		back.setPos(-9.0F, 4.0F, 0.0F);
		root.addChild(back);
		setRotationAngle(back, 0.0F, 4.7124F, 0.0F);
		back.texOffs(78, 46).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		front = new ModelRenderer(this);
		front.setPos(9.0F, 4.0F, 0.0F);
		root.addChild(front);
		setRotationAngle(front, 0.0F, 1.5708F, 0.0F);
		front.texOffs(78, 46).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		right = new ModelRenderer(this);
		right.setPos(0.0F, 4.0F, -7.0F);
		root.addChild(right);
		setRotationAngle(right, 0.0F, 3.1416F, 0.0F);
		right.texOffs(78, 46).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		left = new ModelRenderer(this);
		left.setPos(0.0F, 4.0F, 7.0F);
		root.addChild(left);
		left.texOffs(78, 46).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		car = new ModelRenderer(this);
		car.setPos(0.0F, -12.593F, -9.3935F);
		total.addChild(car);
		car.texOffs(0, 0).addBox(-7.5F, -4.407F, -17.6065F, 15.0F, 13.0F, 23.0F, 0.0F, false);
		car.texOffs(44, 74).addBox(0.0F, 7.593F, 5.3935F, 7.0F, 1.0F, 13.0F, 0.0F, false);
		car.texOffs(44, 74).addBox(-7.0F, 7.593F, 5.3935F, 7.0F, 1.0F, 13.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-5.3068F, -3.6359F, 9.7756F);
		car.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2618F, -0.1745F, 0.0F);
		cube_r3.texOffs(32, 78).addBox(0.0F, -7.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(5.3068F, -3.6359F, 9.7756F);
		car.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2618F, 0.1745F, 0.0F);
		cube_r4.texOffs(32, 78).addBox(-2.0F, -7.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-4.25F, -2.6359F, 6.6618F);
		car.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
		cube_r5.texOffs(0, 110).addBox(-0.5F, -1.0F, -2.75F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(4.25F, -2.6359F, 6.6618F);
		car.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
		cube_r6.texOffs(0, 110).addBox(-1.5F, -1.0F, -2.75F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(-0.5F, -6.3188F, -14.3856F);
		car.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
		cube_r7.texOffs(84, 79).addBox(-8.0F, -1.0F, -1.5F, 17.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r7.texOffs(76, 21).addBox(-8.0F, -1.0F, -0.5F, 17.0F, 5.0F, 4.0F, 0.0F, false);
		cube_r7.texOffs(76, 11).addBox(-8.0F, -1.0F, 3.5F, 17.0F, 6.0F, 4.0F, 0.0F, false);
		cube_r7.texOffs(76, 0).addBox(-8.0F, -1.0F, 7.5F, 17.0F, 7.0F, 4.0F, 0.0F, false);
		cube_r7.texOffs(44, 60).addBox(-8.0F, -1.0F, 11.5F, 17.0F, 8.0F, 6.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(-0.5F, -14.6149F, 3.2752F);
		car.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.8727F, 0.0F, 0.0F);
		cube_r8.texOffs(84, 74).addBox(-8.0F, -10.0F, -21.0F, 17.0F, 2.0F, 3.0F, -0.03F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(-0.5F, 8.593F, 1.1435F);
		car.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
		cube_r9.texOffs(0, 36).addBox(-8.0F, -10.0F, -21.0F, 17.0F, 2.0F, 22.0F, 0.02F, false);

		lunzi = new ModelRenderer(this);
		lunzi.setPos(1.0F, 12.593F, 9.3935F);
		car.addChild(lunzi);
		

		tyre_leftfront = new ModelRenderer(this);
		tyre_leftfront.setPos(6.5F, -3.6287F, -23.0F);
		lunzi.addChild(tyre_leftfront);
		tyre_leftfront.texOffs(46, 104).addBox(-1.0F, -3.6213F, -1.5F, 2.0F, 3.0F, 3.0F, 0.02F, false);
		tyre_leftfront.texOffs(86, 108).addBox(-0.75F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(0.0F, 0.6213F, -0.0858F);
		tyre_leftfront.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.7854F, 0.0F, 0.0F);
		cube_r10.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(0.0F, 0.5F, 0.3787F);
		tyre_leftfront.addChild(cube_r11);
		setRotationAngle(cube_r11, 1.5708F, 0.0F, 0.0F);
		cube_r11.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(0.0F, 0.0858F, 0.6213F);
		tyre_leftfront.addChild(cube_r12);
		setRotationAngle(cube_r12, 2.3562F, 0.0F, 0.0F);
		cube_r12.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(0.0F, -0.3787F, 0.5F);
		tyre_leftfront.addChild(cube_r13);
		setRotationAngle(cube_r13, 3.1416F, 0.0F, 0.0F);
		cube_r13.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.02F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(0.0F, -0.6213F, 0.0858F);
		tyre_leftfront.addChild(cube_r14);
		setRotationAngle(cube_r14, -2.3562F, 0.0F, 0.0F);
		cube_r14.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(0.0F, -0.5F, -0.3787F);
		tyre_leftfront.addChild(cube_r15);
		setRotationAngle(cube_r15, -1.5708F, 0.0F, 0.0F);
		cube_r15.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(0.0F, -0.0858F, -0.6213F);
		tyre_leftfront.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		tyre_leftfront2 = new ModelRenderer(this);
		tyre_leftfront2.setPos(-8.5F, -3.6287F, -23.0F);
		lunzi.addChild(tyre_leftfront2);
		tyre_leftfront2.texOffs(46, 104).addBox(-1.0F, -3.6213F, -1.5F, 2.0F, 3.0F, 3.0F, 0.02F, true);
		tyre_leftfront2.texOffs(86, 108).addBox(-1.25F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(0.0F, 0.6213F, -0.0858F);
		tyre_leftfront2.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.7854F, 0.0F, 0.0F);
		cube_r17.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(0.0F, 0.5F, 0.3787F);
		tyre_leftfront2.addChild(cube_r18);
		setRotationAngle(cube_r18, 1.5708F, 0.0F, 0.0F);
		cube_r18.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, true);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setPos(0.0F, 0.0858F, 0.6213F);
		tyre_leftfront2.addChild(cube_r19);
		setRotationAngle(cube_r19, 2.3562F, 0.0F, 0.0F);
		cube_r19.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setPos(0.0F, -0.3787F, 0.5F);
		tyre_leftfront2.addChild(cube_r20);
		setRotationAngle(cube_r20, 3.1416F, 0.0F, 0.0F);
		cube_r20.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.02F, true);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setPos(0.0F, -0.6213F, 0.0858F);
		tyre_leftfront2.addChild(cube_r21);
		setRotationAngle(cube_r21, -2.3562F, 0.0F, 0.0F);
		cube_r21.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setPos(0.0F, -0.5F, -0.3787F);
		tyre_leftfront2.addChild(cube_r22);
		setRotationAngle(cube_r22, -1.5708F, 0.0F, 0.0F);
		cube_r22.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, true);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setPos(0.0F, -0.0858F, -0.6213F);
		tyre_leftfront2.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.7854F, 0.0F, 0.0F);
		cube_r23.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		tyre_leftfront3 = new ModelRenderer(this);
		tyre_leftfront3.setPos(6.5F, -3.6287F, -6.0F);
		lunzi.addChild(tyre_leftfront3);
		tyre_leftfront3.texOffs(46, 104).addBox(-1.0F, -3.6213F, -1.5F, 2.0F, 3.0F, 3.0F, 0.02F, false);
		tyre_leftfront3.texOffs(86, 108).addBox(-0.75F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setPos(0.0F, 0.6213F, -0.0858F);
		tyre_leftfront3.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.7854F, 0.0F, 0.0F);
		cube_r24.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setPos(0.0F, 0.5F, 0.3787F);
		tyre_leftfront3.addChild(cube_r25);
		setRotationAngle(cube_r25, 1.5708F, 0.0F, 0.0F);
		cube_r25.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setPos(0.0F, 0.0858F, 0.6213F);
		tyre_leftfront3.addChild(cube_r26);
		setRotationAngle(cube_r26, 2.3562F, 0.0F, 0.0F);
		cube_r26.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setPos(0.0F, -0.3787F, 0.5F);
		tyre_leftfront3.addChild(cube_r27);
		setRotationAngle(cube_r27, 3.1416F, 0.0F, 0.0F);
		cube_r27.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.02F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setPos(0.0F, -0.6213F, 0.0858F);
		tyre_leftfront3.addChild(cube_r28);
		setRotationAngle(cube_r28, -2.3562F, 0.0F, 0.0F);
		cube_r28.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setPos(0.0F, -0.5F, -0.3787F);
		tyre_leftfront3.addChild(cube_r29);
		setRotationAngle(cube_r29, -1.5708F, 0.0F, 0.0F);
		cube_r29.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setPos(0.0F, -0.0858F, -0.6213F);
		tyre_leftfront3.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.7854F, 0.0F, 0.0F);
		cube_r30.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		tyre_leftfront4 = new ModelRenderer(this);
		tyre_leftfront4.setPos(-8.5F, -3.6287F, -6.0F);
		lunzi.addChild(tyre_leftfront4);
		tyre_leftfront4.texOffs(46, 104).addBox(-1.0F, -3.6213F, -1.5F, 2.0F, 3.0F, 3.0F, 0.02F, true);
		tyre_leftfront4.texOffs(86, 108).addBox(-1.25F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setPos(0.0F, 0.6213F, -0.0858F);
		tyre_leftfront4.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.7854F, 0.0F, 0.0F);
		cube_r31.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setPos(0.0F, 0.5F, 0.3787F);
		tyre_leftfront4.addChild(cube_r32);
		setRotationAngle(cube_r32, 1.5708F, 0.0F, 0.0F);
		cube_r32.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, true);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setPos(0.0F, 0.0858F, 0.6213F);
		tyre_leftfront4.addChild(cube_r33);
		setRotationAngle(cube_r33, 2.3562F, 0.0F, 0.0F);
		cube_r33.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r34 = new ModelRenderer(this);
		cube_r34.setPos(0.0F, -0.3787F, 0.5F);
		tyre_leftfront4.addChild(cube_r34);
		setRotationAngle(cube_r34, 3.1416F, 0.0F, 0.0F);
		cube_r34.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.02F, true);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setPos(0.0F, -0.6213F, 0.0858F);
		tyre_leftfront4.addChild(cube_r35);
		setRotationAngle(cube_r35, -2.3562F, 0.0F, 0.0F);
		cube_r35.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setPos(0.0F, -0.5F, -0.3787F);
		tyre_leftfront4.addChild(cube_r36);
		setRotationAngle(cube_r36, -1.5708F, 0.0F, 0.0F);
		cube_r36.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, true);

		cube_r37 = new ModelRenderer(this);
		cube_r37.setPos(0.0F, -0.0858F, -0.6213F);
		tyre_leftfront4.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.7854F, 0.0F, 0.0F);
		cube_r37.texOffs(46, 104).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		ice = new ModelRenderer(this);
		ice.setPos(0.0F, 8.7308F, 14.1618F);
		car.addChild(ice);
		ice.texOffs(16, 110).addBox(-3.0F, -1.1667F, -1.0F, 6.0F, 3.0F, 2.0F, 0.0F, false);
		ice.texOffs(56, 88).addBox(0.0F, 2.8333F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);
		ice.texOffs(56, 88).addBox(-7.0F, 2.8333F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, true);
		ice.texOffs(110, 30).addBox(0.0F, 1.8333F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		ice.texOffs(110, 30).addBox(-5.0F, 1.8333F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, true);

		ice2 = new ModelRenderer(this);
		ice2.setPos(0.0F, 9.1141F, -6.8382F);
		car.addChild(ice2);
		ice2.texOffs(72, 95).addBox(-2.0F, -1.75F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		ice2.texOffs(108, 90).addBox(0.0F, 1.25F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		ice2.texOffs(108, 90).addBox(-6.0F, 1.25F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(ZomboniEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.ice2.xRot=MathHelper.sin(ageInTicks/20)/2;
		this.tyre_leftfront.xRot=ageInTicks%360;
		this.tyre_leftfront2.xRot=ageInTicks%360;
		this.tyre_leftfront3.xRot=ageInTicks%360;
		this.tyre_leftfront4.xRot=ageInTicks%360;
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void tickPartAnim(IBodyEntity entity, float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderBody(IBodyEntity entity, MatrixStack stack, IVertexBuilder buffer, int packedLight,
			int packedOverlay) {
		this.total.render(stack, buffer, packedLight, packedOverlay);
	}

	@Override
	public EntityModel<ZomboniEntity> getZombieModel() {
		return this;
	}
}