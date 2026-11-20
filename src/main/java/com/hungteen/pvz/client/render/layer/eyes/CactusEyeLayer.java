package com.hungteen.pvz.client.render.layer.eyes;

import com.hungteen.pvz.common.entity.plant.spear.CactusEntity;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CactusEyeLayer<T extends LivingEntity, M extends EntityModel<T>> extends PVZEyeLayer<T,M> {

    public CactusEyeLayer(IEntityRenderer<T, M> entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    protected boolean canRender(T entity) {
        return !entity.isInvisible()&& entity instanceof CactusEntity && ((CactusEntity)entity).isCactusPowered();
    }

    @Override
    protected ResourceLocation getResourceLocation(T entity) {
        return StringUtil.prefix("textures/entity/layer/cactus_eyes.png");
    }

}
