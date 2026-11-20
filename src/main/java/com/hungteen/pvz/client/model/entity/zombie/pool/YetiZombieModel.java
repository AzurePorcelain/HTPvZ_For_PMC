package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.YetiZombieEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class YetiZombieModel extends PVZZombieModel<YetiZombieEntity> {
	private final ModelRenderer total;
	private final ModelRenderer up;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_hand;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public YetiZombieModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 2.0F);


		up = new ModelRenderer(this);
		up.setPos(0.0F, -12.0F, 0.0F);
		total.addChild(up);
		setRotationAngle(up, 0.1309F, 0.0F, 0.0F);


		head = new ModelRenderer(this);
		head.setPos(0.0F, -11.8698F, 0.7386F);
		up.addChild(head);
		setRotationAngle(head, -0.1309F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -9.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(1, 38).addBox(-4.5F, -9.3802F, -7.4886F, 9.0F, 9.0F, 8.0F, 0.0F, false);
		head.texOffs(32, 42).addBox(-2.25F, -1.5F, -7.75F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		head.texOffs(1, 37).addBox(-4.0F, -8.8802F, -8.2386F, 8.0F, 8.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(body);
		body.texOffs(0, 16).addBox(-5.5F, -3.5F, -3.5F, 11.0F, 15.0F, 7.0F, 0.0F, false);
		body.texOffs(0, 38).addBox(-6.0F, -4.0F, -4.0F, 12.0F, 16.0F, 8.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-5.0F, -10.75F, -5.0F);
		up.addChild(right_hand);
		setRotationAngle(right_hand, -0.1309F, 0.0F, 0.0F);
		right_hand.texOffs(36, 19).addBox(-4.5F, -4.0F, 2.0F, 4.0F, 14.0F, 5.0F, 0.0F, false);
		right_hand.texOffs(40, 40).addBox(-5.25F, -4.75F, 1.5F, 5.0F, 15.0F, 6.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(5.0F, -10.0F, 0.0F);
		up.addChild(left_hand);
		setRotationAngle(left_hand, -0.1309F, 0.0F, 0.0F);
		left_hand.texOffs(36, 19).addBox(0.5F, -3.75F, -3.0F, 4.0F, 14.0F, 5.0F, 0.0F, false);
		left_hand.texOffs(40, 40).addBox(0.25F, -4.5F, -3.5F, 5.0F, 15.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(-1.9F, -12.0F, 0.0F);
		total.addChild(right_leg);
		right_leg.texOffs(32, 0).addBox(-3.6F, -2.0F, -3.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);
		right_leg.texOffs(40, 40).addBox(-4.1F, -2.25F, -3.5F, 6.0F, 15.0F, 6.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(1.9F, -12.0F, 0.0F);
		total.addChild(left_leg);
		left_leg.texOffs(32, 0).addBox(-1.4F, -2.0F, -3.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);
		left_leg.texOffs(40, 40).addBox(-1.9F, -2.25F, -3.5F, 6.0F, 15.0F, 6.0F, 0.0F, false);
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