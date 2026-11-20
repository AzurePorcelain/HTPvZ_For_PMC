package com.hungteen.pvz.client.render.entity.plant.assist;

import javax.annotation.Nullable;

import com.hungteen.pvz.client.model.entity.plant.assist.MagnetShroomModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.client.render.layer.item.MetalItemLayer;
import com.hungteen.pvz.common.entity.plant.assist.MagnetShroomEntity;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MagnetShroomRender extends PVZPlantRender<MagnetShroomEntity> {

	public MagnetShroomRender(EntityRendererManager rendererManager) {
		super(rendererManager, new MagnetShroomModel(), 0.3f);
	}

	@Override
	protected void addPlantLayers() {
		super.addPlantLayers();
		this.addLayer(new MetalItemLayer<>(this));
	}
	
	@Override
	@Nullable
	protected RenderType getRenderType(MagnetShroomEntity entity, boolean p_230496_2_, boolean p_230496_3_, boolean p_230496_4_) {
		ResourceLocation resourcelocation = this.getTextureLocation(entity);
		return RenderType.entityTranslucentCull(resourcelocation);
	}
	
}
