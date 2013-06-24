package MHF.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMosswine extends EntityCreature{
	/** Above zero if this Mosswine is Angry. */
	 private int angerLevel = 0;
	 private int attackTimer;

	public EntityMosswine(World par1World) {
		super(par1World);
		this.texture = "/mods/monsterhunter/textures/models/mosswine.png";
		this.moveSpeed = 0.25F;
		this.isImmuneToFire = false;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, moveSpeed, true));
		this.targetTasks.addTask(4, new EntityAIHurtByTarget(this, true));
		
	}
	
	public boolean isAIEnabled()
    {
        return true;
    }

	public int getAttackStrength(Entity par1Entity)
    {
     return 3;
    }
	
	public int getMaxHealth() {
		return 10;
	}
	
	public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.attackTimer > 0)
        {
            --this.attackTimer;
        }
        if (this.motionX * this.motionX + this.motionZ * this.motionZ > 2.500000277905201E-7D && this.rand.nextInt(5) == 0)
        {
            int var1 = MathHelper.floor_double(this.posX);
            int var2 = MathHelper.floor_double(this.posY - 0.20000000298023224D - (double)this.yOffset);
            int var3 = MathHelper.floor_double(this.posZ);
            int var4 = this.worldObj.getBlockId(var1, var2, var3);

            if (var4 > 0)
            {
                this.worldObj.spawnParticle("tilecrack_" + var4 + "_" + this.worldObj.getBlockMetadata(var1, var2, var3), this.posX + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width, this.boundingBox.minY + 0.1D, this.posZ + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width, 4.0D * ((double)this.rand.nextFloat() - 0.5D), 0.5D, ((double)this.rand.nextFloat() - 0.5D) * 4.0D);
            }
        }
        
    }
        
	
	public int getTotalArmorValue()
    {
        return 0;
    }
    
	protected String getLivingSound()
    {
        return "mob.pig.say";
    }
 
    protected String getHurtSound()
    {
        return "mob.pig.say";
    }
    
    protected String getDeathSound()
    {
        return "mob.pig.death";
    }
    
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
        this.playSound("mob.pig.step", 0.15F, 1.0F);
    }

	public int getAttackTimer() {
		return this.attackTimer;
	}

}
