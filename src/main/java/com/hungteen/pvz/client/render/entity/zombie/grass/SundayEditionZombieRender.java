package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.SundayEditionZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.grass.SundayEditionZombieEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SundayEditionZombieRender extends PVZZombieRender<SundayEditionZombieEntity>{
	private static final ResourceLocation RED_EYES_TEXTURE = StringUtil.prefix("textures/entity/zombie/grass/sunday_edition_zombie_red_eyes.png");

	public SundayEditionZombieRender(EntityRendererManager rendererManager) {
		super(rendererManager, new SundayEditionZombieModel(), 0.51F);
	}

	@Override
	public ResourceLocation getTextureLocation(SundayEditionZombieEntity entity) {
		final ResourceLocation texture;
		if (entity.isAngry()) {
			texture = RED_EYES_TEXTURE;
		} else {
			texture = super.getTextureLocation(entity);
		}
		return texture;
	}
	
}