package MHF.Entity;

import java.util.ArrayList;

import MHF.Item.MainItem;

import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityFish extends AbstractEntityFish{

	public float field_70861_d = 0.0F;
    public float field_70862_e = 0.0F;
    public float field_70859_f = 0.0F;
    public float field_70860_g = 0.0F;
    public float field_70867_h = 0.0F;
    public float field_70868_i = 0.0F;

    /** angle of the tentacles in radians */
    public float tentacleAngle = 0.0F;

    /** the last calculated angle of the tentacles in radians */
    public float lastTentacleAngle = 0.0F;
    private float randomMotionSpeed = 0.0F;
    private float field_70864_bA = 0.0F;
    private float field_70871_bB = 0.0F;
    private float randomMotionVecX = 0.0F;
    private float randomMotionVecY = 0.0F;
    private float randomMotionVecZ = 0.0F;

	public EntityFish(World par1World) {
		super(par1World);
		this.texture = "/mods/monsterhunter/textures/models/fish.png";
		this.moveSpeed = 0.20F;
		this.field_70864_bA = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
	}

	@Override
	public int getMaxHealth() {
		return 1;
	}
	
	public String getTexture()
    {
       return "/mods/monsterhunter/textures/models/fish.png";
    }
	
	protected String getLivingSound()
    {
        return null;
    }
 
    protected String getHurtSound()
    {
        return null;
    }
    
    protected String getDeathSound()
    {
        return null;
    }
        
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        this.field_70862_e = this.field_70861_d;
        this.field_70860_g = this.field_70859_f;
        this.field_70868_i = this.field_70867_h;
        this.lastTentacleAngle = this.tentacleAngle;
        this.field_70867_h += this.field_70864_bA;

        if (this.field_70867_h > ((float)Math.PI * 2F))
        {
            this.field_70867_h -= ((float)Math.PI * 2F);

            if (this.rand.nextInt(10) == 0)
            {
                this.field_70864_bA = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
            }
        }

        if (this.isInWater())
        {
            float var1;

            if (this.field_70867_h < (float)Math.PI)
            {
                var1 = this.field_70867_h / (float)Math.PI;
                this.tentacleAngle = MathHelper.sin(var1 * var1 * (float)Math.PI) * (float)Math.PI * 0.25F;

                if ((double)var1 > 0.75D)
                {
                    this.randomMotionSpeed = 1.0F;
                    this.field_70871_bB = 1.0F;
                }
                else
                {
                    this.field_70871_bB *= 0.8F;
                }
            }
            else
            {
                this.tentacleAngle = 0.0F;
                this.randomMotionSpeed *= 0.9F;
                this.field_70871_bB *= 0.99F;
            }

            if (!this.worldObj.isRemote)
            {
                this.motionX = (double)(this.randomMotionVecX * this.randomMotionSpeed);
                this.motionY = (double)(this.randomMotionVecY * this.randomMotionSpeed);
                this.motionZ = (double)(this.randomMotionVecZ * this.randomMotionSpeed);
            }

            var1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.renderYawOffset += (-((float)Math.atan2(this.motionX, this.motionZ)) * 180.0F / (float)Math.PI - this.renderYawOffset) * 0.1F;
            this.rotationYaw = this.renderYawOffset;
            this.field_70859_f += (float)Math.PI * this.field_70871_bB * 1.5F;
            this.field_70861_d += (-((float)Math.atan2((double)var1, this.motionY)) * 180.0F / (float)Math.PI - this.field_70861_d) * 0.1F;
        }
        else
        {
            this.tentacleAngle = MathHelper.abs(MathHelper.sin(this.field_70867_h)) * (float)Math.PI * 0.25F;

            if (!this.worldObj.isRemote)
            {
                this.motionX = 0.0D;
                this.motionY -= 0.08D;
                this.motionY *= 0.9800000190734863D;
                this.motionZ = 0.0D;
            }

            this.field_70861_d = (float)((double)this.field_70861_d + (double)(-90.0F - this.field_70861_d) * 0.02D);
        }
    }

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    public void moveEntityWithHeading(float par1, float par2)
    {
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
    }

    protected void updateEntityActionState()
    {
        ++this.entityAge;

        if (this.entityAge > 100)
        {
            this.randomMotionVecX = this.randomMotionVecY = this.randomMotionVecZ = 0.0F;
        }
        else if (this.rand.nextInt(50) == 0 || !this.inWater || this.randomMotionVecX == 0.0F && this.randomMotionVecY == 0.0F && this.randomMotionVecZ == 0.0F)
        {
            float var1 = this.rand.nextFloat() * (float)Math.PI * 2.0F;
            this.randomMotionVecX = MathHelper.cos(var1) * 0.2F;
            this.randomMotionVecY = -0.1F + this.rand.nextFloat() * 0.2F;
            this.randomMotionVecZ = MathHelper.sin(var1) * 0.2F;
        }

        this.despawnEntity();
    }
    
    public boolean getCanSpawnHere()
    {
        return this.posY > 45.0D && this.posY < 63.0D && super.getCanSpawnHere();
    }
    
    public boolean isCatchable(ItemStack item, World world, int x, int y, int z){
        return null != null;
       }
       
       public ArrayList<ItemStack> onCaught(ItemStack item, World world, int x, int y, int z, int fortune){
       	
       	setDead();
       	 ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
            for (int x1 = 0; x1 < 5; x1++)
            {
           	 ret.add(new ItemStack(MainItem.monsterbone15));
           	 ret.add(new ItemStack(MainItem.monsterbone16));
           	 ret.add(new ItemStack(MainItem.monsterbone17));
               
           /*if(i < 25)  return MainItem.monsterbone15.itemID;
           if(i < 50)	return MainItem.monsterbone16.itemID;
           if(i < 250)	return Item.bone.itemID;
           if(i < 450)	return MainItem.monsterbone18.itemID;
           if(i < 900)	return MainItem.monsterbone17.itemID;
           return MainItem.monsterbone4.itemID;*/
            }
            return ret;	
       }
    
}
