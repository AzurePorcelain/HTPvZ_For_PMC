package com.hungteen.pvz.client.model.entity.zombie.roof;

import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.roof.ImpEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class ImpModel extends PVZZombieModel<ImpEntity> {
	private final ModelRenderer total;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_pants;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_pants;
	private final ModelRenderer up;
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer body;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_sleeve;
	private final ModelRenderer left_hand;
	private final ModelRenderer left_sleeve;

	public ImpModel() {
		texWidth = 64;
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

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(hat);
		hat.texOffs(32, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

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

		this.young = true;
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

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		if(this.young) {
			final boolean headVisible = this.head.visible;
			matrixStack.pushPose();
			matrixStack.scale(0.65F, 0.75F, 0.65F);
			matrixStack.translate(0.0D, 1.0D, 0.0D);
			this.head.setPos(0.0F, 0.0F, 0.0F);
			this.head.render(matrixStack, buffer, packedLight, packedOverlay);
			this.head.setPos(1.9F, -12.0F, 0.0F);
			matrixStack.popPose();
			matrixStack.pushPose();
			matrixStack.scale(0.5F, 0.5F, 0.5F);
			matrixStack.translate(0.0D, 1.5D, 0.0D);
			this.head.visible = false;
			this.getZombieWholeBody().render(matrixStack, buffer, packedLight, packedOverlay);
			this.head.visible = headVisible;
			matrixStack.popPose();
		} else {
			this.getZombieWholeBody().render(matrixStack, buffer, packedLight, packedOverlay);
		}
	}

	@Override
	public void renderBody(IBodyEntity entity, MatrixStack stack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		if(this.young) {
			switch(entity.getBodyType()) {
			case HEAD:{
				this.getZombieHead().visible = true;
				this.getHelmet().ifPresent(m -> m.visible = false);
				stack.pushPose();
				stack.scale(0.65F, 0.75F, 0.65F);
				stack.translate(0.0D, 0.5D, 0.0D);
				this.getZombieHead().setPos(0, 24, 0);
				this.getZombieHead().render(stack, buffer, packedLight, packedOverlay);
				stack.popPose();
				break;
			}
			case HAND:{
				this.getZombieLeftHand().visible = true;
				stack.pushPose();
				stack.scale(0.5F, 0.5F, 0.5F);
				stack.translate(0.0D, 1.5D, 0.0D);
				this.getZombieLeftHand().setPos(0, 24, 0);
				this.getZombieLeftHand().xRot = 0;
				this.getZombieLeftHand().render(stack, buffer, packedLight, packedOverlay);
				stack.popPose();
				break;
			}
			case BODY:{
				this.getZombieLeftHand().visible = entity.hasHandDefence();
				this.getZombieHead().visible = false;
				stack.pushPose();
				stack.scale(0.5F, 0.5F, 0.5F);
				stack.translate(0.0D, 1.7D, 0.0D);
				this.getZombieWholeBody().render(stack, buffer, packedLight, packedOverlay);
				stack.popPose();
				break;
			}
			default:{
				super.renderBody(entity, stack, buffer, packedLight, packedOverlay);
				break;
			}
			}
		} else {
			super.renderBody(entity, stack, buffer, packedLight, packedOverlay);
		}
	}

}