package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.JackInBoxZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.JackInBoxZombieEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class JackInBoxZombieRender extends PVZZombieRender<JackInBoxZombieEntity>{

	private static final ResourceLocation BOX_OPEN_TEXTURE = StringUtil.prefix("textures/entity/zombie/pool/jack_in_box_zombie_open.png");
	private static final ResourceLocation BOX_SHINING_TEXTURE = StringUtil.prefix("textures/entity/zombie/pool/jack_in_box_zombie_shining.png");

	public JackInBoxZombieRender(EntityRendererManager rendererManager) {
		super(rendererManager, new JackInBoxZombieModel(), 0.45f);
	}
	
	@Override
	public ResourceLocation getTextureLocation(JackInBoxZombieEntity entity) {
		ResourceLocation texture = super.getTextureLocation(entity);
		final int attackTime = entity.getAttackTime();
		if (entity.hasMetal() && attackTime >= 0) {
			if (attackTime > 0 && attackTime <= 5) {
				texture = BOX_SHINING_TEXTURE;
			} else {
				texture = BOX_OPEN_TEXTURE;
			}
		}
		return texture;
	}

	@Override
	protected boolean isShaking(JackInBoxZombieEntity p_230495_1_) {
		return true;
	}

}
