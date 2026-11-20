package com.hungteen.pvz.client.render.layer.item;

import com.hungteen.pvz.client.model.entity.zombie.grass.ScreenDoorZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.ScreenDoorZombieEntity;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.item.tool.zombie.ScreenDoorItem;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ScreenDoorItemLayer<T extends ScreenDoorZombieEntity> extends LayerRenderer<T, EntityModel<T>> {

	public static final ItemStack SCREEN_DOOR = new ItemStack(ItemRegister.SCREEN_DOOR.get());
	private final ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
	private final ItemStack damageDoorStack = SCREEN_DOOR.copy();

	public ScreenDoorItemLayer(IEntityRenderer<T, EntityModel<T>> entityRendererIn) {
		super(entityRendererIn);
	}

	@Override
	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn,
			T entity, float limbSwing, float limbSwingAmount, float partialTicks,
			float ageInTicks, float netHeadYaw, float headPitch) {
		if(! entity.hasMetal() || entity.isInvisible()) {
			return ;
		}
		this.damageDoorStack.setDamageValue((int) ((1.0D - entity.getOuterDefenceLife() / entity.getOuterLife()) * ScreenDoorItem.PREDICATE_MAX_DAMAGE));
		matrixStackIn.pushPose();
		ScreenDoorZombieModel model = (ScreenDoorZombieModel) this.getParentModel();
		model.getZombieWholeBody().translateAndRotate(matrixStackIn);
		matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(180.0F));
		matrixStackIn.translate(0.0F, 0.75, 0.5F);
		this.itemRenderer.renderStatic(this.damageDoorStack, ItemCameraTransforms.TransformType.NONE,
				packedLightIn, OverlayTexture.NO_OVERLAY, matrixStackIn, bufferIn);
		matrixStackIn.popPose();
	}
}
