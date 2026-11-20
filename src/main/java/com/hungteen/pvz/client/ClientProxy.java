package com.hungteen.pvz.client;

import com.hungteen.pvz.client.render.layer.fullskin.ColdLayer;
import com.hungteen.pvz.common.CommonProxy;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.block.others.SteelLadderBlock;
import com.hungteen.pvz.common.item.armor.BucketArmorItem;
import com.hungteen.pvz.common.item.armor.ConeArmorItem;
import com.hungteen.pvz.common.item.armor.FootballArmorItem;
import com.hungteen.pvz.common.item.armor.GigaArmorItem;
import com.hungteen.pvz.common.item.tool.zombie.JackBoxItem;
import com.hungteen.pvz.common.item.tool.zombie.ScreenDoorItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ClientProxy extends CommonProxy{

	public static final Minecraft MC = Minecraft.getInstance();
	
	@Override
	public void init() {
	};
	
	@Override
	public void postInit() {
		this.addLayersForRender();
	};
	
	@Override
	public void setUpClient() {
		ConeArmorItem.initArmorModel();
		BucketArmorItem.initArmorModel();
		FootballArmorItem.initArmorModel();
		GigaArmorItem.initArmorModel();
		ScreenDoorItem.initItemModel();
		JackBoxItem.initItemModel();
		KeyBindRegister.init();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void addLayersForRender() {
		MC.getEntityRenderDispatcher().renderers.values().forEach(r -> {
			if (r instanceof LivingRenderer) {
				((LivingRenderer) r).addLayer(new ColdLayer<>((LivingRenderer) r));
			}
		});
	}

	@Override
	public void climbUp() {
		final PlayerEntity player = this.getPlayer();
		if(player != null && player.horizontalCollision && player.onClimbable()){
			//is on steel ladder.
			if(player.level.getBlockState(player.blockPosition()).getBlock().is(BlockRegister.STEEL_LADDER.get())) {
				ladderSpeed = Math.min(SteelLadderBlock.MAX_SPEED_UP, ladderSpeed + SteelLadderBlock.UP_SPEED * 0.8F);
				final Vector3d vec = player.getDeltaMovement();
				player.setDeltaMovement(vec.x, ladderSpeed, vec.z);
			} else {
				ladderSpeed = Math.max(0, ladderSpeed - SteelLadderBlock.UP_SPEED);
			}
		} else {
			ladderSpeed = 0.06F;
		}
	}

	@Override
	public PlayerEntity getPlayer() {
		return MC.player;
	}
}
