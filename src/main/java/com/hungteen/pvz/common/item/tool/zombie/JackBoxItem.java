package com.hungteen.pvz.common.item.tool.zombie;

import java.util.List;

import com.hungteen.pvz.PVZConfig;
import com.hungteen.pvz.common.datapack.LotteryTypeLoader;
import com.hungteen.pvz.common.entity.zombie.pool.JackInBoxZombieEntity;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.item.PVZItemGroups;
import com.hungteen.pvz.common.tileentity.SlotMachineTileEntity;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class JackBoxItem extends Item {

	public JackBoxItem() {
		super(new Properties().tab(PVZItemGroups.PVZ_USEFUL));
	}

	@Override
	public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack stack = playerIn.getItemInHand(handIn);
		if(! worldIn.isClientSide) {
			if(playerIn.getRandom().nextInt(PVZConfig.COMMON_CONFIG.ItemSettings.JackBoxSurpriseChance.get()) == 0){
				PlayerUtil.playClientSound(playerIn, SoundRegister.JACK_SURPRISE.get());
				Explosion.Mode mode = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(playerIn.level, playerIn) ? Explosion.Mode.DESTROY : Explosion.Mode.NONE;
				playerIn.level.explode(playerIn, playerIn.getX(), playerIn.getY(), playerIn.getZ(), 3f, mode);
			} else {
				PlayerUtil.playClientSound(playerIn, SoundRegister.JACK_MUSIC.get());
				LotteryTypeLoader.getLotteryType(SlotMachineTileEntity.LotteryType.ALL_PLANTS).ifPresent(lotteryType -> {
					lotteryType.getSlotType(playerIn.getRandom()).getStack().ifPresent(s -> {
						playerIn.addItem(s.copy());
					});
				});
			}
			stack.shrink(1);
			return ActionResult.consume(stack);
		}
		return ActionResult.success(stack);
	}

	@OnlyIn(Dist.CLIENT)
	public static void initItemModel() {
		ItemModelsProperties.register(ItemRegister.JACK_BOX.get(), StringUtil.prefix("open"),
				(stack, world, entity) -> entity instanceof JackInBoxZombieEntity && ((JackInBoxZombieEntity) entity).getAttackTime() >= 0 ? 1.0F : 0.0F);
		ItemModelsProperties.register(ItemRegister.JACK_BOX.get(), StringUtil.prefix("shining"),
				(stack, world, entity) -> {
					if(entity instanceof JackInBoxZombieEntity) {
						final int at = ((JackInBoxZombieEntity) entity).getAttackTime();
						return at > 0 && at <= 5 ? 1.0F : 0.0F;
					}
					return 0.0F;
				});
	}

	@Override
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.pvz.jack_box").withStyle(TextFormatting.RED));
	}

}