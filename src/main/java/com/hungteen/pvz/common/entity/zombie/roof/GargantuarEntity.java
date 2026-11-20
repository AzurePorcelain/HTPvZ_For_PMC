package com.hungteen.pvz.common.entity.zombie.roof;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.ai.goal.attack.PVZZombieAttackGoal;
import com.hungteen.pvz.common.entity.plant.spear.SpikeRockEntity;
import com.hungteen.pvz.common.entity.plant.spear.SpikeWeedEntity;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.common.entity.zombie.body.ZombieDropBodyEntity;
import com.hungteen.pvz.common.impl.zombie.RoofZombies;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.hungteen.pvz.common.misc.PVZEntityDamageSource;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.ZombieUtil;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

import java.util.EnumSet;

public class GargantuarEntity extends PVZZombieEntity {

	private static final DataParameter<Integer> TOOL_TYPE = EntityDataManager.defineId(GargantuarEntity.class, DataSerializers.INT);
	public static final int DEATH_ANIM_CD = 100;
	public boolean isSad = false;
	
	public GargantuarEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
		this.setIsWholeBody();
	}

	@Override
	public ILivingEntityData finalizeSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason,
			ILivingEntityData spawnDataIn, CompoundNBT dataTag) {
		if(! level.isClientSide) {
			this.setToolType(GargantuarType.values()[this.getRandom().nextInt(GargantuarType.values().length)]);
			ImpEntity imp = EntityRegister.IMP.get().create(level);
			imp.moveTo(this.getX(), this.getY(), this.getZ(), this.yRot, 0.0F);
			this.level.addFreshEntity(imp);
			imp.startRiding(this);
		}
		return super.finalizeSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(TOOL_TYPE, GargantuarType.DOLL.ordinal());
	}
	
	@Override
	protected void registerAttackGoals() {
		this.goalSelector.addGoal(3, new GargantuarMoveToTargetGoal(this, true));
		this.goalSelector.addGoal(2, new CrushAttackGoal(this));
		this.goalSelector.addGoal(1, new ThrowImpGoal(this));
	}

	@Override
	public float getWalkSpeed() {
		return ZombieUtil.WALK_SUPER_SLOW;
	}
	
	public void throwImp(LivingEntity target) {
		EntityUtil.playSound(this, SoundRegister.IMP_HAPPY.get());
		if(this.getControllingPassenger() instanceof ImpEntity) {
			ImpEntity imp = (ImpEntity) this.getControllingPassenger();
			imp.stopRiding();
			imp.throwByGargantuar(this, target);
		}
	}
	
	@Override
	public void die(DamageSource source) {
		if(! this.level.isClientSide) {
			if(this.getControllingPassenger() instanceof ImpEntity) {
				this.getControllingPassenger().remove();
			}
		}
		super.die(source);
	}

	@Override
	public void remove() {
		if(! this.level.isClientSide) {
			if(this.getControllingPassenger() instanceof ImpEntity) {
				this.getControllingPassenger().remove();
			}
		}
		super.remove();
	}

	@Override
	protected void setBodyStates(ZombieDropBodyEntity body) {
		super.setBodyStates(body);
		body.setMaxLiveTick(DEATH_ANIM_CD);
		body.setHandDefence(this.isSad);
	}
	
	@Override
	public boolean canPAZTarget(Entity target) {
//		if(target instanceof SpikeRockEntity) {
//			return true;
//		}
		if(target instanceof SpikeWeedEntity) {
			return true;
		}
		return super.canPAZTarget(target);
	}
	
	@Override
	public boolean doHurtTarget(Entity entityIn) {
		if(! level.isClientSide) {
			EntityUtil.playSound(this, SoundRegister.GROUND_SHAKE.get());
		}
		if(! EntityUtil.isEntityValid(entityIn)) {
			return false;
		}
		return super.doHurtTarget(entityIn);
	}
	
	@Override
	protected PVZEntityDamageSource getZombieAttackDamageSource() {
		return PVZEntityDamageSource.causeCrushDamage(this);
	}
	
	@Override
	protected float getModifyAttackDamage(Entity entity, float f) {
		if(entity instanceof LivingEntity) {
			return EntityUtil.getMaxHealthDamage(((LivingEntity) entity), 2);
		}
		return f;
	}
	
	@Override
	public EntitySize getDimensions(Pose poseIn) {
		if(this.isMiniZombie()) {
			return EntitySize.scalable(0.6F, 1.8F);
		}
		return EntitySize.scalable(1.5F, 2.7F);
	}

	@Override
	public void positionRider(Entity passenger) {
		if(this.hasPassenger(passenger)) {
			Vector3d offset = new Vector3d(0.0D, 0.0D, -0.7D).yRot(- this.yBodyRot * ((float) Math.PI / 180F));
			passenger.setPos(this.getX() + offset.x, this.getY() + this.getPassengersRidingOffset() + passenger.getMyRidingOffset(), this.getZ() + offset.z);
		}
	}
	
	public boolean canThrowImp() {
		return this.canNormalUpdate() && this.getHealth() / this.getMaxHealth() < 0.5F;
	}
	
	@Override
	public boolean canBreakPlantBlock() {
		return false;
	}

	@Override
	public float getKBValue() {
		return 1;
	}

	public int getCrushCD() {
		return 40;
	}
	
	public int getThrowCD() {
		return 30;
	}
	
	@Override
	public float getLife() {
		return 300;
	}

	@Override
	public int getArmorToughness() {
		return 5;
	}

	@Override
	protected int getDeathTime() {
		return 40;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundRegister.GARGANTUAR_DEATH.get();
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundRegister.GARGANTUAR_GROAN.get();
	}
	
	@Override
	public int getAmbientSoundInterval() {
		return 200;
	}

	@Override
    public ZombieType getZombieType() {
	    return RoofZombies.GARGANTUAR;
    }

	@Override
	public void readAdditionalSaveData(CompoundNBT compound) {
		super.readAdditionalSaveData(compound);
		if(compound.contains("weapon_type")) {
			this.setToolType(GargantuarType.values()[compound.getInt("weapon_type")]);
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundNBT compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("weapon_type", this.getToolType().ordinal());
	}

	public void setToolType(GargantuarType type) {
		this.entityData.set(TOOL_TYPE, type.ordinal());
	}
	
	public GargantuarType getToolType() {
		return GargantuarType.values()[this.entityData.get(TOOL_TYPE)];
	}
	
	public enum GargantuarType {
		POLE,
		SIGN,
		DOLL
	}

	private final class GargantuarMoveToTargetGoal extends PVZZombieAttackGoal {
		
		public GargantuarMoveToTargetGoal(GargantuarEntity creature, boolean useLongMemory) {
			super(creature, useLongMemory);
		}
		
		@Override
		public boolean canUse() {
			return this.zombie.getAttackTime() == 0 && super.canUse();
		}
		
		@Override
		public boolean canContinueToUse() {
			return this.zombie.getAttackTime() == 0 && super.canContinueToUse();
		}
		
		@Override
		protected void checkAndPerformAttack(LivingEntity target) {
			double dis = EntityUtil.getNearestDistance(this.attacker, target);
			double range = this.getAttackReachSqr(target);
			if (range >= dis && this.attackTick <= 0) {
				this.attackTick = this.zombie.getAttackCD();
				this.attacker.swing(Hand.MAIN_HAND);
				this.zombie.setAttackTime(GargantuarEntity.this.getCrushCD());
			}
		}
		
	}
	
	private final class CrushAttackGoal extends Goal {

		protected final GargantuarEntity attacker;
		
		public CrushAttackGoal(GargantuarEntity creature) {
			this.attacker = creature;
			this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
		}
		
		@Override
		public boolean canUse() {
			return this.attacker.getAttackTime() > 0;
		}
		
		@Override
		public boolean canContinueToUse() {
			return this.attacker.getAttackTime() > 0;
		}
		
		@Override
		public void tick() {
			if(this.attacker.canNormalUpdate() && this.attacker.getAttackTime() > 0) {
				this.attacker.setAttackTime(this.attacker.getAttackTime() - 1);
				if(this.attacker.getAttackTime() == this.attacker.getCrushCD() * 1 / 3) {
					this.attacker.doHurtTarget(this.attacker.getTarget());
				}
			}
		}
		
	}
	
	private final class ThrowImpGoal extends Goal {

		protected final GargantuarEntity attacker;
		
		public ThrowImpGoal(GargantuarEntity creature) {
			this.attacker = creature;
			this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
		}
		
		@Override
		public boolean canUse() {
			return this.attacker.getControllingPassenger() instanceof ImpEntity && this.attacker.canThrowImp();
		}
		
		@Override
		public void start() {
			this.attacker.setAttackTime(- this.attacker.getThrowCD());
		}
		
		@Override
		public boolean canContinueToUse() {
			return this.attacker.getAttackTime() < 0;
		}
		
		@Override
		public void stop() {
			this.attacker.setAttackTime(0);
		}
		
		@Override
		public void tick() {
			if(this.attacker.canNormalUpdate() && this.attacker.getAttackTime() < 0) {
				this.attacker.setAttackTime(this.attacker.getAttackTime() + 1);
				if(this.attacker.getControllingPassenger() instanceof ImpEntity && - this.attacker.getAttackTime() == this.attacker.getThrowCD() * 1 / 4) {
					this.attacker.throwImp(this.attacker.getTarget());
				}
			}
		}
		
	}
	
	
}
