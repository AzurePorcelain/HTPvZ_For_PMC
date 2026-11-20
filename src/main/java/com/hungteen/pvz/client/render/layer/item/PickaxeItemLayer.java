package com.hungteen.pvz.client.render.layer.item;

import com.hungteen.pvz.client.model.entity.zombie.pool.DiggerZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.DiggerZombieEntity;
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
import net.minecraft.item.Items;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PickaxeItemLayer<T extends DiggerZombieEntity> extends LayerRenderer<T, EntityModel<T>> {

	private static final ItemStack PICKAXE = new ItemStack(Items.IRON_PICKAXE);
	private final ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();

	public PickaxeItemLayer(IEntityRenderer<T, EntityModel<T>> entityRendererIn) {
		super(entityRendererIn);
	}

	@Override
	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn,
			T entity, float limbSwing, float limbSwingAmount, float partialTicks,
			float ageInTicks, float netHeadYaw, float headPitch) {
		if(! entity.hasMetal() || entity.isInvisible()) {
			return ;
		}
		matrixStackIn.pushPose();
		DiggerZombieModel model = (DiggerZombieModel) this.getParentModel();
		model.getZombieWholeBody().translateAndRotate(matrixStackIn);
		model.getZombieUpBody().translateAndRotate(matrixStackIn);
		model.getZombieRightHand().translateAndRotate(matrixStackIn);
		matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(-90.0F));
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180.0F));
		matrixStackIn.translate(0.0625F, 0.125F, -0.625F);
		this.itemRenderer.renderStatic(PICKAXE, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND,
				packedLightIn, OverlayTexture.NO_OVERLAY, matrixStackIn, bufferIn);
		matrixStackIn.popPose();
	}
}
