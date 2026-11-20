package com.hungteen.pvz.client.render.entity.zombie.roof;

import com.hungteen.pvz.client.model.entity.zombie.roof.GargantuarModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.client.render.layer.item.GargantuarItemLayer;
import com.hungteen.pvz.common.entity.zombie.roof.GigaGargantuarEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GigaGargantuarRender extends PVZZombieRender<GigaGargantuarEntity> {

	private static final ResourceLocation TEX1 = StringUtil.prefix("textures/entity/zombie/roof/giga_gargantuar.png");
	private static final ResourceLocation TEX2 = StringUtil.prefix("textures/entity/zombie/roof/giga_gargantuar_damaged.png");

	public GigaGargantuarRender(EntityRendererManager rendererManager) {
		super(rendererManager, new GargantuarModel<>(), 1F);
		this.addLayer(new GargantuarItemLayer<>(this));
	}

	@Override
	public ResourceLocation getTextureLocation(GigaGargantuarEntity entity) {
		final double percent = entity.getHealth() / entity.getMaxHealth();
		return percent > 2 / 3F ? TEX1 : TEX2;
	}
}