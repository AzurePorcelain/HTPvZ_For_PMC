package com.hungteen.pvz.client.model.entity.plant.enforce;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.enforce.UmbrellaLeafEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class UmbrellaLeafModel extends PVZPlantModel<UmbrellaLeafEntity> {
	private final ModelRenderer total;
	private final ModelRenderer head;
	private final ModelRenderer leaves;
	private final ModelRenderer flower;
	private final ModelRenderer open;
	private final ModelRenderer open2;
	private final ModelRenderer open2_r1;
	private final ModelRenderer open1;
	private final ModelRenderer closed;
	private final ModelRenderer swe;
	private final ModelRenderer swd;
	private final ModelRenderer nw;
	private final ModelRenderer e;
	private final ModelRenderer sw;

	public UmbrellaLeafModel() {
		texWidth = 256;
		texHeight = 256;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(head);
		head.texOffs(0, 0).addBox(-1.0F, -12.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.texOffs(0, 49).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);

		leaves = new ModelRenderer(this);
		leaves.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(leaves);


		flower = new ModelRenderer(this);
		flower.setPos(0.0F, -12.9F, 0.0F);
		leaves.addChild(flower);
		flower.texOffs(-7, 4).addBox(-3.5F, -0.15F, -3.5F, 7.0F, 0.0F, 7.0F, 0.0F, false);
		flower.texOffs(-7, 11).addBox(-3.5F, -0.01F, -3.5F, 7.0F, 0.0F, 7.0F, 0.0F, false);

		open = new ModelRenderer(this);
		open.setPos(0.0F, -12.0F, 0.0F);
		leaves.addChild(open);


		open2 = new ModelRenderer(this);
		open2.setPos(0.0F, 0.0F, 0.0F);
		open.addChild(open2);


		open2_r1 = new ModelRenderer(this);
		open2_r1.setPos(0.0F, 12.0F, 0.0F);
		open2.addChild(open2_r1);
		setRotationAngle(open2_r1, 0.0F, -0.7854F, 0.0F);
		open2_r1.texOffs(0, 0).addBox(-21.0F, -12.0F, -21.0F, 42.0F, 0.0F, 42.0F, 0.0F, false);

		open1 = new ModelRenderer(this);
		open1.setPos(0.0F, 0.75F, 0.0F);
		open.addChild(open1);
		open1.texOffs(0, 42).addBox(-21.0F, 0.0F, -21.0F, 42.0F, 0.0F, 42.0F, 0.0F, false);

		closed = new ModelRenderer(this);
		closed.setPos(0.0F, 0.0F, 0.0F);
		leaves.addChild(closed);


		swe = new ModelRenderer(this);
		swe.setPos(0.0F, -12.0F, 0.0F);
		closed.addChild(swe);
		swe.texOffs(0, 71).addBox(-5.0F, 0.5F, -1.0F, 6.0F, 10.0F, 5.0F, 0.0F, false);

		swd = new ModelRenderer(this);
		swd.setPos(0.0F, -12.0F, 0.0F);
		closed.addChild(swd);
		swd.texOffs(18, 60).addBox(-1.0F, -0.15F, -1.01F, 6.0F, 10.0F, 6.0F, 0.0F, false);

		nw = new ModelRenderer(this);
		nw.setPos(0.0F, -12.0F, 0.0F);
		closed.addChild(nw);
		nw.texOffs(0, 18).addBox(-2.0F, -0.5F, -7.0F, 8.0F, 10.0F, 7.0F, 0.0F, false);

		e = new ModelRenderer(this);
		e.setPos(0.0F, -12.0F, 0.0F);
		closed.addChild(e);
		e.texOffs(0, 86).addBox(-7.0F, 0.0F, -5.0F, 8.0F, 10.0F, 11.0F, 0.0F, false);

		sw = new ModelRenderer(this);
		sw.setPos(0.0F, -12.0F, 0.0F);
		closed.addChild(sw);
		sw.texOffs(0, 35).addBox(-1.0F, -0.25F, -1.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(UmbrellaLeafEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
		if(entity.getAttackTime() > 0){
			this.open.visible = true;
			this.closed.visible = false;
		}else {
			this.open.visible = false;
			this.closed.visible = true;
		}
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<UmbrellaLeafEntity> getPlantModel() {
		return this;
	}
}