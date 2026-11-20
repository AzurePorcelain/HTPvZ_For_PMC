package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.NewspaperZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.grass.NewspaperZombieEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class NewspaperZombieRender extends PVZZombieRender<NewspaperZombieEntity>{
	private static final ResourceLocation RED_EYES_TEXTURE = StringUtil.prefix("textures/entity/zombie/grass/newspaper_zombie_red_eyes.png");
	
	public NewspaperZombieRender(EntityRendererManager rendererManager){
		super(rendererManager, new NewspaperZombieModel(), 0.5F);
	}

	@Override
	public ResourceLocation getTextureLocation(NewspaperZombieEntity entity) {
		final ResourceLocation texture;
		if (entity.isAngry()) {
			texture = RED_EYES_TEXTURE;
		} else {
			texture = super.getTextureLocation(entity);
		}
		return texture;
	}

}