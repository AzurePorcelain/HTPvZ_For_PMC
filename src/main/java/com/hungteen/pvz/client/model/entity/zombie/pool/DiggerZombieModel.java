package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.DiggerZombieEntity;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class DiggerZombieModel extends PVZZombieModel<DiggerZombieEntity> {
	private final ModelRenderer total;
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

	public DiggerZombieModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, -0.5F);


		right_leg = new ModelRenderer(this);
		right_leg.setPos(-1.9F, -12.0F, 0.5F);
		total.addChild(right_leg);
		right_leg.texOffs(92, 0).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		right_pants = new ModelRenderer(this);
		right_pants.setPos(0.0F, 0.0F, 0.0F);
		right_leg.addChild(right_pants);
		right_pants.texOffs(92, 17).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(1.9F, -12.0F, 0.5F);
		total.addChild(left_leg);
		left_leg.texOffs(110, 0).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		left_pants = new ModelRenderer(this);
		left_pants.setPos(0.0F, 0.0F, 0.0F);
		left_leg.addChild(left_pants);
		left_pants.texOffs(110, 17).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.25F, false);

		up = new ModelRenderer(this);
		up.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(up);


		left_hand = new ModelRenderer(this);
		left_hand.setPos(5.0F, -22.0F, 0.5F);
		up.addChild(left_hand);
		left_hand.texOffs(74, 0).addBox(-1.0F, -2.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		left_sleeve = new ModelRenderer(this);
		left_sleeve.setPos(0.0F, 0.0F, 0.0F);
		left_hand.addChild(left_sleeve);
		left_sleeve.texOffs(74, 17).addBox(-1.0F, -2.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.25F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-5.0F, -22.0F, 0.5F);
		up.addChild(right_hand);
		right_hand.texOffs(56, 0).addBox(-3.0F, -2.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		right_sleeve = new ModelRenderer(this);
		right_sleeve.setPos(0.0F, 0.0F, 0.0F);
		right_hand.addChild(right_sleeve);
		right_sleeve.texOffs(56, 17).addBox(-3.0F, -2.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.25F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -24.0F, 0.5F);
		up.addChild(body);
		body.texOffs(0, 32).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 12.0F, 5.0F, 0.0F, false);

		jacket = new ModelRenderer(this);
		jacket.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(jacket);
		jacket.texOffs(26, 32).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 12.0F, 5.0F, 0.25F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -24.0F, 0.5F);
		up.addChild(head);
		head.texOffs(0, 0).addBox(-4.5F, -8.0F, -4.0F, 9.0F, 8.0F, 8.0F, 0.0F, false);

		helmet = new ModelRenderer(this);
		helmet.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(helmet);
		helmet.texOffs(0, 49).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 5.0F, 10.0F, 0.0F, false);
		helmet.texOffs(40, 49).addBox(-2.0F, -8.0F, -6.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(hat);
		hat.texOffs(0, 16).addBox(-4.5F, -8.0F, -4.0F, 9.0F, 8.0F, 8.0F, 0.499F, false);
	}

	@Override
	public void setupAnim(DiggerZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0 && entity.getAttackTime() < DiggerZombieEntity.MAX_OUT_TIME) {
			total.yRot = ageInTicks / 1f;
		} else {
			total.yRot = 0;
		}
		if(entity.hasPickaxe()) {
	        this.right_hand.xRot = - 1.57F + MathHelper.sin(ageInTicks) * 0.5F;
		} else {
			this.right_hand.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		}
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}
	
	@Override
	public void updateFreeParts(DiggerZombieEntity entity) {
		super.updateFreeParts(entity);
		//金属稿子改由 PickaxeItemLayer 渲染原版铁稿，这里只保留手臂占用判定
		final boolean hasPickaxe = entity.hasPickaxe();
		this.isRightHandFree = ! hasPickaxe;
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