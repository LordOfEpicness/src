package MHF.Entity;

import MHF.MonsterHunterFrontier;
import MHF.Item.MainItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.village.Village;
import net.minecraft.world.World;

public class EntityGiant extends EntityNewMobs {

	private Village villageObj;
	private int attackTimer;

	public EntityGiant(World par1World) {
		super(par1World);
		this.texture = "/mob/Giant.png";
		this.moveSpeed = 0.15F;
		this.isImmuneToFire = true;
		this.experienceValue = 35;
		this.getNavigator().setBreakDoors(false);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, this.moveSpeed, true));
		this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.22F, 32.0F));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));                
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, 19.0F, 2, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityEnderman.class, 19.0F, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, 19.0F, 0, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityErupe.class, 19.0F, 0, true));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        this.tasks.addTask(8, new EntityAIWander(this, 0.3F));
        this.tasks.addTask(9, new EntityAIMoveThroughVillage(this, 0.3F, true));
		
	}

	@Override
	public int getMaxHealth() {
		return 170;
	}

	public Village getVillage() {
			return this.villageObj;
	}
	public boolean isAIEnabled()
    {
        return true;
    }
	public boolean attackEntityAsMob(Entity par1Entity)
    {
        this.attackTimer = 4;
        this.worldObj.setEntityState(this, (byte)4);
        boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), 7 + this.rand.nextInt(15));

        if (flag)
        {
            par1Entity.motionY += 0.9000000059604645D;
            par1Entity.motionX += 0.5123456678956342D;
        }

        this.playSound("mob.irongolem.throw", 2.0F, 2.0F);
        return flag;
    }
	 protected void playStepSound(int par1, int par2, int par3, int par4)
	    {
	        this.playSound("mob.irongolem.walk", 3.0F, 3.0F);
	    }
	 protected int getDropItemId()
	    {
	        return MainItem.itemhotMilk.itemID;
	    }

	public int getAttackTimer() {
				return this.attackTimer;
	}
	 public int getMaxSpawnedInChunk()
	    {
	        return 2;
	    }
	    protected boolean canDespawn()
	    {
	        return false;
	    }

		}


