package com.hungteen.pvz.common.entity.zombie.roof;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.misc.drop.JewelEntity;
import com.hungteen.pvz.common.entity.zombie.base.EdgarRobotEntity;
import com.hungteen.pvz.common.impl.zombie.RoofZombies;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.MathUtil;
import com.hungteen.pvz.utils.ZombieUtil;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Edgar090505Entity extends EdgarRobotEntity {
    private static final DataParameter<BlockPos> ORIGIN_POS = EntityDataManager.defineId(Edgar090505Entity.class, DataSerializers.BLOCK_POS);

    public Edgar090505Entity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
        this.refreshCountCD = 10;
        this.maxZombieSurround = 60;
        this.maxPlantSurround = 100;
        this.kickRange = 6;
        this.setIsWholeBody();
        setResistanceField(600);//30s强制无敌时间
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ORIGIN_POS, BlockPos.ZERO);
    }

    @Override
    public void kill() {
        super.kill();
    }

    public void FieldTick()
    {
        if (LastBossStage < getBossStage())
        {
            LastBossStage = getBossStage();
            setResistanceField(100);//切换阶段无敌5s
            setDefensiveField(this.getInnerLife());
        }

        // 先计算目标状态（按优先级顺序），确保状态切换的连续性
        FieldStates targetState;
        boolean shouldShowBossInnerInfo = false;
        
        if (ResistanceFieldTime > 0)
        {
            targetState = FieldStates.Resistance;
            ResistanceFieldTime--;
            shouldShowBossInnerInfo = false;
        }
        else if (BallResistanceFieldTime > 0)
        {
            targetState = FieldStates.BallResistance;
            BallResistanceFieldTime--;
            shouldShowBossInnerInfo = false;
        }
        else if (RuneFieldTime > 0)
        {
            // 确保连续性：当 RuneFieldTime > 0 时，目标状态始终为 Rune
            // 这样可以避免切换形态时状态短暂变化导致的闪烁
            targetState = FieldStates.Rune;
            RuneFieldTime--;
            shouldShowBossInnerInfo = this.getInnerDefenceLife() > 0;
        }
        else if (this.getInnerDefenceLife() > 0)
        {
            targetState = FieldStates.Defensive;
            shouldShowBossInnerInfo = true;
        }
        else
        {
            targetState = FieldStates.None;
            shouldShowBossInnerInfo = false;
        }

        FieldStates currentState = this.getFieldState();
        if (currentState != targetState)
        {
            setHasFieldChanged(true);
            setFieldState(targetState);
        }
        
        // 更新Boss血条显示
        bossInnerInfo.setVisible(shouldShowBossInnerInfo);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void zombieTick() {
        super.zombieTick();

        final float percent1 = this.getHealth() / this.getMaxHealth();//博士机甲改为真实血量显示
        this.bossInfo.setPercent(percent1);

        final double percent2 = this.getInnerDefenceLife() / this.getInnerLife();//防御力场
        this.bossInnerInfo.setPercent((float) percent2);


        if (!level.isClientSide) {
            this.FieldTick();
            if (this.getOriginPos() == BlockPos.ZERO) {
                this.setOriginPos(this.blockPosition());
            } else {
                if (MathUtil.getPosDisToVec(getOriginPos(), position()) >= 10) {
                    final int range = 4;
                    for (int i = -range; i <= range; ++i) {
                        for (int j = -range; j <= range; ++j) {
                            final BlockPos tmp = getOriginPos().offset(i, -1, j);
                            if (level.getBlockState(tmp).isAir()) {
                                level.setBlockAndUpdate(tmp, Blocks.GRASS_BLOCK.defaultBlockState());
                            }
                            for (int k = 0; k <= 10; ++k) {
                                level.setBlockAndUpdate(getOriginPos().offset(i, k, j), Blocks.AIR.defaultBlockState());
                            }
                        }
                    }
                    this.setPos(getOriginPos().getX(), getOriginPos().getY() + 1, getOriginPos().getZ());
                }
            }
        }
    }

    @Override
    public int getBossStage() { // 05拥有3阶段，2次切换无敌
        final float percent = this.bossInfo.getPercent();
        return percent > 2F / 3 ? 1 :
                percent > 1F / 3 ? 2 : 3;
    }

    @Override
    protected void spawnSpecialDrops() {
        for (int i = 0; i < 3; ++i) {
            JewelEntity jewel = EntityRegister.JEWEL.get().create(level);
            EntityUtil.onEntityRandomPosSpawn(level, jewel, blockPosition().above(5), 4);
        }
    }

    public EntitySize getDimensions(Pose poseIn) {
        return EntitySize.scalable(2F, 7.5F);
    }

    @Override
    public int getSpawnCount() {
        return this.bossInfo.getPlayers().size()*3 + 3;
    }

    @Override
    public float getWalkSpeed() {
        return 0;
    }

    @Override
    public float getEatDamage() {
        return ZombieUtil.NORMAL_DAMAGE;
    }

    @Override
    public float getLife() {
        return 1200;
    }

    @Override
    public float getInnerLife() {
        return 300;
    }

    @Override
    public void readAdditionalSaveData(CompoundNBT compound) {
        super.readAdditionalSaveData(compound);
        if (compound.contains("origin_pos")) {
            CompoundNBT nbt = compound.getCompound("origin_pos");
            this.setOriginPos(new BlockPos(nbt.getInt("origin_pos_x"), nbt.getInt("origin_pos_y"), nbt.getInt("origin_pos_z")));
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundNBT compound) {
        super.addAdditionalSaveData(compound);
        CompoundNBT nbt = new CompoundNBT();
        nbt.putInt("origin_pos_x", this.getOriginPos().getX());
        nbt.putInt("origin_pos_y", this.getOriginPos().getY());
        nbt.putInt("origin_pos_z", this.getOriginPos().getZ());
        compound.put("origin_pos", nbt);
    }

    public BlockPos getOriginPos() {
        return this.entityData.get(ORIGIN_POS);
    }

    public void setOriginPos(BlockPos pos) {
        this.entityData.set(ORIGIN_POS, pos);
    }

    @Override
    public ZombieType getZombieType() {
        return RoofZombies.EDGAR_090505;
    }

}
