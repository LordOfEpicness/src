package MHF.Entity;

import java.util.EnumSet;

import MHF.MonsterHunterFrontier;
import MHF.Item.MainItem;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIFollowGolem;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;


public class EntityErupe extends EntityNewMobs {
	private EntityAIEatGrass aiEatGrass = new EntityAIEatGrass(this);

	public EntityErupe(World par1World) {
		super(par1World);
		this.texture = "/mods/monsterhunter/textures/mobs/Erupe.png";
		this.moveSpeed = 0.1F;
		this.experienceValue = 15;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAIPanic(this, 0.21F));
	    this.tasks.addTask(2, new EntityAITempt(this, 0.35F, Item.wheat.itemID, false));
	    this.tasks.addTask(3, new EntityAIWander(this, 0.4F));
	    this.tasks.addTask(4, this.aiEatGrass);
	    this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	    this.tasks.addTask(6, new EntityAILookIdle(this));
	    this.tasks.addTask(7, new EntityAIAvoidEntity(this, EntityCephalos.class, 5.0F, 0.4F, 0.4F));
	    this.stepHeight = 1.0F;
	  
	     
	}
	@Override
	public int getMaxHealth() {
				return 25;
	}




	 public boolean isAIEnabled()
	    {
	        return true;
	    }
	 
	 protected int getDropItemId()
	    {
	        return MainItem.itemRockB.itemID;
	    }
	 protected void dropFewItems(boolean par,int par1)
	    {
	        switch (this.rand.nextInt(2))
	        {
	            case 0:
	                this.dropItem(MainItem.rawMeat.itemID, 1);
	                break;
	            case 1:
	                this.dropItem(MainItem.itembleededHorn.itemID, 2);
	                break;
	        }
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
	        return 2;
	    }
	   
	
}
