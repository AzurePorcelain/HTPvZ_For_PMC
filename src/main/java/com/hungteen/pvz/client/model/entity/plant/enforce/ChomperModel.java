package com.hungteen.pvz.client.model.entity.plant.enforce;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.enforce.ChomperEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class ChomperModel extends PVZPlantModel<ChomperEntity> {
	private final ModelRenderer total;
	private final ModelRenderer root;
	private final ModelRenderer leafw;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leafe;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leafs;
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer leaf;
	private final ModelRenderer leafuw;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leafue;
	private final ModelRenderer cube_r4;
	private final ModelRenderer leafu;
	private final ModelRenderer head;
	private final ModelRenderer up_mouse;
	private final ModelRenderer down_mouse;
	private final ModelRenderer saliva;
	private final ModelRenderer saliva2;
	private final ModelRenderer tongue;
	private final ModelRenderer tongue2;
	private final ModelRenderer tongue3;

	public ChomperModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);

		root = new ModelRenderer(this);
		root.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(root);
		root.texOffs(80, 0).addBox(-3.5F, -5.0F, -3.5F, 7.0F, 5.0F, 7.0F, 0.0F, false);
		root.texOffs(96, 112).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		leafw = new ModelRenderer(this);
		leafw.setPos(0.0F, 0.0F, 0.0F);
		root.addChild(leafw);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 4.0F);
		leafw.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 2.0944F, 0.0F);
		cube_r1.texOffs(39, 0).addBox(-3.0F, -2.75F, 6.0F, 13.0F, 0.0F, 15.0F, 0.0F, false);
		cube_r1.texOffs(39, 15).addBox(-3.0F, -3.0F, 6.0F, 13.0F, 0.0F, 15.0F, 0.0F, false);

		leafe = new ModelRenderer(this);
		leafe.setPos(0.0F, 0.0F, 0.0F);
		root.addChild(leafe);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 4.0F);
		leafe.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -2.0944F, 0.0F);
		cube_r2.texOffs(39, 45).addBox(-10.0F, -2.75F, 6.0F, 13.0F, 0.0F, 15.0F, 0.0F, false);
		cube_r2.texOffs(26, 60).addBox(-10.0F, -3.0F, 6.0F, 13.0F, 0.0F, 15.0F, 0.0F, false);

		leafs = new ModelRenderer(this);
		leafs.setPos(0.0F, 0.0F, 0.0F);
		root.addChild(leafs);
		leafs.texOffs(0, 55).addBox(-6.5F, -3.0F, 3.0F, 13.0F, 0.0F, 15.0F, 0.0F, false);
		leafs.texOffs(39, 30).addBox(-6.5F, -2.75F, 3.0F, 13.0F, 0.0F, 15.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -2.0F, 0.0F);
		total.addChild(body);
		body.texOffs(81, 20).addBox(-3.0F, -12.0F, -2.0F, 6.0F, 12.0F, 5.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, -12.0F, 0.0F);
		body.addChild(bone);
		setRotationAngle(bone, -0.6545F, 0.0F, 0.0F);
		bone.texOffs(22, 90).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, -7.5F, 0.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 1.3526F, 0.0F, 0.0F);
		bone2.texOffs(0, 55).addBox(-1.5F, -9.0F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

		leaf = new ModelRenderer(this);
		leaf.setPos(0.0F, -7.5F, 0.0F);
		bone2.addChild(leaf);
		setRotationAngle(leaf, 0.829F, 0.0F, 0.0F);
		leaf.texOffs(80, 37).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		leafuw = new ModelRenderer(this);
		leafuw.setPos(0.0F, -2.0F, 2.0F);
		leaf.addChild(leafuw);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 6.0F, -1.0F);
		leafuw.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 2.0944F, 0.0F);
		cube_r3.texOffs(80, 49).addBox(-5.0F, -4.0F, 2.75F, 11.0F, 13.0F, 0.0F, 0.0F, false);
		cube_r3.texOffs(67, 84).addBox(-5.0F, -4.0F, 3.0F, 11.0F, 13.0F, 0.0F, 0.0F, false);

		leafue = new ModelRenderer(this);
		leafue.setPos(0.0F, -2.0F, 2.0F);
		leaf.addChild(leafue);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 2.0F, -1.0F);
		leafue.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -2.0944F, 0.0F);
		cube_r4.texOffs(89, 84).addBox(-5.0F, 0.0F, 2.75F, 11.0F, 13.0F, 0.0F, 0.0F, false);
		cube_r4.texOffs(0, 90).addBox(-5.0F, 0.0F, 3.0F, 11.0F, 13.0F, 0.0F, 0.0F, false);

		leafu = new ModelRenderer(this);
		leafu.setPos(0.0F, -2.0F, 2.0F);
		leaf.addChild(leafu);
		leafu.texOffs(89, 97).addBox(-5.0F, 2.0F, 2.0F, 11.0F, 13.0F, 0.0F, 0.0F, false);
		leafu.texOffs(67, 97).addBox(-5.0F, 2.0F, 1.75F, 11.0F, 13.0F, 0.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -24.0F, -2.0F);
		body.addChild(head);
		setRotationAngle(head, 1.5826F, 0.0F, 0.0F);
		head.texOffs(96, 113).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);

		up_mouse = new ModelRenderer(this);
		up_mouse.setPos(0.0F, -3.5F, 2.0F);
		head.addChild(up_mouse);
		setRotationAngle(up_mouse, -0.52F, 0.0F, 0.0F);
		up_mouse.texOffs(0, 0).addBox(-8.0F, -14.0F, -3.0F, 16.0F, 17.0F, 11.0F, 0.0F, false);
		up_mouse.texOffs(40, 62).addBox(0.0F, -13.0F, 1.0F, 0.0F, 19.0F, 13.0F, 0.0F, false);
		up_mouse.texOffs(67, 62).addBox(-8.5F, -15.0F, -0.25F, 17.0F, 19.0F, 3.0F, -0.01F, false);

		down_mouse = new ModelRenderer(this);
		down_mouse.setPos(0.0F, 0.5F, -3.0F);
		head.addChild(down_mouse);
		setRotationAngle(down_mouse, 0.52F, 0.0F, 0.0F);
		down_mouse.texOffs(0, 28).addBox(-8.0F, -14.5F, 0.0F, 16.0F, 16.0F, 11.0F, 0.05F, false);
		down_mouse.texOffs(0, 70).addBox(-8.5F, -16.0F, 4.75F, 17.0F, 18.0F, 2.0F, 0.0F, false);

		saliva = new ModelRenderer(this);
		saliva.setPos(0.0F, -24.0F, 8.0F);
		down_mouse.addChild(saliva);
		saliva.texOffs(-5, 105).addBox(-8.0F, 8.0F, -6.0F, 16.0F, 0.0F, 5.0F, 0.0F, false);

		saliva2 = new ModelRenderer(this);
		saliva2.setPos(0.0F, 0.0F, -5.0F);
		saliva.addChild(saliva2);
		saliva2.texOffs(-5, 110).addBox(-8.0F, 8.0F, -6.0F, 16.0F, 0.0F, 5.0F, 0.0F, false);

		tongue = new ModelRenderer(this);
		tongue.setPos(0.0F, -4.0F, -1.0F);
		head.addChild(tongue);
		tongue.texOffs(51, 95).addBox(-3.0F, -6.0F, 1.0F, 6.0F, 6.0F, -1.0F, 0.0F, false);

		tongue2 = new ModelRenderer(this);
		tongue2.setPos(0.0F, -5.0F, 0.0F);
		tongue.addChild(tongue2);
		tongue2.texOffs(23, 94).addBox(-3.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		tongue3 = new ModelRenderer(this);
		tongue3.setPos(0.0F, -9.0F, 0.0F);
		tongue2.addChild(tongue3);
		tongue3.texOffs(38, 95).addBox(-3.0F, -7.0F, 0.0F, 6.0F, 7.0F, 0.0F, 0.0F, false);

	}

	@Override
	public void setupAnim(ChomperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int tick = entity.getAttackTime();
		final int T = ChomperEntity.ATTACK_ANIM_CD;

		if(tick > 0 && tick <= T / 2) {//1 - 15
			this.body.xRot = 0.05f * tick;//0.5
			this.head.xRot = 0.25f - 0.075f * tick;//0.25 - -0.5
			if(tick <= T / 3) {//1 - 10
				this.up_mouse.xRot = - 0.52f - 0.05f*tick;
				this.down_mouse.xRot = 0.52f + 0.05f*tick;
			}else {// 11 - 15 (1 - 5)
				float tmp = tick - T / 3;
				this.up_mouse.xRot = - 1.02f - 0.05f * tmp;
				this.down_mouse.xRot = 1.02f + 0.05f * tmp;
			}
		} else if(tick > T / 2) {// 16 - 30 (1 - 15)
			final int tmp = tick - T / 2;
			this.body.xRot = 0.3f - 0.02f * tmp; // 减小幅度
			this.head.xRot = -0.3f + 0.05f * tmp; // 减小幅度
			this.up_mouse.xRot = -0.03f * tmp; // 减小幅度
			this.down_mouse.xRot = 0.03f * tmp;
		} else {
			this.body.xRot = 0;
			if(entity.getRestTick() > 0) {
				this.tongue.xRot = 0;
				this.tongue2.xRot = 0;
				this.head.xRot = 1.04f;
				this.up_mouse.xRot = - 0.15f;
				this.down_mouse.xRot = 0.15f;
				this.leaf.zRot = 0;
			}else {
				this.tongue.xRot = 0;
				this.tongue2.xRot = 0;
				this.head.xRot = 0.27360306F;
				this.up_mouse.xRot = -0.52f;
				this.down_mouse.xRot = 0.52f;
				this.leaf.zRot = 0;
			}
		}
		this.head.xRot += 1.30899694f;
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<ChomperEntity> getPlantModel() {
		return this;
	}
	
}