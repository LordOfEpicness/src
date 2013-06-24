package MHF.Entity;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import MHF.MonsterHunterFrontier;
import MHF.Block.MainBlock;
import MHF.Item.MainItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityCephadrome extends EntityMonsterMob
{
    // private GenericTargetSorter TargetSorter = null;
    
    private int task_switcher = 0;
    
    public EntityCephadrome(World par1World)
    {
        super(par1World);
        this.setSize(1.0F, 1.0F);
        this.texture = "/mods/monsterhunter/textures/mobs/cephadrome/Cephadrome.png";
        this.moveSpeed = 0.40F;
 	    this.getNavigator().setAvoidsWater(false);
 	    this.experienceValue = 30;
        this.fireResistance = 25;
        this.isImmuneToFire = false;
        this.tasks.addTask(0, new EntityAIWander(this, 0.6F));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, this.moveSpeed, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityErupe.class, 16.0F, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySpider.class, 16.0F, 0, true));
         this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, false));
       // TargetSorter = new GenericTargetSorter(this);
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
    	return 955;
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
    	
           return 9;
    	        
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
    	   { 
    	    	//must not be another around!
    	    	EntityCephadrome target = null;	
    	    	if(this.posY < 50)return false;
    	    	
    	    	target = (EntityCephadrome)this.worldObj.findNearestEntityWithinAABB(EntityCephadrome.class, this.boundingBox.expand(12.0D, 5.0D, 12.0D), this);
    	    	if(target != null)
    	    	{
    	    		return false;
    	    	} 
    	    	return true;   
    	    }

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
    
    private EntityLiving findSomethingToAttack()
    {
    	List var5 = this.worldObj.getEntitiesWithinAABB(EntityLiving.class, this.boundingBox.expand(14.0D, 4.0D, 14.0D));
    	Collections.sort(var5);
    	Iterator var2 = var5.iterator();
    	
    	EntityLiving e;
    	e = this.getAttackTarget();
    	if(e != null && e.isEntityAlive()){
    		return e;
    	}else{
    		this.setAttackTarget(null);
    	}

    	while (var2.hasNext())
    	{
    		Entity var3 = (Entity)var2.next();
    		EntityLiving var4 = (EntityLiving)var3;

    		if (this.isSuitableTarget(var4, false))
    		{
    			return var4;
    		}
    	}
    	return null;
    }    
    private boolean isSuitableTarget(EntityLiving par1EntityLiving, boolean par2)
    {
    	if(this.worldObj.difficultySetting == 0)return false;
    	
        if (par1EntityLiving == null)
        {
            return false;
        }              
        if (par1EntityLiving == this)
        {
            return false;
        }        
        if (!par1EntityLiving.isEntityAlive())
        {
            return false;
        } 
        if ( !this.getEntitySenses().canSee(par1EntityLiving))
        {
        	//System.out.printf("can't see\n");
            return false;
        }
        if (par1EntityLiving instanceof EntityPlayer)
        { 
        	EntityPlayer p = (EntityPlayer)par1EntityLiving;
        	if(p.capabilities.isCreativeMode == true){
        		return false;
        	}
        	return true;
        } 
        if (par1EntityLiving instanceof EntityErupe)
        { 
        	return true;
        } 
        if (par1EntityLiving instanceof EntityKirin)
        { 
        	return true;
        } 
        if (par1EntityLiving instanceof EntityCephalos)
        { 
        	return true;
        } 
        return false;
    }
    
   
    
}
