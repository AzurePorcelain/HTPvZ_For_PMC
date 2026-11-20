package com.hungteen.pvz.client.render.entity.zombie.body;

import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.api.types.IZombieType;
import com.hungteen.pvz.client.model.entity.misc.PoleModel;
import com.hungteen.pvz.client.render.layer.item.PoleZombieLayer;
import com.hungteen.pvz.client.render.layer.item.ScreenDoorItemLayer;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.body.ZombieDropBodyEntity;
import com.hungteen.pvz.common.impl.zombie.GrassZombies;
import com.hungteen.pvz.common.item.ItemRegister;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class ZombieBodyRender extends EntityRenderer<ZombieDropBodyEntity> {

	private final PoleModel poleModel = new PoleModel();
	private final ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();

	public ZombieBodyRender(EntityRendererManager p_i46179_1_) {
		super(p_i46179_1_);
	}

	@Override
	public void render(ZombieDropBodyEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		final IZombieType zombie = entityIn.getZombieType();
		final BodyType part = entityIn.getBodyType();
		matrixStackIn.pushPose();
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.yRotO, entityIn.yRot) + 180.0F));
		if(part != BodyType.BODY) {
		    if(entityIn.isOnGround()) {
			    matrixStackIn.mulPose(Vector3f.XN.rotationDegrees(part == BodyType.HEAD ? entityIn.HEAD_ROT : 90));
		    } else {
			    matrixStackIn.mulPose(Vector3f.XN.rotationDegrees(- entityIn.tickCount * 15));
		    }
		}
		matrixStackIn.scale(-1, -1, 1);
	    final float sz = entityIn.isMini() ? zombie.getRenderScale() * PVZZombieRender.MINI_SCALE : zombie.getRenderScale();
	    matrixStackIn.scale(sz, sz, sz);
		matrixStackIn.translate(0.0, (part != BodyType.BODY ? -1.501 : -1.7), 0.0);
		if(part == BodyType.DEFENCE && zombie == GrassZombies.SCREENDOOR_ZOMBIE) {
			this.itemRenderer.renderStatic(ScreenDoorItemLayer.SCREEN_DOOR, ItemCameraTransforms.TransformType.NONE,
					packedLightIn, OverlayTexture.NO_OVERLAY, matrixStackIn, bufferIn);
		} else if(part == BodyType.DEFENCE && zombie == GrassZombies.POLE_ZOMBIE) {
			final IVertexBuilder builder = bufferIn.getBuffer(RenderType.entityCutout(PoleZombieLayer.POLE_TEX));
			this.poleModel.render(matrixStackIn, builder, packedLightIn, OverlayTexture.NO_OVERLAY);
		} else if(part == BodyType.DEFENCE && (zombie == GrassZombies.BUCKETHEAD_ZOMBIE || zombie == GrassZombies.CONEHEAD_ZOMBIE)) {
			final ItemStack armorStack = new ItemStack(zombie == GrassZombies.BUCKETHEAD_ZOMBIE ? ItemRegister.BUCKET_HEAD.get() : ItemRegister.CONE_HEAD.get());
			armorStack.setDamageValue((entityIn.getHelmetStage() - 1) * armorStack.getMaxDamage() / 3 + 1);
			final ArmorItem armorItem = (ArmorItem) armorStack.getItem();
			final BipedModel<LivingEntity> armorModel = armorItem.getArmorModel((LivingEntity) null, armorStack, EquipmentSlotType.HEAD, null);
            if (armorModel != null) {
				armorModel.setAllVisible(false);
				armorModel.head.visible = true;
				armorModel.hat.visible = true;

				matrixStackIn.translate(0.0, 1.5, 0.0);
				final IVertexBuilder builder = ItemRenderer.getArmorFoilBuffer(bufferIn,
						RenderType.armorCutoutNoCull(new ResourceLocation(armorItem.getArmorTexture(armorStack, entityIn, EquipmentSlotType.HEAD, null))), false, armorStack.hasFoil());
				armorModel.renderToBuffer(matrixStackIn, builder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
			}
		} else if(part != BodyType.BODY) {
			zombie.getZombieModel1().ifPresent(m -> {
			    final IVertexBuilder ivertexbuilder = bufferIn.getBuffer(m.getZombieModel().renderType(zombie.getRenderResource()));
			    m.tickPartAnim(entityIn, 0, 0, entityIn.tickCount + partialTicks, 0, 0);
			    m.renderBody(entityIn, matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY);
			});
		} else {
			zombie.getZombieModel2().ifPresent(m -> {
		        final IVertexBuilder ivertexbuilder = bufferIn.getBuffer(m.getZombieModel().renderType(zombie.getRenderResource()));
		        m.tickPartAnim(entityIn, 0, 0, entityIn.tickCount + partialTicks, 0, 0);
		        m.renderBody(entityIn, matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY);
		    });
		}
		matrixStackIn.popPose();
	}

	@Override
	public ResourceLocation getTextureLocation(ZombieDropBodyEntity p_110775_1_) {
		return null;//no use
	}

}
