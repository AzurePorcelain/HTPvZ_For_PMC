package com.hungteen.pvz.mixin;

import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EnderDragonEntity.class,remap = false)
public abstract class EnderDragonMixin extends MobEntity {
    protected EnderDragonMixin(EntityType<? extends MobEntity> p_i48576_1_, World p_i48576_2_) {
        super(p_i48576_1_, p_i48576_2_);
    }

    @Redirect(method = "hurt(Lnet/minecraft/entity/boss/dragon/EnderDragonPartEntity;Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DamageSource;isExplosion()Z"))
    public boolean hurt(DamageSource instance) {
        boolean flag = instance.getEntity() instanceof PVZPlantEntity ||instance.getDirectEntity()  instanceof PVZPlantEntity;
        return instance.isExplosion()|| flag;
    }
    @Inject(method = "reallyHurt", at = @At(value = "HEAD"), cancellable = true)
    protected void reallyHurt(DamageSource damageSource, float amount, CallbackInfoReturnable<Boolean> cir) {
        boolean flag = damageSource.getEntity() instanceof PVZPlantEntity ||damageSource.getDirectEntity()  instanceof PVZPlantEntity;
        amount *= flag? 0.25F : 1.0F;// reduce damage by 25% if damage comes from a plant
        cir.setReturnValue(super.hurt(damageSource, amount));
        cir.cancel();
    }
}
