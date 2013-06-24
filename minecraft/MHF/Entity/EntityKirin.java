package MHF.Entity;

import java.util.ArrayList;
import java.util.List;

import MHF.MonsterHunterFrontier;
import MHF.Item.MainItem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityKirin extends EntityMonsterMob
{
    private int field_70846_g;
    public int standCounter;
	public List  weatherEffects =  new ArrayList();
     
    public EntityKirin(World par1World)
    {
        super(par1World);
        this.texture = "/mods/monsterhunter/textures/mobs/Kirin.png";
        this.isImmuneToFire = true;
        this.experienceValue = 2500;
        this.stepHeight = 1.0F;
        this.getNavigator().setAvoidsWater(true);
        }
        
    public int getMaxHealth()
    {
    	int var2 = 1150;
        if (this.worldObj.difficultySetting == 1)
        {
        	var2 = 1150;
            if (this.worldObj.difficultySetting == 2)
            {
                var2 = 1850;
            }
            else if (this.worldObj.difficultySetting == 3)
            {
                var2 = 2620;
            }
        }
        return var2;
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "MHF.Kirin.kirin1.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "MHF.Kirin.kirin1.say";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "MHF.Kirin.kirin1.say";
    }

    @SideOnly(Side.CLIENT)
    public int getBrightnessForRender(float par1)
    {
        return 15728880;
    }

    /**
     * Gets how bright this entity is.
     */
    public float getBrightness(float par1)
    {
        return 1.0F;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */

    /**
     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
     */
    protected void attackEntity(Entity par1Entity, float par2)
    {
        if (this.attackTime <= 0 && par2 < 2.0F && par1Entity.boundingBox.maxY > this.boundingBox.minY && par1Entity.boundingBox.minY < this.boundingBox.maxY)
        {
            this.attackTime = 3;
            this.attackEntityAsMob(par1Entity);
        }
        else if (par2 < 30.0F)
        {
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.boundingBox.minY + (double)(par1Entity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
        double d2 = par1Entity.posZ - this.posZ;
        if (this.attackTime == 0)
        {
        ++this.field_70846_g;
        if (this.field_70846_g == 1)
        {
         this.attackTime = 20;
                    this.func_70844_e(true);
                }
                else if (this.field_70846_g <= 4)
                {
                    this.attackTime = 15;
                }
                else
                {
                    this.attackTime = 15;
                    this.field_70846_g = 0;
                    
                }

                if (this.field_70846_g > 1)
                {
                    float f1 = MathHelper.sqrt_float(par2) * 0.5F;
                    this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)this.posX, (int)this.posY, (int)this.posZ, 0);

                    for (int i = 0; i < 1; ++i)
                    {
                        FUCEntityLightning entitysmallfireball = new FUCEntityLightning(this.worldObj, this);
                        entitysmallfireball.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
                        this.worldObj.spawnEntityInWorld(entitysmallfireball);
                    }
                }
            }
        }
    }


    /**
    
    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return MainItem.itemkirinBuff.itemID;
    }

    /**
     * Returns true if the entity is on fire. Used by render to add the fire effect on rendering.
     */
   

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean par,int par1)
    {
        switch (this.rand.nextInt(2))
        {
            case 0:
                this.dropItem(MainItem.itemfleshKirin.itemID, 2);
                break;
            case 1:
                this.dropItem(MainItem.itemsparkKirin.itemID, 1);
                break;
        }
    }
    

    public boolean func_70845_n()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    public void func_70844_e(boolean par1)
    {
        byte b0 = this.dataWatcher.getWatchableObjectByte(16);

        if (par1)
        {
            b0 = (byte)(b0 | 1);
        }
        else
        {
            b0 &= -2;
        }

        this.dataWatcher.updateObject(16, Byte.valueOf(b0));
    }

  

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity par1Entity)
    {
    	int var2 = 7;
 	   if (this.worldObj.difficultySetting == 1)
        {
        	var2 = 7;
            if (this.worldObj.difficultySetting == 2)
            {
                var2 = 9;
            }
            else if (this.worldObj.difficultySetting == 3)
            {
                var2 = 12;
            }
        }
        return var2;
    }
    public boolean isAttacking()
    {
    	return hasAttacked;
    }
    protected boolean canDespawn()
    {
        return true;
    }
   

}
		  