package com.hungteen.pvz.client.render.layer.component;

import com.hungteen.pvz.client.model.entity.plant.defence.PumpkinModel;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.plant.defence.PumpkinEntity;
import com.hungteen.pvz.common.impl.plant.PVZPlants;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;

public class
PumpkinArmorLayer<T extends PVZPlantEntity> extends ComponentLayer<T>{
	
	public PumpkinArmorLayer(IEntityRenderer<T, EntityModel<T>> entityRendererIn) {
		super(entityRendererIn, new PumpkinModel.PumpkinArmorModel<>());
	}

	@Override
	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn,
					   T entity, float limbSwing, float limbSwingAmount, float partialTicks,
					   float ageInTicks, float netHeadYaw, float headPitch) {
		if(this.canRender(entity)){
			matrixStackIn.pushPose();
			final float sz = entity.getPlantType().getRenderScale();
			final float sz1 = 1/sz;
			final Vector3d vec = getTranslateVec(entity);
			matrixStackIn.scale(sz1, sz1, sz1);
			final float sz2 = (sz-1F)*(6F/4F);
			matrixStackIn.translate(vec.x, vec.y+sz2, vec.z);//+ to down
			IVertexBuilder builder = bufferIn.getBuffer(RenderType.entityCutoutNoCull(this.getRenderTexture(entity)));
			this.model.render(matrixStackIn, builder, packedLightIn, OverlayTexture.NO_OVERLAY);
			matrixStackIn.popPose();
		}
	}

	public Vector3d getTranslateVec(T entity) {
		return new Vector3d(0, 0, 0);
	}

	@Override
	public boolean canRender(T entity) {
		return entity.getOuterDefenceLife() > 0;
	}

	protected ResourceLocation genArmorResource() {
		final String sep = PVZPlants.PUMPKIN.getEssence().toString();
		return new ResourceLocation(PVZPlants.PUMPKIN.getModID(), "textures/entity/plant/" + sep + "/" + "pumpkin_armor" + ".png");
	}

	private boolean isSuperPumpkin(T plants){
		double health = plants.getOuterDefenceLife();
		return health > PumpkinEntity.PumpkinInfo.getLife() && health <= PumpkinEntity.PumpkinInfo.getSuperPumpkinLife();
	}

	public ResourceLocation getRenderTexture(T plant) {
		return 	this.isSuperPumpkin(plant)?this.genArmorResource():PVZPlants.PUMPKIN.getRenderResource();
	}
	
}
