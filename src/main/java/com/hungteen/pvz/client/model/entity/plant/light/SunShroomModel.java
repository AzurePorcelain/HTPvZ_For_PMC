package com.hungteen.pvz.client.model.entity.plant.light;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.light.SunShroomEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings


public class SunShroomModel extends PVZPlantModel<SunShroomEntity> {
	private final ModelRenderer total;
	private final ModelRenderer eyes_closed;
	private final ModelRenderer hat;

	public SunShroomModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);
		total.texOffs(0, 16).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		eyes_closed = new ModelRenderer(this);
		eyes_closed.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(eyes_closed);
		eyes_closed.texOffs(24, 16).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, -0.01F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, -5.0F, 0.0F);
		total.addChild(hat);
		hat.texOffs(0, 0).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 6.0F, 10.0F, 0.0F, false);
		hat.texOffs(20, 0).addBox(-5.0F, 0.5F, -5.0F, 10.0F, 0.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(SunShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<SunShroomEntity> getPlantModel() {
		return this;
	}
}