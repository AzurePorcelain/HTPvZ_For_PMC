package com.hungteen.pvz.client.model.entity.zombie.pool;

import java.util.Optional;

import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.JackInBoxZombieEntity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class JackInBoxZombieModel extends PVZZombieModel<JackInBoxZombieEntity> {
	private final ModelRenderer total;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_pants;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_pants;
	private final ModelRenderer up;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer jacket;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_sleeve;
	private final ModelRenderer right_sleeve_drop;
	private final ModelRenderer left_hand;
	private final ModelRenderer left_sleeve;
	private final ModelRenderer left_sleeve_drop;

	private final ModelRenderer jack_box;
	private final ModelRenderer jack_box_outer;
	private final ModelRenderer jack_box_inner;
	private final ModelRenderer jack_crank_axis;
	private final ModelRenderer jack_crank;
	private final ModelRenderer jack_stem;
	private final ModelRenderer jack_head;
	private final ModelRenderer jack_lid;

	public JackInBoxZombieModel() {
		texWidth = 128;
		texHeight = 64;

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
		head.setPos(1.9F, -12.0F, 0.0F);
		up.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(1.9F, -12.0F, 0.0F);
		up.addChild(body);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		jacket = new ModelRenderer(this);
		jacket.setPos(0.0F, 24.0F, 0.0F);
		body.addChild(jacket);
		jacket.texOffs(16, 32).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-3.1F, -10.0F, 0.0F);
		up.addChild(right_hand);
		right_hand.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_sleeve = new ModelRenderer(this);
		right_sleeve.setPos(5.0F, 22.0F, 0.0F);
		right_hand.addChild(right_sleeve);
		right_sleeve.texOffs(40, 32).addBox(-8.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		right_sleeve_drop = new ModelRenderer(this);
		right_sleeve_drop.setPos(-1.0F, 10.0F, -1.0F);
		right_hand.addChild(right_sleeve_drop);
		right_sleeve_drop.texOffs(24, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(6.9F, -10.0F, 0.0F);
		up.addChild(left_hand);
		left_hand.texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_sleeve = new ModelRenderer(this);
		left_sleeve.setPos(-5.0F, 22.0F, 0.0F);
		left_hand.addChild(left_sleeve);
		left_sleeve.texOffs(48, 48).addBox(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		left_sleeve_drop = new ModelRenderer(this);
		left_sleeve_drop.setPos(1.0F, 10.0F, -1.0F);
		left_hand.addChild(left_sleeve_drop);
		left_sleeve_drop.texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, 0.0F, false);

		//this.rightHandOriginAngel = -60;

		jack_box = new ModelRenderer(this);
		jack_box.setPos(-0.25F, 10.0F, 0.0F);
		right_hand.addChild(jack_box);
		setRotationAngle(jack_box, 1.0472F, 0.0F, 0.0F);

		jack_box_outer = new ModelRenderer(this);
		jack_box_outer.setPos(-4.0F, 0.0F, 4.0F);
		jack_box.addChild(jack_box_outer);
		jack_box_outer.texOffs(64, 0).addBox(0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		jack_box_inner = new ModelRenderer(this);
		jack_box_inner.setPos(4.0F, -8.0F, -4.0F);
		jack_box.addChild(jack_box_inner);
		jack_box_inner.texOffs(96, 33).addBox(0.0F, 8.0F, 8.0F, -8.0F, -8.0F, -8.0F, 0.01F, false);

		jack_crank_axis = new ModelRenderer(this);
		jack_crank_axis.setPos(4.0F, -3.0F, 0.5F);
		jack_box.addChild(jack_crank_axis);
		jack_crank_axis.texOffs(97, 17).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		jack_crank = new ModelRenderer(this);
		jack_crank.setPos(6.0F, -1.0F, 1.0F);
		jack_box.addChild(jack_crank);
		jack_crank.texOffs(104, 17).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		jack_stem = new ModelRenderer(this);
		jack_stem.setPos(-2.5F, -4.0F, 2.5F);
		jack_box.addChild(jack_stem);
		jack_stem.texOffs(64, 34).addBox(1.0F, -6.0F, -4.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		jack_head = new ModelRenderer(this);
		jack_head.setPos(-2.25F, -10.0F, 3.65F);
		jack_box.addChild(jack_head);
		jack_head.texOffs(77, 34).addBox(1.0F, -5.0F, -5.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		setRotationAngle(jack_head, 0.0F, 0.3927F, 0.0F);

		jack_lid = new ModelRenderer(this);
		jack_lid.setPos(0.0F, -8.0F, 3.0F);
		jack_box.addChild(jack_lid);
		jack_lid.texOffs(98, 34).addBox(-3.0F, -6.0F, 0.0F, 6.0F, 6.0F, 0.0F, 0.0F, false);
		setRotationAngle(jack_lid, -0.7854F, 0.0F, 0.0F);

		setRotationAngle(right_hand, -1.0472F, 0.0F, 0.0F);
	}

	@Override
	public void setupAnim(JackInBoxZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		this.jack_crank.y = -1.0F;
		if (entity.hasMetal()) {
			this.right_hand.xRot = -1.0472F;
			this.left_hand.xRot = MathHelper.sin(ageInTicks) * 0.08F - 1.4F;
			final int attackTime = entity.getAttackTime();
			if (attackTime >= 0 && attackTime <= JackInBoxZombieEntity.JACK_EXPLODE_CD) {
				final int elapsed = JackInBoxZombieEntity.JACK_EXPLODE_CD - attackTime;
				if (MathHelper.sin(elapsed) <= 0.0F) {
					this.jack_crank.y = -4.0F;
				}
			}
		}
		this.jack_box.xRot = -this.right_hand.xRot;
		this.left_sleeve_drop.xRot = -this.left_hand.xRot;
		this.right_sleeve_drop.xRot = -this.right_hand.xRot;
	}

	@Override
	public void updateFreeParts(JackInBoxZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean hasBox = entity.hasMetal();
		this.isRightHandFree = !hasBox;
		this.isLeftHandFree = !hasBox;
		this.jack_box.visible = hasBox;
	}

	@Override
	public void tickPartAnim(IBodyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		super.tickPartAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		this.jack_box.xRot = 1.0472F;
		this.jack_crank.y = -1.0F;
		this.left_sleeve_drop.xRot = -this.left_hand.xRot;
		this.right_sleeve_drop.xRot = -this.right_hand.xRot;
	}

	@Override
	public void renderBody(IBodyEntity entity, MatrixStack stack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		if (entity.getBodyType() == BodyType.DEFENCE) {
			this.jack_box.visible = true;
			final float heldAngle = this.jack_box.xRot;
			this.jack_box.xRot = 0.0F;
			stack.pushPose();
			stack.translate(-this.jack_box.x / 16.0F, 1.5F - this.jack_box.y / 16.0F, -this.jack_box.z / 16.0F);
			this.jack_box.render(stack, buffer, packedLight, packedOverlay);
			stack.popPose();
			this.jack_box.xRot = heldAngle;
		} else {
			this.jack_box.visible = entity.getBodyType() == BodyType.BODY && entity.hasHandDefence();
			super.renderBody(entity, stack, buffer, packedLight, packedOverlay);
		}
	}

	@Override
	public Optional<ModelRenderer> getHandDefence() {
		return Optional.of(this.jack_box);
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
