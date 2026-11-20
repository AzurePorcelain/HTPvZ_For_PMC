package com.hungteen.pvz.client.model.entity.zombie.roof;

import java.util.Optional;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.roof.LadderZombieEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class LadderZombieModel extends PVZZombieModel<LadderZombieEntity> {
	private final ModelRenderer total;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer up;
	private final ModelRenderer body;
	private final ModelRenderer hammer;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_hand;
	private final ModelRenderer head;
	private final ModelRenderer sting;
	private final ModelRenderer cube_r1;
	private final ModelRenderer beard;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer ladder;
	private final ModelRenderer floor;

	public LadderZombieModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		right_leg = new ModelRenderer(this);
		right_leg.setPos(-2.0F, -11.5F, 0.0F);
		total.addChild(right_leg);
		right_leg.texOffs(0, 16).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_leg.texOffs(0, 32).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(2.0F, -11.5F, 0.0F);
		total.addChild(left_leg);
		left_leg.texOffs(16, 48).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		left_leg.texOffs(0, 48).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		up = new ModelRenderer(this);
		up.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(up);


		body = new ModelRenderer(this);
		body.setPos(0.0F, -11.5F, 0.0F);
		up.addChild(body);
		body.texOffs(16, 16).addBox(-4.0F, -12.5F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.texOffs(16, 32).addBox(-4.0F, -12.5F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		hammer = new ModelRenderer(this);
		hammer.setPos(4.5F, -0.5F, 0.25F);
		body.addChild(hammer);
		setRotationAngle(hammer, 0.4363F, 0.0F, 0.0F);
		hammer.texOffs(56, 16).addBox(-0.75F, -3.25F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		hammer.texOffs(52, 28).addBox(-1.25F, -3.625F, -2.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(4.0F, -24.0F, 0.0F);
		up.addChild(left_hand);
		setRotationAngle(left_hand, -0.8727F, 0.0F, 0.0F);
		left_hand.texOffs(32, 48).addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		left_hand.texOffs(48, 48).addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-4.0F, -24.0F, 0.0F);
		up.addChild(right_hand);
		setRotationAngle(right_hand, -0.8727F, 0.0F, 0.0F);
		right_hand.texOffs(40, 16).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_hand.texOffs(40, 32).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -24.0F, 0.0F);
		up.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		sting = new ModelRenderer(this);
		sting.setPos(4.5F, -8.5F, -0.5F);
		head.addChild(sting);
		setRotationAngle(sting, -0.6109F, 0.0F, 0.0F);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		sting.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.2182F, 0.0F);
		cube_r1.texOffs(24, 0).addBox(-0.4113F, -0.7868F, 0.3998F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		beard = new ModelRenderer(this);
		beard.setPos(0.0F, 0.25F, 0.0F);
		head.addChild(beard);
		beard.texOffs(32, 0).addBox(-4.0F, -8.25F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-0.375F, -3.0F, -4.25F);
		beard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.2182F);


		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.125F, -3.0F, -4.25F);
		beard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.2182F);


		ladder = new ModelRenderer(this);
		ladder.setPos(0.0F, -19.0F, -10.0F);
		up.addChild(ladder);
		setRotationAngle(ladder, 0.2182F, 0.0F, 0.0F);
		ladder.texOffs(64, 0).addBox(-6.0F, -11.0F, -1.0F, 1.5F, 25.0F, 2.0F, 0.05F, false);
		ladder.texOffs(74, 0).addBox(4.5F, -11.0F, -1.0F, 1.5F, 25.0F, 2.0F, 0.05F, false);
		ladder.texOffs(64, 30).addBox(4.0F, 14.0F, -1.5F, 2.5F, 0.5F, 3.0F, 0.0F, false);
		ladder.texOffs(76, 30).addBox(-6.5F, 14.0F, -1.5F, 2.5F, 0.5F, 3.0F, 0.0F, false);

		floor = new ModelRenderer(this);
		floor.setPos(0.0F, 0.0F, 0.0F);
		ladder.addChild(floor);
		floor.texOffs(86, 0).addBox(-4.5F, 10.0F, -1.0F, 9.0F, 1.0F, 2.0F, 0.0F, false);
		floor.texOffs(86, 4).addBox(-4.5F, 6.0F, -1.0F, 9.0F, 1.0F, 2.0F, 0.0F, false);
		floor.texOffs(86, 8).addBox(-4.5F, 2.0F, -1.0F, 9.0F, 1.0F, 2.0F, 0.0F, false);
		floor.texOffs(86, 12).addBox(-4.5F, -2.0F, -1.0F, 9.0F, 1.0F, 2.0F, 0.0F, false);
		floor.texOffs(86, 16).addBox(-4.5F, -6.0F, -1.0F, 9.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void updateFreeParts(LadderZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean hasLadder = entity.hasMetal();
		this.ladder.visible = hasLadder;
		this.isLeftHandFree = ! hasLadder;
		this.isRightHandFree = ! hasLadder;
	}
	
	@Override
	public void refreshAnim() {
		super.refreshAnim();
		this.right_hand.xRot = -0.8727F;
		this.left_hand.xRot = -0.8727F;
	}
	
	@Override
	public Optional<ModelRenderer> getHandDefence() {
		return Optional.ofNullable(this.ladder);
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