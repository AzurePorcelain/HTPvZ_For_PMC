package com.hungteen.pvz.client.render.entity.plant.light;

import com.hungteen.pvz.client.model.entity.plant.light.SunShroomModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.light.SunShroomEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SunShroomRender extends PVZPlantRender<SunShroomEntity>{
	private static final ResourceLocation GROWN_TEXTURE = StringUtil.prefix("textures/entity/plant/light/sun_shroom_grown.png");
	
	public SunShroomRender(EntityRendererManager rendererManager) {
		super(rendererManager, new SunShroomModel(), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(SunShroomEntity entity) {
		return entity.getExistTick() >= SunShroomEntity.GROW_CD - SunShroomEntity.GROW_ANIM_CD
				? GROWN_TEXTURE : super.getTextureLocation(entity);
	}

	@Override
	public float getScaleByEntity(SunShroomEntity entity) {
		final float smallSize = 0.6F;
		final float bigSize = 1.0F;
		final int T = SunShroomEntity.GROW_ANIM_CD;
		final int tick = entity.getExistTick();
		float size = smallSize;
		if (tick > 20 && entity.isInGrowStage(2)) {
			size = bigSize;
		} else if (tick > 20 && entity.isInGrowStage(1)) {
			final int now = tick + T - SunShroomEntity.GROW_CD;
			size = now >= 0 ? smallSize + (bigSize - smallSize) * now / T : smallSize;
		}
		return size;
	}

}