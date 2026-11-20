package com.hungteen.pvz.client.model.entity.plant.toxic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.toxic.PuffShroomEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings


public class PuffShroomModel extends PVZPlantModel<PuffShroomEntity> {
	private final ModelRenderer total;
	private final ModelRenderer eyes_closed;
	private final ModelRenderer hat;
	private final ModelRenderer mouth;

	public PuffShroomModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 18.0F, 0.0F);
		total.texOffs(0, 25).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		eyes_closed = new ModelRenderer(this);
		eyes_closed.setPos(0.0F, 6.0F, -1.0F);
		total.addChild(eyes_closed);
		eyes_closed.texOffs(0, 37).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 6.0F, 6.0F, -0.001F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, 0.5F, -1.0F);
		total.addChild(hat);
		hat.texOffs(0, 0).addBox(-5.0F, -4.75F, -4.0F, 10.0F, 5.0F, 10.0F, 0.0F, false);
		hat.texOffs(0, 15).addBox(-5.0F, -0.25F, -4.0F, 10.0F, 0.0F, 10.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setPos(0.5F, 5.5F, -4.0F);
		total.addChild(mouth);
		mouth.texOffs(0, 0).addBox(-2.0F, -2.75F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(PuffShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<PuffShroomEntity> getPlantModel() {
		return this;
	}
}