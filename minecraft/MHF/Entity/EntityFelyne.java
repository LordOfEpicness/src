package MHF.Entity;

import MHF.Entity.AI.EntityAIBombAttack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityFelyne extends EntityCreature implements IRangedAttackMob{

	public EntityFelyne(World par1World) {
		super(par1World);
		 this.texture = "/mods/monsterhunter/textures/models/felyne.png";
		  this.moveSpeed = 0.26F;
		  
		  this.tasks.addTask(0, new EntityAIWander(this, 0.24F));
		  this.tasks.addTask(1, new EntityAITempt(this, 0.3F, Item.fishRaw.itemID, false));
		  this.tasks.addTask(2, new EntityAIMoveIndoors(this));
	      this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
	      this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
	      this.tasks.addTask(5, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
	      this.tasks.addTask(6, new EntityAIBombAttack(this, 0.25F, 20, 10.0F));
	      this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 16.0F, 0, true, false, IMob.mobSelector));
	}
	
	public int getAttackStrength(Entity par1Entity)
    {
     return 6;
    }

	@Override
	public int getMaxHealth() {
		return 30;
	}
	
	protected boolean isAIEnabled()
    {
        return true;
    }
	
	public String getTexture()
    {
  return "/mods/monsterhunter/textures/models/felyne.png";
    }
 
 public int getTotalArmorValue()
    {
        return 6;
    }
	
	public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }
	
	protected String getLivingSound()
    {
        return "mob.cat.meow";
    }
 
    protected String getHurtSound()
    {
        return "mob.cat.hit";
    }
    
    protected String getDeathSound()
    {
        return "mob.cat.hiss";
    }
    
    protected int getDropItemId()
    {
        return Item.ingotGold.itemID;
    }
    
    protected void dropRareDrop(int par1)
    {
        switch (this.rand.nextInt(2))
        {
            case 0:
                this.dropItem(Item.ingotIron.itemID, 1);
                break;
            case 1:
                this.dropItem(Item.helmetIron.itemID, 1);
                break;
        }
    }
    
    public ItemStack getHeldItem()
    {
    return heldItem;
    }

    private static final ItemStack heldItem = new ItemStack(Item.swordDiamond, 1);
    
    public void attackEntityWithRangedAttack(EntityLiving par1EntityLiving)
    {
        EntitySnowball var2 = new EntitySnowball(this.worldObj);
        double var3 = par1EntityLiving.posX - this.posX;
        double var5 = par1EntityLiving.posY + (double)par1EntityLiving.getEyeHeight() - 1.100000023841858D - var2.posY;
        double var7 = par1EntityLiving.posZ - this.posZ;
        float var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
        var2.setThrowableHeading(var3, var5 + (double)var9, var7, 1.6F, 12.0F);
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var2);
    }

	@Override
	public void attackEntityWithRangedAttack(EntityLiving entityliving, float f) {
		// TODO Auto-generated method stub
		
	}

}
