package com.hungteen.pvz.common.entity.zombie.roof;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.misc.drop.JewelEntity;
import com.hungteen.pvz.common.impl.zombie.RoofZombies;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.ZombieUtil;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.world.World;

public class Edgar090517Entity extends Edgar090505Entity {

    public Edgar090517Entity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
        this.maxZombieSurround = 120;
        this.kickRange = 10;
    }

    @Override
    protected void spawnSpecialDrops() {
        final int playerCnt = this.bossInfo.getPlayers().size();
        for (int i = 0; i < 2 + 2 * playerCnt; ++i) {
            JewelEntity jewel = EntityRegister.JEWEL.get().create(level);
            EntityUtil.onEntityRandomPosSpawn(level, jewel, blockPosition().above(5), 4);
        }
    }

    @Override
    public int getBossStage() { // 17拥有5阶段，4次切换无敌
        final float percent = this.bossInfo.getPercent();
        return percent > 4F / 5 ? 1 :
                percent > 3F / 5 ? 2 :
                        percent > 2F / 5 ? 3 :
                                percent > 1F / 5 ? 4 : 5;
    }

    public EntitySize getDimensions(Pose poseIn) {
        return EntitySize.scalable(2F, 9F);
    }

    @Override
    public boolean shootAutoBall() {
        return true;
    }

    @Override
    public int getShootBallCD() {
        return this.getBossStage() < 2 ? 500 : this.getBossStage() < 4 ? 400 : 300;
    }

    @Override
    public int getStealPlantCD() {
        return this.getBossStage() < 3 ? 300 : 200;
    }

    @Override
    public float getElementBallSpeed() {
        return this.getBossStage() < 3 ? 0.06F : this.getBossStage() < 5 ? 0.12F : 0.18F;
    }

    @Override
    public int getSpawnCount() {
        return this.bossInfo.getPlayers().size()*5 + 5;
    }

    @Override
    public float getEatDamage() {
        return ZombieUtil.LITTLE_HIGH;
    }

    @Override
    public float getLife() {
        return 3000;
    }

    @Override
    public float getInnerLife() {
        return 800;
    }

    @Override
    public ZombieType getZombieType() {
        return RoofZombies.EDGAR_090517;
    }

}
