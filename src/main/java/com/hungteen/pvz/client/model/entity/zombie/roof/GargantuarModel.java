package com.hungteen.pvz.client.model.entity.zombie.roof;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.roof.GargantuarEntity;

import com.hungteen.pvz.utils.AnimationUtil;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public class GargantuarModel<T extends GargantuarEntity> extends PVZZombieModel<T> {
	private final ModelRenderer total;
	private final ModelRenderer body;
	private final ModelRenderer chest_r1;
	private final ModelRenderer stomach;
	private final ModelRenderer outer_stomach;
	private final ModelRenderer basket;
	private final ModelRenderer outer_basket_r1;
	private final ModelRenderer jacket;
	private final ModelRenderer chest_r2;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_sleeve;
	private final ModelRenderer right_fist;
	private final ModelRenderer right_glove;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_sleeve;
	private final ModelRenderer left_fist;
	private final ModelRenderer left_glove;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_pant;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_pant;
	private final ModelRenderer head;
	private final ModelRenderer hat;

	public GargantuarModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -17.0F, 1.0F);
		total.addChild(body);

		chest_r1 = new ModelRenderer(this);
		chest_r1.setPos(0.0F, -15.5F, 0.0F);
		body.addChild(chest_r1);
		setRotationAngle(chest_r1, 0.7854F, 0.0F, 0.0F);
		chest_r1.texOffs(0, 0).addBox(-11.0F, -6.5F, -5.0F, 22.0F, 11.0F, 10.0F, 0.0F, false);

		stomach = new ModelRenderer(this);
		stomach.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(stomach);
		stomach.texOffs(0, 42).addBox(-7.0F, -15.0F, -1.0F, 14.0F, 15.0F, 7.0F, 0.0F, false);

		outer_stomach = new ModelRenderer(this);
		outer_stomach.setPos(0.0F, 0.0F, 0.0F);
		stomach.addChild(outer_stomach);
		outer_stomach.texOffs(42, 42).addBox(-7.0F, -15.0F, -1.0F, 14.0F, 15.0F, 7.0F, 0.5F, false);

		basket = new ModelRenderer(this);
		basket.setPos(0.0F, -21.5F, -1.0F);
		body.addChild(basket);

		outer_basket_r1 = new ModelRenderer(this);
		outer_basket_r1.setPos(0.0F, 0.0F, 12.0F);
		basket.addChild(outer_basket_r1);
		setRotationAngle(outer_basket_r1, 0.3491F, 0.0F, 0.0F);
		outer_basket_r1.texOffs(64, 18).addBox(-4.0F, -4.5F, -5.0F, 8.0F, 10.0F, 8.0F, 0.5F, false);
		outer_basket_r1.texOffs(64, 0).addBox(-4.0F, -4.5F, -5.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);

		jacket = new ModelRenderer(this);
		jacket.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(jacket);
		jacket.texOffs(0, 110).addBox(-11.0F, -23.0F, -1.4F, 22.0F, 8.0F, 8.0F, -0.01F, false);

		chest_r2 = new ModelRenderer(this);
		chest_r2.setPos(0.0F, -15.5F, 0.0F);
		jacket.addChild(chest_r2);
		setRotationAngle(chest_r2, 0.7854F, 0.0F, 0.0F);
		chest_r2.texOffs(0, 21).addBox(-11.0F, -6.5F, -5.0F, 22.0F, 11.0F, 10.0F, 0.5F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setPos(-13.0F, -20.0F, -1.0F);
		body.addChild(right_arm);
		right_arm.texOffs(24, 64).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 17.0F, 7.0F, 0.0F, false);

		right_sleeve = new ModelRenderer(this);
		right_sleeve.setPos(0.0F, 6.0F, 0.0F);
		right_arm.addChild(right_sleeve);
		right_sleeve.texOffs(72, 64).addBox(-2.5F, -9.0F, -3.5F, 5.0F, 17.0F, 7.0F, 0.5F, false);

		right_fist = new ModelRenderer(this);
		right_fist.setPos(0.0F, 14.0F, 0.0F);
		right_arm.addChild(right_fist);
		right_fist.texOffs(72, 104).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 16.0F, 8.0F, 0.0F, false);

		right_glove = new ModelRenderer(this);
		right_glove.setPos(0.0F, 2.0F, 0.0F);
		right_fist.addChild(right_glove);
		right_glove.texOffs(100, 104).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 16.0F, 8.0F, 0.5F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setPos(13.0F, -20.0F, -1.0F);
		body.addChild(left_arm);
		left_arm.texOffs(0, 64).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 17.0F, 7.0F, 0.0F, false);

		left_sleeve = new ModelRenderer(this);
		left_sleeve.setPos(0.0F, 6.0F, 0.0F);
		left_arm.addChild(left_sleeve);
		left_sleeve.texOffs(48, 64).addBox(-2.5F, -9.0F, -3.5F, 5.0F, 17.0F, 7.0F, 0.5F, false);

		left_fist = new ModelRenderer(this);
		left_fist.setPos(0.0F, 14.0F, 0.0F);
		left_arm.addChild(left_fist);
		left_fist.texOffs(100, 34).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 16.0F, 8.0F, 0.0F, false);

		left_glove = new ModelRenderer(this);
		left_glove.setPos(0.0F, 2.0F, 0.0F);
		left_fist.addChild(left_glove);
		left_glove.texOffs(100, 58).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 16.0F, 8.0F, 0.5F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(-3.5F, -0.5F, 2.0F);
		body.addChild(right_leg);
		right_leg.texOffs(20, 88).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 17.0F, 5.0F, 0.0F, false);

		right_pant = new ModelRenderer(this);
		right_pant.setPos(0.0F, 1.0F, 0.0F);
		right_leg.addChild(right_pant);
		right_pant.texOffs(60, 88).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 17.0F, 5.0F, 0.49F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(3.5F, -0.5F, 2.0F);
		body.addChild(left_leg);
		left_leg.texOffs(0, 88).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 17.0F, 5.0F, 0.0F, false);

		left_pant = new ModelRenderer(this);
		left_pant.setPos(0.0F, 1.0F, 0.0F);
		left_leg.addChild(left_pant);
		left_pant.texOffs(40, 88).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 17.0F, 5.0F, 0.49F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -17.0F, -5.0F);
		body.addChild(head);
		head.texOffs(96, 0).addBox(-4.0F, -8.0F, -7.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, 6.0F, 0.0F);
		head.addChild(hat);
		hat.texOffs(96, 17).addBox(-4.0F, -14.0F, -7.0F, 8.0F, 9.0F, 8.0F, 0.5F, false);
	}

	@Override
	public ModelRenderer getZombieLeftHand() {
		return this.left_arm;
	}

	@Override
	public ModelRenderer getZombieRightHand() {
		return this.right_arm;
	}

	public ModelRenderer getZombieRightFist() {
		return this.right_fist;
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.head.yRot = netHeadYaw / (180F / (float)Math.PI);
        this.head.xRot = headPitch / (180F / (float)Math.PI);
        if(entity.getAttackTime() == 0) {
            this.left_leg.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.right_leg.xRot = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.right_arm.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.left_arm.xRot = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.body.xRot = 0;
		} else if(entity.getAttackTime() > 0) {// normal attack (right arm swings down)
			int total = entity.getCrushCD();
			int now = total - entity.getAttackTime();
			int frontT = total * 2 / 3;
			if(now < frontT) {
				this.right_arm.xRot = AnimationUtil.getUpDown(now, frontT, - 120);
				this.right_arm.yRot = 0;
			} else {
				this.right_arm.xRot = AnimationUtil.getUpDown(now - frontT , total - frontT, 30);
				this.right_arm.yRot = AnimationUtil.getUpDown(now - frontT , total - frontT, 30);
			}
			this.body.xRot = AnimationUtil.getUpDownUpDown(now, total, - 15);
			this.right_leg.xRot = 0;
			this.left_leg.xRot = 0;
			this.left_arm.xRot = 0;
		} else {
			int total = entity.getThrowCD();
			int now = total + entity.getAttackTime();
			int frontT = total * 3 / 4;
			if(now < frontT) {
				this.left_arm.xRot = AnimationUtil.getUp(now, frontT, - 225);
			} else {
				this.left_arm.xRot = AnimationUtil.getDown(now - frontT, total - frontT, - 225);
			}
			this.right_arm.xRot = 0;
			this.right_leg.xRot = 0;
			this.left_leg.xRot = 0;
			this.body.xRot = 0;
		}
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
		return this.body;
	}

	@Override
	public ModelRenderer getZombieWholeBody() {
		return this.total;
	}

}