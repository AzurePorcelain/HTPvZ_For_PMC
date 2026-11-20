package com.hungteen.pvz.client.model.entity.zombie.grass;

import java.util.Optional;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.GigaFootballZombieEntity;
import com.hungteen.pvz.utils.AnimationUtil;

import net.minecraft.client.renderer.model.ModelRenderer;

public class GigaFootballZombieModel extends PVZZombieModel<GigaFootballZombieEntity> {
	private final ModelRenderer total;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer up;
	private final ModelRenderer head;
	private final ModelRenderer helmet;
	private final ModelRenderer body;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_hand_armor;
	private final ModelRenderer right_arm_bone;
	private final ModelRenderer right_glove;
	private final ModelRenderer left_hand;
	private final ModelRenderer left_hand_armor;
	private final ModelRenderer left_arm_bone;
	private final ModelRenderer left_glove;

	public GigaFootballZombieModel() {
		texWidth = 128;
		texHeight = 96;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		right_leg = new ModelRenderer(this);
		right_leg.setPos(-1.9F, -12.0F, 0.0F);
		total.addChild(right_leg);
		right_leg.texOffs(0, 80).addBox(-2.125F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(1.9F, -12.0F, 0.0F);
		total.addChild(left_leg);
		left_leg.texOffs(16, 80).addBox(-1.875F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		up = new ModelRenderer(this);
		up.setPos(-1.9F, -12.0F, 0.0F);
		total.addChild(up);


		head = new ModelRenderer(this);
		head.setPos(1.9F, -12.0F, 0.0F);
		up.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		helmet = new ModelRenderer(this);
		helmet.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(helmet);
		helmet.texOffs(64, 0).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 1.0F, 9.0F, 0.0F, false);
		helmet.texOffs(64, 10).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		helmet.texOffs(102, 0).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 8.0F, 9.0F, 0.0F, false);
		helmet.texOffs(64, 19).addBox(4.0F, -8.0F, -5.0F, 1.0F, 8.0F, 9.0F, 0.0F, false);
		helmet.texOffs(84, 10).addBox(-4.0F, -1.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		helmet.texOffs(84, 12).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		helmet.texOffs(84, 14).addBox(-3.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		helmet.texOffs(88, 14).addBox(2.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		helmet.texOffs(92, 14).addBox(-3.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		helmet.texOffs(96, 14).addBox(2.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(1.9F, -12.0F, 0.0F);
		up.addChild(body);
		body.texOffs(48, 80).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-3.1F, -10.0F, 0.0F);
		up.addChild(right_hand);
		right_hand.texOffs(40, 16).addBox(-3.25F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		right_hand_armor = new ModelRenderer(this);
		right_hand_armor.setPos(-1.25F, 0.0F, 0.0F);
		right_hand.addChild(right_hand_armor);
		right_hand_armor.texOffs(64, 49).addBox(-5.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		right_hand_armor.texOffs(78, 49).addBox(-2.0F, -2.0F, 2.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(88, 49).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		right_hand_armor.texOffs(104, 49).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(64, 54).addBox(-3.0F, -2.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(68, 54).addBox(-4.0F, -2.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(72, 54).addBox(-5.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(76, 54).addBox(-4.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(80, 54).addBox(-3.0F, -2.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(84, 54).addBox(-5.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(102, 17).addBox(-4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(106, 17).addBox(-4.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(110, 17).addBox(-1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_hand_armor.texOffs(114, 17).addBox(-1.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		right_arm_bone = new ModelRenderer(this);
		right_arm_bone.setPos(-3.0F, 2.0F, 0.0F);
		right_hand_armor.addChild(right_arm_bone);
		setRotationAngle(right_arm_bone, 0.0F, 0.0F, 0.7854F);
		right_arm_bone.texOffs(64, 58).addBox(-3.5355F, -1.7071F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		right_glove = new ModelRenderer(this);
		right_glove.setPos(0.0F, 0.0F, 0.0F);
		right_hand.addChild(right_glove);
		right_glove.texOffs(32, 80).addBox(-3.25F, 7.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.125F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(6.9F, -10.0F, 0.0F);
		up.addChild(left_hand);
		left_hand.texOffs(32, 48).addBox(-0.75F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		left_hand_armor = new ModelRenderer(this);
		left_hand_armor.setPos(1.25F, 0.0F, 0.0F);
		left_hand.addChild(left_hand_armor);
		left_hand_armor.texOffs(114, 49).addBox(2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		left_hand_armor.texOffs(88, 54).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_hand_armor.texOffs(104, 54).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(124, 54).addBox(2.0F, -2.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(88, 59).addBox(3.0F, -2.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(92, 59).addBox(4.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(96, 59).addBox(3.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(100, 59).addBox(2.0F, -2.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(104, 59).addBox(4.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(114, 54).addBox(-2.0F, -2.0F, 2.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(118, 17).addBox(0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(122, 17).addBox(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(102, 19).addBox(3.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_hand_armor.texOffs(106, 19).addBox(3.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_arm_bone = new ModelRenderer(this);
		left_arm_bone.setPos(3.0F, 2.0F, 0.0F);
		left_hand_armor.addChild(left_arm_bone);
		setRotationAngle(left_arm_bone, 0.0F, 0.0F, -0.7854F);
		left_arm_bone.texOffs(112, 59).addBox(-0.4645F, -1.7071F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		left_glove = new ModelRenderer(this);
		left_glove.setPos(0.0F, 0.0F, 0.0F);
		left_hand.addChild(left_glove);
		left_glove.texOffs(72, 80).addBox(-0.75F, 7.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.125F, false);
	}

	@Override
	public void setupAnim(GigaFootballZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() == 0) {
			this.up.xRot = 0.5f;
			this.head.xRot = - 0.5f;
			this.head.yRot = 0f;
			this.right_hand.xRot = 0.5f;
			this.left_hand.xRot = - 0.5f;
		} else {
			this.up.xRot = 0f;
		}
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}

	@Override
	public void updateFreeParts(GigaFootballZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean hasMetal = entity.hasMetal();
		this.helmet.visible = hasMetal;
		this.right_hand_armor.visible = hasMetal;
		this.left_hand_armor.visible = hasMetal;
		final boolean isRushing = (entity.getAttackTime() == 0);
		this.isLeftHandFree = ! isRushing;
		this.isRightHandFree = ! isRushing;
	}

	@Override
	protected void doPreAttackPose() {
		//can hand attack
		if(this.isLeftHandFree || this.isRightHandFree) {
			if(this.isLeftHandFree) {
				this.getZombieLeftHand().xRot = HAND_MAX_ANGLE / 3;
			}
			if(this.isRightHandFree) {
				this.getZombieRightHand().xRot = - HAND_MAX_ANGLE / 3;
			}
		} 
	}

	@Override
	protected void doHandEat(GigaFootballZombieEntity entity) {
		if(this.isLeftHandFree) {
			this.getZombieLeftHand().xRot = HAND_MAX_ANGLE / 3 - AnimationUtil.getUpDown(MAX_ANIM_CD - entity.getAnimTime(), MAX_ANIM_CD, - 70);
		}
		if(this.isRightHandFree) {
			this.getZombieRightHand().xRot = - HAND_MAX_ANGLE / 3 + AnimationUtil.getUpDown(MAX_ANIM_CD - entity.getAnimTime(), MAX_ANIM_CD, - 70);
		}
	}

	@Override
	public Optional<ModelRenderer> getHelmet() {
		return Optional.ofNullable(this.helmet);
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
