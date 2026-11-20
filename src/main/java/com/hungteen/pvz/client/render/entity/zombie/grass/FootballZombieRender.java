package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.zombie.grass.FootballZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.grass.FootballZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FootballZombieRender extends PVZZombieRender<FootballZombieEntity>{

	private static final ResourceLocation UNARMORED_TEXTURE = new ResourceLocation(
			PVZMod.MOD_ID, "textures/entity/zombie/grass/football_zombie_unarmored.png");

	public FootballZombieRender(EntityRendererManager rendererManager) {
		super(rendererManager, new FootballZombieModel(), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FootballZombieEntity entity) {
		return entity.hasMetal() ? super.getTextureLocation(entity) : UNARMORED_TEXTURE;
	}

}
