package MHF.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIVillagerMate;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityWarriorFinale extends EntityNewMobs {

	public EntityWarriorFinale(World par1World) {
		super(par1World);
		this.texture = "/mods/monsterhunter/textures/mobs/WarriorFinale.png";
		this.moveSpeed = 0.25F;
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, this.moveSpeed, true));
		this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.22F, 32.0F));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));                
        this.tasks.addTask(5, new EntityAIMoveIndoors(this));
        this.tasks.addTask(6, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(7, new EntityAIOpenDoor(this, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityMob.class, 16.0F, 0, false, true, IMob.mobSelector));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityCephalos.class, 16.0F, 0, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityKirin.class, 16.0F, 0, true));
        this.tasks.addTask(8, new EntityAIWander(this, 0.3F));
        this.tasks.addTask(9, new EntityAIMoveThroughVillage(this, 0.3F, true));
        {
        }        
        }
        
       
	 public int getAttackStrength(Entity var1)
	    {
	        return 9;
	    }


		public int getMaxHealth() {
				return 22;
				
	
	}
		 public boolean isAIEnabled()
		    {
		        return true;
		    }
		 
		 protected int getDropItemId()
		    {
		        return Item.ingotGold.itemID;
		    }
		 
		 	 
		 protected String getLivingSound()
		    {
		        return "mob.villager.zpig";
		    }

		    /**
		     * Returns the sound this mob makes when it is hurt.
		     */
		    protected String getHurtSound()
		    {
		        return "mob.villager.zpighurt";
		    }

		    /**
		     * Returns the sound this mob makes on death.
		     */
		    protected String getDeathSound()
		    {
		        return "mob.villager.zpigdeath";
		    }
		 
		    public int getMaxSpawnedInChunk()
		    {
		        return 1;
		    }
		   
		    protected boolean canDespawn()
		    {
		        return false;
		    }
		    }



		
		 
		

		 
		 
	




