package com.hungteen.pvz.client.render.layer.item;

import com.hungteen.pvz.client.model.entity.zombie.grass.NormalZombieModel;
import com.hungteen.pvz.client.model.entity.zombie.roof.GargantuarModel;
import com.hungteen.pvz.common.entity.zombie.roof.GargantuarEntity;
import com.hungteen.pvz.common.impl.zombie.GrassZombies;
import com.hungteen.pvz.common.item.ItemRegister;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GargantuarItemLayer<T extends GargantuarEntity> extends LayerRenderer<T, EntityModel<T>> {

	private static final ItemStack POLE = new ItemStack(ItemRegister.POLE.get());
	private static final ItemStack SIGN = new ItemStack(ItemRegister.WARNING_SIGN.get());
	private static final NormalZombieModel DOLL_MODEL = new NormalZombieModel();
	private final ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();

	public GargantuarItemLayer(IEntityRenderer<T, EntityModel<T>> entityRendererIn) {
		super(entityRendererIn);
	}

	@Override
	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn,
			T entity, float limbSwing, float limbSwingAmount, float partialTicks,
			float ageInTicks, float netHeadYaw, float headPitch) {
		if (entity.isInvisible()) {
			return;
		}
		matrixStackIn.pushPose();
		if (this.getParentModel() instanceof GargantuarModel) {
			GargantuarModel model = (GargantuarModel) this.getParentModel();
			model.getZombieWholeBody().translateAndRotate(matrixStackIn);
			model.getZombieUpBody().translateAndRotate(matrixStackIn);
			model.getZombieRightHand().translateAndRotate(matrixStackIn);
			model.getZombieRightFist().translateAndRotate(matrixStackIn);
			final GargantuarEntity.GargantuarType type = entity.getToolType();
			matrixStackIn.translate(0.0F, 0.2F, -0.1F);
			matrixStackIn.translate(0.0625F, 0.125F, -0.625F);
			if (type == GargantuarEntity.GargantuarType.DOLL) {
				matrixStackIn.translate(-0.075F, 1.0F, -0.5F);
				matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(15.0F + 90.0F));
				final ResourceLocation tex = GrassZombies.NORMAL_ZOMBIE.getRenderResource();
				final IVertexBuilder builder = bufferIn.getBuffer(RenderType.entityCutoutNoCull(tex));
				DOLL_MODEL.renderToBuffer(matrixStackIn, builder, packedLightIn, OverlayTexture.NO_OVERLAY, 1F, 1F, 1F, 1F);
			} else {
				final ItemStack tool = type == GargantuarEntity.GargantuarType.SIGN ? SIGN : POLE;
				matrixStackIn.translate(-0.075F, 0.5F, 0.1875F);
				matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(15.0F - 90.0F));
				matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180.0F));
				this.itemRenderer.renderStatic(tool, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND,
						packedLightIn, OverlayTexture.NO_OVERLAY, matrixStackIn, bufferIn);
			}
		}
		matrixStackIn.popPose();
	}
}