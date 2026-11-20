package com.hungteen.pvz.client.model.entity.zombie.grass;

import java.util.Optional;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.SundayEditionZombieEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class SundayEditionZombieModel extends PVZZombieModel<SundayEditionZombieEntity> {
	private final ModelRenderer total;
	private final ModelRenderer up;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_hand;
	private final ModelRenderer left_hand;
	private final ModelRenderer paper;
	private final ModelRenderer folded_right_page_r1;
	private final ModelRenderer folded_left_page_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public SundayEditionZombieModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		up = new ModelRenderer(this);
		up.setPos(0.0F, -12.0F, 0.0F);
		total.addChild(up);


		head = new ModelRenderer(this);
		head.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(head);
		setRotationAngle(head, 0.1745F, 0.0698F, 0.0524F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(body);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-5.0F, -10.0F, 0.0F);
		up.addChild(right_hand);
		setRotationAngle(right_hand, -1.0472F, 0.0F, 0.0F);
		right_hand.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_hand.texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(5.0F, -10.0F, 0.0F);
		up.addChild(left_hand);
		setRotationAngle(left_hand, -1.0472F, 0.0F, 0.0F);
		left_hand.texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		left_hand.texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		paper = new ModelRenderer(this);
		paper.setPos(0.0F, 0.0F, 0.0F);
		left_hand.addChild(paper);
		setRotationAngle(paper, 1.0472F, 0.0F, 0.0F);


		folded_right_page_r1 = new ModelRenderer(this);
		folded_right_page_r1.setPos(-5.0F, 5.0F, -10.0F);
		paper.addChild(folded_right_page_r1);
		setRotationAngle(folded_right_page_r1, 0.0F, 0.2094F, 0.0F);
		folded_right_page_r1.texOffs(86, 40).addBox(-7.0F, -5.0F, -0.5F, 7.0F, 10.0F, 1.0F, 0.0F, false);

		folded_left_page_r1 = new ModelRenderer(this);
		folded_left_page_r1.setPos(-5.0F, 5.0F, -10.0F);
		paper.addChild(folded_left_page_r1);
		setRotationAngle(folded_left_page_r1, 0.0F, -0.2094F, 0.0F);
		folded_left_page_r1.texOffs(66, 40).addBox(0.0F, -5.0F, -0.5F, 7.0F, 10.0F, 1.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(1.9F, -12.0F, 0.0F);
		total.addChild(left_leg);
		setRotationAngle(left_leg, -0.1745F, 0.0F, -0.0349F);
		left_leg.texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		left_leg.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(-1.9F, -12.0F, 0.0F);
		total.addChild(right_leg);
		setRotationAngle(right_leg, 0.192F, 0.0F, 0.0349F);
		right_leg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_leg.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		this.rightHandOriginAngel = - 67.5F;
	}


	@Override
	public void updateFreeParts(SundayEditionZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean isPaperDestroyed = entity.isAngry();
		this.isLeftHandFree = isPaperDestroyed;
		this.isRightHandFree = isPaperDestroyed;
		//this.red_eyes.visible = isPaperDestroyed;
		//this.normal_eyes.visible = ! isPaperDestroyed;
		this.paper.visible = ! isPaperDestroyed;
	}
	
	@Override
	public void refreshAnim() {
		this.getZombieLeftHand().xRot = -1.0472F;
		this.getZombieRightHand().xRot = -1.0472F;
	}
	
	@Override
	protected boolean isZombieAngry(SundayEditionZombieEntity entity) {
		return entity.isAngry() || super.isZombieAngry(entity);
	}
	
	@Override
	public Optional<ModelRenderer> getHandDefence() {
		return Optional.ofNullable(this.paper);
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