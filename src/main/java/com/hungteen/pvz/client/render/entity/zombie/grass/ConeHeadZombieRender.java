package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.ConeHeadZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.ConeHeadZombieEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ConeHeadZombieRender extends AbstractNormalRender<ConeHeadZombieEntity>{

	private static final ResourceLocation CONEHEAD_ZOMBIE_TEXTURE = StringUtil.prefix("textures/entity/zombie/grass/conehead_zombie.png");

	public ConeHeadZombieRender(EntityRendererManager rendererManager) {
		super(rendererManager, new ConeHeadZombieModel<ConeHeadZombieEntity>(), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ConeHeadZombieEntity entity) {
		return CONEHEAD_ZOMBIE_TEXTURE;
	}

}
