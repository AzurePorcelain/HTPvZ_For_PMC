package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.NewspaperZombieModel;
import com.hungteen.pvz.client.model.entity.zombie.grass.OldZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.grass.NewspaperZombieEntity;
import com.hungteen.pvz.common.entity.zombie.grass.OldZombieEntity;

import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class OldZombieRender extends PVZZombieRender<OldZombieEntity>{
	private static final ResourceLocation RED_EYES_TEXTURE = StringUtil.prefix("textures/entity/zombie/grass/old_zombie_red_eyes.png");

	public OldZombieRender(EntityRendererManager rendererManager){
		super(rendererManager, new OldZombieModel(), 0.5F);
	}

	@Override
	public ResourceLocation getTextureLocation(OldZombieEntity entity) {
		final ResourceLocation texture;
		if (entity.isAngry()) {
			texture = RED_EYES_TEXTURE;
		} else {
			texture = super.getTextureLocation(entity);
		}
		return texture;
	}

}
