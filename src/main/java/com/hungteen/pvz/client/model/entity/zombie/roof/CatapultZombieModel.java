package com.hungteen.pvz.client.model.entity.zombie.roof;

import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.api.paz.IZombieModel;
import com.hungteen.pvz.client.model.entity.PVZEntityModel;
import com.hungteen.pvz.common.entity.zombie.roof.CatapultZombieEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class CatapultZombieModel extends PVZEntityModel<CatapultZombieEntity> implements IZombieModel<CatapultZombieEntity>{
	private final ModelRenderer total;
	private final ModelRenderer zombie;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_pants;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_pants;
	private final ModelRenderer up;
	private final ModelRenderer left_hand;
	private final ModelRenderer left_sleeve;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_sleeve;
	private final ModelRenderer body;
	private final ModelRenderer jacket;
	private final ModelRenderer head;
	private final ModelRenderer helmet;
	private final ModelRenderer hat;
	private final ModelRenderer root;
	private final ModelRenderer bottom;
	private final ModelRenderer back;
	private final ModelRenderer front;
	private final ModelRenderer right;
	private final ModelRenderer left;
	private final ModelRenderer car;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer level;
	private final ModelRenderer lunzi;
	private final ModelRenderer tyre_leftfront;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer tyre_leftfront2;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer tyre_leftfront3;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer tyre_leftfront4;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer pult;
	private final ModelRenderer cube_r41;
	private final ModelRenderer pult2;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer ball1;
	private final ModelRenderer ball2;
	private final ModelRenderer ball3;
	private final ModelRenderer ball4;
	private final ModelRenderer ball5;
	private final ModelRenderer tanhuang;

	public CatapultZombieModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		zombie = new ModelRenderer(this);
		zombie.setPos(-4.0F, -1.0F, 0.5F);
		total.addChild(zombie);


		right_leg = new ModelRenderer(this);
		right_leg.setPos(-1.9F, -12.0F, 0.5F);
		zombie.addChild(right_leg);
		setRotationAngle(right_leg, -1.2217F, 0.2618F, 0.0F);
		right_leg.texOffs(50, 90).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		right_pants = new ModelRenderer(this);
		right_pants.setPos(0.0F, 0.0F, 0.0F);
		right_leg.addChild(right_pants);
		right_pants.texOffs(68, 90).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(1.9F, -12.0F, 0.5F);
		zombie.addChild(left_leg);
		setRotationAngle(left_leg, -1.2217F, -0.2618F, 0.0F);
		left_leg.texOffs(50, 90).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.0F, true);

		left_pants = new ModelRenderer(this);
		left_pants.setPos(0.0F, 0.0F, 0.0F);
		left_leg.addChild(left_pants);
		left_pants.texOffs(68, 90).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.25F, true);

		up = new ModelRenderer(this);
		up.setPos(0.0F, 0.0F, 0.0F);
		zombie.addChild(up);


		left_hand = new ModelRenderer(this);
		left_hand.setPos(5.0F, -22.0F, 0.5F);
		up.addChild(left_hand);
		setRotationAngle(left_hand, -0.6109F, 0.0F, 0.0873F);
		left_hand.texOffs(86, 90).addBox(-1.0F, -2.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		left_sleeve = new ModelRenderer(this);
		left_sleeve.setPos(0.0F, 0.0F, 0.0F);
		left_hand.addChild(left_sleeve);
		left_sleeve.texOffs(92, 32).addBox(-1.0F, -2.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.25F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-5.0F, -22.0F, 0.5F);
		up.addChild(right_hand);
		setRotationAngle(right_hand, -1.3087F, -0.0869F, -0.0076F);
		right_hand.texOffs(96, 70).addBox(-3.0F, -2.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		right_sleeve = new ModelRenderer(this);
		right_sleeve.setPos(0.0F, 0.0F, 0.0F);
		right_hand.addChild(right_sleeve);
		right_sleeve.texOffs(0, 102).addBox(-3.0F, -2.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.25F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -24.0F, 0.5F);
		up.addChild(body);
		body.texOffs(84, 53).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 12.0F, 5.0F, 0.0F, false);

		jacket = new ModelRenderer(this);
		jacket.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(jacket);
		jacket.texOffs(0, 85).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 12.0F, 5.0F, 0.25F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -24.0F, 0.5F);
		up.addChild(head);
		head.texOffs(70, 0).addBox(-4.5F, -8.0F, -4.0F, 9.0F, 8.0F, 8.0F, 0.0F, false);

		helmet = new ModelRenderer(this);
		helmet.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(helmet);


		hat = new ModelRenderer(this);
		hat.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(hat);


		root = new ModelRenderer(this);
		root.setPos(0.2F, -10.0F, -3.5F);
		zombie.addChild(root);
		setRotationAngle(root, 0.0F, 1.5708F, 0.0F);


		bottom = new ModelRenderer(this);
		bottom.setPos(0.0F, 4.0F, 0.0F);
		root.addChild(bottom);
		setRotationAngle(bottom, 1.5708F, 0.0F, 0.0F);
		bottom.texOffs(48, 35).addBox(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F, 0.0F, false);

		back = new ModelRenderer(this);
		back.setPos(-9.0F, 4.0F, 0.0F);
		root.addChild(back);
		setRotationAngle(back, 0.0F, 4.7124F, 0.0F);
		back.texOffs(0, 75).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		front = new ModelRenderer(this);
		front.setPos(9.0F, 4.0F, 0.0F);
		root.addChild(front);
		setRotationAngle(front, 0.0F, 1.5708F, 0.0F);
		front.texOffs(0, 75).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		right = new ModelRenderer(this);
		right.setPos(0.0F, 4.0F, -7.0F);
		root.addChild(right);
		setRotationAngle(right, 0.0F, 3.1416F, 0.0F);
		right.texOffs(0, 75).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);

		left = new ModelRenderer(this);
		left.setPos(0.0F, 4.0F, 7.0F);
		root.addChild(left);
		left.texOffs(0, 75).addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F, false);
		left.texOffs(104, 103).addBox(-0.5F, -4.75F, 1.0F, 6.0F, 5.0F, 2.0F, 0.0F, false);

		car = new ModelRenderer(this);
		car.setPos(1.0F, 0.0F, 0.0F);
		total.addChild(car);
		car.texOffs(0, 0).addBox(-11.0F, -7.0F, -16.0F, 6.0F, 6.0F, 29.0F, 0.0F, false);
		car.texOffs(0, 0).addBox(3.0F, -7.0F, -16.0F, 6.0F, 6.0F, 29.0F, 0.0F, true);
		car.texOffs(102, 16).addBox(3.0F, -7.0F, -3.0F, 6.0F, 6.0F, 5.0F, 0.499F, false);
		car.texOffs(104, 8).addBox(4.0F, -11.0F, -7.5F, 5.0F, 4.0F, 4.0F, 0.2F, false);
		car.texOffs(34, 68).addBox(3.5F, -11.5F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		car.texOffs(34, 68).addBox(3.5F, -11.5F, -7.9F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		car.texOffs(34, 68).addBox(3.5F, -7.5F, -8.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		car.texOffs(34, 68).addBox(3.5F, -7.5F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		car.texOffs(0, 35).addBox(-2.25F, -13.0F, -1.0F, 11.0F, 7.0F, 13.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(6.5F, -9.0F, -5.5F);
		car.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.texOffs(34, 68).addBox(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, 0.1F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(6.0F, -3.5F, -5.0F);
		car.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.texOffs(0, 55).addBox(-4.0F, -3.0F, 0.0F, 5.0F, 5.0F, 12.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(6.0F, -3.5F, 10.0F);
		car.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.texOffs(0, 55).addBox(-4.0F, -3.0F, 0.0F, 5.0F, 5.0F, 12.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(6.0F, -3.5F, 5.0F);
		car.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.texOffs(0, 55).addBox(-4.0F, -3.0F, 0.0F, 5.0F, 5.0F, 12.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(6.0F, -3.5F, 0.0F);
		car.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
		cube_r5.texOffs(0, 55).addBox(-4.0F, -3.0F, 0.0F, 5.0F, 5.0F, 12.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(7.0F, -22.5F, -10.0F);
		car.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.5708F, 0.0F, 0.0F);
		cube_r6.texOffs(34, 102).addBox(-3.0F, -3.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r6.texOffs(34, 102).addBox(-9.0F, -3.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(1.0F, -18.5F, -10.0F);
		car.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.5708F, 0.0F, 0.0F);
		cube_r7.texOffs(70, 16).addBox(-3.0F, -3.0F, 0.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
		cube_r7.texOffs(70, 16).addBox(3.0F, -3.0F, 0.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(6.0F, -15.5F, -6.5F);
		car.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.9599F, 0.0F, 0.0F);
		cube_r8.texOffs(36, 75).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 3.0F, 12.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(6.0F, -3.5F, -10.0F);
		car.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -1.5708F, 0.0F);
		cube_r9.texOffs(0, 55).addBox(-4.0F, -3.0F, 0.0F, 5.0F, 5.0F, 12.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(-1.0F, -4.5784F, -16.15F);
		car.addChild(bone);
		setRotationAngle(bone, -0.0873F, 0.0F, 0.0F);


		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(0.0F, -2.8284F, 0.0F);
		bone.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
		cube_r10.texOffs(34, 71).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
		cube_r11.texOffs(34, 71).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(0.0F, 2.8284F, 0.0F);
		bone.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
		cube_r12.texOffs(34, 71).addBox(-10.0F, -1.0F, -1.0F, 20.0F, 2.0F, 2.0F, 0.0F, false);

		level = new ModelRenderer(this);
		level.setPos(3.0F, -18.5F, -9.0F);
		car.addChild(level);
		setRotationAngle(level, -0.7418F, 0.0F, 0.0F);
		level.texOffs(92, 49).addBox(0.5F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		level.texOffs(78, 71).addBox(-6.5F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		level.texOffs(78, 71).addBox(-14.5F, -4.0F, -1.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		level.texOffs(42, 55).addBox(-7.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		lunzi = new ModelRenderer(this);
		lunzi.setPos(0.0F, 0.0F, 0.0F);
		car.addChild(lunzi);


		tyre_leftfront = new ModelRenderer(this);
		tyre_leftfront.setPos(10.04F, -3.3829F, -12.0F);
		lunzi.addChild(tyre_leftfront);
		tyre_leftfront.texOffs(62, 107).addBox(-1.04F, -3.6171F, -1.5F, 2.0F, 3.0F, 3.0F, 0.02F, false);
		tyre_leftfront.texOffs(72, 107).addBox(-0.79F, -1.5171F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		tyre_leftfront.texOffs(42, 60).addBox(-0.89F, -0.5171F, -0.5F, 2.0F, 1.0F, 1.0F, 0.2F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(-0.04F, 0.6256F, -0.0858F);
		tyre_leftfront.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
		cube_r13.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(-0.04F, 0.5043F, 0.3787F);
		tyre_leftfront.addChild(cube_r14);
		setRotationAngle(cube_r14, 1.5708F, 0.0F, 0.0F);
		cube_r14.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(-0.04F, 0.0901F, 0.6213F);
		tyre_leftfront.addChild(cube_r15);
		setRotationAngle(cube_r15, 2.3562F, 0.0F, 0.0F);
		cube_r15.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(-0.04F, -0.3744F, 0.5F);
		tyre_leftfront.addChild(cube_r16);
		setRotationAngle(cube_r16, 3.1416F, 0.0F, 0.0F);
		cube_r16.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.02F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(-0.04F, -0.6171F, 0.0858F);
		tyre_leftfront.addChild(cube_r17);
		setRotationAngle(cube_r17, -2.3562F, 0.0F, 0.0F);
		cube_r17.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(-0.04F, -0.4957F, -0.3787F);
		tyre_leftfront.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.5708F, 0.0F, 0.0F);
		cube_r18.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setPos(-0.04F, -0.0815F, -0.6213F);
		tyre_leftfront.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.7854F, 0.0F, 0.0F);
		cube_r19.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		tyre_leftfront2 = new ModelRenderer(this);
		tyre_leftfront2.setPos(-12.04F, -3.3829F, -12.0F);
		lunzi.addChild(tyre_leftfront2);
		tyre_leftfront2.texOffs(62, 107).addBox(-0.96F, -3.6171F, -1.5F, 2.0F, 3.0F, 3.0F, 0.02F, true);
		tyre_leftfront2.texOffs(72, 107).addBox(-1.21F, -1.5171F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		tyre_leftfront2.texOffs(42, 60).addBox(-1.11F, -0.5171F, -0.5F, 2.0F, 1.0F, 1.0F, 0.2F, true);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setPos(0.04F, 0.6256F, -0.0858F);
		tyre_leftfront2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.7854F, 0.0F, 0.0F);
		cube_r20.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setPos(0.04F, 0.5043F, 0.3787F);
		tyre_leftfront2.addChild(cube_r21);
		setRotationAngle(cube_r21, 1.5708F, 0.0F, 0.0F);
		cube_r21.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, true);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setPos(0.04F, 0.0901F, 0.6213F);
		tyre_leftfront2.addChild(cube_r22);
		setRotationAngle(cube_r22, 2.3562F, 0.0F, 0.0F);
		cube_r22.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setPos(0.04F, -0.3744F, 0.5F);
		tyre_leftfront2.addChild(cube_r23);
		setRotationAngle(cube_r23, 3.1416F, 0.0F, 0.0F);
		cube_r23.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.02F, true);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setPos(0.04F, -0.6171F, 0.0858F);
		tyre_leftfront2.addChild(cube_r24);
		setRotationAngle(cube_r24, -2.3562F, 0.0F, 0.0F);
		cube_r24.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setPos(0.04F, -0.4957F, -0.3787F);
		tyre_leftfront2.addChild(cube_r25);
		setRotationAngle(cube_r25, -1.5708F, 0.0F, 0.0F);
		cube_r25.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.01F, true);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setPos(0.04F, -0.0815F, -0.6213F);
		tyre_leftfront2.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.7854F, 0.0F, 0.0F);
		cube_r26.texOffs(62, 107).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		tyre_leftfront3 = new ModelRenderer(this);
		tyre_leftfront3.setPos(10.0F, -6.9791F, 7.5F);
		lunzi.addChild(tyre_leftfront3);
		tyre_leftfront3.texOffs(18, 102).addBox(-1.0F, -7.2709F, -3.0F, 2.0F, 6.0F, 6.0F, 0.02F, false);
		tyre_leftfront3.texOffs(50, 107).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setPos(0.0F, -2.3129F, -2.3129F);
		tyre_leftfront3.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.7854F, 0.0F, 0.0F);
		cube_r27.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setPos(0.0F, 0.0F, -3.2709F);
		tyre_leftfront3.addChild(cube_r28);
		setRotationAngle(cube_r28, 1.5708F, 0.0F, 0.0F);
		cube_r28.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.01F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setPos(0.0F, 2.3129F, -2.3129F);
		tyre_leftfront3.addChild(cube_r29);
		setRotationAngle(cube_r29, 2.3562F, 0.0F, 0.0F);
		cube_r29.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setPos(0.0F, 3.2709F, 0.0F);
		tyre_leftfront3.addChild(cube_r30);
		setRotationAngle(cube_r30, -3.1416F, 0.0F, 0.0F);
		cube_r30.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.02F, false);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setPos(0.0F, 2.3129F, 2.3129F);
		tyre_leftfront3.addChild(cube_r31);
		setRotationAngle(cube_r31, -2.3562F, 0.0F, 0.0F);
		cube_r31.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setPos(0.0F, 0.0F, 3.2709F);
		tyre_leftfront3.addChild(cube_r32);
		setRotationAngle(cube_r32, -1.5708F, 0.0F, 0.0F);
		cube_r32.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.01F, false);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setPos(0.0F, -2.3129F, 2.3129F);
		tyre_leftfront3.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.7854F, 0.0F, 0.0F);
		cube_r33.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);

		tyre_leftfront4 = new ModelRenderer(this);
		tyre_leftfront4.setPos(-12.0F, -6.9791F, 7.5F);
		lunzi.addChild(tyre_leftfront4);
		tyre_leftfront4.texOffs(18, 102).addBox(-1.0F, -7.2709F, -3.0F, 2.0F, 6.0F, 6.0F, 0.02F, true);
		tyre_leftfront4.texOffs(50, 107).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r34 = new ModelRenderer(this);
		cube_r34.setPos(0.0F, -2.3129F, -2.3129F);
		tyre_leftfront4.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.7854F, 0.0F, 0.0F);
		cube_r34.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, true);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setPos(0.0F, 0.0F, -3.2709F);
		tyre_leftfront4.addChild(cube_r35);
		setRotationAngle(cube_r35, 1.5708F, 0.0F, 0.0F);
		cube_r35.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.01F, true);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setPos(0.0F, 2.3129F, -2.3129F);
		tyre_leftfront4.addChild(cube_r36);
		setRotationAngle(cube_r36, 2.3562F, 0.0F, 0.0F);
		cube_r36.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, true);

		cube_r37 = new ModelRenderer(this);
		cube_r37.setPos(0.0F, 3.2709F, 0.0F);
		tyre_leftfront4.addChild(cube_r37);
		setRotationAngle(cube_r37, -3.1416F, 0.0F, 0.0F);
		cube_r37.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.02F, true);

		cube_r38 = new ModelRenderer(this);
		cube_r38.setPos(0.0F, 2.3129F, 2.3129F);
		tyre_leftfront4.addChild(cube_r38);
		setRotationAngle(cube_r38, -2.3562F, 0.0F, 0.0F);
		cube_r38.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, true);

		cube_r39 = new ModelRenderer(this);
		cube_r39.setPos(0.0F, 0.0F, 3.2709F);
		tyre_leftfront4.addChild(cube_r39);
		setRotationAngle(cube_r39, -1.5708F, 0.0F, 0.0F);
		cube_r39.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.01F, true);

		cube_r40 = new ModelRenderer(this);
		cube_r40.setPos(0.0F, -2.3129F, 2.3129F);
		tyre_leftfront4.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.7854F, 0.0F, 0.0F);
		cube_r40.texOffs(18, 102).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, true);

		pult = new ModelRenderer(this);
		pult.setPos(3.0F, -20.0F, -9.0F);
		car.addChild(pult);
		setRotationAngle(pult, 0.3491F, 0.0F, 0.0F);
		pult.texOffs(66, 75).addBox(-1.5F, -1.5F, -11.0F, 3.0F, 3.0F, 12.0F, -0.4F, false);
		pult.texOffs(66, 75).addBox(-1.5F, -1.5F, 0.2F, 3.0F, 3.0F, 12.0F, -0.4F, false);
		pult.texOffs(26, 85).addBox(-1.5F, -1.5F, -8.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r41 = new ModelRenderer(this);
		cube_r41.setPos(-0.5F, 2.7308F, 20.9785F);
		pult.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.1309F, 0.0F, 0.0F);
		cube_r41.texOffs(26, 90).addBox(-1.0F, -3.0F, -10.0F, 3.0F, 3.0F, 9.0F, -0.39F, false);

		pult2 = new ModelRenderer(this);
		pult2.setPos(0.0F, 1.5256F, 19.0528F);
		pult.addChild(pult2);


		cube_r42 = new ModelRenderer(this);
		cube_r42.setPos(0.0F, 9.0F, 0.5F);
		pult2.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.5236F, 0.0F, 0.0F);
		cube_r42.texOffs(104, 0).addBox(-2.5F, -3.75F, 1.35F, 5.0F, 3.0F, 5.0F, 0.4F, false);
		cube_r42.texOffs(42, 62).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r42.texOffs(104, 96).addBox(-4.0F, -5.0F, -1.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r43 = new ModelRenderer(this);
		cube_r43.setPos(-0.5F, 9.5811F, -3.107F);
		pult2.addChild(cube_r43);
		setRotationAngle(cube_r43, -2.0944F, 0.0F, 0.0F);
		cube_r43.texOffs(104, 87).addBox(-1.0F, -3.0F, -8.0F, 3.0F, 3.0F, 6.0F, -0.35F, false);

		cube_r44 = new ModelRenderer(this);
		cube_r44.setPos(-0.5F, 7.2052F, 0.9257F);
		pult2.addChild(cube_r44);
		setRotationAngle(cube_r44, -1.3526F, 0.0F, 0.0F);
		cube_r44.texOffs(104, 87).addBox(-1.0F, -3.0F, -8.0F, 3.0F, 3.0F, 6.0F, -0.4F, false);

		ball1 = new ModelRenderer(this);
		ball1.setPos(0.0F, 8.3261F, 5.5524F);
		pult2.addChild(ball1);
		setRotationAngle(ball1, -0.5236F, 0.0F, 0.0F);
		ball1.texOffs(48, 53).addBox(-4.5F, -4.5F, -4.5F, 9.0F, 9.0F, 9.0F, -2.0F, false);

		ball2 = new ModelRenderer(this);
		ball2.setPos(1.0F, -9.1482F, 9.1051F);
		car.addChild(ball2);
		setRotationAngle(ball2, -0.2084F, 0.0651F, 0.2986F);
		ball2.texOffs(48, 53).addBox(-4.5F, -4.5F, -4.5F, 9.0F, 9.0F, 9.0F, -2.0F, false);

		ball3 = new ModelRenderer(this);
		ball3.setPos(6.0F, -9.1482F, 8.1051F);
		car.addChild(ball3);
		setRotationAngle(ball3, -0.0498F, -0.0018F, 0.6974F);
		ball3.texOffs(48, 53).addBox(-4.5F, -4.5F, -4.5F, 9.0F, 9.0F, 9.0F, -2.0F, false);

		ball4 = new ModelRenderer(this);
		ball4.setPos(5.25F, -9.1482F, 3.3551F);
		car.addChild(ball4);
		setRotationAngle(ball4, 0.2035F, -0.0686F, 0.2521F);
		ball4.texOffs(48, 53).addBox(-4.5F, -4.5F, -4.5F, 9.0F, 9.0F, 9.0F, -2.0F, false);

		ball5 = new ModelRenderer(this);
		ball5.setPos(5.25F, -13.1482F, 7.1051F);
		car.addChild(ball5);
		setRotationAngle(ball5, -0.1245F, -0.2934F, -0.2779F);
		ball5.texOffs(48, 53).addBox(-4.5F, -4.5F, -4.5F, 9.0F, 9.0F, 9.0F, -2.0F, false);

		tanhuang = new ModelRenderer(this);
		tanhuang.setPos(3.0F, -6.5F, -10.5F);
		car.addChild(tanhuang);
		setRotationAngle(tanhuang, 0.4363F, 0.0F, 0.0F);
		tanhuang.texOffs(34, 55).addBox(-1.0F, -11.4016F, -1.0508F, 2.0F, 11.0F, 2.0F, -0.2F, false);
	}

	@Override
	public void setupAnim(CatapultZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0) {
			float percent = 1 - entity.getAttackTime() * 1.0F / entity.getPultAnimTime();
			this.pult.xRot = 0.3491F + (1F - MathHelper.abs(MathHelper.cos(percent * 3.14159F))) * 1.5F;
			this.right_hand.xRot = - 1.0472F + MathHelper.cos(percent * 3.14159F) / 4;
		} else {
			this.pult.xRot = 0.3491F + MathHelper.sin(ageInTicks / 10) / 8;
			this.right_hand.xRot = - 1.0472F;
		}
		this.tyre_leftfront.xRot = ageInTicks % 360;
		this.tyre_leftfront2.xRot = ageInTicks % 360;
		this.tyre_leftfront3.xRot = ageInTicks % 360;
		this.tyre_leftfront4.xRot = ageInTicks % 360;
		this.ball1.visible = (entity.getBallCount() * 1F / entity.getMaxBallUse() < 1F / 4);
		this.ball2.visible = (entity.getBallCount() * 1F / entity.getMaxBallUse() < 2F / 4);
		this.ball3.visible = (entity.getBallCount() * 1F / entity.getMaxBallUse() < 3F / 4);
		this.ball4.visible = (entity.getBallCount() * 1F / entity.getMaxBallUse() < 1);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void tickPartAnim(IBodyEntity entity, float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch) {
		
	}

	@Override
	public void renderBody(IBodyEntity entity, MatrixStack stack, IVertexBuilder buffer, int packedLight,
			int packedOverlay) {
		this.zombie.visible = false;
		this.total.render(stack, buffer, packedLight, packedOverlay);
	}

	@Override
	public EntityModel<CatapultZombieEntity> getZombieModel() {
		return this;
	}
}