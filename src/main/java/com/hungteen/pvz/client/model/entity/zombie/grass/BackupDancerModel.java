package com.hungteen.pvz.client.model.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.BackupDancerEntity;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class BackupDancerModel extends PVZZombieModel<BackupDancerEntity> {
	private final ModelRenderer total;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer up;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_hand;
	private final ModelRenderer head;
	private final ModelRenderer glasses2_r1;
	private final ModelRenderer glasses1_r1;
	private final ModelRenderer body;
	private final ModelRenderer body_layer_r1;

	public BackupDancerModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		right_leg = new ModelRenderer(this);
		right_leg.setPos(1.9F, -12.0F, 2.0F);
		total.addChild(right_leg);
		right_leg.texOffs(48, 0).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_leg.texOffs(0, 57).addBox(-2.4F, 10.25F, -2.75F, 5.0F, 2.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(-1.9F, -12.0F, 2.0F);
		total.addChild(left_leg);
		left_leg.texOffs(48, 0).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		left_leg.texOffs(0, 57).addBox(-2.6F, 10.25F, -2.75F, 5.0F, 2.0F, 5.0F, 0.0F, false);

		up = new ModelRenderer(this);
		up.setPos(0.0F, -12.0F, 2.0F);
		total.addChild(up);


		left_hand = new ModelRenderer(this);
		left_hand.setPos(5.0F, -10.0F, 0.0F);
		up.addChild(left_hand);
		left_hand.texOffs(32, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		left_hand.texOffs(40, 18).addBox(-1.5F, 5.5F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-5.0F, -10.0F, 0.0F);
		up.addChild(right_hand);
		right_hand.texOffs(32, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_hand.texOffs(40, 18).addBox(-3.5F, 5.5F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		glasses2_r1 = new ModelRenderer(this);
		glasses2_r1.setPos(1.0F, 0.0F, -3.25F);
		head.addChild(glasses2_r1);
		setRotationAngle(glasses2_r1, -3.1416F, 0.0F, -2.9671F);
		glasses2_r1.texOffs(24, 16).addBox(-4.0F, -8.0F, 0.9F, 8.0F, 8.0F, 0.0F, 0.0F, false);

		glasses1_r1 = new ModelRenderer(this);
		glasses1_r1.setPos(-1.0F, 0.0F, -5.0F);
		head.addChild(glasses1_r1);
		setRotationAngle(glasses1_r1, 0.0F, 0.0F, -0.1745F);
		glasses1_r1.texOffs(24, 16).addBox(-4.0F, -8.0F, 0.9F, 8.0F, 8.0F, 0.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(body);
		body.texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		body_layer_r1 = new ModelRenderer(this);
		body_layer_r1.setPos(0.0F, 24.0F, -1.0F);
		body.addChild(body_layer_r1);
		setRotationAngle(body_layer_r1, -0.0175F, 0.0F, 0.0F);
		body_layer_r1.texOffs(4, 32).addBox(-4.0F, -24.0F, -1.65F, 8.0F, 12.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(BackupDancerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0) {
			int tick = entity.getAttackTime();
			int max = BackupDancerEntity.DANCE_CD;
			this.total.yRot = - MathHelper.sin(3.14159f * 2 * tick / max);
			this.right_hand.xRot = - 3 * MathHelper.abs(MathHelper.sin(3.14159f * 4 * tick / max));
			this.left_hand.xRot = - 3 * MathHelper.abs(MathHelper.sin(3.14159f * 4 * tick / max));
			this.left_leg.xRot = 0;
			this.right_leg.xRot = 0;
			return ;
		} 
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}
	
	@Override
	public void refreshAnim() {
		this.total.yRot = 0;
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