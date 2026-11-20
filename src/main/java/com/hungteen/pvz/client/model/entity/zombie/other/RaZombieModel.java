package com.hungteen.pvz.client.model.entity.zombie.other;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.other.RaZombieEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class RaZombieModel extends PVZZombieModel<RaZombieEntity> {
	private final ModelRenderer total;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer up;
	private final ModelRenderer body;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_hand;
	private final ModelRenderer collector;
	private final ModelRenderer head;
	private final ModelRenderer bone;

	public RaZombieModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		right_leg = new ModelRenderer(this);
		right_leg.setPos(-2.0F, -12.0F, 0.0F);
		total.addChild(right_leg);
		right_leg.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(2.0F, -12.0F, 0.0F);
		total.addChild(left_leg);
		left_leg.texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		up = new ModelRenderer(this);
		up.setPos(0.0F, -12.0F, 0.0F);
		total.addChild(up);


		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		up.addChild(body);
		body.texOffs(40, 48).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(6.0F, -10.0F, 0.0F);
		up.addChild(left_hand);
		left_hand.texOffs(48, 32).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-6.0F, -10.0F, 0.0F);
		up.addChild(right_hand);
		setRotationAngle(right_hand, -0.5236F, 0.0F, 0.0F);
		right_hand.texOffs(32, 32).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		collector = new ModelRenderer(this);
		collector.setPos(-0.01F, 9.75F, -1.5F);
		right_hand.addChild(collector);
		setRotationAngle(collector, 0.7854F, 0.0F, -0.2967F);
		collector.texOffs(0, 0).addBox(-4.0F, -16.0F, -0.75F, 8.0F, 8.0F, 1.5F, -0.5F, false);
		collector.texOffs(24, 0).addBox(-0.5F, -11.0F, -0.5F, 1.0F, 15.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(head);
		head.texOffs(0, 32).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(37, 0).addBox(-4.5F, -10.0F, -4.5F, 9.0F, 3.5F, 4.5F, 0.0F, false);
		head.texOffs(0, 21).addBox(4.0F, -9.5F, -4.0F, 2.0F, 7.0F, 2.5F, 0.0F, false);
		head.texOffs(0, 11).addBox(-6.0F, -9.5F, -4.0F, 2.0F, 7.0F, 2.5F, 0.0F, false);
		head.texOffs(22, 24).addBox(-4.5F, -9.5F, 0.0F, 9.0F, 2.5F, 1.5F, 0.0F, false);
		head.texOffs(43, 24).addBox(-4.5F, -9.0F, 1.5F, 9.0F, 2.0F, 1.0F, 0.0F, false);
		head.texOffs(21, 21).addBox(-4.5F, -8.5F, 2.5F, 9.0F, 1.5F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, -7.0F, -4.5F);
		head.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.7854F, 0.0F);
		bone.texOffs(10, 28).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.025F, false);
	}

	@Override
	public void setupAnim(RaZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        if(entity.checkCanWorkNow()) {
        	this.right_hand.xRot = - 1F;
        }
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}
	
	@Override
	public void updateFreeParts(RaZombieEntity entity) {
		super.updateFreeParts(entity);
		this.isRightHandFree = ! entity.checkCanWorkNow();
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