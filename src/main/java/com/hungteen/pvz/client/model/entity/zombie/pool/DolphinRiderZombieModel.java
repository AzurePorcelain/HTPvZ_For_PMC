package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.DolphinRiderZombieEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings

public class DolphinRiderZombieModel extends PVZZombieModel<DolphinRiderZombieEntity> {
	private final ModelRenderer total;
	private final ModelRenderer up;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_hand;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public DolphinRiderZombieModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		up = new ModelRenderer(this);
		up.setPos(0.0F, -12.0F, 0.0F);
		total.addChild(up);


		head = new ModelRenderer(this);
		head.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(body);
		body.texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-5.0F, -10.0F, 0.0F);
		up.addChild(right_hand);
		right_hand.texOffs(32, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(5.0F, -10.0F, 0.0F);
		up.addChild(left_hand);
		left_hand.texOffs(32, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(-1.9F, -12.0F, 0.0F);
		total.addChild(right_leg);
		right_leg.texOffs(48, 0).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(1.9F, -12.0F, 0.0F);
		total.addChild(left_leg);
		left_leg.texOffs(48, 0).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
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