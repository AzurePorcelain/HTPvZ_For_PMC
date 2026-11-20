package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.BucketHeadZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.BucketHeadZombieEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BucketHeadZombieRender extends AbstractNormalRender<BucketHeadZombieEntity>{

	private static final ResourceLocation BUCKETHEAD_ZOMBIE_TEXTURE = StringUtil.prefix("textures/entity/zombie/grass/buckethead_zombie.png");

	public BucketHeadZombieRender(EntityRendererManager rendererManager) {
		super(rendererManager, new BucketHeadZombieModel<BucketHeadZombieEntity>(), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BucketHeadZombieEntity entity) {
		return BUCKETHEAD_ZOMBIE_TEXTURE;
	}

}

