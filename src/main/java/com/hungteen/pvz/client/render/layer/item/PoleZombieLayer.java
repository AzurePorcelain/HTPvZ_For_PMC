package com.hungteen.pvz.client.render.layer.item;

import com.hungteen.pvz.client.model.entity.misc.PoleModel;
import com.hungteen.pvz.client.model.entity.zombie.grass.PoleZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.PoleZombieEntity;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PoleZombieLayer<T extends PoleZombieEntity> extends LayerRenderer<T, EntityModel<T>> {

	public static final ResourceLocation POLE_TEX = StringUtil.prefix("textures/entity/zombie/grass/pole_zombie.png");
	private final PoleModel poleModel = new PoleModel();

	public PoleZombieLayer(IEntityRenderer<T, EntityModel<T>> entityRendererIn) {
		super(entityRendererIn);
	}

	@Override
	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn,
			T entity, float limbSwing, float limbSwingAmount, float partialTicks,
			float ageInTicks, float netHeadYaw, float headPitch) {
		if (! entity.isInvisible() && entity.hasPole()) {
			if (this.getParentModel() instanceof PoleZombieModel) {
				final PoleZombieModel model = (PoleZombieModel) this.getParentModel();
				matrixStackIn.pushPose();
				model.getZombieWholeBody().translateAndRotate(matrixStackIn);
				model.getZombieUpBody().translateAndRotate(matrixStackIn);
				model.getZombieRightHand().translateAndRotate(matrixStackIn);
				matrixStackIn.translate(-0.5F / 16.0F, 8.5F / 16.0F, 0.0F);
				matrixStackIn.mulPose(Vector3f.XP.rotation(-0.0611F));
				matrixStackIn.mulPose(Vector3f.XP.rotation(-1.5708F));
				final IVertexBuilder builder = bufferIn.getBuffer(RenderType.entityCutout(POLE_TEX));
				this.poleModel.render(matrixStackIn, builder, packedLightIn, OverlayTexture.NO_OVERLAY);
				matrixStackIn.popPose();
			}
		}
	}
}
