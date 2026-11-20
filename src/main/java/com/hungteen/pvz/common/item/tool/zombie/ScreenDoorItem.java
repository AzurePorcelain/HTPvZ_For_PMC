package com.hungteen.pvz.common.item.tool.zombie;

import com.hungteen.pvz.common.item.PVZItemGroups;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class ScreenDoorItem extends ShieldItem{

	// durability predicate endpoints matching item model overrides (pvz:durability = (533 - damage) / 179).
	public static final int PREDICATE_MAX_DAMAGE = 533;
	public static final int PREDICATE_SCALE = 179;

	public ScreenDoorItem() {
		super(new Item.Properties().stacksTo(1).durability(1600).tab(PVZItemGroups.PVZ_USEFUL));
	}

	@OnlyIn(Dist.CLIENT)
	public static void initItemModel() {
		ItemModelsProperties.register(ItemRegister.SCREEN_DOOR.get(), StringUtil.prefix("blocking"), (stack, world, entity) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F);
		ItemModelsProperties.register(ItemRegister.SCREEN_DOOR.get(), StringUtil.prefix("durability"), (stack, world, entity) -> (float) (PREDICATE_MAX_DAMAGE - stack.getDamageValue()) / PREDICATE_SCALE);
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 144000;
	}
	
	@Override
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	}
	
	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == Items.IRON_INGOT;
	}
	
	@Override
	public boolean isShield(ItemStack stack, LivingEntity entity) {
		return true;
	}
	
}
