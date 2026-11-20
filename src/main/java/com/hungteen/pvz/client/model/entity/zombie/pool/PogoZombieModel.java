package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.PogoZombieEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class PogoZombieModel extends PVZZombieModel<PogoZombieEntity> {

	private final ModelRenderer total;
	private final ModelRenderer up;
	private final ModelRenderer head;
	private final ModelRenderer glass_r1;
	private final ModelRenderer glass_r2;
	private final ModelRenderer glass_r3;
	private final ModelRenderer body;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_hand;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer pogo;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public PogoZombieModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 20.0F, 2.0F);


		up = new ModelRenderer(this);
		up.setPos(0.0F, -12.0F, 0.0F);
		total.addChild(up);


		head = new ModelRenderer(this);
		head.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(32, 0).addBox(0.0F, -10.1F, -3.0F, 0.0F, 2.25F, 6.0F, 0.0F, false);

		glass_r1 = new ModelRenderer(this);
		glass_r1.setPos(-5.0F, -2.25F, -4.25F);
		head.addChild(glass_r1);
		setRotationAngle(glass_r1, 1.7677F, -1.4818F, -1.7685F);
		glass_r1.texOffs(0, 56).addBox(0.0F, -5.0F, -1.0F, 8.0F, 8.0F, 0.0F, 0.0F, false);

		glass_r2 = new ModelRenderer(this);
		glass_r2.setPos(3.0F, -2.25F, -4.25F);
		head.addChild(glass_r2);
		setRotationAngle(glass_r2, 1.3739F, -1.4818F, -1.3731F);
		glass_r2.texOffs(0, 56).addBox(0.0F, -5.0F, -1.0F, 8.0F, 8.0F, 0.0F, 0.0F, false);

		glass_r3 = new ModelRenderer(this);
		glass_r3.setPos(0.0F, -2.25F, -3.25F);
		head.addChild(glass_r3);
		setRotationAngle(glass_r3, 0.0873F, 0.0F, 0.0F);
		glass_r3.texOffs(0, 48).addBox(-4.0F, -5.0F, -1.0F, 8.0F, 8.0F, 0.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -12.0F, 0.0F);
		up.addChild(body);
		body.texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(-5.0F, -10.0F, 0.0F);
		up.addChild(left_hand);
		setRotationAngle(left_hand, -0.5672F, 0.0F, -0.2618F);
		left_hand.texOffs(24, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		left_hand.texOffs(32, 32).addBox(-3.5F, -2.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(5.0F, -10.0F, 0.0F);
		up.addChild(right_hand);
		setRotationAngle(right_hand, -0.5672F, 0.0F, 0.2618F);
		right_hand.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_hand.texOffs(32, 32).addBox(-1.5F, -2.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(-1.9F, -12.0F, 0.0F);
		total.addChild(left_leg);
		setRotationAngle(left_leg, -0.5672F, 0.0F, 0.1745F);
		left_leg.texOffs(0, 32).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(1.9F, -12.0F, 0.0F);
		total.addChild(right_leg);
		setRotationAngle(right_leg, -0.5672F, 0.0F, -0.1745F);
		right_leg.texOffs(16, 32).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		pogo = new ModelRenderer(this);
		pogo.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(pogo);
		pogo.texOffs(32, 49).addBox(-5.5F, -15.5F, -7.25F, 11.0F, 2.0F, 2.0F, 0.0F, false);
		pogo.texOffs(52, 32).addBox(-1.0F, -10.0F, -6.5F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		pogo.texOffs(32, 53).addBox(0.5F, -2.0F, -7.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		pogo.texOffs(60, 32).addBox(-0.5F, -8.25F, -6.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		pogo.texOffs(56, 16).addBox(-1.0F, 3.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(1.5F, 3.0F, -5.0F);
		pogo.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.texOffs(32, 53).addBox(2.0F, -5.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-1.0F, -10.0F, -6.75F);
		pogo.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
		cube_r2.texOffs(16, 50).addBox(-1.0F, -8.0F, -1.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
	}


	@Override
	public void setupAnim(PogoZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.hasPogo()) {
			this.left_hand.xRot = -0.4363F;
			this.left_hand.yRot = 0.0873F;
			this.right_hand.xRot = -0.4363F;
			this.right_hand.yRot = -0.0873F;
			this.left_leg.xRot = -0.4363F;
			this.left_leg.yRot = -0.2618F;
			this.right_leg.xRot = -0.4363F;
			this.right_leg.yRot = 0.2618F;
			this.total.xRot = 0.0873F;
			this.head.yRot = netHeadYaw / (180F / (float)Math.PI);
            this.head.xRot = headPitch / (180F / (float)Math.PI);
		} else {
	        this.left_hand.yRot = 0;
	        this.right_hand.yRot = 0;
			this.left_leg.yRot = 0;
	        this.right_leg.yRot = 0;
	        this.total.xRot = 0;
	        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
		this.updateFreeParts(entity);
		this.pogo.visible = entity.hasMetal();
	}
	
	@Override
	public void tickPartAnim(IBodyEntity entity, float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch) {
		this.left_hand.yRot = 0;
        this.right_hand.yRot = 0;
		this.left_leg.yRot = 0;
        this.right_leg.yRot = 0;
        this.left_leg.xRot = 0;
        this.right_leg.xRot = 0;
        this.total.xRot = 0;
		super.tickPartAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}
	
	@Override
	public void renderBody(IBodyEntity entity, MatrixStack stack, IVertexBuilder buffer, int packedLight,
			int packedOverlay) {
		this.pogo.visible = false;
		super.renderBody(entity, stack, buffer, packedLight, packedOverlay);
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