package MHF.Entity;

import MHF.MonsterHunterFrontier;
import MHF.Item.MainItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityPopo extends EntityAnimal
{
	private EntityAIEatGrass aiEatGrass = new EntityAIEatGrass(this);
    private int attackTimer;
	public EntityPopo(World par1World)
    {
        super(par1World);
        this.texture = "/mods/monsterhunter/textures/mobs/Popo.png";
        this.setSize(4.0F, 4.0F);
        this.moveSpeed = 0.15F;
		this.isImmuneToFire = false;
		this.experienceValue = 25;
        this.getNavigator().setAvoidsWater(true);
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, true));
        this.tasks.addTask(1, this.aiEatGrass);
        this.tasks.addTask(2, new EntityAIPanic(this, 0.38F));
        this.tasks.addTask(3, new EntityAIMate(this, 0.2F));
        this.tasks.addTask(4, new EntityAITempt(this, 0.25F, Item.wheat.itemID, false));
        this.tasks.addTask(5, new EntityAIFollowParent(this, 0.25F));
        this.tasks.addTask(6, new EntityAIWander(this, 0.4F));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.tasks.addTask(9, new EntityAIAvoidEntity(this, EntityCephalos.class, 5.0F, 0.3F, 0.35F));
        
    }

    
    public boolean isAIEnabled()
    {
        return true;
    }

    public int getMaxHealth()
    {
        return 30;
    }

    
    protected String getLivingSound()
    {
        return "mob.cow.say";
    }

   
    protected String getHurtSound()
    {
        return "mob.cow.hurt";
    }

   
    protected String getDeathSound()
    {
        return "mob.cow.hurt";
    }

    
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
        this.playSound("mob.cow.step", 0.15F, 1.0F);
    }

    
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    
    protected int getDropItemId()
    {
        return MainItem.rawMeat.itemID;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropRareDrop(int par1)
    {
        switch (this.rand.nextInt(2))
        {
            case 0:
                this.dropItem(MainItem.itembruteBone.itemID, 2);
                break;
            case 1:
                this.dropItem(MainItem.popoLeather.itemID, 2);
                break;
        }
    }
    

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
   

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityPopo spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityPopo(this.worldObj);
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
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

