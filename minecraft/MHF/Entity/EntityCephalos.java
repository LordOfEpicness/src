package MHF.Entity;


import MHF.MonsterHunterFrontier;
import MHF.Block.MainBlock;
import MHF.Item.MainItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


/*
 * DUMMY/STRIPPED/EMPTY entity
 * 
 * Just toggles Cephadrome animations. See updateAITasks() for code.
 * Everything else is missing/wrong.
 */
public class EntityCephalos extends EntityMonsterMob
{
    // private GenericTargetSorter TargetSorter = null;
    
    private int task_switcher = 0;
    
    public EntityCephalos(World par1World)
    {
        super(par1World);
        this.setSize(1.2F, 1.4F);
        this.texture = "/mods/monsterhunter/textures/mobs/cephalos.png";
        this.moveSpeed = 0.40F;
 	    this.getNavigator().setAvoidsWater(false);
 	    this.experienceValue = 30;
        this.fireResistance = 25;
        this.isImmuneToFire = false;
        this.tasks.addTask(1, new EntityAIWander(this, 0.5F));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, this.moveSpeed, true));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityErupe.class, 20.0F, 0, true));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        //TargetSorter = new GenericTargetSorter(this);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(11, Byte.valueOf((byte)0));
        this.dataWatcher.addObject(12, Byte.valueOf((byte)0));
    }
    public boolean isAIEnabled()
    {
        return true;
    }
    @SideOnly(Side.CLIENT)

    
    public int getMaxHealth()
    {
    	return 55;
    			}
     /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate(boolean par1)
    {
               
        
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity par1Entity)
    {
    	
           return 3;
    	
        
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
   	return null;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return null;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume(){
        return 0.75F;
    }

    /**
     * Gets the pitch of living sounds in living entities.
     */
    protected float getSoundPitch(){
        return 1.0F;
    }


    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return MainItem.cephadromeHide.itemID;
    }

    /**
     * Initialize this creature.
     */
    public void initCreature()
    {
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
            return false;
    }
    
    protected void updateAITasks()
    {	
    	if(this.isDead)return;
    	super.updateAITasks();
    	
    	/*
    	 * Sample code to show cephadrome states
    	 * Switches between walking and peaceful, or flying and attacking.
    	 */
    	this.task_switcher++;
    	if(this.task_switcher%100 < 50){
    		this.setAttacking(1); //Mouth mostly closed
    		this.setActivity(1);  //Walking state
    	}else{
    		this.setAttacking(0); //Mouth opening and closing
    		this.setActivity(0);  //Flying
    	}
    }
    
    
    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return true;
    }
    
    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    { 
    	return true;
    }
    
    public final int getAttacking()
    {
        return this.dataWatcher.getWatchableObjectByte(11);
    }

    public final void setAttacking(int par1)
    {
        this.dataWatcher.updateObject(11, Byte.valueOf((byte)par1));
    }
    
    public final int getActivity()
    {
        return this.dataWatcher.getWatchableObjectByte(12);
    }

    public final void setActivity(int par1)
    {
        this.dataWatcher.updateObject(12, Byte.valueOf((byte)par1));
        
       
    }
    private int closest = 99999;
    private int tx = 0, ty = 0, tz = 0;
   
    //Scan for water!!!!
    private boolean scan_it(int x, int y, int z, int dx, int dy, int dz){
    int found = 0;
    int i, j, bid, d;
 
    //Fixed x, scan two sides of 3d rectangle
    	for(i=-dy;i<=dy;i++){
    		for(j=-dz;j<=dz;j++){
				bid = this.worldObj.getBlockId(x+dx, y+i, z+j);
				if(bid == MainBlock.blockDesertSand_1.blockID){
					d = dx*dx + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x+dx; ty = y+i; tz = z+j;
						found++;
					}
				}
				bid = this.worldObj.getBlockId(x-dx, y+i, z+j);
				if(bid == MainBlock.blockDesertSand_1.blockID){
					d = dx*dx + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x-dx; ty = y+i; tz = z+j;
						found++;
					}
				} 			
    		}
    	}
   //Fixed y, scan two sides of 3d rectangle
    	for(i=-dx;i<=dx;i++){
    		for(j=-dz;j<=dz;j++){
				bid = this.worldObj.getBlockId(x+i, y+dy, z+j);
				if(bid == MainBlock.blockDesertSand_1.blockID){
					d = dy*dy + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x+i; ty = y+dy; tz = z+j;
						found++;
					}
				}
				bid = this.worldObj.getBlockId(x+i, y-dy, z+j);
				if(bid == MainBlock.blockDesertSand_1.blockID){
					d = dy*dy + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x+i; ty = y-dy; tz = z+j;
						found++;
					}
				} 			
    		}
    	}    	
    	//Fixed z, scan two sides of 3d rectangle
    	for(i=-dx;i<=dx;i++){
    		for(j=-dy;j<=dy;j++){
				bid = this.worldObj.getBlockId(x+i, y+j, z+dz);
				if(bid == MainBlock.blockDesertSand_1.blockID){
					d = dz*dz + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x+i; ty = y+j; tz = z+dz;
						found++;
					}
				}
				bid = this.worldObj.getBlockId(x+i, y+j, z-dz);
				if(bid == MainBlock.blockDesertSand_1.blockID){
					d = dz*dz + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x+i; ty = y+j; tz = z-dz;
						found++;
					}
				} 			
    		}
    	}    	
    
    	if(found != 0)return true;
    	return false;
    }
    
  
    
   
    
}
