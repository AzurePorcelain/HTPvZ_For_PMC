package com.hungteen.pvz.client.model.entity.zombie.zombotany;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.zombotany.TallNutZombieEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

public class TallNutZombieModel<T extends TallNutZombieEntity> extends PVZZombieModel<T> {
	private final ModelRenderer total;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_pants;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_pants;
	private final ModelRenderer up;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_sleeve;
	private final ModelRenderer left_hand;
	private final ModelRenderer left_sleeve;

	public TallNutZombieModel() {
		texWidth = 256;
		texHeight = 128;

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

		left_leg = new ModelRenderer(this);
		left_leg.setPos(1.9F, -12.0F, 0.0F);
		total.addChild(left_leg);
		left_leg.texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_pants = new ModelRenderer(this);
		left_pants.setPos(-1.9F, 12.0F, 0.0F);
		left_leg.addChild(left_pants);
		left_pants.texOffs(0, 48).addBox(-0.1F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		up = new ModelRenderer(this);
		up.setPos(-1.9F, -12.0F, 0.0F);
		total.addChild(up);


		head = new ModelRenderer(this);
		head.setPos(1.9F, -14.0F, 0.0F);
		up.addChild(head);
		head.texOffs(176, 0).addBox(-3.0F, -19.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
		head.texOffs(128, 41).addBox(-7.0F, -29.0F, -7.0F, 14.0F, 4.0F, 14.0F, 0.0F, false);
		head.texOffs(128, 0).addBox(-8.0F, -25.0F, -8.0F, 16.0F, 25.0F, 16.0F, 0.0F, false);
		head.texOffs(128, 0).addBox(6.0F, -23.0F, -7.975F, 2.0F, 5.0F, 1.0F, -0.1F, true);
		head.texOffs(128, 0).addBox(-8.0F, -23.0F, -7.975F, 2.0F, 5.0F, 1.0F, -0.1F, false);
		head.texOffs(144, 70).addBox(1.0F, -23.0F, -7.975F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		head.texOffs(144, 70).addBox(1.0F, -19.0F, -7.975F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		head.texOffs(144, 70).addBox(-7.0F, -19.0F, -7.975F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.texOffs(144, 70).addBox(-7.0F, -23.0F, -7.975F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.texOffs(128, 0).addBox(-1.0F, -23.0F, -7.975F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		head.texOffs(128, 59).addBox(-7.0F, -25.0F, -7.0F, 14.0F, 25.0F, 1.0F, 0.0F, false);
		head.texOffs(170, 45).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(1.9F, -12.0F, 0.0F);
		up.addChild(body);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-3.1F, -10.0F, 0.0F);
		up.addChild(right_hand);
		right_hand.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_sleeve = new ModelRenderer(this);
		right_sleeve.setPos(5.0F, 22.0F, 0.0F);
		right_hand.addChild(right_sleeve);
		right_sleeve.texOffs(40, 32).addBox(-8.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(6.9F, -10.0F, 0.0F);
		up.addChild(left_hand);
		left_hand.texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_sleeve = new ModelRenderer(this);
		left_sleeve.setPos(-5.0F, 22.0F, 0.0F);
		left_hand.addChild(left_sleeve);
		left_sleeve.texOffs(48, 48).addBox(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
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