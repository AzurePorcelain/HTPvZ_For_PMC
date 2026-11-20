package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.SnorkelZombieEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class SnorkelZombieModel extends PVZZombieModel<SnorkelZombieEntity> {
	private final ModelRenderer total;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_pants;
	private final ModelRenderer bone4;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_pants;
	private final ModelRenderer bone3;
	private final ModelRenderer up;
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer body;
	private final ModelRenderer jacket;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_sleeve;
	private final ModelRenderer left_hand;
	private final ModelRenderer left_sleeve;

	public SnorkelZombieModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		right_leg = new ModelRenderer(this);
		right_leg.setPos(-1.9F, -12.0F, 0.0F);
		total.addChild(right_leg);
		right_leg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_pants = new ModelRenderer(this);
		right_pants.setPos(1.9F, 12.0F, 0.0F);
		right_leg.addChild(right_pants);
		right_pants.texOffs(0, 32).addBox(-3.9F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(-2.0F, 0.0F, -2.0F);
		right_pants.addChild(bone4);
		bone4.texOffs(44, 20).addBox(-2.5F, 0.0F, -10.0F, 5.0F, 0.0F, 10.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(1.9F, -12.0F, 0.0F);
		total.addChild(left_leg);
		left_leg.texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_pants = new ModelRenderer(this);
		left_pants.setPos(-1.9F, 12.0F, 0.0F);
		left_leg.addChild(left_pants);
		left_pants.texOffs(0, 48).addBox(-0.1F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(2.0F, 0.0F, -2.0F);
		left_pants.addChild(bone3);
		bone3.texOffs(44, 20).addBox(-2.5F, 0.0F, -10.0F, 5.0F, 0.0F, 10.0F, 0.0F, false);

		up = new ModelRenderer(this);
		up.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(up);


		head = new ModelRenderer(this);
		head.setPos(0.0F, -24.0F, 0.0F);
		up.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(hat);
		hat.texOffs(32, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(-5.0F, -25.0F, -5.0F);
		hat.addChild(bone2);
		setRotationAngle(bone2, -0.0873F, 0.3491F, 0.1745F);
		bone2.texOffs(24, 0).addBox(3.0F, -1.0F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		bone2.texOffs(52, 17).addBox(-0.5F, -0.5F, -0.75F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		bone2.texOffs(60, 42).addBox(-1.0F, -8.5F, -0.75F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		bone2.texOffs(60, 53).addBox(-1.0F, -8.5F, -0.75F, 1.0F, 10.0F, 1.0F, 0.1F, false);

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, -8.0F, 1.25F);
		bone2.addChild(bone);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -2.0F, -1.5F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.texOffs(0, 0).addBox(-1.5F, -4.0F, -0.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -24.0F, 0.0F);
		up.addChild(body);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		jacket = new ModelRenderer(this);
		jacket.setPos(0.0F, 24.0F, 0.0F);
		body.addChild(jacket);
		jacket.texOffs(16, 32).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-5.0F, -22.0F, 0.0F);
		up.addChild(right_hand);
		right_hand.texOffs(40, 16).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		right_sleeve = new ModelRenderer(this);
		right_sleeve.setPos(5.0F, 22.0F, 0.0F);
		right_hand.addChild(right_sleeve);
		right_sleeve.texOffs(40, 32).addBox(-7.0F, -24.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(5.0F, -22.0F, 0.0F);
		up.addChild(left_hand);
		left_hand.texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		left_sleeve = new ModelRenderer(this);
		left_sleeve.setPos(-5.0F, 22.0F, 0.0F);
		left_hand.addChild(left_sleeve);
		left_sleeve.texOffs(46, 48).addBox(4.0F, -24.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, false);
	}

	@Override
	public ModelRenderer getZombieLeftHand() {
		return this.left_hand;
	}

	@Override
	public ModelRenderer getZombieRightHand() {
		return this.right_hand;
	}

	@Override
	public ModelRenderer getZombieLeftLeg() {
		return this.left_leg;
	}

	@Override
	public ModelRenderer getZombieRightLeg() {
		return this.right_leg;
	}

	@Override
	public ModelRenderer getZombieHead() {
		return this.head;
	}
	
	@Override
	public ModelRenderer getZombieUpBody() {
		return this.up;
	}

	@Override
	public ModelRenderer getZombieWholeBody() {
		return this.total;
	}
}