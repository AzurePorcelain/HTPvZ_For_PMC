package com.hungteen.pvz.client.model.entity.plant.arma;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.arma.MelonPultEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class MelonPultModel extends PVZPlantModel<MelonPultEntity> {
	private final ModelRenderer total;
	private final ModelRenderer head;
	private final ModelRenderer eye_brow;
	private final ModelRenderer eyes_closed;
	private final ModelRenderer pult;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r2;
	private final ModelRenderer busket;
	private final ModelRenderer melon;
	private final ModelRenderer n_leaves;
	private final ModelRenderer ne_r1;
	private final ModelRenderer nw_r1;
	private final ModelRenderer s_leaves;
	private final ModelRenderer sw_r1;
	private final ModelRenderer se_r1;

	public MelonPultModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(head);
		head.texOffs(0, 0).addBox(-7.0F, -10.5F, -5.0F, 14.0F, 10.0F, 10.0F, 0.0F, false);

		eye_brow = new ModelRenderer(this);
		eye_brow.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(eye_brow);
		eye_brow.texOffs(32, 44).addBox(-7.0F, -8.0F, -5.2F, 14.0F, 2.0F, 0.0F, 0.0F, false);

		eyes_closed = new ModelRenderer(this);
		eyes_closed.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(eyes_closed);
		eyes_closed.texOffs(0, 56).addBox(-6.0F, -7.5F, -4.991F, 12.0F, 6.0F, 0.0F, 0.0F, false);

		pult = new ModelRenderer(this);
		pult.setPos(0.0F, -9.0F, 5.0F);
		head.addChild(pult);
		setRotationAngle(pult, 0.3927F, 0.0F, 0.0F);
		pult.texOffs(52, 46).addBox(-1.5F, -1.5657F, -0.3848F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, 0.9343F, 1.6152F);
		pult.addChild(bone2);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, -0.1745F, 0.0F);
		cube_r1.texOffs(52, 52).addBox(-2.5F, -3.0F, 0.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(0.0F, 0.0F, 2.0F);
		bone2.addChild(bone3);


		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.75F);
		bone3.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
		cube_r2.texOffs(52, 58).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		busket = new ModelRenderer(this);
		busket.setPos(0.0F, -1.0F, 2.0F);
		bone3.addChild(busket);
		setRotationAngle(busket, -0.2182F, 0.0F, 0.0F);
		busket.texOffs(0, 0).addBox(-1.0F, -0.5671F, 0.0474F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		busket.texOffs(0, 20).addBox(-5.0F, -1.5671F, 1.0474F, 10.0F, 5.0F, 10.0F, 0.0F, false);
		busket.texOffs(0, 35).addBox(-4.0F, -1.5671F, 2.0474F, 8.0F, 4.0F, 8.0F, 0.0F, false);

		melon = new ModelRenderer(this);
		melon.setPos(0.0F, -5.0671F, 6.0474F);
		busket.addChild(melon);
		setRotationAngle(melon, -0.6545F, 0.0F, 0.0F);
		melon.texOffs(32, 27).addBox(-4.0F, -3.5F, -3.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

		n_leaves = new ModelRenderer(this);
		n_leaves.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(n_leaves);


		ne_r1 = new ModelRenderer(this);
		ne_r1.setPos(0.0F, 0.0F, 0.0F);
		n_leaves.addChild(ne_r1);
		setRotationAngle(ne_r1, -0.0873F, 0.0F, 0.0873F);
		ne_r1.texOffs(39, 18).addBox(-10.0F, 0.0F, -8.0F, 11.0F, 0.0F, 9.0F, 0.0F, false);

		nw_r1 = new ModelRenderer(this);
		nw_r1.setPos(0.0F, 0.0F, 0.0F);
		n_leaves.addChild(nw_r1);
		setRotationAngle(nw_r1, -0.0873F, 0.0F, -0.0873F);
		nw_r1.texOffs(29, 0).addBox(-1.0F, 0.0F, -8.0F, 11.0F, 0.0F, 9.0F, 0.0F, false);

		s_leaves = new ModelRenderer(this);
		s_leaves.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(s_leaves);


		sw_r1 = new ModelRenderer(this);
		sw_r1.setPos(0.0F, 0.0F, 0.0F);
		s_leaves.addChild(sw_r1);
		setRotationAngle(sw_r1, 0.0873F, 0.0F, -0.0873F);
		sw_r1.texOffs(13, 47).addBox(-1.0F, 0.0F, -1.0F, 11.0F, 0.0F, 9.0F, 0.0F, false);

		se_r1 = new ModelRenderer(this);
		se_r1.setPos(0.0F, 0.0F, 0.0F);
		s_leaves.addChild(se_r1);
		setRotationAngle(se_r1, 0.0873F, 0.0F, 0.0873F);
		se_r1.texOffs(-9, 47).addBox(-10.0F, 0.0F, -1.0F, 11.0F, 0.0F, 9.0F, 0.0F, false);
	}


	@Override
	public void setupAnim(MelonPultEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0) {
			float percent = 1 - entity.getAttackTime() * 1.0F / entity.getPultAnimTime();
			pult.xRot = (1F - MathHelper.abs(MathHelper.cos(percent * 3.14159F))) * 1.5F;
			this.melon.visible = (percent < 0.5);
		} else {
			pult.xRot = MathHelper.sin(ageInTicks / 10) / 8;
			this.melon.visible = true;
		}
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<MelonPultEntity> getPlantModel() {
		return this;
	}
}